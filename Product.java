
public class Product {

    private String name;
    private double price;
    private int stock;

    /*
     * This makes a product with
     * starting values if nothing is given.
     */
    public Product() {
        name = "Unknown Product";
        price = 0.0;
        stock = 0;
    }

    /*
     * This makes a product using
     * its name and price.
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        stock = 0;
    }

    /*
     * This makes a product using
     * its name, price, and stock.
     */
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    /*
     * This gets the name of the product.
     */
    public String getName() {
        return name;
    }

    /*
     * This changes the name of the product.
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * This gets the price of the product.
     */
    public double getPrice() {
        return price;
    }

    /*
     * This changes the price of the product.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /*
     * This gets how many products are in stock.
     */
    public int getStock() {
        return stock;
    }

    /*
     * This changes how many products are in stock.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /*
     * This puts the product information
     * together so it can be printed.
     */
    public String toString() {
        return "Name: " + name +
               ", Price: $" + price +
               ", Stock: " + stock;
    }
}
