
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Create a Package class to which gifts can be added, and that keeps track of the total weight of the gifts in the package. The class should contain:

A parameterless constructor
Method public void addGift(Gift gift), which adds the gift passed as a parameter to the package. The method returns no value.
Method public int totalWeight(), which returns the total weight of the package's gifts.
It's recommended to store the items in an ArrayList object.
 */
public class Package {
    private ArrayList<Gift> packages;
    
    public Package(){
        this.packages = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        this.packages.add(gift);
    }
    
    public int totalWeight(){
        int totalW = 0;
        for(Gift g : packages){
            totalW += g.getWeight();
        }
        return totalW;
    }
}
