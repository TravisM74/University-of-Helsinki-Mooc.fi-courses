/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class Clock {
    private ClockHand milisec;
    private ClockHand seconds;
    
    public Clock(){
        this.milisec = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance(){
        this.milisec.advance();
        
        if (this.milisec.value() == 0) {
            this.seconds.advance();
        }
    }
    
    public String toString() {
        return seconds + ":" + milisec;
    }
}
