package controllers;

import javax.swing.*;

import models.SpecialVendingMachine;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.SpecialRestockFrame;

/**
 * This is the controller for the restock feature of a special vending machine
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class SpecialRestockController {

    private SpecialRestockFrame specialRestockFrame;
    
    public SpecialRestockController(SpecialRestockFrame specialRestockFrame) {
        this.specialRestockFrame = specialRestockFrame;

        // Action Listeners
        this.specialRestockFrame.getCokeRestockButton().addActionListener(new ItemBtnListener(1));
        this.specialRestockFrame.getSpriteRestockButton().addActionListener(new ItemBtnListener(2));
        this.specialRestockFrame.getMountainDewRestockButton().addActionListener(new ItemBtnListener(3));
        this.specialRestockFrame.getRoyalRestockButton().addActionListener(new ItemBtnListener(4));
        this.specialRestockFrame.getFantaRestockButton().addActionListener(new ItemBtnListener(5));
        this.specialRestockFrame.getSchweppesRestockButton().addActionListener(new ItemBtnListener(6));
        this.specialRestockFrame.getRedBullRestockButton().addActionListener(new ItemBtnListener(7));
        this.specialRestockFrame.getCanadaDryRestockButton().addActionListener(new ItemBtnListener(8));
        this.specialRestockFrame.getBackButton().addActionListener(new BackButtonListener());

        this.specialRestockFrame.getVodkaRestockButton().addActionListener(new SpiritBtnListener(1));
        this.specialRestockFrame.getGinRestockButton().addActionListener(new SpiritBtnListener(2));
        this.specialRestockFrame.getWhiskeyRestockButton().addActionListener(new SpiritBtnListener(3));
        this.specialRestockFrame.getTequilaRestockButton().addActionListener(new SpiritBtnListener(4));

        this.specialRestockFrame.getOliveRestockButton().addActionListener(new GarnishBtnListener(1));
        this.specialRestockFrame.getCherryRestockButton().addActionListener(new GarnishBtnListener(2));
        this.specialRestockFrame.getLemonRestockButton().addActionListener(new GarnishBtnListener(3));
        this.specialRestockFrame.getOrangeRestockButton().addActionListener(new GarnishBtnListener(4));
    }

    // Item Button Listener

    /**
     * This is the listener for when a restock button is clicked. It determines
     * which button was clicked through a number assigned to the items.
     * Set the new stock of the item afterwards.
     */
    private class ItemBtnListener implements ActionListener {
        private int itemChoice;

        public ItemBtnListener(int itemChoice) {
            this.itemChoice = itemChoice;
        }

        public void actionPerformed(ActionEvent e) {
            SpecialVendingMachine vendingMachine = CreateController.getSpecialVendingMachineInstance();
            vendingMachine.restockItem(itemChoice, 10);
            JOptionPane.showMessageDialog(specialRestockFrame, "Successfully restocked","Vending Machine",JOptionPane.PLAIN_MESSAGE);
            // Update the quantity labels in the RestockFrame
            int newQuantity = vendingMachine.getItemSlot().get(itemChoice - 1).getStock();
            switch (itemChoice) {
                case 1:
                    specialRestockFrame.setCokeQuantity(newQuantity);
                    break;
                case 2:
                    specialRestockFrame.setSpriteQuantity(newQuantity);
                    break;
                case 3:
                    specialRestockFrame.setMountainDewQuantity(newQuantity);
                    break;
                case 4:
                    specialRestockFrame.setRoyalQuantity(newQuantity);
                    break;
                case 5:
                    specialRestockFrame.setFantaQuantity(newQuantity);
                    break;
                case 6:
                    specialRestockFrame.setSchweppesQuantity(newQuantity);
                    break;
                case 7:
                    specialRestockFrame.setRedBullQuantity(newQuantity);
                    break;
                case 8:
                    specialRestockFrame.setCanadaDryQuantity(newQuantity);
                    break;
                default:
                    break;
            }
        }
    }

    // Spirit Button Listener

    /**
     * This is the listener for when a restock button is clicked. It determines
     * which button was clicked through a number assigned to the spirit.
     * Set the new stock of the spirit afterwards.
     */
    private class SpiritBtnListener implements ActionListener {
        private int spiritChoice;

        public SpiritBtnListener(int spiritChoice) {
            this.spiritChoice = spiritChoice;
        }

        public void actionPerformed(ActionEvent e) {
            SpecialVendingMachine vendingMachine = CreateController.getSpecialVendingMachineInstance();
            vendingMachine.restockSpirit(spiritChoice, 10);
            JOptionPane.showMessageDialog(specialRestockFrame, "Successfully restocked","Vending Machine",JOptionPane.PLAIN_MESSAGE);
            
            int newQuantity = vendingMachine.getSpiritSlot().get(spiritChoice - 1).getStock();
            switch (spiritChoice) {
                case 1:
                    specialRestockFrame.setVodkaQuantity(newQuantity);
                    break;
                case 2:
                    specialRestockFrame.setGinQuantity(newQuantity);
                    break;
                case 3:
                    specialRestockFrame.setWhiskeyQuantity(newQuantity);
                    break;
                case 4:
                    specialRestockFrame.setTequilaQuantity(newQuantity);
                    break;
                default:
                    break;
            }
        }
    }

    // Garnish Button Listener

    /**
     * This is the listener for when a restock button is clicked. It determines
     * which button was clicked through a number assigned to the garnish.
     * Set the new stock of the garnish afterwards.
     */
    private class GarnishBtnListener implements ActionListener {
        private int garnishChoice;

        public GarnishBtnListener(int garnishChoice) {
            this.garnishChoice = garnishChoice;
        }

        public void actionPerformed(ActionEvent e) {
            SpecialVendingMachine vendingMachine = CreateController.getSpecialVendingMachineInstance();
            vendingMachine.restockGarnish(garnishChoice, 10);
            JOptionPane.showMessageDialog(specialRestockFrame, "Successfully restocked","Vending Machine",JOptionPane.PLAIN_MESSAGE);
            
            int newQuantity = vendingMachine.getGarnishSlot().get(garnishChoice - 1).getStock();
            switch (garnishChoice) {
                case 1:
                    specialRestockFrame.setOliveQuantity(newQuantity);
                    break;
                case 2:
                    specialRestockFrame.setCherryQuantity(newQuantity);
                    break;
                case 3:
                    specialRestockFrame.setLemonQuantity(newQuantity);
                    break;
                case 4:
                    specialRestockFrame.setOrangeQuantity(newQuantity);
                    break;
                default:
                    break;
            }
        }
    }

    // Back Button
    /**
     * This is the listener for when the back button is clicked.
     * Close window if run.
     */
    private class BackButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            specialRestockFrame.dispose();
        }
    }
}
