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

public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;
    private int maxItems;
    
    public Suitcase(int weight){
        this.maxWeight = weight;
    }
    
    public int totalWeight(){
        return getWeight();
    }
    
    public int getWeight(){
        int currentWeight=0;
        if (!items.isEmpty()){
            for(Item anitem:items){
                currentWeight = currentWeight + anitem.getWeight();
            }
        }
        return currentWeight;
    }
    
    public void addItem(Item item){
        
        if (item.getWeight() + getWeight() <= maxWeight){
            items.add(item);
        }
        
    }
    
    public void printItems(){
        for(Item anItem:items){
            System.out.println(anItem.getName()+ " ("+ anItem.getWeight()+ "kg)");
        }
    }
    
    public Item heaviestItem(){
        if (items.isEmpty()){
            return null;
        }
        Item heavyItem = items.get(0);
        for(Item anItem: items){
            if(anItem.getWeight() > heavyItem.getWeight()){
                heavyItem=anItem;
            }
        }
        return heavyItem;
    }
    
    public String toString(){
        String outString = "";
        if (items.isEmpty()){
            return "no items ("+ getWeight() + " kg)";
        }
        if (items.size() == 1) {
            outString = items.size() + " item (" + getWeight() + " kg)";
        } else{
        outString = items.size() + " items (" + getWeight() + " kg)";
        }
        return outString;
    }
}
