package models;


import java.util.ArrayList;

/**
 * This class is the special vending machine which dispenses the drinks (item) and
 * is capable of combining up to three items into one. In this vending machine,
 * the finished product will be a cocktail. It is composed of the drink, spirit, and
 * garnish. The drink can only be one while the spirit and garnish can be multiple as
 * long as there is stock.
 */
public class SpecialVendingMachine {

    private ArrayList<Item> itemSlot;
    private ArrayList<Spirit> spiritSlot;
    private ArrayList<Garnish> garnishSlot;

    public Denomination machineBalance;
    private int machineSales = 0;
    private int totalCollectedMoney = 0;
    
    public SpecialVendingMachine() {
        
        this.itemSlot = new ArrayList<>();
        this.spiritSlot = new ArrayList<>();
        this.garnishSlot = new ArrayList<>();

        this.machineBalance = new Denomination(10, 10, 10, 10, 10, 20, 30, 45, 100);
    }

    /**
     * This appends an item (drink) object to the arraylist
     * @param item parameter to be added
     */
    public void addItem(Item item) {
        
        itemSlot.add(item);
    
    }

    /**
     * This appends a spirit object to the arraylist
     * @param spirit parameter to be added
     */
    public void addSpirit(Spirit spirit) {
        
        spiritSlot.add(spirit);
    
    }

    /**
     * This appends a garnish object to the arraylist
     * @param garnish parameter to be added
     */
    public void addGarnish(Garnish garnish) {
        
        garnishSlot.add(garnish);
    
    }

    /**
     * This decrements the stock of the item and increments the quantity sold.
     * It adds the value of the item price to the total machine sales of the machine
     * @param item parameter to be modified
     */
    public void dispenseItem(Item item) {
        if (item.getStock() > 0) {
            item.setStock(item.getStock() - 1);
            item.increaseQuantitySold();
            machineSales += item.getPrice(); // Update machineSales with item price
        } 
    }

    /**
     * This decrements the stock of the spirit item and increments the quantity sold.
     * It adds the value of the spirit item price to the total machine sales of the machine
     * @param spirit parameter to be modified
     */
    public void dispenseSpirit(Spirit spirit) {
        if (spirit.getStock() > 0) {
            spirit.setStock(spirit.getStock() - 1);
            spirit.increaseQuantitySold();
            machineSales += spirit.getPrice(); // Update machineSales with item price
        } 
    }

    /**
     * This decrements the stock of the garnish item and increments the quantity sold.
     * It adds the value of the garnish item price to the total machine sales of the machine
     * @param garnish
     */
    public void dispenseGarnish(Garnish garnish) {
        if (garnish.getStock() > 0) {
            garnish.setStock(garnish.getStock() - 1);
            garnish.increaseQuantitySold();
            machineSales += garnish.getPrice(); // Update machineSales with item price
        } 
    }

    /**
     * This subtracts the denomination of the machine from top-bottom (thousand-one)
     * @param thousand to be subtracted
     * @param fiveHundred to be subtracted
     * @param twoHundred to be subtracted
     * @param hundred to be subtracted
     * @param fifty to be subtracted
     * @param twenty to be subtracted
     * @param ten to be subtracted
     * @param five to be subtracted
     * @param one to be subtracted
     */
    public void produceChange(int thousand, int fiveHundred, int twoHundred, int hundred, int fifty,
    int twenty, int ten, int five, int one)
    {
        machineBalance.subtractDenomination(thousand, fiveHundred, twoHundred, hundred, fifty, twenty, ten, five, one);
    }

    /**
     * This sets the value of the item stock to a certain number
     * default number is : 10
     * @param itemNumber is the assigned number of the specific item
     * @param quantity is the value to be set
     */
    public void restockItem(int itemNumber, int quantity) {
        
        if (itemNumber >= 1 && itemNumber <= itemSlot.size()){
            itemSlot.get(itemNumber - 1).setStock(quantity);
        }
    }

