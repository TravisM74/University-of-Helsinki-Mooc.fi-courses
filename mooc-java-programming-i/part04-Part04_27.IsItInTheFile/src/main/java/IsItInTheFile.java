
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        boolean targetFound = false;
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))){
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                if (line.contains(searchedFor)){
                    targetFound = true;
                }
                
            }
            
        } catch (Exception e) {
            System.out.println("Reading the file "+ e.getMessage());
        }
        if (targetFound) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }

    }
}
