package models;

/**
 * This is the item class for both regular and special vending machines.
 * This is purely used for the drinks of the machines
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class Item {

    private String name;
    private int price;
    private int calories;
    private int stock;
    private int quantitySold;
    private String image;

    public Item(String name, int price, int calories, int stock, String image) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.stock = stock;
        this.image = image;
        this.quantitySold = 0;
    }

    //Getters

    /**
     * Get name of item
     * @return string name of item
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get price of item
     * @return int item price
     */
    public int getPrice() {
        return this.price;
    }

    /**
     * Get item calories content
     * @return int calories
     */
    public int getCalories() {
        return this.calories;
    }

    /**
     * Get current stock of item
     * @return int number of items available
     */
    public int getStock() {
        return this.stock;
    }

    /**
     * Get name of image
     * @return string image name
     */
    public String getImage() {
        return this.image;
    }

    /**
     * Get number of items sold
     * @return int items sold
     */
    public int getQuantitySold() {
        return this.quantitySold;
    }

    //Setters
    /**
     * Change value of item stock
     * @param newStock new value
     * @return int new value
     */
    public int setStock(int newStock)
    {
        return this.stock = newStock;
    }

    /**
     * Change value of item price
     * @param newPrice new value
     * @return int new value
     */
    public int setPrice(int newPrice)
    {
        return this.price = newPrice;
    }

    /**
     * Increment the number of items sold
     */
    public void increaseQuantitySold() {
        this.quantitySold++;
    }
}