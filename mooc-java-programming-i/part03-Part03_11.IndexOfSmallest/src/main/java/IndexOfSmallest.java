
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList <Integer> aListOfNumbers = new ArrayList<>();
        int iInputNumber =0;
        while(true){
            iInputNumber = Integer.valueOf(scanner.nextLine());
            if (iInputNumber == 9999){
                break;
            } else {
                aListOfNumbers.add(iInputNumber);
            }
        }
        int iSmallestNumber = aListOfNumbers.get(0);
        for (int number:aListOfNumbers){
            if (number < iSmallestNumber) {
                iSmallestNumber = number;
            }
        }
        System.out.println("Smallest number: "+iSmallestNumber);
        for (int i = 0; i < aListOfNumbers.size(); i++){
            if (aListOfNumbers.get(i) == iSmallestNumber){
                System.out.println("Found at Index:"+ i);
            }
        }
        

        
    }
}
