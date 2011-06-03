package at.bestsolution.e4.ui.internal.workbench.jfx;

import org.eclipse.osgi.service.datalocation.Location;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Filter;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.util.tracker.ServiceTracker;

public class WorkbenchJFXActivator implements BundleActivator {
	private static WorkbenchJFXActivator activator;
	private ServiceTracker locationTracker;
	private BundleContext context;
	
	public void start(BundleContext context) throws Exception {
		activator = this;
		this.context = context; 
	}

	public void stop(BundleContext context) throws Exception {
		activator = null;
		this.context = null;
	}

	public static WorkbenchJFXActivator getDefault() {
		return activator;
	}

	public Location getInstanceLocation() {
		if (locationTracker == null) {
			Filter filter = null;
			try {
				filter = context.createFilter(Location.INSTANCE_FILTER);
			} catch (InvalidSyntaxException e) {
				// ignore this. It should never happen as we have tested the
				// above format.
			}
			locationTracker = new ServiceTracker(context, filter, null);
			locationTracker.open();
		}
		return (Location) locationTracker.getService();
	}
}
