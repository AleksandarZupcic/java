
import java.awt.GradientPaint;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Korisnik
 */
public class UserInterface {
    private Scanner scanner;
    private Points points;

    public UserInterface(Scanner scanner, Points points) {
        this.scanner = scanner;
        this.points = points;
    }
    
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        during();
        finish();
    }
    
    public void during(){
        int points;
        while(true){
            points = Integer.valueOf(this.scanner.nextLine());
            if(points == -1) break;
            this.points.add(points);
        }
    }
    
    public void finish(){
        pointAverageAll();
        pointAveragePassing();
        passPercentage();
        this.points.gradeDist();
    }
    
    public void pointAverageAll(){
        System.out.print("Point average (all): ");
        System.out.println(this.points.pointAvg());
    }
    
    public void pointAveragePassing(){
        System.out.print("Point average (passing): ");
        System.out.println(this.points.passing());
    }
    
    public void passPercentage(){
        System.out.print("Pass percentage: ");
        System.out.println(this.points.passPercentage());
    }
}
