package views;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import models.RegularVendingMachine;
import models.Item;
import controllers.CreateController;

/**
 * This is the view frame of the regular vending machine. It displays
 * the available items (drinks) for purchase, their prices, and respective stocks.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class RegularVendingFrame extends JFrame {                
    
    private JPanel headerPanel;
    private JLabel headerLbl;
    private JLabel cokeImg, spriteImg, mountaindewImg, royalImg, fantaImg, schweppesImg, redbullImg, canadadryImg;
    private JLabel cokeLbl, spriteLbl, mountaindewLbl, royalLbl, fantaLbl, schweppesLbl, redbullLbl, canadadryLbl;
    private JButton cokeBtn, spriteBtn, mountaindewBtn, royalBtn, fantaBtn, schweppesBtn, redbullBtn, canadadryBtn;
    private JLabel cokeQty, spriteQty, mountaindewQty, royalQty, fantaQty, schweppesQty, redbullQty, canadadryQty;
    private JButton backBtn;

    ArrayList<Item> selectedItems = new ArrayList<>();
    Item selected;
    
    public RegularVendingFrame() {

        cokeQty = new JLabel();
        cokeBtn = new JButton();
        cokeLbl = new JLabel();
        cokeImg = new JLabel();
        spriteQty = new JLabel();
        spriteBtn = new JButton();
        spriteLbl = new JLabel();
        spriteImg = new JLabel();
        mountaindewQty = new JLabel();
        mountaindewLbl = new JLabel();
        mountaindewImg = new JLabel();
        mountaindewBtn = new JButton();
        royalQty = new JLabel();
        royalLbl = new JLabel();
        royalImg = new JLabel();
        royalBtn = new JButton();
        redbullImg = new JLabel();
        fantaQty = new JLabel();
        redbullBtn = new JButton();
        canadadryQty = new JLabel();
        canadadryLbl = new JLabel();
        canadadryImg = new JLabel();
        canadadryBtn = new JButton();
        schweppesQty = new JLabel();
        fantaBtn = new JButton();
        schweppesBtn = new JButton();
        fantaLbl = new JLabel();
        schweppesLbl = new JLabel();
        schweppesImg = new JLabel();
        fantaImg = new JLabel();
        redbullQty = new JLabel();
        redbullLbl = new JLabel();
        headerPanel = new JPanel();
        headerLbl = new JLabel();
        backBtn = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 800));

        RegularVendingMachine vendingMachine = CreateController.getRegularVendingMachineInstance();
        ArrayList<Item> items = vendingMachine.getItemSlot();

        
        // COKE
        selected = items.get(0);
        selectedItems.add(selected);
        cokeQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        cokeQty.setText("QTY: " + selected.getStock());

        cokeBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        cokeBtn.setText("₱" + selected.getPrice());

        cokeLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        cokeLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cokeLbl.setText(selected.getName());

        cokeImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/coke.jpg"))); 

        // SPRITE
        selected = items.get(1);
        selectedItems.add(selected);
        spriteQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        spriteQty.setText("QTY: " + selected.getStock());

        spriteBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        spriteBtn.setText("₱" + selected.getPrice());

        spriteLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        spriteLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spriteLbl.setText(selected.getName());

        spriteImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/sprite.jpg")));

        // MOUNTAIN DEW
        selected = items.get(2);
        selectedItems.add(selected);
        mountaindewQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        mountaindewQty.setText("QTY: " + selected.getStock());


        mountaindewBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        mountaindewBtn.setText("₱" + selected.getPrice());

        mountaindewLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        mountaindewLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mountaindewLbl.setText(selected.getName());

        mountaindewImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/royal.jpg")));

        // ROYAL
        selected = items.get(3);
        selectedItems.add(selected);
        royalQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        royalQty.setText("QTY: " + selected.getStock());

        royalBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        royalBtn.setText("₱" + selected.getPrice());

        royalLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        royalLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        royalLbl.setText(selected.getName());

        royalImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/mountaindew.jpg"))); 


        // FANTA
        selected = items.get(4);
        selectedItems.add(selected);
        fantaQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        fantaQty.setText("QTY: " + selected.getStock());

        fantaBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        fantaBtn.setText("₱" + selected.getPrice());

        fantaLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        fantaLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fantaLbl.setText(selected.getName());

        fantaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/fanta.jpg"))); 
        
        // SCHWEPPES
        selected = items.get(5);
        selectedItems.add(selected);
        schweppesQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        schweppesQty.setText("QTY: " + selected.getStock());

        schweppesBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        schweppesBtn.setText("₱" + selected.getPrice());

        schweppesLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        schweppesLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        schweppesLbl.setText(selected.getName());

        schweppesImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/schweppes.jpg"))); 

        // RED BULL
        selected = items.get(6);
        selectedItems.add(selected);
        redbullQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        redbullQty.setText("QTY: " + selected.getStock());


        redbullBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        redbullBtn.setText("₱" + selected.getPrice());

        redbullLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        redbullLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        redbullLbl.setText(selected.getName());

        redbullImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/redbull.jpg"))); 

        // CANADA DRY
        selected = items.get(7);
        selectedItems.add(selected);
        canadadryQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        canadadryQty.setText("QTY: " + selected.getStock());

        canadadryBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        canadadryBtn.setText("₱" + selected.getPrice());

        canadadryLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        canadadryLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        canadadryLbl.setText(selected.getName());

        canadadryImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/canadadry.jpg"))); 

        // HEADER
        headerPanel.setBackground(new java.awt.Color(197, 223, 249));

        headerLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); 
        headerLbl.setText("Vending Machine");

        GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(headerLbl)
                .addContainerGap(433, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(headerLbl)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        // BACK BUTTON

        backBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 24));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/cross.png")));
        backBtn.setBorderPainted(false);

        GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cokeQty)
                            .addComponent(cokeImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cokeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cokeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spriteQty)
                            .addComponent(spriteImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spriteLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spriteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mountaindewQty)
                            .addComponent(mountaindewImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mountaindewLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mountaindewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(royalQty)
                            .addComponent(royalImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(royalLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(royalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fantaQty, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fantaImg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fantaLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fantaBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(schweppesQty)
                            .addComponent(schweppesImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(schweppesLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(schweppesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(redbullQty)
                            .addComponent(redbullImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(redbullLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(redbullBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(canadadryQty)
                            .addComponent(canadadryImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(canadadryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(canadadryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(305, 305, 305))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mountaindewQty)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mountaindewImg)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mountaindewLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mountaindewBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spriteQty)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spriteImg)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spriteLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spriteBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cokeQty)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cokeImg)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cokeLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cokeBtn)))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(redbullQty)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(redbullImg)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(redbullLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(redbullBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(canadadryQty)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(canadadryImg)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(canadadryLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(canadadryBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(schweppesQty)
                                            .addComponent(fantaQty))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(schweppesImg)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(schweppesLbl)
                                                            .addComponent(fantaLbl))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(schweppesBtn))
                                                    .addComponent(fantaBtn, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addComponent(fantaImg)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(royalQty)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(royalImg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(royalLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(royalBtn)))
                        .addGap(26, 26, 26)
                        .addComponent(backBtn)))
                .addGap(0, 39, Short.MAX_VALUE))
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
     * Get the add to cart button for coke
     * @return JButton
     */
    public JButton getCokeBtn() {
        return cokeBtn;
    }

    /**
     * Get the add to cart button for Sprite
     * @return JButton
     */
    public JButton getSpriteBtn() {
        return spriteBtn;
    }

    /**
     * Get the add to cart button for mountain dew
     * @return JButton
     */
    public JButton getMountainDewBtn() {
        return mountaindewBtn;
    }

    /**
     * Get the add to cart button for royal
     * @return JButton
     */
    public JButton getRoyalBtn() {
        return royalBtn;
    }

    /**
     * Get the add to cart button for fanta
     * @return JButton
     */
    public JButton getFantaBtn() {
        return fantaBtn;
    }

    /**
     * Get the add to cart button for Schweppes
     * @return JButton
     */
    public JButton getSchweppesBtn() {
        return schweppesBtn;
    }

    /**
     * Get the add to cart button for Red Bull
     * @return JButton
     */
    public JButton getRedBullBtn() {
        return redbullBtn;
    }

    /**
     * Get the add to cart button for Canada Dry
     * @return JButton
     */
    public JButton getCanadaDryBtn() {
        return canadadryBtn;
    }

    /**
     * Get the button for returning from the purchase section.
     * @return
     */
    public JButton getBackButton() {
        return backBtn;
    }
}