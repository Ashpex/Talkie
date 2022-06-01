/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Execute;

import UI.LoginForm;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author ashpex
 */
public class Main {
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
       
        FlatLightLaf.setup();
        UIManager.setLookAndFeel(new FlatIntelliJLaf());
        System.out.println("Chat Client is running");

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                JFrame frame = new LoginForm();
                frame.setResizable(false);
                frame.setTitle("Login");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
