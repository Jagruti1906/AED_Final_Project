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
public class PatientClass extends PersonClass {
    private int patientId;
    private String role;

    public PatientClass(int patientId, String role, String name, int age, int stateID, int phoneNumber, String email, String gender, Date dob) {
        super(name, age, stateID, phoneNumber, email, gender, dob);
        this.patientId = patientId;
        this.role = role;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
}
