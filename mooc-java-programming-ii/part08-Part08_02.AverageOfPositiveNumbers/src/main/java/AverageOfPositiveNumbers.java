
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;
        int input = Integer.valueOf(scanner.nextLine());
        while(input !=0){
            if (input >= 0){
                total = total + input;
                count++;
            }
            input = Integer.valueOf(scanner.nextLine());
        }
        if (total == 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0* total / count);
        }

    }
}
