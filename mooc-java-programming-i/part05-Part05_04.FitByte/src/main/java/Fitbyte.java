/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class Fitbyte {
    private int age;
    private int restingHeartRate;
    
    
    public Fitbyte(int age, int resting){
        this.age = age;
        this.restingHeartRate = resting;
        
    }
    
    public double maxHeartRate(){
        return 206.3 - (0.711 * this.age);
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        
        return (maxHeartRate() - this.restingHeartRate) * (percentageOfMaximum) + this.restingHeartRate ;
    }
    public String toString(double percentageOfMaximum){
        return "Target "+ percentageOfMaximum + " of maximum:" + targetHeartRate(percentageOfMaximum);
    }
}
