package views;

import javax.swing.*;
import java.awt.*;

/**
 * This is the view class for creating a vending machine
 * It can be either regular or special.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class CreateFrame extends JFrame {

    private JLabel createLabel;
    private JButton regularButton;
    private JButton specialButton;
    private JButton backButton;

    public CreateFrame() {
        createLabel = new JLabel();
        regularButton = new JButton();
        specialButton = new JButton();
        backButton = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        // CREATE Label 
        createLabel.setText("CREATE");
        createLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 36));
        createLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Regular Button
        regularButton.setText("Regular");
        regularButton.setFont(new Font("Helvetica Neue", Font.PLAIN, 24));
        regularButton.setPreferredSize(new Dimension(200, 60));
        

        // Special Button
        specialButton.setText("Special");
        specialButton.setFont(new Font("Helvetica Neue", Font.PLAIN, 24));
        specialButton.setPreferredSize(new Dimension(200, 60));

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
                            .addComponent(specialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regularButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(createLabel)))
                .addContainerGap(250, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(createLabel)
                .addGap(62, 62, 62)
                .addComponent(regularButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(specialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

    }

    /**
     * Call the frame window
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

    //Getters

    /**
     * Get the button for creating a regular vending machine
     * @return JButton
     */
    public JButton getRegularButton() {
        return regularButton;
    }

    /**
     * Get the button for creating a special vending machine
     * @return JButton
     */
    public JButton getSpecialButton() {
        return specialButton;
    }

    /**
     * Get the button for returning from the create menu to main menu
     * @return JButton
     */
    public JButton getBackButton() {
        return backButton;
    }
}

