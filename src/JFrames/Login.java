/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames;

import Connection.ConnectionProvider;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

// import sql
import java.sql.*;

/**
 *
 * @author pjgui
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Login() {
        initComponents();        
        
        ImageIcon ii = new ImageIcon(getClass().getResource("/Image/user.png"));
        Image image = ii.getImage().getScaledInstance(userIcon.getWidth(), userIcon.getHeight(), Image.SCALE_SMOOTH);
        ii = new ImageIcon(image);
        userIcon.setIcon(ii);        
        
        // add padding to text field
        userField.setBorder(BorderFactory.createCompoundBorder(
        userField.getBorder(), 
        BorderFactory.createEmptyBorder(5, 10, 5, 5))); // Top, Left, Bottom, Right
        
        // add padding to password field
        passwordField.setBorder(BorderFactory.createCompoundBorder(
        passwordField.getBorder(), 
        BorderFactory.createEmptyBorder(5, 10, 5, 5))); // Top, Left, Bottom, Right
        
        // remove focus
        getContentPane().requestFocusInWindow();

        // Button cursor hover
        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        createAccountButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        // disable maximize
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JPanel();
        userIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        userField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        createAccountButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Montserrat Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please log in");

        javax.swing.GroupLayout labelLayout = new javax.swing.GroupLayout(label);
        label.setLayout(labelLayout);
        labelLayout.setHorizontalGroup(
            labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labelLayout.createSequentialGroup()
                .addContainerGap(378, Short.MAX_VALUE)
                .addComponent(userIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(369, 369, 369))
        );
        labelLayout.setVerticalGroup(
            labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(userIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(35, 35, 35))
        );

        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 250));

        jPanel2.setBackground(new java.awt.Color(243, 243, 243));

        userField.setBackground(new java.awt.Color(255, 255, 255));
        userField.setForeground(new java.awt.Color(51, 51, 51));
        userField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        userField.setText("Enter Username");
        userField.setBorder(null);
        userField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userFieldFocusLost(evt);
            }
        });
        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });
        userField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userFieldKeyPressed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
        passwordField.setForeground(new java.awt.Color(51, 51, 51));
        passwordField.setText("Enter Password");
        passwordField.setBorder(null);
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(0, 102, 255));
        loginButton.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setBorder(null);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        createAccountButton.setBackground(new java.awt.Color(255, 255, 255));
        createAccountButton.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        createAccountButton.setForeground(new java.awt.Color(0, 102, 255));
        createAccountButton.setText("Create an Account");
        createAccountButton.setBorder(null);
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userField)
                    .addComponent(passwordField)
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 830, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFieldFocusLost
        // TODO add your handling code here:
        if (userField.getText().equals("")) {
            userField.setText("Enter Username");
        }
    }//GEN-LAST:event_userFieldFocusLost

    private void userFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFieldFocusGained
        // TODO add your handling code here:
        if (userField.getText().equals("Enter Username")) {
            userField.setText("");
        }
    }//GEN-LAST:event_userFieldFocusGained

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        // TODO add your handling code here:
        if (passwordField.getText().equals("Enter Password")) {
            passwordField.setText("");
        }
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        // TODO add your handling code here:
        if (passwordField.getText().equals("")) {
            passwordField.setText("Enter Password");
        }
    }//GEN-LAST:event_passwordFieldFocusLost

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String uName = userField.getText();
        String pw = passwordField.getText();
        boolean hasAccess = false;        
        try {
            Connection conn = ConnectionProvider.getConn();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT username, password FROM users where username = '"+uName+"' AND password = '"+pw+"'");
            System.out.println("ResultSet: " + rs.next());
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Access permitted!", "Login Success", JOptionPane.INFORMATION_MESSAGE);                
                this.setVisible(false);
                new DefaultFrame().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid Credentials!", "Login Failed", JOptionPane.ERROR_MESSAGE);                
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_userFieldActionPerformed

    private void userFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {  
            if (userField.getText().equals("admin") && passwordField.getText().equals("admin")) {
                JOptionPane.showMessageDialog(null, "Access permitted!", "Login Success", JOptionPane.INFORMATION_MESSAGE);                
                this.setVisible(false);
                new DefaultFrame().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid Credentials!", "Login Failed", JOptionPane.ERROR_MESSAGE);                
            }           
        }
    }//GEN-LAST:event_userFieldKeyPressed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (userField.getText().equals("admin") && passwordField.getText().equals("admin")) {
                JOptionPane.showMessageDialog(null, "Access permitted!", "Login Success", JOptionPane.INFORMATION_MESSAGE);                
                this.setVisible(false);
                new DefaultFrame().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid Credentials!", "Login Failed", JOptionPane.ERROR_MESSAGE);                
            } 
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new CreateAccount().setVisible(true);
    }//GEN-LAST:event_createAccountButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAccountButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel label;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}