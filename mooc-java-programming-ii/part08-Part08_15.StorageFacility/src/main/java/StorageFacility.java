
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class StorageFacility {
    HashMap<String,ArrayList<String>> storage;
    
    public StorageFacility(){
        storage = new HashMap<>();
        
        
    }
    public void add(String name, String item){
        if(!storage.containsKey(name)){
            storage.put(name,new ArrayList<String>());
            storage.get(name).add(item);
        } else{
            storage.get(name).add(item);
        }
    }
    
    public ArrayList<String> contents(String storageUnit){
        ArrayList<String> list = new ArrayList<>();
        if (storage.containsKey(storageUnit)){
            list = storage.get(storageUnit);
        }
        return list;
    }
    
    public void remove(String storageUnit, String item){
              
        if(storage.get(storageUnit).contains(item)){
            for (int i =0 ; i < storage.get(storageUnit).size(); i++){
                if (storage.get(storageUnit).get(i).equals(item)){
                    storage.get(storageUnit).remove(i);
                }
            }
        } 
    }
   
    
    public ArrayList storageUnits(){
        ArrayList<String> list = new ArrayList<>();
        for (String unit:storage.keySet()){
            if (!storage.get(unit).isEmpty()){
                list.add(unit);
            }
        }
        return list;
    }
    
}
