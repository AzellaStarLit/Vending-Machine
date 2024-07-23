package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import views.MenuFrame;
import views.CreateFrame;
import views.TestFrame;

/**
 * This it the controller for the menu of the vending machine.
 *
 * @author Sandoval, Lee Brien & David, Peter Jan
 */
public class MenuController {

    private MenuFrame menuFrame;

    public MenuController(MenuFrame menuFrame) {
        this.menuFrame = menuFrame;

        // Menu Action Listeners
        this.menuFrame.getCreateButton().addActionListener(new CreateButtonListener());
        this.menuFrame.getTestButton().addActionListener(new TestButtonListener());
        this.menuFrame.getExitButton().addActionListener(new ExitButtonListener());

    }

    // Menu: Create Button

    /**
     * This is the listener for when the create button is clicked.
     * It calls the create frame and controller.
     */
    private class CreateButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            CreateFrame createFrame = new CreateFrame();
            CreateController createController = new CreateController(createFrame, menuFrame);
            createFrame.init();
            
        }
    }

    // Menu: Test Button

    /**
     * This is the listener for when the test button is clicked.
     * It calls the test frame and controller. It displays an error if
     * clicked before create.
     */
    private class TestButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {  
            if(menuFrame.getMachineCreated() == 1 || menuFrame.getMachineCreated() == 2) {
                TestFrame testFrame = new TestFrame();
                TestController testController = new TestController(testFrame, menuFrame);
                testFrame.init();
            }
            else {
                JOptionPane.showMessageDialog(menuFrame, "No Vending Machine created yet.","Vending Machine",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    // Menu: Exit Button

    /**
     * This is the listener for when the ext button is clicked.
     * It exits the program if run.
     */
    private class ExitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // add here confirmation if user really wants to exit the application
            System.exit(0);
        }
    }

}