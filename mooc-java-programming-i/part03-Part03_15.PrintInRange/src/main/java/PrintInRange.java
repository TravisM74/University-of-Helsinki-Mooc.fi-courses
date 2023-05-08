
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        printNumbersInRange(numbers,3,10);
    }
    
    public static void printNumbersInRange(ArrayList <Integer> aNumberList,int iLowNumber, int iHighNumber){
        System.out.println("The numbers in the range [" + iLowNumber+","+iHighNumber+ "]");
        for (int number:aNumberList){
            if ((number <= iHighNumber) && (number >= iLowNumber)){
                System.out.println(number);
            }
        }
    }
    
}
