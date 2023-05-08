
import java.util.Scanner;
import java.util.ArrayList;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> aName = new ArrayList<>(); 
        ArrayList <String> aPassWord = new ArrayList<>();
        aName.add("alex");
        aName.add("emma");
        aPassWord.add("sunshine");
        aPassWord.add("haskell");
        
        System.out.println("Enter username:");
        String sUser = scanner.nextLine();
        System.out.println("Enter Password:");
        String sPass = scanner.nextLine();
        boolean bValidLogin = false;
        for(int i = 0; i < aName.size() ; i++){
            if ((aName.get(i).equals(sUser)) && (aPassWord.get(i).equals(sPass))){
                bValidLogin = true;
            }
          
        }
        if (bValidLogin){
            System.out.println("You have succsessfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }

    }
}
