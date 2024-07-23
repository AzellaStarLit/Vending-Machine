package controllers;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.RegularVendingFrame;
import views.SelectedFrame;
import models.Item;
import models.RegularVendingMachine;

/**
 * This is the controller for the vending feature of the regular vending machine.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class RegularVendingController {
    
    private RegularVendingFrame regularVendingFrame;
    ArrayList<Item> selectedItems = new ArrayList<>();

    public RegularVendingController(RegularVendingFrame regularVendingFrame) {
        this.regularVendingFrame = regularVendingFrame;

        // Action Listeners
        this.regularVendingFrame.getCokeBtn().addActionListener(new ItemBtnListener(1));
        this.regularVendingFrame.getSpriteBtn().addActionListener(new ItemBtnListener(2));
        this.regularVendingFrame.getMountainDewBtn().addActionListener(new ItemBtnListener(3));
        this.regularVendingFrame.getRoyalBtn().addActionListener(new ItemBtnListener(4));
        this.regularVendingFrame.getFantaBtn().addActionListener(new ItemBtnListener(5));
        this.regularVendingFrame.getSchweppesBtn().addActionListener(new ItemBtnListener(6));
        this.regularVendingFrame.getRedBullBtn().addActionListener(new ItemBtnListener(7));
        this.regularVendingFrame.getCanadaDryBtn().addActionListener(new ItemBtnListener(8));

        
        this.regularVendingFrame.getBackButton().addActionListener(new BackButtonListener());  
    }

    // Item Button Listener

    /**
     * This is the listener for when an add to cart button is clicked. It first
     * checks if there is stock and if the machine has enough change for the selected item.
     *
     */
    private class ItemBtnListener implements ActionListener {
        private int itemChoice;

        public ItemBtnListener(int itemChoice) {
            this.itemChoice = itemChoice;
        }

        public void actionPerformed(ActionEvent e) {
            RegularVendingMachine vendingMachine = CreateController.getRegularVendingMachineInstance();
            ArrayList<Item> items = vendingMachine.getItemSlot();
            if (itemChoice <= items.size()) {

                Item selected = items.get(itemChoice - 1);

                if (selected.getStock() > 0){

                    if (vendingMachine.machineBalance.getTotal() > selected.getPrice()){
                        selectedItems.add(selected);
                        System.out.println("Item added to cart: " + selected.getName());
                        System.out.println("There are " + selected.getCalories() + " calories in this item.");
                        regularVendingFrame.dispose();
                        SelectedFrame selectedFrame = new SelectedFrame(selected);
                        SelectedController selectedController = new SelectedController(selectedFrame, selected);
                        selectedFrame.init();
                    }
                    else{

                        JOptionPane.showMessageDialog(regularVendingFrame, "Machine out of balance.","Vending Machine",JOptionPane.ERROR_MESSAGE);
                    }
                }

                else{

                    JOptionPane.showMessageDialog(regularVendingFrame, "Item is out of stock.","Vending Machine",JOptionPane.ERROR_MESSAGE);
                    
                }
            } 
        }
    }

    // Back Button

    /**
     * This is the listener for when the back button is clicked.
     */
    private class BackButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            regularVendingFrame.dispose();
        }
    }
}  
