package generalhospitalproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class Patient extends javax.swing.JFrame {
   String  currentuser  , PName,PNationality;
  String  bd , Blood_Type , City,Neighborhood;
   int PatientID,Phone_Number,Street,File_Number;
/////////////////////////////////////////////////////////////////////////////////
    String DATABASE_URL="jdbc:mysql://localhost:3306/youheal";
    String USER_NAME="root";
    String PASSWORD="Arwa_238643"; 
//////////////////////////////////////////////////////////////////////////////////
  Connection con;
  
    PreparedStatement FillPatientInformation; 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Patient(String currentuser) {
        initComponents();
        this.currentuser=currentuser;

       try { 
          con=DriverManager.getConnection(DATABASE_URL,USER_NAME,PASSWORD);
          FillPatientInformation=con.prepareStatement("Select Username , P.Patient_ID, P.Name , P.BirthDate , P.Blood_Type,P.Phone_Number ,P.City ,P.Street , P.Neighborhood , P.File_Number, PN.Nationality"
                                               + "     from Patient AS P ,Patients_Nationality AS PN, Login "
                                               + "     Where Username= ? AND P.Patient_ID= ID AND P.Patient_ID=PN.Patient_ID ");
          
           retrievePatientInfo(currentuser);
       }
       catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"An SQL Exception Ocuured in patient constructor","YouHeal Hospital", JOptionPane.ERROR_MESSAGE);
           System.exit(1);
            }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    public Patient() {
        initComponents(); 
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PatientPanel = new javax.swing.JPanel();
        upPanel = new javax.swing.JPanel();
        PatientLabel = new javax.swing.JLabel();
        PatientInfoPanel = new javax.swing.JPanel();
        WelcomeLabel = new javax.swing.JLabel();
        PatientInformationLabel = new javax.swing.JLabel();
        IdLabel = new javax.swing.JLabel();
        BirthdayLabel = new javax.swing.JLabel();
        BooldtypeLabel = new javax.swing.JLabel();
        NationaltiyLabel = new javax.swing.JLabel();
        PhoneNumberLabel = new javax.swing.JLabel();
        CityLabel = new javax.swing.JLabel();
        StreetLabel = new javax.swing.JLabel();
        NighborhoodLabel = new javax.swing.JLabel();
        FileNumberLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        IdTextField = new javax.swing.JTextField();
        BirthdayTextField = new javax.swing.JTextField();
        NationaltiyTextField = new javax.swing.JTextField();
        PhoneNumberTextField = new javax.swing.JTextField();
        CityTextField = new javax.swing.JTextField();
        StreetTextField = new javax.swing.JTextField();
        FileNumberTextField = new javax.swing.JTextField();
        NighborhoodTextField = new javax.swing.JTextField();
        BloodTypeTextField = new javax.swing.JTextField();
        ButtonsPanel = new javax.swing.JPanel();
        ShowMyPresciptionButton = new javax.swing.JButton();
        HomePageButton = new javax.swing.JButton();
        contactPanel = new javax.swing.JPanel();
        contactLabel = new javax.swing.JLabel();
        siteLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PatientPanel.setBackground(new java.awt.Color(153, 153, 255));

        upPanel.setBackground(new java.awt.Color(204, 204, 255));

        PatientLabel.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        PatientLabel.setForeground(new java.awt.Color(102, 102, 255));
        PatientLabel.setText("Patient");

        javax.swing.GroupLayout upPanelLayout = new javax.swing.GroupLayout(upPanel);
        upPanel.setLayout(upPanelLayout);
        upPanelLayout.setHorizontalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upPanelLayout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(PatientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        upPanelLayout.setVerticalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PatientLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        PatientInfoPanel.setBackground(new java.awt.Color(204, 204, 255));

        WelcomeLabel.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        WelcomeLabel.setForeground(new java.awt.Color(51, 51, 255));
        WelcomeLabel.setText("Welcome ");

        PatientInformationLabel.setFont(new java.awt.Font("American Typewriter", 1, 14)); // NOI18N
        PatientInformationLabel.setForeground(new java.awt.Color(51, 51, 255));
        PatientInformationLabel.setText("Patient Information:");

        IdLabel.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        IdLabel.setForeground(new java.awt.Color(51, 51, 255));
        IdLabel.setText("ID:");

        BirthdayLabel.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        BirthdayLabel.setForeground(new java.awt.Color(51, 51, 255));
        BirthdayLabel.setText("Birthday:");

        BooldtypeLabel.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        BooldtypeLabel.setForeground(new java.awt.Color(51, 51, 255));
        BooldtypeLabel.setText("Blood Type:");

        NationaltiyLabel.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        NationaltiyLabel.setForeground(new java.awt.Color(51, 51, 255));
        NationaltiyLabel.setText("Nationaltiy:");

        PhoneNumberLabel.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        PhoneNumberLabel.setForeground(new java.awt.Color(51, 51, 255));
        PhoneNumberLabel.setText("Phone Number: ");

        CityLabel.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        CityLabel.setForeground(new java.awt.Color(51, 51, 255));
        CityLabel.setText("City:");

        StreetLabel.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        StreetLabel.setForeground(new java.awt.Color(51, 51, 255));
        StreetLabel.setText("Street:");

        NighborhoodLabel.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        NighborhoodLabel.setForeground(new java.awt.Color(51, 51, 255));
        NighborhoodLabel.setText("Nighborhood:");

        FileNumberLabel.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        FileNumberLabel.setForeground(new java.awt.Color(51, 51, 255));
        FileNumberLabel.setText("File Number:");

        NameTextField.setText("Name ");

        IdTextField.setEditable(false);
        IdTextField.setText("ID");
        IdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTextFieldActionPerformed(evt);
            }
        });

        BirthdayTextField.setEditable(false);
        BirthdayTextField.setText(" Birthday ");
        BirthdayTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BirthdayTextFieldActionPerformed(evt);
            }
        });

        NationaltiyTextField.setEditable(false);
        NationaltiyTextField.setText(" Nationaltiy ");

        PhoneNumberTextField.setEditable(false);
        PhoneNumberTextField.setText(" Phone Number ");

        CityTextField.setEditable(false);
        CityTextField.setText(" City ");

        StreetTextField.setEditable(false);
        StreetTextField.setText(" Street ");

        FileNumberTextField.setEditable(false);
        FileNumberTextField.setText(" File Number ");

        NighborhoodTextField.setEditable(false);
        NighborhoodTextField.setText(" Nighborhood ");

        BloodTypeTextField.setEditable(false);
        BloodTypeTextField.setText("Blood Type");

        javax.swing.GroupLayout PatientInfoPanelLayout = new javax.swing.GroupLayout(PatientInfoPanel);
        PatientInfoPanel.setLayout(PatientInfoPanelLayout);
        PatientInfoPanelLayout.setHorizontalGroup(
            PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdLabel)
                            .addComponent(PatientInformationLabel)
                            .addComponent(FileNumberLabel)
                            .addComponent(CityLabel)
                            .addComponent(PhoneNumberLabel)
                            .addComponent(NationaltiyLabel)
                            .addComponent(BooldtypeLabel)
                            .addComponent(BirthdayLabel)
                            .addComponent(NighborhoodLabel)
                            .addComponent(WelcomeLabel)))
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(StreetLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BirthdayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NighborhoodTextField)
                        .addComponent(FileNumberTextField)
                        .addComponent(StreetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NationaltiyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BloodTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );
        PatientInfoPanelLayout.setVerticalGroup(
            PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WelcomeLabel)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addComponent(PatientInformationLabel)
                        .addGap(18, 18, 18)
                        .addComponent(IdLabel)
                        .addGap(14, 14, 14)
                        .addComponent(BirthdayLabel)
                        .addGap(18, 18, 18)
                        .addComponent(BooldtypeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(NationaltiyLabel)
                        .addGap(12, 12, 12)
                        .addComponent(PhoneNumberLabel))
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BirthdayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BloodTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NationaltiyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(CityLabel))
                    .addComponent(CityTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StreetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StreetLabel))
                .addGap(18, 18, 18)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NighborhoodLabel)
                    .addComponent(NighborhoodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FileNumberLabel)
                    .addComponent(FileNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        ButtonsPanel.setBackground(new java.awt.Color(204, 204, 255));

        ShowMyPresciptionButton.setBackground(new java.awt.Color(102, 102, 255));
        ShowMyPresciptionButton.setForeground(new java.awt.Color(204, 204, 255));
        ShowMyPresciptionButton.setText("Show My Presciption");
        ShowMyPresciptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowMyPresciptionButtonActionPerformed(evt);
            }
        });

        HomePageButton.setBackground(new java.awt.Color(102, 102, 255));
        HomePageButton.setForeground(new java.awt.Color(204, 204, 255));
        HomePageButton.setText("Home Page");
        HomePageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomePageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPanelLayout.createSequentialGroup()
                        .addComponent(ShowMyPresciptionButton)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPanelLayout.createSequentialGroup()
                        .addComponent(HomePageButton)
                        .addGap(59, 59, 59))))
        );
        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(ShowMyPresciptionButton)
                .addGap(27, 27, 27)
                .addComponent(HomePageButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout PatientPanelLayout = new javax.swing.GroupLayout(PatientPanel);
        PatientPanel.setLayout(PatientPanelLayout);
        PatientPanelLayout.setHorizontalGroup(
            PatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(upPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(contactPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PatientPanelLayout.createSequentialGroup()
                            .addComponent(PatientInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(207, 207, 207))
        );
        PatientPanelLayout.setVerticalGroup(
            PatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(upPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PatientInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contactPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PatientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PatientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomePageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomePageButtonActionPerformed
        HomePage homepage = new HomePage();
       homepage.setVisible(true);
       homepage.pack();
       this.setVisible(false);
    }//GEN-LAST:event_HomePageButtonActionPerformed

    private void ShowMyPresciptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowMyPresciptionButtonActionPerformed

        Prescription prescription = new Prescription(PatientID);
     prescription.setVisible(true);
     prescription.pack();
     this.setVisible(false);

    }//GEN-LAST:event_ShowMyPresciptionButtonActionPerformed

    private void IdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTextFieldActionPerformed
     
        
    }//GEN-LAST:event_IdTextFieldActionPerformed

    private void BirthdayTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BirthdayTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BirthdayTextFieldActionPerformed
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BirthdayLabel;
    private javax.swing.JTextField BirthdayTextField;
    private javax.swing.JTextField BloodTypeTextField;
    private javax.swing.JLabel BooldtypeLabel;
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JTextField CityTextField;
    private javax.swing.JLabel FileNumberLabel;
    private javax.swing.JTextField FileNumberTextField;
    private javax.swing.JButton HomePageButton;
    private javax.swing.JLabel IdLabel;
    private javax.swing.JTextField IdTextField;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel NationaltiyLabel;
    private javax.swing.JTextField NationaltiyTextField;
    private javax.swing.JLabel NighborhoodLabel;
    private javax.swing.JTextField NighborhoodTextField;
    private javax.swing.JPanel PatientInfoPanel;
    private javax.swing.JLabel PatientInformationLabel;
    private javax.swing.JLabel PatientLabel;
    private javax.swing.JPanel PatientPanel;
    private javax.swing.JLabel PhoneNumberLabel;
    private javax.swing.JTextField PhoneNumberTextField;
    private javax.swing.JButton ShowMyPresciptionButton;
    private javax.swing.JLabel StreetLabel;
    private javax.swing.JTextField StreetTextField;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JPanel contactPanel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel siteLabel;
    private javax.swing.JPanel upPanel;
    // End of variables declaration//GEN-END:variables
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  private void retrievePatientInfo(String currentuser) {
        ResultSet rs=null;
        try{
     FillPatientInformation.setString(1, currentuser);
      rs=FillPatientInformation.executeQuery();
           
          while (rs.next())
             {
                       PatientID=rs.getInt("Patient_ID");
                       IdTextField.setText(String.valueOf(PatientID));
                       
                        PName=rs.getString("Name");
                       NameTextField.setText(PName);
                       
                       bd=rs.getString("BirthDate");
                       BirthdayTextField.setText(bd);
                       
                        Blood_Type=rs.getString("Blood_Type");
                       BloodTypeTextField.setText(Blood_Type);
                       
                       PNationality=rs.getString("Nationality");
                       NationaltiyTextField.setText(PNationality);
                       
                        Phone_Number=rs.getInt("Phone_Number");
                       PhoneNumberTextField.setText(String.valueOf(Phone_Number));
                       
                        City  = rs.getString("City");
                       CityTextField.setText(City);
                       
                        Street  = rs.getInt("Street");
                        StreetTextField.setText(String.valueOf(Street));
                        
                        Neighborhood  = rs.getString("Neighborhood");
                        NighborhoodTextField.setText(Neighborhood);
                        
                        File_Number  = rs.getInt("File_Number");  
                       FileNumberTextField.setText(String.valueOf(File_Number));
                   }
        }
          catch(SQLException e){
           JOptionPane.showMessageDialog(null,"An SQL Exception Ocuured in retrieving Doctor's Info","YouHeal Hospital", JOptionPane.ERROR_MESSAGE);
           System.exit(1);
       }
       finally{
              try{
                 rs.close();
              }
              catch(SQLException e){
           JOptionPane.showMessageDialog(null,"An SQL Exception Ocuured in retrieving Doctor's Info,Closing the ResultSet ","YouHeal Hospital", JOptionPane.ERROR_MESSAGE);
           close();
         }       
      }
           
    }
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    public void close(){
    try{
        con.close();
    }
    catch(SQLException e){
           JOptionPane.showMessageDialog(null,e.getMessage(),"error_YouHeal",JOptionPane.ERROR_MESSAGE);
       }
  }
}