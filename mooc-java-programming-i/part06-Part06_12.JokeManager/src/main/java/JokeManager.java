
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class JokeManager {
    private ArrayList<String> joke;
    
    
    public JokeManager(){
        this.joke = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.joke.add(joke);
    }
    
    public String drawJoke(){
        if (this.joke.isEmpty()) {
            return ("Jokes are in short supply.");
        } else {
            Random draw = new Random();
            int index = draw.nextInt(this.joke.size());
            return this.joke.get(index);
        }
        
    }
    
    public void printJokes(){
        System.out.println("Printing the jokes.");
        for (String joke : this.joke) {
            System.out.println(joke); 
        }
    }
}
