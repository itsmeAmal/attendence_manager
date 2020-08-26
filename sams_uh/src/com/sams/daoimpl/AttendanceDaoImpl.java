/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sams.daoimpl;

import com.sams.dao.AttendanceDao;
import com.sams.databaseconnection.DatabaseConnection;
import com.sams.model.Attendance;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author personal
 */
public class AttendanceDaoImpl implements AttendanceDao {

    private String SelectQuery = "select attendance_id, attendance_student_id,"
            + " attendance_date_time, attendance_module_id, attendance_lecture_room_id,"
            + " attendance_lecturer_id, attendance_status, attendance_detail attendance";

    @Override
    public boolean addAttendance(Attendance attendance) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into attendance ( attendance_student_id, attendance_date_time, "
                + "attendance_module_id, attendance_lecture_room_id, attendance_lecturer_id, attendance_detail) values (?,?,?,?,?,?)");
        ps.setInt(1, attendance.getStudentId());
        ps.setTimestamp(2, attendance.getAttendanceDate());
        ps.setInt(3, attendance.getModuleId());
        ps.setInt(4, attendance.getLectureRoomId());
        ps.setInt(5, attendance.getLecturerId());
        ps.setString(6, attendance.getDetail());
        ps.executeUpdate();
        ps.close();
        return true;
    }

    @Override
    public boolean updateAttendance(Attendance attendance) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteAttendance(int attendanceId) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet getAttendanceByOneAttribute(String attribute, String condition, String value) throws SQLException {
        return new commonDaoImpl().getResultByAttribute(SelectQuery, attribute, condition, value);
    }

    @Override
    public ResultSet getAttendanceByMoreAttributes(ArrayList<String[]> attributeConditionValueList, String operator) throws SQLException {
        return new commonDaoImpl().getResultByAttributesWithJoinOperator(SelectQuery, attributeConditionValueList, operator);
    }

    @Override
    public ResultSet getAllAttendances() throws SQLException {
        return new commonDaoImpl().getAllRecords(SelectQuery);
    }

}
