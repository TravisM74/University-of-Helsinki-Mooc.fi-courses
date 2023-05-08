
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iNumber1 = Integer.valueOf(scanner.nextLine());
        int iNumber2 = Integer.valueOf(scanner.nextLine());
        int iSum = iNumber1 + iNumber2;
        double dSquareRoot = Math.sqrt(iSum);
        System.out.println(dSquareRoot);

    }
}
