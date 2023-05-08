
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
public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable>items;
    
    public Box(double capacity){
        this.capacity = capacity;
        items = new ArrayList<>();
        
    }
    public void add(Packable item){
        if (this.capacity >= (item.weight() + weight())){
            items.add(item);
            
        }
    }
    public double weight(){
        double totalWeight = 0;
        for (Packable item: items){
            totalWeight = totalWeight + item.weight();
        }
        return totalWeight;
    }
    public String toString(){
        return "Box: "+ items.size() + " items, total weight " + this.weight() + " kg";
    }
    
}
