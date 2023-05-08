package borderpane;

import java.awt.TextComponent;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class BorderPaneApplication extends Application {

    public void start(Stage window){
        BorderPane layout = new BorderPane();
        layout.setTop(new Label("NORTH"));
        layout.setBottom(new Label("SOUTH"));
        layout.setRight (new Label("EAST"));
       // layout.setLeft(new Label("West"));
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
        
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(BorderPaneApplication.class);
    }

}
