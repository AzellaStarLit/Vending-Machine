package controllers;

import javax.swing.*;

import views.PaidFrame;
import models.Denomination;
import views.SpecialPaymentFrame;
import controllers.PaymentController;

/**
 * This controller is for assembling a product without the garnish
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class AssembleItemController {
    private PaidFrame paidFrame;
    private SpecialPaymentFrame specialPaymentFrame;
    private Denomination denomination;

    public AssembleItemController(PaidFrame paidFrame, SpecialPaymentFrame specialPaymentFrame, Denomination denomination) {
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
     * This is for display purpose which shows the process of creating the product.
     * It also displays the change for the user.
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
                    if (i == 20) {
                        paidFrame.getLoadingLabel().setText("Preparing drink...");
                    }
                    if (i == 40) {
                        paidFrame.getLoadingLabel().setText("Mixing Spirit...");
                    }
                    if (i == 60) {
                        paidFrame.getLoadingLabel().setText("Change is ₱"
                                + ((denomination.getTotal()) - specialPaymentFrame.getTotal()));
                    }
                    if (i == 80) {
                        paidFrame.getLoadingLabel().setText("Dispensing cocktail...");
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
         * Close window
         */
        @Override
        protected void done() {
            // Dispose of the PaidFrame after the loading is complete
            paidFrame.dispose();
        }
    }
}
