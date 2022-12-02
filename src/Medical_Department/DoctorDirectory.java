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
    private static ArrayList<DoctorClass> doctorDir = null;
    private static DoctorDirectory mInstance;

    private DoctorDirectory() {
        this.doctorDir = new ArrayList();
    }

    public ArrayList<DoctorClass> getDoctorDir() {
        return doctorDir;
    }
    
    public void createDoctor(DoctorClass doc){
        doctorDir.add(doc);
    }
    
    public static DoctorDirectory getInstance() {
        if(mInstance == null)
            mInstance = new DoctorDirectory();

        return mInstance;
    }
    
}
