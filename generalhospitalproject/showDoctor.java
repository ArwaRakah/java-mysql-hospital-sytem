package generalhospitalproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JFrame;

public class showDoctor extends javax.swing.JFrame {
   
    String DATABASE_URL="jdbc:mysql://localhost:3306/youheal";
    String USER_NAME="root";
    String PASSWORD="Arwa_238643"; 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    ResultSet rs =null;
    Statement ss= null;
    PreparedStatement pst =null;
    String query ="";
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    int index=1;
    int count=0;
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    public showDoctor(int index ) {
         this();
        this.index =index;
        
        try{
            Connection c = DriverManager.getConnection(DATABASE_URL,USER_NAME,PASSWORD);
            query = "Select Doctor_FName ,  Doctor_ID , Gender  , Specialty  , Department_ID "
                  + "from Doctors   ";
            ss = c.createStatement();
            rs=ss.executeQuery(query);
            
            if((rs.next())){
            DefaultTableModel model = new DefaultTableModel();
            
            model=( DefaultTableModel)DoctorInfoTable.getModel();
            
             do{
                String Doctor_Name =rs.getString("Doctor_FName");
                int Doctor_ID =rs.getInt("Doctor_ID");
                String Gender =rs.getString("Gender");
                String Specialty =rs.getString("Specialty");
                int Depart_Number =rs.getInt("Department_ID");
                
                if(Depart_Number == index)
                {
                    model.insertRow(model.getRowCount(), new Object[]{ Doctor_Name,Doctor_ID,Gender,Specialty});
                 count++;
                }
                
            } while(rs.next());
             
               DoctorInfoTable.setModel(model);
          }
       }
        catch(SQLException ex )
        {
          JOptionPane.showMessageDialog(null,"An SQL Exception Ocuured in show Doctor Constructor","YouHeal Hospital", JOptionPane.ERROR_MESSAGE);
             System.exit(1);
        }
        initComponents();
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    public showDoctor() {
         initComponents();
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        upPanel = new javax.swing.JPanel();
        ShowDocLabel = new javax.swing.JLabel();
        midPanel = new javax.swing.JPanel();
        DoctorInfoLabel = new javax.swing.JLabel();
        GoBackButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        DoctorInfoTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(153, 153, 255));
        mainPanel.setForeground(new java.awt.Color(102, 102, 255));

        upPanel.setBackground(new java.awt.Color(204, 204, 255));

        ShowDocLabel.setBackground(new java.awt.Color(255, 255, 255));
        ShowDocLabel.setFont(new java.awt.Font("American Typewriter", 1, 18)); // NOI18N
        ShowDocLabel.setForeground(new java.awt.Color(102, 102, 255));
        ShowDocLabel.setText("Show Doctors");

        javax.swing.GroupLayout upPanelLayout = new javax.swing.GroupLayout(upPanel);
        upPanel.setLayout(upPanelLayout);
        upPanelLayout.setHorizontalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upPanelLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(ShowDocLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        upPanelLayout.setVerticalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ShowDocLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        midPanel.setBackground(new java.awt.Color(204, 204, 255));

        DoctorInfoLabel.setFont(new java.awt.Font("American Typewriter", 1, 18)); // NOI18N
        DoctorInfoLabel.setForeground(new java.awt.Color(102, 102, 255));
        DoctorInfoLabel.setText("Doctor information:");

        GoBackButton.setBackground(new java.awt.Color(102, 102, 255));
        GoBackButton.setFont(new java.awt.Font("American Typewriter", 0, 12)); // NOI18N
        GoBackButton.setText("Go back");
        GoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackButtonActionPerformed(evt);
            }
        });

        DoctorInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor name:", "Doctor ID", "Gender", "Spetialty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(DoctorInfoTable);

        javax.swing.GroupLayout midPanelLayout = new javax.swing.GroupLayout(midPanel);
        midPanel.setLayout(midPanelLayout);
        midPanelLayout.setHorizontalGroup(
            midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addGroup(midPanelLayout.createSequentialGroup()
                        .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DoctorInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(midPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(GoBackButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        midPanelLayout.setVerticalGroup(
            midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DoctorInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(GoBackButton)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(upPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(midPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(upPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(midPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackButtonActionPerformed

        Department Application = new Department();
    
        Application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Application.setVisible(true);
        Application.pack();
        setVisible(false);
    }//GEN-LAST:event_GoBackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(showDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new showDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DoctorInfoLabel;
    private javax.swing.JTable DoctorInfoTable;
    private javax.swing.JButton GoBackButton;
    private javax.swing.JLabel ShowDocLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel midPanel;
    private javax.swing.JPanel upPanel;
    // End of variables declaration//GEN-END:variables
}
