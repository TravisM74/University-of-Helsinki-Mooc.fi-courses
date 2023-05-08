
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class OneItemBox extends Box {
    private ArrayList<Item>items;
    
    
    public OneItemBox(){
        items = new ArrayList<>();
        
    }
    public void add(Item item){
        if(items.isEmpty()){
            items.add(item);
        }
        
    }
   
    public boolean isInBox(Item item){
        if (this.items.contains(item)){
            return true;
        } else {
            return false;
        }
            
    }
        
   
}
