
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNoNums = 0;
        int numGiven;
        while (true) {
            System.out.println("Give a number:");
            numGiven = Integer.valueOf(scanner.nextLine());
            if (numGiven == 0) {
                break;
            }
            if (numGiven < 0){
                numNoNums++;
            }
        }
        System.out.println("Number of negative numbers: " + numNoNums);
    }
}
