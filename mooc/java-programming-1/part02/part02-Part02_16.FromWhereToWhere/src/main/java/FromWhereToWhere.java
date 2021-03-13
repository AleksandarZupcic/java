
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to? ");
        int whereTo = Integer.parseInt(scanner.nextLine());
        System.out.print("Where from? ");
        int whereFrom = Integer.parseInt(scanner.nextLine());
        if(whereTo >= whereFrom){
            while(whereFrom <= whereTo){
                System.out.println(whereFrom);
                whereFrom++;
            }
        }
    }
}
