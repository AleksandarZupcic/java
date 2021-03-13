
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        
        int num;
        while(true){
            num = Integer.valueOf(scanner.nextLine());
            if(num == 9999){
                break;
            }
            numList.add(num);
        }
        
        int smallestNum = numList.get(0);
        int smallestNumIndex = 0;
        for(int i = 1; i < numList.size(); i++){
            if(smallestNum > numList.get(i)){
                smallestNum = numList.get(i);
                smallestNumIndex = i;
            }
        }
        
        System.out.println("Smallest number: " + smallestNum);
        System.out.println("Found at index: " + smallestNumIndex);
    }
}
