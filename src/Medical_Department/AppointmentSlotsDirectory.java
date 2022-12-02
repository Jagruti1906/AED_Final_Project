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
public class AppointmentSlotsDirectory {
    private ArrayList<AppointmentSlotsClass> appointmentSlotsDir;

    public AppointmentSlotsDirectory(ArrayList<AppointmentSlotsClass> appointmentSlotsDir) {
        this.appointmentSlotsDir = appointmentSlotsDir;
    }

    public ArrayList<AppointmentSlotsClass> getAppointmentSlotsDir() {
        return appointmentSlotsDir;
    }
    
}
