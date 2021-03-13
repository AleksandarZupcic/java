
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        String orwell = (Integer.valueOf(scan.nextLine()) == 1984) ? "Orwell" : "";
        System.out.println(orwell);
    }
}
