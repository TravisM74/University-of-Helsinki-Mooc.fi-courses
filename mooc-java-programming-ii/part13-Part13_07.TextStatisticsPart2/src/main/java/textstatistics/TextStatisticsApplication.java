package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {

    public void start(Stage window){
        BorderPane layout = new BorderPane();
        
        TextArea textArea = new TextArea(); 
                
        HBox bottomArea = new HBox();
        Label letters = new Label("Letters: ");
        Label numberOfLetters = new Label();
        Label wordsLabel = new Label("Words: ");
        Label numberOfWords = new Label();
        Label longestWord = new Label("The longest word is:");
        Label longestWordFound = new Label();
        
        bottomArea.getChildren().add(letters);
        bottomArea.getChildren().add(wordsLabel);
        bottomArea.getChildren().add(longestWord);
        bottomArea.setSpacing(10);
        
        layout.setBottom(bottomArea);
        layout.setCenter(textArea);
        
        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int character = newValue.length();
            letters.setText("Letters: "+String.valueOf(character));
            String[] parts =newValue.split(" ");
            int wordCount = parts.length;
            wordsLabel.setText("Words: "+String.valueOf(wordCount));
            String theLongestWord = Arrays.stream(parts)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .findFirst()
                .get();
            longestWord.setText("The longest word is: "+theLongestWord);
        });
           
        
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TextStatisticsApplication.class);
    }


}
