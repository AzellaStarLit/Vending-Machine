package views;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import models.SpecialVendingMachine;
import models.Item;
import controllers.CreateController;

/**
 * This is the view frame for displaying the items (drink) available for purchase
 * in a special vending machine.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class SpecialVendingFrame extends JFrame {

    private JLabel headerLbl;
    private JPanel headerPanel;

    private JButton cokeAdd, spriteAdd, mountaindewAdd, royalAdd, fantaAdd, schweppesAdd, redbullAdd, canadadryAdd;
    private JLabel cokeImg, spriteImg, mountaindewImg, royalImg, fantaImg, schweppesImg, redbullImg, canadadryImg;
    private JLabel cokeLbl, spriteLbl, mountaindewLbl, royalLbl, fantaLbl, schweppesLbl, redbullLbl, canadadryLbl;
    private JLabel cokeQty, spriteQty, mountaindewQty, royalQty, fantaQty, schweppesQty, redbullQty, canadadryQty;
    private JLabel cokePrice, spritePrice, mountaindewPrice, royalPrice, fantaPrice, schweppesPrice, redbullPrice, canadadryPrice;

    private JLabel drinksImg, spiritsImg, garnishesImg;
    private JLabel drinksLbl, spiritsLbl, garnishesLbl;

    private JButton rightBtn, backBtn, proceedBtn;

    ArrayList<Item> selectedItems = new ArrayList<>();
    Item selected;

    public SpecialVendingFrame() {
        cokeQty = new JLabel();
        cokeLbl = new JLabel();
        cokeImg = new JLabel();
        spriteQty = new JLabel();
        spriteLbl = new JLabel();
        spriteImg = new JLabel();
        mountaindewQty = new JLabel();
        mountaindewLbl = new JLabel();
        mountaindewImg = new JLabel();
        royalQty = new JLabel();
        royalLbl = new JLabel();
        royalImg = new JLabel();
        redbullImg = new JLabel();
        fantaQty = new JLabel();
        canadadryQty = new JLabel();
        canadadryLbl = new JLabel();
        canadadryImg = new JLabel();
        schweppesQty = new JLabel();
        fantaLbl = new JLabel();
        schweppesLbl = new JLabel();
        schweppesImg = new JLabel();
        fantaImg = new JLabel();
        redbullQty = new JLabel();
        redbullLbl = new JLabel();
        headerPanel = new JPanel();
        headerLbl = new JLabel();
        proceedBtn = new JButton();
        backBtn = new JButton();
        spriteQty = new JLabel();
        mountaindewQty = new JLabel();
        royalQty = new JLabel();
        fantaQty = new JLabel();
        schweppesQty = new JLabel();
        redbullQty = new JLabel();
        canadadryQty = new JLabel();
        cokeAdd = new JButton();
        spriteAdd = new JButton();
        mountaindewAdd = new JButton();
        royalAdd = new JButton();
        redbullAdd = new JButton();
        canadadryAdd = new JButton();
        fantaAdd = new JButton();
        schweppesAdd = new JButton();
        drinksLbl = new JLabel();
        spiritsLbl = new JLabel();
        garnishesLbl = new JLabel();
        drinksImg = new JLabel();
        spiritsImg = new JLabel();
        garnishesImg = new JLabel();
        rightBtn = new JButton();
        cokePrice = new JLabel();
        spritePrice = new JLabel();
        mountaindewPrice = new JLabel(); 
        royalPrice = new JLabel();
        fantaPrice = new JLabel();
        schweppesPrice = new JLabel();
        redbullPrice = new JLabel();
        canadadryPrice = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 800));

        SpecialVendingMachine vendingMachine = CreateController.getSpecialVendingMachineInstance();
        ArrayList<Item> items = vendingMachine.getItemSlot();

        // COKE
        selected = items.get(0);
        selectedItems.add(selected);
        cokeQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        cokeQty.setText("QTY: " + selected.getStock());
        
        cokePrice.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        cokePrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cokePrice.setText("₱" + selected.getPrice());
        
        cokeLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        cokeLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cokeLbl.setText(selected.getName());
        
        cokeImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/coke.jpg")));
        
        cokeAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        cokeAdd.setText("Add To Cart");

        // SPRITE
        selected = items.get(1);
        selectedItems.add(selected);
        spriteQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        spriteQty.setText("QTY: " + selected.getStock());

        spritePrice.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        spritePrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spritePrice.setText("₱" + selected.getPrice());

        spriteLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        spriteLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spriteLbl.setText(selected.getName());
        
        spriteImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/sprite.jpg")));
        
        spriteAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        spriteAdd.setText("Add To Cart");

        // MOUNTAIN DEW
        selected = items.get(2);
        selectedItems.add(selected);
        mountaindewQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        mountaindewQty.setText("QTY: " + selected.getStock());
        
        mountaindewPrice.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        mountaindewPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mountaindewPrice.setText("₱" + selected.getPrice());

        mountaindewLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        mountaindewLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mountaindewLbl.setText(selected.getName());
        
        mountaindewImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/royal.jpg")));
        
        mountaindewAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        mountaindewAdd.setText("Add To Cart");

        // ROYAL
        selected = items.get(3);
        selectedItems.add(selected);
        royalQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        royalQty.setText("QTY: " + selected.getStock());
        
        royalPrice.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        royalPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        royalPrice.setText("₱" + selected.getPrice());

        royalLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        royalLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        royalLbl.setText(selected.getName());
        
        royalImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/mountaindew.jpg")));
        
        royalAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        royalAdd.setText("Add To Cart");

        // FANTA
        selected = items.get(4);
        selectedItems.add(selected);
        fantaQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        fantaQty.setText("QTY: " + selected.getStock());
        
        fantaPrice.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        fantaPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fantaPrice.setText("₱" + selected.getPrice());

        fantaLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        fantaLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fantaLbl.setText(selected.getName());
        
        fantaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/fanta.jpg")));
        
        fantaAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        fantaAdd.setText("Add To Cart");

        // SCHWEPPES
        selected = items.get(5);
        selectedItems.add(selected);
        schweppesQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        schweppesQty.setText("QTY: " + selected.getStock());
        
        schweppesPrice.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        schweppesPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        schweppesPrice.setText("₱" + selected.getPrice());
        
        schweppesLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        schweppesLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        schweppesLbl.setText(selected.getName());
        
        schweppesImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/schweppes.jpg")));
        
        schweppesAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        schweppesAdd.setText("Add To Cart");

        // RED BULL
        selected = items.get(6);
        selectedItems.add(selected);
        redbullQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        redbullQty.setText("QTY: " + selected.getStock());
        
        redbullPrice.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        redbullPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        redbullPrice.setText("₱" + selected.getPrice());

        redbullLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        redbullLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        redbullLbl.setText(selected.getName());
        
        redbullImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/redbull.jpg")));
       
        redbullAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        redbullAdd.setText("Add To Cart");
        

        // CANADA DRY
        selected = items.get(7);
        selectedItems.add(selected);
        canadadryQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        canadadryQty.setText("QTY: " + selected.getStock());
        
        canadadryPrice.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        canadadryPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        canadadryPrice.setText("₱" + selected.getPrice());
        
        canadadryLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        canadadryLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        canadadryLbl.setText(selected.getName());
        
        canadadryImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/canadadry.jpg")));
        
        canadadryAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        canadadryAdd.setText("Add To Cart");
        

        // HEADER
        headerPanel.setBackground(new java.awt.Color(197, 223, 249));
        headerLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 36));
        headerLbl.setText("Vending Machine");

        GroupLayout headerPanelLayout = new GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(headerLbl)
                .addContainerGap(436, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(headerLbl)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        drinksLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        drinksLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        drinksLbl.setText("DRINKS");
        drinksImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/drinks.jpg")));

        spiritsLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        spiritsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spiritsLbl.setText("SPIRITS");
        spiritsImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/spiritsGray.jpg")));

        garnishesLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        garnishesLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        garnishesLbl.setText("GARNISHES");
        garnishesImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/garnishesGray.jpg")));

        rightBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/right.png")));
        rightBtn.setBorderPainted(false);

        backBtn.setFont(new Font("Helvetica Neue", 0, 24));
        backBtn.setIcon(new ImageIcon(getClass().getResource("/views/cross.png")));
        backBtn.setBorderPainted(false);

        proceedBtn.setFont(new Font("Helvetica Neue", 0, 24)); 
        proceedBtn.setIcon(new ImageIcon(getClass().getResource("/views/check.png")));
        proceedBtn.setBorderPainted(false);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(proceedBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(drinksLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(drinksImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spiritsImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spiritsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(garnishesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(garnishesImg))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fantaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(schweppesAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(redbullAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(canadadryAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(fantaQty, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fantaImg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fantaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fantaPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(schweppesQty)
                                            .addComponent(schweppesImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(schweppesLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(schweppesPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(redbullQty)
                                                    .addComponent(redbullLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                    .addComponent(redbullPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(canadadryQty))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(canadadryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                                            .addComponent(canadadryPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(redbullImg)
                                                .addGap(18, 18, 18)
                                                .addComponent(canadadryImg))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(cokeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cokeLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cokeImg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(cokeQty)
                                            .addComponent(cokePrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(spriteQty)
                                            .addComponent(spriteImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(spriteLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(spriteAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spritePrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(mountaindewAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mountaindewQty)
                                            .addComponent(mountaindewImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(mountaindewLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(mountaindewPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(royalAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(royalPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(royalQty, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(royalImg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(royalLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGap(2, 2, 2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rightBtn)))
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(drinksLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drinksImg)
                        .addGap(18, 18, 18)
                        .addComponent(spiritsLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spiritsImg)
                        .addGap(18, 18, 18)
                        .addComponent(garnishesLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(garnishesImg)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(proceedBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(spriteQty)
                                        .addComponent(cokeQty))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spriteImg))
                                .addComponent(cokeImg))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rightBtn)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(mountaindewQty)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mountaindewImg)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(mountaindewLbl)
                                                    .addComponent(spriteLbl)
                                                    .addComponent(cokeLbl)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(royalQty)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(royalImg)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(royalLbl)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(mountaindewPrice)
                                            .addComponent(royalPrice)
                                            .addComponent(cokePrice)
                                            .addComponent(spritePrice))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cokeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spriteAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mountaindewAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(royalAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(schweppesQty)
                                            .addComponent(fantaQty)
                                            .addComponent(redbullQty)
                                            .addComponent(canadadryQty))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fantaImg)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(schweppesImg)
                                            .addComponent(redbullImg)
                                            .addComponent(canadadryImg))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(schweppesLbl)
                                            .addComponent(fantaLbl)
                                            .addComponent(redbullLbl)
                                            .addComponent(canadadryLbl))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(canadadryPrice)
                                .addComponent(redbullPrice))
                            .addComponent(schweppesPrice)
                            .addComponent(fantaPrice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fantaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(schweppesAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(canadadryAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(redbullAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        pack();
    }

    /**
     * Call view frame
     */
    public void init() {
        setSize(800, 800);
        setPreferredSize(new Dimension(800, 800));
        setTitle("Vending Machine");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
        setResizable(false);
    }

    //Item getters

    /**
     * Get the add to cart button for coke
     * @return JButton
     */
    public JButton getCokeAdd() {
        return cokeAdd;
    }

    /**
     * Get the add to cart button for sprite
     * @return JButton
     */
    public JButton getSpriteAdd() {
        return spriteAdd;
    }

    /**
     * Get the add to cart button for mountain dew
     * @return JButton
     */
    public JButton getMountainDewAdd() {
        return mountaindewAdd;
    }

    /**
     * Get the add to cart button for royal
     * @return JButton
     */
    public JButton getRoyalAdd() {
        return royalAdd;
    }

    /**
     * Get the add to cart button for fanta
     * @return JButton
     */
    public JButton getFantaAdd() {
        return fantaAdd;
    }

    /**
     * Get the add to cart button for schweppes
     * @return JButton
     */
    public JButton getSchweppesAdd() {
        return schweppesAdd;
    }

    /**
     * Get the add to cart button for red bull
     * @return JButton
     */
    public JButton getRedBullAdd() {
        return redbullAdd;
    }

    /**
     * Get the add to cart button for canada dry
     * @return JButton
     */
    public JButton getCanadaDryAdd() {
        return canadadryAdd;
    }

    /**
     * Get the button for returning from the vending section
     * @return JButton
     */
    public JButton getBackButton() {
        return backBtn;
    }

    /**
     * Get the button for proceeding to payment
     * @return JButton
     */
    public JButton getProceedButton() {
        return proceedBtn;
    }

    /**
     * Get the button for proceeding to the next section of items
     * @return JButton
     */
    public JButton getRightButton() {
        return rightBtn;
    }

    
}