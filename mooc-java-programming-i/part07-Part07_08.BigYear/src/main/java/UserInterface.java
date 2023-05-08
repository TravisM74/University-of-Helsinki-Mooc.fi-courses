
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class UserInterface {
    Scanner scan;
    BirdWatching watching;
    
    
    public UserInterface(Scanner scan,BirdWatching watching){
        this.scan = scan;
        this.watching = watching;
    }
    public void start(){
        String input = "";
       
        
        while(true){
            System.out.println("?");
            input= scan.nextLine();
            if (input.equals("Quit")){
                break;
            }
            if (input.equals("Add")){
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String latinName =scan.nextLine();
                watching.addBird(name, latinName);
            }
            if (input.equals("All")){
                watching.list();
            }
            if (input.equals("One")){
                System.out.println("Bird?");
                watching.findBird(scan.nextLine());
            }
            if (input.equals("Observation")){
                System.out.println("Bird?");
                watching.observerd(scan.nextLine());
            }
        }
    }
}
