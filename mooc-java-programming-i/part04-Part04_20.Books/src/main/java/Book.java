/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class Book {
    private String name;
    private int year;
    private int pages;
    
    public Book(String name, int year, int pages){
        this.name = name;
        this.year = year;
        this.pages = pages;
    }
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
    public int getPages(){
        return this.pages;
    }
    public String toString(){
        return this.name + ", "+this.pages + " pages, " + this.year;
    }
    
}
