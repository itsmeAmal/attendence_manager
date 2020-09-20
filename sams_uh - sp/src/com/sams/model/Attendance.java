/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sams.model;

import java.sql.Timestamp;

/**
 *
 * @author personal
 */
public class Attendance {

    private int Id;
    private int StudentId;
    private Timestamp AttendanceInDate;
    private Timestamp AttendanceOutTime;
    private int ModuleId;
    private int LectureRoomId;
    private int LecturerId;
    private String detail;
    private int Status;

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the StudentId
     */
    public int getStudentId() {
        return StudentId;
    }

    /**
     * @param StudentId the StudentId to set
     */
    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }

    /**
     * @return the AttendanceInDate
     */
    public Timestamp getAttendanceDate() {
        return getAttendanceInDate();
    }

    /**
     * @param AttendanceDate the AttendanceInDate to set
     */
    public void setAttendanceDate(Timestamp AttendanceDate) {
        this.setAttendanceInDate(AttendanceDate);
    }

    /**
     * @return the ModuleId
     */
    public int getModuleId() {
        return ModuleId;
    }

    /**
     * @param ModuleId the ModuleId to set
     */
    public void setModuleId(int ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * @return the LectureRoomId
     */
    public int getLectureRoomId() {
        return LectureRoomId;
    }

    /**
     * @param LectureRoomId the LectureRoomId to set
     */
    public void setLectureRoomId(int LectureRoomId) {
        this.LectureRoomId = LectureRoomId;
    }

    /**
     * @return the LecturerId
     */
    public int getLecturerId() {
        return LecturerId;
    }

    /**
     * @param LecturerId the LecturerId to set
     */
    public void setLecturerId(int LecturerId) {
        this.LecturerId = LecturerId;
    }

    /**
     * @return the detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail the detail to set
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * @return the Status
     */
    public int getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(int Status) {
        this.Status = Status;
    }

    /**
     * @return the AttendanceInDate
     */
    public Timestamp getAttendanceInDate() {
        return AttendanceInDate;
    }

    /**
     * @param AttendanceInDate the AttendanceInDate to set
     */
    public void setAttendanceInDate(Timestamp AttendanceInDate) {
        this.AttendanceInDate = AttendanceInDate;
    }

    /**
     * @return the AttendanceOutTime
     */
    public Timestamp getAttendanceOutTime() {
        return AttendanceOutTime;
    }

    /**
     * @param AttendanceOutTime the AttendanceOutTime to set
     */
    public void setAttendanceOutTime(Timestamp AttendanceOutTime) {
        this.AttendanceOutTime = AttendanceOutTime;
    }

}
