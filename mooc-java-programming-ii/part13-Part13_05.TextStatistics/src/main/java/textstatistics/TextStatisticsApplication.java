package textstatistics;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{
    
    public void start(Stage window){
        BorderPane layout = new BorderPane();
        
        TextArea textArea = new TextArea(); 
                
        HBox bottomArea = new HBox();
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longestWord = new Label("The longest word is:");
        
        bottomArea.getChildren().add(letters);
        bottomArea.getChildren().add(words);
        bottomArea.getChildren().add(longestWord);
        bottomArea.setSpacing(10);
        
        layout.setBottom(bottomArea);
        layout.setCenter(textArea);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TextStatisticsApplication.class);
    }

}
