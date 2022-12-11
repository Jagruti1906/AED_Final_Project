/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Police_Department;

import java.util.Date;

/**
 *
 * @author hp
 */
public class PatrollingClass {
    private String name;
    private int stateID;
    private int phoneNumber;
    private Date date;
    private String report;
    private String status;
    private int zip;

    public PatrollingClass(String name, int stateID, int phoneNumber, Date date, String report, int zip, String status) {
        this.name = name;
        this.stateID = stateID;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.report = report;
        this.zip = zip;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStateID() {
        return stateID;
    }

    public void setStateID(int stateID) {
        this.stateID = stateID;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }
    
    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
