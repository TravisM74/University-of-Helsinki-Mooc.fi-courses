
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        while (true){
            userInput = scanner.nextLine();
            if (userInput.equals("end")){
                break;
            } else {
                System.out.println((Integer.valueOf(userInput))*(Integer.valueOf(userInput))*(Integer.valueOf(userInput)));
            }
        }

    }
}
