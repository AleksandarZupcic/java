
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
public class Archive {

    private ArrayList<Item> items;

    public Archive() {
        this.items = new ArrayList<>();
    }

    public void addToArchive(Item i){
        if(!this.items.contains(i)){
            this.items.add(i);
        }
    }
    
    @Override
    public String toString(){;
        String itemList = "==Items==\n";
        for(Item i : this.items){
            itemList += i;
        }
        return itemList;
    }
}
