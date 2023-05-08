
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand = new ArrayList<>();
    
    
    
    public void add(Card card){
        hand.add(card);
    }
    
    public void sortBySuit(){
        Collections.sort(hand, new SortBySuit());
    }
    public void sortBySuitInValueOrder(){
        Collections.sort(hand, new BySuitInValueOrder());
    }
    
    
    public void print(){
        hand.stream().forEach(card -> System.out.println(card));
    }
    public int handScore(){
        int handScore = 0;
        for (Card card:hand){
            handScore += card.getValue();
            
        }
        return handScore;
    }
    public void sort(){
       Collections.sort(hand);
    }
       
    public int compareTo(Hand hand){
        
        if (this.handScore() == hand.handScore()){
            return 0;
        }
        if (this.handScore() > hand.handScore()){
            return 1;
        } else {
            return -1;
        }
    }
    
}
