
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sInput = "yes";
        while (!sInput.equals("no")) {
            System.out.println("Shall we carry on?");
            sInput = scanner.nextLine();
        }

    }
}
