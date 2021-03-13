
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        String firstName, lastName, idNum;
        
        while(true){
            System.out.print("First name: ");
            firstName = scanner.nextLine();
            if(firstName.equals("")) break;
            
            System.out.print("Last name: ");
            lastName = scanner.nextLine();
            
            System.out.print("Identification number: ");
            idNum = scanner.nextLine();
            
            PersonalInformation personalInfo = new PersonalInformation(firstName, lastName, idNum);
            infoCollection.add(personalInfo);
        }
        System.out.println("");
        for(PersonalInformation p : infoCollection){
            System.out.println(p.getFirstName() + " " + p.getLastName());
        }
    }
}
