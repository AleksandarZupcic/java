
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
 * @author Korisnik
 */
public class FileWorker {
    private ArrayList<Recipe> recipeList;
    private Scanner scanner;
    
    public FileWorker(Scanner scanner){
        this.scanner = scanner;
        this.recipeList = new ArrayList<>();
    }
    
    public void readFile(){
        int counter = 0;
        Recipe recipe = new Recipe();
        System.out.print("File to read: ");
        String fileToRead = this.scanner.nextLine();
        try (Scanner fileScan = new Scanner(Paths.get(fileToRead))) { 
            while(fileScan.hasNextLine()){
                counter++;
                String line = fileScan.nextLine();
                if(line.equals("")){
                    this.recipeList.add(recipe);
                    counter = 0;
                    recipe = new Recipe();
                }
                switch (counter) {
                    case 1:
                        recipe.setName(line);
                        break;
                    case 2:
                        recipe.setCookingTime(Integer.valueOf(line));
                        break;
                    default:
                        recipe.addIngredients(line);
                        break;
                }
            }
            this.recipeList.add(recipe);
        } catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    
    public void listRecipes() {
        for(Recipe r : this.recipeList){
            System.out.println(r);
        }
    }
    
    public void findCookingTime(){
        System.out.print("Max cooking time: ");
        int maxCookingTime = Integer.valueOf(this.scanner.nextLine());
        System.out.println("Recipes:");
        for(Recipe r : this.recipeList){
            if(r.getCookingTime() <= maxCookingTime){
                System.out.println(r);
            }
        }
    }

    public void findName() {
        System.out.print("Searched word: ");
        String name = this.scanner.nextLine();
        for(Recipe r : this.recipeList){
            if(r.getName().toLowerCase().contains(name)){
                System.out.println(r);
            }
        }
    }

    public void findIngredient() {
        System.out.print("Ingredient: ");
        String ingredient = this.scanner.nextLine();
        System.out.println("Recipes:");
        for(Recipe r : this.recipeList){
            if(r.getIngredients().contains(ingredient)){
                System.out.println(r);
            }
        }
    }
}
