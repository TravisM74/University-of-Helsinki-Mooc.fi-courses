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

public class TextUI {
    private Scanner scanner = new Scanner(System.in);
    private SimpleDictionary dictionary = new SimpleDictionary();
    
    
    
    public TextUI(Scanner scanner,SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start(){
        String input = "";
        String word= "";
        String translation= "";
        String searchWord ="";
        while (!input.equals("end")){
            System.out.println("Command:");
            input = scanner.nextLine();
            if (input.equals("end")){
                System.out.println("Bye bye!");
            } else if (input.equals("add")){
                System.out.println("Word:");
                word=scanner.nextLine();
                System.out.println("Translation:");
                translation=scanner.nextLine();
                dictionary.add(word, translation);
            } else if (input.equals("search")){
                System.out.println("To be translated:");
                searchWord=scanner.nextLine();
                if (dictionary.translate(searchWord)== null){
                    System.out.println("Word "+ searchWord + " was not found");
                }else {
                    System.out.println(dictionary.translate(searchWord));
                }
                
                
            } else {
                System.out.println("Unknow command");
            }
        }
        
            
    }
    
}
