/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *public Timer() creates a new timer.
public String toString() returns a string representation of the timer. The string representation should be in the form "seconds: hundredths of a second", where both the seconds and the hundredths of a second are represented by two numbers. For example, "19:83" would represent the time 19 seconds, 83 hundredths of a second.
public void advance() moves the timer forward by a hundredth of a second.
 * @author Korisnik
 */
public class Timer {
    ClockHand secondHundredths;
    ClockHand seconds;
    
    public Timer(){
        this.seconds = new ClockHand(60);
        this.secondHundredths = new ClockHand(100);
    }
    
    public void advance(){
        secondHundredths.advance();
        if(secondHundredths.value() == 0){
            this.seconds.advance();
        }
    }
    
    @Override
    public String toString(){
        return seconds+":"+secondHundredths;
    }
}
