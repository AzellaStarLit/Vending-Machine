package controllers;

import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.SwingUtilities;

import views.CreateFrame;
import views.MenuFrame;
import views.SuccessFrame;
import models.RegularVendingMachine;
import models.SpecialVendingMachine;
import models.Item;
import models.Spirit;
import models.Garnish;
import models.ConfigureDefaultVM;

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

    protected void showSuccess(int machineType) {
        menuFrame.setMachineCreated(machineType);
        SuccessFrame successFrame = new SuccessFrame();
        SuccessController successController = new SuccessController(successFrame, menuFrame);
        successController.showSuccessFrame();
        createFrame.dispose();
    }

    // Create: Regular Button

    /**
     * This is the listener for when the regular vending machine button is clicked
     */
    private class RegularButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            machine = 1;
            regularVendingMachine = new RegularVendingMachine();
            ConfigureDefaultVM.configureRegularMachine(regularVendingMachine);
            SwingUtilities.invokeLater(() -> showSuccess(1));
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
            
            ConfigureDefaultVM.configureSpecialMachine(specialVendingMachine);
            SwingUtilities.invokeLater(() -> showSuccess(2));
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
