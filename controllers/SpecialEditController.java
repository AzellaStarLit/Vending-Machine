package controllers;

import javax.swing.*;

import models.SpecialVendingMachine;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.SpecialEditFrame;

/**
 * This is the controller for the edit feature of a special vending machine
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class SpecialEditController {

    private SpecialEditFrame specialEditFrame;
    
    public SpecialEditController(SpecialEditFrame specialEditFrame) {
        this.specialEditFrame = specialEditFrame;

        // Action Listeners
        this.specialEditFrame.getCokeEditButton().addActionListener(new ItemBtnListener(1));
        this.specialEditFrame.getSpriteEditButton().addActionListener(new ItemBtnListener(2));
        this.specialEditFrame.getMountainDewEditButton().addActionListener(new ItemBtnListener(3));
        this.specialEditFrame.getRoyalEditButton().addActionListener(new ItemBtnListener(4));
        this.specialEditFrame.getFantaEditButton().addActionListener(new ItemBtnListener(5));
        this.specialEditFrame.getSchweppesEditButton().addActionListener(new ItemBtnListener(6));
        this.specialEditFrame.getRedBullEditButton().addActionListener(new ItemBtnListener(7));
        this.specialEditFrame.getCanadaDryEditButton().addActionListener(new ItemBtnListener(8));
        this.specialEditFrame.getBackButton().addActionListener(new BackButtonListener());

        this.specialEditFrame.getVodkaEditButton().addActionListener(new SpiritBtnListener(1));
        this.specialEditFrame.getGinEditButton().addActionListener(new SpiritBtnListener(2));
        this.specialEditFrame.getWhiskeyEditButton().addActionListener(new SpiritBtnListener(3));
        this.specialEditFrame.getTequilaEditButton().addActionListener(new SpiritBtnListener(4));

        this.specialEditFrame.getOliveEditButton().addActionListener(new GarnishBtnListener(1));
        this.specialEditFrame.getCherryEditButton().addActionListener(new GarnishBtnListener(2));
        this.specialEditFrame.getLemonEditButton().addActionListener(new GarnishBtnListener(3));
        this.specialEditFrame.getOrangeEditButton().addActionListener(new GarnishBtnListener(4));
    }

    // Item Button Listener

    /**
     * This is the listener for when a set price button is clicked. It
     * determines was button was clicked through a number assigned to an item.
     * Prompts for a new price afterwards.
     */
    private class ItemBtnListener implements ActionListener {
        private int itemChoice;

        public ItemBtnListener(int itemChoice) {
            this.itemChoice = itemChoice;
        }

        public void actionPerformed(ActionEvent e) {
            SpecialVendingMachine vendingMachine = CreateController.getSpecialVendingMachineInstance();
            String userInputIntString = JOptionPane.showInputDialog(specialEditFrame, "Enter new price:","Vending Machine",JOptionPane.PLAIN_MESSAGE);
            int userInputPrice = Integer.parseInt(userInputIntString);
            vendingMachine.setItemPrice(itemChoice, userInputPrice);
            
            int newPrice = vendingMachine.getItemSlot().get(itemChoice - 1).getPrice();
            switch (itemChoice) {
                case 1:
                    specialEditFrame.setCokePrice(newPrice);
                    break;
                case 2:
                    specialEditFrame.setSpritePrice(newPrice);
                    break;
                case 3:
                    specialEditFrame.setMountainDewPrice(newPrice);
                    break;
                case 4:
                    specialEditFrame.setRoyalPrice(newPrice);
                    break;
                case 5:
                    specialEditFrame.setFantaPrice(newPrice);
                    break;
                case 6:
                    specialEditFrame.setSchweppesPrice(newPrice);
                    break;
                case 7:
                    specialEditFrame.setRedBullPrice(newPrice);
                    break;
                case 8:
                    specialEditFrame.setCanadaDryPrice(newPrice);
                    break;
                default:
                    break;
            }
        }
    }

    // Spirit Button Listener

    /**
     * This is the listener for when a set price button is clicked. It
     * determines was button was clicked through a number assigned to a spirit item.
     * Prompts for a new price afterwards.
     */
    private class SpiritBtnListener implements ActionListener {
        private int spiritChoice;

        public SpiritBtnListener(int spiritChoice) {
            this.spiritChoice = spiritChoice;
        }

        public void actionPerformed(ActionEvent e) {
            SpecialVendingMachine vendingMachine = CreateController.getSpecialVendingMachineInstance();
            String userInputIntString = JOptionPane.showInputDialog(specialEditFrame, "Enter new price:","Vending Machine",JOptionPane.PLAIN_MESSAGE);
            int userInputPrice = Integer.parseInt(userInputIntString);
            vendingMachine.setSpiritPrice(spiritChoice, userInputPrice);
            
            int newPrice = vendingMachine.getSpiritSlot().get(spiritChoice - 1).getPrice();
            switch (spiritChoice) {
                case 1:
                    specialEditFrame.setVodkaPrice(newPrice);
                    break;
                case 2:
                    specialEditFrame.setGinPrice(newPrice);
                    break;
                case 3:
                    specialEditFrame.setWhiskeyPrice(newPrice);
                    break;
                case 4:
                    specialEditFrame.setTequilaPrice(newPrice);
                    break;
                default:
                    break;
            }
        }
    }

    // Garnish Button Listener

    /**
     * This is the listener for when a set price button is clicked. It
     * determines was button was clicked through a number assigned to an garnish item.
     * Prompts for a new price afterwards.
     */
    private class GarnishBtnListener implements ActionListener {
        private int garnishChoice;

        public GarnishBtnListener(int garnishChoice) {
            this.garnishChoice = garnishChoice;
        }

        public void actionPerformed(ActionEvent e) {
            SpecialVendingMachine vendingMachine = CreateController.getSpecialVendingMachineInstance();
            String userInputIntString = JOptionPane.showInputDialog(specialEditFrame, "Enter new price:","Vending Machine",JOptionPane.PLAIN_MESSAGE);
            int userInputPrice = Integer.parseInt(userInputIntString);
            vendingMachine.setGarnishPrice(garnishChoice, userInputPrice);
            
            int newPrice = vendingMachine.getGarnishSlot().get(garnishChoice - 1).getPrice();
            switch (garnishChoice) {
                case 1:
                    specialEditFrame.setOlivePrice(newPrice);
                    break;
                case 2:
                    specialEditFrame.setCherryPrice(newPrice);
                    break;
                case 3:
                    specialEditFrame.setLemonPrice(newPrice);
                    break;
                case 4:
                    specialEditFrame.setOrangePrice(newPrice);
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
            specialEditFrame.dispose();
        }
    }
}
