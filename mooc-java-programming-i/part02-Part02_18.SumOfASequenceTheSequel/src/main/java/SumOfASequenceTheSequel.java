
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int iFirstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int iLastNumber = Integer.valueOf(scanner.nextLine());
        int iTotal = 0;
        for (int i = iFirstNumber; i <= iLastNumber ; i++) {
            iTotal = iTotal + i;
        }
        System.out.println("The sum is " + iTotal);

    }
}
