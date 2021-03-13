
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumONums = 0;
        int numGiven;
        while (true) {
            System.out.println("Give a number:");
            numGiven = Integer.valueOf(scanner.nextLine());
            if (numGiven == 0) {
                break;
            }
            sumONums += numGiven;
        }
        System.out.println("Sum of the numbers: " + sumONums);
    }
}
