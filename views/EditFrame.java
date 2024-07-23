package views;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import models.RegularVendingMachine;
import models.Item;
import controllers.CreateController;

/**
 * This is the view class for the editing the prices of a regular vending machine
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class EditFrame extends JFrame {
                    
    private JLabel headerLbl;
    private JPanel headerPanel;

    private JLabel cokeLbl, spriteLbl, mountaindewLbl, royalLbl, fantaLbl, schweppesLbl, redbullLbl, canadadryLbl;
    private JButton cokeEdit, spriteEdit, mountaindewEdit, royalEdit, fantaEdit, schweppesEdit, redbullEdit, canadadryEdit;
    private JLabel cokePrice, spritePrice, mountaindewPrice, royalPrice, fantaPrice, schweppesPrice, redbullPrice, canadadryPrice;

    private JButton backBtn;

    ArrayList<Item> selectedItems = new ArrayList<>();
    Item selected;

    public EditFrame() {

        headerPanel = new JPanel();
        headerLbl = new JLabel();
        cokeLbl = new JLabel();
        cokePrice = new JLabel();
        cokeEdit = new JButton();
        spriteEdit = new JButton();
        spriteLbl = new JLabel();
        spritePrice = new JLabel();
        mountaindewEdit = new JButton();
        mountaindewLbl = new JLabel();
        royalEdit = new JButton();
        royalLbl = new JLabel();
        royalPrice = new JLabel();
        mountaindewPrice = new JLabel();
        fantaEdit = new JButton();
        fantaLbl = new JLabel();
        canadadryLbl = new JLabel();
        canadadryPrice = new JLabel();
        redbullPrice = new JLabel();
        schweppesEdit = new JButton();
        schweppesLbl = new JLabel();
        schweppesPrice = new JLabel();
        redbullEdit = new JButton();
        redbullLbl = new JLabel();
        fantaPrice = new JLabel();
        canadadryEdit = new JButton();
        backBtn = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 800));

        RegularVendingMachine vendingMachine = CreateController.getRegularVendingMachineInstance();
        ArrayList<Item> items = vendingMachine.getItemSlot();

        // COKE
        selected = items.get(0);
        selectedItems.add(selected); 
        cokeLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        cokeLbl.setText(selected.getName());
        cokePrice.setText("₱" + selected.getPrice());

        cokeEdit.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        cokeEdit.setText("Edit Price");

        // SPRITE
        selected = items.get(1);
        selectedItems.add(selected);
        spriteLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        spriteLbl.setText(selected.getName());
        spritePrice.setText("₱" + selected.getPrice());

        spriteEdit.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        spriteEdit.setText("Edit Price");


        // MOUNTAIN DEW
        selected = items.get(2);
        selectedItems.add(selected);
        mountaindewLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        mountaindewLbl.setText(selected.getName());
        mountaindewPrice.setText("₱" + selected.getPrice());

        mountaindewEdit.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        mountaindewEdit.setText("Edit Price");

        // ROYAL
        selected = items.get(3);
        selectedItems.add(selected);
        royalLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        royalLbl.setText(selected.getName());
        royalPrice.setText("₱" + selected.getPrice());

        royalEdit.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        royalEdit.setText("Edit Price");

        // FANTA
        selected = items.get(4);
        selectedItems.add(selected);
        fantaLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        fantaLbl.setText(selected.getName());
        fantaPrice.setText("₱" + selected.getPrice());

        fantaEdit.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        fantaEdit.setText("Edit Price");

        // SCHWEPPES
        selected = items.get(5);
        selectedItems.add(selected);
        schweppesLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        schweppesLbl.setText(selected.getName());
        schweppesPrice.setText("₱" + selected.getPrice());

        schweppesEdit.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        schweppesEdit.setText("Edit Price");

        // RED BULL
        selected = items.get(6);
        selectedItems.add(selected);
        redbullLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        redbullLbl.setText(selected.getName());
        redbullPrice.setText("₱" + selected.getPrice());

        redbullEdit.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        redbullEdit.setText("Edit Price");

        // CANADA DRY
        selected = items.get(7);
        selectedItems.add(selected);
        canadadryLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        canadadryLbl.setText(selected.getName());
        canadadryPrice.setText("₱" + selected.getPrice());

        canadadryEdit.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        canadadryEdit.setText("Edit Price");

        // BACK Button
        backBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 24));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/cross.png")));
        backBtn.setBorderPainted(false);

        // HEADER
        headerPanel.setBackground(new java.awt.Color(197, 223, 249));

        headerLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 36));
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
                                    .addComponent(mountaindewEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mountaindewLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mountaindewPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(royalEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(royalLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(royalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cokeEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cokeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cokePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spriteEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spriteLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spritePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(redbullEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(redbullLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(redbullPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(canadadryEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(canadadryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(canadadryPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fantaEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fantaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fantaPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(schweppesEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(schweppesLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(schweppesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                        .addComponent(cokePrice))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spriteLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spritePrice)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cokeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spriteEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mountaindewLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mountaindewPrice))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(royalLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(royalPrice)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mountaindewEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(royalEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fantaLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fantaPrice))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(schweppesLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(schweppesPrice)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fantaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(schweppesEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(redbullLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redbullPrice))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(canadadryLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(canadadryPrice)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(redbullEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(canadadryEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(25, 25, 25))
        );
        pack();
    }

    /**
     * Call the frame window
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
     * Set the price of the coke item
     * @param price new price
     */
    public void setCokePrice(int price) {
        cokePrice.setText("₱" + price);
    }

    /**
     * Set the price of the Sprite item
     * @param price new price
     */
    public void setSpritePrice(int price) {
        spritePrice.setText("₱" + price);
    }

    /**
     * Set the price of the Mountain Dew item
     * @param price new value
     */
    public void setMountainDewPrice(int price) {
        mountaindewPrice.setText("₱" + price);
    }

    /**
     * Set the price of the Royal item
     * @param price new value
     */
    public void setRoyalPrice(int price) {
        royalPrice.setText("₱" + price);
    }

    /**
     * Set the price of the Fanta item
     * @param price new value
     */
    public void setFantaPrice(int price) {
        fantaPrice.setText("₱" + price);
    }

    /**
     * Set the price of the Ginger Ale (Schweppes) item
     * @param price new value
     */
    public void setSchweppesPrice(int price) {
        schweppesPrice.setText("₱" + price);
    }

    /**
     * Set the price of the Red Bull item
     * @param price new value
     */
    public void setRedBullPrice(int price) {
        redbullPrice.setText("₱" + price);
    }

    /**
     * Set the price of the Canada Dry (Tonic Water) item
     * @param price new value
     */
    public void setCanadaDryPrice(int price) {
        canadadryPrice.setText("₱" + price);
    }

    //Getters

    /**
     * Get the button for editing the Coke item
     * @return Jbutton
     */
    public JButton getCokeEditButton() {
        return cokeEdit;
    }

    /**
     * Get the button for editing the Sprite item
     * @return Jbutton
     */
    public JButton getSpriteEditButton() {
        return spriteEdit;
    }

    /**
     * Get the button for editing the Mountain Dew item
     * @return JButton
     */
    public JButton getMountainDewEditButton() {
        return mountaindewEdit;
    }

    /**
     * Get the button for editing the Royal item
     * @return JButton
     */
    public JButton getRoyalEditButton() {
        return royalEdit;
    }

    /**
     * Get the button for editing the Fanta item
     * @return JButton
     */
    public JButton getFantaEditButton() {
        return fantaEdit;
    }

    /**
     * Get the button for editing the Ginger Ale item
     * @return JButton
     */
    public JButton getSchweppesEditButton() {
        return schweppesEdit;
    }

    /**
     * Get the button for editing the Red Bull item
     * @return JButton
     */
    public JButton getRedBullEditButton() {
        return redbullEdit;
    }

    /**
     * Get the button for the Canada Dry item
     * @return JButton
     */
    public JButton getCanadaDryEditButton() {
        return canadadryEdit;
    }

    /**
     * Get the button for returning from the edit section
     * @return JButton
     */
    public JButton getBackButton() {
        return backBtn;
    }
}
