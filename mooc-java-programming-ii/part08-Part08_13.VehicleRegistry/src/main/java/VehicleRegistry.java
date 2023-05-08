
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
public class VehicleRegistry {
    private HashMap<LicensePlate ,String> registration;
    
    public VehicleRegistry(){
        registration = new HashMap<>();
    }
    
    public boolean add(LicensePlate LisensePlate, String Owner){
        if (registration.get(LisensePlate) == null){
            registration.put(LisensePlate, Owner);
            return true;
        }
        return false;
    } 
    
    public String get(LicensePlate LisensePlate){
        return registration.get(LisensePlate);
    }
    
    public boolean remove(LicensePlate LisensePlate){
        if(registration.containsKey(LisensePlate)){
            registration.remove(LisensePlate);
            return true;
        }
    return false;    
    }
    public void printLicensePlates(){
        for (LicensePlate plate :registration.keySet()){
            System.out.println(plate);
            
            
        }
    }
    public void printOwners(){
        ArrayList<String> printed = new ArrayList<>();
        for (String owner :registration.values()){
            if (!printed.contains(owner)){
                System.out.println(owner);
                printed.add(owner);
            }
            
        }
    }
}
