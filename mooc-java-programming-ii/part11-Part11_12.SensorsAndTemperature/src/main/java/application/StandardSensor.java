/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Travis
 */
public class StandardSensor implements Sensor {
        
    private int input;
    
    public StandardSensor(int input){
        this.input = input;
        
        
    }
   
    public int getValue(){
        return this.input;
    } 
   
    public int read(){
        return this.input;
    }
    
    public void setOff(){
        
    }
    public void setOn(){
        
    }
    public boolean isOn(){
        return true;
    }
    
}
