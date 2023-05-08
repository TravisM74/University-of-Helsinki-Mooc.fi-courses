
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iSum = 0;
        int iInput = 0;
        double dCount = 0;
        
        while (true) {
            System.out.println("Give a number:");
            iInput = Integer.valueOf(scanner.nextLine());
            if (iInput == 0) { 
                break; 
            }
            if (iInput > 0){
                iSum = iSum + iInput;
                dCount = dCount +1;
                
            }
        }
        if (dCount == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((iSum/dCount));
        }

    }
}
