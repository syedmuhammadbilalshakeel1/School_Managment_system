/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Haris Khan
 */
public class teacherSearch extends javax.swing.JFrame {

    /**
     * Creates new form teacherSearch
     */
    public teacherSearch() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Taddress = new javax.swing.JTextArea();
        id = new javax.swing.JTextField();
        Tspec = new javax.swing.JTextField();
        Temail = new javax.swing.JTextField();
        Tphone = new javax.swing.JTextField();
        Tdate = new javax.swing.JTextField();
        Tsalary = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1550, 900));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel2.setForeground(java.awt.Color.orange);
        jLabel2.setText("Teacher MODIFICAtion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 490, 43));

        jLabel3.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 130, 43));

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 130, 43));

        jLabel5.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Specialization");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 130, 43));

        jLabel6.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 130, 43));

        jLabel7.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone NO.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 130, 43));

        jLabel8.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Joining Date");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 130, 43));

        jLabel9.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Salary");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 130, 43));

        jLabel10.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Address");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 600, 130, 43));

        jLabel17.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Gender");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 130, 43));

        tname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnameActionPerformed(evt);
            }
        });
        jPanel1.add(tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, 330, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("__________________________________________________________________________________________________");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 700, -1));

        jButton3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 740, 160, 50));

        jButton4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton4.setText("Delet");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 740, 160, 50));

        jButton5.setBackground(java.awt.Color.cyan);
        jButton5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 740, 160, 50));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("______________________________________________________________________________________________________");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 690, 940, -1));

        Taddress.setColumns(20);
        Taddress.setRows(5);
        jScrollPane1.setViewportView(Taddress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 600, 330, 80));

        id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 330, 30));

        Tspec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tspec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TspecActionPerformed(evt);
            }
        });
        jPanel1.add(Tspec, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, 330, 30));

        Temail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Temail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemailActionPerformed(evt);
            }
        });
        jPanel1.add(Temail, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, 330, 30));

        Tphone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TphoneActionPerformed(evt);
            }
        });
        jPanel1.add(Tphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 420, 330, 30));

        Tdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TdateActionPerformed(evt);
            }
        });
        jPanel1.add(Tdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, 330, 30));

        Tsalary.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TsalaryActionPerformed(evt);
            }
        });
        jPanel1.add(Tsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 500, 330, 30));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 237, 130, 40));

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        female.setText("Female");
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 550, 130, -1));

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        male.setText("Male");
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 550, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1435, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        viewTeacher vt = new viewTeacher();
        vt.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         Sacred s = new Sacred();
         int opt = JOptionPane.showConfirmDialog(null, "Are You Sure To Delet", "Delet", JOptionPane.YES_NO_OPTION);
        if(opt == 0){
        try {
            s.teacherDelet(id.getText());
            tname.setText("");
            id.setText("");
            Tspec.setText("");
            Temail.setText("");
            Tphone.setText("");
            Tdate.setText("");
            Tsalary.setText("");
            Taddress.setText("");
            JOptionPane.showMessageDialog(this, "Data Deleted Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Sacred s = new Sacred();
        String Gender = "";
        if(male.isSelected()){
        Gender = "Male";
        } else if(female.isSelected()){
        Gender = "Female";
        }
         try {
            s.teacherUpdate(id.getText(), tname.getText(), Tspec.getText(), Temail.getText(), Tphone.getText(), Tdate.getText(), Taddress.getText(),Tsalary.getText(), Gender);
            id.setText("");
            tname.setText("");
            Tspec.setText("");
            Temail.setText("");
            Tphone.setText("");
            Tdate.setText("");
            Taddress.setText("");
            Tsalary.setText("");
            JOptionPane.showMessageDialog(this, "Data Updated Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnameActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void TspecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TspecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TspecActionPerformed

    private void TemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TemailActionPerformed

    private void TphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TphoneActionPerformed

    private void TdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TdateActionPerformed

    private void TsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TsalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TsalaryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Sacred s = new Sacred();
        
        ResultSet rs = s.getTeacherById((id.getText()));
        try {
            if(rs.next() == false){
            JOptionPane.showMessageDialog(this, "Record not found");
            id.setText("");
            }
            else{
            //rs.next();
            //SID.setText(rs.getString("ID"));
            tname.setText(rs.getString("Name"));
            Tspec.setText(rs.getString("Specialization"));
            Temail.setText(rs.getString("Email"));
            Tphone.setText(rs.getString("Phone"));
            Tdate.setText(rs.getString("Date"));
            Tsalary.setText(rs.getString("Salary"));
            String Gender = rs.getString("Gender");
            if ("Male".equals(Gender)) {
                male.setSelected(true);
            } else if("Female".equals(Gender)) {
                female.setSelected(true);
            }
            Taddress.setText(rs.getString("Address"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(teacherSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teacherSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teacherSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teacherSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teacherSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Taddress;
    private javax.swing.JTextField Tdate;
    private javax.swing.JTextField Temail;
    private javax.swing.JTextField Tphone;
    private javax.swing.JTextField Tsalary;
    private javax.swing.JTextField Tspec;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField tname;
    // End of variables declaration//GEN-END:variables
}
