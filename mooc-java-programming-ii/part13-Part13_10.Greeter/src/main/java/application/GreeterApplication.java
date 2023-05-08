package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application{
    
    

    public void start(Stage window){
        
        GridPane entryScene = new GridPane();
        Label intoLabel = new Label("Enter you name and start");
        TextField  textField = new TextField();
        Button startButton = new Button("Start");
        
        entryScene.add(intoLabel, 0, 0);
        entryScene.add(textField, 0, 1);
        entryScene.add(startButton,0,2);
        
        Scene enterScene = new Scene(entryScene);
        
        GridPane welcomeScene = new GridPane();
        Label welcomeLabel = new Label("Welcome ");
        welcomeScene.add(welcomeLabel,0,0);
        
        Scene welcome = new Scene(welcomeScene);
                
        startButton.setOnAction((event) ->{
            welcomeLabel.setText("Welcome "+ textField.getText()+"!");
            window.setScene(welcome);
        });
        
        
        window.setScene(enterScene);
        window.show();
        
    } 

    public static void main(String[] args) {
        System.out.println("Hellow world! :3");
        launch(GreeterApplication.class);
    }
}
