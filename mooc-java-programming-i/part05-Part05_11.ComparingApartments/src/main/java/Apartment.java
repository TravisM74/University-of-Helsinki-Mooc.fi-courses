
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared){
        return (this.squares > compared.squares);
           
        
    }
    public int priceDifference(Apartment compared){
        int thisPrice = squares * princePerSquare;
        int comparedPrice = compared.squares * compared.princePerSquare;
        int value = thisPrice - comparedPrice;
        if (value < 0) {
            value = value * -1;
        }
        return value;
    }
    public boolean moreExpensiveThan(Apartment compared){
        int thisPrice = squares * princePerSquare;
        int comparedPrice = compared.squares * compared.princePerSquare;
        return (thisPrice > comparedPrice);
    }

}
