
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
public class BirdWatching {
    private ArrayList<Bird> watching = new ArrayList<>();
    
    public BirdWatching(){
        
    }
    
    public void addBird(String name,String latinName){
        Bird addBird = new Bird(name, latinName);
        watching.add(addBird);
    }
    
    public Bird getBird(int index){
        return watching.get(index);
    }
    
    public void list(){
        for(Bird bird:watching){
            System.out.println(bird);
        }
    }
    public void findBird(String name){
        for (int i = 0; i < watching.size();i++){
            if((name.equals(watching.get(i).getname()))|| name.equals(watching.get(i).getLatinName())){
                System.out.println(watching.get(i));
            }
        }
    }
    public void observerd(String name){
        for (int i = 0; i < watching.size();i++){
            if((name.equals(watching.get(i).getname()))|| name.equals(watching.get(i).getLatinName())){
                watching.get(i).observed();
            }
        }
    }
}
