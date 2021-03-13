
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        try(Scanner fileScan = new Scanner(Paths.get(file))){
            while(fileScan.hasNextLine()){
                String row = fileScan.nextLine();
                String rowItems[] = row.split(",");
                String strForm = String.format("%s, age: %s years", rowItems[0], rowItems[1]);
                System.out.println(strForm);
            }
        } catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
}
