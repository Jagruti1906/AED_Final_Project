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

    public ComplaintClass(int caseID,String name, int stateID, String phoneNumber, String incidentPlace,int zip, Date incidentDate, String complaintType, String incidentTime, String status) {
        this.name = name;
        this.stateID = stateID;
        this.phoneNumber = phoneNumber;
        this.incidentPlace = incidentPlace;
        this.zip = zip;
        this.incidentDate = incidentDate;
        this.complaintType = complaintType;
        this.incidentTime = incidentTime;
        this.status = status;
        this.caseID = caseID;
        
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
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
    private String phoneNumber;
    private String incidentPlace;
    private Date incidentDate;
    private String complaintType;
    private String incidentTime;
    private String status;
    private int caseID;

    public int getCaseID() {
        return caseID;
    }

    public void setCaseID(int caseID) {
        this.caseID = caseID;
    }
    private int zip;
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    
}
