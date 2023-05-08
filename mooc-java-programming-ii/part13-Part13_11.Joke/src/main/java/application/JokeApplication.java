package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application{
    
    public void start(Stage window) throws Exception{
        
        
        BorderPane layout = new BorderPane();
        //String joke = ("What do you call a bear with no teeth?");
        //Label change = new Label("What do you call a bear with no teeth?");
        
        //String answer = ("A gummy bear.");
        //String explanation =("Well he has not teeth you see");
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
        Button button1 = new Button("Joke");
        Button button2 = new Button("Answer");
        Button button3 = new Button("Explanation");
        
        menu.getChildren().addAll(button1,button2,button3);
        
        //layout.setBottom(buttonsBox);
        //jokeLayout.setCenter(change);
        
        layout.setBottom(menu);
        
        StackPane firstLayout = createView("What do you call a bear with no teeth?");
        StackPane secondLayout = createView("A gummy bear.");
        StackPane thirdLayout = createView("Well he has not teeth you see.");
        
        button1.setOnAction((event) -> layout.setCenter(firstLayout));
        button2.setOnAction((event) -> layout.setCenter(secondLayout));
        button3.setOnAction((event) -> layout.setCenter(thirdLayout));
        
        layout.setCenter(firstLayout);
               
        Scene jokeScene = new Scene(layout);
        /*
        button1.setOnAction((Event) -> {
            change.setText(joke);
        });
        button2.setOnAction((Event) -> {
            change.setText(answer);
        });
        button3.setOnAction((Event) -> {
            change.setText(explanation);
        });
        */
        window.setScene(jokeScene);
        window.show();
    }
    
    private StackPane createView(String text){
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        return layout;
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(JokeApplication.class);
    }
}
