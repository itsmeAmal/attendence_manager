/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sams.controller;

import com.sams.daoimpl.AttendanceDaoImpl;
import com.sams.model.Attendance;
import java.sql.SQLException;

/**
 *
 * @author personal
 */
public class AttendanceController {

    public static boolean addAttendanceRecord(int StudentId, String Detail, int LectureRoomId, int LecturerId, int ModuleId) throws SQLException {
        Attendance attendance = new Attendance();
        attendance.setStudentId(StudentId);
        attendance.setDetail(Detail);
        attendance.setLectureRoomId(LectureRoomId);
        attendance.setLecturerId(LecturerId);
        attendance.setModuleId(ModuleId);
        return new AttendanceDaoImpl().addAttendance(attendance);
    }

}
