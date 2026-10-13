
import java.util.Scanner;

public class StoreRunner {
    public static void main(String[] args) {

        // Creates a Scanner object
        Scanner input = new Scanner(System.in);

        /*
         * This makes different products
         * that are sold at the dance store.
         */
        Product product1 = new Product();
        Product product2 = new Product("Gift Card", 25.0);
        Product product3 = new Product("Water Bottle", 12.0, 15);

        /*
         * This makes different types of
         * dance shoes with different sizes.
         */
        DanceShoes shoes1 = new DanceShoes();
        DanceShoes shoes2 = new DanceShoes("Ballet Slippers", 28.0, 7.5);
        DanceShoes shoes3 = new DanceShoes("Jazz Shoes", 45.0, 8, 8.0);

        /*
         * This makes different dance clothes
         * that customers can buy.
         */
        DanceClothing clothing1 = new DanceClothing();
        DanceClothing clothing2 = new DanceClothing("Dance Tights", 16.0, "M");
        DanceClothing clothing3 = new DanceClothing("Leotard", 38.0, 10, "S");

        /*
         * This changes some of the product
         * information using setter methods.
         */
        shoes2.setStock(6);
        shoes2.setShoeSize(8.0);

        clothing2.setStock(12);
        clothing2.setClothingSize("L");

        product2.setName("Dance Store Gift Card");
        product3.setPrice(10.0);

        /*
         * This prints all the products
         * that are in the dance store.
         */
        System.out.println("WELCOME TO THE DANCE STORE!");
        System.out.println();

        System.out.println("REGULAR PRODUCTS:");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        System.out.println();

        System.out.println("DANCE SHOES:");
        System.out.println(shoes1);
        System.out.println(shoes2);
        System.out.println(shoes3);

        System.out.println();

        System.out.println("DANCE CLOTHING:");
        System.out.println(clothing1);
        System.out.println(clothing2);
        System.out.println(clothing3);

        /*
         * This asks how many leotards
         * the customer wants to buy.
         */
        System.out.println();
        System.out.println("How many leotards do you want?");
        int amount = input.nextInt();

        /*
         * This checks if the store has
         * enough leotards for the customer.
         */
        if (amount > 0 && amount <= clothing3.getStock()) {

            double total = clothing3.getPrice() * amount;

            clothing3.setStock(clothing3.getStock() - amount);

            System.out.println("Your total is: $" + total);
            System.out.println("Thank you for shopping!");

        } else {
            System.out.println("Sorry, we cannot complete your order.");
        }

        /*
         * This shows how many leotards
         * are left after the order.
         */
        System.out.println();
        System.out.println("UPDATED LEOTARD STOCK:");
        System.out.println(clothing3);

        // Closes the Scanner object
        input.close();
    }
}
