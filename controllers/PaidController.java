package controllers;

import javax.swing.*;

import views.PaidFrame;
import models.Denomination;
import views.PaymentFrame;
import controllers.PaymentController;

/**
 * This is the controller for when the payment in a regular
 * vending machine was successful. This is purely for display
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */

public class PaidController {
    private PaidFrame paidFrame;
    private PaymentFrame paymentFrame;
    private Denomination denomination;

    public PaidController(PaidFrame paidFrame, PaymentFrame paymentFrame, Denomination denomination) {
        this.paidFrame = paidFrame;
        this.paymentFrame = paymentFrame;
        this.denomination = denomination;
    }

    public void showPaidFrame() {
        paidFrame.setVisible(true);
        StartLoadingWorker worker = new StartLoadingWorker();
        worker.execute();
    }

    /**
     * This displays process of dispensing the selected item.
     */
    private class StartLoadingWorker extends SwingWorker<Void, Integer> {

        @Override
        protected Void doInBackground() throws Exception {

            try {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(100);

                    if (i == 0) {
                        paidFrame.getLoadingLabel().setText("Payment successful!");
                    }
                    if (i == 30) {
                        paidFrame.getLoadingLabel().setText("Dispensing item...");
                    }
                    if (i == 60) {
                        paidFrame.getLoadingLabel().setText("Change is ₱"
                                + ((denomination.getTotal()) - paymentFrame.getSelectedItem().getPrice()));
                    }
                    if (i == 80) {
                        paidFrame.getLoadingLabel().setText("Redirecting back to TEST...");
                    }
                    paidFrame.getLoadingBar().setValue(i);
                }
                Thread.sleep(250);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

            return null;

        }

        /**
         * Close window
         */
        @Override
        protected void done() {
            // Dispose of the PaidFrame after the loading is complete
            paidFrame.dispose();
        }
    }
}
