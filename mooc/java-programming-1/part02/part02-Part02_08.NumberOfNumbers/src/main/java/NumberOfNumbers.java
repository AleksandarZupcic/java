
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNums = 0;
        int numGiven;
        while(true){
            System.out.println("Give a number:");
            numGiven = Integer.valueOf(scanner.nextLine());
            if(numGiven == 0){
                break;
            }
            numNums++;
        }
        System.out.println("Number of numbers: " + numNums);
    }
}
