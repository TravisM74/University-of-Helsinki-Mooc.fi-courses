
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iSum = 0;
        int iInput = 0;
        int iCount = 0;
        
        while (true) {
            System.out.println("Give a number:");
            iInput = Integer.valueOf(scanner.nextLine());
            if (iInput == 0) { 
                break;
            }
            if (iInput != 0){
                iSum = iSum + iInput;
                iCount = iCount +1;
                
            }
        }
        System.out.println("Number of numbers: " + iCount);
        System.out.println("Sum of the numbers: " + iSum);

    }
}
