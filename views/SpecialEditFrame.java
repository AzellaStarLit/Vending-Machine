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
 * This is the view frame for editing the prices of items (drink, garnish, spirit) of a
 * special vending machine
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class SpecialEditFrame extends JFrame {
                    
    private JLabel headerLbl;
    private JPanel headerPanel;

    private JLabel cokeLbl, spriteLbl, mountaindewLbl, royalLbl, fantaLbl, schweppesLbl, redbullLbl, canadadryLbl;
    private JButton cokeEdit, spriteEdit, mountaindewEdit, royalEdit, fantaEdit, schweppesEdit, redbullEdit, canadadryEdit;
    private JLabel cokePrice, spritePrice, mountaindewPrice, royalPrice, fantaPrice, schweppesPrice, redbullPrice, canadadryPrice;

    private JLabel vodkaLbl, ginLbl, whiskeyLbl, tequilaLbl;
    private JLabel oliveLbl, cherryLbl, lemonLbl, orangeLbl;

    private JButton vodkaEdit, ginEdit, whiskeyEdit, tequilaEdit;
    private JButton oliveEdit, cherryEdit, lemonEdit, orangeEdit;
    
    private JLabel vodkaPrice, ginPrice, whiskeyPrice, tequilaPrice; 
    private JLabel olivePrice, cherryPrice, lemonPrice, orangePrice;

    private JButton backBtn;

    ArrayList<Item> selectedItems = new ArrayList<>();
    ArrayList<Spirit> selectedSpirits = new ArrayList<>();
    ArrayList<Garnish> selectedGarnishes = new ArrayList<>();
    Item selected;
    Spirit selected1;
    Garnish selected2;


    public SpecialEditFrame() {

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

        vodkaEdit = new JButton();
        vodkaLbl = new JLabel();
        tequilaLbl = new JLabel();
        tequilaPrice = new JLabel();
        whiskeyPrice = new JLabel();
        oliveEdit = new JButton();
        oliveLbl = new JLabel();
        orangeLbl = new JLabel();
        orangePrice = new JLabel();
        lemonPrice = new JLabel();
        cherryEdit = new JButton();
        cherryLbl = new JLabel();
        cherryPrice = new JLabel();
        lemonEdit = new JButton();
        lemonLbl = new JLabel();
        olivePrice = new JLabel();
        orangeEdit = new JButton();
        ginEdit = new JButton();
        ginLbl = new JLabel();
        ginPrice = new JLabel();
        whiskeyEdit = new JButton();
        whiskeyLbl = new JLabel();
        vodkaPrice = new JLabel();
        tequilaEdit = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 800));

        SpecialVendingMachine vendingMachine = CreateController.getSpecialVendingMachineInstance();
        ArrayList<Item> items = vendingMachine.getItemSlot();
        ArrayList<Spirit> items1 = vendingMachine.getSpiritSlot();
        ArrayList<Garnish> items2 = vendingMachine.getGarnishSlot();

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

        // VODKA
        selected1 = items1.get(0);
        selectedSpirits.add(selected1);
        vodkaEdit.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        vodkaEdit.setText("Edit Price");

        vodkaLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        vodkaLbl.setText("Vodka");

        vodkaPrice.setText("₱" + selected1.getPrice());


        // GIN
        selected1 = items1.get(1);
        selectedSpirits.add(selected1);
        ginEdit.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        ginEdit.setText("Edit Price");

        ginLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        ginLbl.setText("Gin");

        ginPrice.setText("₱" + selected1.getPrice());
        
        // WHISKEY
        selected1 = items1.get(2);
        selectedSpirits.add(selected1);
        whiskeyPrice.setText("₱" + selected1.getPrice());

        whiskeyEdit.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        whiskeyEdit.setText("Edit Price");

        whiskeyLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        whiskeyLbl.setText("Whiskey");

        // TEQUILA
        selected1 = items1.get(3);
        selectedSpirits.add(selected1);
        tequilaLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        tequilaLbl.setText("Tequila");

        tequilaPrice.setText("₱" + selected1.getPrice());

        tequilaEdit.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        tequilaEdit.setText("Edit Price");

        // OLIVE
        selected2 = items2.get(0);
        selectedGarnishes.add(selected2);
        oliveEdit.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        oliveEdit.setText("Edit Price");

        oliveLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        oliveLbl.setText("Olives");

        olivePrice.setText("₱" + selected2.getPrice());
       
        // CHERRY
        selected2 = items2.get(1);
        selectedGarnishes.add(selected2);
        cherryEdit.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        cherryEdit.setText("Edit Price");

        cherryLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        cherryLbl.setText("Cherries");

        cherryPrice.setText("₱" + selected2.getPrice());
        
        // LEMON
        selected2 = items2.get(2);
        selectedGarnishes.add(selected2);
        lemonEdit.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        lemonEdit.setText("Edit Price");

        lemonLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        lemonLbl.setText("Lemon Slice");
        lemonPrice.setText("₱" + selected2.getPrice());
        
        // ORANGE
        selected2 = items2.get(3);
        selectedGarnishes.add(selected2);
        orangeLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        orangeLbl.setText("Orange Slice");

        orangePrice.setText("₱" + selected2.getPrice());

        orangeEdit.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        orangeEdit.setText("Edit Price");

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
                            .addComponent(vodkaEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vodkaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vodkaPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ginEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ginLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ginPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(whiskeyEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(whiskeyLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(whiskeyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tequilaEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tequilaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tequilaPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(oliveEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oliveLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(olivePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cherryEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cherryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cherryPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lemonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lemonLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lemonPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orangeEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orangeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orangePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cokeEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cokeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cokePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spriteEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spriteLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spritePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
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
                            .addComponent(fantaEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fantaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fantaPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(schweppesEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(schweppesLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(schweppesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(redbullEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(redbullLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(redbullPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(canadadryEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(canadadryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(canadadryPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                .addComponent(cokePrice))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spriteLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spritePrice)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cokeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spriteEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(royalEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(schweppesEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(canadadryEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vodkaLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vodkaPrice))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ginLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ginPrice)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(vodkaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ginEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(whiskeyLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(whiskeyPrice))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tequilaLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tequilaPrice)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(whiskeyEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tequilaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(oliveLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(olivePrice))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cherryLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cherryPrice)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(oliveEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cherryEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lemonLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lemonPrice))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(orangeLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(orangePrice)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lemonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orangeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
     * Set the price of coke
     * @param price new value
     */
    public void setCokePrice(int price) {
        cokePrice.setText("₱" + price);
    }

    /**
     * Set the price of sprite
     * @param price new value
     */
    public void setSpritePrice(int price) {
        spritePrice.setText("₱" + price);
    }

    /**
     * Set the price of mountain dew
     * @param price new value
     */
    public void setMountainDewPrice(int price) {
        mountaindewPrice.setText("₱" + price);
    }

    /**
     * Set the price of royal
     * @param price new value
     */
    public void setRoyalPrice(int price) {
        royalPrice.setText("₱" + price);
    }

    /**
     * Set the price of fanta
     * @param price new value
     */
    public void setFantaPrice(int price) {
        fantaPrice.setText("₱" + price);
    }

    /**
     * Set the price of schweppes
     * @param price new value
     */
    public void setSchweppesPrice(int price) {
        schweppesPrice.setText("₱" + price);
    }

    /**
     * Set the price of red bull
     * @param price new value
     */
    public void setRedBullPrice(int price) {
        redbullPrice.setText("₱" + price);
    }

    /**
     * Set the price of canada dry
     * @param price new value
     */
    public void setCanadaDryPrice(int price) {
        canadadryPrice.setText("₱" + price);
    }

    //Item getters
    /**
     * Get the button for editing the price of coke
     * @return JButton
     */
    public JButton getCokeEditButton() {
        return cokeEdit;
    }

    /**
     * Get the button for editing the price of sprite
     * @return JButton
     */
    public JButton getSpriteEditButton() {
        return spriteEdit;
    }

    /**
     * Get the button for editing the price of mountain dew
     * @return JButton
     */
    public JButton getMountainDewEditButton() {
        return mountaindewEdit;
    }

    /**
     * Get the button for editing the price of royal
     * @return JButton
     */
    public JButton getRoyalEditButton() {
        return royalEdit;
    }

    /**
     * Get the button for editing the price of fanta
     * @return JButton
     */
    public JButton getFantaEditButton() {
        return fantaEdit;
    }

    /**
     * Get the button for editing the price of Schweppes
     * @return JButton
     */
    public JButton getSchweppesEditButton() {
        return schweppesEdit;
    }

    /**
     * Get the button for editing the price of red bull
     * @return JButton
     */
    public JButton getRedBullEditButton() {
        return redbullEdit;
    }

    /**
     * Get the button for editing the price of canada dry
     * @return JButton
     */
    public JButton getCanadaDryEditButton() {
        return canadadryEdit;
    }

    /**
     * Get the button for returning from the edit menu
     * @return
     */
    public JButton getBackButton() {
        return backBtn;
    }

    //Spirit setters
    /**
     * Change the price of vodka
     * @param price new value
     */
     public void setVodkaPrice(int price) {
        vodkaPrice.setText("₱" + price);
    }

    /**
     * Change the price of gin
     * @param price new value
     */
    public void setGinPrice(int price) {
        ginPrice.setText("₱" + price);
    }

    /**
     * Change the price of whiskey
     * @param price new value
     */
    public void setWhiskeyPrice(int price) {
        whiskeyPrice.setText("₱" + price);
    }

    /**
     * Change the price of tequila
     * @param price new value
     */
    public void setTequilaPrice(int price) {
        tequilaPrice.setText("₱" + price);
    }

    //Garnish setters
    /**
     * Change the price of olive
     * @param price new value
     */
    public void setOlivePrice(int price) {
        olivePrice.setText("₱" + price);
    }

    /**
     * Change the price of cherry
     * @param price new value
     */
    public void setCherryPrice(int price) {
        cherryPrice.setText("₱" + price);
    }

    /**
     * Change the price of lemon slice
     * @param price new value
     */
    public void setLemonPrice(int price) {
        lemonPrice.setText("₱" + price);
    }

    /**
     * Change the price of orange slice
     * @param price new value
     */
    public void setOrangePrice(int price) {
        orangePrice.setText("₱" + price);
    }

    //Spirit getters

    /**
     * Get the button for editing the price of vodka
     * @return JButton
     */
    public JButton getVodkaEditButton() {
        return vodkaEdit;
    }

    /**
     * Get the button for editing the price of gin
     * @return JButton
     */
    public JButton getGinEditButton() {
        return ginEdit;
    }

    /**
     * Get the button for editing the price of whiskey
     * @return JButton
     */
    public JButton getWhiskeyEditButton() {
        return whiskeyEdit;
    }

    /**
     * Get the button for editing the price of tequila
     * @return JButton
     */
    public JButton getTequilaEditButton() {
        return tequilaEdit;
    }

    //Garnish getters
    /**
     * Get the button for editing the price of olive
     * @return JButton
     */
    public JButton getOliveEditButton() {
        return oliveEdit;
    }

    /**
     * Get the button for editing the price of cherry
     * @return JButton
     */
    public JButton getCherryEditButton() {
        return cherryEdit;
    }

    /**
     * Get the button for editing the price of lemon slice
     * @return JButton
     */
    public JButton getLemonEditButton() {
        return lemonEdit;
    }

    /**
     * Get the button for editing the price of orange slice
     * @return JButton
     */
    public JButton getOrangeEditButton() {
        return orangeEdit;
    }
}
