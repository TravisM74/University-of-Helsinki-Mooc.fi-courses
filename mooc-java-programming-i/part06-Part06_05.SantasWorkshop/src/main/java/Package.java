/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
import java.util.*;

public class Package {
    
    private ArrayList<Gift> packages = new ArrayList<>();
    
    
    public Package(){
        
        
    }
    public void addGift(Gift gift){
       
        packages.add(gift);
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for (Gift gift: packages){
            totalWeight = totalWeight + gift.getWeight();
        }
        return totalWeight;
    }
    
    
}
