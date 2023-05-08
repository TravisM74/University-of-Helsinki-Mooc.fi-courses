
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int iInput = Integer.valueOf(scanner.nextLine());
        
        while (iInput != 0) {
            if (iInput > 0) {
                System.out.println(iInput * iInput);
            } else { 
                System.out.println("Unsuitable number");
            }
            System.out.println("Give a number:");
            iInput = Integer.valueOf(scanner.nextLine());
        }

    }
}
