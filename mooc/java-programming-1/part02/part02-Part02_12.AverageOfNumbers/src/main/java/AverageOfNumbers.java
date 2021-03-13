
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumONums = 0;
        int numONums = 0;
        int numGiven;
        while (true) {
            System.out.println("Give a number:");
            numGiven = Integer.valueOf(scanner.nextLine());
            if (numGiven == 0) {
                break;
            }
            sumONums += numGiven;
            numONums++;
        }
        System.out.println("Average of the numbers: " + (1.0 * sumONums / numONums));
    }
}
