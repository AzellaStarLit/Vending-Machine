package models;

import java.util.ArrayList;

/**
 * This is the regular vending machine which sells drinks (Item Class) only.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class RegularVendingMachine {

    private ArrayList<Item> itemSlot;
    public Denomination machineBalance;
    private int machineSales = 0;
    private int totalCollectedMoney = 0;
    
    public RegularVendingMachine() {
        
        this.itemSlot = new ArrayList<>();
        this.machineBalance = new Denomination(10, 10, 10, 10, 10, 20, 30, 45, 100);
    }

    /**
     * This appends an item object to the arraylist
     * @param item is the parameter to be appended
     */
    public void addItem(Item item) {
        
        itemSlot.add(item);
    
    }

    /**
     * This decrements the stock of the item and increments the quantity sold.
     * It adds the value of the item price to the total machine sales of the machine
     * @param item is the parameter to be modified
     */
    public void dispenseItem(Item item) {
        if (item.getStock() > 0) {

            item.setStock(item.getStock() - 1);
            item.increaseQuantitySold();
            machineSales += item.getPrice(); 
            // System.out.println("Dispensing item: " + item.getName());
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
     * default number : 10
     * @param itemNumber is the assigned number of a specific item
     * @param quantity is the value to be set
     */
    public void restockItem(int itemNumber, int quantity) {

        //Check itemNumber if it is within the range.
        if (itemNumber >= 1 && itemNumber <= itemSlot.size()){
            itemSlot.get(itemNumber - 1).setStock(quantity);
        }
    }

    /**
     * Set the price of the item given its assigned number
     * @param itemNumber is the assigned number of the specific item
     * @param price is the value to be set
     */
    public void setItemPrice(int itemNumber, int price) {

        //Check itemNumber if it is within the range.
        if (itemNumber >= 1 && itemNumber <= itemSlot.size()) {
            itemSlot.get(itemNumber - 1).setPrice(price);
        }
    }

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
     * Get the sum of the denominations of the vending machine
     * @return sum value
     */
    public int getTotalBalance()
    {
        return machineBalance.getTotal();
    }

    /**
     * Display the transaction history of the vending machine
     * Note: The text-based outputs are for debugging purposes
     */
    public void displayTransactions() {
        System.out.println("Summary of Transactions");
        System.out.println("-------------------");

        // Display starting inventory
        System.out.println("Inventory:");
        for (Item item : itemSlot) {
            int startingStock = item.getStock() + item.getQuantitySold();
            int endingStock = item.getStock();
            System.out.println(item.getName() + " [Start: " + startingStock + "]" + " [End: " + endingStock + "]");
        }
        System.out.println();

        // Display transactions
        System.out.println("Transactions:");
        for (Item item : itemSlot) {
            int quantitySold = item.getQuantitySold();
            System.out.println(item.getName() + " [Sold: " + quantitySold + "]");
        }
        System.out.println();

        // Display total amount collected
        System.out.println("Total Amount Collected: " + totalCollectedMoney);
    }

    /**
     * Get the ArrayList of the items
     * @return ArrayList of ItemSlot
     */
    public ArrayList<Item> getItemSlot() {
        return this.itemSlot;
    }
}