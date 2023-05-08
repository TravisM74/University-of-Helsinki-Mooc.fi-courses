
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
    private Handeling books;
    private Scanner scan;
    public UserInterface(Scanner scanner, Handeling books){
        this.scan = scanner;
        this.books = books;
        
    }
    
    public void start(){
        while (true){
            System.out.println("Input the name of the book, empty stops:");
            String input = scan.nextLine();
            if (input.isEmpty()){
                break;
            }
            System.out.println("Input the age recommendation:");
            int ageInput = Integer.valueOf(scan.nextLine());
            books.add(new Book(input,ageInput));
            
            
            
        }
        books.bookCount();
        //books.listByAgeRequirement();
        books.listBooksByAgeAndName();
        
                
    }
    
}
