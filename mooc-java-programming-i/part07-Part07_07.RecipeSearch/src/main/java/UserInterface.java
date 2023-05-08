
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
public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    RecipeBook recipebook = new RecipeBook();
    
    public UserInterface(Scanner scanner, RecipeBook book){
        this.recipebook = book;
        this.scanner = scanner;
    }
    public void start(){
        System.out.println("File ro read:");
        String inputCommand =scanner.nextLine();
        recipebook.loadBook(inputCommand);
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stopes the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipies by ingredient");
        
        while (true){
            System.out.println("");
            System.out.println("Enter Command:");
            inputCommand =scanner.nextLine(); 
            if (inputCommand.equals("stop")){
                break;
            }
            if (inputCommand.equals("list")){
                System.out.println("Recipes:");
                for (int i = 0; i< recipebook.countRecipes();i++){
                    //System.out.println(recipebook.getRecipeName(i)+",cookingtime:"+ recipebook.getRecipeCooktime(i));
                    System.out.println(recipebook.getRecipe(i).toString());
                }
            }
            if (inputCommand.equals("find name")){
                System.out.println("Searched word:");
                recipebook.findRecipeByName(scanner.nextLine());
            }
            if (inputCommand.equals("find cooking time")){
                System.out.println("Max cooking time:");
                recipebook.findRecipeByCookingTime(Integer.valueOf(scanner.nextLine()));
            }
            if (inputCommand.equals("find ingredient")){
                System.out.println("Ingredient:");
                recipebook.findRecipeByIngredient(scanner.nextLine());
            }
            
           
        } 
       
        
    }
    
}
