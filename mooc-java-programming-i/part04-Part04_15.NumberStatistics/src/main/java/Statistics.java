
public class Statistics {
    private int total ;
    private int count;
    
        
    public Statistics(){
        this.total = 0;
        this.count = 0;
    }
    
    public void addNumber(int number){
        this.total = this.total + number;
        this.count++;
    }
    public double average(){
        if (this.count <= 1){
            return this.total;
        } else {        
            return 1.0 * this.total / this.count;
        }
    }
    
    public int getCount(){
        return this.count;
    }
    
    public int sum(){
        return this.total; 
    }
}
