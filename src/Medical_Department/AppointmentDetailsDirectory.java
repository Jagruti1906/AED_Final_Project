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
public class AppointmentDetailsDirectory {
    private ArrayList<AppointmentDetailsClass> appointmentDetailsDir;

    public AppointmentDetailsDirectory(ArrayList<AppointmentDetailsClass> appointmentDetailsDir) {
        this.appointmentDetailsDir = appointmentDetailsDir;
    }

    public ArrayList<AppointmentDetailsClass> getAppointmentDetailsDir() {
        return appointmentDetailsDir;
    }
}
