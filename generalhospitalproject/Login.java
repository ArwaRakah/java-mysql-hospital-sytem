package generalhospitalproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class Login extends javax.swing.JFrame {
 Connection conn = null ;
    PreparedStatement pst;
    ResultSet rs = null;
    String usertype="";
    public static int counterLogin =0;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    public Login() {
        initComponents();
        Login.counterLogin =counterLogin++;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        LoginPanel = new javax.swing.JPanel();
        contactPanel = new javax.swing.JPanel();
        contactLabel = new javax.swing.JLabel();
        siteLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        upPanel = new javax.swing.JPanel();
        LoginLabel = new javax.swing.JLabel();
        LoginPanel2 = new javax.swing.JPanel();
        UserNameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        UserNameTextField = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        ForgotPasswordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        DoctorRadioButton = new javax.swing.JRadioButton();
        PatinetRadioButton = new javax.swing.JRadioButton();
        GoBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginPanel.setBackground(new java.awt.Color(153, 153, 255));

        contactPanel.setBackground(new java.awt.Color(153, 153, 255));

        contactLabel.setBackground(new java.awt.Color(51, 51, 255));
        contactLabel.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        contactLabel.setForeground(new java.awt.Color(51, 51, 255));
        contactLabel.setText("Contact us:");

        siteLabel.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        siteLabel.setForeground(new java.awt.Color(255, 255, 255));
        siteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generalhospitalproject/site.png"))); // NOI18N
        siteLabel.setText("Saudi Arabia");

        phoneLabel.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generalhospitalproject/phone.png"))); // NOI18N
        phoneLabel.setText("9200011111");

        emailLabel.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generalhospitalproject/email.png"))); // NOI18N
        emailLabel.setText("YouHealHospital@hotmail.com");

        javax.swing.GroupLayout contactPanelLayout = new javax.swing.GroupLayout(contactPanel);
        contactPanel.setLayout(contactPanelLayout);
        contactPanelLayout.setHorizontalGroup(
            contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contactPanelLayout.createSequentialGroup()
                        .addComponent(contactLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contactPanelLayout.createSequentialGroup()
                        .addComponent(siteLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(phoneLabel)
                        .addGap(35, 35, 35)
                        .addComponent(emailLabel)
                        .addGap(27, 27, 27))))
        );
        contactPanelLayout.setVerticalGroup(
            contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactPanelLayout.createSequentialGroup()
                .addComponent(contactLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siteLabel)
                    .addComponent(phoneLabel)
                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        upPanel.setBackground(new java.awt.Color(204, 204, 255));

        LoginLabel.setBackground(new java.awt.Color(204, 204, 255));
        LoginLabel.setFont(new java.awt.Font("American Typewriter", 1, 18)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(102, 102, 255));
        LoginLabel.setText("Login");

        javax.swing.GroupLayout upPanelLayout = new javax.swing.GroupLayout(upPanel);
        upPanel.setLayout(upPanelLayout);
        upPanelLayout.setHorizontalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginLabel)
                .addGap(150, 150, 150))
        );
        upPanelLayout.setVerticalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LoginPanel2.setBackground(new java.awt.Color(204, 204, 255));

        UserNameLabel.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        UserNameLabel.setForeground(new java.awt.Color(51, 51, 255));
        UserNameLabel.setText("User Name:");

        PasswordLabel.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(51, 51, 255));
        PasswordLabel.setText("Password:");

        UserNameTextField.setText("Type UserName here");
        UserNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameTextFieldActionPerformed(evt);
            }
        });

        LoginButton.setBackground(new java.awt.Color(102, 102, 255));
        LoginButton.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(204, 204, 255));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        ForgotPasswordLabel.setFont(new java.awt.Font("Mukta Mahee", 2, 14)); // NOI18N
        ForgotPasswordLabel.setForeground(new java.awt.Color(51, 51, 255));
        ForgotPasswordLabel.setText("Forgot Password? Contact us");

        PasswordField.setText("PasswordField");

        buttonGroup1.add(DoctorRadioButton);
        DoctorRadioButton.setForeground(new java.awt.Color(51, 51, 255));
        DoctorRadioButton.setText("Doctor");
        DoctorRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(PatinetRadioButton);
        PatinetRadioButton.setForeground(new java.awt.Color(51, 51, 255));
        PatinetRadioButton.setText("Patinet");
        PatinetRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatinetRadioButtonActionPerformed(evt);
            }
        });

        GoBackButton.setBackground(new java.awt.Color(102, 102, 255));
        GoBackButton.setFont(new java.awt.Font("Heiti TC", 0, 13)); // NOI18N
        GoBackButton.setText("Go Back");
        GoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanel2Layout = new javax.swing.GroupLayout(LoginPanel2);
        LoginPanel2.setLayout(LoginPanel2Layout);
        LoginPanel2Layout.setHorizontalGroup(
            LoginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanel2Layout.createSequentialGroup()
                .addGroup(LoginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LoginPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(LoginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ForgotPasswordLabel)
                            .addGroup(LoginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanel2Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(GoBackButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(LoginPanel2Layout.createSequentialGroup()
                                    .addGroup(LoginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PasswordLabel)
                                        .addComponent(UserNameLabel))
                                    .addGap(52, 52, 52)
                                    .addGroup(LoginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LoginPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(DoctorRadioButton)
                        .addGap(67, 67, 67)
                        .addComponent(PatinetRadioButton)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        LoginPanel2Layout.setVerticalGroup(
            LoginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(LoginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNameLabel)
                    .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(LoginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ForgotPasswordLabel)
                .addGap(21, 21, 21)
                .addGroup(LoginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatinetRadioButton)
                    .addComponent(DoctorRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(LoginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GoBackButton)
                    .addComponent(LoginButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(contactPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LoginPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(upPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(upPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
           try {
         
                String username = UserNameTextField.getText();
                String password = PasswordField.getText();
                Patient patient  = new Patient (username);
                Doctor doctor = new Doctor(username);
                
              if (password.trim().equalsIgnoreCase("")&&username.trim().equalsIgnoreCase(""))
                 {
                   JOptionPane.showMessageDialog(null, "Enter password and username to Login ","Empty password and username ",2);
                 }
              else if (username.trim().equalsIgnoreCase(""))
                 {
                  JOptionPane.showMessageDialog(null, "Enter username to Login ","Empty Username ",2);
                 }
              else if (password.trim().equalsIgnoreCase(""))
                 {
                 JOptionPane.showMessageDialog(null, "Enter password to Login ","Empty password ",2);
                 } 
              
                conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/youheal","root","Arwa_238643");
                String query = "Select * from Login  where  Username=? and password =? and UserType =?";
                pst=conn.prepareStatement(query) ;
                pst.setString(1,username );
                pst.setString(2,password);
                pst.setString(3, usertype);
//       pst.setString(3,String.valueOf(jComboBox1.getSelectedItem()));
                rs=pst.executeQuery();
                
                  if (rs.next())
                   {
                     JOptionPane.showMessageDialog(this, "username and password matched and you are login as "+rs.getString("Usertype"));
                      if (PatinetRadioButton.isSelected())
                       {
                         patient.setVisible(true);
                         patient.pack();
                         this.setVisible(false);
                       }
                      else if (DoctorRadioButton.isSelected())
                        {
                         doctor.setVisible(true);
                         doctor.pack();
                         this.setVisible(false);
                        }
                   }
                  else
                   {
                    JOptionPane.showMessageDialog(this,"not matched please try again !","Warning Message ",JOptionPane.ERROR_MESSAGE);
                   }
            }
           catch ( SQLException e){
              JOptionPane.showMessageDialog(this,"please try again !","Warning Message ",JOptionPane.ERROR_MESSAGE);
              System.exit(1);
            }  
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void DoctorRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorRadioButtonActionPerformed
          usertype="Doctor";
    }//GEN-LAST:event_DoctorRadioButtonActionPerformed

    private void PatinetRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatinetRadioButtonActionPerformed
         usertype="patient";
    }//GEN-LAST:event_PatinetRadioButtonActionPerformed

    private void GoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackButtonActionPerformed
        HomePage homepage = new HomePage ();
        homepage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GoBackButtonActionPerformed

    private void UserNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTextFieldActionPerformed
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton DoctorRadioButton;
    private javax.swing.JLabel ForgotPasswordLabel;
    private javax.swing.JButton GoBackButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel LoginPanel2;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JRadioButton PatinetRadioButton;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JPanel contactPanel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel siteLabel;
    private javax.swing.JPanel upPanel;
    // End of variables declaration//GEN-END:variables
}
