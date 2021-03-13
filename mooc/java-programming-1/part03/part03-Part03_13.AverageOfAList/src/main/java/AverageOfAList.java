
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        
        int sum = 0;
        int num;
        
        while(true){
            num = Integer.valueOf(scanner.nextLine());
            if(num == -1){
                break;
            }
            sum += num;
            numList.add(num);
        }
        
        System.out.println("Average: " + (1.0 * sum / numList.size()));
    }
}
