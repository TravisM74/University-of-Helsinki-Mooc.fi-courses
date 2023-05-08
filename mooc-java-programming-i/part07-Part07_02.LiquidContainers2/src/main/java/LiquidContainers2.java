
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container containerOne = new Container();
        Container containerTwo = new Container();
        Scanner scan = new Scanner(System.in);

        
        while (true) {
            System.out.println("First:"+containerOne.toString());
            System.out.println("Second:"+containerTwo.toString());
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            if (parts[0].equals("add")){
                containerOne.add(Integer.valueOf(parts[1]));
            }    
            if (parts[0].equals("move")){
                if ((containerOne.contains() - Integer.valueOf(parts[1])) < 0){
                    containerTwo.add(containerOne.contains());
                    containerOne.remove(containerOne.contains());
                } else {
                containerTwo.add(Integer.valueOf(parts[1]));
                containerOne.remove(Integer.valueOf(parts[1]));
                }  
            }
            if (parts[0].equals("remove")){
                containerTwo.remove(Integer.valueOf(parts[1]));
            }

        }
        
    }

}
