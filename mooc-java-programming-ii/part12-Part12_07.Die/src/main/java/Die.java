
import java.util.Random;

public class Die {

    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        this.random = new Random();
        // Initialize the value of numberOfFaces here
        this.numberOfFaces = numberOfFaces;
    }

    public int throwDie() {
        
        // generate a random number which may be any number
        // between one and the number of faces, and then return it
        this.random = new Random();
        int roll = this.random.nextInt(this.numberOfFaces)+1;
        
        return roll;
        
    }
}
