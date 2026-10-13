
public class DanceShoes extends Product {

    private double shoeSize;

    /*
     * This makes dance shoes with
     * starting values.
     */
    public DanceShoes() {
        super();
        shoeSize = 0.0;
    }

    /*
     * This makes dance shoes using
     * a name, price, and shoe size.
     */
    public DanceShoes(String name, double price, double shoeSize) {
        super(name, price);
        this.shoeSize = shoeSize;
    }

    /*
     * This makes dance shoes using
     * all the information about them.
     */
    public DanceShoes(String name, double price, int stock, double shoeSize) {
        super(name, price, stock);
        this.shoeSize = shoeSize;
    }

    /*
     * This gets the shoe size.
     */
    public double getShoeSize() {
        return shoeSize;
    }

    /*
     * This changes the shoe size.
     */
    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }

    /*
     * This prints the product information
     * and adds the shoe size.
     */
    public String toString() {
        return super.toString() +
               ", Shoe Size: " + shoeSize;
    }
}
