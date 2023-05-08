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
    private int holds;
    
    public Container(){
        
    }
    
    public int contains(){
        return this.holds;
    }
    
    public void add(int amount){
        if (amount < 0 ){
            amount = 0;
        }
        this.holds += amount;
        if (this.holds > 100){
            this.holds = 100;
        }
    }
    
    public void remove(int amount){
        this.holds -= amount;
        if (this.holds < 0 ){
            this.holds = 0;
        }
    }
    
    public String toString(){
        return holds + "/100";
    }
    
}
