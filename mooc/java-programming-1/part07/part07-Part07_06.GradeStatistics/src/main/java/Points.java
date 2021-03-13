
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Korisnik
 */
public class Points {
    private ArrayList<Integer> pointsPass;
    private ArrayList<Integer> pointsFail;
    
    public Points(){
        this.pointsPass = new ArrayList<>();
        this.pointsFail = new ArrayList<>();
    }
    
    public void add(int point){
        if(point >= 50 && point <= 100){
            this.pointsPass.add(point);
        } else if(point >= 0 && point < 50){
            this.pointsFail.add(point);
        }
    }
    
    public int sum(ArrayList<Integer> list){
        if(list.isEmpty()) return 0;
        int pointsTotal = 0;
        for(Integer p : list){
            pointsTotal += p;
        }
        return pointsTotal;
    }
    
    public double pointAvg(){
        int pointsTotal = sum(this.pointsPass) + sum(this.pointsFail);
        return 1.0 * pointsTotal / totalParticipants();
    }
    
    public double passing(){
        int pointsTotal = sum(this.pointsPass);
        if(pointsTotal == 0) return 0;
        return 1.0 * pointsTotal / this.pointsPass.size();
    }
    
    public int totalParticipants(){
        return this.pointsFail.size() + this.pointsPass.size();
    }
    
    public double passPercentage(){
        return 1.0 * 100 * this.pointsPass.size() / totalParticipants();
    }
    
    public void gradeDist(){
        System.out.println("Grade distribution:");
        String fives = "5: " + printStars(90, 100);
        String fours = "4: " + printStars(80, 90);
        String threes = "3: " + printStars(70, 80);
        String twos = "2: " + printStars(60, 70);
        String ones = "1: " + printStars(50, 60);
        System.out.println(fives + "\n" + fours + "\n" + threes + "\n" + twos + "\n" + ones);
        
        String zero = "0: ";
        for(Integer p : this.pointsFail){
            zero += "*";
        }
        System.out.println(zero);
    }
    
    public String printStars(int from, int to){
        String stars = "";
        for(Integer point : this.pointsPass){
            if(point >= from && point < to){
                stars += "*";
            }
        }
        return stars;
    }
    
}
