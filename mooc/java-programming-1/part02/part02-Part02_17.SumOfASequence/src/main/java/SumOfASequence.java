
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");
        int lastNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while(lastNum != 0){
            sum += lastNum;
            lastNum--;
        }
        System.out.println("The sum is " + sum);
    }
}
