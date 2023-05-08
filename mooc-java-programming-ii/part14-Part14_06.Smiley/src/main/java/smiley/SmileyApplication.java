package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application{
    
    public void start(Stage window){
        
        Canvas paintingCanvas= new Canvas(8,8);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
        
        ColorPicker colorBlack = new ColorPicker(Color.BLACK);
        
        BorderPane canvasLayout = new BorderPane();
        canvasLayout.setCenter(paintingCanvas);
        
        
        painter.setFill(colorBlack.getValue());
        
        painter.fillRect(3, 2, 1, 1);
        painter.fillRect(6, 2, 1, 1);
        painter.fillRect(2, 5, 1, 1);
        painter.fillRect(7, 5, 1, 1);
        
        for (int i= 3; i < 7; i++){
            painter.fillRect(i, 6, 1, 1);
        }
        
        Scene view = new Scene(canvasLayout);
        
        window.setScene(view);
        window.show();
        
        
    }


    public static void main(String[] args) {
        
        launch(SmileyApplication.class);
    }

}
