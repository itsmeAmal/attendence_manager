/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sams.ui;

import com.sams.controller.StudentController;
import com.sams.controller.commonConstants;
import com.sams.controller.commonController;
import com.sams.daoimpl.StudentDaoImpl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Amal
 */
public class manageStudents extends javax.swing.JFrame {

    /**
     * Creates new form addStudent
     */
    public manageStudents() {
        initComponents();
        getAllStudents();
    }

    private void addStudent() {

        if (txtFullName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter full name !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtNameWithInitials.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter name with initials!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtNic.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter NIC !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (calBirthday.getDate().toString().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select Date of Birth !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtAddress.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter txtAddress !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtEmail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter email !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtMobile.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter mobile no !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtRegNo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Registration no !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int option = JOptionPane.showConfirmDialog(this, "Do you want to save new student details ?");
            if (option == JOptionPane.YES_OPTION) {
                boolean status = StudentController.addStudent(txtFullName.getText().trim(), txtNameWithInitials.getText().trim(),
                        txtNic.getText().trim(), commonController.getMysqlDateFromJDateChooser(calBirthday),
                        comboGender.getSelectedItem().toString(), txtAddress.getText().trim(), txtMobile.getText().trim(),
                        txtHome.getText().trim(), txtEmail.getText().trim(), txtRegNo.getText().trim(), "");
                if (status) {
                    clearAll();
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(manageStudents.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clearAll() {
        txtFullName.setText("");
        txtNameWithInitials.setText("");
        txtNic.setText("");
        txtAddress.setText("");
        txtMobile.setText("");
        txtHome.setText("");
        txtEmail.setText("");
        txtRegNo.setText("");
        comboGender.setSelectedIndex(0);
        calBirthday.setDate(null);
    }

    private void getAllStudents() {
        try {
            String[] columnList = {"student_id", "student_full_name", "student_name_with_initials",
                "student_nic", "student_dob", "student_gender", "student_address", "student_contact_mobile",
                "student_contact_email", "student_contact_home", "student_remark_1"};
            ResultSet rset = StudentController.getAllStudents();
            commonController.loadDataToTable(tblStudentDetails, rset, columnList);
        } catch (SQLException ex) {
            Logger.getLogger(manageStudents.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void SearchStudents() {
        try {
            String[] columnList = {"student_id", "student_full_name", "student_name_with_initials",
                "student_nic", "student_dob", "student_gender", "student_address", "student_contact_mobile",
                "student_contact_email", "student_contact_home", "student_remark_1"};
            
            ArrayList<String[]> AttributeConditionValueList = new ArrayList<>();
            
            String[] ACV1 = {"student_full_name", commonConstants.Sql.LIKE, "%" + txtSearch.getText() + "%"};
            AttributeConditionValueList.add(ACV1);
            
            String[] ACV2 = {"student_name_with_initials", commonConstants.Sql.LIKE, "%" + txtSearch.getText() + "%"};
            AttributeConditionValueList.add(ACV2);
            
            String[] ACV3 = {"student_nic", commonConstants.Sql.LIKE, "%" + txtSearch.getText() + "%"};
            AttributeConditionValueList.add(ACV3);
            
            String[] ACV4 = {"student_remark_1", commonConstants.Sql.LIKE, "%" + txtSearch.getText() + "%"};
            AttributeConditionValueList.add(ACV4);
            
            ResultSet rest = new StudentDaoImpl().getStudentsByMoreAttributes(AttributeConditionValueList, commonConstants.Sql.OR);
            commonController.loadDataToTable(tblStudentDetails, rest, columnList); 
        
        } catch (SQLException ex) {
            Logger.getLogger(manageStudents.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtFullName = new javax.swing.JTextField();
        txtNic = new javax.swing.JTextField();
        txtNameWithInitials = new javax.swing.JTextField();
        comboGender = new javax.swing.JComboBox<>();
        txtMobile = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtHome = new javax.swing.JTextField();
        txtRegNo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentDetails = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        txtSearch = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        calBirthday = new com.toedter.calendar.JDateChooser();
        txtEmail = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Management");
        setMaximumSize(new java.awt.Dimension(1101, 643));
        setMinimumSize(new java.awt.Dimension(1101, 643));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(1269, 643));
        jPanel1.setMinimumSize(new java.awt.Dimension(1269, 643));
        jPanel1.setPreferredSize(new java.awt.Dimension(1269, 643));

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(1200, 638));
        jPanel2.setMinimumSize(new java.awt.Dimension(1200, 638));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 638));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFullName.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtFullName.setToolTipText("Student Name");
        txtFullName.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtFullName.setSelectionColor(new java.awt.Color(255, 255, 0));
        jPanel2.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 45, 251, 44));

        txtNic.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtNic.setToolTipText("Registration No");
        txtNic.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtNic.setSelectionColor(new java.awt.Color(255, 255, 0));
        jPanel2.add(txtNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 187, 251, 44));

        txtNameWithInitials.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtNameWithInitials.setToolTipText("Email ");
        txtNameWithInitials.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtNameWithInitials.setSelectionColor(new java.awt.Color(255, 255, 0));
        jPanel2.add(txtNameWithInitials, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 116, 251, 44));

        comboGender.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        comboGender.setToolTipText("Batch");
        jPanel2.add(comboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 116, 251, 44));

        txtMobile.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtMobile.setToolTipText("Details / Remarks");
        txtMobile.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtMobile.setSelectionColor(new java.awt.Color(255, 255, 0));
        jPanel2.add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 116, 250, 44));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contact - Mobile");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 95, 250, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Address");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 166, 251, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 22, 249, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gender");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 95, 251, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date of Birth");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 24, 251, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("NIC");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 166, 251, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Name with Initials");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 95, 251, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Full Name");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 24, 251, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Contact - Home");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 166, 250, -1));

        txtHome.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtHome.setToolTipText("Details / Remarks");
        txtHome.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtHome.setSelectionColor(new java.awt.Color(255, 255, 0));
        jPanel2.add(txtHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 187, 250, 44));

        txtRegNo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtRegNo.setToolTipText("Details / Remarks");
        txtRegNo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtRegNo.setSelectionColor(new java.awt.Color(255, 255, 0));
        jPanel2.add(txtRegNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 43, 250, 44));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Student Registration No");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 22, 250, -1));

        tblStudentDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Full Name", "Name With Initials", "NIC", "Date Of Birth", "Gender", "Address", "Email", "Contact - Mobile", "Contact - Home", "Reg No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudentDetails);
        if (tblStudentDetails.getColumnModel().getColumnCount() > 0) {
            tblStudentDetails.getColumnModel().getColumn(0).setMinWidth(0);
            tblStudentDetails.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblStudentDetails.getColumnModel().getColumn(0).setMaxWidth(0);
            tblStudentDetails.getColumnModel().getColumn(1).setMinWidth(0);
            tblStudentDetails.getColumnModel().getColumn(1).setPreferredWidth(0);
            tblStudentDetails.getColumnModel().getColumn(1).setMaxWidth(0);
            tblStudentDetails.getColumnModel().getColumn(2).setResizable(false);
            tblStudentDetails.getColumnModel().getColumn(3).setMinWidth(120);
            tblStudentDetails.getColumnModel().getColumn(3).setPreferredWidth(120);
            tblStudentDetails.getColumnModel().getColumn(3).setMaxWidth(120);
            tblStudentDetails.getColumnModel().getColumn(4).setMinWidth(100);
            tblStudentDetails.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblStudentDetails.getColumnModel().getColumn(4).setMaxWidth(100);
            tblStudentDetails.getColumnModel().getColumn(5).setMinWidth(60);
            tblStudentDetails.getColumnModel().getColumn(5).setPreferredWidth(60);
            tblStudentDetails.getColumnModel().getColumn(5).setMaxWidth(60);
            tblStudentDetails.getColumnModel().getColumn(6).setMinWidth(0);
            tblStudentDetails.getColumnModel().getColumn(6).setPreferredWidth(0);
            tblStudentDetails.getColumnModel().getColumn(6).setMaxWidth(0);
            tblStudentDetails.getColumnModel().getColumn(7).setMinWidth(0);
            tblStudentDetails.getColumnModel().getColumn(7).setPreferredWidth(0);
            tblStudentDetails.getColumnModel().getColumn(7).setMaxWidth(0);
            tblStudentDetails.getColumnModel().getColumn(8).setMinWidth(0);
            tblStudentDetails.getColumnModel().getColumn(8).setPreferredWidth(0);
            tblStudentDetails.getColumnModel().getColumn(8).setMaxWidth(0);
            tblStudentDetails.getColumnModel().getColumn(9).setMinWidth(0);
            tblStudentDetails.getColumnModel().getColumn(9).setPreferredWidth(0);
            tblStudentDetails.getColumnModel().getColumn(9).setMaxWidth(0);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 321, 1073, 299));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 243, 799, 10));

        txtSearch.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtSearch.setToolTipText("Search Students");
        txtSearch.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtSearch.setSelectionColor(new java.awt.Color(255, 255, 0));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel2.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 271, 249, 44));

        txtAddress.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtAddress.setToolTipText("Details / Remarks");
        txtAddress.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtAddress.setSelectionColor(new java.awt.Color(255, 255, 0));
        jPanel2.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 187, 251, 44));

        calBirthday.setToolTipText("Week Begining Date");
        calBirthday.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                calBirthdayFocusLost(evt);
            }
        });
        calBirthday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calBirthdayMouseExited(evt);
            }
        });
        calBirthday.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calBirthdayPropertyChange(evt);
            }
        });
        calBirthday.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calBirthdayKeyReleased(evt);
            }
        });
        jPanel2.add(calBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 45, 251, 44));

        txtEmail.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtEmail.setToolTipText("Details / Remarks");
        txtEmail.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtEmail.setSelectionColor(new java.awt.Color(255, 255, 0));
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 43, 249, 44));

        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(966, 187, 96, 44));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Search Sudents");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 250, 250, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1089, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1101, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calBirthdayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_calBirthdayFocusLost

    }//GEN-LAST:event_calBirthdayFocusLost

    private void calBirthdayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calBirthdayMouseExited

    }//GEN-LAST:event_calBirthdayMouseExited

    private void calBirthdayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calBirthdayPropertyChange
    }//GEN-LAST:event_calBirthdayPropertyChange

    private void calBirthdayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calBirthdayKeyReleased

    }//GEN-LAST:event_calBirthdayKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        addStudent();
        getAllStudents();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        SearchStudents(); 
    }//GEN-LAST:event_txtSearchKeyReleased

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
            java.util.logging.Logger.getLogger(manageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser calBirthday;
    private javax.swing.JComboBox<String> comboGender;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblStudentDetails;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtHome;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtNameWithInitials;
    private javax.swing.JTextField txtNic;
    private javax.swing.JTextField txtRegNo;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
