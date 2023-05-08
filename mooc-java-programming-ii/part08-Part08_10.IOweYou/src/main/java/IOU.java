
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
public class IOU {
    private HashMap<String,Double>who;
    
    public IOU(){
        this.who = new HashMap<>();
        
    }
    
    public void setSum(String toWhom, double amount){
        if(who.containsKey(toWhom))
            amount = amount +who.get(toWhom);
        this.who.put(toWhom, amount);
        
    }
    
    public double howMuchDoIOweTo(String toWhom){
        return this.who.getOrDefault(toWhom,0.0);
    }
    
}
