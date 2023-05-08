
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Implement the random number generation here
        // the method containsNumber is probably useful Random rand = new Random();
        Random rand = new Random();
        numbers.clear();
        for(int i = 0 ; i < 7; i++){
            int ball = rand.nextInt(40)+1;
            if (numbers.contains(ball)){
                i--;
            } else {
                numbers.add(ball);
            }
            
        }
        
        
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if (this.numbers.contains(number)){
            return true;
        }
        return false;
    }
}

