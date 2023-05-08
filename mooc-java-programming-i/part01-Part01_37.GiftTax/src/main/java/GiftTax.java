
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int iGiftValue = Integer.valueOf(scan.nextLine());
        if (iGiftValue < 5000) {
            System.out.println("No tax!");
        } else if ((iGiftValue >= 5000) && (iGiftValue < 25000)) {
            System.out.println("Tax:" +  (100 + (iGiftValue - 5000) *.08));
        } else if ((iGiftValue >= 25000) && (iGiftValue < 55000)) { 
            System.out.println("Tax:" + (1700 + (iGiftValue-25000) * .1));
        } else if ((iGiftValue >= 55000) && (iGiftValue < 200000)) {
            System.out.println("Tax:" + (4700 +(iGiftValue-55000) *.12));
        } else if ((iGiftValue >= 200000) && (iGiftValue < 1000000)) {
            System.out.println("Tax:" + (22100 +(iGiftValue-200000) * .15));
        } else if (iGiftValue >= 1000000) {
            System.out.println("Tax:" + (142100 +(iGiftValue -1000000) * .17));
        }

    }
}
