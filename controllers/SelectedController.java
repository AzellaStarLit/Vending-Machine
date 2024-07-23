package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.PaymentFrame;
import views.RegularVendingFrame;
import views.SelectedFrame;
import models.Item;

/**
 * This is the controller for the selected frame of the regular vending machine.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class SelectedController {
    private SelectedFrame selectedFrame;
    private Item selectedItem;

    public SelectedController(SelectedFrame selectedFrame, Item selectedItem) {
        this.selectedFrame = selectedFrame;
        this.selectedItem = selectedItem;

        // Action Listeners
        this.selectedFrame.getBackBtn().addActionListener(new BackBtnListener());
        this.selectedFrame.getProceedBtn().addActionListener(new ProceedBtnListener());
    }

    // Back Button

    /**
     * This is the listener for when the back button is clicked.
     * It returns to the regular vending frame if run.
     */
    private class BackBtnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            selectedFrame.dispose();
            RegularVendingFrame regularVendingFrame = new RegularVendingFrame();
            RegularVendingController regularVendingController = new RegularVendingController(regularVendingFrame);
            regularVendingFrame.init();
        }
    }

    // Proceed Button

    /**
     * This is the listener for when the proceed button is clicked.
     * It calls the payment frame and controller if run.
     */
    private class ProceedBtnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            selectedFrame.dispose();
            PaymentFrame paymentFrame = new PaymentFrame(selectedItem);
            PaymentController paymentController = new PaymentController(paymentFrame);
            paymentFrame.init();
        }
    }
}
