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

    
    // GETTERS

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getCalories() {
        return this.calories;
    }

    public int getStock() {
        return this.stock;
    }

    public String getImage() {
        return this.image;
    }

    public int getQuantitySold() {
        return this.quantitySold;
    }

    public void increaseQuantitySold() {
        this.quantitySold++;
    }

    //SETTERS
    public String setName(String name){
        return this.name = name;
    }

    public int setStock(int newStock){
        return this.stock = newStock;
    }

    public int setPrice(int newPrice){
        return this.price = newPrice;
    }
    
    public int setCalories(int newCalories){
        return this.calories = newCalories;
    }

    public Item( ItemBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.calories = builder.calories;
        this.stock = builder.stock;
        this.image = builder.image;
        this.quantitySold = 0;
    }
    

    public static class ItemBuilder {
        private String name ;
        private int price;
        private int calories;
        private int stock;
        private String image;


        public ItemBuilder(String name) {
            this.name = name;
        }

        //SETTERS
        public ItemBuilder setName(String name){
            this.name = name;
            return this;
        }

        public ItemBuilder setStock(int newStock){   
            this.stock = newStock;
            return this;
        }

        public ItemBuilder setPrice(int newPrice){   
            this.price = newPrice;
            return this;
        }

        public ItemBuilder setCalories(int newCalories){
            this.calories = newCalories;
            return this;
        }

        public ItemBuilder setImage(String image) {
            this.image = image;
            return this;
        }

        public Item build(){
            return new Item(this);
        }

    }
    
}