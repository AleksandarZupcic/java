
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstLiquid = 0;
        int secondLiquid = 0;

        while (true) {
            System.out.println("First: "+firstLiquid+"/100");
            System.out.println("Second: "+secondLiquid+"/100");
            
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int howMuch = Integer.valueOf(parts[1]);
            
            if(command.equals("add")){
                if(howMuch <= 0){
                    continue;
                } else if(howMuch + firstLiquid < 100){
                    firstLiquid += howMuch;
                } else{
                    firstLiquid = 100;
                }
            } else if(command.equals("move")){
                if(howMuch <= 0 || firstLiquid == 0){
                    continue;
                }
                else if(firstLiquid < howMuch){
                    secondLiquid += firstLiquid;
                    firstLiquid = 0;
                } else if(howMuch + secondLiquid < 100){
                    firstLiquid -= howMuch;
                    secondLiquid += howMuch;
                } else{
                    firstLiquid = 0;
                    secondLiquid = 100;
                }
            } else if(command.equals("remove")){
                if(howMuch <= 0 || secondLiquid <= 0){
                    continue;
                } else if(secondLiquid < howMuch){
                    secondLiquid = 0;
                } else{
                    secondLiquid -= howMuch;
                }
            }

        }
    }

}
