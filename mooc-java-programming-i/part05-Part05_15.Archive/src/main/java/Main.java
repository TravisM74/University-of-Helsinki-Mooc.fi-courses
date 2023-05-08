
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Item item = new Item();
        ArrayList Items = new ArrayList<>();
        String inputId;
        String inputName;
        while (true){
            System.out.println("Identifier? (empty will stop)");
            inputId = scanner.nextLine();
            if (inputId.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            inputName = scanner.nextLine();
            if (inputName.isEmpty()){
                break;
            }
            item = new Item(inputId,inputName);
            
            
            if (!Items.contains(item)){
                Items.add(item);
            } else {
               
            }
            
            
            
        }
        System.out.println("==Items==");
        for(int i = 0; i < Items.size();i++){
            System.out.println(Items.get(i));
            
        }
    }
}
