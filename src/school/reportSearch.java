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
public class reportSearch extends javax.swing.JFrame {

    /**
     * Creates new form teacherSearch
     */
    public reportSearch() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Update_botton = new javax.swing.JButton();
        Delet_Botton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        Fname = new javax.swing.JTextField();
        fee = new javax.swing.JTextField();
        Class = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        Select_Botton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1550, 900));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1550, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel2.setForeground(java.awt.Color.orange);
        jLabel2.setText("student Fee Modification");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 550, 43));

        jLabel3.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 130, 43));

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 130, 43));

        jLabel5.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Father Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 130, 43));

        jLabel6.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fee");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 130, 40));

        jLabel7.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Class");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 130, 43));

        jLabel8.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 130, 43));

        jLabel10.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gender");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 130, 43));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("__________________________________________________________________________________________________");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 700, -1));

        Update_botton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Update_botton.setText("Update");
        Update_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_bottonActionPerformed(evt);
            }
        });
        jPanel1.add(Update_botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 650, 160, 50));

        Delet_Botton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Delet_Botton.setText("Delet");
        Delet_Botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delet_BottonActionPerformed(evt);
            }
        });
        jPanel1.add(Delet_Botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 650, 160, 50));

        jButton5.setBackground(java.awt.Color.cyan);
        jButton5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 650, 160, 50));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("_______________________________________________________________________________________________________");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 600, 930, 20));

        id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 310, 30));

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 310, 30));

        Fname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameActionPerformed(evt);
            }
        });
        jPanel1.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 310, 30));

        fee.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feeActionPerformed(evt);
            }
        });
        jPanel1.add(fee, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 310, 30));

        Class.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassActionPerformed(evt);
            }
        });
        jPanel1.add(Class, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 310, 30));

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 310, 30));

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, 130, 40));

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("Male");
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 130, 40));

        Select_Botton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Select_Botton.setText("Select");
        Select_Botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_BottonActionPerformed(evt);
            }
        });
        jPanel1.add(Select_Botton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 217, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Delet_BottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delet_BottonActionPerformed
        // TODO add your handling code here:
        Sacred s = new Sacred();
        int opt = JOptionPane.showConfirmDialog(null, "Are You Sure To Delet", "Delet", JOptionPane.YES_NO_OPTION);
        if(opt == 0){
        try {
            s.feeDelet((id.getText()));
            id.setText("");
            name.setText("");
            Fname.setText("");
            Class.setText("");
            fee.setText("");
            date.setText("");
            JOptionPane.showMessageDialog(this, "Data Deleted Successfully");
        } catch (Exception e) {
            System.out.println("Error in DeletBotton of fees"+e);
        }
        }
    }//GEN-LAST:event_Delet_BottonActionPerformed

    private void Update_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_bottonActionPerformed
        // TODO add your handling code here:
        Sacred s = new Sacred();
        String Gender = "";
        if(male.isSelected()){
        Gender = "Male";
        } else if(female.isSelected()){
        Gender = "Female";
        }
        try {
            s.feeUpdate(id.getText(),name.getText(), Fname.getText(), Class.getText(), fee.getText(), date.getText(), Gender);
            id.setText("");
            name.setText("");
            Fname.setText("");
            Class.setText("");
            fee.setText("");
            date.setText("");
            JOptionPane.showMessageDialog(this, "Data Updated Successfully");
        } catch (Exception e) {
            System.out.println("Error in update botton"+e);
        }
    }//GEN-LAST:event_Update_bottonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        viewReport vr = new viewReport();
        vr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameActionPerformed

    private void feeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feeActionPerformed

    private void ClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClassActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void Select_BottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_BottonActionPerformed
        // TODO add your handling code here:
        Sacred s = new Sacred();
        
        ResultSet rs = s.getFeeById((id.getText()));
        try {
            if(rs.next() == false){
            
            JOptionPane.showMessageDialog(this, "Record not found");
            id.setText("");
            }
            else{
           // rs.next();
            //SID.setText(rs.getString("ID"));
            name.setText(rs.getString("Name"));
            Fname.setText(rs.getString("F_Name"));
            Class.setText(rs.getString("Class"));
            fee.setText(rs.getString("Fee"));
            date.setText(rs.getString("Fee_Date"));
            String Gender = rs.getString("Gender");
            if ("Male".equals(Gender)) {
                male.setSelected(true);
            } else if("Female".equals(Gender)) {
                female.setSelected(true);
            }
            }
        } catch (Exception e) {
            System.out.println("Error in FeeSelect Botton"+e);
        }
    }//GEN-LAST:event_Select_BottonActionPerformed

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
    private javax.swing.JTextField Class;
    private javax.swing.JButton Delet_Botton;
    private javax.swing.JTextField Fname;
    private javax.swing.JButton Select_Botton;
    private javax.swing.JButton Update_botton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField date;
    private javax.swing.JTextField fee;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}