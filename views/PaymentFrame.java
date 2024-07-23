package views;

import javax.swing.*;
import java.awt.*;

import models.Item;
import models.Denomination;

/**
 * This view frame is for the payment section of the regular vending machine.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class PaymentFrame extends JFrame {
                   
    private JLabel headerLbl;
    private JPanel headerPanel;

    private JLabel oneThousandLbl, fiveHundredLbl, twoHundredLbl, oneHundredLbl, fiftyLbl, twentyLbl, tenLbl, fiveLbl, oneLbl;
    private JSpinner oneThousandSpinner, fiveHundredSpinner, twoHundredSpinner, oneHundredSpinner, fiftySpinner, twentySpinner, tenSpinner, fiveSpinner, oneSpinner;
    
    private JLabel orderLbl;
    private JLabel orderTitle;
   
    private JButton paymentBtn;
    private JLabel paymentLbl;
    private JLabel paymentTitle;

    private Item selectedItem;

    public PaymentFrame(Item selectedItem) {
        this.selectedItem = selectedItem;

        orderTitle = new JLabel();
        headerPanel = new JPanel();
        headerLbl = new JLabel();
        paymentLbl = new JLabel();
        paymentTitle = new JLabel();
        orderLbl = new JLabel();
        oneThousandLbl = new JLabel();
        oneThousandSpinner = new JSpinner();
        fiveHundredSpinner = new JSpinner();
        fiveHundredLbl = new JLabel();
        twoHundredSpinner = new JSpinner();
        twoHundredLbl = new JLabel();
        oneHundredSpinner = new JSpinner();
        oneHundredLbl = new JLabel();
        fiveSpinner = new JSpinner();
        fiveLbl = new JLabel();
        fiftySpinner = new JSpinner();
        fiftyLbl = new JLabel();
        twentySpinner = new JSpinner();
        twentyLbl = new JLabel();
        tenSpinner = new JSpinner();
        tenLbl = new JLabel();
        oneSpinner = new JSpinner();
        oneLbl = new JLabel();
        paymentBtn = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 800));

        orderTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); 
        orderTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        orderTitle.setText("Order: ");

        headerPanel.setBackground(new java.awt.Color(197, 223, 249));

        headerLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); 
        headerLbl.setText("Vending Machine");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(headerLbl)
                .addContainerGap(487, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(headerLbl)
                .addGap(37, 37, 37))
        );

        paymentLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        paymentLbl.setText("₱ "+ selectedItem.getPrice());

        paymentTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); 
        paymentTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        paymentTitle.setText("Amount to Pay:");

        orderLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        orderLbl.setText(selectedItem.getName());

        oneThousandLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        oneThousandLbl.setText("₱1000");
        oneThousandSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        fiveHundredLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        fiveHundredLbl.setText("₱500");
        fiveHundredSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        twoHundredLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        twoHundredLbl.setText("₱200");
        twoHundredSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        oneHundredLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        oneHundredLbl.setText("₱100");
        oneHundredSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        fiftyLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        fiftyLbl.setText("₱50");
        fiftySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        twentyLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        twentyLbl.setText("₱20");
        twentySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        tenLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        tenLbl.setText("₱10");
        tenSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        fiveLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        fiveLbl.setText("₱5");
        fiveSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        oneLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        oneLbl.setText("₱1");
        oneSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        paymentBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        paymentBtn.setText("Pay Now");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(paymentTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orderTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(paymentLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orderLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fiveHundredLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiveHundredSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(oneThousandLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(oneThousandSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(twoHundredLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(twoHundredSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(oneHundredLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oneHundredSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(oneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(oneSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(twentyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twentySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(fiftyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fiftySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(fiveLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fiveSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(tenLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tenSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oneThousandLbl)
                            .addComponent(oneThousandSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fiveHundredLbl)
                            .addComponent(fiveHundredSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twoHundredLbl)
                            .addComponent(twoHundredSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oneHundredLbl)
                            .addComponent(oneHundredSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fiftyLbl)
                            .addComponent(fiftySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twentyLbl)
                            .addComponent(twentySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tenLbl)
                            .addComponent(tenSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fiveLbl)
                            .addComponent(fiveSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orderTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderLbl)
                        .addGap(159, 159, 159)
                        .addComponent(paymentTitle)
                        .addGap(6, 6, 6)
                        .addComponent(paymentLbl)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(oneLbl)
                        .addComponent(oneSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );

        pack();
    }

    /**
     * Call view frame
     */
    public void init() {
        setSize(700, 800);
        setPreferredSize(new Dimension(700, 800));
        setTitle("Vending Machine");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setResizable(false);
    } 

    //Getters

    /**
     * Get the button for proceeding to pay
     * @return JButton
     */
    public JButton getPayBtn() {

        return paymentBtn;
    }

    /**
     * Get the spinner for denomination one
     * @return JSpinner
     */
    public JSpinner getOneSpinner(){

        return oneSpinner;
    }

    /**
     * Get the spinner for denomination five
     * @return JSpinner
     */
    public JSpinner getFiveSpinner(){

        return fiveSpinner;
    }

    /**
     * Get the spinner for denomination ten
     * @return JSpinner
     */
    public JSpinner getTenSpinner(){

        return tenSpinner;
    }

    /**
     * Get the spinner for denomination twenty
     * @return JSpinner
     */
    public JSpinner getTwentySpinner(){

        return twentySpinner;
    }

    /**
     * Get the spinner for denomination fifty
     * @return JSpinner
     */
    public JSpinner getFiftySpinner(){

        return fiftySpinner;
    }

    /**
     * Get the spinner for denomination one hundred
     * @return JSpinner
     */
    public JSpinner getOneHundredSpinner(){

        return oneHundredSpinner;
    }

    /**
     * Get the spinner for denomination two hundred
     * @return JSpinner
     */
    public JSpinner getTwoHundredSpinner(){

        return twoHundredSpinner;
    }

    /**
     * Get the spinner for denomination five hundred
     * @return JSpinner
     */
    public JSpinner getFiveHundredSpinner(){

        return fiveHundredSpinner;
    }

    /**
     * Get the spinner for denomination one thousand
     * @return JSpinner
     */
    public JSpinner getOneThousandSpinner(){

        return oneThousandSpinner;
    }

    /**
     * Get the ArrayList for the selected item
     * @return Item
     */
    public Item getSelectedItem(){

        return selectedItem;
    }
    
}