/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sams.ui;

import com.sams.controller.AttendanceController;
import com.sams.controller.StudentController;
import com.sams.model.Student;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author personal
 */
public class MarkAttendanceTouch extends javax.swing.JFrame {

    private static boolean SUBJECT_ONE = false;
    private static boolean SUBJECT_TWO = false;
    private static boolean SUBJECT_THREE = false;
    private static boolean SUBJECT_FOUR = false;

    private static boolean MODULE_SELECTED = false;
    private static int MODULE_ID = 0;

    private static boolean isAvailableStudents = false;

    private static Student student = null;
    
    private static int ClickedButtonId = 0;

    /**
     * Creates new form MarkAttendanceTouch
     */
    public MarkAttendanceTouch() {
        initComponents();
        pnl1.setBackground(new Color(102, 153, 255));
        pnl2.setBackground(new Color(102, 153, 255));
        pnl3.setBackground(new Color(102, 153, 255));
        pnl4.setBackground(new Color(102, 153, 255));

        DefaultSetting();
    }

    private void DefaultSetting() {
        lblStudenName.setText("< Student Name >");
        lblStudentRegNo.setText("< Student Reg No >");
        lblThankYou.setText(null);

        txtStudentRegNo.setEnabled(false);
        txtStudentRegNo.setFocusable(false);
    }

