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
public class FireEmergencyDirectory {
    private ArrayList<FireEmergencyClass> fireEmergencyDir;

    public ArrayList<FireEmergencyClass> getFireEmergencyDir() {
        return fireEmergencyDir;
    }

    public FireEmergencyDirectory(ArrayList<FireEmergencyClass> fireEmergencyDir) {
        this.fireEmergencyDir = fireEmergencyDir;
    }
}
