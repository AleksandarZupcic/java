
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String personAge = "";
        int oldest = 0;
        String nameOfOldest = "";
        
        while(true){
            personAge = scanner.nextLine();
            if(personAge.equals("")){
                break;
            }
            String[] personSplit = personAge.split(",");
            int age = Integer.valueOf(personSplit[1]);
            if(age > oldest){
                oldest = age;
                nameOfOldest = personSplit[0];
            }
        }
        
        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}
