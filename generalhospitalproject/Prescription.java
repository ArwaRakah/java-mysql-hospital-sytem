package generalhospitalproject;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.time.LocalDate; 
import java.time.LocalTime; 
import java.nio.file.*;

public class Prescription extends javax.swing.JFrame {
   Connection conn = null ;   
    ResultSet rs = null; 
    int Patient_ID; 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    public Prescription() {
        initComponents();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Prescription(int Patient_ID){ 

        this(); 

        this.Patient_ID = Patient_ID; 

        try { 
            conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/youheal","root","Arwa_238643"); 
            String query = "Select Patient_ID , Medicine_ID , Doctor_ID  , P_Date  , P_Time  from  Prescription , Login where  Patient_ID = ID "; 
            Statement ss = conn.createStatement(); 
            rs=ss.executeQuery(query); 

            if (rs.next()){ 
                do { 
                    if (Patient_ID == rs.getInt("Patient_ID")) {  
                         int Medicine_ID = rs.getInt("Medicine_ID"); 
                           PatientIdTextField.setToolTipText(Integer.toString(Patient_ID));  
                           MedicalIdTextField.setToolTipText(Integer.toString(Medicine_ID)); 
                           String P_Date = rs.getString("P_Date"); 
                           String P_Time = rs.getString("P_Time");  
                           PatientIdTextField.setText(Integer.toString(Patient_ID)); 
                           MedicalIdTextField.setText(Integer.toString(Medicine_ID));  
                           DateTextField.setText(P_Date); 
                           DateTextField.setToolTipText(P_Date);  
                           TimeTextField.setText(P_Time); 
                           TimeTextField.setToolTipText(P_Time); 
                          }   
                    } while (rs.next()); 
            }  
        } catch (SQLException ex) { 

             JOptionPane.showMessageDialog(null,"SQL Error!","YouHeal",JOptionPane.ERROR_MESSAGE);
         } 
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrescriptionPanel = new javax.swing.JPanel();
        UpPanel = new javax.swing.JPanel();
        PrescriptionLabel = new javax.swing.JLabel();
        PrescriptionPanel2 = new javax.swing.JPanel();
        GoBackButton = new javax.swing.JButton();
        LastPrescriptionLabel = new javax.swing.JLabel();
        PatientIdLabel = new javax.swing.JLabel();
        MedicalIdLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        TimeLabel = new javax.swing.JLabel();
        PatientIdTextField = new javax.swing.JTextField();
        MedicalIdTextField = new javax.swing.JTextField();
        DateTextField = new javax.swing.JTextField();
        TimeTextField = new javax.swing.JTextField();
        PrintButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaPrint = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PrescriptionPanel.setBackground(new java.awt.Color(153, 153, 255));

        UpPanel.setBackground(new java.awt.Color(204, 204, 255));

        PrescriptionLabel.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        PrescriptionLabel.setForeground(new java.awt.Color(102, 102, 255));
        PrescriptionLabel.setText("Prescription");

        javax.swing.GroupLayout UpPanelLayout = new javax.swing.GroupLayout(UpPanel);
        UpPanel.setLayout(UpPanelLayout);
        UpPanelLayout.setHorizontalGroup(
            UpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(PrescriptionLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UpPanelLayout.setVerticalGroup(
            UpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(PrescriptionLabel)
                .addContainerGap())
        );

        PrescriptionPanel2.setBackground(new java.awt.Color(204, 204, 255));

        GoBackButton.setBackground(new java.awt.Color(102, 102, 255));
        GoBackButton.setForeground(new java.awt.Color(204, 204, 255));
        GoBackButton.setText("Go Back");
        GoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackButtonActionPerformed(evt);
            }
        });

        LastPrescriptionLabel.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        LastPrescriptionLabel.setForeground(new java.awt.Color(51, 51, 255));
        LastPrescriptionLabel.setText("Last Prescription:");

        PatientIdLabel.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        PatientIdLabel.setForeground(new java.awt.Color(102, 102, 255));
        PatientIdLabel.setText("Patient ID:");

        MedicalIdLabel.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        MedicalIdLabel.setForeground(new java.awt.Color(102, 102, 255));
        MedicalIdLabel.setText("Medical ID:");

        DateLabel.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        DateLabel.setForeground(new java.awt.Color(102, 102, 255));
        DateLabel.setText("Date:");

        TimeLabel.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        TimeLabel.setForeground(new java.awt.Color(102, 102, 255));
        TimeLabel.setText("Time:");

