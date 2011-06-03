package at.bestsolution.e4.ui.workbench.renderers.jfx;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;

@SuppressWarnings("restriction")
public class WBWRenderer extends JFXPartRenderer {

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		if( !(element instanceof MWindow) ) {
			return null;
		}
		
		MWindow mWindow = (MWindow) element;
		Stage stage = new Stage();
		stage.setX(mWindow.getX());
		stage.setY(mWindow.getY());
		stage.setWidth(mWindow.getWidth());
		stage.setHeight(mWindow.getHeight());
		
		BorderPane rootPane = new BorderPane();
		rootPane.setId("Root");
		Scene scene = new Scene(rootPane, mWindow.getWidth(), mWindow.getHeight());
//		scene.getStylesheets().add("test.css");
		stage.setScene(scene);
		
		stage.setTitle(mWindow.getLocalizedLabel());
		
		return stage;
	}
	
	@Override
	public void postProcess(MUIElement childElement) {
		super.postProcess(childElement);
		
		Stage stage = (Stage) childElement.getWidget();
		if( childElement.isVisible() ) {
			stage.setVisible(true);
		}
	}
	
	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		if( !(((MUIElement)container) instanceof MWindow) ) {
			return;
		}
		
		super.processContents(container);
		
		Stage stage = (Stage) container.getWidget();
		for( MUIElement e : container.getChildren() ) {
			if( e.getWidget() != null ) {
				BorderPane p = (BorderPane) stage.getScene().getRoot();
				p.setCenter((Node) e.getWidget());
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
