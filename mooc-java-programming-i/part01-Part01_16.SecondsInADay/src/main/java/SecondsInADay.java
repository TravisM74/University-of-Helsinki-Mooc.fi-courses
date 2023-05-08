
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int iNumber = Integer.valueOf(scanner.nextLine());
        int iHours = 24;
        int iMins = 60;
        int iSec = 60;
        
        int iTotalSeconds = iNumber * iHours * iMins * iSec;
        System.out.println(iTotalSeconds);
        
        

    }
}
