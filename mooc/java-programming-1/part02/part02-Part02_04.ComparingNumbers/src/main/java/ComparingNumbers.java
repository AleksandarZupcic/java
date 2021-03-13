
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.valueOf(scanner.nextLine());
        int numTwo = Integer.valueOf(scanner.nextLine());
        String isWhat = (numOne > numTwo) ? "greater than" : (numOne == numTwo) ? "equal to" : "smaller than";
        System.out.println(String.format("%d is %s %d", numOne, isWhat, numTwo));
    }
}
