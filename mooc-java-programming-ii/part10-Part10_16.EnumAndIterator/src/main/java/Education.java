/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public enum Education {
   PHD("Doctoral degree"),
   MA("Master degree"),
   BA("Bachelors degree"),
   HS("High School diploma");
    
   private String code;
   
   private Education(String code){
       this.code = code;
   }
   
   public String getCode(){
       return this.code;
   }
}
