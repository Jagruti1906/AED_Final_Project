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
    private static ArrayList<AppointmentDetailsClass> appointmentDetailsDir;

    public AppointmentDetailsDirectory() {
        this.appointmentDetailsDir = new ArrayList();
    }

    public ArrayList<AppointmentDetailsClass> getAppointmentDetailsDir() {
        return appointmentDetailsDir;
    }
    
    public int getCount(int id, String role) {
        int count = 0;
        if(role == "Doctor") {
            for(int i=0;i<appointmentDetailsDir.size();i++) {
                if(appointmentDetailsDir.get(i).getDoctorID() == id) {
                    count++;
                }
            }
        }
        else {
            for(int i=0;i<appointmentDetailsDir.size();i++) {
                if(appointmentDetailsDir.get(i).getPatientID()== id) {
                    count++;
                }
            }
        }
        return count;
    }
}
