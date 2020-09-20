/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sams.model;

import java.sql.Date;

/**
 *
 * @author personal
 */
public class Student {

    private int Id;
    private String FullName;
    private String NameWithInitials;
    private String Nic;
    private Date DateOfBirth;
    private String Gender;
    private String Address;
    private String ContactMobile;
    private String ContactEmail;
    private String ContactHome;
    private String Remark_1;
    private String Remark_2;
    private int status;

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
     * @return the FullName
     */
    public String getFullName() {
        return FullName;
    }

    /**
     * @param FullName the FullName to set
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * @return the NameWithInitials
     */
    public String getNameWithInitials() {
        return NameWithInitials;
    }

    /**
     * @param NameWithInitials the NameWithInitials to set
     */
    public void setNameWithInitials(String NameWithInitials) {
        this.NameWithInitials = NameWithInitials;
    }

    /**
     * @return the Nic
     */
    public String getNic() {
        return Nic;
    }

    /**
     * @param Nic the Nic to set
     */
    public void setNic(String Nic) {
        this.Nic = Nic;
    }

    /**
     * @return the DateOfBirth
     */
    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    /**
     * @param DateOfBirth the DateOfBirth to set
     */
    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the ContactMobile
     */
    public String getContactMobile() {
        return ContactMobile;
    }

    /**
     * @param ContactMobile the ContactMobile to set
     */
    public void setContactMobile(String ContactMobile) {
        this.ContactMobile = ContactMobile;
    }

    /**
     * @return the ContactEmail
     */
    public String getContactEmail() {
        return ContactEmail;
    }

    /**
     * @param ContactEmail the ContactEmail to set
     */
    public void setContactEmail(String ContactEmail) {
        this.ContactEmail = ContactEmail;
    }

    /**
     * @return the ContactHome
     */
    public String getContactHome() {
        return ContactHome;
    }

    /**
     * @param ContactHome the ContactHome to set
     */
    public void setContactHome(String ContactHome) {
        this.ContactHome = ContactHome;
    }

    /**
     * @return the Remark_1
     */
    public String getRemark_1() {
        return Remark_1;
    }

    /**
     * @param Remark_1 the Remark_1 to set
     */
    public void setRemark_1(String Remark_1) {
        this.Remark_1 = Remark_1;
    }

    /**
     * @return the Remark_2
     */
    public String getRemark_2() {
        return Remark_2;
    }

    /**
     * @param Remark_2 the Remark_2 to set
     */
    public void setRemark_2(String Remark_2) {
        this.Remark_2 = Remark_2;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }
    

}
