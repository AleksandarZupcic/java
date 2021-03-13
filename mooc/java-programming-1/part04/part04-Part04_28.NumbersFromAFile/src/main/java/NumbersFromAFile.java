
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        ArrayList<Integer> numList = new ArrayList<>();
        int num;
        
        try(Scanner fileScan = new Scanner(Paths.get(file))){
            while(fileScan.hasNextLine()){
                num = Integer.valueOf(fileScan.nextLine());
                if(num >= lowerBound && num <= upperBound){
                    numList.add(num);
                }
            }
        } catch (Exception ex){
            System.out.println(ex.toString());
        }
        
        System.out.println("Numbers: " + numList.size());
    }

}
