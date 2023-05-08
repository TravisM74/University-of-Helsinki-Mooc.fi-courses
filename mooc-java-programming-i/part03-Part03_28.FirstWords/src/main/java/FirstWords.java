
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sInput = scanner.nextLine();
        while(!sInput.equals("")){
            String[] parts = sInput.split(" ");
            System.out.println(parts[0]);
            sInput = scanner.nextLine();
        }
    }
}
