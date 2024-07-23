package controllers;

import javax.swing.*;

import models.RegularVendingMachine;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.RestockFrame;

/**
 * This is the controller for the restock feature of a regular vending machine.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class RestockController {

    private RestockFrame restockFrame;
    
    public RestockController(RestockFrame restockFrame) {
        this.restockFrame = restockFrame;

        // Action Listeners
        this.restockFrame.getCokeRestockButton().addActionListener(new ItemBtnListener(1));
        this.restockFrame.getSpriteRestockButton().addActionListener(new ItemBtnListener(2));
        this.restockFrame.getMountainDewRestockButton().addActionListener(new ItemBtnListener(3));
        this.restockFrame.getRoyalRestockButton().addActionListener(new ItemBtnListener(4));
        this.restockFrame.getFantaRestockButton().addActionListener(new ItemBtnListener(5));
        this.restockFrame.getSchweppesRestockButton().addActionListener(new ItemBtnListener(6));
        this.restockFrame.getRedBullRestockButton().addActionListener(new ItemBtnListener(7));
        this.restockFrame.getCanadaDryRestockButton().addActionListener(new ItemBtnListener(8));
        this.restockFrame.getBackButton().addActionListener(new BackButtonListener());
    }

    // Item Button Listener

    /**
     * This is the listener for when a restock button is clicked. It determines which button is
     * clicked through its assigned number. And sets the new value of the item's stock afterwards.
     */
    private class ItemBtnListener implements ActionListener {
        private int itemChoice;

        public ItemBtnListener(int itemChoice) {
            this.itemChoice = itemChoice;
        }

        public void actionPerformed(ActionEvent e) {
            RegularVendingMachine vendingMachine = CreateController.getRegularVendingMachineInstance();
            vendingMachine.restockItem(itemChoice, 10);
            JOptionPane.showMessageDialog(restockFrame, "Successfully restocked","Vending Machine",JOptionPane.PLAIN_MESSAGE);
            // Update the quantity labels in the RestockFrame
            int newQuantity = vendingMachine.getItemSlot().get(itemChoice - 1).getStock();
            switch (itemChoice) {
                case 1:
                    restockFrame.setCokeQuantity(newQuantity);
                    break;
                case 2:
                    restockFrame.setSpriteQuantity(newQuantity);
                    break;
                case 3:
                    restockFrame.setMountainDewQuantity(newQuantity);
                    break;
                case 4:
                    restockFrame.setRoyalQuantity(newQuantity);
                    break;
                case 5:
                    restockFrame.setFantaQuantity(newQuantity);
                    break;
                case 6:
                    restockFrame.setSchweppesQuantity(newQuantity);
                    break;
                case 7:
                    restockFrame.setRedBullQuantity(newQuantity);
                    break;
                case 8:
                    restockFrame.setCanadaDryQuantity(newQuantity);
                    break;
                default:
                    break;
            }
        }
    }

    // Back Button

    /**
     * This is the listener for when the back button is clicked.
     * Closes window if run.
     */
    private class BackButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            restockFrame.dispose();
        }
    }
}
