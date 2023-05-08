
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String sAnswer = scan.nextLine();
        System.out.println("Give an integer:");
        int iAnswer = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double dAnswer = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean bAnswer = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + sAnswer);
        System.out.println("You gave the integer " + iAnswer);
        System.out.println("You gave the double " + dAnswer);
        System.out.println("You gave the boolean " + bAnswer);

    }
}
