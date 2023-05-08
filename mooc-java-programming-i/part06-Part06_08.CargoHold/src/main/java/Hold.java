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

public class Hold {
    private ArrayList<Suitcase> cases = new ArrayList<>();
    private int maxWeight;
    
    public Hold(int weight){
        this.maxWeight = weight;
    }
    public void addSuitcase(Suitcase suitcase){
        if (suitcase.totalWeight() + totalWeightOfCases() <= maxWeight){
            cases.add(suitcase);
        }
    }
    public int totalWeightOfCases(){
        int weight = 0;
        for(Suitcase acase : cases){
            weight = weight + acase.totalWeight();
        }
        return weight;
    }
    public void printItems(){
        for(Suitcase acase: cases){
            acase.printItems();
        }
    }
    
    public String toString(){
        return cases.size() + "suitcases ("+totalWeightOfCases()+ "kg)";
    }
}
