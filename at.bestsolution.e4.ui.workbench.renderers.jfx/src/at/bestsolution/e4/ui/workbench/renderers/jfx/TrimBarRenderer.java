package at.bestsolution.e4.ui.workbench.renderers.jfx;

import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;

public class TrimBarRenderer extends JFXPartRenderer {

	@Override
	public Object createWidget(MUIElement element) {
		HBox box = new HBox();
		return box;
	}
	
	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		super.processContents(container);
		
		HBox b = (HBox) container.getWidget();
		
		for( MUIElement me : container.getChildren() ) {
			Object o = me.getWidget();
			if( o != null ) {
				b.getChildren().add((Node) o);
			}
		}
		
		if( b.getChildren().size() > 0 ) {
			HBox.setHgrow(b.getChildren().get(b.getChildren().size()-1), Priority.ALWAYS);	
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
