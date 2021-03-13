
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        System.out.println(String.format("%d + %d = %d", firstNum, secondNum, (firstNum + secondNum)));
        System.out.println(String.format("%d - %d = %d", firstNum, secondNum, (firstNum - secondNum)));
        System.out.println(String.format("%d * %d = %d", firstNum, secondNum, (firstNum * secondNum)));
        System.out.println(String.format("%d / %d = %.1f", firstNum, secondNum, (1.0 * firstNum / secondNum)));
    }
}
