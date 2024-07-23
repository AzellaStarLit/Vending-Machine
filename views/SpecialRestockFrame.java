package views;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import models.SpecialVendingMachine;
import models.Item;
import models.Spirit;
import models.Garnish;

import controllers.CreateController;

/**
 * This is the view frame for restocking the items of a special vending machine
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class SpecialRestockFrame extends JFrame {
                    
    private JLabel headerLbl;
    private JPanel headerPanel;

    private JLabel cokeLbl, spriteLbl, mountaindewLbl, royalLbl, fantaLbl, schweppesLbl, redbullLbl, canadadryLbl;
    private JButton cokeRestock, spriteRestock, mountaindewRestock, royalRestock, fantaRestock, schweppesRestock, redbullRestock, canadadryRestock;
    private JLabel cokeQty, spriteQty, mountaindewQty, royalQty, fantaQty, schweppesQty, redbullQty, canadadryQty;

    private JLabel vodkaLbl, ginLbl, whiskeyLbl, tequilaLbl;
    private JLabel oliveLbl, cherryLbl, lemonLbl, orangeLbl;

    private JButton vodkaRestock, ginRestock, whiskeyRestock, tequilaRestock;
    private JButton oliveRestock, cherryRestock, lemonRestock, orangeRestock;
    
    private JLabel vodkaQty, ginQty, whiskeyQty, tequilaQty; 
    private JLabel oliveQty, cherryQty, lemonQty, orangeQty;

    private JButton backBtn;

    ArrayList<Item> selectedItems = new ArrayList<>();
    ArrayList<Spirit> selectedSpirits = new ArrayList<>();
    ArrayList<Garnish> selectedGarnishes = new ArrayList<>();
    Item selected;
    Spirit selected1;
    Garnish selected2;


    public SpecialRestockFrame() {

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

        vodkaRestock = new JButton();
        vodkaLbl = new JLabel();
        tequilaLbl = new JLabel();
        tequilaQty = new JLabel();
        whiskeyQty = new JLabel();
        oliveRestock = new JButton();
        oliveLbl = new JLabel();
        orangeLbl = new JLabel();
        orangeQty = new JLabel();
        lemonQty = new JLabel();
        cherryRestock = new JButton();
        cherryLbl = new JLabel();
        cherryQty = new JLabel();
        lemonRestock = new JButton();
        lemonLbl = new JLabel();
        oliveQty = new JLabel();
        orangeRestock = new JButton();
        ginRestock = new JButton();
        ginLbl = new JLabel();
        ginQty = new JLabel();
        whiskeyRestock = new JButton();
        whiskeyLbl = new JLabel();
        vodkaQty = new JLabel();
        tequilaRestock = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 800));

        SpecialVendingMachine vendingMachine = CreateController.getSpecialVendingMachineInstance();
        ArrayList<Item> items = vendingMachine.getItemSlot();
        ArrayList<Spirit> spirits = vendingMachine.getSpiritSlot();
        ArrayList<Garnish> garnishes = vendingMachine.getGarnishSlot();

        // COKE
        selected = items.get(0);
        selectedItems.add(selected); 
        cokeLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        cokeLbl.setText(selected.getName());
        cokeQty.setText("QTY: " + selected.getStock());

        cokeRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        cokeRestock.setText("Restock");

        // SPRITE
        selected = items.get(1);
        selectedItems.add(selected);
        spriteLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        spriteLbl.setText(selected.getName());
        spriteQty.setText("QTY: " + selected.getStock());

        spriteRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        spriteRestock.setText("Restock");


        // MOUNTAIN DEW
        selected = items.get(2);
        selectedItems.add(selected);
        mountaindewLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        mountaindewLbl.setText(selected.getName());
        mountaindewQty.setText("QTY: " + selected.getStock());

        mountaindewRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        mountaindewRestock.setText("Restock");

        // ROYAL
        selected = items.get(3);
        selectedItems.add(selected);
        royalLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        royalLbl.setText(selected.getName());
        royalQty.setText("QTY: " + selected.getStock());

        royalRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        royalRestock.setText("Restock");

        // FANTA
        selected = items.get(4);
        selectedItems.add(selected);
        fantaLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        fantaLbl.setText(selected.getName());
        fantaQty.setText("QTY: " + selected.getStock());

        fantaRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        fantaRestock.setText("Restock");

        // SCHWEPPES
        selected = items.get(5);
        selectedItems.add(selected);
        schweppesLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        schweppesLbl.setText(selected.getName());
        schweppesQty.setText("QTY: " + selected.getStock());

        schweppesRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        schweppesRestock.setText("Restock");

        // RED BULL
        selected = items.get(6);
        selectedItems.add(selected);
        redbullLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        redbullLbl.setText(selected.getName());
        redbullQty.setText("QTY: " + selected.getStock());

        redbullRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        redbullRestock.setText("Restock");

        // CANADA DRY
        selected = items.get(7);
        selectedItems.add(selected);
        canadadryLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        canadadryLbl.setText(selected.getName());
        canadadryQty.setText("QTY: " + selected.getStock());

        canadadryRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        canadadryRestock.setText("Restock");

        // BACK Button
        backBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 24));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/cross.png")));
        backBtn.setBorderPainted(false);

        // HEADER
        headerPanel.setBackground(new java.awt.Color(197, 223, 249));

        headerLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 36));
        headerLbl.setText("Maintenance");

        // VODKA
        selected1 = spirits.get(0);
        selectedSpirits.add(selected1);
        vodkaRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        vodkaRestock.setText("Restock");

        vodkaLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        vodkaLbl.setText("Vodka");

        vodkaQty.setText("QTY: " + selected1.getStock());

        // GIN
        selected1 = spirits.get(1);
        selectedSpirits.add(selected1);
        ginRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        ginRestock.setText("Restock");

        ginLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        ginLbl.setText("Gin");

        ginQty.setText("QTY: " + selected1.getStock());
        
        // WHISKEY
        selected1 = spirits.get(2);
        selectedSpirits.add(selected1);
        whiskeyQty.setText("QTY: " + selected1.getStock());

        whiskeyRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        whiskeyRestock.setText("Restock");

        whiskeyLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        whiskeyLbl.setText("Whiskey");

        // TEQUILA
        selected1 = spirits.get(3);
        selectedSpirits.add(selected1);
        tequilaLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        tequilaLbl.setText("Tequila");

        tequilaQty.setText("QTY: " + selected1.getStock());

        tequilaRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        tequilaRestock.setText("Restock");

        // OLIVE
        selected2 = garnishes.get(0);
        selectedGarnishes.add(selected2);
        oliveRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        oliveRestock.setText("Restock");

        oliveLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        oliveLbl.setText("Olives");

        oliveQty.setText("QTY: " + selected2.getStock());
       
        // CHERRY
        selected2 = garnishes.get(1);
        selectedGarnishes.add(selected2);
        cherryRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        cherryRestock.setText("Restock");

        cherryLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        cherryLbl.setText("Cherries");

        cherryQty.setText("QTY: " + selected2.getStock());
        
        // LEMON
        selected2 = garnishes.get(2);
        selectedGarnishes.add(selected2);
        lemonRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        lemonRestock.setText("Restock");

        lemonLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        lemonLbl.setText("Lemon Slice");
        lemonQty.setText("QTY: 10");
        
        // ORANGE
        selected2 = garnishes.get(3);
        selectedGarnishes.add(selected2);
        orangeLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        orangeLbl.setText("Orange Slice");

        orangeQty.setText("QTY: " + selected2.getStock());

        orangeRestock.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        orangeRestock.setText("Restock");

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
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vodkaRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vodkaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vodkaQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ginRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ginLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ginQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(whiskeyRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(whiskeyLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(whiskeyQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tequilaRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tequilaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tequilaQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(oliveRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oliveLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oliveQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cherryRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cherryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cherryQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lemonRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lemonLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lemonQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orangeRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orangeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orangeQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cokeRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cokeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cokeQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spriteRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spriteLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spriteQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
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
                            .addComponent(fantaRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fantaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fantaQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(schweppesRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(schweppesLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(schweppesQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(redbullRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(redbullLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(redbullQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(canadadryRestock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(canadadryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(canadadryQty, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(backBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(spriteRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(royalRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(schweppesRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(canadadryRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vodkaLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vodkaQty))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ginLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ginQty)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(vodkaRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ginRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(whiskeyLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(whiskeyQty))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tequilaLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tequilaQty)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(whiskeyRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tequilaRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(oliveLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oliveQty))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cherryLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cherryQty)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(oliveRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cherryRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lemonLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lemonQty))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(orangeLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(orangeQty)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lemonRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orangeRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
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

    //Item setters

    /**
     * Display the stocks of coke
     * @param quantity stock value
     */
    public void setCokeQuantity(int quantity) {
        cokeQty.setText("QTY: " + quantity);
    }

    /**
     * Display the stocks of sprite
     * @param quantity stock value
     */
    public void setSpriteQuantity(int quantity) {
        spriteQty.setText("QTY: " + quantity);
    }

    /**
     * Display the stocks of mountain dew
     * @param quantity stock value
     */
    public void setMountainDewQuantity(int quantity) {
        mountaindewQty.setText("QTY: " + quantity);
    }

    /**
     * Display the stocks of royal
     * @param quantity stock value
     */
    public void setRoyalQuantity(int quantity) {
        royalQty.setText("QTY: " + quantity);
    }

    /**
     * Display the stocks of fanta
     * @param quantity stock value
     */
    public void setFantaQuantity(int quantity) {
        fantaQty.setText("QTY: " + quantity);
    }

    /**
     * Display the stocks of schweppes
     * @param quantity stock value
     */
    public void setSchweppesQuantity(int quantity) {
        schweppesQty.setText("QTY: " + quantity);
    }

    /**
     * Display the stocks of red bull
     * @param quantity stock value
     */
    public void setRedBullQuantity(int quantity) {
        redbullQty.setText("QTY: " + quantity);
    }

    /**
     * Display the stocks of canada dry
     * @param quantity stock value
     */
    public void setCanadaDryQuantity(int quantity) {
        canadadryQty.setText("QTY: " + quantity);
    }

    //Item getters

    /**
     * Get the button for restocking coke
     * @return JButton
     */
    public JButton getCokeRestockButton() {
        return cokeRestock;
    }

    /**
     * Get the button for restocking sprite
     * @return JButton
     */
    public JButton getSpriteRestockButton() {
        return spriteRestock;
    }

    /**
     * Get the button for restocking mountain dew
     * @return JButton
     */
    public JButton getMountainDewRestockButton() {
        return mountaindewRestock;
    }

    /**
     * Get the button for restocking royal
     * @return JButton
     */
    public JButton getRoyalRestockButton() {
        return royalRestock;
    }

    /**
     * Get the button for restocking fanta
     * @return JButton
     */
    public JButton getFantaRestockButton() {
        return fantaRestock;
    }

    /**
     * Get the button for restocking schweppes
     * @return JButton
     */
    public JButton getSchweppesRestockButton() {
        return schweppesRestock;
    }

    /**
     * Get the button for restocking red bull
     * @return JButton
     */
    public JButton getRedBullRestockButton() {
        return redbullRestock;
    }

    /**
     * Get the button for restocking canada dry
     * @return JButton
     */
    public JButton getCanadaDryRestockButton() {
        return canadadryRestock;
    }

    /**
     * Get the button for returning from the restock section
     * @return JButton
     */
    public JButton getBackButton() {
        return backBtn;
    }

    //Spirit Setters

    /**
     * Set the stocks of vodka
     * @param quantity stock value
     */
     public void setVodkaQuantity(int quantity) {
        vodkaQty.setText("QTY: " + quantity);
    }

    /**
     * Set the stocks of gin
     * @param quantity stock value
     */
    public void setGinQuantity(int quantity) {
        ginQty.setText("QTY: " + quantity);
    }

    /**
     * Set the stocks of whiskey
     * @param quantity stock value
     */
    public void setWhiskeyQuantity(int quantity) {
        whiskeyQty.setText("QTY: " + quantity);
    }

    /**
     * Set the stocks of tequila
     * @param quantity stock value
     */
    public void setTequilaQuantity(int quantity) {
        tequilaQty.setText("QTY: " + quantity);
    }

    //Garnish setters

    /**
     * Set the stocks of olive
     * @param quantity stock value
     */
    public void setOliveQuantity(int quantity) {
        oliveQty.setText("QTY: " + quantity);
    }

    /**
     * Set the stocks of cherry
     * @param quantity stock value
     */
    public void setCherryQuantity(int quantity) {
        cherryQty.setText("QTY: " + quantity);
    }

    /**
     * Set the stocks of lemon slice
     * @param quantity stock value
     */
    public void setLemonQuantity(int quantity) {
        lemonQty.setText("QTY: " + quantity);
    }

    /**
     * Set the stocks of orange slice
     * @param quantity stock value
     */
    public void setOrangeQuantity(int quantity) {
        orangeQty.setText("QTY: " + quantity);
    }

    //Spirit Getters
    /**
     * Get the button for restocking vodka
     * @return JButton
     */
    public JButton getVodkaRestockButton() {
        return vodkaRestock;
    }

    /**
     * Get the button for restocking gin
     * @return JButton
     */
    public JButton getGinRestockButton() {
        return ginRestock;
    }

    /**
     * Get the button for restocking whiskey
     * @return JButton
     */
    public JButton getWhiskeyRestockButton() {
        return whiskeyRestock;
    }

    /**
     * Get the button for restocking tequila
     * @return JButton
     */
    public JButton getTequilaRestockButton() {
        return tequilaRestock;
    }

    //Garnish getters

    /**
     * Get the button for restocking olive
     * @return JButton
     */
    public JButton getOliveRestockButton() {
        return oliveRestock;
    }

    /**
     * Get the button for restocking cherry
     * @return JButton
     */
    public JButton getCherryRestockButton() {
        return cherryRestock;
    }

    /**
     * Get the button for restocking lemon slice
     * @return JButton
     */
    public JButton getLemonRestockButton() {
        return lemonRestock;
    }

    /**
     * Get the button for restocking orange slice
     * @return JButton
     */
    public JButton getOrangeRestockButton() {
        return orangeRestock;
    }
}
