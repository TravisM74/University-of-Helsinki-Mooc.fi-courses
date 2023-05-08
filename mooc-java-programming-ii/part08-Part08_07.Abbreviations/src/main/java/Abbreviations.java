
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class Abbreviations {
    private HashMap<String, String>abbreviations;
    
    public Abbreviations(){
        this.abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        abbreviations.put(abbreviation,explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        if (this.abbreviations.containsKey(abbreviation)){
            return true;
        } else{
            return false;
        }
    }
    
    public String findExplanationFor(String abbreviation){
        if (hasAbbreviation(abbreviation)){
            return abbreviations.get(abbreviation);
        } else {
            return null;
        }
        
    }
       
}
