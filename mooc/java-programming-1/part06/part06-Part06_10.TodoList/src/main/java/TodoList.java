
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Korisnik
 * 
 * Create a class called TodoList. It should have a constructor without parameters and the following methods:

public void add(String task) - add the task passed as a parameter to the todo list.
public void print() - prints the exercises. Each task has a number associated with it on the print statement — use the task's index here (+1).
public void remove(int number) - removes the task associated with the given number; the number is the one seen associated with the task in the print.
 */
public class TodoList {
    private ArrayList<String> list;
    
    public TodoList(){
        this.list = new ArrayList<>();
    }
    
    public void add(String task){
        this.list.add(task);
    }
    
    public void print(){
        for(int i = 0; i < this.list.size(); i++){
            System.out.println((i + 1) + ": " + this.list.get(i));
        }
    }
    
    public void remove(int number){
        if(number < this.list.size()){
            this.list.remove(number - 1);
        }
    }
}
