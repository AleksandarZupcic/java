
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int numGiven = Integer.parseInt(scanner.nextLine());
        int factorial = 1;
        while(numGiven > 1){
            factorial *= numGiven;
            numGiven--;
        }
        System.out.print("Factorial: " + factorial);
    }
}
