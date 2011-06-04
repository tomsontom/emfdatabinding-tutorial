package at.bestsolution.e4.ui.internal.workbench.jfx;

import java.io.IOException;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.internal.services.EclipseAdapter;
import org.eclipse.e4.core.services.adapter.Adapter;
import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.core.services.log.ILoggerProvider;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.internal.workbench.ActiveChildLookupFunction;
import org.eclipse.e4.ui.internal.workbench.ActivePartLookupFunction;
import org.eclipse.e4.ui.internal.workbench.DefaultLoggerProvider;
import org.eclipse.e4.ui.internal.workbench.E4Workbench;
import org.eclipse.e4.ui.internal.workbench.ExceptionHandler;
import org.eclipse.e4.ui.internal.workbench.ReflectionContributionFactory;
import org.eclipse.e4.ui.internal.workbench.ResourceHandler;
import org.eclipse.e4.ui.internal.workbench.WorkbenchLogger;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.MContribution;
import org.eclipse.e4.ui.model.application.ui.MContext;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.IExceptionHandler;
import org.eclipse.e4.ui.workbench.IModelResourceHandler;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.eclipse.e4.ui.workbench.lifecycle.PreSave;
import org.eclipse.e4.ui.workbench.lifecycle.ProcessAdditions;
import org.eclipse.e4.ui.workbench.lifecycle.ProcessRemovals;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.osgi.service.datalocation.Location;
import org.eclipse.ufacekit.ui.jfx.databinding.JFXRealm;

@SuppressWarnings("restriction")
public class E4Application implements IApplication {
	private String[] args;
	private Object lcManager;

	private IModelResourceHandler handler;
	
	public Object start(IApplicationContext context) throws Exception {
		E4Workbench workbench = createE4Workbench(context);
//		Location instanceLocation = (Location) workbench.getContext().get(E4Workbench.INSTANCE_LOCATION);
		
		IEclipseContext workbenchContext = workbench.getContext();
		workbench.createAndRunUI(workbench.getApplication());
		// Save the model into the targetURI
		if (lcManager != null) {
			ContextInjectionFactory.invoke(lcManager, PreSave.class,
					workbenchContext, null);
		}
		saveModel();
		workbench.close();
		return EXIT_OK;
	}

