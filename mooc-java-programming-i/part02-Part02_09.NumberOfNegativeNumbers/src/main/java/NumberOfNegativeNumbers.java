
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iCount = 0;
        int iInput = 0;
        
        while (true) {
            System.out.println("Give a number:");
            iInput = Integer.valueOf(scanner.nextLine());
            if (iInput == 0) { 
                break;
            }
            if (iInput < 0){
                iCount = iCount + 1;
                
            }
        }
        System.out.println("Number of negative numbers: " + iCount);

    }
}
