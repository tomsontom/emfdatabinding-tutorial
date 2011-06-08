package at.bestsolution.e4.ui.workbench.renderers.jfx;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.SideValue;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.IPresentationEngine;

@SuppressWarnings("restriction")
public class WBWRenderer extends JFXPartRenderer {

	protected double mouseDragOffsetX;
	protected double mouseDragOffsetY;

	@Override
	public Object createWidget(MUIElement element) {
		if( !(element instanceof MWindow) ) {
			return null;
		}
		
		MWindow mWindow = (MWindow) element;
		Stage stage = new Stage();
		stage.setX(mWindow.getX());
		stage.setY(mWindow.getY());
		stage.setWidth(mWindow.getWidth());
		stage.setHeight(mWindow.getHeight());
		stage.initStyle(StageStyle.UNDECORATED);
		
		BorderPane rootPane = new BorderPane();
		VBox topPane = new VBox();
		topPane.getChildren().add(createTopDecoration(stage));
		HBox centerPane = new HBox();
		rootPane.setTop(topPane);
		rootPane.setCenter(centerPane);
		
		Scene scene = new Scene(rootPane, mWindow.getWidth(), mWindow.getHeight());
		scene.getStylesheets().add("/test.css"); //FIXME This has to be replaced by contributions
		stage.setScene(scene);
		setCSSInfo(element, rootPane);
		
		stage.setTitle(mWindow.getLocalizedLabel());
		
		return stage;
	}
	
	private Node createTopDecoration(final Stage stage) {
		HBox box = new HBox();
		box.getStyleClass().add("top-decoration");
		
		Region spacer = new Region();
		HBox.setHgrow(spacer, Priority.ALWAYS);
		box.getChildren().add(spacer);
		
		HBox windowBtns = new HBox(3);
		
		Button close = new Button();
		close.getStyleClass().add("window-close-button");
        close.setMinSize(16,16);
        close.setPrefSize(16,16);
        close.setMaxSize(16,16);
        close.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) { 
            	System.exit(0); 
            }
        });
        
        Button min = new Button();
        min.getStyleClass().add("window-min-button");
        min.setMinSize(16,16);
        min.setPrefSize(16,16);
        min.setMaxSize(16,16);
        min.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) { 
            	stage.setIconified(true); 
            }
        });
        
        Button max = new Button();
        max.getStyleClass().add("window-max-button");
        max.setMinSize(16,16);
        max.setPrefSize(16,16);
        max.setMaxSize(16,16);
        max.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Screen screen = Screen.getPrimary(); // todo something more sensible
                stage.setX(screen.getVisualBounds().getMinX());
                stage.setY(screen.getVisualBounds().getMinY());
                stage.setWidth(screen.getVisualBounds().getWidth());
                stage.setHeight(screen.getVisualBounds().getHeight());
            }
        });
		
        windowBtns.getChildren().addAll(min, max, close);
        box.getChildren().add(windowBtns);
        
        box.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent event) {
                mouseDragOffsetX = event.getSceneX();
                mouseDragOffsetY = event.getSceneY();
            }
        });
        box.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent event) {
                stage.setX(event.getScreenX()-mouseDragOffsetX);
                stage.setY(event.getScreenY()-mouseDragOffsetY);
            }
        });
        
        return box;
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
		BorderPane rootPane = (BorderPane) stage.getScene().getRoot();
		VBox topPane = (VBox) rootPane.getTop();
		HBox centerPane = (HBox) rootPane.getCenter();
		
		for( MUIElement e : container.getChildren() ) {
			if( e.getWidget() != null ) {
				Node n = (Node) e.getWidget();
				HBox.setHgrow(n, Priority.ALWAYS);
				centerPane.getChildren().add(n);
			}
		}
		
		IPresentationEngine engine = (IPresentationEngine) context
				.get(IPresentationEngine.class.getName());
		
		if ( (MUIElement)container instanceof MTrimmedWindow) {
			MTrimmedWindow tWindow = (MTrimmedWindow) (MUIElement)container;
			for (MTrimBar trimBar : tWindow.getTrimBars()) {
				Object o = engine.createGui(trimBar, null, tWindow.getContext());
				
				if( o != null ) {
					if( trimBar.getSide() == SideValue.TOP ) {
						Node n = (Node) o;
						VBox.setVgrow(n, Priority.ALWAYS);
						topPane.getChildren().add(n);
					}
				}
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

	@Override
	public void hookControllerLogic(MUIElement me) {
		super.hookControllerLogic(me);
		Object widget = me.getWidget();
		
		if( widget instanceof Stage ) {
			Stage stage = (Stage) widget;
			final MWindow window = (MWindow) me;
			stage.widthProperty().addListener(new ChangeListener<Number>() {

				@Override
				public void changed(ObservableValue<? extends Number> arg0,
						Number arg1, Number arg2) {
					window.setWidth(arg2.intValue()); 
				}
			});
			stage.heightProperty().addListener(new ChangeListener<Number>() {

				@Override
				public void changed(ObservableValue<? extends Number> arg0,
						Number arg1, Number arg2) {
					window.setHeight(arg2.intValue());
				}
			});
			
			stage.xProperty().addListener(new ChangeListener<Number>() {

				@Override
				public void changed(ObservableValue<? extends Number> arg0,
						Number arg1, Number arg2) {
					window.setX(arg2.intValue());
				}
			});
			
			stage.yProperty().addListener(new ChangeListener<Number>() {

				@Override
				public void changed(ObservableValue<? extends Number> arg0,
						Number arg1, Number arg2) {
					window.setY(arg2.intValue());
				}
			});
		}
	}
}
