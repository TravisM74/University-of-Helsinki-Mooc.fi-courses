
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        while (true){
            String input = scanner.nextLine();
            if (Integer.valueOf(input) < 0){
                break;
            }
            inputs.add(input);
        }
        
        inputs.stream().mapToInt(n -> Integer.valueOf(n)).filter(n -> n <=5).forEach(data -> System.out.println(data));


    }
}