        PatientIdTextField.setEditable(false);
        PatientIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientIdTextFieldActionPerformed(evt);
            }
        });

        MedicalIdTextField.setEditable(false);

        DateTextField.setEditable(false);

        TimeTextField.setEditable(false);

        PrintButton.setBackground(new java.awt.Color(102, 102, 255));
        PrintButton.setForeground(new java.awt.Color(204, 204, 255));
        PrintButton.setText("Print");
        PrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrescriptionPanel2Layout = new javax.swing.GroupLayout(PrescriptionPanel2);
        PrescriptionPanel2.setLayout(PrescriptionPanel2Layout);
        PrescriptionPanel2Layout.setHorizontalGroup(
            PrescriptionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrescriptionPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PrescriptionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrescriptionPanel2Layout.createSequentialGroup()
                        .addGroup(PrescriptionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrescriptionPanel2Layout.createSequentialGroup()
                                .addComponent(PatientIdLabel)
                                .addGap(54, 54, 54)
                                .addComponent(PatientIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LastPrescriptionLabel))
                        .addContainerGap())
                    .addGroup(PrescriptionPanel2Layout.createSequentialGroup()
                        .addGroup(PrescriptionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MedicalIdLabel)
                            .addComponent(DateLabel)
                            .addComponent(TimeLabel)
                            .addComponent(GoBackButton))
                        .addGroup(PrescriptionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrescriptionPanel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(PrescriptionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MedicalIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PrescriptionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrescriptionPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(PrintButton)
                                .addGap(25, 25, 25))))))
        );
        PrescriptionPanel2Layout.setVerticalGroup(
            PrescriptionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrescriptionPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(LastPrescriptionLabel)
                .addGap(28, 28, 28)
                .addGroup(PrescriptionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatientIdLabel)
                    .addComponent(PatientIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(PrescriptionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MedicalIdLabel)
                    .addComponent(MedicalIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PrescriptionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateLabel)
                    .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(PrescriptionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TimeTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimeLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PrescriptionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GoBackButton)
                    .addComponent(PrintButton))
                .addGap(31, 31, 31))
        );

        TextAreaPrint.setColumns(20);
        TextAreaPrint.setRows(5);
        jScrollPane1.setViewportView(TextAreaPrint);

        javax.swing.GroupLayout PrescriptionPanelLayout = new javax.swing.GroupLayout(PrescriptionPanel);
        PrescriptionPanel.setLayout(PrescriptionPanelLayout);
        PrescriptionPanelLayout.setHorizontalGroup(
            PrescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrescriptionPanelLayout.createSequentialGroup()
                .addGroup(PrescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PrescriptionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PrescriptionPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PrescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PrescriptionPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        PrescriptionPanelLayout.setVerticalGroup(
            PrescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrescriptionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PrescriptionPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrescriptionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrescriptionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PatientIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientIdTextFieldActionPerformed
        
    }//GEN-LAST:event_PatientIdTextFieldActionPerformed

    private void GoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackButtonActionPerformed
        HomePage homepage = new HomePage ();
        homepage.setVisible(true);
        homepage.pack();
        this.setVisible(false);
    }//GEN-LAST:event_GoBackButtonActionPerformed

    private void PrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintButtonActionPerformed
    Formatter y = null;
    Scanner x = null;
     int P_Id=Integer.valueOf(PatientIdTextField.getText());
     int M_ID =Integer.valueOf(MedicalIdTextField.getText());
     String Date=String.valueOf(DateTextField.getText());
     String Time=String.valueOf(TimeTextField.getText());
     
    
     try{
          y=new Formatter("C:\\\\Users\\\\arwar\\\\Desktop\\\\YouHeal_Project\\\\GeneralHospitalProject\\\\src\\\\Patient's Prescription information.txt");
     }
     catch(SecurityException e){
          System.out.println("write permission denied!");
          System.exit(1);
      }
      catch (FileNotFoundException e) {
          System.out.println("error opening a file");
          System.exit(1);   
      }  
     
     try{
         y.format("%s%n %s%n %d%n %d",Date,Time,M_ID,P_Id);
     }
     catch(FormatterClosedException e){
                JOptionPane.showMessageDialog(null,"Formatter is closed","YouHeal",JOptionPane.ERROR_MESSAGE);
            }
    catch(NoSuchElementException e){
                JOptionPane.showMessageDialog(null,"invalid input!","YouHeal",JOptionPane.ERROR_MESSAGE);
            }
     if(y!=null){
         y.close();
     }
     
     try{
            x=new Scanner(Paths.get("C:\\\\Users\\\\arwar\\\\Desktop\\\\YouHeal_Project\\\\GeneralHospitalProject\\\\src\\\\Patient's Prescription information.txt"));
        }
        catch(IOException e){
            System.out.println("Error opening a file");
            System.exit(1);
       } 
 StringBuilder b=new StringBuilder();
  b.append(String.format("%s%n","***Prescription_information***"));
 try{
            while(x.hasNext()){
                b.append(String.format("Date: %s%n Time: %s%n Medical_ID:%d%n Patient_ID:%d%n",x.next(),x.next(),x.nextInt(),x.nextInt()));
            }
        }
        catch(NoSuchElementException e){
         JOptionPane.showMessageDialog(null,"Wront format","YouHeal",JOptionPane.ERROR_MESSAGE);
        }
        catch(IllegalStateException e){
        JOptionPane.showMessageDialog(null,"Error reading from a file","YouHeal",JOptionPane.ERROR_MESSAGE);  
        }
TextAreaPrint.setText(String.valueOf(b));

if(x!=null){
    x.close();
}
 JOptionPane.showMessageDialog(null,"presecription information printed sucssfuly !");          
    }//GEN-LAST:event_PrintButtonActionPerformed
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
            java.util.logging.Logger.getLogger(Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prescription().setVisible(true);
            }
        });
    }
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DateLabel;
    private javax.swing.JTextField DateTextField;
    private javax.swing.JButton GoBackButton;
    private javax.swing.JLabel LastPrescriptionLabel;
    private javax.swing.JLabel MedicalIdLabel;
    private javax.swing.JTextField MedicalIdTextField;
    private javax.swing.JLabel PatientIdLabel;
    private javax.swing.JTextField PatientIdTextField;
    private javax.swing.JLabel PrescriptionLabel;
    private javax.swing.JPanel PrescriptionPanel;
    private javax.swing.JPanel PrescriptionPanel2;
    private javax.swing.JButton PrintButton;
    private javax.swing.JTextArea TextAreaPrint;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JTextField TimeTextField;
    private javax.swing.JPanel UpPanel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
}