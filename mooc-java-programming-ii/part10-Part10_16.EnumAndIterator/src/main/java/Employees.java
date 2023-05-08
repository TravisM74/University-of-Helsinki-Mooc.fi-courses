
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class Employees {
    ArrayList<Person> list = new ArrayList<>();
    
    
    public void add(Person person){
        list.add(person);
    }
    
    public void add(List<Person> peopleToAdd){
        list.addAll(peopleToAdd);
    }
    
    public void print(){
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            
        }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()){
            Person next = iterator.next();
            if(next.getEducation() == education){
                System.out.println(next);
            }
        }
           
    }
    
    public void fire(Education education){
        Iterator<Person> iterator= list.iterator();
        while (iterator.hasNext()){
            Person next = iterator.next();
            if(next.getEducation() == education){
                iterator.remove();
            }
        }
        
    }
    
}
