/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Police_Department;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class PoliceDirectory {
    private ArrayList<PoliceClass> policeDir;

    public ArrayList<PoliceClass> getPoliceDir() {
        return policeDir;
    }

    public PoliceDirectory(ArrayList<PoliceClass> policeDir) {
        this.policeDir = policeDir;
    }
}
