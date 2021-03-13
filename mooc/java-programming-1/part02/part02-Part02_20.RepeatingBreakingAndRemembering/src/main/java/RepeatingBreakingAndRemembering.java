
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int num;
        int sum = 0, numAmount = 0, evenNums = 0, oddNums = 0;
        while (true) {
            num = Integer.parseInt(scanner.nextLine());
            if (num == -1) {
                break;
            }
            sum += num;
            numAmount++;
            if (num % 2 == 0) {
                evenNums++;
            } else {
                oddNums++;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numAmount);
        System.out.println("Average: " + (1.0 * sum / numAmount));
        System.out.println("Even: " + evenNums);
        System.out.println("Odd: " + oddNums);

    }
}
