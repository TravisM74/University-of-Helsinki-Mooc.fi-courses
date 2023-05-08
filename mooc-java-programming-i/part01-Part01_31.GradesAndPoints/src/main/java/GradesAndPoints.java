
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]");
        int iPoints = Integer.valueOf(scan.nextLine());
        
        if (iPoints < 0){
            System.out.println("impossible!");
        } else if (iPoints <= 49) { 
            System.out.println("Grade:failed");
        } else if (iPoints <= 59) {
            System.out.println("Grade:1");
        } else if (iPoints <= 69) { 
            System.out.println("Grade:2"); 
        } else if (iPoints <= 79) {
            System.out.println("Grade:3");
        } else if (iPoints <= 89) {
            System.out.println("Grade:4");
        } else if (iPoints <= 100) {
            System.out.println("Grade:5");
        } else {
            System.out.println("incredible!");
        }

    }
}
