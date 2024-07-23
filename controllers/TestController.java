package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import models.Spirit;
import models.Garnish;

import views.TestFrame;
import views.RegularVendingFrame;
import views.MaintenanceFrame;
import views.SpecialVendingFrame;
import views.MenuFrame;

import controllers.SpiritController;
import controllers.GarnishController;

/**
 * This controller is for the test menu of the vending machine.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class TestController {

    private TestFrame testFrame;
    private MenuFrame menuFrame;

    ArrayList<Spirit> selectedSpirits = new ArrayList<>();
    ArrayList<Garnish> selectedGarnish = new ArrayList<>();

    public TestController(TestFrame testFrame, MenuFrame menuFrame) {
        this.testFrame = testFrame;
        this.menuFrame = menuFrame;

        // Test Action Listeners
        this.testFrame.getVendingButton().addActionListener(new VendingButtonListener());
        this.testFrame.getMaintenanceButton().addActionListener(new MaintenanceButtonListener());
        this.testFrame.getBackButton().addActionListener(new BackButtonListener());

    }

    // Test: Vending Button
    /**
     * This is the listener for when the vending button is clicked.
     * It determines which frame and controller will be called through
     * the marker of the vending machine which dictates its type.
     */
    private class VendingButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if (menuFrame.getMachineCreated() == 1) {
                RegularVendingFrame regularVendingFrame = new RegularVendingFrame();
                RegularVendingController regularVendingController = new RegularVendingController(regularVendingFrame);
                regularVendingFrame.init();
            }

            else if(menuFrame.getMachineCreated() == 2) {
                SpecialVendingFrame specialVendingFrame = new SpecialVendingFrame();
                SpecialVendingController specialVendingController = new SpecialVendingController(specialVendingFrame, selectedSpirits, selectedGarnish);
                specialVendingFrame.init();
            }
        }
    }

    // Test: Maintenance Button

    /**
     * This is the listener for when the maintenance button is clicked.
     * It will call the maintenance frame and controller.
     */
    private class MaintenanceButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MaintenanceFrame maintenanceFrame = new MaintenanceFrame();
            MaintenanceController maintenanceController = new MaintenanceController(maintenanceFrame);
            maintenanceFrame.init();
        }
    }

    // Test: Back Button

    /**
     * This is the listener for when the back button is clicked.
     * Close window if run.
     */
    private class BackButtonListener implements ActionListener {
        @Override
            public void actionPerformed(ActionEvent e) {
                closeAllWindows();
            }
    }

    /**
     * Close window after
     */
    private void closeAllWindows() {
        // Close all windows here
        testFrame.dispose();
        // If needed, add code to dispose of other windows
    }
}
