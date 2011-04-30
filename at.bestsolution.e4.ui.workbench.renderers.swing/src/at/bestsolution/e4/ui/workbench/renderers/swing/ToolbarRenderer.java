package at.bestsolution.e4.ui.workbench.renderers.swing;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.Action;
import javax.swing.JToolBar;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;

@SuppressWarnings("restriction")
public class ToolbarRenderer extends SwingPartRenderer {

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		JToolBar bar = new JToolBar();
		bar.setRollover(true);
		bar.setFloatable(false);
		bar.setMargin(new Insets(10, 10, 10, 10));
		return bar;
	}
	
	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		super.processContents(container);
		
		JToolBar bar = (JToolBar) container.getWidget();
		for( MUIElement e : container.getChildren() ) {
			bar.add((Component)e.getWidget());
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
