import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        String name;
        int duration;
        
        while(true){
            System.out.print("Name: ");
            name = scanner.nextLine();
            if(name.equals("")) break;
            
            System.out.println("Duration: ");
            duration = Integer.parseInt(scanner.nextLine());
            
            TelevisionProgram tvProgram = new TelevisionProgram(name, duration);
            programs.add(tvProgram);
        }
        
        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.parseInt(scanner.nextLine());
        
        for(TelevisionProgram tvProg : programs){
            if(maxDuration == tvProg.getDuration()){
                System.out.println(tvProg);
            }
        }
    }
}
