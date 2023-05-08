/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Travis
 */
public class AverageSensor implements Sensor{
    private boolean status;
    private HashMap<Sensor,String>sensors;
   
    
    public AverageSensor(){
        this.sensors = new HashMap<>();
        this.status = false;
        
        
    }
    public void addSensor(Sensor toAdd){
        this.sensors.put(toAdd,null);
        this.status = true;
        for (Sensor sensor:sensors.keySet()){
            if (sensor.isOn()){
                
            } else{
                this.status = false;
            }
        }
    }
    
    public int read(){
        int total = 0;
        if (this.sensors.isEmpty() ){
            throw new IllegalStateException();
        }
        if (this.status != true) {
            throw new IllegalStateException();
        }
        
        for(Sensor sensor:this.sensors.keySet()){
            int temp = sensor.read();
            total+= temp;
            sensors.put(sensor,"t:"+temp);
        }
        return total/this.sensors.size();
    }
    
    public void setOff(){
        this.status = false;
        for(Sensor sensor:this.sensors.keySet()){
            sensor.setOff();
        }
    }
    
    public void setOn(){
        this.status = true;
        for(Sensor sensor:this.sensors.keySet()){
            sensor.setOn();
        }
    }
    
    public boolean isOn(){
        return this.status;
    }
    
    public List<Integer> readings(){
        List<Integer> list = new ArrayList<>();
        if(this.status){
            for(Sensor sensor:this.sensors.keySet()){
                //System.out.println(sensors.get(sensor));
                if ((sensors.get(sensor)) != null && (sensors.get(sensor).contains("t:"))){
                    String[] parts = sensors.get(sensor).split(":");
                    list.add(Integer.valueOf(parts[1]));
                }
            }
        } 
        return list;
    }
    
    
}
