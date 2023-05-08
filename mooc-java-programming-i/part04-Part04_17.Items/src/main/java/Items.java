
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String enteredItem ="";
        while (true) {
            System.out.print("Name:");
            enteredItem = scanner.nextLine();
            if (enteredItem.equals("")){
                break;
            } else {
                items.add(new Item(enteredItem));
            }
        }
        for (Item Item:items) {
            System.out.println(Item);
        }

    }
}
