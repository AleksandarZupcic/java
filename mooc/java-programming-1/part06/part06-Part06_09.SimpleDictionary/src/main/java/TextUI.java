
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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDict;

    public TextUI(Scanner scanner, SimpleDictionary simpleDict) {
        this.scanner = scanner;
        this.simpleDict = simpleDict;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            } else if(command.equals("add")){
                this.add();
            } else if(command.equals("search")){
                this.search();
            } else{
                System.out.println("Unknown command");
            }
        }
    }
    
    public void add(){
        System.out.print("Word: ");
        String word = this.scanner.nextLine();
        System.out.print("Translation: ");
        String translation = this.scanner.nextLine();
        this.simpleDict.add(word, translation);
    }
    
    public void search(){
        System.out.println("To be translated: ");
        String word = this.scanner.nextLine();
        String translatedWord = this.simpleDict.translate(word);
        if(translatedWord == null){
            System.out.println("Word "+word+" was not found");
        } else {
            System.out.print("Translation: " + translatedWord);
        }
    }
    
    
}
