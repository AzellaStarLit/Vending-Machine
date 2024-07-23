package views;

import javax.swing.*;

import controllers.CreateController;
import controllers.SpecialVendingController;
import controllers.SpiritController;
import controllers.GarnishController;

import java.awt.*;
import java.util.ArrayList;

import models.Item;
import models.Spirit;
import models.Garnish;
import models.SpecialVendingMachine;
import models.Denomination;

/**
 * This is the view frame for the payment section of a special vending machine
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class SpecialPaymentFrame extends JFrame {
                    
    private JButton backBtn;
    private JButton backBtn1;
    private JLabel canadadryLbl;
    private JLabel cherryLbl;
    private JLabel cokeLbl;
    private JLabel fantaLbl;
    private JLabel fiftyLbl;
    private JSpinner fiftySpinner;
    private JLabel fiveHundredLbl;
    private JSpinner fiveHundredSpinner;
    private JLabel fiveLbl;
    private JSpinner fiveSpinner;
    private JLabel ginLbl;
    private JLabel headerLbl;
    private JPanel headerPanel;
    private JLabel lemonLbl;
    private JLabel mountaindewLbl;
    private JLabel oliveLbl;
    private JLabel oneHundredLbl;
    private JSpinner oneHundredSpinner;
    private JLabel oneLbl;
    private JSpinner oneSpinner;
    private JLabel oneThousandLbl;
    private JSpinner oneThousandSpinner;
    private JLabel orangeLbl;
    private JLabel orderTitle;
    private JButton paymentBtn;
    private JLabel paymentLbl;
    private JLabel paymentTitle;
    private JButton proceedBtn2;
    private JButton proceedBtn3;
    private JButton proceedBtn4;
    private JLabel redbullLbl;
    private JLabel royalLbl;
    private JLabel schweppesLbl;
    private JLabel spriteLbl;
    private JLabel tenLbl;
    private JSpinner tenSpinner;
    private JLabel tequilaLbl;
    private JLabel twentyLbl;
    private JSpinner twentySpinner;
    private JLabel twoHundredLbl;
    private JSpinner twoHundredSpinner;
    private JLabel vodkaLbl;
    private JLabel whiskeyLbl;


    SpecialVendingMachine vendingMachine = CreateController.getSpecialVendingMachineInstance();
    ArrayList<Item> items = vendingMachine.getItemSlot();
    int total;
    int ctrVodka = 0;
    int ctrGin = 0;
    int ctrWhiskey = 0;
    int ctrTequila = 0;
    int ctrOlive = 0;
    int ctrCherry = 0;
    int ctrLemonSlice = 0;
    int ctrOrangeSlice = 0;
    ArrayList<Item> selectedItems = new ArrayList<>();
    ArrayList<Spirit> selectedSpirits = new ArrayList<>();
    ArrayList<Garnish> selectedGarnishes = new ArrayList<>();

    public SpecialPaymentFrame(ArrayList<Item> selectedItems, int total, ArrayList<Spirit> selectedSpirits, ArrayList<Garnish> selectedGarnishes) {

        this.selectedItems = selectedItems;
        this.total = total;
        this.selectedSpirits = selectedSpirits;
        this.selectedGarnishes = selectedGarnishes;

        proceedBtn2 = new JButton();
        backBtn = new JButton();
        backBtn1 = new JButton();
        proceedBtn3 = new JButton();
        proceedBtn4 = new JButton();
        orderTitle = new JLabel();
        headerPanel = new JPanel();
        headerLbl = new JLabel();
        paymentLbl = new JLabel();
        paymentTitle = new JLabel();
        cokeLbl = new JLabel();
        oneThousandLbl = new JLabel();
        oneThousandSpinner = new JSpinner();
        fiveHundredSpinner = new JSpinner();
        fiveHundredLbl = new JLabel();
        twoHundredSpinner = new JSpinner();
        twoHundredLbl = new JLabel();
        oneHundredSpinner = new JSpinner();
        oneHundredLbl = new JLabel();
        fiveSpinner = new JSpinner();
        fiveLbl = new JLabel();
        fiftySpinner = new JSpinner();
        fiftyLbl = new JLabel();
        twentySpinner = new JSpinner();
        twentyLbl = new JLabel();
        tenSpinner = new JSpinner();
        tenLbl = new JLabel();
        oneSpinner = new JSpinner();
        oneLbl = new JLabel();
        paymentBtn = new JButton();
        spriteLbl = new JLabel();
        mountaindewLbl = new JLabel();
        royalLbl = new JLabel();
        fantaLbl = new JLabel();
        schweppesLbl = new JLabel();
        redbullLbl = new JLabel();
        canadadryLbl = new JLabel();
        vodkaLbl = new JLabel();
        ginLbl = new JLabel();
        whiskeyLbl = new JLabel();
        tequilaLbl = new JLabel();
        oliveLbl = new JLabel();
        cherryLbl = new JLabel();
        lemonLbl = new JLabel();
        orangeLbl = new JLabel();

        proceedBtn2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        proceedBtn2.setText(">");

        backBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        backBtn.setText("<");

        backBtn1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        backBtn1.setText("<");

        proceedBtn3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        proceedBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/cross.png"))); // NOI18N
        proceedBtn3.setBorderPainted(false);

        proceedBtn4.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        proceedBtn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/check.png"))); // NOI18N
        proceedBtn4.setBorderPainted(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 800));

        orderTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        orderTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        orderTitle.setText("Order: ");

        headerPanel.setBackground(new java.awt.Color(197, 223, 249));

        headerLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(headerLbl)
                .addGap(40, 40, 40))
        );

        paymentLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        paymentLbl.setText("₱ " + total);

        paymentTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        paymentTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        paymentTitle.setText("Amount to Pay:");

        //COKE
        cokeLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        if (selectedItems.get(0).getName().equals("Coke"))
            cokeLbl.setText("Coke: 1");
        else
            cokeLbl.setText("Coke: 0");
        oneThousandLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        oneThousandLbl.setText("₱1000");

        oneThousandSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        fiveHundredLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        fiveHundredLbl.setText("₱500");

        twoHundredLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        twoHundredLbl.setText("₱200");

        oneHundredLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        oneHundredLbl.setText("₱100");

        fiveLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        fiveLbl.setText("₱5");

        fiftyLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        fiftyLbl.setText("₱50");

        twentyLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        twentyLbl.setText("₱20");

        tenLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tenLbl.setText("₱10");

        oneLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        oneLbl.setText("₱1");

        paymentBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        paymentBtn.setText("Pay Now");

        spriteLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        //SPRITE
        if (selectedItems.get(0).getName().equals("Sprite"))
            spriteLbl.setText("Sprite: 1");
        else
            spriteLbl.setText("Sprite: 0");
        mountaindewLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        //MOUNTAIN DEW
        if (selectedItems.get(0).getName().equals("Mountain Dew"))
            mountaindewLbl.setText("Mountain Dew: 1");
        else
            mountaindewLbl.setText("Mountain Dew: 0");
        royalLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        //ROYAL
        if (selectedItems.get(0).getName().equals("Royal"))
            royalLbl.setText("Royal: 1");
        else
            royalLbl.setText("Royal: 0");
        fantaLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        //FANTA
        if (selectedItems.get(0).getName().equals("Fanta"))    
            fantaLbl.setText("Fanta: 1");
        else
            fantaLbl.setText("Fanta: 0");
        schweppesLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        //SCHWEPPES
        if (selectedItems.get(0).getName().equals("Ginger Ale"))
            schweppesLbl.setText("Ginger Ale: 1");
        else
            schweppesLbl.setText("Ginger Ale: 0");
        redbullLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        //RED BULL
        if (selectedItems.get(0).getName().equals("Red Bull"))
            redbullLbl.setText("Red Bull: 1");
        else
            redbullLbl.setText("Red Bull: 0");
        canadadryLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        
        //TONIC WATER
        if (selectedItems.get(0).getName().equals("Tonic Water"))
            canadadryLbl.setText("Tonic Water: 1");
        else
            canadadryLbl.setText("Tonic Water: 0");
        vodkaLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        //VODKA
        for (int i = 0; i < selectedSpirits.size(); i++){
            if (selectedSpirits.get(i).getName().equals("Vodka")){
                ctrVodka++;
            }
        }
        vodkaLbl.setText("Vodka: " + ctrVodka);

        ginLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        for (int i = 0; i < selectedSpirits.size(); i++){
            if (selectedSpirits.get(i).getName().equals("Gin")){
                ctrGin++;
            }
        }
        ginLbl.setText("Gin: " + ctrGin);

        whiskeyLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        for (int i = 0; i < selectedSpirits.size(); i++){
            if (selectedSpirits.get(i).getName().equals("Whiskey")){
                ctrWhiskey++;
            }
        }
        whiskeyLbl.setText("Whiskey: " + ctrWhiskey);

        tequilaLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        for (int i = 0; i < selectedSpirits.size(); i++){
            if (selectedSpirits.get(i).getName().equals("Tequila")){
                ctrTequila++;
            }
        }
        tequilaLbl.setText("Tequila: " + ctrTequila);

        oliveLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        for (int i = 0; i < selectedGarnishes.size(); i++){
            if (selectedGarnishes.get(i).getName().equals("Olives")){
                ctrOlive++;
            }
        }
        oliveLbl.setText("Olives: " + ctrOlive);

        cherryLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        for (int i = 0; i < selectedGarnishes.size(); i++){
            if (selectedGarnishes.get(i).getName().equals("Cherries")){
                ctrCherry++;
            }
        }
        cherryLbl.setText("Cherries: " + ctrCherry);

        lemonLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        for (int i = 0; i < selectedGarnishes.size(); i++){
            if (selectedGarnishes.get(i).getName().equals("Lemon Slice")){
                ctrLemonSlice++;
            }
        }
        lemonLbl.setText("Lemon Slice: " + ctrLemonSlice);

        orangeLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        for (int i = 0; i < selectedGarnishes.size(); i++){
            if (selectedGarnishes.get(i).getName().equals("Orange Slice")){
                ctrOrangeSlice++;
            }
        }
        orangeLbl.setText("Orange Slice: " + ctrOrangeSlice);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(paymentTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(orderTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(paymentLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(royalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cokeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spriteLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mountaindewLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(vodkaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(whiskeyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ginLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tequilaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oliveLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lemonLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cherryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orangeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fantaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(redbullLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(schweppesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(canadadryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fiveHundredLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiveHundredSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(oneThousandLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(oneThousandSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(twoHundredLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(twoHundredSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(oneHundredLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oneHundredSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(oneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(oneSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(twentyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twentySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(fiftyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fiftySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(fiveLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fiveSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(tenLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tenSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(266, 266, 266))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oneThousandLbl)
                            .addComponent(oneThousandSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fiveHundredLbl)
                            .addComponent(fiveHundredSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twoHundredLbl)
                            .addComponent(twoHundredSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oneHundredLbl)
                            .addComponent(oneHundredSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fiftyLbl)
                            .addComponent(fiftySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orderTitle)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cokeLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spriteLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mountaindewLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(royalLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fantaLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(schweppesLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(redbullLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(canadadryLbl)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vodkaLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ginLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(whiskeyLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tequilaLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(oliveLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cherryLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lemonLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(orangeLbl)))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twentyLbl)
                            .addComponent(twentySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tenLbl)
                            .addComponent(tenSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fiveLbl)
                            .addComponent(fiveSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paymentTitle)
                        .addGap(6, 6, 6)
                        .addComponent(paymentLbl)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(oneLbl)
                        .addComponent(oneSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
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
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setResizable(false);
    } 

    //Getters

    /**
     * Get the button for proceeding the payment
     * @return JButton
     */
    public JButton getPayBtn() {

        return paymentBtn;
    }

    /**
     * Get the spinner for the denomination one
     * @return JSpinner
     */
    public JSpinner getOneSpinner(){

        return oneSpinner;
    }

    /**
     * Get the spinner for the denomination five
     * @return JSpinner
     */
    public JSpinner getFiveSpinner(){

        return fiveSpinner;
    }

    /**
     * Get the spinner for the denomination ten
     * @return JSpinner
     */
    public JSpinner getTenSpinner(){

        return tenSpinner;
    }

    /**
     * Get the spinner for the denomination twenty
     * @return JSpinner
     */
    public JSpinner getTwentySpinner(){

        return twentySpinner;
    }

    /**
     * Get the spinner for the denomination fifty
     * @return JSpinner
     */
    public JSpinner getFiftySpinner(){

        return fiftySpinner;
    }

    /**
     * Get the spinner for the denomination one hundred
     * @return JSpinner
     */
    public JSpinner getOneHundredSpinner(){

        return oneHundredSpinner;
    }

    /**
     * Get the spinner for the denomination two hundred
     * @return JSpinner
     */
    public JSpinner getTwoHundredSpinner(){

        return twoHundredSpinner;
    }

    /**
     * Get the spinner for the denomination five hundred
     * @return JSpinner
     */
    public JSpinner getFiveHundredSpinner(){

        return fiveHundredSpinner;
    }

    /**
     * Get the spinner for the denomination one thousand
     * @return JSpinner
     */
    public JSpinner getOneThousandSpinner(){

        return oneThousandSpinner;
    }

    /**
     * Get the total price of the items
     * @return total sum value
     */
    public int getTotal(){

        return total;
    }

    /**
     * Get the item selected
     * @return Item
     */
    public Item getItem(){

        return selectedItems.get(0);
    }

    /**
     * Get the price of the item (drink) selected
     * @return int value price
     */
    public int getDrinkPrice(){

        return selectedItems.get(0).getPrice();
    }

    /**
     * Get the number of vodka
     * @return int counter
     */
    public int getVodkaCtr(){

        return ctrVodka;
    }

    /**
     * Get the number of gin
     * @return int counter
     */
    public int getGinCtr(){

        return ctrGin;
    }

    /**
     * Get the number of whiskey
     * @return int counter
     */
    public int getWhiskeyCtr(){

        return ctrWhiskey;
    }

    /**
     * Get the number of tequila
     * @return int counter
     */
    public int getTequilaCtr(){

        return ctrTequila;
    }

    /**
     * Get the number of olive
     * @return int counter
     */
    public int getOliveCtr(){

        return ctrOlive;
    }

    /**
     * Get the number of cherry
     * @return int counter
     */
    public int getCherryCtr(){

        return ctrCherry;
    }

    /**
     * Get the number of lemon slice
     * @return int counter
     */
    public int getLemonSliceCtr(){

        return ctrLemonSlice;
    }

    /**
     * Get the number of orange slice
     * @return int counter
     */
    public int getOrangeSliceCtr(){

        return ctrOrangeSlice;
    }
}
