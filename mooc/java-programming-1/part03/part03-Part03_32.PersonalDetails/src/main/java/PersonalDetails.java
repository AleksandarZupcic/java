
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String personAge = "";
        
        String longestName = "";
        int yearSum = 0;
        int howMany = 0;
        
        while(true){
            personAge = scanner.nextLine();
            if(personAge.equals("")){
                break;
            }
            
            String[] personSplit = personAge.split(",");
            if(personSplit[0].length() > longestName.length()){
                longestName = personSplit[0];
            }
            yearSum += Integer.valueOf(personSplit[1]);
            howMany++;
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * yearSum / howMany));
    }
}
