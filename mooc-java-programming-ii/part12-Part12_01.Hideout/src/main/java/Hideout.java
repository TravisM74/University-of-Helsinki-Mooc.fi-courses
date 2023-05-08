
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
public class Hideout <T> {
    private ArrayList<T> thing;
    
    public Hideout(){
        thing = new ArrayList<>();
        
    }
    
    
    public void putIntoHideout(T toHide){
        if(thing.isEmpty()){
            thing.add(toHide);
        }
        
        
    }
    public T takeFromHideout(){
        T returnThing =thing.get(0);
        thing.clear();
        return returnThing;
        
    }
    
    public boolean isInHideout(){
        return !this.thing.isEmpty();
    }
    
}
