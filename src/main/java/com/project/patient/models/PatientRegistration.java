package com.project.patient.models;

public class PatientRegistration {

    private String fname;
    private String lname;
    private String gender;
    private String emailID;
    private String phNumber;
    private String username;
    private String password;

    public PatientRegistration(){}

    public PatientRegistration(String fname, String lname, String gender, String emailID, String phNumber, String username, String password) {
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.emailID = emailID;
        this.phNumber = phNumber;
        this.username = username;
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
