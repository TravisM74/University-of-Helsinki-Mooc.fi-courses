
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iSum = 0;
        int iInput = 0;
        
        while (true) {
            System.out.println("Give a number:");
            iInput = Integer.valueOf(scanner.nextLine());
            if (iInput == 0) { 
                break;
            }
            if (iInput != 0){
                iSum = iSum + iInput;
                
            }
        }
        System.out.println("Sum of the numbers: " + iSum);


    }
}
