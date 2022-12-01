/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fire_Department;

import User.PersonClass;
import java.util.Date;

/**
 *
 * @author jagru
 */
public class FireDepartmentAdmin extends PersonClass{
    private String role;

    public FireDepartmentAdmin(String role, String name, int age, int stateID, int phoneNumber, String email, String gender, Date dob) {
        super(name, age, stateID, phoneNumber, email, gender, dob);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
}
