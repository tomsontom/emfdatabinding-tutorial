/*******************************************************************************
 * Copyright (c) 2009, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package at.bestsolution.e4.ui.workbench.jfx;

import javax.annotation.PostConstruct;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.ui.MContext;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public abstract class AbstractPartRenderer {
	public static final String OWNING_ME = "modelElement"; //$NON-NLS-1$

	protected IEclipseContext context;
	protected EModelService modelService;

	@PostConstruct
	protected void init(IEclipseContext context) {
		this.context = context;
		modelService = (EModelService) context.get(EModelService.class
				.getName());
	}

	public abstract Object createWidget(MUIElement element);

	public abstract void processContents(MElementContainer<MUIElement> container);

	public void postProcess(MUIElement childElement) {
	}

	public abstract void bindWidget(MUIElement me, Object widget);

	protected abstract Object getParentWidget(MUIElement element);

	public abstract void disposeWidget(MUIElement part);

	public abstract void hookControllerLogic(final MUIElement me);

	public abstract void childRendered(
			MElementContainer<MUIElement> parentElement, MUIElement element);

	public void hideChild(MElementContainer<MUIElement> parentElement,
			MUIElement child) {
	}

	protected abstract Object getImage(MUILabel element);

	//
	// public Object createMenu(Object widgetObject, MMenu menu) {
	// return null;
	// }
	//
	// public Object createToolBar(Object widgetObject, MToolBar toolBar) {
	// return null;
	// }

	/**
	 * Return a parent context for this part.
	 * 
	 * @param element
	 *            the part to start searching from
	 * @return the parent's closest context, or global context if none in the
	 *         hierarchy
	 */
	protected IEclipseContext getContextForParent(MUIElement element) {
		return modelService.getContainingContext(element);
	}

	/**
	 * Return a context for this part.
	 * 
	 * @param part
	 *            the part to start searching from
	 * @return the closest context, or global context if none in the hierarchy
	 */
	protected IEclipseContext getContext(MUIElement part) {
		if (part instanceof MContext) {
			return ((MContext) part).getContext();
		}
		return getContextForParent(part);
	}

	/**
	 * Activate the part in the hierarchy. This should either still be internal
	 * or be a public method somewhere else.
	 * 
	 * @param element
	 */
	public void activate(MPart element) {
		IEclipseContext curContext = getContext(element);
		if (curContext != null) {
			EPartService ps = (EPartService) curContext.get(EPartService.class
					.getName());
			if (ps != null)
				ps.activate(element, requiresFocus(element));
		}
	}

	/**
	 * Check if activating {@code element} requires that the part set the focus.
	 * 
	 * @param element
	 * @return true if the part requires focus
	 */
	protected abstract boolean requiresFocus(MPart element);

	public void removeGui(MUIElement element, Object widget) {
	}

	public Object getUIContainer(MUIElement element) {
		if (element.getParent() != null)
			return element.getParent().getWidget();

		return null;
	}
}
