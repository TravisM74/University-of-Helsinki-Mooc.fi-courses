package ticTacToe;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application{

    private ArrayList<Button>buttons;
    private GridPane board;
    private Boolean playerXTurn;
    private boolean xWins;
    private boolean yWins;

    private Label topLabel;

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;

    
    public void start(Stage window){
        BorderPane layout = new BorderPane();
        topLabel = new Label("Turn ");
        
        board = new GridPane();
        board.setHgap(10);
        board.setVgap(10);
        setupButtons();
        xWins=false;
        xWins=false;
       
        playerXTurn = true;
        showTurn();
        setButtons();
               
        layout.setTop(topLabel);
        layout.setCenter(board);
        
        Scene view = new Scene(layout,400,400);
        
        window.setScene(view);
        window.show();
        
    }
          
  
    

    public void setupButtons(){
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        button6 = new Button();
        button7 = new Button();
        button8 = new Button();
        button9 = new Button();
        
        buttons= new ArrayList<>();
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        buttons.add(button5);
        buttons.add(button6);
        buttons.add(button7);
        buttons.add(button8);
        buttons.add(button9);
        System.out.println(buttons);
        System.out.println(buttons.size());
        
    }
    
    
    public void launch(){
        
    }
    
    public void showTurn(){
        if(playerXTurn){
            topLabel.setText("Turn: X");
        } 
        if(!playerXTurn){
            topLabel.setText("Turn: O");
        }
    }
    
    public String playerTurn(){
        if(playerXTurn){
            playerXTurn = false;
            return ("X");
            
        }
        playerXTurn= true;
        return ("O");
        
    }
    public void checkWin(){
        if((button1.getText()==("X") &&
            (button2.getText()=="X") &&
            (button3.getText()=="X"))){
            gameOver();
        } 
        if((button4.getText()=="X") &&
            (button5.getText()=="X") &&
            (button6.getText()=="X")) {
            gameOver();
        }
        if  ((button7.getText()=="X") &&
            (button8.getText()=="X") &&
            (button9.getText()=="X")) {
            gameOver();
        }
        if(((button1.getText()=="X") &&
            (button5.getText()=="X") &&
            (button9.getText()=="X"))){
            gameOver();
        } 
        if(((button3.getText()=="X") &&
            (button5.getText()=="X") &&
            (button7.getText()=="X"))){
            gameOver();
        } 
        if(((button1.getText()=="X") &&
            (button4.getText()=="X") &&
            (button7.getText()=="X"))){
            gameOver();
        } 
        if(((button1.getText()=="X") &&
            (button4.getText()=="X") &&
            (button7.getText()=="X"))){
            gameOver();
        } 
         if(((button2.getText()=="X") &&
            (button5.getText()=="X") &&
            (button8.getText()=="X"))){
            gameOver();
        } 
          if(((button3.getText()=="X") &&
            (button6.getText()=="X") &&
            (button9.getText()=="X"))){
            gameOver();
        } 
          // and O
        if((button1.getText()==("O") &&
            (button2.getText()=="O") &&
            (button3.getText()=="O"))){
            gameOver();
        } 
        if((button4.getText()=="O") &&
            (button5.getText()=="O") &&
            (button6.getText()=="O")) {
            gameOver();
        }
        if  ((button7.getText()=="O") &&
            (button8.getText()=="O") &&
            (button9.getText()=="O")) {
            gameOver();
        }
        if(((button1.getText()=="O") &&
            (button5.getText()=="O") &&
            (button9.getText()=="O"))){
            gameOver();
        } 
        if(((button3.getText()=="O") &&
            (button5.getText()=="O") &&
            (button7.getText()=="O"))){
            gameOver();
        } 
        if(((button1.getText()=="O") &&
            (button4.getText()=="O") &&
            (button7.getText()=="O"))){
            gameOver();
        } 
        if(((button1.getText()=="O") &&
            (button4.getText()=="O") &&
            (button7.getText()=="O"))){
            gameOver();
        } 
         if(((button2.getText()=="O") &&
            (button5.getText()=="O") &&
            (button8.getText()=="O"))){
            gameOver();
        } 
          if(((button3.getText()=="O") &&
            (button6.getText()=="O") &&
            (button9.getText()=="O"))){
            gameOver();
        } 
        
        
             
            
          
                
        
    }
    public void gameOver(){
        for (Button button:buttons){
            button.setDisable(true);
        }
        topLabel.setText("The end!");
    }
    
    public void buttonConfigure(Button button){
        button.setPrefSize(100, 1000);
        button.setText("");
        button.setOnMouseClicked((event) -> {
                button.setText(playerTurn());
                button.setDisable(true);
                showTurn();
                checkWin();
            });
    }
    
    

    public void setButtons(){
        int buttoncount =0;
        int rowCount =0;
        //System.out.println(buttons.size());
        
        for(int i =0; i < 9;i++){
            if (buttoncount == 3){
                buttoncount= 0;
                rowCount++;
            }
            //System.out.println(buttons);
            board.add(buttons.get(i),buttoncount,rowCount);
            buttonConfigure(buttons.get(i));
            buttoncount++;
        }
                 
        
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TicTacToeApplication.class);
            
    }   
    

}
