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
import java.awt.KeyboardFocusManager;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JPanel;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;

import at.bestsolution.e4.ui.workbench.renderers.swing.layouts.SwingFillLayout;

@SuppressWarnings("restriction")
public class ContributedPartRender extends SwingPartRenderer {
	private MUIElement partToActivate;
	
	@Override
	public Object createWidget(MUIElement element, Object parent) {
		final JPanel panel = new JPanel();
		panel.setLayout(new SwingFillLayout());
		
		MPart part = (MPart) element;
		IEclipseContext localContext = part.getContext();
		localContext.set(JPanel.class, panel);
		
		IContributionFactory contributionFactory = (IContributionFactory) localContext
				.get(IContributionFactory.class.getName());
		Object newPart = contributionFactory.create(part.getContributionURI(),
				localContext);
		part.setObject(newPart);
		
		return panel;
	}
	
	@Override
	public void hookControllerLogic(final MUIElement me) {
		super.hookControllerLogic(me);
		
		final JPanel panel = (JPanel) me.getWidget();
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addPropertyChangeListener("focusOwner", new PropertyChangeListener() {
			
			public void propertyChange(PropertyChangeEvent evt) {
				if( evt.getNewValue() instanceof Component) {
					Component c = (Component) evt.getNewValue();
					while( c.getParent() != null ) {
						if( c.getParent() == panel ) {
							try {
								partToActivate = me;
								activate((MPart) me);
							} finally {
								partToActivate = null;
							}
							break;
						}
						c = c.getParent();
					}
				}
			}
		});
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
	public void childRendered(MElementContainer<MUIElement> parentElement,
			MUIElement element) {
		// TODO Auto-generated method stub
		System.err.println("Rendered!!!");
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
