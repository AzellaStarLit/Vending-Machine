package controllers;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.SpiritFrame;
import views.GarnishFrame;
import views.SpecialPaymentFrame;
import views.SpecialVendingFrame;
import models.Item;
import models.Spirit;
import models.Garnish;
import models.SpecialVendingMachine;
import controllers.SpecialVendingController;
import controllers.GarnishController;

/**
 * This is the controller for the spirit section of the vending menu of the special vending machine
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class SpiritController {
    
    private SpiritFrame spiritFrame;
    private int spiritArray[] = { 0, 0, 0, 0 };
    ArrayList<Item> selectedItems = new ArrayList<>();
    ArrayList<Spirit> selectedSpirits = new ArrayList<>();
    ArrayList<Garnish> selectedGarnishes = new ArrayList<>();
    int total, spiritTotal = 0, garnishTotal = 0;

    public SpiritController(SpiritFrame spiritFrame, ArrayList<Item> selectedItems, ArrayList<Garnish> selectedGarnishes) {
        this.spiritFrame = spiritFrame;
        this.selectedItems = selectedItems;
        this.selectedGarnishes = selectedGarnishes;

        // Action Listeners
        this.spiritFrame.getVodkaAdd().addActionListener(new ItemBtnListener(1));
        this.spiritFrame.getGinAdd().addActionListener(new ItemBtnListener(2));
        this.spiritFrame.getWhiskeyAdd().addActionListener(new ItemBtnListener(3));
        this.spiritFrame.getTequilaAdd().addActionListener(new ItemBtnListener(4));

        this.spiritFrame.getVodkaSpinner().addChangeListener(new vodkaSpinnerListener());
        this.spiritFrame.getGinSpinner().addChangeListener(new ginSpinnerListener());
        this.spiritFrame.getWhiskeySpinner().addChangeListener(new whiskeySpinnerListener());
        this.spiritFrame.getTequilaSpinner().addChangeListener(new tequilaSpinnerListener());
        
        this.spiritFrame.getBackButton().addActionListener(new BackButtonListener());  
        this.spiritFrame.getProceedButton().addActionListener(new ProceedButtonListener());  
        this.spiritFrame.getRightButton().addActionListener(new RightButtonListener());
        this.spiritFrame.getLeftButton().addActionListener(new LeftButtonListener());
    }

    // Item Button Listener

    /**
     * This is the listener for when an add to cart button is clicked. It bases off the spinners
     * for the value selected. It also checks if the item has stock, machine is out of balance, and if
     * the item is being purchased independently (not allowed)>
     */
    private class ItemBtnListener implements ActionListener {

        private int itemChoice;

        public ItemBtnListener(int itemChoice) {
            this.itemChoice = itemChoice;
        }

        public void actionPerformed(ActionEvent e) {
            
            if (selectedItems.size() > 0){
                SpecialVendingMachine vendingMachine = CreateController.getSpecialVendingMachineInstance();
                ArrayList<Spirit> spirits = vendingMachine.getSpiritSlot();
                if (itemChoice <= spirits.size()) {

                    Spirit selected = spirits.get(itemChoice - 1);

                    if (selected.getStock() >= spiritArray[itemChoice - 1]){

                        if (vendingMachine.machineBalance.getTotal() > (selected.getPrice() * spiritArray[itemChoice - 1])){

                            // Add the number of spirits selecteds
                            for(int i = 0; i < spiritArray[itemChoice - 1]; i++){
                                selectedSpirits.add(selected);
                                System.out.println("Item added to cart: " + selected.getName());
                                System.out.println("There are " + selected.getCalories() + " calories in this item.");
                            }
                        }

                        else{

                            JOptionPane.showMessageDialog(spiritFrame, "Machine out of balance.","Vending Machine",JOptionPane.ERROR_MESSAGE);
                        }
                    }

                    else{

                        JOptionPane.showMessageDialog(spiritFrame, "Item is out of stock.","Vending Machine",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

            else{

                JOptionPane.showMessageDialog(spiritFrame, "Item cannot be sold separately.","Vending Machine",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Back Button

    /**
     * This is the listener for when the back button is clicked.
     * Close windows if run.
     */
    private class BackButtonListener implements ActionListener {
        @Override
            public void actionPerformed(ActionEvent e) {
                closeAllWindows();
            }
    }

    // Proceed Button

    /**
     * This is the listener for when the pay button is clicked.
     * It first calculates the total sum of all selected items.
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

            spiritFrame.dispose(); // Close the current window
            SpecialPaymentFrame specialPaymentFrame = new SpecialPaymentFrame(selectedItems, total, selectedSpirits, selectedGarnishes);
            SpecialPaymentController specialPaymentController = new SpecialPaymentController(specialPaymentFrame);
            specialPaymentFrame.init();
        }
    }

    // Right Button

    /**
     * This is the listener for when the right button is clicked.
     * Call garnish frame and controller afterwards.
     */
    private class RightButtonListener implements ActionListener {
        @Override
            public void actionPerformed(ActionEvent e) {
                spiritFrame.dispose(); // Close the current window
                GarnishFrame garnishFrame = new GarnishFrame();
                GarnishController garnishController = new GarnishController(garnishFrame, selectedItems, selectedSpirits);
                garnishFrame.init();
                
            }
    }

    // Left Button

    /**
     * This is the listener for when the left button is clicked.
     * Call specialVending frame and controller afterwards.
     */
    private class LeftButtonListener implements ActionListener {
        @Override
            public void actionPerformed(ActionEvent e) {
                spiritFrame.dispose(); // Close the current window
                SpecialVendingFrame specialVendingFrame = new SpecialVendingFrame();
                SpecialVendingController specialVendingController = new SpecialVendingController(specialVendingFrame, selectedSpirits, selectedGarnishes);
                specialVendingFrame.init();
            }
    }

    /**
     * This is the listener for the spinner vodka
     */
    private class vodkaSpinnerListener implements ChangeListener {

        public void stateChanged(ChangeEvent evt) {
            JSpinner vodkaSpinner = (JSpinner) evt.getSource();

            // Get the new value
            Object value = vodkaSpinner.getValue();
            int vodka = (Integer) value;
            spiritArray[0] = vodka;

        }
    }

    /**
     * This is the listener for the spinner gin
     */
    private class ginSpinnerListener implements ChangeListener {

        public void stateChanged(ChangeEvent evt) {
            JSpinner ginSpinner = (JSpinner) evt.getSource();

            // Get the new value
            Object value = ginSpinner.getValue();
            int gin = (Integer) value;
            spiritArray[1] = gin;

        }
    }

    /**
     * This is the listener for the spinner whiskey
     */
    private class whiskeySpinnerListener implements ChangeListener {

        public void stateChanged(ChangeEvent evt) {
            JSpinner whiskeySpinner = (JSpinner) evt.getSource();

            // Get the new value
            Object value = whiskeySpinner.getValue();
            int whiskey = (Integer) value;
            spiritArray[2] = whiskey;

        }
    }

    /**
     * This is the listener for the spinner tequila
     */
    private class tequilaSpinnerListener implements ChangeListener {

        public void stateChanged(ChangeEvent evt) {
            JSpinner tequilaSpinner = (JSpinner) evt.getSource();

            // Get the new value
            Object value = tequilaSpinner.getValue();
            int tequila = (Integer) value;
            spiritArray[3] = tequila;

        }
    }

    /**
     * Close window afer
     */
    private void closeAllWindows() {
        // Close all windows here
        spiritFrame.dispose();
    }
}  