package views;

import javax.swing.*;
import java.awt.*;

/**
 * This is the view frame for displaying the test menu of the program.
 * Options of this menu is to simulate a vending machine, maintenance features, and exit.
 *
 * @authors Sandoval, Lee Brien & David, Peter Jan
 */
public class TestFrame extends JFrame {

    private JLabel testLabel;
    private JButton vendingButton;
    private JButton maintenanceButton;
    private JButton backButton;

    public TestFrame() {
        testLabel = new JLabel();
        vendingButton = new JButton();
        maintenanceButton = new JButton();
        backButton = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        // TEST Label
        testLabel.setText("TEST");
        testLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 36));
        testLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Vending Button
        vendingButton.setText("Vending");
        vendingButton.setFont(new Font("Helvetica Neue", Font.PLAIN, 24));
        vendingButton.setPreferredSize(new Dimension(200, 60));

        // Maintenance Button
        maintenanceButton.setText("Maintenance");
        maintenanceButton.setFont(new Font("Helvetica Neue", Font.PLAIN, 24));
        maintenanceButton.setPreferredSize(new Dimension(200, 60));

        // Back Button
        backButton.setText("Back");
        backButton.setFont(new Font("Helvetica Neue", Font.PLAIN, 24));
        backButton.setPreferredSize(new Dimension(200, 60));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER, false)
                            .addComponent(maintenanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(testLabel)))
                .addContainerGap(250, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(testLabel)
                .addGap(62, 62, 62)
                .addComponent(vendingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(maintenanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

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
     * Get the button for proceeding to the vending features
     * @return JBUtton
     */
    public JButton getVendingButton() {
        return vendingButton;
    }

    /**
     * Get the button for proceeding to the maintenance features
     * @return JButton
     */
    public JButton getMaintenanceButton() {
        return maintenanceButton;
    }

    /**
     * GEt the button for returning from the test menu
     * @return
     */
    public JButton getBackButton() {
        return backButton;
    }
}
