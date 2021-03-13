
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shallWe;
        do{
            System.out.println("Shall we carry on?");
            shallWe = scanner.nextLine();
        }
        while(!shallWe.equals("no"));
    }
}
