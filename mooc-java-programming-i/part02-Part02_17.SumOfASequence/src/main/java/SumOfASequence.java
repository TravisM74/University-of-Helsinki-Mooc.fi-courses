
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int iLastNumber = Integer.valueOf(scanner.nextLine());
        int iTotal = 0;
        for (int i = 1; i <= iLastNumber ; i++) {
            iTotal = iTotal + i;
        }
        System.out.println("The sum is " + iTotal);

    }
}
