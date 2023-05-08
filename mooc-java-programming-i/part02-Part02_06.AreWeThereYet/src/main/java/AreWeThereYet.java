
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iInput = 0;
        while (true) {
            System.out.println("Give a number:");
            iInput = Integer.valueOf(scanner.nextLine());
            if (iInput == 4) {
                break;
            }
        }

    }
}
