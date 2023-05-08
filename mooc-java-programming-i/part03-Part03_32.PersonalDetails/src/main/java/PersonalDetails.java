
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sInput = "";
        
        ArrayList<String> aName = new ArrayList<>();
        ArrayList<Integer> aYear = new ArrayList<>();
        int iYearSum = 0;
        while(true){
            sInput = scanner.nextLine();
            if (sInput.equals("")){
               break;
            } else {
                String[] aParts = sInput.split(",");
                aName.add(aParts[0]);
                aYear.add(Integer.valueOf(aParts[1]));
                iYearSum = iYearSum + Integer.valueOf(aParts[1]);
            }
        }
        int iLongestNameIndex = -1;
        int iLongestNameSize = 0;
        for (int i = 0; i < aName.size();i++){
            if (aName.get(i).length() > iLongestNameSize ) {
                iLongestNameSize = aName.get(i).length();
                iLongestNameIndex = i;
            }
        }
        System.out.println("Longest name:"+ aName.get(iLongestNameIndex));
        System.out.println("Averageof the birth years:"+ (1.0*iYearSum /aYear.size()));


    }
}
