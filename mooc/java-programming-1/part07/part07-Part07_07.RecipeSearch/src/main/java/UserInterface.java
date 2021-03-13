
import java.util.*;
import java.nio.file.Paths;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Korisnik
 */
public class UserInterface {
    private Scanner scanner;
    private FileWorker fileWorker;
    
    public UserInterface(Scanner scanner, FileWorker fileWorker){
        this.scanner = scanner;
        this.fileWorker = fileWorker;
    }
    
    public void start(){
        this.fileWorker.readFile();
        commands();
    }
    
    public void commands(){
        listOfCommands();
        String command;
        while(true){
            command = this.scanner.nextLine();
            if(command.equals("stop")){
                break;
            } else if(command.equals("list")){
                this.fileWorker.listRecipes();
            } else if(command.equals("find name")){
                this.fileWorker.findName();
            } else if(command.equals("find cooking time")){
                this.fileWorker.findCookingTime();
            } else if(command.equals("find ingredient")){
                this.fileWorker.findIngredient();
            } else{
                wrongCommand();
            }
        }
    }
    
    public void listOfCommands(){
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }
    
    
    public void wrongCommand(){
        System.out.println("Sorry, that's not the right command!");
        System.out.println("Perhaps you've misspelled something?");
        System.out.println("Here's the list of commands..");
        listOfCommands();
        System.out.println("Please try again.");
    }

}
