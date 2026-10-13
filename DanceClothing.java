
public class DanceClothing extends Product {

    private String clothingSize;

    /*
     * This makes dance clothing with
     * starting values.
     */
    public DanceClothing() {
        super();
        clothingSize = "Unknown";
    }

    /*
     * This makes dance clothing using
     * a name, price, and clothing size.
     */
    public DanceClothing(String name, double price, String clothingSize) {
        super(name, price);
        this.clothingSize = clothingSize;
    }

    /*
     * This makes dance clothing using
     * all the information about it.
     */
    public DanceClothing(String name, double price, int stock, String clothingSize) {
        super(name, price, stock);
        this.clothingSize = clothingSize;
    }

    /*
     * This gets the clothing size.
     */
    public String getClothingSize() {
        return clothingSize;
    }

    /*
     * This changes the clothing size.
     */
    public void setClothingSize(String clothingSize) {
        this.clothingSize = clothingSize;
    }

    /*
     * This prints the product information
     * and adds the clothing size.
     */
    public String toString() {
        return super.toString() +
               ", Clothing Size: " + clothingSize;
    }
}
