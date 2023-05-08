
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String userFile = scanner.nextLine();
        try (Scanner fileReader = new Scanner(Paths.get(userFile))){
            while (fileReader.hasNextLine()) {
                String[] parts = fileReader.nextLine().split(",");
                System.out.print(parts[0]+", age: "+ parts[1]);
                if ((Integer.valueOf(parts[1])) == 1){
                    System.out.println(" year");
                } else {
                    System.out.println(" years");
                }
            }
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }

    }
}
