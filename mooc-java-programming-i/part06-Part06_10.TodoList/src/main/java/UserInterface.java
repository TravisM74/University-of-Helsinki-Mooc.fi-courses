/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
import java.util.Scanner;
public class UserInterface {
    private TodoList list; 
    private Scanner scanner; 
    
    public UserInterface(TodoList list, Scanner scan){
        this.list = list;
        this.scanner = scan;
    }
    
    public void start(){
        String input = "";
        
        while (true) {
            System.out.println("Command:");
            input = scanner.nextLine();
            if(input.equals("stop")){
                break;
            }
            switch (input){
                case "add" : 
                    System.out.println("To add:");
                    input = scanner.nextLine();
                    add(input);
                break;
                case "remove" :
                    System.out.println("Which one is removed?");
                    input = (scanner.nextLine());
                    add(input);
                    remove(Integer.valueOf(input));
                break;
                case "list":
                    this.list.print();
                    break;
            }   
            
        }
    }
    public void add(String task){
        this.list.add(task);
    }
    public void remove(int number){
        this.list.remove(number);
    }
    
   
    
}