	public void saveModel() {
		try {
			handler.save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public E4Workbench createE4Workbench(
			IApplicationContext applicationContext) {
		args = (String[]) applicationContext.getArguments().get(
				IApplicationContext.APPLICATION_ARGS);
		IEclipseContext appContext = createDefaultContext();
		
		appContext.set(IApplicationContext.class, applicationContext);

		// Check if DS is running
		if (!appContext
				.containsKey("org.eclipse.e4.ui.workbench.modeling.EModelService")) {
			throw new IllegalStateException(
					"Core services not available. Please make sure that a declarative service implementation (such as the bundle 'org.eclipse.equinox.ds') is available!");
		}

		// Get the factory to create DI instances with
		IContributionFactory factory = (IContributionFactory) appContext
				.get(IContributionFactory.class.getName());
		// Install the life-cycle manager for this session if there's one
		// defined
		String lifeCycleURI = getArgValue(E4Workbench.LIFE_CYCLE_URI_ARG,
				applicationContext, false);
		if (lifeCycleURI != null) {
			lcManager = factory.create(lifeCycleURI, appContext);
			if (lcManager != null) {
				// Let the manager manipulate the appContext if desired
				ContextInjectionFactory.invoke(lcManager,
						PostContextCreate.class, appContext, null);
			}
		}

		// Create the app model and its context
		MApplication appModel = loadApplicationModel(applicationContext,
				appContext);
		appModel.setContext(appContext);
		
		// Set the app's context after adding itself
		appContext.set(MApplication.class.getName(), appModel);
		
		// let the life cycle manager add to the model
		if (lcManager != null) {
			ContextInjectionFactory.invoke(lcManager, ProcessAdditions.class,
					appContext, null);
			ContextInjectionFactory.invoke(lcManager, ProcessRemovals.class,
					appContext, null);
		}

		// Create the addons
		for (MContribution addon : appModel.getAddons()) {
			Object obj = factory.create(addon.getContributionURI(), appContext);
			addon.setObject(obj);
		}
		
		// Parse out parameters from both the command line and/or the product
		// definition (if any) and put them in the context
		String xmiURI = getArgValue(E4Workbench.XMI_URI_ARG,
				applicationContext, false);
		appContext.set(E4Workbench.XMI_URI_ARG, xmiURI);
		
		appContext.set(
				E4Workbench.RENDERER_FACTORY_URI,
				getArgValue(E4Workbench.RENDERER_FACTORY_URI,
						applicationContext, false));
		// This is a default arg, if missing we use the default rendering engine
		String presentationURI = getArgValue(E4Workbench.PRESENTATION_URI_ARG,
				applicationContext, false);
		if (presentationURI == null) {
			presentationURI = PartRenderingEngine.engineURI;
		}
		appContext.set(E4Workbench.PRESENTATION_URI_ARG, presentationURI);

		// Instantiate the Workbench (which is responsible for
		// 'running' the UI (if any)...
		E4Workbench workbench = new E4Workbench(appModel, appContext);
		return workbench;
	}
	
	public static IEclipseContext createDefaultContext() {
		// FROM: WorkbenchApplication
		// parent of the global workbench context is an OSGi service
		// context that can provide OSGi services
		IEclipseContext serviceContext = E4Workbench.getServiceContext();
		final IEclipseContext appContext = serviceContext
				.createChild("WorkbenchContext"); //$NON-NLS-1$

		// FROM: Workbench#createWorkbenchContext
		IExtensionRegistry registry = RegistryFactory.getRegistry();
		ExceptionHandler exceptionHandler = new ExceptionHandler();
		ReflectionContributionFactory contributionFactory = new ReflectionContributionFactory(
				registry);
		appContext.set(IContributionFactory.class.getName(),
				contributionFactory);

		appContext
				.set(Logger.class.getName(), ContextInjectionFactory.make(
						WorkbenchLogger.class, appContext));
		appContext.set(Adapter.class.getName(),
				ContextInjectionFactory.make(EclipseAdapter.class, appContext));

		// No default log provider available
		if (appContext.get(ILoggerProvider.class) == null) {
			appContext.set(ILoggerProvider.class, ContextInjectionFactory.make(
					DefaultLoggerProvider.class, appContext));
		}

		// setup for commands and handlers
		appContext.set(IServiceConstants.ACTIVE_PART,
				new ActivePartLookupFunction());
		appContext.set(EPartService.PART_SERVICE_ROOT, new ContextFunction() {
			private void log() {
//				StatusReporter statusReporter = (StatusReporter) appContext
//						.get(StatusReporter.class.getName());
//				statusReporter.report(new Status(IStatus.ERROR,
//						WorkbenchSWTActivator.PI_RENDERERS,
//						"Internal error, please post the trace to bug 315270",
//						new Exception()), StatusReporter.LOG);
			}

			@Override
			public Object compute(IEclipseContext context) {
				MContext perceivedRoot = (MContext) context.get(MWindow.class
						.getName());
				if (perceivedRoot == null) {
					perceivedRoot = (MContext) context.get(MApplication.class
							.getName());
					if (perceivedRoot == null) {
						IEclipseContext ctxt = appContext.getActiveChild();
						if (ctxt == null) {
							return null;
						}
						log();
						return ctxt.get(MWindow.class);
					}
				}

				IEclipseContext current = perceivedRoot.getContext();
				if (current == null) {
					IEclipseContext ctxt = appContext.getActiveChild();
					if (ctxt == null) {
						return null;
					}
					log();
					return ctxt.get(MWindow.class);
				}

				IEclipseContext next = current.getActiveChild();
				MPerspective candidate = null;
				while (next != null) {
					current = next;
					MPerspective perspective = current.get(MPerspective.class);
					if (perspective != null) {
						candidate = perspective;
					}
					next = current.getActiveChild();
				}

				if (candidate != null) {
					return candidate;
				}

				// we need to consider detached windows
				MUIElement window = (MUIElement) current.get(MWindow.class
						.getName());
				if (window == null) {
					IEclipseContext ctxt = appContext.getActiveChild();
					if (ctxt == null) {
						return null;
					}
					log();
					return ctxt.get(MWindow.class);
				}
				MElementContainer<?> parent = window.getParent();
				while (parent != null && !(parent instanceof MApplication)) {
					window = parent;
					parent = parent.getParent();
				}
				return window;
			}
		});

		// EHandlerService comes from a ContextFunction
		// EContextService comes from a ContextFunction
		appContext.set(IExceptionHandler.class.getName(), exceptionHandler);
		appContext.set(IExtensionRegistry.class.getName(), registry);
		// appContext.set(IServiceConstants.SELECTION,
		// new ActiveChildOutputFunction(IServiceConstants.SELECTION));

		// appContext.set(IServiceConstants.INPUT, new ContextFunction() {
		// public Object compute(IEclipseContext context, Object[] arguments) {
		// Class adapterType = null;
		// if (arguments.length > 0 && arguments[0] instanceof Class) {
		// adapterType = (Class) arguments[0];
		// }
		// Object newInput = null;
		// Object newValue = context.get(IServiceConstants.SELECTION);
		// if (adapterType == null || adapterType.isInstance(newValue)) {
		// newInput = newValue;
		// } else if (newValue != null && adapterType != null) {
		// IAdapterManager adapters = (IAdapterManager) appContext
		// .get(IAdapterManager.class.getName());
		// if (adapters != null) {
		// Object adapted = adapters.loadAdapter(newValue,
		// adapterType.getName());
		// if (adapted != null) {
		// newInput = adapted;
		// }
		// }
		// }
		// return newInput;
		// }
		// });
		appContext.set(IServiceConstants.ACTIVE_SHELL,
				new ActiveChildLookupFunction(IServiceConstants.ACTIVE_SHELL,
						E4Workbench.LOCAL_ACTIVE_SHELL));

		// FROM: Workbench#initializeNullStyling
//		appContext.set(IStylingEngine.SERVICE_NAME, new IStylingEngine() {
//			public void setClassname(Object widget, String classname) {
//			}
//
//			public void setId(Object widget, String id) {
//			}
//
//			public void style(Object widget) {
//			}
//
//			public CSSStyleDeclaration getStyle(Object widget) {
//				return null;
//			}
//
//			public void setClassnameAndId(Object widget, String classname,
//					String id) {
//			}
//		});

		appContext.set(IExtensionRegistry.class.getName(), registry);
		appContext.set(IContributionFactory.class.getName(),
				contributionFactory);

		return appContext;
	}
	
	private String getArgValue(String argName, IApplicationContext appContext,
			boolean singledCmdArgValue) {
		// Is it in the arg list ?
		if (argName == null || argName.length() == 0)
			return null;
		
		if (singledCmdArgValue) {
			for (int i = 0; i < args.length; i++) {
				if (("-" + argName).equals(args[i]))
					return "true";
			}
		} else {
			for (int i = 0; i < args.length; i++) {
				if (("-" + argName).equals(args[i]) && i + 1 < args.length)
					return args[i + 1];
			}
		}

		return appContext.getBrandingProperty(argName);
	}
	
	private MApplication loadApplicationModel(IApplicationContext appContext,
			IEclipseContext eclipseContext) {
		MApplication theApp = null;

		Location instanceLocation = WorkbenchJFXActivator.getDefault()
				.getInstanceLocation();

		String appModelPath = getArgValue(E4Workbench.XMI_URI_ARG, appContext,
				false);
		Assert.isNotNull(appModelPath, E4Workbench.XMI_URI_ARG
				+ " argument missing"); //$NON-NLS-1$
		final URI initialWorkbenchDefinitionInstance = URI
				.createPlatformPluginURI(appModelPath, true);

		eclipseContext.set(E4Workbench.INITIAL_WORKBENCH_MODEL_URI,
				initialWorkbenchDefinitionInstance);
		eclipseContext.set(E4Workbench.INSTANCE_LOCATION, instanceLocation);

		// Save and restore
		boolean saveAndRestore;
		String value = getArgValue(E4Workbench.PERSIST_STATE, appContext, false);

		saveAndRestore = value == null || Boolean.parseBoolean(value);

		eclipseContext.set(E4Workbench.PERSIST_STATE,
				Boolean.valueOf(saveAndRestore));

		// Persisted state
		boolean clearPersistedState;
		value = getArgValue(E4Workbench.CLEAR_PERSISTED_STATE, appContext, true);
		clearPersistedState = value != null && Boolean.parseBoolean(value);
		eclipseContext.set(E4Workbench.CLEAR_PERSISTED_STATE,
				Boolean.valueOf(clearPersistedState));

		// Delta save and restore
		boolean deltaRestore;
		value = getArgValue(E4Workbench.DELTA_RESTORE, appContext, false);
		deltaRestore = value == null || Boolean.parseBoolean(value);
		eclipseContext.set(E4Workbench.DELTA_RESTORE,
				Boolean.valueOf(deltaRestore));

		String resourceHandler = getArgValue(
				E4Workbench.MODEL_RESOURCE_HANDLER, appContext, false);

		if (resourceHandler == null) {
			resourceHandler = "platform:/plugin/org.eclipse.e4.ui.workbench/"
					+ ResourceHandler.class.getName();
		}

		IContributionFactory factory = eclipseContext
				.get(IContributionFactory.class);

		handler = (IModelResourceHandler) factory.create(resourceHandler,
				eclipseContext);

		Resource resource = handler.loadMostRecentModel();
		theApp = (MApplication) resource.getContents().get(0);

		return theApp;
	}
	
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}
