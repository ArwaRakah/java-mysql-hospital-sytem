package generalhospitalproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class Doctor extends JFrame {
    
  String  DoctorsUsername , DoctorID , DoctorName ;
  String  Speciality , DepartmentName , PatientsName [];
   int DepartmentNum,Patient_ID;
/////////////////////////////////////////////////////////////////////////////////
    String DATABASE_URL="jdbc:mysql://localhost:3306/youheal";
    String USER_NAME="root";
    String PASSWORD="Arwa_238643"; 
//////////////////////////////////////////////////////////////////////////////////
  Connection con;
  
    PreparedStatement FillDoctorInformation;
    PreparedStatement DoctorsPatient;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    public Doctor(String DoctorsUsername) {
     initComponents();
     this.DoctorsUsername = DoctorsUsername;
     
        try{
            con=DriverManager.getConnection(DATABASE_URL,USER_NAME,PASSWORD);
              
              FillDoctorInformation = con.prepareStatement("SELECT Doc.Doctor_ID, Doc.Doctor_FName, Doc.Specialty, Dep.Department_ID, Dep.Department_Name FROM Doctors AS Doc , Department AS Dep, Login"+
              " WHERE Username = ? AND  Doc.Doctor_ID = ID AND Doc.Department_ID = Dep.Department_ID;");
              
              DoctorsPatient = con.prepareStatement(" SELECT Patient_ID, Name  from Patient_Doctor_Information WHERE D_ID = ?");
              
              retrieveDoctorInfo(DoctorsUsername);
              DoctorPatients();
              ArrayOfPatient();
        }
        catch(SQLException x){
             JOptionPane.showMessageDialog(null,"An SQL Exception Ocuured in Doctor Constructor","YouHeal Hospital", JOptionPane.ERROR_MESSAGE);
             System.exit(1);

         }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Doctor() {
        initComponents();
     
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        DoctorPanel = new javax.swing.JPanel();
        DoctorLebel = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();
        newPrescButton = new javax.swing.JButton();
        homePageButton = new javax.swing.JButton();
        attendentButton = new javax.swing.JButton();
        P_IDText2 = new javax.swing.JTextField();
        P_ID = new javax.swing.JLabel();
        infoPanel = new javax.swing.JPanel();
        DSpecialty = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        DID = new javax.swing.JLabel();
        DDepar = new javax.swing.JLabel();
        DName = new javax.swing.JLabel();
        DUserNameText = new javax.swing.JTextField();
        DIDText = new javax.swing.JTextField();
        DSpecialtyText = new javax.swing.JTextField();
        DDeparText = new javax.swing.JTextField();
        DPatientLabel = new javax.swing.JLabel();
        RemoveCompletButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PatientTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        mainPanel.setBackground(new java.awt.Color(153, 153, 255));

        DoctorPanel.setBackground(new java.awt.Color(204, 204, 255));

        DoctorLebel.setBackground(new java.awt.Color(255, 255, 255));
        DoctorLebel.setFont(new java.awt.Font("American Typewriter", 1, 18)); // NOI18N
        DoctorLebel.setForeground(new java.awt.Color(102, 102, 255));
        DoctorLebel.setText("Doctor");

        javax.swing.GroupLayout DoctorPanelLayout = new javax.swing.GroupLayout(DoctorPanel);
        DoctorPanel.setLayout(DoctorPanelLayout);
        DoctorPanelLayout.setHorizontalGroup(
            DoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DoctorPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DoctorLebel)
                .addGap(256, 256, 256))
        );
        DoctorPanelLayout.setVerticalGroup(
            DoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoctorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DoctorLebel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonsPanel.setBackground(new java.awt.Color(204, 204, 255));
        buttonsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        newPrescButton.setBackground(new java.awt.Color(102, 102, 255));
        newPrescButton.setText("Write new prescription");
        newPrescButton.setToolTipText("");
        newPrescButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPrescButtonActionPerformed(evt);
            }
        });

        homePageButton.setBackground(new java.awt.Color(102, 102, 255));
        homePageButton.setText("Go back to Homepage");
        homePageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageButtonActionPerformed(evt);
            }
        });

        attendentButton.setBackground(new java.awt.Color(102, 102, 255));
        attendentButton.setText("Show attendant information");
        attendentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendentButtonActionPerformed(evt);
            }
        });

        P_IDText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_IDText2ActionPerformed(evt);
            }
        });

        P_ID.setBackground(new java.awt.Color(204, 204, 255));
        P_ID.setFont(new java.awt.Font("American Typewriter", 0, 12)); // NOI18N
        P_ID.setForeground(new java.awt.Color(51, 51, 255));
        P_ID.setText("Selected Patient_ID:");

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(homePageButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(newPrescButton, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                                .addComponent(P_IDText2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(attendentButton)
                                .addContainerGap())))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(P_ID)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(P_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attendentButton)
                    .addComponent(P_IDText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPrescButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homePageButton)
                .addGap(62, 62, 62))
        );

        infoPanel.setBackground(new java.awt.Color(204, 204, 255));
        infoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        infoPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoPanelMouseEntered(evt);
            }
        });
        infoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DSpecialty.setFont(new java.awt.Font("American Typewriter", 0, 12)); // NOI18N
        DSpecialty.setForeground(new java.awt.Color(51, 51, 255));
        DSpecialty.setText("Specialty:");
        infoPanel.add(DSpecialty, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 60, 20));

        jLabel16.setFont(new java.awt.Font("American Typewriter", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 255));
        jLabel16.setText("Doctor Information:");
        infoPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel17.setText(" ");
        infoPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 31, -1, -1));

        jLabel22.setText(" ");
        infoPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 91, -1, -1));

        jLabel23.setText(" ");
        infoPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 119, -1, -1));

        jLabel24.setText(" ");
        infoPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 147, -1, -1));

        DID.setBackground(new java.awt.Color(204, 204, 255));
        DID.setFont(new java.awt.Font("American Typewriter", 0, 12)); // NOI18N
        DID.setForeground(new java.awt.Color(51, 51, 255));
        DID.setText("ID:");
        infoPanel.add(DID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 20));

        DDepar.setFont(new java.awt.Font("American Typewriter", 0, 12)); // NOI18N
        DDepar.setForeground(new java.awt.Color(51, 51, 255));
        DDepar.setText("Department name: ");
        infoPanel.add(DDepar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 20));

        DName.setFont(new java.awt.Font("American Typewriter", 0, 12)); // NOI18N
        DName.setForeground(new java.awt.Color(51, 51, 255));
        DName.setText("Welcome:");
        infoPanel.add(DName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 20));

        DUserNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DUserNameTextActionPerformed(evt);
            }
        });
        infoPanel.add(DUserNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 110, -1));

        DIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIDTextActionPerformed(evt);
            }
        });
        infoPanel.add(DIDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 110, -1));
        infoPanel.add(DSpecialtyText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 110, -1));
        infoPanel.add(DDeparText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 110, -1));

        DPatientLabel.setFont(new java.awt.Font("American Typewriter", 1, 16)); // NOI18N
        DPatientLabel.setForeground(new java.awt.Color(102, 102, 255));
        DPatientLabel.setText("Doctor's patient ");

        RemoveCompletButton.setBackground(new java.awt.Color(102, 102, 255));
        RemoveCompletButton.setText("Remove Completed");
        RemoveCompletButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveCompletButtonActionPerformed(evt);
            }
        });

        PatientTable.setForeground(new java.awt.Color(0, 0, 102));
        PatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Patient_ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PatientTable.setColumnSelectionAllowed(true);
        PatientTable.setEnabled(false);
        PatientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatientTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(PatientTable);
        PatientTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DoctorPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(DPatientLabel)
                                .addGap(51, 51, 51)
                                .addComponent(RemoveCompletButton))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(DoctorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DPatientLabel)
                    .addComponent(RemoveCompletButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newPrescButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPrescButtonActionPerformed
       newPrescription Application = new newPrescription(DoctorID,Patient_ID);

        Application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Application.setVisible(true);
        Application.pack();
        this.dispose();
    }//GEN-LAST:event_newPrescButtonActionPerformed

    private void homePageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageButtonActionPerformed
       HomePage Application = new HomePage();

        Application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Application.setVisible(true);
        Application.pack();
        this.dispose();
    }//GEN-LAST:event_homePageButtonActionPerformed

    private void infoPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoPanelMouseEntered
 
    }//GEN-LAST:event_infoPanelMouseEntered

    private void RemoveCompletButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveCompletButtonActionPerformed
    try{
        int row = PatientTable.getSelectedRow()+1;
      ((DefaultTableModel) PatientTable.getModel()).removeRow(row);
        Counter--;
        ArrayOfPatient();
        } 
    catch(Exception ex ){
          JOptionPane.showMessageDialog(null,"Please Select a Row! ","YouHeal Hospital", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RemoveCompletButtonActionPerformed

    private void PatientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatientTableMouseClicked
           try{  
              if(evt.getClickCount()==2){
                PatientTable=(JTable)evt.getSource();
                 int row=PatientTable.getSelectedRow()+1;
                 int col=PatientTable.getSelectedColumn()+1;
                 int valueInCell=(int)PatientTable.getValueAt(row, col);
                 P_IDText2.setText(String.valueOf(valueInCell));
                 Patient_ID=valueInCell;
               } 
           }
           catch(ArrayIndexOutOfBoundsException ex){
               JOptionPane.showMessageDialog(null,"error Array index out of bounds ","YouHeal Hospital", JOptionPane.ERROR_MESSAGE);
           }
    }//GEN-LAST:event_PatientTableMouseClicked

    private void attendentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendentButtonActionPerformed
           attendantInfo Application = new attendantInfo(Patient_ID);

        Application.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        Application.setVisible(true);
        Application.pack();
        this.dispose();
        

    }//GEN-LAST:event_attendentButtonActionPerformed

    private void DUserNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DUserNameTextActionPerformed
 
    }//GEN-LAST:event_DUserNameTextActionPerformed

    private void DIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIDTextActionPerformed

    }//GEN-LAST:event_DIDTextActionPerformed

    private void P_IDText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_IDText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P_IDText2ActionPerformed
 
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
            java.util.logging.Logger.getLogger(newPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DDepar;
    private javax.swing.JTextField DDeparText;
    private javax.swing.JLabel DID;
    private javax.swing.JTextField DIDText;
    private javax.swing.JLabel DName;
    private javax.swing.JLabel DPatientLabel;
    private javax.swing.JLabel DSpecialty;
    private javax.swing.JTextField DSpecialtyText;
    private javax.swing.JTextField DUserNameText;
    private javax.swing.JLabel DoctorLebel;
    private javax.swing.JPanel DoctorPanel;
    private javax.swing.JLabel P_ID;
    private javax.swing.JTextField P_IDText2;
    private javax.swing.JTable PatientTable;
    private javax.swing.JButton RemoveCompletButton;
    private javax.swing.JButton attendentButton;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton homePageButton;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton newPrescButton;
    // End of variables declaration//GEN-END:variables
//////////////////////////////////////////////////////////////////////////////////////////
    int Counter;
 public void ArrayOfPatient(){
        PatientsName = new String [Counter];
            
            for (int i = 0; i < Counter; i++) {
               PatientsName [i]=  PatientTable.getValueAt(i, 0).toString();
        }      
    }
//////////////////////////////////////////////////////////////////////////////////////////
    private void retrieveDoctorInfo(String DoctorsUsername) {
        ResultSet rs=null;
        try{
        FillDoctorInformation.setString(1, DoctorsUsername);
        rs = FillDoctorInformation.executeQuery();
        
         while(rs.next()){
                DoctorID = rs.getString("Doctor_ID");
                DIDText.setText(DoctorID);
                
                DoctorName = rs.getString("Doctor_FName");
                DUserNameText.setText(DoctorName);
                
                Speciality = rs.getString("Specialty");
                DSpecialtyText.setText(Speciality);
                
                DepartmentName = rs.getString("Department_Name");
                DDeparText.setText(DepartmentName);
                
                  DepartmentNum = rs.getInt("Department_ID");
        
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
 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    public void DoctorPatients(){
        ResultSet rs = null; 
        try{   
             DoctorsPatient.setString(1, DoctorID);
             rs = DoctorsPatient.executeQuery();
             
            PatientTable.setModel(DbUtils.resultSetToTableModel(rs));
            
            Counter = PatientTable.getRowCount();
           }
    
             catch(SQLException e){
           JOptionPane.showMessageDialog(null,"An SQL Exception Ocuured in retrieving Doctor's Patients","YouHeal Hospital", JOptionPane.ERROR_MESSAGE);
           System.exit(1);
       }
        finally{
            try { 
                rs.close();  
            } 
            catch (SQLException ex) { 
             JOptionPane.showMessageDialog(rootPane, "An SQL Exception Ocuured in  DocPati()  Methode , Finally Clause "
           ,"General Hospital System ", JOptionPane.ERROR_MESSAGE);
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
