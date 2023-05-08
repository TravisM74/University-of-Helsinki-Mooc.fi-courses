package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        // the example opens the image, creates a new image, and copies the opened image
        // into the new one, pixel by pixel
        Image sourceImage = new Image("file:monalisa.png");

        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();

        int yCoordinate = 0;
        while (yCoordinate < height) {
            int xCoordinate = 0;
            while (xCoordinate < width) {

                Color color = imageReader.getColor(xCoordinate, yCoordinate);
                double red = 1.0 - color.getRed() ;
                double green = 1.0 - color.getGreen();
                double blue = 1.0 - color.getBlue();
                double opacity = color.getOpacity();

                Color newColor = new Color(red, green, blue, opacity);

                imageWriter.setColor(xCoordinate, yCoordinate, newColor);

                xCoordinate++;
            }

            yCoordinate++;
        }

        ImageView image = new ImageView(targetImage);
        ImageView imageReduced = new ImageView(targetImage);
        ImageView imageReduced2 = new ImageView(targetImage);
        ImageView imageReduced3 = new ImageView(targetImage);
        ImageView imageReduced4 = new ImageView(targetImage);
        
        imageReduced.setScaleX(.5);
        imageReduced.setScaleY(.5);
        imageReduced.setTranslateX((image.getImage().getWidth()* .25)  * (-1));
        imageReduced.setTranslateY((image.getImage().getHeight()* .25)  * (-1));
        imageReduced2.setScaleX(.5);
        imageReduced2.setScaleY(.5);
        imageReduced2.setTranslateX((image.getImage().getWidth()*.25));
        imageReduced2.setTranslateY((image.getImage().getHeight()* .25) * -1);
        imageReduced3.setScaleX(.5);
        imageReduced3.setScaleY(.5);
        imageReduced3.setTranslateX((image.getImage().getWidth()* .25) * -1);
        imageReduced3.setTranslateY((image.getImage().getHeight()* .25));
        imageReduced4.setScaleX(.5);
        imageReduced4.setScaleY(.5);
        imageReduced4.setTranslateX((image.getImage().getWidth()* .25));
        imageReduced4.setTranslateY((image.getImage().getHeight()* .25));
       
        
        
        

        Pane pane = new Pane();
        pane.getChildren().addAll(image,imageReduced,imageReduced2,imageReduced3,imageReduced4);

        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
