
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String strScan;
        int num;
        
        while(true){
            strScan = scanner.nextLine();
            if(strScan.equals("end")) break;
            
            num = Integer.valueOf(strScan);
            System.out.println(num * num * num);
        }
    }
}
