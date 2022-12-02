/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medical_Department;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class DoctorDirectory {
    private ArrayList<DoctorClass> doctorDir;

    public DoctorDirectory(ArrayList<DoctorClass> doctorDir) {
        this.doctorDir = doctorDir;
    }

    public ArrayList<DoctorClass> getDoctorDir() {
        return doctorDir;
    }
    
}
