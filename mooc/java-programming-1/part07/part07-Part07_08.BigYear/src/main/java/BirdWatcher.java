
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
public class BirdWatcher {
    private Scanner scanner;
    private ArrayList<Bird> birdList;
    public BirdWatcher(Scanner scanner){
        this.scanner = scanner;
        this.birdList = new ArrayList<>();
    }
    
    public void addBird(){
        System.out.print("Name: ");
        String name = this.scanner.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = this.scanner.nextLine();
        Bird b = new Bird(name, latinName);
        this.birdList.add(b);
    }
    
    public void observeBird(){
        System.out.println("Bird? ");
        String observation = this.scanner.nextLine();
        boolean observedBird = false;
        for(Bird b : this.birdList){
            if(b.getName().toLowerCase().contains(observation.toLowerCase())){
                b.observed();
                observedBird = true;
                break;
            }
        }
        if(!observedBird){
            System.out.println("Not a bird!");
        }
    }
    
    public void listAllBirds(){
        for(Bird b : this.birdList){
            System.out.println(b);
        }
    }
    
    public void listOneBird(){
        System.out.print("Bird? ");
        String bird = this.scanner.nextLine();
        for(Bird b : this.birdList){
            if(b.getName().toLowerCase().contains(bird.toLowerCase())){
                System.out.println(b);
                return;
            }
        }
    }
}
