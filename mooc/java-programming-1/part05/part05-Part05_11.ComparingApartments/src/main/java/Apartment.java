
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
        int areaOne = this.rooms * this.squares;
        int areaTwo = compared.rooms * compared.squares;
        return areaOne > areaTwo;
    }

    public int priceDifference(Apartment compared){
        int priceOne = this.squares * this.princePerSquare;
        int priceTwo = compared.squares * compared.princePerSquare;
        return Math.abs(priceTwo - priceOne);
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int priceOne = this.squares * this.princePerSquare;
        int priceTwo = compared.squares * compared.princePerSquare;
        return priceOne >= priceTwo;
    }
}
