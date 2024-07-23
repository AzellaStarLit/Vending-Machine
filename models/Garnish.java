package models;

/**
 * This class is for the garnish items of the special vending machine. It cannot be sold separately.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class Garnish {

    private String name;
    private int price;
    private int calories;
    private int stock;
    private int quantitySold;
    private String image;

    public Garnish(String name, int price, int calories, int stock, String image) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.stock = stock;
        this.image = image;
        this.quantitySold = 0;
    }

    //Getters

    /**
     * Get name of garnish
     * @return string item garnish
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get price of garnish
     * @return int garnish price
     */
    public int getPrice() {
        return this.price;
    }

    /**
     * Get calories of garnish
     * @return int garnish calories content
     */
    public int getCalories() {
        return this.calories;
    }

    /**
     * Get stock of garnish
     * @return int current available garnishes
     */
    public int getStock() {
        return this.stock;
    }

    /**
     * Get image of garnish
     * @return string name of image file
     */
    public String getImage() {
        return this.image;
    }

    /**
     * Get number of garnishes sold
     * @return int quantity
     */
    public int getQuantitySold() {
        return this.quantitySold;
    }

    //Setters

    /**
     * Change value of garnish stock
     * @param newStock new value
     * @return int new value
     */
    public int setStock(int newStock)
    {
        return this.stock = newStock;
    }

    /**
     * Change value of garnish price
     * @param newPrice new value
     * @return int new value
     */
    public int setPrice(int newPrice)
    {
        return this.price = newPrice;
    }

    /**
     * Increment the number of garnish sold
     */
    public void increaseQuantitySold() {
        this.quantitySold++;
    }
}
