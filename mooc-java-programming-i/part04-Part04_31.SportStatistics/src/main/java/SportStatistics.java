
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int teamCount = 0;
        int teamWins = 0;
        int teamLose = 0;
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();
        try (Scanner fileReader = new Scanner(Paths.get(file))){
            while (fileReader.hasNextLine()) {
                String[] part = fileReader.nextLine().split(",");
                if (teamName.equals(part[0])){
                    teamCount++;
                    if ((Integer.valueOf(part[2])) > (Integer.valueOf(part[3]))){
                        teamWins++;
                    } else {
                        teamLose++;
                    }
                }
                if (teamName.equals(part[1])){
                    teamCount++;
                    if ((Integer.valueOf(part[2])) < (Integer.valueOf(part[3]))){
                        teamWins++;
                    } else {
                        teamLose++;
                    }
                }
                
            }
            
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        
       
        System.out.println("Games: "+ teamCount);
        
        System.out.println("Wins: " +teamWins);
        System.out.println("Losses: "+teamLose );
        

    }

}
