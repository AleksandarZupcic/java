
import java.util.Scanner;



public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printUntilNumber(Integer.parseInt(scanner.nextLine()));
    }
    
    public static void printUntilNumber(int num){
        int goingUp = 1;
        while(goingUp <= num){
            System.out.println(goingUp);
            goingUp++;
        }
    }
}
