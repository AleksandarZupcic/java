
import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printFromNumberToOne(Integer.parseInt(scanner.nextLine()));
    }

    public static void printFromNumberToOne(int num) {
        while (num >= 1) {
            System.out.println(num);
            num--;
        }
    }

}
