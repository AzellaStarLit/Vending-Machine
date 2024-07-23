package views;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import models.SpecialVendingMachine;
import models.Spirit;
import controllers.CreateController;

/**
 * This view frame is for displaying the spirits available for combining in a special vending machine.
 * These are not available for independent purchase.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class SpiritFrame extends JFrame {
                 

    private JLabel headerLbl;
    private JPanel headerPanel;
    
    private JLabel drinksImg, spiritsImg, garnishesImg;
    private JLabel drinksLbl, spiritsLbl, garnishesLbl;
    
    private JSpinner vodkaSpinner, ginSpinner, whiskeySpinner, tequilaSpinner;
    private JButton vodkaAdd, ginAdd, whiskeyAdd, tequilaAdd;
    private JLabel vodkaImg, ginImg, whiskeyImg, tequilaImg;
    private JLabel vodkaLbl, ginLbl, whiskeyLbl, tequilaLbl;
    private JLabel vodkaPrice, ginPrice, whiskeyPrice, tequilaPrice;
    private JLabel vodkaQty, ginQty, whiskeyQty, tequilaQty;

    private JButton backBtn;
    private JButton proceedBtn;
    private JButton leftBtn;
    private JButton rightBtn;

    ArrayList<Spirit> selectedSpirits = new ArrayList<>();
    Spirit selected;

    public SpiritFrame() {
        headerPanel = new JPanel();
        headerLbl = new JLabel();
        proceedBtn = new JButton();
        backBtn = new JButton();
        vodkaQty = new JLabel();
        ginPrice = new JLabel();
        whiskeyPrice = new JLabel();
        tequilaPrice = new JLabel();
        vodkaPrice = new JLabel();
        vodkaLbl = new JLabel();
        vodkaImg = new JLabel();
        ginQty = new JLabel();
        vodkaAdd = new JButton();
        ginLbl = new JLabel();
        ginAdd = new JButton();
        whiskeyAdd = new JButton();
        tequilaAdd = new JButton();
        drinksLbl = new JLabel();
        spiritsLbl = new JLabel();
        garnishesLbl = new JLabel();
        drinksImg = new JLabel();
        spiritsImg = new JLabel();
        ginImg = new JLabel();
        garnishesImg = new JLabel();
        whiskeyQty = new JLabel();
        whiskeyLbl = new JLabel();
        whiskeyImg = new JLabel();
        tequilaQty = new JLabel();
        tequilaLbl = new JLabel();
        tequilaImg = new JLabel();
        vodkaSpinner = new JSpinner();
        ginSpinner = new JSpinner();
        whiskeySpinner = new JSpinner();
        tequilaSpinner = new JSpinner();
        leftBtn = new JButton();
        rightBtn = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 800));

        SpecialVendingMachine vendingMachine = CreateController.getSpecialVendingMachineInstance();
        ArrayList<Spirit> spirits = vendingMachine.getSpiritSlot();

        // VODKA
        selected = spirits.get(0);
        selectedSpirits.add(selected);
        vodkaQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        vodkaQty.setText("QTY: " + selected.getStock());

        vodkaPrice.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        vodkaPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vodkaPrice.setText("₱" + selected.getPrice());

        vodkaLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        vodkaLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vodkaLbl.setText(selected.getName());

        vodkaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/vodka.jpg"))); 

        vodkaAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        vodkaAdd.setText("Add To Cart");

        vodkaSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, selected.getStock(), 1));

        // GIN 
        selected = spirits.get(1);
        selectedSpirits.add(selected);
        ginQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        ginQty.setText("QTY: " + selected.getStock());

        ginPrice.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        ginPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ginPrice.setText("₱" + selected.getPrice());

        ginLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        ginLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ginLbl.setText(selected.getName());

        ginImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/gin.jpg"))); 

        ginAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        ginAdd.setText("Add To Cart");

        ginSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, selected.getStock(), 1));

        // whiskey SLICE 
        selected = spirits.get(2);
        selectedSpirits.add(selected);
        whiskeyQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        whiskeyQty.setText("QTY: " + selected.getStock());

        whiskeyPrice.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        whiskeyPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whiskeyPrice.setText("₱" + selected.getPrice());

        whiskeyLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        whiskeyLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whiskeyLbl.setText(selected.getName());

        whiskeyImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/whiskey.jpg"))); 

        whiskeyAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        whiskeyAdd.setText("Add To Cart");

        whiskeySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, selected.getStock(), 1));

        // tequila SLICE
        selected = spirits.get(3);
        selectedSpirits.add(selected);
        tequilaQty.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        tequilaQty.setText("QTY: " + selected.getStock());

        tequilaPrice.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        tequilaPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tequilaPrice.setText("₱" + selected.getPrice());

        tequilaLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        tequilaLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tequilaLbl.setText(selected.getName());

        tequilaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/tequila.jpg"))); 

        tequilaAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        tequilaAdd.setText("Add To Cart");

        tequilaSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, selected.getStock(), 1));
        
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
        spiritsImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/spirits.jpg"))); 

        garnishesLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        garnishesLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        garnishesLbl.setText("GARNISHES");
        garnishesImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/garnishesGray.jpg"))); 

        // BUTTONS 
        leftBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/left.png"))); 
        leftBtn.setBorderPainted(false);

        rightBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/right.png"))); 
        rightBtn.setBorderPainted(false);
        
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
                    .addComponent(backBtn)
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
                                .addComponent(vodkaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ginAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(whiskeyAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tequilaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(vodkaSpinner)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(vodkaLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(vodkaImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(vodkaQty)
                                        .addComponent(vodkaPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ginSpinner)
                                    .addComponent(ginQty)
                                    .addComponent(ginImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ginLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ginPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(whiskeySpinner)
                                    .addComponent(whiskeyQty)
                                    .addComponent(whiskeyImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(whiskeyLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(whiskeyPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tequilaPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tequilaQty, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tequilaImg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tequilaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tequilaSpinner))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(proceedBtn)
                    .addComponent(rightBtn))
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
                                        .addComponent(ginQty)
                                        .addComponent(vodkaQty))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ginImg))
                                .addComponent(vodkaImg))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(whiskeyQty)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(whiskeyImg)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(whiskeyLbl)
                                            .addComponent(ginLbl)
                                            .addComponent(vodkaLbl)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tequilaQty)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tequilaImg)
                                            .addComponent(rightBtn))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tequilaLbl)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(whiskeyPrice)
                                    .addComponent(tequilaPrice)
                                    .addComponent(vodkaPrice)
                                    .addComponent(ginPrice))))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vodkaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ginSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(whiskeySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tequilaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vodkaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ginAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(whiskeyAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tequilaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proceedBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, Short.MAX_VALUE))
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

    //Spirit getters

    /**
     * Get the add to cart button for vodka
     * @return JButton
     */
    public JButton getVodkaAdd() {
        return vodkaAdd;
    }

    /**
     * Get the add to cart button for gin
     * @return JButton
     */
    public JButton getGinAdd() {
        return ginAdd;
    }

    /**
     * Get the add to cart button for whiskey
     * @return JButton
     */
    public JButton getWhiskeyAdd() {
        return whiskeyAdd;
    }

    /**
     * Get the add to cart button for tequila
     * @return JButton
     */
    public JButton getTequilaAdd() {
        return tequilaAdd;
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
     * Get the button for returning ot the previous item section
     * @return JButton
     */
    public JButton getLeftButton() {
        return leftBtn;
    }

    /**
     * Get the button for proceeding to the next item section
     * @return
     */
    public JButton getRightButton() {
        return rightBtn;
    }

    //Spirit spinners

    /**
     * Get the spinner of vodka
     * @return JSpinner
     */
    public JSpinner getVodkaSpinner(){
        return vodkaSpinner;
    }

    /**
     * Get the spinner of vodka
     * @return JSpinner
     */
    public JSpinner getGinSpinner(){
        return ginSpinner;
    }

    /**
     * Get the spinner of whiskey
     * @return JSpinner
     */
    public JSpinner getWhiskeySpinner(){
        return whiskeySpinner;
    }

    /**
     * Get the spinner of tequila
     * @return JSpinner
     */
    public JSpinner getTequilaSpinner(){
        return tequilaSpinner;
    }

}
