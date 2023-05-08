/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class Item {
    private String id;
    private String name;
    
    public Item(){
        
    }
    
    public Item(String id, String name){
        this.id = id;
        this.name = name;
        
    }
    public String getName(){
        return this.name;
    }
    
    public String getId() {
        return this.id;
    }
    public boolean equals(Object compared){
        //location
        if(this == compared){
            return true;
        }
        //type instanceof
        if(!(compared instanceof Item)){
            return false;
        }
        //variables recast and compared
        Item comparedItem = (Item) compared;
        
        if (this.id.equals(comparedItem.id)) {
            return true;
        }
        
        return false;
    }
    
    public String toString(){
        return this.id + ": " + this.name;
    }
    
}
