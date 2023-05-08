/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
import java.util.*;
public class Room {
    ArrayList<Person> persons = new ArrayList<>();
    
    public Room(){
        
    }
    public void add(Person person){
        persons.add(person);
    }
    public boolean isEmpty(){
        return persons.isEmpty();
    }
    public ArrayList<Person> getPersons(){
        return persons;
    }
    public Person shortest(){
        if (isEmpty()){
            return null;
        }
        Person shortPerson = this.persons.get(0);
        for (Person person:persons){
            if (person.getHeight() < shortPerson.getHeight()){
                shortPerson = person;
            }
        }
        return shortPerson;
    }
    
    public Person take(){
        if(isEmpty()){
            return null;
        }
        Person tookPerson = this.persons.get(0);
        tookPerson=shortest();
        persons.remove(tookPerson);
        return tookPerson;
    }
}
