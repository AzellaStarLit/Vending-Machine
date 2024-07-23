package controllers;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.GarnishFrame;
import views.SpecialPaymentFrame;
import views.SpiritFrame;
import models.Garnish;
import models.Item;
import models.Spirit;
import models.SpecialVendingMachine;
import models.Denomination;
import controllers.SpecialVendingController;
import controllers.SpiritController;

/**
 * This is the controller for the garnish frame of the special vending machine
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class GarnishController {
    
    private GarnishFrame garnishFrame;
    ArrayList<Garnish> selectedGarnishes = new ArrayList<>();
    private int garnishArray[] = {0, 0, 0, 0};
    ArrayList<Item> selectedItems = new ArrayList<>();
    ArrayList<Spirit> selectedSpirits = new ArrayList<>();
    int total, spiritTotal = 0, garnishTotal = 0;

    public GarnishController(GarnishFrame garnishFrame, ArrayList<Item> selectedItems, ArrayList<Spirit> selectedSpirits) {
        this.garnishFrame = garnishFrame;
        this.selectedItems = selectedItems;
        this.selectedSpirits = selectedSpirits;

        // Action Listeners
        this.garnishFrame.getOliveAdd().addActionListener(new ItemBtnListener(1));
        this.garnishFrame.getCherryAdd().addActionListener(new ItemBtnListener(2));
        this.garnishFrame.getLemonAdd().addActionListener(new ItemBtnListener(3));
        this.garnishFrame.getOrangeAdd().addActionListener(new ItemBtnListener(4));

        this.garnishFrame.getOliveSpinner().addChangeListener(new oliveSpinnerListener());
        this.garnishFrame.getCherrySpinner().addChangeListener(new cherrySpinnerListener());
        this.garnishFrame.getLemonSpinner().addChangeListener(new lemonSpinnerListener());
        this.garnishFrame.getOrangeSpinner().addChangeListener(new orangeSpinnerListener());

        this.garnishFrame.getBackButton().addActionListener(new BackButtonListener());  
        this.garnishFrame.getProceedButton().addActionListener(new ProceedButtonListener()); 
        this.garnishFrame.getLeftButton().addActionListener(new LeftButtonListener());
    }

    // Item Button Listener

    /**
     * This is the listener for when an add to cart button is pressed.
     * It bases off the value of the corresponding spinners of the garnishes.
     */
    private class ItemBtnListener implements ActionListener {
        private int itemChoice;

        public ItemBtnListener(int itemChoice) {
            this.itemChoice = itemChoice;
        }

        /**
         * Conditions include available stock, sufficient payment, and if it is selected
         * independently.
         * @param e the event to be processed
         */
        public void actionPerformed(ActionEvent e) {

            if (selectedItems.size() > 0){
                SpecialVendingMachine vendingMachine = CreateController.getSpecialVendingMachineInstance();
                ArrayList<Garnish> garnishes = vendingMachine.getGarnishSlot();
                if (itemChoice <= garnishes.size()) {
                    Garnish selected = garnishes.get(itemChoice - 1);
                    
                    if (selected.getStock() >= garnishArray[itemChoice - 1]){

                        if (vendingMachine.machineBalance.getTotal() > (selected.getPrice() * garnishArray[itemChoice - 1])){

                            // Add the number of garnish selected
                            for(int i = 0; i < garnishArray[itemChoice - 1]; i++){
                                selectedGarnishes.add(selected);
                                System.out.println("Item added to cart: " + selected.getName());
                                System.out.println("There are " + selected.getCalories() + " calories in this item.");
                            }
                        }

                        else{

                            JOptionPane.showMessageDialog(garnishFrame, "Machine out of balance.","Vending Machine",JOptionPane.ERROR_MESSAGE);
                        }
                    }

                    else{

                        JOptionPane.showMessageDialog(garnishFrame, "Item is out of stock.","Vending Machine",JOptionPane.ERROR_MESSAGE);
                    }
                } 
            }

            else{

                JOptionPane.showMessageDialog(garnishFrame, "Item cannot be sold separately.","Vending Machine",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Back Button

    /**
     * This is the listener for when the back button is clicked
     */
    private class BackButtonListener implements ActionListener {
        @Override
            public void actionPerformed(ActionEvent e) {
                closeAllWindows();
            }
    }

    // Proceed Button

    /**
     * This is the listener for when the proceed button is clicked.
     * It firsts calculates the total value of all items selected.
     */
    private class ProceedButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < selectedSpirits.size(); i++){

                spiritTotal += selectedSpirits.get(i).getPrice();
            }

            for (int i = 0; i < selectedGarnishes.size(); i++){

                garnishTotal += selectedGarnishes.get(i).getPrice();
            }

            total = selectedItems.get(0).getPrice() + spiritTotal + garnishTotal;

            garnishFrame.dispose(); // Close the current window
            SpecialPaymentFrame specialPaymentFrame = new SpecialPaymentFrame(selectedItems, total, selectedSpirits, selectedGarnishes);
            SpecialPaymentController specialPaymentController = new SpecialPaymentController(specialPaymentFrame);
            specialPaymentFrame.init();

        }
    }

    // Left Button

    /**
     * This is the listener for when the return to previous section button is clicked
     */
    private class LeftButtonListener implements ActionListener {
        @Override
            public void actionPerformed(ActionEvent e) {
                garnishFrame.dispose(); // Close the current window
                SpiritFrame spiritFrame = new SpiritFrame();
                SpiritController spiritController = new SpiritController(spiritFrame, selectedItems, selectedGarnishes);
                spiritFrame.init();
            }
    }

    /**
     * This is the spinner for olive
     */
    private class oliveSpinnerListener implements ChangeListener {

        public void stateChanged(ChangeEvent evt) {
            JSpinner oliveSpinner = (JSpinner) evt.getSource();

            // Get the new value
            Object value = oliveSpinner.getValue();
            int olive = (Integer) value;
            garnishArray[0] = olive;

        }
    }

    /**
     * This is the spinner for cherry
     */
    private class cherrySpinnerListener implements ChangeListener {

        public void stateChanged(ChangeEvent evt) {
            JSpinner cherrySpinner = (JSpinner) evt.getSource();

            // Get the new value
            Object value = cherrySpinner.getValue();
            int cherry = (Integer) value;
            garnishArray[1] = cherry;

        }
    }

    /**
     * This is the spinner for lemon slice
     */
    private class lemonSpinnerListener implements ChangeListener {

        public void stateChanged(ChangeEvent evt) {
            JSpinner lemonSpinner = (JSpinner) evt.getSource();

            // Get the new value
            Object value = lemonSpinner.getValue();
            int lemon = (Integer) value;
            garnishArray[2] = lemon;

        }
    }

    /**
     * This is the spinner for orange slice
     */
    private class orangeSpinnerListener implements ChangeListener {

        public void stateChanged(ChangeEvent evt) {
            JSpinner orangeSpinner = (JSpinner) evt.getSource();

            // Get the new value
            Object value = orangeSpinner.getValue();
            int orange = (Integer) value;
            garnishArray[3] = orange;

        }
    }

    /**
     * close window
     */
    private void closeAllWindows() {
        // Close all windows here
        garnishFrame.dispose();
    }
}  