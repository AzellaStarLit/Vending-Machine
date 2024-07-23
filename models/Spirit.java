package models;

/**
 *
 * This class is for the spirit items of the special vending machine. It cannot be sold separately.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class Spirit {

    private String name;
    private int price;
    private int calories;
    private int stock;
    private int quantitySold;
    private String image;

    public Spirit(String name, int price, int calories, int stock, String image) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.stock = stock;
        this.image = image;
        this.quantitySold = 0;
    }

    //Getters

    /**
     * Get name of spirit
     * @return string name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get price of spirit
     * @return string name
     */
    public int getPrice() {
        return this.price;
    }

    /**
     * Get calories of spirit
     * @return int spirit calories content
     */
    public int getCalories() {
        return this.calories;
    }

    /**
     * Get stock of spirit
     * @return int current available garnishes
     */
    public int getStock() {
        return this.stock;
    }

    /**
     * Get image of spirit
     * @return string name of image file
     */
    public String getImage() {
        return this.image;
    }

    /**
     * Get number of spirit items sold
     * @return int spirit items sold
     */
    public int getQuantitySold() {
        return this.quantitySold;
    }

    //Setters

    /**
     * Change value of spirit stock
     * @param newStock new value
     * @return int new value
     */
    public int setStock(int newStock)
    {
        return this.stock = newStock;
    }

    /**
     * Change value of spirit price
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
