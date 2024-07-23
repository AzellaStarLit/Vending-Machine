package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import views.PaidFrame;
import views.SpecialPaymentFrame;
import views.SuccessFrame;

import models.Spirit;
import models.Garnish;
import models.Denomination;
import models.SpecialVendingMachine;

import controllers.SpecialVendingController;
import controllers.SpiritController;
import controllers.GarnishController;

/**
 * This is the controller for the payment feature of a special vending machine.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class SpecialPaymentController {

    private SpecialPaymentFrame specialPaymentFrame;
    private Denomination denomination = new Denomination(0, 0, 0, 0, 0, 0, 0, 0, 0);

    public SpecialPaymentController(SpecialPaymentFrame specialPaymentFrame) {

        this.specialPaymentFrame = specialPaymentFrame;

        // Payment Action Listeners

        this.specialPaymentFrame.getPayBtn().addActionListener(new PayBtnListener());
        this.specialPaymentFrame.getOneSpinner().addChangeListener(new oneSpinnerListener());
        this.specialPaymentFrame.getFiveSpinner().addChangeListener(new fiveSpinnerListener());
        this.specialPaymentFrame.getTenSpinner().addChangeListener(new tenSpinnerListener());
        this.specialPaymentFrame.getTwentySpinner().addChangeListener(new twentySpinnerListener());
        this.specialPaymentFrame.getFiftySpinner().addChangeListener(new fiftySpinnerListener());
        this.specialPaymentFrame.getOneHundredSpinner().addChangeListener(new oneHundredSpinnerListener());
        this.specialPaymentFrame.getTwoHundredSpinner().addChangeListener(new twoHundredSpinnerListener());
        this.specialPaymentFrame.getFiveHundredSpinner().addChangeListener(new fiveHundredSpinnerListener());
        this.specialPaymentFrame.getOneThousandSpinner().addChangeListener(new oneThousandSpinnerListener());

    }

    /**
     * This is the listener for when the pay button is clicked. It dispenses the selected drink
     * and determines the number of spirit and garnish selected. It produces change afterwards.
     * This also determines if the item will be assembled into a product or not. It will be the former
     * if the user purchased a drink and a spirit or garnish or both. Otherwise it would simply dispense the selected
     * item.
     */
    private class PayBtnListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (denomination.getTotal() >= specialPaymentFrame.getTotal()) {
                SpecialVendingMachine vendingMachine = CreateController.getSpecialVendingMachineInstance();

                if (vendingMachine.machineBalance.getTotal() >= denomination.getTotal()){

                    vendingMachine.dispenseItem(specialPaymentFrame.getItem());

                    for (int i = 0; i < specialPaymentFrame.getVodkaCtr(); i++)
                        vendingMachine.dispenseSpirit(vendingMachine.getSpiritSlot().get(0));
                    for (int i = 0; i < specialPaymentFrame.getGinCtr(); i++)
                        vendingMachine.dispenseSpirit(vendingMachine.getSpiritSlot().get(1));
                    for (int i = 0; i < specialPaymentFrame.getWhiskeyCtr(); i++)
                        vendingMachine.dispenseSpirit(vendingMachine.getSpiritSlot().get(2));
                    for (int i = 0; i < specialPaymentFrame.getTequilaCtr(); i++)
                        vendingMachine.dispenseSpirit(vendingMachine.getSpiritSlot().get(3));

                    for (int i = 0; i < specialPaymentFrame.getOliveCtr(); i++)
                        vendingMachine.dispenseGarnish(vendingMachine.getGarnishSlot().get(0));
                    for (int i = 0; i < specialPaymentFrame.getCherryCtr(); i++)
                        vendingMachine.dispenseGarnish(vendingMachine.getGarnishSlot().get(1));
                    for (int i = 0; i < specialPaymentFrame.getLemonSliceCtr(); i++)
                        vendingMachine.dispenseGarnish(vendingMachine.getGarnishSlot().get(2));
                    for (int i = 0; i < specialPaymentFrame.getOrangeSliceCtr(); i++)
                        vendingMachine.dispenseGarnish(vendingMachine.getGarnishSlot().get(3));

                    vendingMachine.produceChange(denomination.getThousand(), denomination.getFiveHundred(),
                            denomination.getTwoHundred(), denomination.getHundred(), denomination.getFifty(),
                            denomination.getTwenty(), denomination.getTen(), denomination.getFive(), denomination.getOne());
                    
                    if ((specialPaymentFrame.getVodkaCtr()+specialPaymentFrame.getGinCtr()+
                    specialPaymentFrame.getWhiskeyCtr()+specialPaymentFrame.getTequilaCtr() > 0 &&
                    specialPaymentFrame.getOliveCtr()+specialPaymentFrame.getCherryCtr()+
                    specialPaymentFrame.getLemonSliceCtr()+specialPaymentFrame.getOrangeSliceCtr() > 0)){
                        SwingUtilities.invokeLater(() -> {
                            PaidFrame paidFrame = new PaidFrame();
                            CompleteAssembleItemController completeAssembleItem = new CompleteAssembleItemController(paidFrame, specialPaymentFrame, denomination);
                            completeAssembleItem.showPaidFrame();
                            specialPaymentFrame.dispose();
                        });
                    }

                    else if (specialPaymentFrame.getDrinkPrice() > 0 && specialPaymentFrame.getVodkaCtr()+specialPaymentFrame.getGinCtr()+
                    specialPaymentFrame.getWhiskeyCtr()+specialPaymentFrame.getTequilaCtr() > 0){

                        SwingUtilities.invokeLater(() -> {
                            PaidFrame paidFrame = new PaidFrame();
                            AssembleItemController assembleItem = new AssembleItemController(paidFrame, specialPaymentFrame, denomination);
                            assembleItem.showPaidFrame();
                            specialPaymentFrame.dispose();
                        });
                    }
                    else{

                        SwingUtilities.invokeLater(() -> {
                            PaidFrame paidFrame = new PaidFrame();
                            SpecialPaidController specialPaidController = new SpecialPaidController(paidFrame, specialPaymentFrame, denomination);
                            specialPaidController.showPaidFrame();
                            specialPaymentFrame.dispose();
                        });
                    }
                }
                else{

                    JOptionPane.showMessageDialog(specialPaymentFrame, "Insufficient Balance.", "Vending Machine",
                        JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(specialPaymentFrame, "Insufficient Payment.", "Vending Machine",
                        JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    /**
     * This is the listener for the spinner denomination one
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
     * This is the listener for the spinner denomination five
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
     * This is the listener for the spinner denomination ten
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
     * This is the listener for the spinner denomination twenty
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
     * This is the listener for the spinner denomination fifty
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
     * This is the listener for the spinner denomination one hundred
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
     * This is the listener for the spinner denomination two hundred
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
     * This is the listener for the spinner denomination five hundred
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
     * one thousand
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