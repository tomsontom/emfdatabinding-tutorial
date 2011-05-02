/*******************************************************************************
 * Copyright (c) 2011, BestSolution.at and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - Initial API and implementation
 *******************************************************************************/
package at.bestsolution.e4.ui.workbench.renderers.swing;

import javax.annotation.PostConstruct;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;

import at.bestsolution.e4.ui.workbench.swing.AbstractPartRenderer;
import at.bestsolution.e4.ui.workbench.swing.IRendererFactory;

@SuppressWarnings("restriction")
public class WorkbenchRendererFactory implements IRendererFactory {
	private IEclipseContext context;
	
	private WBWRenderer windowRenderer;
	private SashRenderer sashRenderer;
	private StackRenderer stackRenderer;
	private ContributedPartRender contributedPartRenderer;
	private TrimBarRenderer trimbarRenderer;
	private ToolbarRenderer toolbarRenderer;
	private ToolItemRenderer toolitemRenderer;
	
	public AbstractPartRenderer getRenderer(MUIElement uiElement, Object parent) {
		if( uiElement instanceof MToolItem ) {
			if( toolitemRenderer == null ) {
				toolitemRenderer = ContextInjectionFactory.make(ToolItemRenderer.class, context);
			}
			return toolitemRenderer;
		}
		
		if( uiElement instanceof MToolBar ) {
			if( toolbarRenderer == null ) {
				toolbarRenderer = ContextInjectionFactory.make(ToolbarRenderer.class, context);
			}
			return toolbarRenderer;
		}
		
		if( uiElement instanceof MTrimBar ) {
			if( trimbarRenderer == null ) {
				trimbarRenderer = ContextInjectionFactory.make(TrimBarRenderer.class, context);
			}
			return trimbarRenderer;
		}
		
		if( uiElement instanceof MPart ) {
			if( contributedPartRenderer == null ) {
				contributedPartRenderer = ContextInjectionFactory.make(ContributedPartRender.class, context);
			}
			return contributedPartRenderer;
		}
		
		if( uiElement instanceof MPartStack ) {
			if( stackRenderer == null ) {
				stackRenderer = ContextInjectionFactory.make(StackRenderer.class, context);
			}
			return stackRenderer;
		}
		
		if( uiElement instanceof MPartSashContainer ) {
			if( sashRenderer == null ) {
				sashRenderer = ContextInjectionFactory.make(SashRenderer.class, context);
			}
			return sashRenderer;
		}
		
		if( uiElement instanceof MWindow ) {
			if( windowRenderer == null ) {
				windowRenderer = ContextInjectionFactory.make(WBWRenderer.class, context);
			}
			return windowRenderer;
		}
		
		return null;
	}

	@PostConstruct
	void init(IEclipseContext context) {
		this.context = context;
	}
}
