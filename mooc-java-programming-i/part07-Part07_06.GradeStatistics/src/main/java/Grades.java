
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
public class Grades {
    
    private ArrayList<Integer> grades = new ArrayList<>();
    
    
    public Grades(){
        
        
    }
    
    public void addGrade(int grade){
        if ((grade >= 0) &&(grade <= 100)){
            this.grades.add(grade);
        }
    }
    
    public int getGrade(int index){
        return this.grades.get(index);
        
    }
    public int getSize(){
        return this.grades.size();
    }
    
    public String pointAverage(){
        int sumPoint = 0;
        for (int i = 0; i < this.grades.size();i++){
            sumPoint = sumPoint + this.grades.get(i);
        }
        return "Point average (all): "+(((1.0* sumPoint)/this.grades.size()));
    }
    
    public String passingAverage(){
        int sumPoint = 0;
        int passes = 0;
        for (int i = 0; i < this.grades.size();i++){
            if (this.grades.get(i) >= 50){
                sumPoint = sumPoint + this.grades.get(i);
                passes++;
            }
        }
        String outText = "Point average (passing): ";
        if (passes == 0){
            return outText +"-";
        } else {
            return outText +((1.0 *sumPoint) / passes);
        }
    }
    
    public double passingPercent(){
        int passes = 0;
        for (int i = 0; i < this.grades.size();i++){
            if (this.grades.get(i) >= 50){
                passes++;
            }
        }
        return (100.0 * passes /this.grades.size());
    }
    
    public void gradeDistribution(){
        int gradeDesc[] = new int[6];
        
        for (int i = 0; i < this.grades.size();i++){
            if (this.grades.get(i)>= 90){
               gradeDesc[5]++;
            } else if ((this.grades.get(i) >=80) && (this.grades.get(i) <90)) {
                gradeDesc[4]++;
            } else if ((this.grades.get(i) >=70) && (this.grades.get(i) <80)) {
                gradeDesc[3]++;
            } else if ((this.grades.get(i) >=60) && (this.grades.get(i) <70)) {
                gradeDesc[2]++;   
            } else if ((this.grades.get(i) >=50) && (this.grades.get(i) <60)) {
                gradeDesc[1]++;
            } else if (this.grades.get(i) <50){
                gradeDesc[0]++; 
            }
        }
        for (int i = 5; i >= 0 ; i--){
            System.out.print(i+":");
            for(int j= 0; j < gradeDesc[i]; j++){
                System.out.print("*" );
            }
            System.out.println("");
        }
    }
}
