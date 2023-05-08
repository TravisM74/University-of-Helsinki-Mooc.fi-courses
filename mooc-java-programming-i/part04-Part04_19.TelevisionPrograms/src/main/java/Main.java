import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String showName;
        int showDuration;
        int showMaxDuration;
        while (true){
            System.out.println("Name:");
            showName= scanner.nextLine();
            if (showName.isEmpty()){
                break;
            }
            System.out.println("Duration:");
            showDuration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(showName, showDuration));
        }
        System.out.println("Program's maximum duration?");
        showMaxDuration = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram TelevisionProgram:programs){
            showDuration = TelevisionProgram.getDuration();
            if (showDuration <= showMaxDuration){
                System.out.println(TelevisionProgram);
            }
        }

    }
}
