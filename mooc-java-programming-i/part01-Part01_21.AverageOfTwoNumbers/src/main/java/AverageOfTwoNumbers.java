
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int iNum1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int iNum2 = Integer.valueOf(scanner.nextLine());
        double dAverage = 1.0 * (iNum1 + iNum2) / 2;
        System.out.println("The average is "+ dAverage);

    }
}
