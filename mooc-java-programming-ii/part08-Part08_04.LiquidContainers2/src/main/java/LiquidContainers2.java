
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        

        while(true) {
            System.out.println("First:"+first);
            System.out.println("Second:"+second);
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            
            input = parts[0];
            if (input.equals("quit")) {
                break;
            }
            int amount = Integer.valueOf(parts[1]);
            if (input.equals("add")){
                first.add(amount);
            }
            if (input.equals("remove")){
                second.remove(amount);
            }
            
            if (input.equals("move") && ((amount) > 0)){
                if (first.contains() < amount){
                    second.add(first.contains());
                    first.remove(first.contains());
                } else {
                    first.remove(amount);
                    second.add(amount);
                }
            }

        }
    }

}
