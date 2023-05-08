package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application{
    
    public void start(Stage window){
        
        BorderPane borderPane = new BorderPane();
        Label topLabel = new Label("First view!");
        Button secondViewButton = new Button("To the second view!");
        
        
        borderPane.setTop(topLabel);
        borderPane.setCenter(secondViewButton);
       
        Scene firstScene = new Scene(borderPane);

        VBox vBox = new VBox();
        Button vBoxButton = new Button("To the third view!");
        Label vBoxLabel = new Label("Second view!");
        vBox.getChildren().addAll(vBoxButton,vBoxLabel);
        
        Scene secondScene = new Scene(vBox);
        
        GridPane gridPane = new GridPane();
        Label gpLabel = new Label("Third view!");
        Button gpButton = new Button("To the first view!");
        
        gridPane.add(gpLabel,0,0);
        gridPane.add(gpButton,1,1);
        
        Scene thirdScene = new Scene(gridPane);
        

        secondViewButton.setOnAction((event)-> {
            window.setScene(secondScene);
        });
        
        vBoxButton.setOnAction((event)-> {
            window.setScene(thirdScene);
        });
        gpButton.setOnAction((event)-> {
            window.setScene(firstScene);
        });
     
        window.setScene(firstScene);
        window.show();
    }
    

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }

}
