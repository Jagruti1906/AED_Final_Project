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
    private String specialisation;
    private String hospitalName;

    public DoctorClass(int stateID, String name, int age, int doctorId, String gender, String email, int phoneNumber,  Date dob, String specialisation, String hospitalName) {
        super(name, age, stateID, phoneNumber, email, gender, dob);
        this.doctorId = doctorId;
        this.specialisation = specialisation;
        this.hospitalName = hospitalName;
    }

    public int getdoctorId() {
        return doctorId;
    }

    public void setdoctorId(int DdoctorId) {
        this.doctorId = DdoctorId;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}