    private void ValidateStudent() {

        lblStudenName.setText("< Student Name >");
        lblStudentRegNo.setText("< Student Reg No >");
        lblThankYou.setText(null);

        try {
            if (StudentController.isAvailableStudentByStudentId(txtStudentRegNo.getText().trim())) {
                student = StudentController.GetStudentByStudentRegNo(txtStudentRegNo.getText().trim());
                String ModuleName = "";
                if(ClickedButtonId==1){
                    ModuleName = "Module One";
                }else if(ClickedButtonId==2){
                    ModuleName = "Module Two";
                }else if(ClickedButtonId ==3){
                    ModuleName = "Module Three";
                }else {
                    ModuleName = "Module Four";
                }
                
                AttendanceController.addAttendanceRecord(student.getId(), ModuleName, 0, 0, 0);
                
                
                lblStudenName.setText(student.getFullName());
                lblStudentRegNo.setText(student.getRemark_1());
                lblThankYou.setText("Updated ! Thank you !");
                txtStudentRegNo.selectAll();
                MODULE_SELECTED = false;
                ModuleName = "";
                
                System.out.println(student.getNameWithInitials());
                System.out.println(MODULE_ID);

                pnl1.setBackground(new Color(102, 153, 255));
                pnl2.setBackground(new Color(102, 153, 255));
                pnl3.setBackground(new Color(102, 153, 255));
                pnl4.setBackground(new Color(102, 153, 255));

            }else {
                JOptionPane.showMessageDialog(this, "This id is not registered !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MarkAttendanceTouch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void EnableDefault() {
        txtStudentRegNo.setEnabled(true);
        txtStudentRegNo.setFocusable(true);
    }

    private void TouchButton(int ButtonId, boolean SubjectBoolean) {
        ClickedButtonId = ButtonId;
        switch (ButtonId) {
            case 1:
                if (SubjectBoolean) {
                    SUBJECT_ONE = false;
                    pnl1.setBackground(new Color(102, 153, 255));
                    MODULE_SELECTED = true;
                    MODULE_ID = 1000;
                    DefaultSetting();
                } else {
                    SUBJECT_ONE = true;
                    pnl1.setBackground(new Color(51, 255, 0));
                    pnl2.setBackground(new Color(102, 153, 255));
                    pnl3.setBackground(new Color(102, 153, 255));
                    pnl4.setBackground(new Color(102, 153, 255));
                    MODULE_SELECTED = false;
                    EnableDefault();
                }
                break;
            case 2:
                if (SubjectBoolean) {
                    SUBJECT_TWO = false;
                    pnl2.setBackground(new Color(102, 153, 255));
                    MODULE_SELECTED = true;
                    MODULE_ID = 2000;
                    DefaultSetting();
                } else {
                    SUBJECT_TWO = true;
                    pnl2.setBackground(new Color(51, 255, 0));
                    pnl1.setBackground(new Color(102, 153, 255));
                    pnl3.setBackground(new Color(102, 153, 255));
                    pnl4.setBackground(new Color(102, 153, 255));
                    MODULE_SELECTED = false;
                    EnableDefault();
                }
                break;
            case 3:
                if (SubjectBoolean) {
                    SUBJECT_THREE = false;
                    pnl3.setBackground(new Color(102, 153, 255));
                    MODULE_SELECTED = true;
                    MODULE_ID = 3000;
                    DefaultSetting();
                } else {
                    SUBJECT_THREE = true;
                    pnl3.setBackground(new Color(51, 255, 0));
                    pnl1.setBackground(new Color(102, 153, 255));
                    pnl2.setBackground(new Color(102, 153, 255));
                    pnl4.setBackground(new Color(102, 153, 255));
                    MODULE_SELECTED = false;
                    EnableDefault();
                }
                break;
            case 4:
                if (SubjectBoolean) {
                    SUBJECT_FOUR = false;
                    pnl4.setBackground(new Color(102, 153, 255));
                    MODULE_SELECTED = true;
                    MODULE_ID = 4000;
                    DefaultSetting();
                } else {
                    SUBJECT_FOUR = true;
                    pnl4.setBackground(new Color(51, 255, 0));
                    pnl1.setBackground(new Color(102, 153, 255));
                    pnl2.setBackground(new Color(102, 153, 255));
                    pnl3.setBackground(new Color(102, 153, 255));
                    MODULE_SELECTED = false;
                    EnableDefault();
                }
                break;
            default:
                break;
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

        jPanel2 = new javax.swing.JPanel();
        txtStudentRegNo = new javax.swing.JTextField();
        pnl1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnl3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnl4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblStudenName = new javax.swing.JLabel();
        lblStudentRegNo = new javax.swing.JLabel();
        lblThankYou = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mark Attendance");
        setBackground(new java.awt.Color(153, 0, 51));
        setMaximumSize(new java.awt.Dimension(642, 305));
        setMinimumSize(new java.awt.Dimension(642, 305));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(1200, 638));
        jPanel2.setMinimumSize(new java.awt.Dimension(1200, 638));

        txtStudentRegNo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtStudentRegNo.setToolTipText("Details / Remarks");
        txtStudentRegNo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtStudentRegNo.setSelectionColor(new java.awt.Color(255, 255, 0));
        txtStudentRegNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentRegNoActionPerformed(evt);
            }
        });
        txtStudentRegNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStudentRegNoKeyReleased(evt);
            }
        });

        pnl1.setBackground(new java.awt.Color(51, 255, 0));
        pnl1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MODULE 1");

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pnl2.setBackground(new java.awt.Color(102, 153, 255));
        pnl2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MODULE 2");

        javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
        pnl2.setLayout(pnl2Layout);
        pnl2Layout.setHorizontalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pnl3.setBackground(new java.awt.Color(102, 153, 255));
        pnl3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl3MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MODULE 3");

        javax.swing.GroupLayout pnl3Layout = new javax.swing.GroupLayout(pnl3);
        pnl3.setLayout(pnl3Layout);
        pnl3Layout.setHorizontalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnl3Layout.setVerticalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pnl4.setBackground(new java.awt.Color(102, 153, 255));
        pnl4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl4MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MODULE 4");

        javax.swing.GroupLayout pnl4Layout = new javax.swing.GroupLayout(pnl4);
        pnl4.setLayout(pnl4Layout);
        pnl4Layout.setHorizontalGroup(
            pnl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnl4Layout.setVerticalGroup(
            pnl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        lblStudenName.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblStudenName.setForeground(new java.awt.Color(51, 51, 255));
        lblStudenName.setText("< Student Name >");

        lblStudentRegNo.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblStudentRegNo.setForeground(new java.awt.Color(51, 51, 255));
        lblStudentRegNo.setText("< Reg Number >");

        lblThankYou.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblThankYou.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(txtStudentRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblThankYou, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblStudenName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStudentRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStudentRegNo, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(lblThankYou, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStudenName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStudentRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1MouseClicked
        TouchButton(1, SUBJECT_ONE);
    }//GEN-LAST:event_pnl1MouseClicked

    private void pnl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2MouseClicked
        TouchButton(2, SUBJECT_TWO);
    }//GEN-LAST:event_pnl2MouseClicked

    private void pnl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3MouseClicked
        TouchButton(3, SUBJECT_THREE);
    }//GEN-LAST:event_pnl3MouseClicked

    private void pnl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl4MouseClicked
        TouchButton(4, SUBJECT_FOUR);
    }//GEN-LAST:event_pnl4MouseClicked

    private void txtStudentRegNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStudentRegNoKeyReleased
        
    }//GEN-LAST:event_txtStudentRegNoKeyReleased

    private void txtStudentRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentRegNoActionPerformed
        ValidateStudent();
    }//GEN-LAST:event_txtStudentRegNoActionPerformed

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
            java.util.logging.Logger.getLogger(MarkAttendanceTouch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarkAttendanceTouch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarkAttendanceTouch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarkAttendanceTouch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarkAttendanceTouch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblStudenName;
    private javax.swing.JLabel lblStudentRegNo;
    private javax.swing.JLabel lblThankYou;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl3;
    private javax.swing.JPanel pnl4;
    private javax.swing.JTextField txtStudentRegNo;
    // End of variables declaration//GEN-END:variables
}
