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
public class AppointmentSlotsClass {
    private Date date;
    private String slotTime;
    private String status;
    private int stateID;



    public AppointmentSlotsClass(Date date, String slotTime, String status,int stateID) {
        this.date = date;
        this.slotTime = slotTime;
        this.status = status;
        this.stateID = stateID;
        
    }
        public int getStateID() {
        return stateID;
    }

    public void setStateID(int stateID) {
        this.stateID = stateID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSlotTime() {
        return slotTime;
    }

    public void setSlotTime(String slotTime) {
        this.slotTime = slotTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
