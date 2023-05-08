
import java.util.Scanner;
import java.util.ArrayList;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userInputs = new ArrayList<>();
        String userInput;
        while (true){
            userInput = scanner.nextLine();
            if (userInput.equals("end")){
                break;
            }
            userInputs.add(userInput);
            
        }
        System.out.println(userInputs.size());

    }
}
