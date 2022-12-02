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
public class AmbulanceDirectory {
    private ArrayList<AmbulanceClass> ambulanceDir;

    public AmbulanceDirectory(ArrayList<AmbulanceClass> ambulanceDir) {
        this.ambulanceDir = ambulanceDir;
    }

    public ArrayList<AmbulanceClass> getAmbulanceDir() {
        return ambulanceDir;
    }
}
