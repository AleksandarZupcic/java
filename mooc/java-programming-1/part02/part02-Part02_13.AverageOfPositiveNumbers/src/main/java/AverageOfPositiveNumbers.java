
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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
            if(numGiven > 0){
                sumONums += numGiven;
                numONums++;
            }
        }
        if(numONums != 0){
            System.out.println(1.0 * sumONums / numONums);
        } else{
            System.out.println("Cannot calculate the average");
        }
    }
}
