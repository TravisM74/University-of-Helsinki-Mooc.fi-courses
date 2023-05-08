
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int iGreatest = number1;
        
        if (number2 > iGreatest) {
            iGreatest = number2;
        }
        if (number3 > iGreatest) {
            iGreatest = number3;
        }

        return iGreatest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
