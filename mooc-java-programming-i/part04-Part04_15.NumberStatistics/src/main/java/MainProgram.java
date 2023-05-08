
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        //Statistics statistics = new Statistics();
        /*
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        */
        Statistics sumTotal = new Statistics();
        Statistics sumEven = new Statistics();
        Statistics sumOdd = new Statistics();
        
        System.out.println("Enter numbers");
        int number =0;
        
       
        while (true){
            number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            } else {
                sumTotal.addNumber(number);
                if((number%2) == 0){
                    sumEven.addNumber(number); ;
                } else{
                     sumOdd.addNumber(number);
                }       
            }    
        }
        System.out.println("Sum:"+ sumTotal.sum());
        System.out.println("Sum of even numbers:"+ sumEven.sum());
        System.out.println("Sum of odd numbers:"+ sumOdd.sum());
    }
}
