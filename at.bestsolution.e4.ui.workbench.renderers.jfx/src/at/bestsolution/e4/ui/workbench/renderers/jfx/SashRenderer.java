package at.bestsolution.e4.ui.workbench.renderers.jfx;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.control.SplitPane;
import javafx.scene.control.SplitPane.Divider;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;

@SuppressWarnings("restriction")
public class SashRenderer extends JFXPartRenderer {

	@Override
	public Object createWidget(MUIElement element) {
		SplitPane pane = new SplitPane();
		
		if( element.getElementId() != null ) {
			pane.setId(element.getElementId());	
		}
		
		return pane;
	}

	@Override
	public void processContents(final MElementContainer<MUIElement> container) { 
		if( !(((MUIElement)container) instanceof MPartSashContainer) ) {
			return;
		}

		super.processContents(container);
		
		final SplitPane splitPane = (SplitPane) container.getWidget();
		for( MUIElement e : container.getChildren() ) {
			if( e.getWidget() != null ) {
				splitPane.getItems().add((Node) e.getWidget());
			} 
		}

		int i = 0;
		for( MUIElement e : container.getChildren() ) {
			String data = e.getContainerData();
			if( data != null ) {
				try {
					double d = Double.parseDouble(data);
					splitPane.setDividerPosition(i++, d);
				} catch (Exception ex) {
					ex.printStackTrace();
				}				
			}
		}
		
		for( Divider d : splitPane.getDividers() ) {
			d.positionProperty().addListener(new ChangeListener<Number>() {

				@Override
				public void changed(ObservableValue<? extends Number> arg0,
						Number arg1, Number arg2) {
					int i = 0;
					for( double d : splitPane.getDividersPositions() ) {
						container.getChildren().get(i++).setContainerData(Double.toString(d));
					}
				}
			});
		}
	}
	
	@Override
	public void hookControllerLogic(MUIElement me) {
		System.err.println("Hook logic");
		super.hookControllerLogic(me);
		
		final SplitPane pane = (SplitPane) me.getWidget();
		
		final MPartSashContainer container = (MPartSashContainer) me;
		
		
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
