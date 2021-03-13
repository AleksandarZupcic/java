
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
public class UserInterface {
    private Scanner scanner;
    private BirdWatcher birdWatcher;
    public UserInterface(Scanner scanner, BirdWatcher birdWatcher){
        this.scanner = scanner;
        this.birdWatcher = birdWatcher;
    }
    
    public void start(){
        commands();
    }
    
    public void commands(){
        String command;
        while(true){
            System.out.print("? ");
            command = this.scanner.nextLine();
            if(command.equals("Quit")) break;
            
            switch (command) {
                case "Add":
                    this.birdWatcher.addBird();
                    break;
                case "Observation":
                    this.birdWatcher.observeBird();
                    break;
                case "All":
                    this.birdWatcher.listAllBirds();
                    break;
                case "One":
                    this.birdWatcher.listOneBird();
                    break;
                default:
                    System.out.println("Sorry; wrong command. Try again!");
                    break;
            }
            
        }
    }
}
