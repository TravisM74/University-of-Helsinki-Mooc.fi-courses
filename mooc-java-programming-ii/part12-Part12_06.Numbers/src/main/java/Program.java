
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random number should be printed?");
        Random randomNumber = new Random();
        int number = scanner.nextInt();
        for (int i = 0 ; i < number; i++){
            int ranNumber = randomNumber.nextInt(11);
            System.out.println(ranNumber);
            
        }
    }

}
