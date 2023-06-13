package generalhospitalproject;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Register extends javax.swing.JFrame {
    Connection conn = null ; 
    PreparedStatement pst = null; 
    ResultSet rs = null; 
    public static int counterSingup =0; 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    public Register() {
        initComponents();
          Register.counterSingup =counterSingup++; 
    }
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterPanel = new javax.swing.JPanel();
        PatientInfoPanel = new javax.swing.JPanel();
        NameLabel = new javax.swing.JLabel();
        IdLabel = new javax.swing.JLabel();
        BirthdayLabel = new javax.swing.JLabel();
        BooldtypeLabel = new javax.swing.JLabel();
        NationaltiyLabel = new javax.swing.JLabel();
        PhoneNumberLabel = new javax.swing.JLabel();
        CityLabel = new javax.swing.JLabel();
        StreetLabel = new javax.swing.JLabel();
        NighborhoodLabel = new javax.swing.JLabel();
        FileNumberLabel = new javax.swing.JLabel();
        IdTextField = new javax.swing.JTextField();
        BirthdayTextField = new javax.swing.JTextField();
        NationaltiyTextField = new javax.swing.JTextField();
        PhoneNumberTextField = new javax.swing.JTextField();
        CityTextField = new javax.swing.JTextField();
        StreetTextField = new javax.swing.JTextField();
        FileNumberTextField = new javax.swing.JTextField();
        NighborhoodTextField = new javax.swing.JTextField();
        BloodTypeComboBox = new javax.swing.JComboBox<>();
        PasswordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        FillTheInformationPanel = new javax.swing.JPanel();
        FillTheInformationLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        usernameLabel1 = new javax.swing.JLabel();
        usernameTextField1 = new javax.swing.JTextField();
        GoBackButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        UpPanel = new javax.swing.JPanel();
        RegisterLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RegisterPanel.setBackground(new java.awt.Color(153, 153, 255));

        PatientInfoPanel.setBackground(new java.awt.Color(204, 204, 255));

        NameLabel.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(51, 51, 255));
        NameLabel.setText("Name: ");

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

        IdTextField.setText("Type ID here");

        BirthdayTextField.setText("Type Birthday here");

        NationaltiyTextField.setText("Type Nationaltiy here");

        PhoneNumberTextField.setText("Type Phone Number here");

        CityTextField.setText("Type City here");

        StreetTextField.setText("Type Street here");

        FileNumberTextField.setText("Type File Number here");

        NighborhoodTextField.setText("Type Nighborhood here");

        BloodTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A-", "A+", "B-", "B+", "AB-", "AB+", "O-", "O+" }));
        BloodTypeComboBox.setToolTipText("");

        PasswordLabel.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(51, 51, 255));
        PasswordLabel.setText("Password:");

        PasswordField.setText("111111111");

        FillTheInformationPanel.setBackground(new java.awt.Color(102, 102, 255));

        FillTheInformationLabel.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        FillTheInformationLabel.setForeground(new java.awt.Color(204, 204, 255));
        FillTheInformationLabel.setText("Fill The Information Below");

        javax.swing.GroupLayout FillTheInformationPanelLayout = new javax.swing.GroupLayout(FillTheInformationPanel);
        FillTheInformationPanel.setLayout(FillTheInformationPanelLayout);
        FillTheInformationPanelLayout.setHorizontalGroup(
            FillTheInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FillTheInformationPanelLayout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(FillTheInformationLabel)
                .addGap(88, 88, 88))
        );
        FillTheInformationPanelLayout.setVerticalGroup(
            FillTheInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FillTheInformationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        NameTextField.setText("Type Name here");

        usernameLabel1.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        usernameLabel1.setForeground(new java.awt.Color(51, 51, 255));
        usernameLabel1.setText("username:");

        usernameTextField1.setText("Type username here");
        usernameTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PatientInfoPanelLayout = new javax.swing.GroupLayout(PatientInfoPanel);
        PatientInfoPanel.setLayout(PatientInfoPanelLayout);
        PatientInfoPanelLayout.setHorizontalGroup(
            PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientInfoPanelLayout.createSequentialGroup()
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdLabel)
                            .addComponent(FileNumberLabel)
                            .addComponent(StreetLabel)
                            .addComponent(CityLabel)
                            .addComponent(NighborhoodLabel)
                            .addComponent(PasswordLabel)))
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NationaltiyLabel))
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BooldtypeLabel)
                            .addComponent(BirthdayLabel)
                            .addComponent(PhoneNumberLabel)))
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NameLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BirthdayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BloodTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NighborhoodTextField)
                        .addComponent(FileNumberTextField)
                        .addComponent(StreetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NationaltiyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
            .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FillTheInformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(usernameLabel1)
                        .addGap(57, 57, 57)
                        .addComponent(usernameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PatientInfoPanelLayout.setVerticalGroup(
            PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernameLabel1)
                    .addComponent(usernameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FillTheInformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BirthdayLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BirthdayTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BooldtypeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BloodTypeComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NationaltiyLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NationaltiyTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientInfoPanelLayout.createSequentialGroup()
                        .addComponent(CityLabel)
                        .addGap(18, 18, 18)
                        .addComponent(StreetLabel)
                        .addGap(18, 18, 18)
                        .addComponent(NighborhoodLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FileNumberLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientInfoPanelLayout.createSequentialGroup()
                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneNumberLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StreetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NighborhoodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FileNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        GoBackButton.setBackground(new java.awt.Color(102, 102, 255));
        GoBackButton.setText("Go Back");
        GoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackButtonActionPerformed(evt);
            }
        });

        SubmitButton.setBackground(new java.awt.Color(102, 102, 255));
        SubmitButton.setForeground(new java.awt.Color(204, 204, 255));
        SubmitButton.setText("Submit");
        SubmitButton.setActionCommand("");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        UpPanel.setBackground(new java.awt.Color(204, 204, 255));

        RegisterLabel.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        RegisterLabel.setForeground(new java.awt.Color(102, 102, 255));
        RegisterLabel.setText("Register");

        javax.swing.GroupLayout UpPanelLayout = new javax.swing.GroupLayout(UpPanel);
        UpPanel.setLayout(UpPanelLayout);
        UpPanelLayout.setHorizontalGroup(
            UpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpPanelLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(RegisterLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UpPanelLayout.setVerticalGroup(
            UpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RegisterLabel)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout RegisterPanelLayout = new javax.swing.GroupLayout(RegisterPanel);
        RegisterPanel.setLayout(RegisterPanelLayout);
        RegisterPanelLayout.setHorizontalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(RegisterPanelLayout.createSequentialGroup()
                        .addComponent(GoBackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SubmitButton))
                    .addComponent(PatientInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        RegisterPanelLayout.setVerticalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(UpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PatientInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitButton)
                    .addComponent(GoBackButton))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackButtonActionPerformed
        HomePage homepage = new HomePage ();
        homepage.setVisible(true);
        homepage.pack();
        this.setVisible(false);
                                        
    }//GEN-LAST:event_GoBackButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
       
        try{
            String username=usernameTextField1.getText();
            String password =PasswordField.getText();
            String Name=NameTextField.getText(); 
            String id= IdTextField.getText(); 
            String file =FileNumberTextField.getText(); 
            String BD= BirthdayTextField.getText();  
            String nationality=NationaltiyTextField.getText(); 
            String phonNo=PhoneNumberTextField.getText(); 
            String city=CityTextField.getText(); 
            String Nighborhood=NighborhoodTextField.getText(); 
            String street =StreetTextField.getText();  

              conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/youheal","root","Arwa_238643"); 
               String Query1="Insert into Login   ( Username , password  ,ID , UserType )"
                       + "    values(?,?,?,?)"; 
               String Query2 = "Insert into Patient (Patient_ID ,File_Number ,Name ,BirthDate,Blood_Type , Phone_Number,City ,Neighborhood , Street ) "
                       + "      values (?,?,?,?,?,?,?,?,?)"; 
               String Query3="Insert into Patients_Nationality(Nationality) "
                       + "      values (?)";
               
            if (file.trim().equals("")&&street.trim().equals("")&&Nighborhood.trim().equals("")&&city.trim().equals("")&&nationality.trim().equals("")
                &&id.trim().equals("")&&password.trim().equalsIgnoreCase("")&&username.trim().equalsIgnoreCase("")&&Name.trim().equalsIgnoreCase("")){ 

                JOptionPane.showMessageDialog(null, "Enter Information to singup ","warning Information  ",2);
            } 
            
            else if (phonNo.trim().length()>10){ 

                JOptionPane.showMessageDialog(null, " Make sure that enter 10 number  of number  ","warning phone Number  ",2);     
            } 

            pst=conn.prepareStatement(Query1); 
            pst.setString(1,username);  
            pst.setString(2,password ); 
            pst.setInt(3,Integer.parseInt(id)); 
            pst.setString(4,"patient"); 
            pst.execute(); 

            pst=conn.prepareStatement(Query2); 
            pst.setInt(1,Integer.parseInt(id));  
            pst.setInt(2,Integer.parseInt(file)); 
            pst.setString(3,Name);
            pst.setString(4,BD);  
            pst.setString(5,(String)BloodTypeComboBox.getSelectedItem()); 
            pst.setInt(6,Integer.parseInt(phonNo));  
            pst.setString(7,city);  
            pst.setString(8,Nighborhood); 
            pst.setInt(9,Integer.parseInt(street));   
            pst.execute(); 
            
            pst=conn.prepareStatement(Query3); 
            pst.setString(1,nationality); 

             JOptionPane.showMessageDialog(null, "You singup Successfully \n Thankyou:)","Singup",JOptionPane.PLAIN_MESSAGE); 
        } 

        catch(SQLException e){ 

           JOptionPane.showMessageDialog(null,"an SQL error has occurred...","Error",JOptionPane.ERROR_MESSAGE); 
        } 
        catch (HeadlessException | NumberFormatException e){ 

           JOptionPane.showMessageDialog(null,"an error has occurred...","Error",JOptionPane.ERROR_MESSAGE);     
        } 

         HomePage h = new HomePage (); 
                  h.setVisible(true); 
                  this.setVisible(false);            
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void usernameTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextField1ActionPerformed
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BirthdayLabel;
    private javax.swing.JTextField BirthdayTextField;
    private javax.swing.JComboBox<String> BloodTypeComboBox;
    private javax.swing.JLabel BooldtypeLabel;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JTextField CityTextField;
    private javax.swing.JLabel FileNumberLabel;
    private javax.swing.JTextField FileNumberTextField;
    private javax.swing.JLabel FillTheInformationLabel;
    private javax.swing.JPanel FillTheInformationPanel;
    private javax.swing.JButton GoBackButton;
    private javax.swing.JLabel IdLabel;
    private javax.swing.JTextField IdTextField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel NationaltiyLabel;
    private javax.swing.JTextField NationaltiyTextField;
    private javax.swing.JLabel NighborhoodLabel;
    private javax.swing.JTextField NighborhoodTextField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPanel PatientInfoPanel;
    private javax.swing.JLabel PhoneNumberLabel;
    private javax.swing.JTextField PhoneNumberTextField;
    private javax.swing.JLabel RegisterLabel;
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JLabel StreetLabel;
    private javax.swing.JTextField StreetTextField;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JPanel UpPanel;
    private javax.swing.JLabel usernameLabel1;
    private javax.swing.JTextField usernameTextField1;
    // End of variables declaration//GEN-END:variables
}
