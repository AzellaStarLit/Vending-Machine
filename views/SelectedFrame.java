package views;

import javax.swing.*;
import java.awt.*;

import models.Item;

/**
 * This is the view frame for confirming the item selected in a regular vending machine
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class SelectedFrame extends JFrame {   
                    
    private JLabel headerLbl;
    private JPanel headerPanel;
    private JLabel selectedImg;
    private JLabel selectedLbl;
    private JLabel selectedPrice;
    private JLabel selectedCalories;
    private JButton backBtn;
    private JButton proceedBtn;

    private Item selectedItem;

    public SelectedFrame(Item selectedItem) {
        this.selectedItem = selectedItem;

        headerPanel = new JPanel();
        headerLbl = new JLabel();
        selectedImg = new javax.swing.JLabel();
        selectedLbl = new JLabel();
        selectedPrice = new JLabel();
        selectedCalories = new JLabel();
        backBtn = new JButton();
        proceedBtn = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 800));

        headerPanel.setBackground(new java.awt.Color(197, 223, 249));

        headerLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        headerLbl.setText("Vending Machine");

        GroupLayout headerPanelLayout = new GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(headerLbl)
                .addContainerGap(487, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(headerLbl)
                .addGap(37, 37, 37))
        );

        selectedImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/" + selectedItem.getImage() + ".jpg"))); // NOI18N

        selectedLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        selectedLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedLbl.setText(selectedItem.getName());

        selectedPrice.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        selectedPrice.setText("Price: ₱" + selectedItem.getPrice());

        selectedCalories.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        selectedCalories.setText("Calories: " + selectedItem.getCalories());

        backBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/cross.png"))); // NOI18N
        backBtn.setBorderPainted(false);

        proceedBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        proceedBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/check.png"))); // NOI18N
        proceedBtn.setBorderPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedCalories)
                    .addComponent(selectedLbl)
                    .addComponent(selectedImg)
                    .addComponent(selectedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(proceedBtn)
                .addGap(308, 308, 308))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(selectedImg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectedLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectedPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectedCalories)
                        .addGap(0, 332, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backBtn)
                            .addComponent(proceedBtn))
                        .addGap(21, 21, 21))))
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
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setResizable(false);
    }

    /**
     * Get the button for returning or cancelling the selected item
     * @return JButton
     */
    public JButton getBackBtn() {
        return backBtn;
    }

    /**
     * Get the button for proceeding to paymnet
     * @return JButton
     */
    public JButton getProceedBtn() {
        return proceedBtn;
    }
}