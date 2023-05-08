/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class Person {
    private String name;
    private Education education;
    
    public Person(String name,Education ed){
        this.name = name;
        this.education = ed;
        
    }
    public Education getEducation(){
        return this.education;
    }
    
    public String toString(){
        return this.name + ", " + this.education.name();
    }
    
}
