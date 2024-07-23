package controllers;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.SecondSpecialPrintFrame;
import views.SpecialPrintFrame;

/**
 * This is the controller for the print feature of a special vending machine.
 */
public class SpecialPrintController {

    private SpecialPrintFrame specialPrintFrame;
    
    public SpecialPrintController(SpecialPrintFrame specialPrintFrame) {
        this.specialPrintFrame = specialPrintFrame;

        // Action Listeners
        this.specialPrintFrame.getNextButton().addActionListener(new NextButtonListener());
        this.specialPrintFrame.getBackButton().addActionListener(new BackButtonListener());
    }

    // Next Button

    /**
     * This is the listener for when the next button is clicked.
     * This calls the second print frame and controller.
     */
    private class NextButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            specialPrintFrame.dispose();
            SecondSpecialPrintFrame secondSpecialPrintFrame = new SecondSpecialPrintFrame();
            SecondSpecialPrintController secondSpecialPrintController = new SecondSpecialPrintController(secondSpecialPrintFrame);
            secondSpecialPrintFrame.init();
        }
    }

    // Back Button

    /**
     * This is the listener for when the back button is clicked.
     * Close window of run
     */
    private class BackButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            specialPrintFrame.dispose();
        }
    }
}
