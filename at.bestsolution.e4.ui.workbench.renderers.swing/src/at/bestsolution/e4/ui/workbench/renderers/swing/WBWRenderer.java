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

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.IPresentationEngine;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

import at.bestsolution.e4.ui.workbench.renderers.swing.layouts.SwingFillLayout;

@SuppressWarnings("restriction")
public class WBWRenderer extends SwingPartRenderer {
	@Inject
	private IEventBroker eventBroker;
	
	private EventHandler sizeHandler;
	
	@PostConstruct
	protected void init(IEclipseContext context) {
		super.init(context);
		sizeHandler = new EventHandler() {
			
			public void handleEvent(Event event) {
				String attName = (String) event
						.getProperty(UIEvents.EventTags.ATTNAME);

				if (UIEvents.Window.X.equals(attName)
						|| UIEvents.Window.Y.equals(attName)
						|| UIEvents.Window.WIDTH.equals(attName)
						|| UIEvents.Window.HEIGHT.equals(attName)) {
					
				}
			}
		};
		eventBroker.subscribe(UIEvents.buildTopic(UIEvents.Window.TOPIC),
				sizeHandler);
	}
	
	@Override
	public Object createWidget(MUIElement element, Object parent) {
		if( !(element instanceof MWindow) ) {
			return null;
		}
		
		MWindow mWindow = (MWindow) element;
		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setBounds(mWindow.getX(), mWindow.getY(), mWindow.getWidth(), mWindow.getHeight());
		frame.setTitle(mWindow.getLocalizedLabel());
		
		return frame;
	}

	@Override
	public void postProcess(MUIElement childElement) {
		super.postProcess(childElement);
		
		JFrame frame = (JFrame) childElement.getWidget();
		if( childElement.isVisible() ) {
			frame.setVisible(true);
		}
	}
	
	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		if( ! ((MUIElement)container instanceof MWindow) ) {
			return;
		}
		super.processContents(container);
		
		JFrame f = (JFrame) container.getWidget();
		for( MUIElement e : container.getChildren() ) {
			if( e.getWidget() != null ) {
				
				f.getContentPane().add((Component) e.getWidget(),BorderLayout.CENTER);
			}
		}
		
		IPresentationEngine engine = (IPresentationEngine) context
				.get(IPresentationEngine.class.getName());
		
		if ( (MUIElement)container instanceof MTrimmedWindow) {
			MTrimmedWindow tWindow = (MTrimmedWindow) (MUIElement)container;
			for (MTrimBar trimBar : tWindow.getTrimBars()) {
				engine.createGui(trimBar, f.getContentPane(), tWindow.getContext());
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
		
		JFrame frame = (JFrame) me.getWidget();
		final MWindow mWindow = (MWindow) me;
		frame.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				mWindow.setWidget(null);
			}
		});
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
