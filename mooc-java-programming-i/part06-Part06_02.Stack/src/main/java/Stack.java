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

public class Stack {
    ArrayList<String> list = new ArrayList<>();
    
    public Stack(){
        
    }
    
    public boolean isEmpty(){
        if (list.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    
    public void add(String value){
        list.add(value);
        
    }
    public String take(){
        String popVariable =list.get(list.size()-1);
        list.remove(list.size()-1);
        return popVariable;
    }
    
    public ArrayList<String> values(){
         
        return list;
    }
    
}
