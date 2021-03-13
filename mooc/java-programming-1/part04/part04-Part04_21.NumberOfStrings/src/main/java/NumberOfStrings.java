
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int howMany = 0;
        while(true){
            if(scanner.nextLine().equals("end")) break;
            howMany++;
        }
        System.out.println(howMany);
    }
}
