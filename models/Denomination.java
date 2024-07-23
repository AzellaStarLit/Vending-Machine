package models;

/**
 * This class is for the denomination of the vending machines (regular and special)
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class Denomination{

    private int thousand;
    private int fiveHundred;
    private int twoHundred;
    private int hundred;
    private int fifty;
    private int twenty;
    private int ten;
    private int five;
    private int one;


    public Denomination(int thousand, int fiveHundred, int twoHundred, int hundred, int fifty,
    int twenty, int ten, int five, int one){

        this.thousand = thousand;
        this.fiveHundred = fiveHundred;
        this.twoHundred = twoHundred;
        this.hundred = hundred;
        this.fifty = fifty;
        this.twenty = twenty;
        this.ten = ten;
        this.five = five;
        this.one = one;
    }

    //Getters

    /**
     * Get thousand value
     * @return int value of thousand
     */
    public int getThousand()
    {
        return this.thousand;
    }

    /**
     * Get five-hundred value
     * @return int value of fiveHundred
     */
    public int getFiveHundred()
    {
        return this.fiveHundred;
    }

    /**
     * Get two-hundred value
     * @return int value of twoHundred
     */
    public int getTwoHundred()
    {
        return this.twoHundred;
    }

    /**
     * Get hundred value
     * @return int value of hundred
     */
    public int getHundred()
    {
        return this.hundred;
    }

    /**
     * Get fifty value
     * @return int value of fifty
     */
    public int getFifty()
    {
        return this.fifty;
    }

    /**
     * Get twenty value
     * @return int value of twenty
     */
    public int getTwenty()
    {
        return this.twenty;
    }

    /**
     * Get ten value
     * @return int value of ten
     */
    public int getTen()
    {
        return this.ten;
    }

    /**
     * Get five value
     * @return int value of five
     */
    public int getFive()
    {
        return this.five;
    }

    /**
     * Get one value
     * @return int value of one
     */
    public int getOne()
    {
        return this.one;
    }

    //Setters

    /**
     * Change value of thousand
     * @param thousand to be changed
     * @return int new value
     */
    public int setThousand(int thousand)
    {
        return this.thousand = thousand;
    }

    /**
     * Change value of fiveHundred
     * @param fiveHundred to be changed
     * @return int new value
     */
    public int setFiveHundred(int fiveHundred)
    {
        return this.fiveHundred = fiveHundred;
    }

    /**
     * Change value of twoHundred
     * @param twoHundred to be changed
     * @return int new value
     */
    public int setTwoHundred(int twoHundred)
    {
        return this.twoHundred = twoHundred;
    }

    /**
     * Change value of hundred
     * @param hundred to be changed
     * @return int new value
     */
    public int setHundred(int hundred)
    {
        return this.hundred = hundred;
    }

    /**
     * Change value of fifty
     * @param fifty to be changed
     * @return int new value
     */
    public int setFifty(int fifty)
    {
        return this.fifty = fifty;
    }

    /**
     * Change value of twenty
     * @param twenty to be changed
     * @return int new value
     */
    public int setTwenty(int twenty)
    {
        return this.twenty = twenty;
    }

    /**
     * Change value of ten
     * @param ten to be changed
     * @return int new value
     */
    public int setTen(int ten)
    {
        return this.ten = ten;
    }

    /**
     * Change value of five
     * @param five to be changed
     * @return int new value
     */
    public int setFive(int five)
    {
        return this.five = five;
    }

    /**
     * Change value of one
     * @param one to be changed
     * @return int new value
     */
    public int setOne(int one)
    {
        return this.one = one;
    }

    /**
     * Get total of all denominations
     * @return int total value
     */
    public int getTotal()
    {   
        int nTotal;

        nTotal = (this.thousand * 1000) + (this.fiveHundred * 500) + (this.twoHundred * 200) +
        (this.hundred * 100) + (this.fifty * 50) + (this.twenty * 20) + (this.ten * 10) +
        (this.five * 5) + (this.one);
        
        return nTotal;
    }

    /**
     * Add value onto each denomination
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
    public void addDenomination(int thousand, int fiveHundred, int twoHundred, int hundred, int fifty,
    int twenty, int ten, int five, int one)
    {
        this.thousand += thousand;
        this.fiveHundred += fiveHundred;
        this.twoHundred += twoHundred;
        this.hundred += hundred;
        this.fifty += fifty;
        this.twenty += twenty;
        this.ten += ten;
        this.five += five;
        this.one += one;
    }

    /**
     * Subtract value from each denomination
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
    public void subtractDenomination(int thousand, int fiveHundred, int twoHundred, int hundred, int fifty,
    int twenty, int ten, int five, int one)
    {
        this.thousand -= thousand;
        this.fiveHundred -= fiveHundred;
        this.twoHundred -= twoHundred;
        this.hundred -= hundred;
        this.fifty -= fifty;
        this.twenty -= twenty;
        this.ten -= ten;
        this.five -= five;
        this.one -= one;
    }
    
}