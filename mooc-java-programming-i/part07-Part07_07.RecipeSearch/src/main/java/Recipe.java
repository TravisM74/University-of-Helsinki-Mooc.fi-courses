
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
public class Recipe {
    private String name;
    private int cookTime;
    private ArrayList<String>ingredient = new ArrayList<>();
    
    public Recipe(String name, int cooktime, ArrayList ingredient){
        this.name = name;
        this.cookTime = cooktime;
        this.ingredient.addAll(ingredient);
    }
    public String getName(){
        return this.name;
    }
    
    public int getCookTime(){
        return this.cookTime;
    }
    
    public String getIngredient(int index){
        return this.ingredient.get(index);
    }
    public int getNumberofIngredient(){
        return this.ingredient.size();
    }
    public void listIngredients(){
        for (int i = 0; i < ingredient.size(); i++){
            System.out.println(ingredient.size());
            System.out.println(ingredient.get(i));
        }
    }
    
    public String toString(){
        return this.name + ", cooking time: "+ this.cookTime+".";
    }
}
