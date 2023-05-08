import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        String bookTitle;
        int bookPages;
        int bookYear;
        String userSelection;
        
        while(true){
            System.out.print("Title:");
            System.out.println("");
            bookTitle = scanner.nextLine();
            if (bookTitle.isEmpty()){
                break;
            }
            System.out.print("Pages:");
            bookPages = Integer.valueOf(scanner.nextLine());
            System.out.println("");
            System.out.print("Publication year:");
            bookYear = Integer.valueOf(scanner.nextLine());
            books.add(new Book(bookTitle,bookYear,bookPages));
            
        }
        System.out.print("what information will be Printed?");
        userSelection = scanner.nextLine();
        System.out.println("");
        if (userSelection.equals("everything")){
            for (Book Book: books){
                System.out.println(Book);
            }
        } else if (userSelection.equals("name")){
            for (Book Book: books){
                System.out.println(Book.getName());
            }
        }
    }
}
