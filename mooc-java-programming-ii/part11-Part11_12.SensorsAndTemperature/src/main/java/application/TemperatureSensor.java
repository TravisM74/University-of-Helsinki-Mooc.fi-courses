/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author Travis
 */
public class TemperatureSensor implements Sensor{
    private boolean status;
    private int temperature;
    
    
    public TemperatureSensor(){
        status = false;
        
    }
    public int getTemp(){
        Random random = new Random();
        return this.temperature = (random.nextInt(60)-30);
        
    }
    public int read(){
        if(status){
            return getTemp();
                } else{
            throw new IllegalStateException();
        }
        
    }
    
    public int getValue(){
        return temperature;
    }
    
    public void setOff(){
        status = false;
    }
    
    public void setOn(){
        status = true;
    }
    
    public boolean isOn(){
        return status;
    }
    
    
}
