/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medical_Department;

import java.util.ArrayList;

/**
 *
 * @author jagru
 */
public class HospitalAdminDirectory {
    private ArrayList<HospitalAdminClass> hospitalAdminDir;

    public HospitalAdminDirectory(ArrayList<HospitalAdminClass> hospitalAdminDir) {
        this.hospitalAdminDir = hospitalAdminDir;
    }

    public ArrayList<HospitalAdminClass> getHospitalAdminDir() {
        return hospitalAdminDir;
    }
    
}
