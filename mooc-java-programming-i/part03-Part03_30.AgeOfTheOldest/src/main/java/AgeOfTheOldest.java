
import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> aName = new ArrayList<>();
        ArrayList<String> aAge = new ArrayList<>();
        String sAge ="";
        
        while (true){
            String sInData = scanner.nextLine();
            if (sInData.equals("")){
                //System.out.println("Breaking from loops !");
                break;
            } else {
                String[] aParts = sInData.split(",");
                aName.add(aParts[0]);
                sAge =aParts[1];
                aAge.add(sAge);
                //System.out.println(sParts[0] +" " + sParts[1]);
                //System.out.println(aName.size() + " " + aAge.size());
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
        System.out.println("Age of the oldest:" + aAge.get(iFoundIndex));


    }
}
