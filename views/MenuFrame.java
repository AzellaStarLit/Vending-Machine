package views;

import javax.swing.*;
import java.awt.*;

/**
 * This is the view frame for the program's main menu. Here you can create a vending machine
 * Test a machine (There must be an existing VM). And exit program
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class MenuFrame extends JFrame {

    private JLabel menuLabel;
    private JButton createButton;
    private JButton testButton;
    private JButton exitButton;

    //Markers for which VM is created (1 is regular & two is special)
    private int machineCreated = 0; // 1 or 2 if created

    public MenuFrame() {
        menuLabel = new JLabel();
        createButton = new JButton();
        testButton = new JButton();
        exitButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // MENU 
        menuLabel.setText("MENU");
        menuLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 36));
        menuLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // CREATE
        createButton.setText("Create");
        createButton.setFont(new Font("Helvetica Neue", Font.PLAIN, 24)); // Increase the font size for buttons
        createButton.setPreferredSize(new Dimension(200, 60)); // Set the preferred button size

        // TEST
        testButton.setText("Test");
        testButton.setFont(new Font("Helvetica Neue", Font.PLAIN, 24));
        testButton.setPreferredSize(new Dimension(200, 60));

        // EXIT
        exitButton.setText("Exit");
        exitButton.setFont(new Font("Helvetica Neue", Font.PLAIN, 24));
        exitButton.setPreferredSize(new Dimension(200, 60));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER, false)
                            .addComponent(testButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(menuLabel)))
                .addContainerGap(250, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(menuLabel)
                .addGap(62, 62, 62)
                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(testButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );
    }

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
     * Get the button for proceeding to creating a vending machine
     * @return JButton
     */
    public JButton getCreateButton() {
        return createButton;
    }

    /**
     * Get the button for proceeding to testing a vending machine
     * @return JButton
     */
    public JButton getTestButton() {
        return testButton;
    }

    /**
     * Get the button for exiting the program
     * @return JButton
     */
    public JButton getExitButton() {
        return exitButton;
    }

    /**
     * Get the value of the machine created for reference
     * @return int value (1 or 2)
     */
    public int getMachineCreated(){
        return this.machineCreated;
    }

    /**
     * Set the value of the machineCreated var
     * @param machineCreated to be modified
     * @return int new value of var
     */
    public int setMachineCreated(int machineCreated){

        return this.machineCreated = machineCreated;
    }
}
