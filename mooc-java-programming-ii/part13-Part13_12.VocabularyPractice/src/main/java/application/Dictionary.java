/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Travis
 */
public class Dictionary {
    private List<String> words;
    private Map<String, String> translation;
    
    
    public Dictionary(){
        this.words = new ArrayList<>();
        this.translation = new HashMap<>();
        add("sana", "word");
        add("kisa","cat");
        
    }
    
    public void add(String word, String translation){
        if (!this.words.contains(word)){
            this.words.add(word);
        }
        this.translation.put(word,translation);
    }
    
    public String getTrans(String word){
        return this.translation.get(word);
    }
    
    public String getRandomWord(){
        Random rand = new Random();
        return this.words.get(rand.nextInt(this.words.size()));
    }
    

}
