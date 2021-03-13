/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Korisnik
 */
public class Item {
    
    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Item)) return false;
        
        Item itemCompare = (Item) obj;
        return this.identifier.equals(itemCompare.identifier);
    }
    
    @Override
    public String toString(){
        return this.identifier + ": " + this.name;
    }
}
