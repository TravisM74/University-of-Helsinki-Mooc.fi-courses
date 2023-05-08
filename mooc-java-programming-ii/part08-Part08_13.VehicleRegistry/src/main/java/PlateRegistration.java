
import java.util.ArrayList;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class PlateRegistration {
     private ArrayList<LicensePlate> plates = new ArrayList<>();
     
     
    
    public PlateRegistration(){
       
    }
    
    public void add(LicensePlate plate){
        
            plates.add(plate);
        
    }
    
    public LicensePlate get(int index){
        return plates.get(index);
    }
    
    public void remove(int index){
        plates.remove(index);
    }
    
    public void list(){
        for (LicensePlate plate:plates){
            System.out.println(plate);
        }
    }
    
    public boolean contains(LicensePlate compPlate){
        for (LicensePlate plate:plates){
            if (plate.equals(compPlate)){
                return true;
            }
        }
        return false;
    }

   
    
}
