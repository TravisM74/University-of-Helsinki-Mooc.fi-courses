
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
public class Herd implements Movable{
    private ArrayList<Movable> location;
    
    public Herd(){
        location = new ArrayList<>();
        
    }
    public String toString(){
        String results="";
        for (Movable org: location){
            results += org +"\n";
        }
        return results;
    }
    
    public void addToHerd(Movable movable){
        location.add(movable);
    }
    public void move(int dx, int dy){
        for(Movable move:location){
            move.move(dx, dy);
        }
    }
}
