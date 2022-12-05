/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medical_Department;

/**
 *
 * @author hp
 */
public class AlertsClass {
    int stateID;
    String name;
    String address;
    int zip;
    String dept;
    String Desc;
    String status;

    public AlertsClass(int stateID, String name, String address, int zip,String dept,String Desc, String status) {
        this.stateID = stateID;
        this.name = name;
        this.address = address;
        this.zip = zip;
        this.dept= dept;
        this.Desc = Desc;
        this.status = status;
        
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getStateID() {
        return stateID;
    }

    public void setStateID(int stateID) {
        this.stateID = stateID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
