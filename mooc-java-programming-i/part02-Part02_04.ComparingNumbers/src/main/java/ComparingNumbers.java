
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iNumber1 = Integer.valueOf(scanner.nextLine());
        int iNumber2 = Integer.valueOf(scanner.nextLine());
        if (iNumber1 > iNumber2) {
            System.out.println(iNumber1 + " is greater than " + iNumber2 + ".");
        } else if (iNumber1 < iNumber2) {
            System.out.println(iNumber1 + " is smaller than " + iNumber2 + ".");
        } else {
            System.out.println(iNumber1 + " is equal to " + iNumber2 + ".");
        }

    }
}
