
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.util.Date;

/**
 *
 * @author jagru
 */
public class PersonClass {
    private String name;
    private int stateID;
    private String phoneNumber;
    private String email;
    private String gender;
    private Date dob;
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public PersonClass(String role, String name, int stateID, String phoneNumber, String email, String gender, Date dob) {
        this.name = name;
        this.stateID = stateID;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.dob = dob;
        this.role = role;
    }
}
