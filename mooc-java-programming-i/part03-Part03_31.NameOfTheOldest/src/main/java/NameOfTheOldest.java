
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList <String> aName = new ArrayList<>();
        ArrayList <String> aAge = new ArrayList<>();
        
        
        while (true){
            String sInData = scanner.nextLine();
            if (sInData.equals("")){
                break;
            } else {
                String[] sParts = sInData.split(",");
                aName.add(sParts[0]);
                aAge.add(sParts[1]);
            }
        }
        int iFoundIndex = 0;
        int iGreatestAge = 0;
        for (int i = 0 ; i < aAge.size(); i++){
            if (iGreatestAge < Integer.valueOf(aAge.get(i))){
                iGreatestAge = Integer.valueOf(aAge.get(i));
                iFoundIndex = i;
            }
        }
        System.out.println("Name of the oldest:" + aName.get(iFoundIndex));
    }
}
