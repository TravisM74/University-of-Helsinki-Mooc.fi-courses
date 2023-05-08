
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Handeling books = new Handeling();
        UserInterface ui = new UserInterface(scanner, books);
        ui.start();

    }

}
