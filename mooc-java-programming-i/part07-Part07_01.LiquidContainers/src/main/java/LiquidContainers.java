
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int containerOne = 0;
        int containerTwo = 0;
        final int maxLiquid = 100;

        while (true) {
            System.out.println("First:"+containerOne + "/"+maxLiquid);
            System.out.println("Second:"+containerTwo + "/"+maxLiquid);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            if (Integer.valueOf(parts[1]) < 0){
                parts[1] = "0";
            }
            if (parts[0].equals("add")){
                containerOne = containerOne + Integer.valueOf(parts[1]);
            }    
            if (parts[0].equals("move")){
                //containerOne = containerOne - Integer.valueOf(parts[1]);
                if ((containerOne - Integer.valueOf(parts[1])) < 0){
                    containerTwo = containerTwo + containerOne;
                    containerOne = 0;
                } else {
                containerTwo = containerTwo + Integer.valueOf(parts[1]);
                containerOne = containerOne - Integer.valueOf(parts[1]);
                }  
            }
            if (parts[0].equals("remove")){
                containerTwo = containerTwo - Integer.valueOf(parts[1]);
            }
            if (containerOne > maxLiquid){
                containerOne = maxLiquid;
            }
            if (containerTwo > maxLiquid){
                containerTwo = maxLiquid;
            }
            if (containerTwo < 0) {
                containerTwo = 0;
            }

        }
    }

}
