/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medical_Department;

import User.PersonClass;
import java.util.Date;

/**
 *
 * @author hp
 */
public class DoctorClass extends PersonClass {
    private int doctorId;
    private String hospitalName;

    public DoctorClass(int stateID, String name, int doctorId, String gender, String email, String phoneNumber,  Date dob, String specialisation, String hospitalName) {
        super(specialisation, name, stateID, phoneNumber, email, gender, dob);
        this.doctorId = doctorId;
        this.hospitalName = hospitalName;
    }

    public int getdoctorId() {
        return doctorId;
    }

    public void setdoctorId(int DdoctorId) {
        this.doctorId = DdoctorId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}
