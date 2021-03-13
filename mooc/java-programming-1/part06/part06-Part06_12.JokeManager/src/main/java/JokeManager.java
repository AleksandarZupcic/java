
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Korisnik
    Create a class called JokeManager and move the functionality to manage jokes in it. The class must have a parameter-free constructor, and the following methods:

    public void addJoke(String joke) - adds a joke to the manager.
    public String drawJoke() - chooses one joke at random and returns it. It there are no jokes stored in the joke manager, the method should return the string "Jokes are in short supply.".
    public void printJokes() - prints all the jokes stored in the joke manager.
 */
public class JokeManager {
    private ArrayList<String> jokes;
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    
    public String drawJoke(){
        System.out.println("Drawing a joke.");
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random rand = new Random();
            int index = rand.nextInt(jokes.size());
            return jokes.get(index);
        }
    }
    
    public void printJokes(){
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
