package views;

import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;

import controllers.CreateController;
import models.Item;

import models.SpecialVendingMachine;

/**
 * This is the view class for printing the transaction history of a special vending machine
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class SpecialPrintFrame extends JFrame{
                        
    private JButton backBtn, nextBtn;
    private JLabel headerLbl;
    private JPanel headerPanel;
    private JLabel summaryLbl;
    private JLabel cokeEnd, spriteEnd, mountaindewEnd, royalEnd, fantaEnd, schweppesEnd, redbullEnd, canadadryEnd;
    private JLabel cokeInventory, spriteInventory, mountaindewInventory, royalInventory, fantaInventory, schweppesInventory, redbullInventory, canadadryInventory;
    private JLabel cokeLbl, spriteLbl, mountaindewLbl, royalLbl, fantaLbl, schweppesLbl, redbullLbl, canadadryLbl;
    private JLabel cokeSold, spriteSold, mountaindewSold, royalSold, fantaSold, schweppesSold, redbullSold, canadadrySold;
    private JLabel cokeStart, spriteStart, mountaindewStart, royalStart, fantaStart, schweppesStart, redbullStart, canadadryStart;
    private JLabel cokeTransaction, spriteTransaction, mountaindewTransaction, royalTransaction, fantaTransaction, schweppesTransaction, redbullTransaction, canadadryTransaction;
    private JLabel collectLbl;
    private JLabel collectPrice;

    ArrayList<Item> selectedItems = new ArrayList<>();
    Item selected;

    public SpecialPrintFrame() {

        headerPanel = new JPanel();
        headerLbl = new JLabel();
        summaryLbl = new JLabel();
        backBtn = new JButton();
        cokeLbl = new JLabel();
        royalLbl = new JLabel();
        fantaLbl = new JLabel();
        canadadryLbl = new JLabel();
        schweppesLbl = new JLabel();
        redbullLbl = new JLabel();
        spriteLbl = new JLabel();
        mountaindewLbl = new JLabel();
        cokeInventory = new JLabel();
        cokeStart = new JLabel();
        cokeEnd = new JLabel();
        cokeTransaction = new JLabel();
        cokeSold = new JLabel();
        spriteSold = new JLabel();
        spriteInventory = new JLabel();
        spriteStart = new JLabel();
        spriteEnd = new JLabel();
        spriteTransaction = new JLabel();
        mountaindewSold = new JLabel();
        mountaindewInventory = new JLabel();
        mountaindewStart = new JLabel();
        mountaindewEnd = new JLabel();
        mountaindewTransaction = new JLabel();
        royalSold = new JLabel();
        royalInventory = new JLabel();
        royalStart = new JLabel();
        royalEnd = new JLabel();
        royalTransaction = new JLabel();
        fantaSold = new JLabel();
        fantaInventory = new JLabel();
        fantaStart = new JLabel();
        fantaEnd = new JLabel();
        fantaTransaction = new JLabel();
        schweppesSold = new JLabel();
        schweppesInventory = new JLabel();
        schweppesStart = new JLabel();
        schweppesEnd = new JLabel();
        schweppesTransaction = new JLabel();
        redbullSold = new JLabel();
        redbullInventory = new JLabel();
        redbullStart = new JLabel();
        redbullEnd = new JLabel();
        redbullTransaction = new JLabel();
        canadadrySold = new JLabel();
        canadadryInventory = new JLabel();
        canadadryStart = new JLabel();
        canadadryEnd = new JLabel();
        canadadryTransaction = new JLabel();
        collectLbl = new JLabel();
        collectPrice = new JLabel();
        nextBtn = new JButton();

        SpecialVendingMachine vendingMachine = CreateController.getSpecialVendingMachineInstance();
        ArrayList<Item> items = vendingMachine.getItemSlot();
        int startingStock = 0, endingStock = 0, quantitySold = 0;

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 800));

        summaryLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        summaryLbl.setText("Summary of Transactions");

        // COKE
        selected = items.get(0);
        selectedItems.add(selected); 
        cokeLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        cokeLbl.setText(selected.getName());

        cokeInventory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cokeInventory.setText("Inventory");

        startingStock = selected.getStock() + selected.getQuantitySold();
        cokeStart.setText("Starting: " + startingStock);
        endingStock = selected.getStock();
        cokeEnd.setText("Ending: " + endingStock);

        cokeTransaction.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cokeTransaction.setText("Transactions");
        quantitySold = selected.getQuantitySold();
        cokeSold.setText("Sold: " + quantitySold);

        // SPRITE
        selected = items.get(1);
        selectedItems.add(selected); 
        spriteLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        spriteLbl.setText(selected.getName());
    

        spriteInventory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        spriteInventory.setText("Inventory");

        startingStock = selected.getStock() + selected.getQuantitySold();
        spriteStart.setText("Starting: " + startingStock);
        endingStock = selected.getStock();
        spriteEnd.setText("Ending: " + endingStock);

        spriteTransaction.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        spriteTransaction.setText("Transactions");
        quantitySold = selected.getQuantitySold();
        spriteSold.setText("Sold: " + quantitySold);


        // MOUNTAIN DEW
        selected = items.get(2);
        selectedItems.add(selected); 
        mountaindewLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        mountaindewLbl.setText(selected.getName());


        mountaindewInventory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        mountaindewInventory.setText("Inventory");

        startingStock = selected.getStock() + selected.getQuantitySold();
        mountaindewStart.setText("Starting: " + startingStock);
        endingStock = selected.getStock();
        mountaindewEnd.setText("Ending: " + endingStock);

        mountaindewTransaction.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        mountaindewTransaction.setText("Transactions");
        quantitySold = selected.getQuantitySold();
        mountaindewSold.setText("Sold: " + quantitySold);
        
        // ROYAL
        selected = items.get(3);
        selectedItems.add(selected); 
        royalLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        royalLbl.setText(selected.getName());

        royalInventory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        royalInventory.setText("Inventory");

        startingStock = selected.getStock() + selected.getQuantitySold();
        royalStart.setText("Starting: " + startingStock);
        endingStock = selected.getStock();
        royalEnd.setText("Ending: " + endingStock);

        royalTransaction.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        royalTransaction.setText("Transactions");
        quantitySold = selected.getQuantitySold();
        royalSold.setText("Sold: " + quantitySold);

        // FANTA
        selected = items.get(4);
        selectedItems.add(selected); 
        fantaLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        fantaLbl.setText(selected.getName());

        fantaInventory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        fantaInventory.setText("Inventory");

        startingStock = selected.getStock() + selected.getQuantitySold();
        fantaStart.setText("Starting: " + startingStock);
        endingStock = selected.getStock();
        fantaEnd.setText("Ending: " + endingStock);

        fantaTransaction.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        fantaTransaction.setText("Transactions");
        quantitySold = selected.getQuantitySold();
        fantaSold.setText("Sold: " + quantitySold);

        // SCHWEPPES
        selected = items.get(5);
        selectedItems.add(selected); 
        schweppesLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        schweppesLbl.setText(selected.getName());

        schweppesInventory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        schweppesInventory.setText("Inventory");

        startingStock = selected.getStock() + selected.getQuantitySold();
        schweppesStart.setText("Starting: " + startingStock);
        endingStock = selected.getStock();
        schweppesEnd.setText("Ending: " + endingStock);

        schweppesTransaction.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        schweppesTransaction.setText("Transactions");
        quantitySold = selected.getQuantitySold();
        schweppesSold.setText("Sold: " + quantitySold);

        // RED BULL
        selected = items.get(6);
        selectedItems.add(selected); 
        redbullLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        redbullLbl.setText(selected.getName());

        redbullInventory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        redbullInventory.setText("Inventory");

        startingStock = selected.getStock() + selected.getQuantitySold();
        redbullStart.setText("Starting: " + startingStock);
        endingStock = selected.getStock();
        redbullEnd.setText("Ending: " + endingStock);

        redbullTransaction.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        redbullTransaction.setText("Transactions");
        quantitySold = selected.getQuantitySold();
        redbullSold.setText("Sold: " + quantitySold);

        // CANADA DRY
        selected = items.get(7);
        selectedItems.add(selected); 
        canadadryLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        canadadryLbl.setText(selected.getName());

        canadadryInventory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        canadadryInventory.setText("Inventory");

        startingStock = selected.getStock() + selected.getQuantitySold();
        canadadryStart.setText("Starting: " + startingStock);
        endingStock = selected.getStock();
        canadadryEnd.setText("Ending: " + endingStock);

        canadadryTransaction.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        canadadryTransaction.setText("Transactions");
        quantitySold = selected.getQuantitySold();
        canadadrySold.setText("Sold: " + quantitySold);

        // Amount Collected
        collectLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        collectLbl.setText("Total Amount Collected: ");
        int totalCollectedMoney = vendingMachine.totalCollectedMoney();
        collectPrice.setText("₱" + totalCollectedMoney);
        
        // BACK Button
        backBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/cross.png"))); // NOI18N
        backBtn.setBorderPainted(false);
        
        // NEXT Button
        nextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/right.png"))); // NOI18N
        nextBtn.setBorderPainted(false);

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
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(collectLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(collectPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(summaryLbl)
                                .addGap(124, 124, 124)
                                .addComponent(nextBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cokeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cokeInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(cokeStart, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cokeEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cokeTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cokeSold, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(spriteLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mountaindewLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(royalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(spriteInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(spriteStart, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(spriteEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(spriteTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(spriteSold, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(mountaindewInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(mountaindewStart, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(mountaindewEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(mountaindewTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(mountaindewSold, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(royalInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(royalStart, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(royalEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(royalTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(royalSold, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fantaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(schweppesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(redbullLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(canadadryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fantaInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fantaStart, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fantaEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fantaTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fantaSold, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(schweppesInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(schweppesStart, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(schweppesEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(schweppesTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(schweppesSold, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(redbullInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(redbullStart, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(redbullEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(redbullTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(redbullSold, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(canadadryInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(canadadryStart, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(canadadryEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(canadadryTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(canadadrySold, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(summaryLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(nextBtn)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cokeLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cokeInventory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cokeStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cokeEnd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cokeTransaction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cokeSold))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spriteLbl)
                            .addComponent(mountaindewLbl)
                            .addComponent(royalLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(royalInventory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(royalStart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(royalEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(royalTransaction)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(royalSold))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mountaindewInventory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mountaindewStart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mountaindewEnd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mountaindewTransaction)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mountaindewSold))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spriteInventory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spriteStart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spriteEnd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spriteTransaction)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spriteSold)))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fantaLbl)
                    .addComponent(schweppesLbl)
                    .addComponent(redbullLbl)
                    .addComponent(canadadryLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fantaInventory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fantaStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fantaEnd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fantaTransaction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fantaSold))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(schweppesInventory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(schweppesStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(schweppesEnd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(schweppesTransaction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(schweppesSold))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(redbullInventory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redbullStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redbullEnd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redbullTransaction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redbullSold))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(canadadryInventory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(canadadryStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(canadadryEnd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(canadadryTransaction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(canadadrySold)))
                .addGap(42, 42, 42)
                .addComponent(collectLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(collectPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
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
     * Get the button for proceeding
     * @return JButton
     */
    public JButton getNextButton() {
        return nextBtn;
    }

    /**
     * Get the button for returning from the print section
     * @return JButton
     */
    public JButton getBackButton() {
        return backBtn;
    }
}
