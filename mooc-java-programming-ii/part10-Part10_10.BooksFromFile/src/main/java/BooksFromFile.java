
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    public static List<Book> readBooks (String file){
        ArrayList<String> reading = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();
        try{
        Files.lines(Paths.get(file))
                .forEach(line -> reading.add(line))
                ;
        } catch (Exception e) {
            System.out.println("Error :"+ e.getMessage());
        }
        reading.stream()
                .map(line -> line.split(","))
                .forEach(line -> books.add(new Book(line[0],Integer.valueOf(line[1]),Integer.valueOf(line[2]),line[3])));
        return books;
    }

}
