/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
import java.util.*;

public class MessagingService {
    private ArrayList<Message> Message = new ArrayList<>();
    
    
    public MessagingService(){
        
        
    }
    public void add(Message message){
        
        if((message.getContent().length()) <= 280){
            this.Message.add(message);
        }
    }
    
    public ArrayList<Message> getMessages(){
        return this.Message;
    }
    
}
