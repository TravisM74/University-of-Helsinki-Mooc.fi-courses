package title;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a title:");
        String input = scan.nextLine();
        Application.launch(UserTitle.class,"--Title="+input);
    
    }

}
