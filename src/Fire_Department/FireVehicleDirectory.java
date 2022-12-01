/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fire_Department;

import java.util.ArrayList;

/**
 *
 * @author jagru
 */
public class FireVehicleDirectory {
    private ArrayList<FireVehicleClass> fireVehicleDir;

    public FireVehicleDirectory(ArrayList<FireVehicleClass> fireVehicleDir) {
        this.fireVehicleDir = fireVehicleDir;
    }

    public ArrayList<FireVehicleClass> getFireVehicleDir() {
        return fireVehicleDir;
    }
}