    /**
     * This sets the value of the spirit item stock to a certain number
     * default number is : 10
     * @param spiritNumber is the assigned number of the specific spirit item
     * @param quantity is the value to be set
     */
    public void restockSpirit(int spiritNumber, int quantity) {
        
        if (spiritNumber >= 1 && spiritNumber <= spiritSlot.size()){
            spiritSlot.get(spiritNumber - 1).setStock(quantity);
        }
    }

    /**
     * This sets the value of the garnish item stock to a certain number
     * default number is : 10
     * @param garnishNumber is the assigned number of the specific garnish item
     * @param quantity is the value to be set
     */
    public void restockGarnish(int garnishNumber, int quantity) {
        
        if (garnishNumber >= 1 && garnishNumber <= garnishSlot.size()){
            garnishSlot.get(garnishNumber - 1).setStock(quantity);
        }
    }

    //Setters

    /**
     * Set the price of the item given its assigned number
     * @param itemNumber is the assigned number of the specific item
     * @param price is the value to be set
     */
    public void setItemPrice(int itemNumber, int price) {
        if (itemNumber >= 1 && itemNumber <= itemSlot.size()) {

            itemSlot.get(itemNumber - 1).setPrice(price);
        } 
    }

    /**
     * Set the price of the spirit item given its assigned number
     * @param spiritNumber is the assigned number of the specific spirit item
     * @param price is the value to be set
     */
    public void setSpiritPrice(int spiritNumber, int price) {
        if (spiritNumber >= 1 && spiritNumber <= spiritSlot.size()) {

            spiritSlot.get(spiritNumber - 1).setPrice(price);
        } 
    }

    /**
     * Set the price of the garnish item given its assigned number
     * @param garnishNumber is the assigned number of the specific garnish item
     * @param price is the value to be set
     */
    public void setGarnishPrice(int garnishNumber, int price) {
        if (garnishNumber >= 1 && garnishNumber <= garnishSlot.size()) {

            garnishSlot.get(garnishNumber - 1).setPrice(price);
        } 
    }

    // Getters

    /**
     * This "collects" the money from the vending machine.
     * The variable's value is set to 0 afterwards.
     * The value will then be transferred to totalCollectedMoney
     * which will be used for the transaction history of the machine.
     * @return int value of the total money collected in a cycle
     */
    public int collectMoney() {
        int collectedMoney = machineSales;
        totalCollectedMoney += machineSales;
        machineSales = 0;
        return collectedMoney;
    }

    /**
     * Get value of totalCollectedMoney
     * @return value of variable
     */
    public int totalCollectedMoney() {
        return totalCollectedMoney;
    }

    /**
     * This adds a value to each denomination of the vending machine.
     * @param thousand to be added
     * @param fiveHundred to be added
     * @param twoHundred to be added
     * @param hundred to be added
     * @param fifty to be added
     * @param twenty to be added
     * @param ten to be added
     * @param five to be added
     * @param one to be added
     */
    public void replenishMoney(int thousand, int fiveHundred, int twoHundred, int hundred, int fifty,
    int twenty, int ten, int five, int one) {
        
        machineBalance.addDenomination(thousand, fiveHundred, twoHundred, hundred, fifty, twenty, ten, five, one);
    }

    /**
     * get the sum of the denominations of the vending machine
     * @return sum value
     */
    public int getTotalBalance()
    {
        return machineBalance.getTotal();
    }

    /**
     * Get the ArrayList of the items
     * @return ArrayList of ItemSlot
     */
    public ArrayList<Item> getItemSlot() {
        return this.itemSlot;
    }

    /**
     * Get the ArrayList of the spirit
     * @return ArrayList of spiritSlot
     */
    public ArrayList<Spirit> getSpiritSlot() {
        return this.spiritSlot;
    }

    /**
     * Get the ArrayList of the spirit
     * @return ArrayList of garnishSlot
     */
    public ArrayList<Garnish> getGarnishSlot() {
        return this.garnishSlot;
    }
}