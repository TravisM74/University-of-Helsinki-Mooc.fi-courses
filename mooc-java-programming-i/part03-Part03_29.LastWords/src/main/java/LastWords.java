
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sInput = scanner.nextLine();
        while(!sInput.equals("")){
            String[] parts = sInput.split(" ");
            System.out.println(parts[parts.length-1]);
            sInput = scanner.nextLine();
        }


    }
}
