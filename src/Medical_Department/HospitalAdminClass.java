/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medical_Department;

import User.PersonClass;
import java.util.Date;

/**
 *
 * @author jagru
 */
public class HospitalAdminClass extends PersonClass{
    private String hospitalName;
    private int adminID;

    public HospitalAdminClass(String role, String hospitalName, int adminID, String name, int stateID, String phoneNumber, String email, String gender, Date dob) {
        super(role, name, stateID, phoneNumber, email, gender, dob);
        this.hospitalName = hospitalName;
        this.adminID = adminID;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }
}
