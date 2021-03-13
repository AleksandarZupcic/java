
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Korisnik
 */
public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(){
        this.ingredients = new ArrayList<>();
    }

    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void addIngredients(String ingredient){
        this.ingredients.add(ingredient);
    }
    
    @Override
    public String toString(){
        return this.name + ", cooking time: " + this.cookingTime;
    }
    
}
