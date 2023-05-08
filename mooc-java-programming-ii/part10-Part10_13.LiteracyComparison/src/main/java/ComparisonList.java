
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class ComparisonList {
    ArrayList<Entry>list = new ArrayList<>();
    
    public ComparisonList(){
        try {
        Files.lines(Paths.get("literacy.csv"))
            .map(line -> line.split(","))
            .forEach(line -> list.add(new Entry(line[2],line[3],Integer.valueOf(line[4]),Double.valueOf(line[5]))));
        } catch (Exception e){
            System.out.println("Error;"+e.getMessage());
        }
        
    }
    public void listByRate(){
        list.stream()
                .sorted()
                .forEach(line -> System.out.println(line));
    }
    
}
