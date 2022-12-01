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

    public PatrollingClass(String name, int stateID, int phoneNumber, Date date, String report) {
        this.name = name;
        this.stateID = stateID;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.report = report;
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
}
