
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            System.out.print("> ");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } 
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int howMuch = Integer.parseInt(parts[1]);
            if(command.equals("add")){
                firstContainer.add(howMuch);
            } else if(command.equals("move")){
                if(firstContainer.contains() > 0){
                    if(firstContainer.contains() < howMuch){
                        secondContainer.add(firstContainer.contains());
                    } else{
                        secondContainer.add(howMuch);
                    }
                    firstContainer.remove(howMuch);
                }
            } else if(command.equals("remove")){
                secondContainer.remove(howMuch);
            }

        }
    }

}
