
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int iInput =0;
        int iSum = 0;
        int iCount = 0;
        int iOddCount = 0;
        int iEvenCount = 0;
        while(true){
            System.out.println("Give numbers:");
            iInput = Integer.valueOf(scanner.nextLine());
            
            if (iInput == -1) {
                break;
            } else { 
                iSum = iSum +iInput;
                iCount++;
            }
            if (iInput % 2 == 0){
                iEvenCount++;
            } else {
                iOddCount++;
            }
            
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum:"+ iSum);
        System.out.println("Numbers: "+ iCount);
        System.out.println("Average:" + ((1.0*iSum)/iCount));
        System.out.println("Even:" + iEvenCount);
        System.out.println("Odd:" + iOddCount);

    }
}
