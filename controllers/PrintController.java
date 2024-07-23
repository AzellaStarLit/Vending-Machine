package controllers;

import views.PrintFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This is the controller for the print feature of the regular vending machine
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class PrintController {

    private PrintFrame printFrame;

    public PrintController(PrintFrame printFrame) {
        this.printFrame = printFrame;

        this.printFrame.getBackButton().addActionListener(new BackButtonListener());  
    }

    // Back Button

    /**
     * This is the listener for when the back button if clicked.
     * Closes window if run.
     */
    private class BackButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            printFrame.dispose();
        }
    }

}  
