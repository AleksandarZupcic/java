
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
public class Hold {
    private ArrayList<Suitcase> suitcaseHold;
    private int maxWeight;
    public Hold(int maxWeight){
        this.suitcaseHold = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight() + this.totalHoldWeight() <= this.maxWeight){
            this.suitcaseHold.add(suitcase);
        }
    }
    
    public int totalHoldWeight(){
        int totalWeight = 0;
        for(Suitcase s : this.suitcaseHold){
            totalWeight += s.totalWeight();
        }
        return totalWeight;
    }
    
    public void printItems(){
        for(Suitcase s : this.suitcaseHold){
            s.printItems();
        }
    }
    
    @Override
    public String toString(){
        return this.suitcaseHold.size() + " suitcases ("+this.totalHoldWeight()+" kg)";
    }
}
