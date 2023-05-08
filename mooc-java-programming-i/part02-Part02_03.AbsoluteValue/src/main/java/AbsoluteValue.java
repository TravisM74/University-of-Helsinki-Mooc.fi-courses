
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iNumber = Integer.valueOf(scanner.nextLine());
        if (iNumber < 0) {
            System.out.println(iNumber * -1);
        } else {
            System.out.println(iNumber);
        }

    }
}
