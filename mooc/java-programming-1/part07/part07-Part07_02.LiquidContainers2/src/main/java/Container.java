/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Make a class called Container. The class must have a constructor which does not take any parameters, and the following methods:



 * @author Korisnik
 */
public class Container {
    int liquid;
    
    public Container(){
        this.liquid = 0;
    }
    
    //public int contains() which returns the amount of liquid in a container as an integer.
    public int contains(){
        return this.liquid;
    }
    
    //public void add(int amount) which adds the amount of liquid given as a parameter to the container. 
    //If the amount is negative, no liquid is added. A container can hold a maximum of 100 units of liquid.
    public void add(int amount){
        if(amount > 0){
            if(amount + liquid > 100){
                this.liquid = 100;
            } else{
                this.liquid += amount;
            }
        }
    }
    
    //public void remove(int amount) which removes the amount of liquid given as a parameter from the container.
    //If the amount is negative, no liquid is removed. A container can never hold less than 0 units of liquid.
    public void remove(int amount){
        if(amount > 0){
            if(this.liquid - amount < 0){
                this.liquid = 0;
            } else{
                this.liquid -= amount;
            }
        }
    }
    
    //public String toString() which returns the container as a string formatted "amount of liquid/100, for example "32/100".
    @Override
    public String toString(){
        return this.liquid + "/100";
    }
}
