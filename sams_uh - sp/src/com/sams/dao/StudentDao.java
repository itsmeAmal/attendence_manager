/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sams.dao;

import com.sams.model.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author personal
 */
public interface StudentDao {

    public boolean addStudent(Student student) throws SQLException;

    public boolean updateStudent(Student student) throws SQLException;

    public boolean deleteStudent(int studentId) throws SQLException;

    public ResultSet getStudentResultsetByOneAttribute(String attribute, String condition, String value) throws SQLException;

    public ResultSet getAllStudents() throws SQLException;

    public ResultSet getStudentsByMoreAttributes(ArrayList<String[]> attributeConditionValueList, String operator) throws SQLException;

}
