/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sams.dao;

import com.sams.model.Attendance;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author personal
 */
public interface AttendanceDao {

    public boolean addAttendance(Attendance attendance) throws SQLException;

    public boolean updateAttendance(Attendance attendance) throws SQLException;

    public boolean deleteAttendance(int attendanceId) throws SQLException;

    public ResultSet getAttendanceByOneAttribute(String attribute, String condition, String value) throws SQLException;

    public ResultSet getAttendanceByMoreAttributes(ArrayList<String[]> attributeConditionValueList, String operator) throws SQLException;

    public ResultSet getAllAttendances() throws SQLException;

}
