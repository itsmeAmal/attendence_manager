/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sams.daoimpl;

import com.sams.dao.StudentDao;
import com.sams.databaseconnection.DatabaseConnection;
import com.sams.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author personal
 */
public class StudentDaoImpl implements StudentDao {

    private String SelectQuery = "select student_id, student_full_name, student_name_with_initials, "
            + " student_nic, student_dob, student_gender, student_address, student_contact_mobile, "
            + " student_contact_email, student_contact_home, student_remark_1, student_remark_2, "
            + " student_status from student";

    @Override
    public boolean addStudent(Student student) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into student(student_full_name, "
                + " student_name_with_initials, student_nic, student_dob, student_gender, student_address, "
                + " student_contact_mobile, student_contact_email, student_contact_home, student_remark_1, "
                + " student_remark_2) values (?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, student.getFullName());
        ps.setString(2, student.getNameWithInitials());
        ps.setString(3, student.getNic());
        ps.setDate(4, student.getDateOfBirth());
        ps.setString(5, student.getGender());
        ps.setString(6, student.getAddress());
        ps.setString(7, student.getContactMobile());
        ps.setString(8, student.getContactEmail());
        ps.setString(9, student.getContactHome());
        ps.setString(10, student.getRemark_1());
        ps.setString(11, student.getRemark_2());
        ps.executeUpdate();
        return true;
    }

    @Override
    public boolean updateStudent(Student student) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("update student set student_full_name=?, "
                + "student_name_with_initial=?, student_nic=?, student_dob=?, student_gender=?, student_address=?, "
                + "student_contact_mobile=?, student_contact_email=?, student_contact_home=?, student_remark_1=?, "
                + "student_remark_2=? where student_id=?");
        ps.setString(1, student.getFullName());
        ps.setString(2, student.getNameWithInitials());
        ps.setString(3, student.getNic());
        ps.setDate(4, student.getDateOfBirth());
        ps.setString(5, student.getGender());
        ps.setString(6, student.getAddress());
        ps.setString(7, student.getContactMobile());
        ps.setString(8, student.getContactEmail());
        ps.setString(9, student.getContactHome());
        ps.setString(10, student.getRemark_1());
        ps.setString(11, student.getRemark_2());
        ps.setInt(12, student.getId());
        ps.executeUpdate();
        return true;
    }

    @Override
    public boolean deleteStudent(int studentId) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("delete from student where student_id=?");
        ps.setInt(1, studentId);
        ps.executeUpdate();
        return true;
    }

    @Override
    public ResultSet getStudentResultsetByOneAttribute(String attribute, String condition, String value) throws SQLException {
        return new commonDaoImpl().getResultByAttribute(SelectQuery, attribute, condition, value);
    }

    @Override
    public ResultSet getAllStudents() throws SQLException {
        return new commonDaoImpl().getAllRecords(SelectQuery);
    }

    @Override
    public ResultSet getStudentsByMoreAttributes(ArrayList<String[]> attributeConditionValueList, String operator) throws SQLException {
        return new commonDaoImpl().getResultByAttributesWithJoinOperator(SelectQuery, attributeConditionValueList, operator);
    }

}
