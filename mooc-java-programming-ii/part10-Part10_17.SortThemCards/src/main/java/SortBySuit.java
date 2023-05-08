
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class SortBySuit implements Comparator<Card>{
    
    public int compare(Card c1, Card c2){
        //return c1.getSuit().ordinal() - c2.getSuit().ordinal();
        
       
        if(c1.getSuit().ordinal() == c2.getSuit().ordinal()){
            
            if(c1.getValue() ==c2.getValue()){
                return 0;
            }
            if(c1.getValue() > c2.getValue()){
                return 1;
            } else {
                return -1;
            }
        }
        if((c1.getSuit().ordinal() - c2.getSuit().ordinal()) > 0){
            return 1;
        } else {
            return -1;
        }
            
       
    }
    
}
