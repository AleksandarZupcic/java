
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int numOfGames = 0;
        int wins = 0;
        int losses = 0;
            
        try(Scanner fileScan = new Scanner(Paths.get(file))){
            while(fileScan.hasNextLine()){
                String row = fileScan.nextLine();
                String[] rowSplit = row.split(",");
                int pointLeft = Integer.valueOf(rowSplit[2]);
                int pointRight = Integer.valueOf(rowSplit[3]);
                if(rowSplit[0].equals(team)){
                    if(pointLeft > pointRight) wins++;
                    else losses++;
                    numOfGames++;
                }
                else if(rowSplit[1].equals(team)){
                    if(pointRight > pointLeft) wins++;
                    else losses++;
                    numOfGames++;
                }
            }
        } catch(Exception ex){
            System.out.println(ex.toString());
        }
        
        System.out.println("Games: " + numOfGames);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
