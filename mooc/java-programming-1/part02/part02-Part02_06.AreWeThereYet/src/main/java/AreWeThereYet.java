
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int isItFour;
        do{
            System.out.println("Give a number:");
            isItFour = Integer.valueOf(scanner.nextLine());
        }
        while(isItFour != 4);
    }
}
