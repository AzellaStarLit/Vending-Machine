package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import models.RegularVendingMachine;
import models.SpecialVendingMachine;
import views.MaintenanceFrame;
import views.PrintFrame;
import views.RestockFrame;
import views.EditFrame;
import views.SpecialRestockFrame;
import views.SpecialEditFrame;
import views.SpecialPrintFrame;

/**
 * This controller is for the maintenance menu of the vending machine
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class MaintenanceController {

    private MaintenanceFrame maintenanceFrame;

    public MaintenanceController(MaintenanceFrame maintenanceFrame) {
        this.maintenanceFrame = maintenanceFrame;

        // Action Listeners
        this.maintenanceFrame.getRestockButton().addActionListener(new RestockButtonListener());
        this.maintenanceFrame.getEditButton().addActionListener(new EditButtonListener());
        this.maintenanceFrame.getCollectButton().addActionListener(new CollectButtonListener());
        this.maintenanceFrame.getReplenishButton().addActionListener(new ReplenishButtonListener());
        this.maintenanceFrame.getPrintButton().addActionListener(new PrintButtonListener());
        this.maintenanceFrame.getBackButton().addActionListener(new BackButtonListener());

    }

    // Restock Button

    /**
     * This is the listener for when the restock button is pressed.
     * It also checks for the marker which dictates the type of vending machine
     */
    private class RestockButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int machine = CreateController.getMachine();
            if(machine == 1) {
                RestockFrame restockFrame = new RestockFrame();
                RestockController restockController = new RestockController(restockFrame);
                restockFrame.init();
            }
            else
            {
                SpecialRestockFrame specialRestockFrame = new SpecialRestockFrame();
                SpecialRestockController specialRestockController = new SpecialRestockController(specialRestockFrame);
                specialRestockFrame.init();
            }
        }
    }

    // Edit Button

    /**
     * This is the listener for when the edit button is clicked.
     * It also checks for the marker which dictates the type of vending machine
     */
    private class EditButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int machine = CreateController.getMachine();
            if(machine == 1) {
                EditFrame editFrame = new EditFrame();
                EditController editController = new EditController(editFrame);
                editFrame.init();
            }
            else {
                SpecialEditFrame specialEditFrame = new SpecialEditFrame();
                SpecialEditController specialEditController = new SpecialEditController(specialEditFrame);
                specialEditFrame.init();
            }
        }
    }

    // Collect Button

    /**
     * This is the listener for when the collect button is clicked.
     * It also checks for the marker which dictates the type of vending machine
     */
    private class CollectButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int machine = CreateController.getMachine();
            if(machine == 1) {
                RegularVendingMachine vendingMachine = CreateController.getRegularVendingMachineInstance();
                int collectedMoney = vendingMachine.collectMoney();
                System.out.println("Collected amount: " + collectedMoney);
                JOptionPane.showMessageDialog(maintenanceFrame, "Money amounted to ₱" + collectedMoney + " collected successfully!","Vending Machine",JOptionPane.PLAIN_MESSAGE);
            }
            else {
                SpecialVendingMachine vendingMachine = CreateController.getSpecialVendingMachineInstance();
                int collectedMoney = vendingMachine.collectMoney();
                System.out.println("Collected amount: " + collectedMoney);
                JOptionPane.showMessageDialog(maintenanceFrame, "Money amounted to ₱" + collectedMoney + " collected successfully!","Vending Machine",JOptionPane.PLAIN_MESSAGE);
            }
        }
    }

    // Replenish Button

    /**
     * This is the listener for when the replenish button is clicked.
     * It also checks for the marker which dictates the type of vending machine
     */
    private class ReplenishButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int machine = CreateController.getMachine();
            if(machine == 1) {
                RegularVendingMachine vendingMachine = CreateController.getRegularVendingMachineInstance();
                vendingMachine.replenishMoney(10, 10, 10, 10, 10, 20, 30, 40, 100);
                JOptionPane.showMessageDialog(maintenanceFrame, "Money replenished successfully!","Vending Machine",JOptionPane.PLAIN_MESSAGE);
            }
            else {
                SpecialVendingMachine vendingMachine = CreateController.getSpecialVendingMachineInstance();
                vendingMachine.replenishMoney(10, 10, 10, 10, 10, 20, 30, 40, 100);
                JOptionPane.showMessageDialog(maintenanceFrame, "Money replenished successfully!","Vending Machine",JOptionPane.PLAIN_MESSAGE);
            }
        }
    }

    // Print Button

    /**
     * This is the listener for when the print button is clicked.
     * It also checks for the marker which dictates the type of vending machine
     */
    private class PrintButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int machine = CreateController.getMachine();
            if(machine == 1) {
                PrintFrame printFrame = new PrintFrame();
                PrintController printController = new PrintController(printFrame);
                printFrame.init();
            }
            else {
                SpecialPrintFrame specialPrintFrame = new SpecialPrintFrame();
                SpecialPrintController specialPrintController = new SpecialPrintController(specialPrintFrame);
                specialPrintFrame.init();
            }

        }
    }

    // Test: Back Button

    /**
     * This is the listener for when the back button is clicked.
     * It closes the window if run.
     */
    private class BackButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            maintenanceFrame.dispose();
        }
    }
}