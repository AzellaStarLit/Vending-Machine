package views;

import javax.swing.*;
import java.awt.*;

/**
 * This is the view frame for the maintenance of a regular vending machine.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class MaintenanceFrame extends JFrame {

    private javax.swing.JLabel maintenanceLbl;
    private JButton restockBtn, editBtn, collectBtn, replenishBtn, printBtn, backBtn;

    public MaintenanceFrame() {
        maintenanceLbl = new JLabel();
        restockBtn = new JButton();
        backBtn = new JButton();
        editBtn = new JButton();
        collectBtn = new JButton();
        replenishBtn = new JButton();
        printBtn = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 800));

        // MAINTENANCE Label
        maintenanceLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        maintenanceLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maintenanceLbl.setText("MAINTENANCE");

        // Restock Button
        restockBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        restockBtn.setText("Restock");
        
        // Edit Button
        editBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        editBtn.setText("Edit");

        // Collect Button
        collectBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        collectBtn.setText("Collect");

        // Replenish Button
        replenishBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        replenishBtn.setText("Replenish");

        // Print Button
        printBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        printBtn.setText("Print");

        // Back Button
        backBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        backBtn.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(restockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(collectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(replenishBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(maintenanceLbl))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(maintenanceLbl)
                .addGap(44, 44, 44)
                .addComponent(restockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(collectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(replenishBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
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
     * Get the button for proceeding to restocking
     * @return JButton
     */
    public JButton getRestockButton() {
        return restockBtn;
    }

    /**
     * Get the button for proceeding to editing (Set Price)
     * @return JButton
     */
    public JButton getEditButton() {
        return editBtn;
    }

    /**
     * Get the button for proceeding to collecting machine sales
     * @return JButton
     */
    public JButton getCollectButton() {
        return collectBtn;
    }

    /**
     * Get the button for proceeding to replenishing stocks
     * @return JButton
     */
    public JButton getReplenishButton() {
        return replenishBtn;
    }

    /**
     * Get the button for proceeding to printing transaction history
     * @return JButton
     */
    public JButton getPrintButton() {
        return printBtn;
    }

    /**
     * Get the button for returning from maintence section
     * @return JButton
     */
    public JButton getBackButton() {
        return backBtn;
    }
}
