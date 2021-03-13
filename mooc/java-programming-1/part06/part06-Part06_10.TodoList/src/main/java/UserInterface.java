
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Korisnik
 * 
 * UserInterface ui = new UserInterface(list, scanner);
 * 
 * Next, implement a class called UserInterface. It should have a constructor with two parameters. The first parameter is an instance of the class TodoList, and the second is an instance of the class Scanner. In addition to the constructor, the class should have the method public void start() that is used to start the text user interface. The text UI works with an eternal looping statement (while-true), and it must offer the following commands to the user:

The command stop stops the execution of the loop, after which the execution of the program advances out of the start method.
The command add asks the user for the next task to be added. Once the user enters this task, it should be added to the to-do list.
The commmand list prints all the tasks on the to-do list.
The command remove asks the user to enter the id of the task to be removed. When this has been entered, the specified task should be removed from the list of tasks.
 */
public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        String command;
        while(true){
            System.out.print("Command: ");
            command = this.scanner.nextLine();
            if(command.equals("stop")){
                break;
            } else if(command.equals("add")){
                this.add();
            } else if(command.equals("list")){
                this.list();
            } else if(command.equals("remove")){
                this.remove();
            }
        }
    }
    
    public void add(){
        System.out.print("To add: ");
        String toAdd = this.scanner.nextLine();
        this.list.add(toAdd);
    }
    
    public void list(){
        this.list.print();
    }
    
    public void remove(){
        System.out.print("Which one is removed? ");
        int removedIndex = Integer.parseInt(this.scanner.nextLine());
        this.list.remove(removedIndex);
    }
}
