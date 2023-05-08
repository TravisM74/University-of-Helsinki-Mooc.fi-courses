

public class Checker {
    
    
    public boolean isDayOfWeek(String string){
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")){
            return true;
        }
        
        return false;
    }public boolean allVowels(String string){
        if (string.matches("[aeiou]+")){
            return true;
        }
        
        return false;
    }
    public boolean timeOfDay(String string){
        if (string.matches("[0-2][0-9]:[0-5][0-9]:[0-5][0-9]")){
            String[] parts= string.split(":");
            int check = Integer.valueOf(parts[0]);
            if ((check > 23)){
                return false;
            } else {
                return true;
            }
            
        }
        return false;
        
    }

}
