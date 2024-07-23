package controllers;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.SpecialVendingFrame;
import views.SpiritFrame;
import views.GarnishFrame;
import views.SpecialPaymentFrame;
import models.Item;
import models.Spirit;
import models.Garnish;
import models.SpecialVendingMachine;
import controllers.SpiritController;
import controllers.GarnishController;

/**
 * This is the controller for the item section of the vending menu of a special vending machine.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class SpecialVendingController {

    private SpecialVendingFrame specialVendingFrame;
    ArrayList<Item> selectedItems = new ArrayList<>();
    ArrayList<Spirit> selectedSpirits = new ArrayList<>();
    ArrayList<Garnish> selectedGarnishes = new ArrayList<>();
    int total, spiritTotal = 0, garnishTotal = 0;

    public SpecialVendingController(SpecialVendingFrame specialVendingFrame, ArrayList<Spirit> selectedSpirits, ArrayList<Garnish> selectedGarnishes) {
        this.specialVendingFrame = specialVendingFrame;
        this.selectedSpirits = selectedSpirits;
        this.selectedGarnishes = selectedGarnishes;

        // Action Listeners
        this.specialVendingFrame.getCokeAdd().addActionListener(new ItemBtnListener(1));
        this.specialVendingFrame.getSpriteAdd().addActionListener(new ItemBtnListener(2));
        this.specialVendingFrame.getMountainDewAdd().addActionListener(new ItemBtnListener(3));
        this.specialVendingFrame.getRoyalAdd().addActionListener(new ItemBtnListener(4));
        this.specialVendingFrame.getFantaAdd().addActionListener(new ItemBtnListener(5));
        this.specialVendingFrame.getSchweppesAdd().addActionListener(new ItemBtnListener(6));
        this.specialVendingFrame.getRedBullAdd().addActionListener(new ItemBtnListener(7));
        this.specialVendingFrame.getCanadaDryAdd().addActionListener(new ItemBtnListener(8));
        this.specialVendingFrame.getBackButton().addActionListener(new BackButtonListener());
        this.specialVendingFrame.getProceedButton().addActionListener(new ProceedButtonListener());
        this.specialVendingFrame.getRightButton().addActionListener(new RightButtonListener());
    }

    // Item Button Listener

    /**
     * This is the listener for when an add to cart button is clicked.
     * It determines which button was clicked through a number assigned to items.
     * Only one drink can be selected, so it replaces the previous item if repeated.
     * It also checks if the item has stock and if the machine has insufficient change.
     */
    private class ItemBtnListener implements ActionListener {
        private int itemChoice;

        public ItemBtnListener(int itemChoice) {
            this.itemChoice = itemChoice;
        }

        public void actionPerformed(ActionEvent e) {

            boolean drinkAdded = false;

            if (drinkAdded == false) {
                SpecialVendingMachine vendingMachine = CreateController.getSpecialVendingMachineInstance();
                ArrayList<Item> items = vendingMachine.getItemSlot();
                if (itemChoice <= items.size()) {
                    Item selected = items.get(itemChoice - 1);

                    if (selected.getStock() > 0) {

                        if (vendingMachine.machineBalance.getTotal() > selected.getPrice()) {
                            selectedItems.add(selected);
                            System.out.println("Item added to cart: " + selected.getName());
                            System.out.println("There are " + selected.getCalories() + " calories in this item.");
                        }

                        else {

                            JOptionPane.showMessageDialog(specialVendingFrame, "Machine out of balance.",
                                    "Vending Machine", JOptionPane.ERROR_MESSAGE);
                        }
                    }

                    else {

                        JOptionPane.showMessageDialog(specialVendingFrame, "Item is out of stock.", "Vending Machine",
                                JOptionPane.ERROR_MESSAGE);
                    }

                    drinkAdded = true;
                }

                else if (drinkAdded == true) {

                    if (itemChoice <= items.size()) {
                        Item selected = items.get(itemChoice - 1);

                        if (selected.getStock() > 0) {

                            if (vendingMachine.machineBalance.getTotal() > selected.getPrice()) {
                                selectedItems.set(0, selected);
                                System.out.println("Item added to cart: " + selected.getName());
                                System.out.println("There are " + selected.getCalories() + " calories in this item.");
                            }

                            else {

                                JOptionPane.showMessageDialog(specialVendingFrame, "Machine out of balance.",
                                        "Vending Machine", JOptionPane.ERROR_MESSAGE);
                            }
                        }

                        else {

                            JOptionPane.showMessageDialog(specialVendingFrame, "Item is out of stock.",
                                    "Vending Machine", JOptionPane.ERROR_MESSAGE);
                        }
                    }

                }

                else {
                    specialVendingFrame.dispose(); // Close the current window
                    SpiritFrame spiritFrame = new SpiritFrame();
                    SpiritController spiritController = new SpiritController(spiritFrame, selectedItems,
                            selectedGarnishes);
                    spiritFrame.init();
                }
            }

        }
    }

    // Back Button

    /**
     * This is the listener for when the back button is clicked.
     */
    private class BackButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            closeAllWindows();
        }
    }

    // Proceed Button

    /**
     * This is the listener for when the proceed to payment button is clicked.
     * It first calculates the total sum of all selected items.
     */
    private class ProceedButtonListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < selectedSpirits.size() - 1; i++){

                spiritTotal += selectedSpirits.get(i).getPrice();
            }

            for (int i = 0; i < selectedGarnishes.size() - 1; i++){

                garnishTotal += selectedGarnishes.get(i).getPrice();
            }

            total = selectedItems.get(0).getPrice() + spiritTotal + garnishTotal;

            specialVendingFrame.dispose(); // Close the current window
            SpecialPaymentFrame specialPaymentFrame = new SpecialPaymentFrame(selectedItems, total, selectedSpirits, selectedGarnishes);
            SpecialPaymentController specialPaymentController = new SpecialPaymentController(specialPaymentFrame);
            specialPaymentFrame.init();
        }
    }

    // Right Button

    /**
     * This is the listener for when the next section button is clicked.
     * Call spirit frame and controller if run
     */
    private class RightButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            specialVendingFrame.dispose(); // Close the current window
            SpiritFrame spiritFrame = new SpiritFrame();
            SpiritController spiritController = new SpiritController(spiritFrame, selectedItems, selectedGarnishes);
            spiritFrame.init();
        }
    }

    /**
     * Close Window
     */
    private void closeAllWindows() {
        // Close all windows here
        specialVendingFrame.dispose();
        // If needed, add code to dispose of other windows
    }

}
