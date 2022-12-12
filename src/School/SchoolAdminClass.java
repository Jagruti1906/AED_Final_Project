/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School;

import User.PersonClass;
import java.util.Date;

/**
 *
 * @author jagru
 */
public class SchoolAdminClass extends PersonClass{
    private String schoolName;

    public SchoolAdminClass(String role, String name, int stateID, String phoneNumber, String email, String gender, Date dob, String schoolName) {
        super(role,name,stateID,phoneNumber,email,gender,dob);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
