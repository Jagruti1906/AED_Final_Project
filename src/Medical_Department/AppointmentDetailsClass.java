/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medical_Department;

import java.util.Date;

/**
 *
 * @author jagru
 */
public class AppointmentDetailsClass {
    private Date date;
    private String patientName;
    private String doctorName;
    private int patientID;
    private int doctorID;
    private String status;
    private String hospitalName;

    public AppointmentDetailsClass(Date date, String patientName, String doctorName, int patientID, int doctorID, String hospitalName, String status) {
        this.date = date;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.hospitalName = hospitalName;
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}