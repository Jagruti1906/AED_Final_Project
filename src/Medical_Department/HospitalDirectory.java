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
public class HospitalDirectory {
    private ArrayList<HospitalClass>hospitaldir;

    public HospitalDirectory(ArrayList<HospitalClass> hospitaldir) {
        this.hospitaldir = hospitaldir;
    }

    public ArrayList<HospitalClass> getHospitaldir() {
        return hospitaldir;
    }
    
}
