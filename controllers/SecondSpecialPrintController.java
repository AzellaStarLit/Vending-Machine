package controllers;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.SecondSpecialPrintFrame;
import views.SpecialPrintFrame;

/**
 * This is the controller for another print frame of the special venidng machine.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class SecondSpecialPrintController {

    private SecondSpecialPrintFrame secondSpecialPrintFrame;
    
    public SecondSpecialPrintController(SecondSpecialPrintFrame secondSpecialPrintFrame) {
        this.secondSpecialPrintFrame = secondSpecialPrintFrame;

        // Action Listeners
        this.secondSpecialPrintFrame.getPreviousButton().addActionListener(new PreviousButtonListener());
        this.secondSpecialPrintFrame.getBackButton().addActionListener(new BackButtonListener());
    }

    // Previous Button

    /**
     * This is the listener for when the previous button is clicked.
     * It calls the first print frame and controller.
     */
    private class PreviousButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            secondSpecialPrintFrame.dispose();
            SpecialPrintFrame specialPrintFrame = new SpecialPrintFrame();
            SpecialPrintController specialPrintController = new SpecialPrintController(specialPrintFrame);
            specialPrintFrame.init();
        }
    }

    // Back Button

    /**
     * This is the listener for when the back button is clicked.
     * Closes window if run.
     */
    private class BackButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            secondSpecialPrintFrame.dispose();
        }
    }
}
