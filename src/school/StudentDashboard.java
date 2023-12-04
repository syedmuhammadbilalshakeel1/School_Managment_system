/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Haris Khan
 */
public class StudentDashboard extends javax.swing.JFrame {

    /**
     * Creates new form StudentDashboard
     */
          Sacred db=new Sacred();

    public ResultSet getstatus(String user){
        ResultSet status;
        status = db.getStudentRecord(user);
        return status;
    }
    public StudentDashboard() {
        initComponents();
//        for personal Details
        
        ResultSet rs;
      rs=db.displayStudentsRecords();
      DefaultTableModel tb=(DefaultTableModel)sPersonalRecordTable.getModel();
      
      try{
      while(rs.next()){
          
          String []data={rs.getString("ID"),rs.getString("Name"),rs.getString("F_Name"),rs.getString("Class"),rs.getString("Phone"),rs.getString("Address"),rs.getString("Date"),rs.getString("Gender")};
        tb.addRow(data);
      }
      }catch(Exception e){
          JOptionPane.showMessageDialog(this, "Connect to DB first"+e);
      }
//      for Exam details
      
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        addStudent = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sPersonalRecordTable = new javax.swing.JTable();
        attendenceRecord = new javax.swing.JLabel();
        personalDetails = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        examRecordTable = new javax.swing.JTable();
        examDetails1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1550, 900));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(45, 164, 211));
        jPanel6.setPreferredSize(new java.awt.Dimension(1070, 100));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addStudent.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        addStudent.setText("  Students Record");
        jPanel6.add(addStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 510, 40));

        jLabel2.setText("___________________________________________________________________");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 640, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 0, 1770, 150));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sPersonalRecordTable.setBackground(new java.awt.Color(102, 204, 255));
        sPersonalRecordTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sPersonalRecordTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sPersonalRecordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Father Name", "Class", "Phone NO.", "Address", "Date", "Gender"
            }
        ));
        sPersonalRecordTable.setFocusable(false);
        sPersonalRecordTable.setGridColor(new java.awt.Color(255, 0, 51));
        sPersonalRecordTable.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(sPersonalRecordTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 1430, 50));

        attendenceRecord.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        attendenceRecord.setText("Attendence Record");
        jPanel1.add(attendenceRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 300, 50));

        personalDetails.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        personalDetails.setText("Personal Details");
        jPanel1.add(personalDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 260, 60));

        examRecordTable.setAutoCreateRowSorter(true);
        examRecordTable.setBackground(new java.awt.Color(127, 218, 255));
        examRecordTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        examRecordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SNO", "I.D", "Name", "F/Name", "Class", "Subject 1", "Subjec 2", "Subject 3", "Subject 4", "Subject 5", "Total", "Grade"
            }
        ));
        examRecordTable.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jScrollPane2.setViewportView(examRecordTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 1430, 200));

        examDetails1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        examDetails1.setText("Exam Record");
        jPanel1.add(examDetails1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 220, 50));

        jTable1.setBackground(new java.awt.Color(127, 218, 255));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Class", "Date", "Attendence"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 1430, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1760, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
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
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addStudent;
    private javax.swing.JLabel attendenceRecord;
    private javax.swing.JLabel examDetails1;
    private javax.swing.JTable examRecordTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel personalDetails;
    private javax.swing.JTable sPersonalRecordTable;
    // End of variables declaration//GEN-END:variables
}