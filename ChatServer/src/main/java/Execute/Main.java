/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Execute;

import UI.ServerForm;
import javax.swing.JFrame;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.*;

/**
 *
 * @author ashpex
 */
public class Main {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        FlatLightLaf.setup();
        for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            System.out.println(info.getClassName());
        }
        UIManager.setLookAndFeel(new FlatIntelliJLaf());


        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                JFrame frame = new ServerForm();
                frame.setResizable(false);
                frame.setTitle("Server Chat");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}

