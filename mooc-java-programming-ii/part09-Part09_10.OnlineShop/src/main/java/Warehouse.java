
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class Warehouse {
    private Map<String,Integer> items;
    private Map<String,Integer> stock;
    
    public Warehouse(){
        this.items = new HashMap<>();
        this.stock = new HashMap<>();
    }
    public Set<String> products(){
        return stock.keySet();
    }
    
    
    public void addProduct(String product, int price,int stock){
        this.items.put(product,price);
        this.stock.put(product,stock);
        
    }
    
    public int price(String product){
        for(String item:this.items.keySet()){
            
            if(item.equals(product)){
                return this.items.get(item);
            }
        }
        return -99;
    }
    
    public int stock(String product){
        if(this.stock.containsKey(product)){
            return this.stock.get(product);
        }
        return 0; 
    }
    
    public boolean take(String product){
        if(this.stock.containsKey(product)){
            if (this.stock.get(product) > 0){
                int amount = this.stock.get(product) -1;
                this.stock.put(product,amount);
                return true;
            } 
        } 
        return false;
    }
    
    
    
}
