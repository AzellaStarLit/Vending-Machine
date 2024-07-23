package controllers;

import javax.swing.*;

import models.RegularVendingMachine;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.EditFrame;

/**
 * This is the controller for the editing of item prices of a regular vending machine.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class EditController {

    private EditFrame editFrame;
    
    public EditController(EditFrame editFrame) {
        this.editFrame = editFrame;

        // Action Listeners
        this.editFrame.getCokeEditButton().addActionListener(new ItemBtnListener(1));
        this.editFrame.getSpriteEditButton().addActionListener(new ItemBtnListener(2));
        this.editFrame.getMountainDewEditButton().addActionListener(new ItemBtnListener(3));
        this.editFrame.getRoyalEditButton().addActionListener(new ItemBtnListener(4));
        this.editFrame.getFantaEditButton().addActionListener(new ItemBtnListener(5));
        this.editFrame.getSchweppesEditButton().addActionListener(new ItemBtnListener(6));
        this.editFrame.getRedBullEditButton().addActionListener(new ItemBtnListener(7));
        this.editFrame.getCanadaDryEditButton().addActionListener(new ItemBtnListener(8));
        this.editFrame.getBackButton().addActionListener(new BackButtonListener());
    }

    // Item Button Listener

    /**
     * This is the listener for when the restock button is pressed.
     */
    private class ItemBtnListener implements ActionListener {
        private int itemChoice;

        public ItemBtnListener(int itemChoice) {
            this.itemChoice = itemChoice;
        }

        /**
         * It bases off a number assigned to items. Once determined, set the price.
         * @param e the event to be processed
         */
        public void actionPerformed(ActionEvent e) {
            RegularVendingMachine vendingMachine = CreateController.getRegularVendingMachineInstance();
            String userInputIntString = JOptionPane.showInputDialog(editFrame, "Enter new price:","Vending Machine",JOptionPane.PLAIN_MESSAGE);
            int userInputPrice = Integer.parseInt(userInputIntString);
            vendingMachine.setItemPrice(itemChoice, userInputPrice);

            // Update the price labels in the RestockFrame
            int newPrice = vendingMachine.getItemSlot().get(itemChoice - 1).getPrice();
            switch (itemChoice) {
                case 1:
                    editFrame.setCokePrice(newPrice);
                    break;
                case 2:
                    editFrame.setSpritePrice(newPrice);
                    break;
                case 3:
                    editFrame.setMountainDewPrice(newPrice);
                    break;
                case 4:
                    editFrame.setRoyalPrice(newPrice);
                    break;
                case 5:
                    editFrame.setFantaPrice(newPrice);
                    break;
                case 6:
                    editFrame.setSchweppesPrice(newPrice);
                    break;
                case 7:
                    editFrame.setRedBullPrice(newPrice);
                    break;
                case 8:
                    editFrame.setCanadaDryPrice(newPrice);
                    break;
                default:
                    break;
            }
        }
    }

    // Back Button

    /**
     * This is the listener for when the back button is pressed
     */
    private class BackButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            editFrame.dispose();
        }
    }
}
