
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int pts = Integer.valueOf(scan.nextLine());
        if(pts > 100){
            System.out.println("Incredible!");
        } else if (pts >= 90){
            System.out.println("5");
        } else if (pts >= 80){
            System.out.println("4");
        } else if (pts >= 70){
            System.out.println("3");
        } else if (pts >= 60){
            System.out.println("2");
        } else if (pts >= 50){
            System.out.println("1");
        } else if (pts >= 0){
            System.out.println("failed");
        } else{
            System.out.println("Impossible!");
        }
    }
}