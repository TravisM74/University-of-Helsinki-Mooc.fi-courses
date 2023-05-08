
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String sInput = scanner.nextLine();
        while(!sInput.equals("")){
            String[] parts = sInput.split(" ");
            findAvInPartsOfString(parts);
            sInput = scanner.nextLine();
        }
        


    }
    public static void findAvInPartsOfString(String[] parts){
        for (int i = 0; i < parts.length;i++){
            if (parts[i].contains("av")){
                System.out.println(parts[i]);
        }
    }


    }
}
