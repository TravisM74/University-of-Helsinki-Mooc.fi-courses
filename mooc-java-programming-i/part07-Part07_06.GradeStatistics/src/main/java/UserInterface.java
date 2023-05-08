
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class UserInterface {
    private Scanner scanner;
    private Grades grades;
    
    
    
    public UserInterface(Scanner scanner, Grades grades){
        this.scanner = scanner;
        this.grades = grades;
    }
    
    public void start(){
        System.out.println("Enter point totals,-1 stops:");
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }
            
            grades.addGrade(input);
        }
        /*
        for (int i= 0; i < grades.getSize(); i++){
            System.out.println(grades.getGrade(i));
        }
        */
        System.out.println(grades.pointAverage());
        System.out.println(grades.passingAverage());
        System.out.println("Pass percentage: "+grades.passingPercent());
        grades.gradeDistribution();
    }
    
    
}
