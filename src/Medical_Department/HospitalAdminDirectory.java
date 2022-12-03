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
    private static ArrayList<HospitalAdminClass> hospitalAdminDir=null;
    private static HospitalAdminDirectory mInstance;
    
        private HospitalAdminDirectory() {
        this.hospitalAdminDir = new ArrayList();
    }

    public ArrayList<HospitalAdminClass> getHospitalAdminDir() {
        return hospitalAdminDir;
    }
    public void addHospitalAdmin(HospitalAdminClass had){
        hospitalAdminDir.add(had);
    }
    public static HospitalAdminDirectory getInstance() {
        if(mInstance == null)
            mInstance = new HospitalAdminDirectory();

        return mInstance;
    }
    
}
