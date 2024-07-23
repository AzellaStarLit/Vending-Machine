package controllers;

import javax.swing.*;

import views.MenuFrame;
import views.SuccessFrame;

/**
 * This is the controller for the create menu of the program
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class SuccessController {

    private SuccessFrame successFrame;
    private MenuFrame menuFrame;

    public SuccessController(SuccessFrame successFrame, MenuFrame menuFrame) {
        this.successFrame = successFrame;
        this.menuFrame = menuFrame;
    }

    public void showSuccessFrame() {
        successFrame.setVisible(true);
        StartLoadingWorker worker = new StartLoadingWorker();
        worker.execute();
    }

    /**
     * This displays the success text after generating a vending machine.
     * A marker will dictate if the vending machine is regular or special.
     */
    private class StartLoadingWorker extends SwingWorker<Void, Integer> {

        @Override
        protected Void doInBackground() throws Exception {
            // Regular
            if(menuFrame.getMachineCreated() == 1) {
                try {
                    for (int i = 0; i <= 100; i++) {
                        Thread.sleep(100);

                        if (i == 0) {
                            successFrame.getLoadingLabel().setText("Creating Regular Vending Machine...");
                        }
                        if (i == 50) {
                            successFrame.getLoadingLabel().setText("Created successfully!");
                        }
                        if (i == 80) {
                            successFrame.getLoadingLabel().setText("Redirecting back to MENU...");
                        }
                        successFrame.getLoadingBar().setValue(i);
                    }
                    Thread.sleep(500);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            // Special
            else {
                try {
                    for (int i = 0; i <= 100; i++) {
                        Thread.sleep(100);

                        if (i == 0) {
                            successFrame.getLoadingLabel().setText("Creating Special Vending Machine...");
                        }
                        if (i == 50) {
                            successFrame.getLoadingLabel().setText("Created successfully!");
                        }
                        if (i == 80) {
                            successFrame.getLoadingLabel().setText("Redirecting back to MENU...");
                        }
                        successFrame.getLoadingBar().setValue(i);
                    }
                    Thread.sleep(500);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            } 
            return null;
            
        }

        /**
         * Close window afer
         */
        @Override
        protected void done() {
            // Dispose of the SuccessFrame after the loading is complete
            successFrame.dispose();
        }
    }
}
