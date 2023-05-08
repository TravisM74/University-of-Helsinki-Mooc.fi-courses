
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class Pipe <T>{
    List<T> pipe;
    
    public Pipe(){
        pipe= new ArrayList<>();
        
    }
    
    public void putIntoPipe(T value){
        pipe.add(value);
        
    }
    
    public T takeFromPipe(){
        if(pipe.size() > 0){
            T getValue = pipe.get(0);
            pipe.remove(0);
            return getValue;
        }
        return null;
        
    }
    
    public boolean isInPipe(){
        if(pipe.size() > 0 ){
            return true;
        }
        return false;
        
    }
}
