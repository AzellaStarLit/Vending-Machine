package controllers;

import javax.swing.*;

import views.PaidFrame;
import models.Denomination;
import views.SpecialPaymentFrame;
import controllers.PaymentController;

/**
 * This is the controller for when a drink is purchased in a special vending machine. No assembly is done (display).
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class SpecialPaidController {
    private PaidFrame paidFrame;
    private SpecialPaymentFrame specialPaymentFrame;
    private Denomination denomination;

    public SpecialPaidController(PaidFrame paidFrame, SpecialPaymentFrame specialPaymentFrame, Denomination denomination) {
        this.paidFrame = paidFrame;
        this.specialPaymentFrame = specialPaymentFrame;
        this.denomination = denomination;
    }

    public void showPaidFrame() {
        paidFrame.setVisible(true);
        StartLoadingWorker worker = new StartLoadingWorker();
        worker.execute();
    }

    /**
     * This displays the process of dispensing the item. It also includes the change
     * for the user.
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
                        paidFrame.getLoadingLabel().setText("Dispensing item(s)...");
                    }
                    if (i == 60) {
                        paidFrame.getLoadingLabel().setText("Change is ₱"
                                + ((denomination.getTotal()) - specialPaymentFrame.getTotal()));
                    }
                    if (i == 80) {
                        paidFrame.getLoadingLabel().setText("Redirecting back to TEST...");
                    }
                    paidFrame.getLoadingBar().setValue(i);
                }
                Thread.sleep(150);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

            return null;

        }

        /**
         * Close window after
         */
        @Override
        protected void done() {
            // Dispose of the PaidFrame after the loading is complete
            paidFrame.dispose();
        }
    }
}
