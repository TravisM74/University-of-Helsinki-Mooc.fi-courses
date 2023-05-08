
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String>inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            inputs.add(input);
        }
        
        System.out.println("Print the average of the negative or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        if(input.equals("n")){
            Double negAverage = inputs.stream()
                                .mapToInt(n -> Integer.valueOf(n))
                                .filter(n -> n < 0)
                                .average()
                                .getAsDouble();
            System.out.println(negAverage);
        }
        if(input.equals("p")){
            Double posAverage = inputs.stream()
                                .mapToInt(n -> Integer.valueOf(n))
                                .filter(n -> n > 0)
                                .average()
                                .getAsDouble();
            System.out.println(posAverage);
        }
    }
}
