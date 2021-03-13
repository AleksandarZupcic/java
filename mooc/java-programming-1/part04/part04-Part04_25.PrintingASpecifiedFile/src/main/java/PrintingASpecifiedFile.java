
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String whichFile = scanner.nextLine();
        
        try(Scanner fileScan = new Scanner(Paths.get(whichFile))){
            while(fileScan.hasNextLine()){
                String row = fileScan.nextLine();
                System.out.println(row);
            }
        } catch(Exception ex){
            System.out.println("Error: " + ex.toString());
        }
    }
}
