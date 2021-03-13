
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Create a Stack class that has a list of strings as an instance variable. Add the following methods to the class:

public boolean isEmpty() - returns a boolean-type value (true or false) that tells whether or not the stack is empty.
public void add(String value) - Adds the value given as a parameter to the top of the stack.
public ArrayList<String> values() - returns the values ​​contained in the stack as a list.
You can test your class with the following code:

Stack s = new Stack();
System.out.println(s.isEmpty());
System.out.println(s.values());
s.add("Value");
System.out.println(s.isEmpty());
System.out.println(s.values());
 */
public class Stack {
    
    private ArrayList<String> stackItems;
    
    public Stack(){
        this.stackItems = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return this.stackItems.size() < 1;
    }
    
    public void add(String value){
        this.stackItems.add(value);
    }
    
    public ArrayList<String> values(){
        return this.stackItems;
    }
    
    public String take(){
        int itemPosition = this.stackItems.size() - 1;
        String item = this.stackItems.get(itemPosition);
        this.stackItems.remove(itemPosition);
        return item;
    }
}
