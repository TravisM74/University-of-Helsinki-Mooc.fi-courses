package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application{
    
    public void start (Stage window){
        VBox layout = new VBox();
        TextField upperText = new TextField();
        Button updateButton = new Button("Update");
        Label lowerText = new Label("");
        
        updateButton.setOnAction((event) ->{
            lowerText.setText(upperText.getText());
        });
        
        layout.getChildren().addAll(upperText, updateButton,lowerText);
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.show();
        
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(NotifierApplication.class);
    }

}
