/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
Create a class Multiplier that has a:
* Constructor public Multiplier(int number).
* Method public int multiply(int number) which returns the value number passed to it multiplied by the number provided to the constructor.
* You also need to create an instance variable in this exercise.
 */

public class Multiplier {
    private int number;
    
    public Multiplier(int number){
        this.number = number;
    }
    
    public int multiply(int number){
        return this.number *= number;
    }
}
