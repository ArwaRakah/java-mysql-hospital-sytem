package generalhospitalproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.time.Instant;
import java.time.LocalTime;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.util.Date;
public class newPrescription extends javax.swing.JFrame {

    String Patient_Name ;
    Date date=new Date(); 
    String Doctor_ID;
    String Medicine_ID, Medicine_QTY, Medicine_Type,Medicine_Name;
    int Patient_ID;
    String DATABASE_URL="jdbc:mysql://localhost:3306/youheal";
    String USER_NAME="root";
    String PASSWORD="Arwa_238643"; 
    
    Connection con;
    PreparedStatement PtientInformation;
    PreparedStatement MedicinInfo_Pharmacy;
   PreparedStatement Statistical_Info;
   PreparedStatement InsertMed ;
    PreparedStatement InsertPrescription ;
    
     String Query_Patient_Info  = "SELECT Name , Patient_ID FROM patient_doctor_information WHERE D_ID = ?" ;
    String TimeDate = "SELECT CURDATE() as date";
     String insertMedicine = "INSERT INTO  Pharmacy(Medicine_ID, Medicine_Name, Medicine_QTY, Medicine_Type) VALUES (?,?,?,?)";
     String insertpre = "INSERT INTO  Prescription(P_Date, Medicine_ID, Doctor_ID,Patient_ID) VALUES (?,?,?,?)";
     
/////////////////////////////////////////////////////////////////////////////////////////////
    public newPrescription() {
      
         initComponents();
    }
    public newPrescription(String Doctor_ID,int Patient_ID) {
       
        initComponents();
        this.Doctor_ID = Doctor_ID;
        this.Patient_ID = Patient_ID;
        
       
        try{
            con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASSWORD);
            
            PtientInformation = con.prepareStatement(Query_Patient_Info);
            Statistical_Info =  con.prepareStatement(TimeDate);
            InsertMed = con.prepareStatement(insertMedicine);
            InsertPrescription=con.prepareStatement(insertpre);
            getPtientInformation();
          
            
        }
        catch (SQLException ex){
          JOptionPane.showMessageDialog(null,"An SQL Exception has Ocuured ","YouHeal Hospital", JOptionPane.ERROR_MESSAGE);
             System.exit(1);
         }
    }      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        upPanel = new javax.swing.JPanel();
        newPreLabel = new javax.swing.JLabel();
        midPanel = new javax.swing.JPanel();
        fillInfoLabel = new javax.swing.JLabel();
        goBackButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        medInfoLabel = new javax.swing.JLabel();
        ClearButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        jTextField_MedicineID = new javax.swing.JTextField();
        jTextField_MedicineName = new javax.swing.JTextField();
        jTextField_MedicineType = new javax.swing.JTextField();
        jTextField_MedicineQTY = new javax.swing.JTextField();
        pIdLabel1 = new javax.swing.JLabel();
        pIdLabel2 = new javax.swing.JLabel();
        pIdLabel3 = new javax.swing.JLabel();
        pIdLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(153, 153, 255));
        mainPanel.setForeground(new java.awt.Color(25, 41, 57));

        upPanel.setBackground(new java.awt.Color(204, 204, 255));

        newPreLabel.setBackground(new java.awt.Color(255, 255, 255));
        newPreLabel.setFont(new java.awt.Font("American Typewriter", 1, 18)); // NOI18N
        newPreLabel.setForeground(new java.awt.Color(102, 102, 255));
        newPreLabel.setText("Write new Prescription");

        javax.swing.GroupLayout upPanelLayout = new javax.swing.GroupLayout(upPanel);
        upPanel.setLayout(upPanelLayout);
        upPanelLayout.setHorizontalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upPanelLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(newPreLabel)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        upPanelLayout.setVerticalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newPreLabel)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        midPanel.setBackground(new java.awt.Color(204, 204, 255));
        midPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fillInfoLabel.setFont(new java.awt.Font("American Typewriter", 1, 14)); // NOI18N
        fillInfoLabel.setForeground(new java.awt.Color(102, 102, 255));
        fillInfoLabel.setText("Patient  Information:");
        midPanel.add(fillInfoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        goBackButton.setBackground(new java.awt.Color(102, 102, 255));
        goBackButton.setFont(new java.awt.Font("American Typewriter", 0, 12)); // NOI18N
        goBackButton.setForeground(new java.awt.Color(204, 204, 204));
        goBackButton.setText("Go back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });
        midPanel.add(goBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, 20));

        saveButton.setBackground(new java.awt.Color(102, 102, 255));
        saveButton.setFont(new java.awt.Font("American Typewriter", 0, 12)); // NOI18N
        saveButton.setForeground(new java.awt.Color(204, 204, 204));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        midPanel.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 74, 20));

        medInfoLabel.setFont(new java.awt.Font("American Typewriter", 1, 14)); // NOI18N
        medInfoLabel.setForeground(new java.awt.Color(102, 102, 255));
        medInfoLabel.setText("Medicine Information:   ");
        midPanel.add(medInfoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        ClearButton.setBackground(new java.awt.Color(102, 102, 255));
        ClearButton.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        ClearButton.setForeground(new java.awt.Color(204, 204, 204));
        ClearButton.setText("Clear ");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        midPanel.add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 70, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        midPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 480, 90));

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Patient_Name", "Patient_ID"
            }
        ));
        patientTable.setEnabled(false);
        patientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(patientTable);

        midPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 240, 90));

        jTextField_MedicineID.setForeground(new java.awt.Color(153, 153, 255));
        jTextField_MedicineID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MedicineIDActionPerformed(evt);
            }
        });
        midPanel.add(jTextField_MedicineID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 120, 20));

        jTextField_MedicineName.setForeground(new java.awt.Color(153, 153, 255));
        jTextField_MedicineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MedicineNameActionPerformed(evt);
            }
        });
        midPanel.add(jTextField_MedicineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 120, 20));

        jTextField_MedicineType.setForeground(new java.awt.Color(153, 153, 255));
        jTextField_MedicineType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MedicineTypeActionPerformed(evt);
            }
        });
        midPanel.add(jTextField_MedicineType, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 120, 20));

        jTextField_MedicineQTY.setForeground(new java.awt.Color(153, 153, 255));
        jTextField_MedicineQTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MedicineQTYActionPerformed(evt);
            }
        });
        midPanel.add(jTextField_MedicineQTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 120, 20));

        pIdLabel1.setFont(new java.awt.Font("American Typewriter", 0, 12)); // NOI18N
        pIdLabel1.setForeground(new java.awt.Color(51, 51, 255));
        pIdLabel1.setText("Medicine Type: ");
        midPanel.add(pIdLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 90, 20));

        pIdLabel2.setFont(new java.awt.Font("American Typewriter", 0, 12)); // NOI18N
        pIdLabel2.setForeground(new java.awt.Color(51, 51, 255));
        pIdLabel2.setText("Medicine ID:");
        midPanel.add(pIdLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, 20));

        pIdLabel3.setFont(new java.awt.Font("American Typewriter", 0, 12)); // NOI18N
        pIdLabel3.setForeground(new java.awt.Color(51, 51, 255));
        pIdLabel3.setText("Medicine QTY:");
        midPanel.add(pIdLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, 20));

        pIdLabel4.setFont(new java.awt.Font("American Typewriter", 0, 12)); // NOI18N
        pIdLabel4.setForeground(new java.awt.Color(51, 51, 255));
        pIdLabel4.setText("Medicine Name:");
        midPanel.add(pIdLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 90, 20));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(midPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(upPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(midPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
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

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed

         HomePage Application = new HomePage();

        Application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Application.setVisible(true);
        Application.pack();
        this.dispose();
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            FillMedicineTabel();
            insertMedicine();
            insertpre();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane, "An SQL Exception Ocuured in save Button "
           ,"YouHeal", JOptionPane.ERROR_MESSAGE);
             System.exit(1); 
        }

    }//GEN-LAST:event_saveButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed

        jTextArea1.setText("  ");
       

    }//GEN-LAST:event_ClearButtonActionPerformed

    private void patientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientTableMouseClicked

    }//GEN-LAST:event_patientTableMouseClicked

    private void jTextField_MedicineIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MedicineIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_MedicineIDActionPerformed

    private void jTextField_MedicineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MedicineNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_MedicineNameActionPerformed

    private void jTextField_MedicineTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MedicineTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_MedicineTypeActionPerformed

    private void jTextField_MedicineQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MedicineQTYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_MedicineQTYActionPerformed
   
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
            java.util.logging.Logger.getLogger(newPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new newPrescription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JLabel fillInfoLabel;
    private javax.swing.JButton goBackButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField_MedicineID;
    private javax.swing.JTextField jTextField_MedicineName;
    private javax.swing.JTextField jTextField_MedicineQTY;
    private javax.swing.JTextField jTextField_MedicineType;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel medInfoLabel;
    private javax.swing.JPanel midPanel;
    private javax.swing.JLabel newPreLabel;
    private javax.swing.JLabel pIdLabel1;
    private javax.swing.JLabel pIdLabel2;
    private javax.swing.JLabel pIdLabel3;
    private javax.swing.JLabel pIdLabel4;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel upPanel;
    // End of variables declaration//GEN-END:variables

    public void getPtientInformation(){
            ResultSet rs = null ;
        
        try{
        PtientInformation.setString(1, Doctor_ID);
        rs = PtientInformation.executeQuery();
        
        patientTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "An SQL Exception Ocuured in Get Patient Information Methode "
           ,"YouHeal", JOptionPane.ERROR_MESSAGE);
             System.exit(1);  
         }
        finally{
             try{
                rs.close();
            }
             catch(SQLException ex){  
            JOptionPane.showMessageDialog(rootPane, "An SQL Exception Ocuured in Closing Result in getPtientInformation Methode"
           ,"YouHeal", JOptionPane.ERROR_MESSAGE);
            }
        } 
        try{
                DefaultTableModel Model = (DefaultTableModel) patientTable.getModel();
                 int SelectedIndex = patientTable.getSelectedRow()+1;
                 
            
                Patient_Name= patientTable.getValueAt(SelectedIndex, 0).toString();
                Patient_ID=Integer.valueOf( String.valueOf(patientTable.getValueAt(SelectedIndex, 1)));
                   
              
  }
  catch(ArrayIndexOutOfBoundsException ex){
               JOptionPane.showMessageDialog(null,"error Array index out of bounds ","YouHeal Hospital", JOptionPane.ERROR_MESSAGE);
           }
     
    }

    
        public void FillMedicineTabel(){
        
        Medicine_ID=jTextField_MedicineID.getText();
        Medicine_Name=jTextField_MedicineName.getText();
        Medicine_QTY=jTextField_MedicineQTY.getText();
        Medicine_Type=jTextField_MedicineType.getText();
     if (Medicine_ID.trim().equalsIgnoreCase("")&&Medicine_Name.trim().equalsIgnoreCase("")&&Medicine_QTY.trim().equalsIgnoreCase("")&&Medicine_Type.trim().equalsIgnoreCase(""))
                 {
                   JOptionPane.showMessageDialog(null, "Enter medicine information ","Empty info ",JOptionPane.ERROR_MESSAGE);
                 }  
    }

        
         public void insertMedicine() throws SQLException{
             jTextArea1.setText(String.format("Patient_Name: %s %n Patient_ID: %d %n Medicine_ID:%s %n Medicine_Name:%s %n Medicine_QTY:%s %n Medicine_Type:%s %n "
                                               , Patient_Name,Patient_ID,Medicine_ID,Medicine_Name,Medicine_QTY,Medicine_Type));
         
        
        try{                
            InsertMed.setInt(1,Integer.parseInt(Medicine_ID));
            InsertMed.setString(2, Medicine_Name);
            InsertMed.setInt(3, Integer.parseInt(Medicine_QTY));
            InsertMed.setString(4, Medicine_Type);  
             InsertMed.execute();
        }
          catch(SQLException ex){
       JOptionPane.showMessageDialog(rootPane, "An SQL Exception Ocuured in insert medicin method"
           ,"YouHeal", JOptionPane.ERROR_MESSAGE);
          }
       
        
        }
         
        public void insertpre() throws SQLException{
             ResultSet rs1 = null; 
 
             rs1=Statistical_Info.executeQuery();
              while(rs1.next()){
         date = rs1.getDate("date");
             }
              String date2=String.valueOf(date);

        try{     
              
             InsertPrescription.setDate(1,java.sql.Date.valueOf(date2));
             InsertPrescription.setInt(2,Integer.parseInt(Medicine_ID) );
             InsertPrescription.setInt(3,Integer.parseInt(Doctor_ID) );
             InsertPrescription.setInt(4,Patient_ID );
              InsertPrescription.execute();
       }
        catch(SQLException ex){
       JOptionPane.showMessageDialog(rootPane, "An SQL Exception Ocuured in Insert Prescription"
           ,"YouHeal", JOptionPane.ERROR_MESSAGE);
        }
        finally{
         try {
                rs1.close();
               
            } 
             catch (NullPointerException ex) {
             JOptionPane.showMessageDialog(rootPane, "An SQL Exception Ocuured in Closing Result  Prescription"
           ,"YouHeal", JOptionPane.ERROR_MESSAGE);
            } }
        
        
         JOptionPane.showMessageDialog(rootPane, "you have successflly wrote a prescription to "+Patient_Name
           ,"YouHeal", JOptionPane.INFORMATION_MESSAGE);
  }




        }
