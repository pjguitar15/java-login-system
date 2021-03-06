/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames;

import Connection.ConnectionProvider;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

// sql
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pjgui
 */
public class CreateAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccount
     */
    public CreateAccount() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon ii = new ImageIcon(getClass().getResource("/Image/user.png"));
        Image image = ii.getImage().getScaledInstance(userIcon.getWidth(), userIcon.getHeight(), Image.SCALE_SMOOTH);
        ii = new ImageIcon(image);
        userIcon.setIcon(ii);        
        
        // add padding to text field
        firstNameField.setBorder(BorderFactory.createCompoundBorder(
        firstNameField.getBorder(), 
        BorderFactory.createEmptyBorder(5, 10, 5, 5))); // Top, Left, Bottom, Right
        
        lastNameField.setBorder(BorderFactory.createCompoundBorder(
        lastNameField.getBorder(), 
        BorderFactory.createEmptyBorder(5, 10, 5, 5))); // Top, Left, Bottom, Right
        
        ageField.setBorder(BorderFactory.createCompoundBorder(
        ageField.getBorder(), 
        BorderFactory.createEmptyBorder(5, 10, 5, 5))); // Top, Left, Bottom, Right
        
        userNameField.setBorder(BorderFactory.createCompoundBorder(
        userNameField.getBorder(), 
        BorderFactory.createEmptyBorder(5, 10, 5, 5))); // Top, Left, Bottom, Right
        
        // add padding to password field
        passwordField.setBorder(BorderFactory.createCompoundBorder(
        passwordField.getBorder(), 
        BorderFactory.createEmptyBorder(5, 10, 5, 5))); // Top, Left, Bottom, Right
        
        // remove focus
        getContentPane().requestFocusInWindow();

        // Button cursor hover
        createAccountButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        alreadyHaveAnAccountButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        // disable maximize
        this.setResizable(false);
        
        // set Title
        this.setTitle("Create an account");
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
        firstNameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        createAccountButton = new javax.swing.JButton();
        alreadyHaveAnAccountButton = new javax.swing.JButton();
        lastNameField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        userNameField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Montserrat Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create an Account");

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

        firstNameField.setBackground(new java.awt.Color(255, 255, 255));
        firstNameField.setForeground(new java.awt.Color(51, 51, 51));
        firstNameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        firstNameField.setText("First Name");
        firstNameField.setBorder(null);
        firstNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameFieldFocusLost(evt);
            }
        });
        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });
        firstNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                firstNameFieldKeyPressed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
        passwordField.setForeground(new java.awt.Color(51, 51, 51));
        passwordField.setText("Password");
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

        createAccountButton.setBackground(new java.awt.Color(0, 102, 255));
        createAccountButton.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        createAccountButton.setForeground(new java.awt.Color(255, 255, 255));
        createAccountButton.setText("Create Account");
        createAccountButton.setBorder(null);
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        alreadyHaveAnAccountButton.setBackground(new java.awt.Color(255, 255, 255));
        alreadyHaveAnAccountButton.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        alreadyHaveAnAccountButton.setForeground(new java.awt.Color(0, 102, 255));
        alreadyHaveAnAccountButton.setText("Already have an account");
        alreadyHaveAnAccountButton.setBorder(null);
        alreadyHaveAnAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alreadyHaveAnAccountButtonActionPerformed(evt);
            }
        });

        lastNameField.setBackground(new java.awt.Color(255, 255, 255));
        lastNameField.setForeground(new java.awt.Color(51, 51, 51));
        lastNameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastNameField.setText("Last Name");
        lastNameField.setBorder(null);
        lastNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameFieldFocusLost(evt);
            }
        });
        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });
        lastNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lastNameFieldKeyPressed(evt);
            }
        });

        ageField.setBackground(new java.awt.Color(255, 255, 255));
        ageField.setForeground(new java.awt.Color(51, 51, 51));
        ageField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ageField.setText("Age");
        ageField.setBorder(null);
        ageField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ageFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ageFieldFocusLost(evt);
            }
        });
        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });
        ageField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageFieldKeyPressed(evt);
            }
        });

        userNameField.setBackground(new java.awt.Color(255, 255, 255));
        userNameField.setForeground(new java.awt.Color(51, 51, 51));
        userNameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        userNameField.setText("Username");
        userNameField.setBorder(null);
        userNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userNameFieldFocusLost(evt);
            }
        });
        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });
        userNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userNameFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstNameField)
                    .addComponent(passwordField)
                    .addComponent(createAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alreadyHaveAnAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addComponent(lastNameField)
                    .addComponent(ageField)
                    .addComponent(userNameField))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alreadyHaveAnAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 830, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFieldFocusGained
        // TODO add your handling code here:
        if (firstNameField.getText().equals("First Name")) {
            firstNameField.setText("");
        }
    }//GEN-LAST:event_firstNameFieldFocusGained

    private void firstNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFieldFocusLost
        // TODO add your handling code here:
        if (firstNameField.getText().equals("")) {
            firstNameField.setText("First Name");
        }
    }//GEN-LAST:event_firstNameFieldFocusLost

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void firstNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             // fields
        String fName = firstNameField.getText();
        String lName = lastNameField.getText();
        String age = ageField.getText();
        String uName = userNameField.getText();
        String pw = passwordField.getText();           
        if (!(fName.equals("First Name") || lName.equals("Last Name") || age.equals("Age") || uName.equals("Username"))) {            
            if (pw.equals("Password") || pw.equals("password")) {                
                JOptionPane.showMessageDialog(null, "Password cannot be \"Password\"", "Failed to create account", JOptionPane.ERROR_MESSAGE);
            }else{  
                System.out.println("Success");
                JOptionPane.showMessageDialog(null, "Registration Success!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{            
            JOptionPane.showMessageDialog(null, "Do not leave an empty field", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_firstNameFieldKeyPressed

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        // TODO add your handling code here:
        if (passwordField.getText().equals("Password")) {
            passwordField.setText("");
        }
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        // TODO add your handling code here:
        if (passwordField.getText().equals("")) {
            passwordField.setText("Password");
        }
    }//GEN-LAST:event_passwordFieldFocusLost

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             // fields
        String fName = firstNameField.getText();
        String lName = lastNameField.getText();
        String age = ageField.getText();
        String uName = userNameField.getText();
        String pw = passwordField.getText();           
        if (!(fName.equals("First Name") || lName.equals("Last Name") || age.equals("Age") || uName.equals("Username"))) {            
            if (pw.equals("Password") || pw.equals("password")) {                
                JOptionPane.showMessageDialog(null, "Password cannot be \"Password\"", "Failed to create account", JOptionPane.ERROR_MESSAGE);
            }else{  
                System.out.println("Success");
                JOptionPane.showMessageDialog(null, "Registration Success!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{            
            JOptionPane.showMessageDialog(null, "Do not leave an empty field", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        // TODO add your handling code here:        
        // fields
        String fName = firstNameField.getText();
        String lName = lastNameField.getText();
        String age = ageField.getText();
        String uName = userNameField.getText();
        String pw = passwordField.getText();           
        if (!(fName.equals("First Name") || lName.equals("Last Name") || age.equals("Age") || uName.equals("Username"))) {            
            if (pw.equals("Password") || pw.equals("password")) {                
                JOptionPane.showMessageDialog(null, "Password cannot be \"Password\"", "Failed to create account", JOptionPane.ERROR_MESSAGE);
            }else{  
                try {
                    // sql connection
                    Connection conn = ConnectionProvider.getConn();
                    PreparedStatement addUserToDbQuery = conn.prepareStatement("INSERT INTO users (first_name, last_name, age, username, password) VALUES('"+fName+"', '"+lName+"', '"+Integer.parseInt(age)+"', '"+uName+"', '"+pw+"')");
                    addUserToDbQuery.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registration Success! Proceeding to Login Page.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                    new Login().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CreateAccount.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{            
            JOptionPane.showMessageDialog(null, "Do not leave an empty field", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_createAccountButtonActionPerformed

    private void alreadyHaveAnAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alreadyHaveAnAccountButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_alreadyHaveAnAccountButtonActionPerformed

    private void lastNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFieldFocusGained
        // TODO add your handling code here:
        if (lastNameField.getText().equals("Last Name")) {
            lastNameField.setText("");
        }
    }//GEN-LAST:event_lastNameFieldFocusGained

    private void lastNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFieldFocusLost
        // TODO add your handling code here:
        if (lastNameField.getText().equals("")) {
            lastNameField.setText("Last Name");
        }
    }//GEN-LAST:event_lastNameFieldFocusLost

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void lastNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             // fields
        String fName = firstNameField.getText();
        String lName = lastNameField.getText();
        String age = ageField.getText();
        String uName = userNameField.getText();
        String pw = passwordField.getText();           
        if (!(fName.equals("First Name") || lName.equals("Last Name") || age.equals("Age") || uName.equals("Username"))) {            
            if (pw.equals("Password") || pw.equals("password")) {                
                JOptionPane.showMessageDialog(null, "Password cannot be \"Password\"", "Failed to create account", JOptionPane.ERROR_MESSAGE);
            }else{  
                System.out.println("Success");
                JOptionPane.showMessageDialog(null, "Registration Success!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{            
            JOptionPane.showMessageDialog(null, "Do not leave an empty field", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_lastNameFieldKeyPressed

    private void ageFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFieldFocusGained
        // TODO add your handling code here:
        if (ageField.getText().equals("Age")) {
            ageField.setText("");
        }
    }//GEN-LAST:event_ageFieldFocusGained

    private void ageFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFieldFocusLost
        // TODO add your handling code here:
        if (ageField.getText().equals("")) {
            ageField.setText("Age");
        }
    }//GEN-LAST:event_ageFieldFocusLost

    private void ageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFieldActionPerformed

    private void ageFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             // fields
        String fName = firstNameField.getText();
        String lName = lastNameField.getText();
        String age = ageField.getText();
        String uName = userNameField.getText();
        String pw = passwordField.getText();           
        if (!(fName.equals("First Name") || lName.equals("Last Name") || age.equals("Age") || uName.equals("Username"))) {            
            if (pw.equals("Password") || pw.equals("password")) {                
                JOptionPane.showMessageDialog(null, "Password cannot be \"Password\"", "Failed to create account", JOptionPane.ERROR_MESSAGE);
            }else{  
                System.out.println("Success");
                JOptionPane.showMessageDialog(null, "Registration Success!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{            
            JOptionPane.showMessageDialog(null, "Do not leave an empty field", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_ageFieldKeyPressed

    private void userNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameFieldFocusGained
        // TODO add your handling code here:
        if (userNameField.getText().equals("Username")) {
            userNameField.setText("");
        }
    }//GEN-LAST:event_userNameFieldFocusGained

    private void userNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameFieldFocusLost
        // TODO add your handling code here:
        if (userNameField.getText().equals("")) {
            userNameField.setText("Username");
        }
    }//GEN-LAST:event_userNameFieldFocusLost

    private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameFieldActionPerformed

    private void userNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             // fields
        String fName = firstNameField.getText();
        String lName = lastNameField.getText();
        String age = ageField.getText();
        String uName = userNameField.getText();
        String pw = passwordField.getText();           
        if (!(fName.equals("First Name") || lName.equals("Last Name") || age.equals("Age") || uName.equals("Username"))) {            
            if (pw.equals("Password") || pw.equals("password")) {                
                JOptionPane.showMessageDialog(null, "Password cannot be \"Password\"", "Failed to create account", JOptionPane.ERROR_MESSAGE);
            }else{  
                System.out.println("Success");
                JOptionPane.showMessageDialog(null, "Registration Success!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{            
            JOptionPane.showMessageDialog(null, "Do not leave an empty field", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_userNameFieldKeyPressed

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JButton alreadyHaveAnAccountButton;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel label;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel userIcon;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}
