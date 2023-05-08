
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class Handeling {
    ArrayList<Book> list; 
    
    public Handeling(){
        list = new ArrayList<>();
    }
  
    public void addBook(Book book){
        this.list.add(book);
    }
    
    public void add(Book book){
        this.list.add(book);
    }
    
    public Book getBook(int index){
        return this.list.get(index);
        
    }
    public void list(){
        for(Book book :list){
            System.out.println(book);
        }
    }
    public void listByAgeRequirement(){
        System.out.println("Books:");
        list.stream()
            .sorted()
            .forEach(book -> System.out.println(book));
    }
    
    public void bookCount(){
        System.out.println(list.size()+" books in total.");
        System.out.println("");
    }
    
    public void listBooksByAgeAndName(){
        System.out.println("Books:");
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRec)
                .thenComparing(Book::getName);
        Collections.sort(list,comparator);
        for (Book book:list){
            System.out.println(book);
        }
        
        
    }
}
