/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class TripleTacoBox implements TacoBox{
    private int tacos;
    
    public TripleTacoBox(){
        this.tacos = 3;
        
    }
    public void eat(){
        if(tacos >= 1){
            this.tacos--;
        }
    }
    public int tacosRemaining(){
        return this.tacos;
    }
}
