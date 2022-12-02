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
public class PatientDirectory {
    private ArrayList<PatientClass>patientDir;

    public PatientDirectory(ArrayList<PatientClass> patientDir) {
        this.patientDir = patientDir;
    }

    public ArrayList<PatientClass> getPatientDir() {
        return patientDir;
    }
    
}
