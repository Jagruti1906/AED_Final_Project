/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Police_Department;

import User.PersonClass;
import java.util.Date;

/**
 *
 * @author hp
 */
public class PoliceClass extends PersonClass {
    private String branch;

    public PoliceClass(String role, String branch, String name, int stateID, String phoneNumber, String email, String gender, Date dob) {
        super(role, name, stateID, phoneNumber, email, gender, dob);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    
}
