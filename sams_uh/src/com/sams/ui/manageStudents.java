/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sams.ui;

import com.sams.controller.StudentController;
import com.sams.controller.commonController;
import java.sql.ResultSet;
import java.sql.SQLException;
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

        try {
            int option = JOptionPane.showConfirmDialog(this, "Do you want to save new student details ?");
            if (option == JOptionPane.YES_OPTION) {
                boolean status = StudentController.addStudent(txtFullName.getText().trim(), txtNameWithInitials.getText().trim(),
                        txtNic.getText().trim(), commonController.getMysqlDateFromJDateChooser(calBirthday),
                        comboGender.getSelectedItem().toString(), txtAddress.getText().trim(), txtMobile.getText().trim(),
                        txtHome.getText().trim(), txtEmail.getText().trim(), txtRemark.getText().trim(), "");
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
        txtRemark.setText("");
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
        txtRemark = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentDetails = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        txtDetail3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtAddress = new javax.swing.JTextField();
        calBirthday = new com.toedter.calendar.JDateChooser();
        txtEmail = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Management");
        setMaximumSize(new java.awt.Dimension(1101, 643));
        setMinimumSize(new java.awt.Dimension(1101, 643));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1269, 643));
        jPanel1.setMinimumSize(new java.awt.Dimension(1269, 643));
        jPanel1.setPreferredSize(new java.awt.Dimension(1269, 643));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(1200, 638));
        jPanel2.setMinimumSize(new java.awt.Dimension(1200, 638));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 638));

        txtFullName.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtFullName.setToolTipText("Student Name");
        txtFullName.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtFullName.setSelectionColor(new java.awt.Color(255, 255, 0));

        txtNic.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtNic.setToolTipText("Registration No");
        txtNic.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtNic.setSelectionColor(new java.awt.Color(255, 255, 0));

        txtNameWithInitials.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtNameWithInitials.setToolTipText("Email ");
        txtNameWithInitials.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtNameWithInitials.setSelectionColor(new java.awt.Color(255, 255, 0));

        comboGender.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        comboGender.setToolTipText("Batch");

        txtMobile.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtMobile.setToolTipText("Details / Remarks");
        txtMobile.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtMobile.setSelectionColor(new java.awt.Color(255, 255, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Contact - Mobile");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Address");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Email");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Gender");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Date of Birth");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("NIC");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Name with Initials");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Full Name");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Contact - Home");

        txtHome.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtHome.setToolTipText("Details / Remarks");
        txtHome.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtHome.setSelectionColor(new java.awt.Color(255, 255, 0));

        txtRemark.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtRemark.setToolTipText("Details / Remarks");
        txtRemark.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtRemark.setSelectionColor(new java.awt.Color(255, 255, 0));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Student Registration No");

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

        txtDetail3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtDetail3.setToolTipText("Details / Remarks");
        txtDetail3.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDetail3.setSelectionColor(new java.awt.Color(255, 255, 0));

        jButton1.setText("Search");

        txtAddress.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtAddress.setToolTipText("Details / Remarks");
        txtAddress.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtAddress.setSelectionColor(new java.awt.Color(255, 255, 0));

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

        txtEmail.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtEmail.setToolTipText("Details / Remarks");
        txtEmail.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtEmail.setSelectionColor(new java.awt.Color(255, 255, 0));

        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNameWithInitials, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFullName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNic, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAddress)
                                    .addComponent(calBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtHome)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtMobile)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtRemark, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1066, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtDetail3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRemark, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHome, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNameWithInitials, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNic, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(calBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(142, 142, 142)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDetail3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblStudentDetails;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDetail3;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtHome;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtNameWithInitials;
    private javax.swing.JTextField txtNic;
    private javax.swing.JTextField txtRemark;
    // End of variables declaration//GEN-END:variables
}
