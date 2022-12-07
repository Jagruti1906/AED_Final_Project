/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resident;

import User.PersonClass;
import java.util.Date;

/**
 *
 * @author jagru
 */
public class ResidentClass extends PersonClass{
    private String address;
    private int zip;

    public ResidentClass(String role, String address, int zip, String name, int stateID, int phoneNumber, String email, String gender, Date dob) {
        super(role, name, stateID, phoneNumber, email, gender, dob);
        this.address = address;
        this.zip = zip;
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
}
