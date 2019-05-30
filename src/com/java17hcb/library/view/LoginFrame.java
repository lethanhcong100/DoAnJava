/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java17hcb.library.view;

import com.java17hcb.library.bus.BusStaff;
import com.java17hcb.library.entity.Staff;
import com.java17hcb.library.utils.CurrentStaff;
import com.java17hcb.library.utils.FormVerifier;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

/**
 *
 * @author labyr
 */
public class LoginFrame extends javax.swing.JFrame {    
    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
        setupComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        tfPassword = new javax.swing.JTextField();
        lbErrUsername = new javax.swing.JLabel();
        lbErrPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbUserName.setText("Username");

        lbPassword.setText("Password");

        tfUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfUsernameKeyReleased(evt);
            }
        });

        tfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPasswordKeyReleased(evt);
            }
        });

        lbErrUsername.setForeground(new java.awt.Color(255, 51, 51));
        lbErrUsername.setText(" ");
        lbErrUsername.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lbErrUsernamePropertyChange(evt);
            }
        });

        lbErrPassword.setForeground(new java.awt.Color(255, 51, 51));
        lbErrPassword.setText(" ");
        lbErrPassword.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lbErrPasswordPropertyChange(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbUserName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbErrUsername)
                            .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbErrPassword)
                                .addComponent(tfPassword)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfPassword, tfUsername});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnExit, btnLogin});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbUserName)
                            .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbErrUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbErrPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnExit))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnExit, btnLogin});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Staff currentStaff = BusStaff.getInstance().login(tfUsername.getText(), tfPassword.getText());
        if(currentStaff == null){
            JOptionPane.showMessageDialog(this, 
                                        "Cannot find account in database. Plsease check yout username / password",
                                        "Account not found",
                                        JOptionPane.ERROR_MESSAGE);
        } else {
            CurrentStaff.setCurrentStaff(currentStaff);
            int input = JOptionPane.showOptionDialog(this, 
                                        "Login successful",
                                        "Login successful",
                                        JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.INFORMATION_MESSAGE,
                                        null,
                                        null,
                                        null);
            if(input == JOptionPane.OK_OPTION){
                dispose();
                MainFrame.showScreen();
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void tfUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsernameKeyReleased
        FormVerifier.verifyInput(btnLogin, tfUsername, lbErrUsername, "Username");
    }//GEN-LAST:event_tfUsernameKeyReleased

    private void tfPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPasswordKeyReleased
        FormVerifier.verifyInput(btnLogin, tfPassword, lbErrPassword, "Password");
    }//GEN-LAST:event_tfPasswordKeyReleased

    private void lbErrUsernamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lbErrUsernamePropertyChange
        List<String> errMessages = new ArrayList<>();
        errMessages.add(lbErrUsername.getText());
        errMessages.add(lbErrPassword.getText());
        btnLogin.setEnabled(FormVerifier.enableBtnConfirm(errMessages));
    }//GEN-LAST:event_lbErrUsernamePropertyChange

    private void lbErrPasswordPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lbErrPasswordPropertyChange
        List<String> errMessages = new ArrayList<>();
        errMessages.add(lbErrUsername.getText());
        errMessages.add(lbErrPassword.getText());
        btnLogin.setEnabled(FormVerifier.enableBtnConfirm(errMessages));
    }//GEN-LAST:event_lbErrPasswordPropertyChange

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lbErrPassword;
    private javax.swing.JLabel lbErrUsername;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
    
    private void setupComponents() {        
        // Set attribute for main panel
        setTitle("Login");
        setLocationRelativeTo(null);
        setResizable(false);
        
        // Set main image
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/com/java17hcb/library/resource/computer_lock.png"));
        lbIcon.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
        
        // Set icon for buttons
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon loginIcon = IconFontSwing.buildIcon(FontAwesome.SIGN_IN, 15);
        Icon exitIcon = IconFontSwing.buildIcon(FontAwesome.POWER_OFF, 15);        
        btnLogin.setIcon(loginIcon);
        btnExit.setIcon(exitIcon);      

        btnLogin.setEnabled(false);
    }
}
