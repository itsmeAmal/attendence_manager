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

}
