
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
    private TodoList list;
    private Scanner scan;
    
    
    public UserInterface(TodoList list, Scanner scan){
        this.list = list;
        this.scan = scan;
        
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String input = scan.nextLine();
            if (input.equals("stop")){
                break;
            }
            if (input.equals("add")){
                System.out.println("Task:");
                input = scan.nextLine();
                list.add(input);
            }
            if (input.equals("list")){
                list.print();
            }
            if (input.equals("remove")){
                System.out.println("Which one is removed?");
                int index = Integer.valueOf(scan.nextLine());
                list.remove(index);
            }
            
        }
    }
    
}
