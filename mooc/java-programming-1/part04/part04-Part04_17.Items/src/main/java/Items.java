
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        while(true){
            name = scanner.nextLine();
            if(name.equals("")) break;
            Item newItem = new Item(name);
            items.add(newItem);
        }
        
        for(Item item : items){
            System.out.println(item);
        }
    }
}
