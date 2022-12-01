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
    private int age;
    private int stateID;
    private int phoneNumber;
    private String email;
    private String gender;
    private Date dob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public PersonClass(String name, int age, int stateID, int phoneNumber, String email, String gender, Date dob) {
        this.name = name;
        this.age = age;
        this.stateID = stateID;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.dob = dob;
    }
}
