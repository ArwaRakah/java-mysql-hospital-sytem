package generalhospitalproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class attendantInfo extends javax.swing.JFrame {
   String DATABASE_URL = "jdbc:mysql://localhost:3306/youheal";
    String USER_NAME = "root";
    String PASSWORD = "Arwa_238643";
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    Connection con;
    int Patient_ID;
    PreparedStatement FillAttendentInformation;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public attendantInfo(int Patient_ID) {
        initComponents();
        this.Patient_ID=Patient_ID;
       try {
          con=DriverManager.getConnection(DATABASE_URL,USER_NAME,PASSWORD);
              
              FillAttendentInformation = con.prepareStatement("Select Attendant_ID,Attendant_Name,DateOfBirth "
                      + "                                      from Attendant_INFO "
                      + "                                      where PatientID=?");
              retrieveAttendentInfo(Patient_ID);   
       } 
       catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null,"An SQL Exception Ocuured in show information method","YouHeal Hospital", JOptionPane.ERROR_MESSAGE);
                 System.exit(1);
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public attendantInfo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        mainPanel = new javax.swing.JPanel();
        upPanel = new javax.swing.JPanel();
        showAttenLabel = new javax.swing.JLabel();
        midPanel = new javax.swing.JPanel();
        AttenInfoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AttenNameTextField = new javax.swing.JTextField();
        BirthdayTextField = new javax.swing.JTextField();
        IDTextField = new javax.swing.JTextField();
        GoBackButton = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(153, 153, 255));

        upPanel.setBackground(new java.awt.Color(204, 204, 255));

        showAttenLabel.setBackground(new java.awt.Color(153, 153, 255));
        showAttenLabel.setFont(new java.awt.Font("American Typewriter", 1, 18)); // NOI18N
        showAttenLabel.setForeground(new java.awt.Color(51, 51, 255));
        showAttenLabel.setText("Show attendant information");

        javax.swing.GroupLayout upPanelLayout = new javax.swing.GroupLayout(upPanel);
        upPanel.setLayout(upPanelLayout);
        upPanelLayout.setHorizontalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(showAttenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        upPanelLayout.setVerticalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showAttenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        midPanel.setBackground(new java.awt.Color(204, 204, 255));

        AttenInfoLabel.setBackground(new java.awt.Color(0, 0, 0));
        AttenInfoLabel.setFont(new java.awt.Font("American Typewriter", 1, 16)); // NOI18N
        AttenInfoLabel.setForeground(new java.awt.Color(51, 51, 255));
        AttenInfoLabel.setText("Attendant Information:");

        jLabel1.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Attendant Name:");

        jLabel2.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Birthday:");

        AttenNameTextField.setEditable(false);
        AttenNameTextField.setForeground(new java.awt.Color(153, 153, 255));
        AttenNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttenNameTextFieldActionPerformed(evt);
            }
        });

        BirthdayTextField.setEditable(false);
        BirthdayTextField.setForeground(new java.awt.Color(153, 153, 255));
        BirthdayTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BirthdayTextFieldActionPerformed(evt);
            }
        });

        IDTextField.setEditable(false);
        IDTextField.setForeground(new java.awt.Color(153, 153, 255));

        GoBackButton.setBackground(new java.awt.Color(102, 102, 255));
        GoBackButton.setFont(new java.awt.Font("American Typewriter", 0, 12)); // NOI18N
        GoBackButton.setForeground(new java.awt.Color(204, 204, 204));
        GoBackButton.setText("Go Back");
        GoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout midPanelLayout = new javax.swing.GroupLayout(midPanel);
        midPanel.setLayout(midPanelLayout);
        midPanelLayout.setHorizontalGroup(
            midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AttenInfoLabel)
                    .addGroup(midPanelLayout.createSequentialGroup()
                        .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(midPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AttenNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BirthdayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GoBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        midPanelLayout.setVerticalGroup(
            midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AttenInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(AttenNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BirthdayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(GoBackButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(midPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(upPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(upPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(midPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AttenNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttenNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AttenNameTextFieldActionPerformed

    private void BirthdayTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BirthdayTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BirthdayTextFieldActionPerformed

    private void GoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackButtonActionPerformed
    int Doc_Id=0;
    String Doc_Name=null;
      ResultSet rs=null;
      
        try {
        PreparedStatement DocID=con.prepareStatement("select D_ID "
                + "                                        from Patients_have_Doctors"
                + "                                        where P_ID=?");
         DocID.setInt(1, Patient_ID);
         rs = DocID.executeQuery();
         while(rs.next()){
         Doc_Id=rs.getInt("D_ID");
         }
        }
      catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null,"An SQL Exception Ocuured in going back to doctor interface1","YouHeal Hospital", JOptionPane.ERROR_MESSAGE);
                 System.exit(1);
        } 
        try {
         PreparedStatement DocName=con.prepareStatement("select Username "
                + "                                        from Login"
                + "                                        where ID=?");
         DocName.setInt(1, Doc_Id);
         rs = DocName.executeQuery();
         while(rs.next()){
         Doc_Name=rs.getString("Username");
         }
         
     }
      catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null,"An SQL Exception Ocuured in going back to doctor interface2","YouHeal Hospital", JOptionPane.ERROR_MESSAGE);
                 System.exit(1);
        }
        
        Doctor Application = new Doctor(Doc_Name);

        Application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Application.setVisible(true);
        Application.pack();
        this.dispose();
    }//GEN-LAST:event_GoBackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(attendantInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(attendantInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(attendantInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attendantInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new attendantInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AttenInfoLabel;
    private javax.swing.JTextField AttenNameTextField;
    private javax.swing.JTextField BirthdayTextField;
    private javax.swing.JButton GoBackButton;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel midPanel;
    private javax.swing.JLabel showAttenLabel;
    private javax.swing.JPanel upPanel;
    // End of variables declaration//GEN-END:variables
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void  retrieveAttendentInfo(int Patient_ID) {
        ResultSet rs=null;
        try{
        FillAttendentInformation.setInt(1, Patient_ID);
        rs = FillAttendentInformation.executeQuery();
        
         while(rs.next()){
                int ID = rs.getInt("Attendant_ID");
                IDTextField.setText(String.valueOf(ID));
                
                String Name = rs.getString("Attendant_Name");
                AttenNameTextField.setText(Name);
                
                String Birthday = rs.getString("DateOfBirth");
                BirthdayTextField.setText(Birthday);
        
        }
    }
        catch(SQLException e){
           JOptionPane.showMessageDialog(null,"An SQL Exception Ocuured in retrieving Attendant's Info","YouHeal Hospital", JOptionPane.ERROR_MESSAGE);
           System.exit(1);
       }
 }
}