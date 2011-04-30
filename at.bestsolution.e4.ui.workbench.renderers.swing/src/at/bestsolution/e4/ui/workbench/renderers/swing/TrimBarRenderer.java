package at.bestsolution.e4.ui.workbench.renderers.swing;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JPanel;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;

import at.bestsolution.e4.ui.workbench.renderers.swing.layouts.SwingFillLayout;

@SuppressWarnings("restriction")
public class TrimBarRenderer extends SwingPartRenderer {

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		JPanel bar = new JPanel();
		bar.setLayout(new SwingFillLayout());
		((JPanel)parent).add(bar, BorderLayout.PAGE_START);
		return bar;
	}
	
	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		super.processContents(container);
		JPanel p = (JPanel) container.getWidget();
		for( MUIElement e : container.getChildren() ) {
			p.add((Component) e.getWidget());
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
