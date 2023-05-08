/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Travis
 */

public class SaveableDictionary {
    private Map<String, String>dictionary; 
    private String file;

    public SaveableDictionary(String file){
        this.file = file;
        this.dictionary = new HashMap<>();
    }
    
    public boolean load(){
        try(Scanner fileReader = new Scanner(Paths.get(this.file))){
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // split the line based on the ':' character
                //System.out.println(parts[0]+":"+parts[1]);
                dictionary.put(parts[0],parts[1]);
            }
        } catch (Exception e) {
            System.out.println("Error " +e.getMessage());
            return false;
        }
        return true;
    }
    
    public boolean save(){
        
        try {
            FileWriter writer = new FileWriter(this.file,false);
            for (String kWord:dictionary.keySet()){
                //System.out.println(kWord+":"+dictionary.get(kWord));
                writer.write(kWord+":"+dictionary.get(kWord)+"\n");
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Error :"+e.getMessage());
            return false;
        }
        return true;
    }
    
    public void add(String words, String translation){
        if (!dictionary.containsKey(words)){
            dictionary.put(words, translation);
        }
        
    }
    public String translate(String word){
        if(dictionary.containsKey(word)){
            return dictionary.get(word);
        }
        if(dictionary.containsValue(word)){
            for(String keyWord:dictionary.keySet()){
                if (word.equals(dictionary.get(keyWord))){
                    return keyWord;
                }
            }
        }
        return null;
        
    }
    
    public void delete(String word){
        if(dictionary.containsKey(word)){
            dictionary.remove(word);
        }
        // define the Object of the HashMap when using hashmap instead of own object
        // practice more Iterators
        Iterator<Map.Entry<String,String>> iterator = dictionary.entrySet().iterator();
        while(iterator.hasNext()){
            //use the Object
            Map.Entry<String,String> iWord=iterator.next();
            
            if(word.equals(iWord.getValue())){
                iterator.remove();
            }
        }
    }
}
