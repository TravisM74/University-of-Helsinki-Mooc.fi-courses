
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container one = new Container();
        Container two = new Container();

        while (true) {
            System.out.println("First:"+one);
            System.out.println("Second:"+two);

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (parts[0].equals("quit")) {
                break;
            }
            if (parts[0].equals("add")){
                one.add(Integer.valueOf(parts[1]));
            }
            
            if (parts[0].equals("move")){
                two.add(one.amountToMove(Integer.valueOf(parts[1])));
            }
            if (parts[0].equals("remove")){
                two.remove(Integer.valueOf(parts[1]));
            }

        }
    }

}
