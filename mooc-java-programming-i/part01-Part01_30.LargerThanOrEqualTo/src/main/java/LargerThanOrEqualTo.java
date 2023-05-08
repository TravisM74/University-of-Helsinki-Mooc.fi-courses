
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int iNumber1 = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int iNumber2 = Integer.valueOf(scan.nextLine());
        if (iNumber1 == iNumber2) {
            System.out.println("The numbers are equal!");
        } else if (iNumber1 > iNumber2) { 
            System.out.println("Greater number is:" + iNumber1);
        } else { 
            System.out.println("Greater number is:" + iNumber2);
        }
        

    }
}
