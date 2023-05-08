
import java.nio.file.Paths;
import java.util.ArrayList;
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
public class RecipeBook {
    
    private ArrayList<Recipe>recipes = new ArrayList<>();

    public RecipeBook(){
        
    }
    
    public void findRecipeByIngredient(String search){
        for (int i=0 ; i < this.recipes.size(); i++){
            for(int j= 0; j < this.recipes.get(i).getNumberofIngredient();j++){
                String target = this.recipes.get(i).getIngredient(j);
                if (target.equals(search)){
                    System.out.println(this.recipes.get(i).toString());
                }
            
            }
        }
    }
    
    public void findRecipeByName(String search){
        System.out.println("Recipes:");
        for (int i=0 ; i < this.recipes.size(); i++){
            if (this.recipes.get(i).getName().contains(search)){
                System.out.println(this.recipes.get(i).getName()+", cooking time: "+this.recipes.get(i).getCookTime()+".");
            }
        }
    }
    public void findRecipeByCookingTime(int search){
        for (int i=0 ; i < this.recipes.size(); i++){
            if (this.recipes.get(i).getCookTime() <= search){
                System.out.println(this.recipes.get(i).toString());
            }
        }
    }
    public Recipe getRecipe(int index){
        return recipes.get(index);
    }
    
    public void addRecipe(Recipe recipe){
        this.recipes.add(recipe);
    }
    public String getRecipeName(int index){
        return this.recipes.get(index).getName();
    }
    public int getRecipeCooktime(int index){
        return this.recipes.get(index).getCookTime();
    }
    
    public void listRecipes(){
        System.out.println("Recipes:");
        for (int i =0; i < recipes.size(); i++){
            System.out.println(recipes.get(i).getName());
        }
    }
    
    public int countRecipes(){
        return this.recipes.size();
    }
    
    public void loadBook(String file){
        
        int lineCount = 0;
        String name = "";
        int time = 0;
        ArrayList<String> ingredients = new ArrayList<>();
        try (Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                String line= fileReader.nextLine();
                lineCount++;
                if (lineCount == 1){
                    name = line;
                }
                if (lineCount == 2){
                    time = Integer.valueOf(line);
                }
                if ((lineCount > 2) && (!line.isEmpty())) {
                    ingredients.add(line);
                }
                if (line.isEmpty()) {
                    Recipe toAdd = new Recipe(name,time,ingredients);
                    this.recipes.add(toAdd);
                    lineCount= 0;
                    name = "";
                    time = 0;
                    ingredients.clear();
                    
                }
            }
            Recipe toAdd = new Recipe(name,time,ingredients);
            this.recipes.add(toAdd);
            lineCount= 0;
            name = "";
            time = 0;
            ingredients.clear();
        } catch (Exception e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}

