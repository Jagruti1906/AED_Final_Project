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
public class ComplaintClass {

    public ComplaintClass(String name, int stateID, int phoneNumber, String incidentPlace, Date incidentDate, String complaintType, String incidentTime) {
        this.name = name;
        this.stateID = stateID;
        this.phoneNumber = phoneNumber;
        this.incidentPlace = incidentPlace;
        this.incidentDate = incidentDate;
        this.complaintType = complaintType;
        this.incidentTime = incidentTime;
    }
    private String name;

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

    public String getIncidentPlace() {
        return incidentPlace;
    }

    public void setIncidentPlace(String incidentPlace) {
        this.incidentPlace = incidentPlace;
    }

    public Date getIncidentDate() {
        return incidentDate;
    }

    public void setIncidentDate(Date incidentDate) {
        this.incidentDate = incidentDate;
    }

    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public String getIncidentTime() {
        return incidentTime;
    }

    public void setIncidentTime(String incidentTime) {
        this.incidentTime = incidentTime;
    }
    private int stateID;
    private int phoneNumber;
    private String incidentPlace;
    private Date incidentDate;
    private String complaintType;
    private String incidentTime;
    
}