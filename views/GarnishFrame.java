package views;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import models.SpecialVendingMachine;
import models.Garnish;
import controllers.CreateController;

/**
 * This is the view frame for the garnish section when purchasing from a special
 * vending machine
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class GarnishFrame extends JFrame {
                 

    private JLabel headerLbl;
    private JPanel headerPanel;
    
    private JLabel drinksImg, spiritsImg, garnishesImg;
    private JLabel drinksLbl, spiritsLbl, garnishesLbl;
    
    private JSpinner oliveSpinner, cherrySpinner, lemonSpinner, orangeSpinner;
    private JButton oliveAdd, cherryAdd, lemonAdd, orangeAdd;
    private JLabel oliveImg, cherryImg, lemonImg, orangeImg;
    private JLabel oliveLbl, cherryLbl, lemonLbl, orangeLbl;
    private JLabel olivePrice, cherryPrice, lemonPrice, orangePrice;
    private JLabel oliveQty, cherryQty, lemonQty, orangeQty;

    private JButton backBtn;
    private JButton proceedBtn;
    private JButton leftBtn;

    ArrayList<Garnish> selectedGarnishes = new ArrayList<>();
    Garnish selected;

    public GarnishFrame() {
        headerPanel = new JPanel();
        headerLbl = new JLabel();
        proceedBtn = new JButton();
        backBtn = new JButton();
        oliveQty = new JLabel();
        cherryPrice = new JLabel();
        lemonPrice = new JLabel();
        orangePrice = new JLabel();
        olivePrice = new JLabel();
        oliveLbl = new JLabel();
        oliveImg = new JLabel();
        cherryQty = new JLabel();
        oliveAdd = new JButton();
        cherryLbl = new JLabel();
        cherryAdd = new JButton();
        lemonAdd = new JButton();
        orangeAdd = new JButton();
        drinksLbl = new JLabel();
        spiritsLbl = new JLabel();
        garnishesLbl = new JLabel();
        drinksImg = new JLabel();
        spiritsImg = new JLabel();
        cherryImg = new JLabel();
        garnishesImg = new JLabel();
        lemonQty = new JLabel();
        lemonLbl = new JLabel();
        lemonImg = new JLabel();
        orangeQty = new JLabel();
        orangeLbl = new JLabel();
        orangeImg = new JLabel();
        oliveSpinner = new JSpinner();
        cherrySpinner = new JSpinner();
        lemonSpinner = new JSpinner();
        orangeSpinner = new JSpinner();
        leftBtn = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 800));

        SpecialVendingMachine vendingMachine = CreateController.getSpecialVendingMachineInstance();
        ArrayList<Garnish> garnishes = vendingMachine.getGarnishSlot();

        // OLIVES
        selected = garnishes.get(0);
        selectedGarnishes.add(selected);
        oliveQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        oliveQty.setText("QTY: " + selected.getStock());

        olivePrice.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        olivePrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        olivePrice.setText("₱" + selected.getPrice());

        oliveLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        oliveLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oliveLbl.setText(selected.getName());

        oliveImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/olive.jpg"))); 

        oliveAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        oliveAdd.setText("Add To Cart");

        oliveSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, selected.getStock(), 1));

        // CHERRIES 
        selected = garnishes.get(1);
        selectedGarnishes.add(selected);
        cherryQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        cherryQty.setText("QTY: " + selected.getStock());

        cherryPrice.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        cherryPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cherryPrice.setText("₱" + selected.getPrice());

        cherryLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        cherryLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cherryLbl.setText(selected.getName());

        cherryImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/cherry.jpg"))); 

        cherryAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        cherryAdd.setText("Add To Cart");

        cherrySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, selected.getStock(), 1));

        // LEMON SLICE 
        selected = garnishes.get(2);
        selectedGarnishes.add(selected);
        lemonQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        lemonQty.setText("QTY: " + selected.getStock());

        lemonPrice.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        lemonPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lemonPrice.setText("₱" + selected.getPrice());

        lemonLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        lemonLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lemonLbl.setText(selected.getName());

        lemonImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/lemon.jpg"))); 

        lemonAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        lemonAdd.setText("Add To Cart");

        lemonSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, selected.getStock(), 1));

        // ORANGE SLICE
        selected = garnishes.get(3);
        selectedGarnishes.add(selected);
        orangeQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        orangeQty.setText("QTY: " + selected.getStock());

        orangePrice.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        orangePrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orangePrice.setText("₱" + selected.getPrice());

        orangeLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        orangeLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orangeLbl.setText(selected.getName());

        orangeImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/orange.jpg"))); 

        orangeAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        orangeAdd.setText("Add To Cart");

        orangeSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, selected.getStock(), 1));
        
        // HEADER
        headerPanel.setBackground(new java.awt.Color(197, 223, 249));

        headerLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); 
        headerLbl.setText("Vending Machine");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(headerLbl)
                .addContainerGap(436, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(headerLbl)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        drinksLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        drinksLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        drinksLbl.setText("DRINKS");
        drinksImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/drinksGray.jpg"))); 

        spiritsLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        spiritsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spiritsLbl.setText("SPIRITS");
        spiritsImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/spiritsGray.jpg"))); 

        garnishesLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        garnishesLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        garnishesLbl.setText("GARNISHES");
        garnishesImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/garnishes.jpg"))); 

        // BUTTONS 
        leftBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/left.png"))); 
        leftBtn.setBorderPainted(false);
        
        proceedBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); 
        proceedBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/check.png"))); 
        proceedBtn.setBorderPainted(false);

        backBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); 
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/cross.png"))); 
        backBtn.setBorderPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 88, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(proceedBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leftBtn)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(drinksLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(drinksImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spiritsImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spiritsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(garnishesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(garnishesImg))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(oliveAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cherryAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lemonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(orangeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(oliveSpinner)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(oliveLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(oliveImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(oliveQty)
                                        .addComponent(olivePrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cherrySpinner)
                                    .addComponent(cherryQty)
                                    .addComponent(cherryImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cherryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cherryPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lemonSpinner)
                                    .addComponent(lemonQty)
                                    .addComponent(lemonImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lemonLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lemonPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(orangePrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(orangeQty, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orangeImg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(orangeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(orangeSpinner))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(drinksLbl)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drinksImg)
                        .addGap(18, 18, 18)
                        .addComponent(spiritsLbl)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spiritsImg))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(leftBtn)))
                        .addGap(18, 18, 18)
                        .addComponent(garnishesLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(garnishesImg))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cherryQty)
                                        .addComponent(oliveQty))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cherryImg))
                                .addComponent(oliveImg))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lemonQty)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lemonImg)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lemonLbl)
                                            .addComponent(cherryLbl)
                                            .addComponent(oliveLbl)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(orangeQty)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(orangeImg)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(orangeLbl)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lemonPrice)
                                    .addComponent(orangePrice)
                                    .addComponent(olivePrice)
                                    .addComponent(cherryPrice))))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oliveSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cherrySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lemonSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orangeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oliveAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cherryAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lemonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orangeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proceedBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pack();
    }

    /**
     * Call the frame window
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

    //Getters

    /**
     * Get the add to cart button for Olive
     * @return JButton
     */
    public JButton getOliveAdd() {
        return oliveAdd;
    }

    /**
     * Get the add to cart button for Cherry
     * @return JButton
     */
    public JButton getCherryAdd() {
        return cherryAdd;
    }

    /**
     * Get the add to cart button for Lemon Slice
     * @return JButton
     */
    public JButton getLemonAdd() {
        return lemonAdd;
    }

    /**
     * Get the add to cart button for Orange Slice
     * @return JButton
     */
    public JButton getOrangeAdd() {
        return orangeAdd;
    }

    /**
     * Get the button for returning from the purchasing section
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
     * Get the button for returning to spirit section
     * @return JButton
     */
    public JButton getLeftButton() {
        return leftBtn;
    }

    /**
     * Get the spinner for Olive
     * @return JSpinner
     */
    public JSpinner getOliveSpinner(){

        return oliveSpinner;
    }

    /**
     * Get the spinner for Cherry
     * @return JSpinner
     */
    public JSpinner getCherrySpinner(){

        return cherrySpinner;
    }

    /**
     * Get the spinner for Lemon Slice
     * @return JSpinner
     */
    public JSpinner getLemonSpinner(){

        return lemonSpinner;
    }

    /**
     * Get the spinner for Orange Slice
     * @return JSpinner
     */
    public JSpinner getOrangeSpinner(){

        return orangeSpinner;
    }

}
