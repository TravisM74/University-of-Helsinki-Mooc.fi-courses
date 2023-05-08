
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList <Integer> aListOfNumbers = new ArrayList<>();
        int iInputNumber = 0;
        while(true){
            iInputNumber = Integer.valueOf(scanner.nextLine());
            if (iInputNumber == -1){
                break;
            } else {
                aListOfNumbers.add(iInputNumber);
            }
        }
        int iSum = 0;
        for (int number:aListOfNumbers){
            iSum = number + iSum;
        }
        System.out.println("Average:" + (1.0 * iSum / aListOfNumbers.size()));
    }
}
