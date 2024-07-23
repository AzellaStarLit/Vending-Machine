package views;

import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;

import controllers.CreateController;
import models.Spirit;
import models.Garnish;

import models.SpecialVendingMachine;

/**
 * This is the second view frame for printing the transaction history of a
 * special vending machine.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class SecondSpecialPrintFrame extends JFrame{
                        
    private JButton backBtn, previousBtn;
    private JLabel headerLbl;
    private JPanel headerPanel;
    private JLabel summaryLbl;
    private JLabel vodkaEnd, ginEnd, whiskeyEnd, tequilaEnd, oliveEnd, cherryEnd, lemonEnd, orangeEnd;
    private JLabel vodkaInventory, ginInventory, whiskeyInventory, tequilaInventory, oliveInventory, cherryInventory, lemonInventory, orangeInventory;
    private JLabel vodkaLbl, ginLbl, whiskeyLbl, tequilaLbl, oliveLbl, cherryLbl, lemonLbl, orangeLbl;
    private JLabel vodkaSold, ginSold, whiskeySold, tequilaSold, oliveSold, cherrySold, lemonSold, orangeSold;
    private JLabel vodkaStart, ginStart, whiskeyStart, tequilaStart, oliveStart, cherryStart, lemonStart, orangeStart;
    private JLabel vodkaTransaction, ginTransaction, whiskeyTransaction, tequilaTransaction, oliveTransaction, cherryTransaction, lemonTransaction, orangeTransaction;
    private JLabel collectLbl;
    private JLabel collectPrice;

    ArrayList<Spirit> selectedSpirit = new ArrayList<>();
    ArrayList<Garnish> selectedGarnish = new ArrayList<>();
    Spirit selected1;
    Garnish selected2;

    public SecondSpecialPrintFrame() {

        headerPanel = new JPanel();
        headerLbl = new JLabel();
        summaryLbl = new JLabel();
        backBtn = new JButton();
        vodkaLbl = new JLabel();
        tequilaLbl = new JLabel();
        oliveLbl = new JLabel();
        orangeLbl = new JLabel();
        cherryLbl = new JLabel();
        lemonLbl = new JLabel();
        ginLbl = new JLabel();
        whiskeyLbl = new JLabel();
        vodkaInventory = new JLabel();
        vodkaStart = new JLabel();
        vodkaEnd = new JLabel();
        vodkaTransaction = new JLabel();
        vodkaSold = new JLabel();
        ginSold = new JLabel();
        ginInventory = new JLabel();
        ginStart = new JLabel();
        ginEnd = new JLabel();
        ginTransaction = new JLabel();
        whiskeySold = new JLabel();
        whiskeyInventory = new JLabel();
        whiskeyStart = new JLabel();
        whiskeyEnd = new JLabel();
        whiskeyTransaction = new JLabel();
        tequilaSold = new JLabel();
        tequilaInventory = new JLabel();
        tequilaStart = new JLabel();
        tequilaEnd = new JLabel();
        tequilaTransaction = new JLabel();
        oliveSold = new JLabel();
        oliveInventory = new JLabel();
        oliveStart = new JLabel();
        oliveEnd = new JLabel();
        oliveTransaction = new JLabel();
        cherrySold = new JLabel();
        cherryInventory = new JLabel();
        cherryStart = new JLabel();
        cherryEnd = new JLabel();
        cherryTransaction = new JLabel();
        lemonSold = new JLabel();
        lemonInventory = new JLabel();
        lemonStart = new JLabel();
        lemonEnd = new JLabel();
        lemonTransaction = new JLabel();
        orangeSold = new JLabel();
        orangeInventory = new JLabel();
        orangeStart = new JLabel();
        orangeEnd = new JLabel();
        orangeTransaction = new JLabel();
        collectLbl = new JLabel();
        collectPrice = new JLabel();
        previousBtn = new JButton();

        SpecialVendingMachine vendingMachine = CreateController.getSpecialVendingMachineInstance();
        ArrayList<Spirit> spirits = vendingMachine.getSpiritSlot();
        ArrayList<Garnish> garnishes = vendingMachine.getGarnishSlot();
        int startingStock = 0, endingStock = 0, quantitySold = 0;

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 800));

        summaryLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        summaryLbl.setText("Summary of Transactions");

        // VODKA
        selected1 = spirits.get(0);
        selectedSpirit.add(selected1); 
        vodkaLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        vodkaLbl.setText(selected1.getName());

        vodkaInventory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        vodkaInventory.setText("Inventory");

        startingStock = selected1.getStock() + selected1.getQuantitySold();
        vodkaStart.setText("Starting: " + startingStock);
        endingStock = selected1.getStock();
        vodkaEnd.setText("Ending: " + endingStock);

        vodkaTransaction.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        vodkaTransaction.setText("Transactions");
        quantitySold = selected1.getQuantitySold();
        vodkaSold.setText("Sold: " + quantitySold);

        // GIN
        selected1 = spirits.get(1);
        selectedSpirit.add(selected1); 
        ginLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ginLbl.setText(selected1.getName());
    

        ginInventory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        ginInventory.setText("Inventory");

        startingStock = selected1.getStock() + selected1.getQuantitySold();
        ginStart.setText("Starting: " + startingStock);
        endingStock = selected1.getStock();
        ginEnd.setText("Ending: " + endingStock);

        ginTransaction.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        ginTransaction.setText("Transactions");
        quantitySold = selected1.getQuantitySold();
        ginSold.setText("Sold: " + quantitySold);


        // WHISKEY
        selected1 = spirits.get(2);
        selectedSpirit.add(selected1); 
        whiskeyLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        whiskeyLbl.setText(selected1.getName());


        whiskeyInventory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        whiskeyInventory.setText("Inventory");

        startingStock = selected1.getStock() + selected1.getQuantitySold();
        whiskeyStart.setText("Starting: " + startingStock);
        endingStock = selected1.getStock();
        whiskeyEnd.setText("Ending: " + endingStock);

        whiskeyTransaction.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        whiskeyTransaction.setText("Transactions");
        quantitySold = selected1.getQuantitySold();
        whiskeySold.setText("Sold: " + quantitySold);
        
        // TEQUILA
        selected1 = spirits.get(3);
        selectedSpirit.add(selected1); 
        tequilaLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        tequilaLbl.setText(selected1.getName());

        tequilaInventory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        tequilaInventory.setText("Inventory");

        startingStock = selected1.getStock() + selected1.getQuantitySold();
        tequilaStart.setText("Starting: " + startingStock);
        endingStock = selected1.getStock();
        tequilaEnd.setText("Ending: " + endingStock);

        tequilaTransaction.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        tequilaTransaction.setText("Transactions");
        quantitySold = selected1.getQuantitySold();
        tequilaSold.setText("Sold: " + quantitySold);

        // OLIVE
        selected2 = garnishes.get(0);
        selectedGarnish.add(selected2); 
        oliveLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        oliveLbl.setText(selected2.getName());

        oliveInventory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        oliveInventory.setText("Inventory");

        startingStock = selected2.getStock() + selected2.getQuantitySold();
        oliveStart.setText("Starting: " + startingStock);
        endingStock = selected2.getStock();
        oliveEnd.setText("Ending: " + endingStock);

        oliveTransaction.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        oliveTransaction.setText("Transactions");
        quantitySold = selected2.getQuantitySold();
        oliveSold.setText("Sold: " + quantitySold);

        // CHERRY
        selected2 = garnishes.get(1);
        selectedGarnish.add(selected2); 
        cherryLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        cherryLbl.setText(selected2.getName());

        cherryInventory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cherryInventory.setText("Inventory");

        startingStock = selected2.getStock() + selected2.getQuantitySold();
        cherryStart.setText("Starting: " + startingStock);
        endingStock = selected2.getStock();
        cherryEnd.setText("Ending: " + endingStock);

        cherryTransaction.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cherryTransaction.setText("Transactions");
        quantitySold = selected2.getQuantitySold();
        cherrySold.setText("Sold: " + quantitySold);

        // LEMON
        selected2 = garnishes.get(2);
        selectedGarnish.add(selected2); 
        lemonLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lemonLbl.setText(selected2.getName());

        lemonInventory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lemonInventory.setText("Inventory");

        startingStock = selected2.getStock() + selected2.getQuantitySold();
        lemonStart.setText("Starting: " + startingStock);
        endingStock = selected2.getStock();
        lemonEnd.setText("Ending: " + endingStock);

        lemonTransaction.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lemonTransaction.setText("Transactions");
        quantitySold = selected2.getQuantitySold();
        lemonSold.setText("Sold: " + quantitySold);

        // ORANGE
        selected2 = garnishes.get(3);
        selectedGarnish.add(selected2); 
        orangeLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        orangeLbl.setText(selected2.getName());

        orangeInventory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        orangeInventory.setText("Inventory");

        startingStock = selected2.getStock() + selected2.getQuantitySold();
        orangeStart.setText("Starting: " + startingStock);
        endingStock = selected2.getStock();
        orangeEnd.setText("Ending: " + endingStock);

        orangeTransaction.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        orangeTransaction.setText("Transactions");
        quantitySold = selected2.getQuantitySold();
        orangeSold.setText("Sold: " + quantitySold);

        // Amount Collected
        collectLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        collectLbl.setText("Total Amount Collected: ");
        int totalCollectedMoney = vendingMachine.totalCollectedMoney();
        collectPrice.setText("₱" + totalCollectedMoney);
        
        // BACK Button
        backBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/cross.png"))); // NOI18N
        backBtn.setBorderPainted(false);
        
        // PREVOIS Button
        previousBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/left.png"))); // NOI18N
        previousBtn.setBorderPainted(false);
        
        // HEADER
        headerPanel.setBackground(new java.awt.Color(197, 223, 249));

        headerLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        headerLbl.setText("Maintenance");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(headerLbl)
                .addContainerGap(451, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(headerLbl)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(previousBtn)
                                .addGap(97, 97, 97)
                                .addComponent(summaryLbl))
                            .addComponent(backBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(vodkaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(vodkaInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(vodkaStart, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vodkaEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vodkaTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vodkaSold, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ginLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(whiskeyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(tequilaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ginInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ginStart, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ginEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ginTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ginSold, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(whiskeyInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(whiskeyStart, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(whiskeyEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(whiskeyTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(whiskeySold, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tequilaInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tequilaStart, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tequilaEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tequilaTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tequilaSold, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(oliveLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cherryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(lemonLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(orangeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(oliveInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(oliveStart, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(oliveEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(oliveTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(oliveSold, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cherryInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cherryStart, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cherryEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cherryTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cherrySold, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lemonInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lemonStart, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lemonEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lemonTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lemonSold, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orangeInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orangeStart, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orangeEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orangeTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orangeSold, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previousBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(summaryLbl)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vodkaLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vodkaInventory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vodkaStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vodkaEnd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vodkaTransaction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vodkaSold))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ginLbl)
                            .addComponent(whiskeyLbl)
                            .addComponent(tequilaLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tequilaInventory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tequilaStart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tequilaEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tequilaTransaction)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tequilaSold))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(whiskeyInventory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(whiskeyStart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(whiskeyEnd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(whiskeyTransaction)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(whiskeySold))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ginInventory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ginStart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ginEnd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ginTransaction)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ginSold)))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oliveLbl)
                    .addComponent(cherryLbl)
                    .addComponent(lemonLbl)
                    .addComponent(orangeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(oliveInventory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oliveStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oliveEnd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oliveTransaction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oliveSold))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cherryInventory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cherryStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cherryEnd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cherryTransaction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cherrySold))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lemonInventory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lemonStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lemonEnd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lemonTransaction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lemonSold))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orangeInventory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orangeStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orangeEnd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orangeTransaction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orangeSold)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(25, 25, 25))
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
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
        setResizable(false);
    }

    /**
     * Get the button for returning to a different section of the print transaction menu
     * @return JButton
     */
    public JButton getPreviousButton() {
        return previousBtn;
    }

    /**
     * Get the button for returning from the print menu
     * @return
     */
    public JButton getBackButton() {
        return backBtn;
    }
}
