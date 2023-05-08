
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int iAge = Integer.valueOf(scan.nextLine());
        if((iAge < 0) || (iAge > 120)) {
            System.out.println("Impossible!");
        } else {
            System.out.println("Ok");
        }
                

    }
}
