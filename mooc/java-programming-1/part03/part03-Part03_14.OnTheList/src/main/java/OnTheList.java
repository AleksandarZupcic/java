
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        System.out.print("Search for? ");
        String lookingFor = scanner.nextLine();
        String found = "was not found!";
        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals(lookingFor)){
                found = "was found!";
                break;
            }
        }
        System.out.println(lookingFor + " " + found);
    }
}
