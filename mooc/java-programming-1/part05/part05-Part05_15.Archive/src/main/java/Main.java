
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String identifier, name;
        Archive archive = new Archive();
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            identifier = scanner.nextLine();
            if(identifier.isEmpty()) break;
            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();
            if(name.isEmpty()) break;
            
            Item i = new Item(identifier, name);
            archive.addToArchive(i);
        }
        
        System.out.println(archive);
    }
}
