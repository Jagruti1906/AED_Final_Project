/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School;

/**
 *
 * @author admin
 */
public class SchoolClass {
    private int schoolId;
    private String schoolName;
    private String schoolType;
    private String schoolComm;

    public SchoolClass(int schoolId, String schoolName, String schoolType, String schoolComm) {
        this.schoolId = schoolId;
        this.schoolName = schoolName;
        this.schoolType = schoolType;
        this.schoolComm = schoolComm;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public String getSchoolComm() {
        return schoolComm;
    }

    public void setSchoolComm(String schoolComm) {
        this.schoolComm = schoolComm;
    }
    
}
