
package generalhospitalproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Department extends javax.swing.JFrame {
      int index=1; 
      int ID=1; 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
    public Department() {
        initComponents();
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        upPanel = new javax.swing.JPanel();
        DepartmentupLabel = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        IDLabel = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        departmentTextField = new javax.swing.JTextField();
        IDTextField = new javax.swing.JTextField();
        contactPanel = new javax.swing.JPanel();
        contactLabel = new javax.swing.JLabel();
        siteLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        ShowDocButton = new javax.swing.JButton();
        GoBackButton = new javax.swing.JButton();
        DepComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(153, 153, 255));
        mainPanel.setForeground(new java.awt.Color(102, 0, 255));

        upPanel.setBackground(new java.awt.Color(204, 204, 255));

        DepartmentupLabel.setBackground(new java.awt.Color(255, 255, 255));
        DepartmentupLabel.setFont(new java.awt.Font("American Typewriter", 1, 18)); // NOI18N
        DepartmentupLabel.setForeground(new java.awt.Color(102, 102, 255));
        DepartmentupLabel.setText("Department");

        javax.swing.GroupLayout upPanelLayout = new javax.swing.GroupLayout(upPanel);
        upPanel.setLayout(upPanelLayout);
        upPanelLayout.setHorizontalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DepartmentupLabel)
                .addGap(182, 182, 182))
        );
        upPanelLayout.setVerticalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DepartmentupLabel)
                .addContainerGap())
        );

        Panel2.setBackground(new java.awt.Color(204, 204, 255));
        Panel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        IDLabel.setBackground(new java.awt.Color(204, 204, 255));
        IDLabel.setFont(new java.awt.Font("American Typewriter", 1, 12)); // NOI18N
        IDLabel.setForeground(new java.awt.Color(51, 51, 255));
        IDLabel.setText("ID:");

        welcomeLabel.setFont(new java.awt.Font("American Typewriter", 1, 12)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(51, 51, 255));
        welcomeLabel.setText("Welcome at:");

        departmentTextField.setForeground(new java.awt.Color(153, 153, 255));
        departmentTextField.setText("Accident and emergency");
        departmentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentTextFieldActionPerformed(evt);
            }
        });

        IDTextField.setForeground(new java.awt.Color(153, 153, 255));
        IDTextField.setText("1");
        IDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(welcomeLabel))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(IDLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(departmentTextField)
                    .addComponent(IDTextField))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLabel)
                    .addComponent(departmentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDLabel)
                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(223, 223, 223))
        );

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

        Panel3.setBackground(new java.awt.Color(204, 204, 255));
        Panel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ShowDocButton.setBackground(new java.awt.Color(102, 102, 255));
        ShowDocButton.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        ShowDocButton.setText("Show Doctors");
        ShowDocButton.setToolTipText("");
        ShowDocButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDocButtonActionPerformed(evt);
            }
        });

        GoBackButton.setBackground(new java.awt.Color(102, 102, 255));
        GoBackButton.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        GoBackButton.setText("Go back to Homepage");
        GoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackButtonActionPerformed(evt);
            }
        });

        DepComboBox.setBackground(new java.awt.Color(102, 102, 255));
        DepComboBox.setEditable(true);
        DepComboBox.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        DepComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accident and emergency", "Diagnostic imaging", "Ear nose and throat (ENT)", "Orthopaedics", "Dermatology clinics", "Gastroenterology", "Maternity departments", "Gynaecology", "Dental clinics", "Physiotherapy" }));
        DepComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DepComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShowDocButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(DepComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ShowDocButton)
                .addGap(12, 12, 12)
                .addComponent(GoBackButton)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(contactPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(upPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contactPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void departmentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentTextFieldActionPerformed
     
    }//GEN-LAST:event_departmentTextFieldActionPerformed

    private void IDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTextFieldActionPerformed
      
    }//GEN-LAST:event_IDTextFieldActionPerformed

    private void ShowDocButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDocButtonActionPerformed
        showDoctor doctor = new showDoctor(ID);
        
        doctor.setVisible(true);
        doctor.pack();
        setVisible(false);
    }//GEN-LAST:event_ShowDocButtonActionPerformed

    private void GoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackButtonActionPerformed
        HomePage Application = new HomePage();

        Application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Application.setVisible(true);
        Application.pack();
        setVisible(false);
    }//GEN-LAST:event_GoBackButtonActionPerformed

    private void DepComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepComboBoxActionPerformed
       
        String value = DepComboBox.getSelectedItem().toString(); 
        departmentTextField.setText(value); 
        index = DepComboBox.getSelectedIndex(); 
        index++; 
        IDTextField.setText(" "+index+" "); 
        ID = index; 
    }//GEN-LAST:event_DepComboBoxActionPerformed
 
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
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Department().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DepComboBox;
    private javax.swing.JLabel DepartmentupLabel;
    private javax.swing.JButton GoBackButton;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JButton ShowDocButton;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JPanel contactPanel;
    private javax.swing.JTextField departmentTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel siteLabel;
    private javax.swing.JPanel upPanel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
