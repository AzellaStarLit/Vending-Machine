package views;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import models.RegularVendingMachine;
import models.Item;
import controllers.CreateController;

/**
 * This is the view frame for the restock section of the maintenance in a regular vending machine
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class RestockFrame extends JFrame {
                    
    private JLabel headerLbl;
    private JPanel headerPanel;

    private JLabel cokeLbl, spriteLbl, mountaindewLbl, royalLbl, fantaLbl, schweppesLbl, redbullLbl, canadadryLbl;
    private JButton cokeRestock, spriteRestock, mountaindewRestock, royalRestock, fantaRestock, schweppesRestock, redbullRestock, canadadryRestock;
    private JLabel cokeQty, spriteQty, mountaindewQty, royalQty, fantaQty, schweppesQty, redbullQty, canadadryQty;

    private JButton backBtn;

    ArrayList<Item> selectedItems = new ArrayList<>();
    Item selected;

    public RestockFrame() {

        headerPanel = new JPanel();
        headerLbl = new JLabel();
        cokeLbl = new JLabel();
        cokeQty = new JLabel();
        cokeRestock = new JButton();
        spriteRestock = new JButton();
        spriteLbl = new JLabel();
        spriteQty = new JLabel();
        mountaindewRestock = new JButton();
        mountaindewLbl = new JLabel();
        royalRestock = new JButton();
        royalLbl = new JLabel();
        royalQty = new JLabel();
        mountaindewQty = new JLabel();
        fantaRestock = new JButton();
        fantaLbl = new JLabel();
        canadadryLbl = new JLabel();
        canadadryQty = new JLabel();
        redbullQty = new JLabel();
        schweppesRestock = new JButton();
        schweppesLbl = new JLabel();
        schweppesQty = new JLabel();
        redbullRestock = new JButton();
        redbullLbl = new JLabel();
        fantaQty = new JLabel();
        canadadryRestock = new JButton();
        backBtn = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 800));

        RegularVendingMachine vendingMachine = CreateController.getRegularVendingMachineInstance();
        ArrayList<Item> items = vendingMachine.getItemSlot();

        // COKE
        selected = items.get(0);
        selectedItems.add(selected); 
        cokeLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        cokeLbl.setText(selected.getName());
        cokeQty.setText("QTY: " + selected.getStock());

        cokeRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        cokeRestock.setText("Restock");

        // SPRITE
        selected = items.get(1);
        selectedItems.add(selected);
        spriteLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        spriteLbl.setText(selected.getName());
        spriteQty.setText("QTY: " + selected.getStock());

        spriteRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        spriteRestock.setText("Restock");


        // MOUNTAIN DEW
        selected = items.get(2);
        selectedItems.add(selected);
        mountaindewLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        mountaindewLbl.setText(selected.getName());
        mountaindewQty.setText("QTY: " + selected.getStock());

        mountaindewRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        mountaindewRestock.setText("Restock");

        // ROYAL
        selected = items.get(3);
        selectedItems.add(selected);
        royalLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        royalLbl.setText(selected.getName());
        royalQty.setText("QTY: " + selected.getStock());

        royalRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        royalRestock.setText("Restock");

        // FANTA
        selected = items.get(4);
        selectedItems.add(selected);
        fantaLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        fantaLbl.setText(selected.getName());
        fantaQty.setText("QTY: " + selected.getStock());

        fantaRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        fantaRestock.setText("Restock");

        // SCHWEPPES
        selected = items.get(5);
        selectedItems.add(selected);
        schweppesLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        schweppesLbl.setText(selected.getName());
        schweppesQty.setText("QTY: " + selected.getStock());

        schweppesRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        schweppesRestock.setText("Restock");

        // RED BULL
        selected = items.get(6);
        selectedItems.add(selected);
        redbullLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        redbullLbl.setText(selected.getName());
        redbullQty.setText("QTY: " + selected.getStock());

        redbullRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        redbullRestock.setText("Restock");

        // CANADA DRY
        selected = items.get(7);
        selectedItems.add(selected);
        canadadryLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        canadadryLbl.setText(selected.getName());
        canadadryQty.setText("QTY: " + selected.getStock());

        canadadryRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        canadadryRestock.setText("Restock");

        // BACK Button
        backBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/cross.png"))); // NOI18N
        backBtn.setBorderPainted(false);

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
                .addGap(0, 73, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mountaindewRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mountaindewLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mountaindewQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(royalRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(royalLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(royalQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cokeRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cokeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cokeQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spriteRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spriteLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spriteQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(redbullRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(redbullLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(redbullQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(canadadryRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(canadadryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(canadadryQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fantaRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fantaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fantaQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(schweppesRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(schweppesLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(schweppesQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(backBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cokeLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cokeQty))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spriteLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spriteQty)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cokeRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spriteRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mountaindewLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mountaindewQty))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(royalLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(royalQty)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mountaindewRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(royalRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fantaLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fantaQty))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(schweppesLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(schweppesQty)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fantaRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(schweppesRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(redbullLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redbullQty))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(canadadryLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(canadadryQty)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(redbullRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(canadadryRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
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

    //Setters

    /**
     * Set the text for the quantity of coke
     * @param quantity stock value
     */
    public void setCokeQuantity(int quantity) {
        cokeQty.setText("QTY: " + quantity);
    }

    /**
     * Set the text for the quantity of sprite
     * @param quantity stock value
     */
    public void setSpriteQuantity(int quantity) {
        spriteQty.setText("QTY: " + quantity);
    }

    /**
     * Set the text for the quantity of mountain dew
     * @param quantity stock value
     */
    public void setMountainDewQuantity(int quantity) {
        mountaindewQty.setText("QTY: " + quantity);
    }

    /**
     * Set the text for the quantity of royal
     * @param quantity stock value
     */
    public void setRoyalQuantity(int quantity) {
        royalQty.setText("QTY: " + quantity);
    }

    /**
     * Set the text for the quantity of fanta
     * @param quantity stock value
     */
    public void setFantaQuantity(int quantity) {
        fantaQty.setText("QTY: " + quantity);
    }

    /**
     * Set the text for the quantity of schweppes
     * @param quantity stock valye
     */
    public void setSchweppesQuantity(int quantity) {
        schweppesQty.setText("QTY: " + quantity);
    }

    /**
     * Set the text for the quantity of red bull
     * @param quantity stock value
     */
    public void setRedBullQuantity(int quantity) {
        redbullQty.setText("QTY: " + quantity);
    }

    /**
     * Set the text for the quantity of canada dry
     * @param quantity stock value
     */
    public void setCanadaDryQuantity(int quantity) {
        canadadryQty.setText("QTY: " + quantity);
    }

    /**
     * Get the button for proceeding to restock coke
     * @return JButton
     */
    public JButton getCokeRestockButton() {
        return cokeRestock;
    }

    /**
     * Get the button for proceeding to restock sprite
     * @return JButton
     */
    public JButton getSpriteRestockButton() {
        return spriteRestock;
    }

    /**
     * Get the button for proceeding to restock mountain dew
     * @return JButton
     */
    public JButton getMountainDewRestockButton() {
        return mountaindewRestock;
    }

    /**
     * Get the button for proceeding to restock royal
     * @return JButton
     */
    public JButton getRoyalRestockButton() {
        return royalRestock;
    }

    /**
     * Get the button for proceeding to restock fanta
     * @return JButton
     */
    public JButton getFantaRestockButton() {
        return fantaRestock;
    }

    /**
     * Get the button for proceeding to restock schweppes
     * @return JButton
     */
    public JButton getSchweppesRestockButton() {
        return schweppesRestock;
    }

    /**
     * Get the button for proceeding to restock red bull
     * @return JButton
     */
    public JButton getRedBullRestockButton() {
        return redbullRestock;
    }

    /**
     * Get the button for proceeding to restock canada dry
     * @return JButton
     */
    public JButton getCanadaDryRestockButton() {
        return canadadryRestock;
    }

    /**
     * Get the button for returning from restock section
     * @return
     */
    public JButton getBackButton() {
        return backBtn;
    }
}
