
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class ShoppingCart {
    private Map<String,Item>cart = new HashMap<>();
    
    public ShoppingCart(){
       
        
               
    }
    public void add(String product, int price){
        Item item = new Item(product,1,price);
        if(cart.containsKey(product)){
            cart.get(product).increaseQuantity();
        } else{
            cart.put(product,item);
        }
    }
    
    
    public int price(){
        int totalPrice = 0;
        for (String product:cart.keySet()){
            totalPrice = totalPrice + cart.get(product).price();
        }
        
        return totalPrice;
    }
    
    public void print(){
        for(String item:cart.keySet()){
            System.out.println(cart.get(item));
        }
    }
    
}
