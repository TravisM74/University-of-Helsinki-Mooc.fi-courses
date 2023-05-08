
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a year:");
        int iYear = Integer.valueOf(scan.nextLine());
        if (iYear < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
