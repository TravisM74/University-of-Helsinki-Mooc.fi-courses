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
public class TodoList {
    private ArrayList<String> list;
    
    
    public TodoList(){
        Scanner scanner = new Scanner(System.in);
        this.list = new ArrayList<>(); 
    }
    
    public void add(String task){
        this.list.add(task);
    }
    public void print(){
        for (int i = 0 ; i < this.list.size(); i++){
            System.out.println((i + 1)+ ": " + this.list.get(i));
        }
        
    }
    
    public  void remove(int number){
        this.list.remove(number-1);
    }
    
}
