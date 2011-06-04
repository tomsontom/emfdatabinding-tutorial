package at.bestsolution.e4.ui.workbench.renderers.jfx;

import javafx.scene.Node;
import javafx.scene.control.SplitPane;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;

@SuppressWarnings("restriction")
public class SashRenderer extends JFXPartRenderer {

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		SplitPane pane = new SplitPane();
		
		if( element.getElementId() != null ) {
			pane.setId(element.getElementId());	
		}
		
		return pane;
	}

	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		if( !(((MUIElement)container) instanceof MPartSashContainer) ) {
			return;
		}

		super.processContents(container);
		
		SplitPane splitPane = (SplitPane) container.getWidget();
		for( MUIElement e : container.getChildren() ) {
			if( e.getWidget() != null ) {
				splitPane.getItems().add((Node) e.getWidget());
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
