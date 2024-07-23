package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import views.PaidFrame;
import views.PaymentFrame;
import views.SuccessFrame;
import models.Denomination;
import models.RegularVendingMachine;

/**
 * This is the controller for the payment section of a regular vending machine.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class PaymentController {

    private PaymentFrame paymentFrame;
    private Denomination denomination = new Denomination(0, 0, 0, 0, 0, 0, 0, 0, 0);

    public PaymentController(PaymentFrame paymentFrame) {

        this.paymentFrame = paymentFrame;

        // Payment Action Listeners

        this.paymentFrame.getPayBtn().addActionListener(new PayBtnListener());
        this.paymentFrame.getOneSpinner().addChangeListener(new oneSpinnerListener());
        this.paymentFrame.getFiveSpinner().addChangeListener(new fiveSpinnerListener());
        this.paymentFrame.getTenSpinner().addChangeListener(new tenSpinnerListener());
        this.paymentFrame.getTwentySpinner().addChangeListener(new twentySpinnerListener());
        this.paymentFrame.getFiftySpinner().addChangeListener(new fiftySpinnerListener());
        this.paymentFrame.getOneHundredSpinner().addChangeListener(new oneHundredSpinnerListener());
        this.paymentFrame.getTwoHundredSpinner().addChangeListener(new twoHundredSpinnerListener());
        this.paymentFrame.getFiveHundredSpinner().addChangeListener(new fiveHundredSpinnerListener());
        this.paymentFrame.getOneThousandSpinner().addChangeListener(new oneThousandSpinnerListener());

    }

    /**
     * This is the listener for when the pay button is clicked. It checks first
     * if the payment is sufficient and if the machine has enough denomination for change
     * It dispenses the item and produces change.
     */
    private class PayBtnListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (denomination.getTotal() >= paymentFrame.getSelectedItem().getPrice()) {
                RegularVendingMachine vendingMachine = CreateController.getRegularVendingMachineInstance();

                if (vendingMachine.machineBalance.getTotal() >= denomination.getTotal()){
                    vendingMachine.dispenseItem(paymentFrame.getSelectedItem());

                    vendingMachine.produceChange(denomination.getThousand(), denomination.getFiveHundred(),
                            denomination.getTwoHundred(), denomination.getHundred(), denomination.getFifty(),
                            denomination.getTwenty(), denomination.getTen(), denomination.getFive(), denomination.getOne());

                    SwingUtilities.invokeLater(() -> {
                        PaidFrame paidFrame = new PaidFrame();
                        PaidController paidController = new PaidController(paidFrame, paymentFrame, denomination);
                        paidController.showPaidFrame();
                        paymentFrame.dispose();
                    });
                }
                else{

                    JOptionPane.showMessageDialog(paymentFrame, "Insufficient Balance.", "Vending Machine",
                        JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(paymentFrame, "Insufficient Payment.", "Vending Machine",
                        JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    /**
     * This is the listener for the spinner of the denomination one
     */
    private class oneSpinnerListener implements ChangeListener {

        public void stateChanged(ChangeEvent evt) {
            JSpinner oneSpinner = (JSpinner) evt.getSource();

            // Get the new value
            Object value = oneSpinner.getValue();
            int one = (Integer) value;
            denomination.setOne(one);

        }
    }

    /**
     * This is the listener for the spinner of the denomination five
     */
    private class fiveSpinnerListener implements ChangeListener {

        public void stateChanged(ChangeEvent evt) {
            JSpinner fiveSpinner = (JSpinner) evt.getSource();

            // Get the new value
            Object value = fiveSpinner.getValue();
            int five = (Integer) value;
            denomination.setFive(five);

        }
    }

    /**
     * This is the listener for the spinner of the denomination ten
     */
    private class tenSpinnerListener implements ChangeListener {

        public void stateChanged(ChangeEvent evt) {
            JSpinner tenSpinner = (JSpinner) evt.getSource();

            // Get the new value
            Object value = tenSpinner.getValue();
            int ten = (Integer) value;
            denomination.setTen(ten);
        }
    }

    /**
     * This is the listener for the spinner of the denomination twenty
     */
    private class twentySpinnerListener implements ChangeListener {

        public void stateChanged(ChangeEvent evt) {
            JSpinner twentySpinner = (JSpinner) evt.getSource();

            // Get the new value
            Object value = twentySpinner.getValue();
            int twenty = (Integer) value;
            denomination.setTwenty(twenty);
        }
    }

    /**
     * This is the listener for the spinner of the denomination fifty
     */
    private class fiftySpinnerListener implements ChangeListener {

        public void stateChanged(ChangeEvent evt) {
            JSpinner fiftySpinner = (JSpinner) evt.getSource();

            // Get the new value
            Object value = fiftySpinner.getValue();
            int fifty = (Integer) value;
            denomination.setFifty(fifty);
        }
    }

    /**
     * This is the listener for the spinner of the denomination one hundred
     */
    private class oneHundredSpinnerListener implements ChangeListener {

        public void stateChanged(ChangeEvent evt) {
            JSpinner oneHundredSpinner = (JSpinner) evt.getSource();

            // Get the new value
            Object value = oneHundredSpinner.getValue();
            int hundred = (Integer) value;
            denomination.setHundred(hundred);
        }
    }

    /**
     * This is the listener for the spinner of the denomination two hundred
     */
    private class twoHundredSpinnerListener implements ChangeListener {

        public void stateChanged(ChangeEvent evt) {
            JSpinner twoHundredSpinner = (JSpinner) evt.getSource();

            // Get the new value
            Object value = twoHundredSpinner.getValue();
            int twoHundred = (Integer) value;
            denomination.setTwoHundred(twoHundred);
        }
    }

    /**
     * This is the listener for the spinner of the denomination five hundred
     */
    private class fiveHundredSpinnerListener implements ChangeListener {

        public void stateChanged(ChangeEvent evt) {
            JSpinner fiveHundredSpinner = (JSpinner) evt.getSource();

            // Get the new value
            Object value = fiveHundredSpinner.getValue();
            int fiveHundred = (Integer) value;
            denomination.setFiveHundred(fiveHundred);
        }
    }

    /**
     * This is the listener for the spinner of the denomination one thousand
     */
    private class oneThousandSpinnerListener implements ChangeListener {

        public void stateChanged(ChangeEvent evt) {
            JSpinner oneThousandSpinner = (JSpinner) evt.getSource();

            // Get the new value
            Object value = oneThousandSpinner.getValue();
            int thousand = (Integer) value;
            denomination.setThousand(thousand);
        }
    }

}