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
    private static ArrayList<PatientClass>patientDir = null;
    private static PatientDirectory mInstance;
    
        private PatientDirectory() {
        this.patientDir = new ArrayList();
    }
    
    public void addPatient(PatientClass pat){
        patientDir.add(pat);
    }

    public ArrayList<PatientClass> getPatientDir() {
        return patientDir;
    }
    public static PatientDirectory getInstance() {
        if(mInstance == null)
            mInstance = new PatientDirectory();
        return mInstance;
        }
}




