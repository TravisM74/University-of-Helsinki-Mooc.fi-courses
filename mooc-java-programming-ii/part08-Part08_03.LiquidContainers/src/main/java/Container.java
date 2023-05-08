/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class Container {
    int contains;
    int maxContain;
    
    public Container(){
        maxContain = 100;
    }
    public int get(){
        return this.contains;
    }
    
    public void add(int amount){
        if (amount > 0 ){
            if (amount >= 0){
                this.contains = this.contains + amount;
            }
       
            if (this.contains > maxContain) {
                this.contains = maxContain;
            }
        }
    }
    
    public int amountToMove(int amount){
        if(amount < 0){
            return 0;
        }
        if (amount >= this.contains){
            amount = this.contains;
            this.contains = 0;
            return amount;
        } else { 
            this.contains = this.contains - amount;
            return amount;
        }
    }
    
    public void remove(int amount){
        if(amount < 0){
            
        } else {            
            this.contains = this.contains - amount;
            if (this.contains < 0 ){
                this.contains = 0;
            }
        }
    }
    public String toString(){
        return this.contains + "/"+maxContain;
    }
    
}
