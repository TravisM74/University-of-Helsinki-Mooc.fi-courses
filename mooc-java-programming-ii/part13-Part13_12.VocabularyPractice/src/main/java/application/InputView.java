/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Travis
 */
public class InputView {
    
    private Dictionary dictionary;
    
    public InputView(Dictionary dictionary){
        this.dictionary = dictionary;
    }
    
    
    public Parent getView() {
        GridPane layout = new GridPane();
        
        Label wordTextLabel = new Label("Word");
        TextField wordTextField = new TextField();
        Label translationLabel = new Label("Translation");
        TextField translationWord = new TextField();
        
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10,10,10,10));
        
        Button addWordPairButton = new Button("Add the word pair");
                
        
        layout.add(wordTextLabel, 0, 0);
        layout.add(wordTextField, 0, 1);
        layout.add(translationLabel, 0, 2);
        layout.add(translationWord, 0, 3);
        layout.add(addWordPairButton, 0, 4);
        
       
        
        addWordPairButton.setOnMouseClicked((event) -> {
            String word = wordTextField.getText();
            String trans = translationWord.getText();
            dictionary.add(word, trans);
            
            wordTextField.clear();
            translationWord.clear();
        });
        
        return layout;        
    }
    
}
