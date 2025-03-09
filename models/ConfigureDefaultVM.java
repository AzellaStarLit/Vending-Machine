package models;

import java.util.Arrays;
import java.util.List;

public class ConfigureDefaultVM {
    public static List<Item> getDefaultItems() {
        return Arrays.asList(
            new Item.ItemBuilder("Coke")
                    .setPrice(50)
                    .setCalories(150)
                    .setStock(5)
                    .setImage("selectedCoke")
                    .build(),
                new Item.ItemBuilder("Sprite")
                    .setPrice(60)
                    .setCalories(250)
                    .setStock(8)
                    .setImage("selectedSprite")
                    .build(),
                new Item.ItemBuilder("Royal")
                    .setPrice(70)
                    .setCalories(250)
                    .setStock(7)
                    .setImage("selectedRoyal")
                    .build(),
                new Item.ItemBuilder("Mountain Dew")
                    .setPrice(80)
                    .setCalories(150)
                    .setStock(6)
                    .setImage("selectedMD")
                    .build(),
                new Item.ItemBuilder("Fanta")
                    .setPrice(90)
                    .setCalories(200)
                    .setStock(5)
                    .setImage("selectedFanta")
                    .build(),
                new Item.ItemBuilder("Tonic Water")
                    .setPrice(100)
                    .setCalories(250)
                    .setStock(4)
                    .setImage("selectedSchweppes")
                    .build(),
                new Item.ItemBuilder("Red Bull")
                    .setPrice(110)
                    .setCalories(150)
                    .setStock(3)
                    .setImage("selectedRB")
                    .build(),
                new Item.ItemBuilder("Ginger Ale")
                    .setPrice(120)
                    .setCalories(200)
                    .setStock(3)
                    .setImage("selectedRB")
                    .build()
        );
    }

    public static List<Spirit> getDefaultSpirits() {
        return Arrays.asList(
            new Spirit("Vodka", 130, 150, 9, "selectedCoke"),
            new Spirit("Gin", 140, 200, 8, "selectedSprite"),
            new Spirit("Whiskey", 150, 250, 7, "selectedRoyal"),
            new Spirit("Tequila", 160, 150, 6, "selectedMD")
        );
    }

    public static List<Garnish> getDefaultGarnishes() {
        return Arrays.asList(
            new Garnish("Olives", 20, 200, 5, "selectedFanta"),
            new Garnish("Cherries", 30, 250, 4, "selectedSchweppes"),
            new Garnish("Lemon Slice", 40, 150, 3, "selectedRB"),
            new Garnish("Orange Slice", 50, 200, 2, "selectedCD")
        );
    }

    public static void configureRegularMachine(RegularVendingMachine machine) {
        getDefaultItems().forEach(machine::addItem);
    }

    public static void configureSpecialMachine(SpecialVendingMachine machine) {
        getDefaultItems().forEach(machine::addItem);
        getDefaultSpirits().forEach(machine::addSpirit);
        getDefaultGarnishes().forEach(machine::addGarnish);
    }
}
