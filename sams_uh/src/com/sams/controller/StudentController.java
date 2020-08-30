/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sams.controller;

import com.sams.daoimpl.StudentDaoImpl;
import com.sams.model.Student;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author personal
 */
public class StudentController {

    public static boolean addStudent(String FullName, String NameWithInitials, String Nic,
            Date Dob, String Gender, String Address, String ContactMobile, String ContactHome,
            String Email, String Remark, String Remark2) throws SQLException {

        Student student = new Student();
        student.setFullName(FullName);
        student.setNameWithInitials(NameWithInitials);
        student.setNic(Nic);
        student.setDateOfBirth(Dob);
        student.setGender(Gender);
        student.setAddress(Address);
        student.setContactMobile(ContactMobile);
        student.setContactHome(ContactHome);
        student.setContactEmail(Email);
        student.setRemark_1(Remark);
        student.setRemark_2(Remark2);

        return new StudentDaoImpl().addStudent(student);

    }

    public static ResultSet getAllStudents() throws SQLException {
        return new StudentDaoImpl().getAllStudents();
    }

    public static ResultSet getStudentByOneAttribute(String attribute, String condition, String value) throws SQLException {
        return new StudentDaoImpl().getStudentResultsetByOneAttribute(attribute, condition, value);
    }

    public static boolean isAvailableStudentByStudentId(String StudentCode) throws SQLException {
        boolean status = false;
        ResultSet rset = getStudentByOneAttribute("student_remark_1", commonConstants.Sql.EQUAL, StudentCode);
        if (rset.next()) {
            status = true;
        }
        return status;
    }

    public static Student GetStudentByStudentRegNo(String StudentCode) throws SQLException {
        Student Student = null;
        ResultSet rset = getStudentByOneAttribute("student_remark_1", commonConstants.Sql.EQUAL, StudentCode);
        while (rset.next()) {
            Student = new Student();
            Student.setAddress(rset.getString("student_address"));
            Student.setId(rset.getInt("student_id"));
            Student.setFullName(rset.getString("student_full_name"));
            Student.setNameWithInitials(rset.getString("student_name_with_initials"));
            Student.setNic(rset.getString("student_nic"));
            Student.setDateOfBirth(rset.getDate("student_dob"));
            Student.setGender(rset.getString("student_gender"));
            Student.setContactMobile(rset.getString("student_contact_mobile"));
            Student.setContactEmail(rset.getString("student_contact_email"));
            Student.setContactHome(rset.getString("student_contact_home"));
            Student.setRemark_1(rset.getString("student_remark_1"));
            Student.setRemark_2(rset.getString("student_remark_2"));
            Student.setStatus(rset.getInt("student_status"));
        }
        return Student;
    }

}
