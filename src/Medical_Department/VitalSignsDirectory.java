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
public class VitalSignsDirectory {
    private ArrayList<VitalSignsClass> vitalSignsDirectory;

    public VitalSignsDirectory(ArrayList<VitalSignsClass> vitalSignsDirectory) {
        this.vitalSignsDirectory = vitalSignsDirectory;
    }

    public ArrayList<VitalSignsClass> getVitalSignsDirectory() {
        return vitalSignsDirectory;
    }
}
