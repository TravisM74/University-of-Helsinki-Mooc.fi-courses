
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int iNum1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int iNum2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int iNum3 = Integer.valueOf(scanner.nextLine());
        double dAverage = 1.0 * (iNum1 + iNum2 +iNum3) / 3;
        System.out.println("The average is "+ dAverage);

    }
}
