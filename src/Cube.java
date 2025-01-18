public class Cube {
    //properties
    private int side;

    //default constructor
    public Cube(){
        this.side = 1;
    }

    //setter
    public Cube(int side){
        setSide(side);
    }

    //getter
    public int getSide(){
        return side;
    }

    public void setSide(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        this.side = side;
    }

    //calculate surface area
    public int calculateSurfaceArea() {
        return 6 * side * side; // Surface area = 6 * side^2
    }

    // Method to calculate volume
    public int calculateVolume() {
        return side * side * side; // Volume = side^3
    }

    // toString method
    @Override
    public String toString() {
        return "Cube{side=" + side + "}";
    }

}
