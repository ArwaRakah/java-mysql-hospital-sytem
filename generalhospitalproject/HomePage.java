package generalhospitalproject;

public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomePagePanel = new javax.swing.JPanel();
        upPanel = new javax.swing.JPanel();
        youHealHospitalLabel = new javax.swing.JLabel();
        LogoLabel = new javax.swing.JLabel();
        LoginPanel = new javax.swing.JPanel();
        HomePageMsgLabel = new javax.swing.JLabel();
        SignUpLabel = new javax.swing.JLabel();
        SignUpButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        HomePageMsgLabel1 = new javax.swing.JLabel();
        DepartmentButton = new javax.swing.JButton();
        contactPanel = new javax.swing.JPanel();
        contactLabel = new javax.swing.JLabel();
        siteLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HomePagePanel.setBackground(new java.awt.Color(153, 153, 255));

        upPanel.setBackground(new java.awt.Color(87, 71, 223));
        upPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        youHealHospitalLabel.setFont(new java.awt.Font("Apple Chancery", 3, 36)); // NOI18N
        youHealHospitalLabel.setForeground(new java.awt.Color(204, 204, 255));
        youHealHospitalLabel.setText("YouHeal Hospital");

        javax.swing.GroupLayout upPanelLayout = new javax.swing.GroupLayout(upPanel);
        upPanel.setLayout(upPanelLayout);
        upPanelLayout.setHorizontalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upPanelLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(youHealHospitalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        upPanelLayout.setVerticalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(youHealHospitalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generalhospitalproject/YouHealLogo.png"))); // NOI18N
        LogoLabel.setText("jLabel1");

        LoginPanel.setBackground(new java.awt.Color(204, 204, 255));
        LoginPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        HomePageMsgLabel.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        HomePageMsgLabel.setForeground(new java.awt.Color(51, 51, 255));
        HomePageMsgLabel.setText("To be able to serve you you,");
        HomePageMsgLabel.setToolTipText("");

        SignUpLabel.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        SignUpLabel.setForeground(new java.awt.Color(51, 51, 255));
        SignUpLabel.setText("if you don't have an account ?");

        SignUpButton.setBackground(new java.awt.Color(102, 102, 255));
        SignUpButton.setFont(new java.awt.Font("Kannada MN", 2, 14)); // NOI18N
        SignUpButton.setForeground(new java.awt.Color(204, 204, 255));
        SignUpButton.setText("SignUp");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });

        LoginButton.setBackground(new java.awt.Color(102, 102, 255));
        LoginButton.setFont(new java.awt.Font("Myanmar MN", 2, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(204, 204, 255));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        HomePageMsgLabel1.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        HomePageMsgLabel1.setForeground(new java.awt.Color(51, 51, 255));
        HomePageMsgLabel1.setText("Please login or contact us..");
        HomePageMsgLabel1.setToolTipText("");

        DepartmentButton.setBackground(new java.awt.Color(102, 102, 255));
        DepartmentButton.setFont(new java.awt.Font("Malayalam MN", 2, 14)); // NOI18N
        DepartmentButton.setText("Our Department");
        DepartmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HomePageMsgLabel)
                            .addComponent(HomePageMsgLabel1)))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(SignUpLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SignUpButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addComponent(LoginButton)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addComponent(DepartmentButton)
                        .addGap(98, 98, 98))))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(HomePageMsgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HomePageMsgLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DepartmentButton)
                .addGap(22, 22, 22)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignUpLabel)
                    .addComponent(SignUpButton))
                .addGap(31, 31, 31))
        );

        contactPanel.setBackground(new java.awt.Color(102, 102, 255));

        contactLabel.setBackground(new java.awt.Color(51, 51, 255));
        contactLabel.setFont(new java.awt.Font("Bangla MN", 3, 14)); // NOI18N
        contactLabel.setForeground(new java.awt.Color(51, 0, 255));
        contactLabel.setText("Contact us:");

        siteLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        siteLabel.setForeground(new java.awt.Color(255, 255, 255));
        siteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generalhospitalproject/site.png"))); // NOI18N
        siteLabel.setText("Saudi Arabia");

        phoneLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generalhospitalproject/phone.png"))); // NOI18N
        phoneLabel.setText("9200011111");

        emailLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generalhospitalproject/email.png"))); // NOI18N
        emailLabel.setText("YouHealHospital@hotmail.com");

        javax.swing.GroupLayout contactPanelLayout = new javax.swing.GroupLayout(contactPanel);
        contactPanel.setLayout(contactPanelLayout);
        contactPanelLayout.setHorizontalGroup(
            contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contactPanelLayout.createSequentialGroup()
                        .addComponent(contactLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(contactPanelLayout.createSequentialGroup()
                        .addComponent(siteLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(phoneLabel)
                        .addGap(92, 92, 92)
                        .addComponent(emailLabel)))
                .addContainerGap())
        );
        contactPanelLayout.setVerticalGroup(
            contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactPanelLayout.createSequentialGroup()
                .addComponent(contactLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siteLabel)
                    .addComponent(phoneLabel)
                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout HomePagePanelLayout = new javax.swing.GroupLayout(HomePagePanel);
        HomePagePanel.setLayout(HomePagePanelLayout);
        HomePagePanelLayout.setHorizontalGroup(
            HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(upPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePagePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(386, 386, 386))
            .addGroup(HomePagePanelLayout.createSequentialGroup()
                .addComponent(contactPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        HomePagePanelLayout.setVerticalGroup(
            HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePagePanelLayout.createSequentialGroup()
                .addComponent(upPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(contactPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        Login login = new Login ();
         login.setVisible(true);
         login.pack();
        this.setVisible(false);
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        Register Register = new Register ();
        Register.setVisible(true);
        Register.pack();
        this.setVisible(false);
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void DepartmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartmentButtonActionPerformed
        // TODO add your handling code here:
        Department department = new Department();
        department.setVisible(true);
        department.pack();
        this.setVisible(false);
    }//GEN-LAST:event_DepartmentButtonActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DepartmentButton;
    private javax.swing.JLabel HomePageMsgLabel;
    private javax.swing.JLabel HomePageMsgLabel1;
    private javax.swing.JPanel HomePagePanel;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JLabel SignUpLabel;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JPanel contactPanel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel siteLabel;
    private javax.swing.JPanel upPanel;
    private javax.swing.JLabel youHealHospitalLabel;
    // End of variables declaration//GEN-END:variables
}

