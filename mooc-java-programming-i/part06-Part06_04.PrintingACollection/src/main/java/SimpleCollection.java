
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    public String toString(){
        String message = "";
        if (elements.isEmpty()){
            return "The collection "+ name+ " is empty.";
        }           
        message = "The collection "+name+" has "+elements.size();
        if (elements.size() == 1) {
            message = message + " element:\n" +elements.get(0);
        } else {
            message = message + " elements:"+"\n";
            for (int i = 0; i < elements.size() ; i++){
                message = message + elements.get(i)+ "\n" ;
            }
        }
        return message;
    }
}
