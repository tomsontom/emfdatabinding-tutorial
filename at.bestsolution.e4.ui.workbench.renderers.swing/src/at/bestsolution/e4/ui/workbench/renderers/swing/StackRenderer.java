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

import java.awt.Component;

import javax.swing.JTabbedPane;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MStackElement;

@SuppressWarnings("restriction")
public class StackRenderer extends SwingPartRenderer {

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		if( !(element instanceof MPartStack) ) {
			return null;
		}
		
		JTabbedPane widget = new JTabbedPane(); 
		return widget;
	}

	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		if( ! ((MUIElement)container instanceof MPartStack) ) {
			return;
		}
		
		super.processContents(container);
		
		JTabbedPane pane = (JTabbedPane) container.getWidget();
		for( MUIElement s : container.getChildren() ) {
			if( s instanceof MPart ) {
				pane.addTab(((MPart) s).getLocalizedLabel(), (Component) s.getWidget());
			}
		}
	}

	@Override
	protected Object getParentWidget(MUIElement element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void disposeWidget(MUIElement part) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hookControllerLogic(MUIElement me) {
		super.hookControllerLogic(me);
	}

	@Override
	public void childRendered(MElementContainer<MUIElement> parentElement,
			MUIElement element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Object getImage(MUILabel element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean requiresFocus(MPart element) {
		// TODO Auto-generated method stub
		return false;
	}

}
