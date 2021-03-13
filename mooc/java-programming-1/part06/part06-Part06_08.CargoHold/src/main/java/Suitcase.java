
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
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item){
        if(item.getWeight() + this.totalWeight() <= this.maxWeight){
            this.items.add(item);
        }
    }
    
    @Override
    public String toString(){
        
        
        int itemsTotal = this.items.size();
        if(itemsTotal == 0){
            return "no items (0 kg)";
        }
        
        String itemS = (itemsTotal == 1) ? "item" : "items";
        return itemsTotal + " "+itemS+" ("+this.totalWeight()+" kg)";
    }
    
    public void printItems(){
        this.items.forEach((item) -> {
            System.out.println(item);
        });
    }
    
    public int totalWeight(){
        int kgTotal = 0;
        for(Item item : this.items){
            kgTotal += item.getWeight();
        }
        return kgTotal;
    }
    
    
    public Item heaviestItem(){
        if(this.items.size() == 0) return null;
        Item heaviest = this.items.get(0);
        for(Item item : this.items){
            if(item.getWeight() > heaviest.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }
}
