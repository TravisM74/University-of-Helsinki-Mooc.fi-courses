
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
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item>items;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        items=new ArrayList<>();
        
    }
    public int getWeight(){
        int weight = 0;
        for(Item item:items){
            weight = weight + item.getWeight();
        }
        return weight;
    }
    
    public void add(Item item){
        if((getWeight()+item.getWeight()) <= this.capacity){
            this.items.add(item);
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
