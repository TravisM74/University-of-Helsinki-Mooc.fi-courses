
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
public class ChangeHistory {
    private ArrayList<Double>history;
    
    public ChangeHistory(){
        history = new ArrayList<>();
    }
    
    public void add(double status){
        this.history.add(status);
    }
    public void clear(){
        this.history.clear();
    }
    public double maxValue(){
        double maxValue =0;
        for(double value:history){
            if (value > maxValue){
                maxValue = value;
            }
        }
        return maxValue;
    }
    public double minValue(){
        double minValue= Double.MAX_VALUE;
        for(double value:history){
            if (value < minValue){
                minValue = value;
            }
        }
        return minValue;
    }
    public double average(){
        double totalValue= 0;
        int count=0;
        for(double value:history){
            totalValue = totalValue+value;
            count++;
        }
        if (totalValue == 0){
            return 0.0;
        }
        return totalValue/count;
    }
    
    public String toString(){
        return this.history.toString();
    }
    
}
