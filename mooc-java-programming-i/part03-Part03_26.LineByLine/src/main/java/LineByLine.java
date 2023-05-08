
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sInput = scanner.nextLine();
        while(!sInput.equals("")){
            String[] parts = sInput.split(" ");
            listPartsOfString(parts);
            sInput = scanner.nextLine();
        }
        


    }
    public static void listPartsOfString(String[] parts){
        for (int i = 0; i < parts.length;i++){
            System.out.println(parts[i]);
        }
    }
}
