package controllers;

import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import views.CreateFrame;
import views.MenuFrame;
import views.SuccessFrame;
import models.RegularVendingMachine;
import models.SpecialVendingMachine;
import models.Item;
import models.Spirit;
import models.Garnish;

/**
 * This is the controller for the create menu of the program.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class CreateController {

    private CreateFrame createFrame;
    private MenuFrame menuFrame;
    private static RegularVendingMachine regularVendingMachine = null;
    private static SpecialVendingMachine specialVendingMachine = null;
    public static int machine = 0;

    public CreateController(CreateFrame createFrame, MenuFrame menuFrame) {
        this.createFrame = createFrame;
        this.menuFrame = menuFrame;

        // Create Action Listeners
        this.createFrame.getRegularButton().addActionListener(new RegularButtonListener());
        this.createFrame.getSpecialButton().addActionListener(new SpecialButtonListener());
        this.createFrame.getBackButton().addActionListener(new BackButtonListener());

    }

    // Create: Regular Button

    /**
     * This is the listener for when the regular vending machine button is clicked
     */
    private class RegularButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            machine = 1;
            // Create a new RegularVendingMachine instance and add items to it
            regularVendingMachine = new RegularVendingMachine();
            regularVendingMachine.addItem(new Item("Coke", 50, 150, 5, "selectedCoke"));
            regularVendingMachine.addItem(new Item("Sprite", 60, 200, 8, "selectedSprite"));
            regularVendingMachine.addItem(new Item("Royal", 70, 250, 7, "selectedRoyal"));
            regularVendingMachine.addItem(new Item("Mountain Dew", 80, 150, 6, "selectedMD"));
            regularVendingMachine.addItem(new Item("Fanta", 90, 200, 5, "selectedFanta"));
            regularVendingMachine.addItem(new Item("Tonic Water", 100, 250, 4, "selectedSchweppes"));
            regularVendingMachine.addItem(new Item("Red Bull", 110, 150, 3, "selectedRB"));
            regularVendingMachine.addItem(new Item("Ginger Ale", 120, 200, 2, "selectedCD"));

            SwingUtilities.invokeLater(() -> {
            menuFrame.setMachineCreated(1);
            SuccessFrame successFrame = new SuccessFrame();
            SuccessController successController = new SuccessController(successFrame, menuFrame);
            successController.showSuccessFrame();
            createFrame.dispose();
            });
        }
    }

    // Create: Special Button

    /**
     * This is the listener for when the special vending machine button is clicked
     */
    private class SpecialButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            machine = 2;
            // Create a new SpecialVendingMachine instance and add items to it
            specialVendingMachine = new SpecialVendingMachine();
            specialVendingMachine.addItem(new Item("Coke", 50, 150, 9, "selectedCoke"));
            specialVendingMachine.addItem(new Item("Sprite", 60, 200, 8, "selectedSprite"));
            specialVendingMachine.addItem(new Item("Royal", 70, 250, 7, "selectedRoyal"));
            specialVendingMachine.addItem(new Item("Mountain Dew", 80, 150, 6, "selectedMD"));
            specialVendingMachine.addItem(new Item("Fanta", 90, 200, 5, "selectedFanta"));
            specialVendingMachine.addItem(new Item("Tonic Water", 100, 250, 4, "selectedSchweppes"));
            specialVendingMachine.addItem(new Item("Red Bull", 110, 150, 3, "selectedRB"));
            specialVendingMachine.addItem(new Item("Ginger Ale", 120, 200, 2, "selectedCD"));
            
            specialVendingMachine.addSpirit(new Spirit("Vodka", 130, 150, 9, "selectedCoke"));
            specialVendingMachine.addSpirit(new Spirit("Gin", 140, 200, 8, "selectedSprite"));
            specialVendingMachine.addSpirit(new Spirit("Whiskey", 150, 250, 7, "selectedRoyal"));
            specialVendingMachine.addSpirit(new Spirit("Tequila", 160, 150, 6, "selectedMD"));
            
            specialVendingMachine.addGarnish(new Garnish("Olives", 20, 200, 5, "selectedFanta"));
            specialVendingMachine.addGarnish(new Garnish("Cherries", 30, 250, 4, "selectedSchweppes"));
            specialVendingMachine.addGarnish(new Garnish("Lemon Slice", 40, 150, 3, "selectedRB"));
            specialVendingMachine.addGarnish(new Garnish("Orange Slice", 50, 200, 2, "selectedCD"));
            
            SwingUtilities.invokeLater(() -> {
            menuFrame.setMachineCreated(2);
            SuccessFrame successFrame = new SuccessFrame();
            SuccessController successController = new SuccessController(successFrame, menuFrame);
            successController.showSuccessFrame();
            createFrame.dispose();
            });
        }
    }

    // Create: Back Button

    /**
     * This is the listener for when the back button is clicked
     */
    private class BackButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            createFrame.dispose();
        }
    }

    /**
     * This calls the instance of the regular vending machine
     * @return regularVendingMachine
     */
    public static RegularVendingMachine getRegularVendingMachineInstance() {
        return regularVendingMachine;
    }

    /**
     * This calls the instance of the special vending machine
     * @return specialVendingMachine
     */
    public static SpecialVendingMachine getSpecialVendingMachineInstance() {
        return specialVendingMachine;
    }

    public static int getMachine() {
        return machine;
    }
}
