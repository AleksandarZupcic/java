
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics stats = new Statistics();
        Statistics evenStats = new Statistics();
        Statistics oddStats = new Statistics();
        
        System.out.println("Enter numbers:");
        int num;
        
        while(true){
            num = Integer.parseInt(scanner.nextLine());
            if(num == -1){
                break;
            }
            stats.addNumber(num);
            if(num % 2 == 0){
                evenStats.addNumber(num);
            }
            else{
                oddStats.addNumber(num);
            }
        }
        
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + evenStats.sum());
        System.out.println("Sum of odd numbers: " + oddStats.sum());
    }
}
