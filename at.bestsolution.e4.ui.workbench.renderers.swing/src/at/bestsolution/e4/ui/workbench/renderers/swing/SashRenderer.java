package at.bestsolution.e4.ui.workbench.renderers.swing;

import java.awt.Component;

import javax.swing.JSplitPane;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;

@SuppressWarnings("restriction")
public class SashRenderer extends SwingPartRenderer {

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		if( ! (element instanceof MPartSashContainer) ) {
			return null;
		}
		
		JSplitPane split = new JSplitPane();
		return split;
	}
	
	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		if( ! ((MUIElement)container instanceof MPartSashContainer) ) {
			return;
		}
		
		if( container.getChildren().size() == 2 ) {
			super.processContents(container);
			
			JSplitPane split = (JSplitPane) container.getWidget();
			split.setLeftComponent((Component) container.getChildren().get(0).getWidget());
			split.setRightComponent((Component) container.getChildren().get(1).getWidget());
		} else {
			System.err.println("A sash has to have 2 children");
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
