package org.eclipse.ufacekit.ui.jfx.databinding.example;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextBox;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.ufacekit.ui.jfx.databinding.JFXBeanProperties;
import org.eclipse.ufacekit.ui.jfx.databinding.IJFXBeanValueProperty;
import org.eclipse.ufacekit.ui.swing.databinding.swing.SwingRealm;

public class TextBoxTest {
    private static JFXPanel javafxPanel;

    private Scene scene;

    public void initAndShowGUI() {
    	
        // Temporary call to launch JavaFX  -- it will become unnecessary
        // in a subsequent beta update.
        TmpFxLauncher.launch();

        JFrame frame = new JFrame("Swing JavaFX Chart");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create javafx panel
        javafxPanel = new JFXPanel();
        javafxPanel.setPreferredSize(new Dimension(550,400));
        frame.getContentPane().add(javafxPanel, BorderLayout.CENTER);

        // create JavaFX scene
        Platform.runLater(new Runnable() {
            public void run() {
                createScene();
            }
        });

        // show frame
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void createScene() {
    	SwingRealm.createDefault();
        Group root = new Group();
        scene = new Scene(root);
        
        GridPane pane = new GridPane();
        pane.setVgap(10);
        pane.setHgap(10);
        pane.setPadding(new Insets(10, 10, 10, 10));
        
        ColumnConstraints column1 = new ColumnConstraints();
        pane.getColumnConstraints().add(column1);
        
        ColumnConstraints column2 = new ColumnConstraints(100,100,Double.MAX_VALUE);
        column2.setHgrow(Priority.ALWAYS);
        pane.getColumnConstraints().add(column2);
        
        {
        	Label l = new Label("Firstname");
            GridPane.setConstraints(l, 0, 0);
            pane.getChildren().add(l);
	
            TextBox box = new TextBox();
            GridPane.setConstraints(box, 1, 0);
            GridPane.setHgrow(box, Priority.ALWAYS);
            pane.getChildren().add(box);
        }
        
        {
        	Label l = new Label("Lastname");
            GridPane.setConstraints(l, 0, 1);
            pane.getChildren().add(l);
	
            TextBox box = new TextBox();
            GridPane.setConstraints(box, 1, 1);
            GridPane.setHgrow(box, Priority.ALWAYS);
            pane.getChildren().add(box);
        }
        
        {
        	Label l = new Label("Country");
            GridPane.setConstraints(l, 0, 2);
            pane.getChildren().add(l);
            
        	ChoiceBox<String> cb = new ChoiceBox<String>();
            cb.getItems().addAll("Austria", "Germany", "Italy");
            
            GridPane.setConstraints(cb, 1, 2);
            GridPane.setHgrow(cb, Priority.ALWAYS);
            pane.getChildren().add(cb);
        }
        
                
        /*TextBox b = new TextBox();
        b.setText("Hello JavaFX");
        final DropShadow dropShadow = new DropShadow();
        b.setEffect(dropShadow);
                
        pane.getChildren().add(b);
        
        TextBox b2 = new TextBox();
        b2.setText("2n");
        b2.setLayoutX(100);
        
        GridPane.setConstraints(b2, 0, 1);
        pane.getChildren().add(b2);*/
        
        root.getChildren().add(pane);
        
        // add scene to panel
        javafxPanel.setScene(scene);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TextBoxTest().initAndShowGUI();
            }
        });
    }

    // *****************************************************************
    // NOTE: this method of launching the JavaFX runtime is temporary.
    // It will become unnecessary in a subsequent beta update.
    // *****************************************************************
    public static class TmpFxLauncher extends Application {
        @Override public void start(Stage primaryStage) {
        }

        private static void launch() {
            Application.launch(null);
        }
    }

}
