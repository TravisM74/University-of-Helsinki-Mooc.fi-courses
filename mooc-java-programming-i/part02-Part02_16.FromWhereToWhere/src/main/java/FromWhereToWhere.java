
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        System.out.println("Where to?");
        int iInput = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int iFrom = Integer.valueOf(scanner.nextLine());
        for (int i = iFrom; i <= iInput ; i++) {
            System.out.println(i);
        }
    }
}
