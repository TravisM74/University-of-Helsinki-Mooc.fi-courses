
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
public class TodoList {
    private ArrayList<String> list = new ArrayList<>();
    
    public TodoList(){
        
    }
    public void add(String item){
        this.list.add(item);
    }
    
    public void remove(int index){
        //System.out.println(this.list.get(index-1));
        this.list.remove(index -1);
    }
    
    public void print(){
        int count = 0;
        for(String item: list){
            count++;
            System.out.println(count+": "+item);
        }
    }
    
}
