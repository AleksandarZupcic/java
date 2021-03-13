
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Create the class Changer, with the following functions:

constructor public Changer() creates a new changer
method public void addChange(Change change) adds a new Change to the Changer
method public String change(String characterString) executes all added Changes for the character string in the order of their adding and returns the changed character string
The class is used in the following way:
 */
public class Changer {
    private ArrayList<Change> changes;
    
    public Changer(){
        this.changes = new ArrayList<Change>();
    }
    
    public void addChange(Change change){
        this.changes.add(change);
    }
    
    public String change(String characterString){
        for(Change ch : this.changes){
            characterString = ch.change(characterString);
        }
        return characterString;
    }
}
