package views;

import javax.swing.*;

/**
 * This is the view frame for displaying the success of creating a vending machine
 */
public class SuccessFrame extends JFrame {

    private JProgressBar loadingBar;
    private JLabel loadingLabel;
    private ImageIcon loadingIcon;

    public SuccessFrame() {
        initComponents();
    }

    private void initComponents() {
        loadingBar = new JProgressBar();
        loadingLabel = new JLabel();
        loadingIcon = new ImageIcon(getClass().getResource("/views/loading.gif"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 800));

        JPanel jPanel1 = new JPanel();
        jPanel1.setSize(new java.awt.Dimension(700, 800));

        JLabel jLabel1 = new JLabel(loadingIcon);

        loadingLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18));

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(loadingBar, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                                        .addComponent(loadingLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31)
                                .addComponent(loadingBar, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(loadingLabel)
                                .addContainerGap(112, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }

    /**
     * Get the progress bar for display purposes
     * @return JProgressBar
     */
    public JProgressBar getLoadingBar() {
        return loadingBar;
    }

    /**
     * Get the JLabel for display purposes
     * @return JLabel
     */
    public JLabel getLoadingLabel() {
        return loadingLabel;
    }
}

