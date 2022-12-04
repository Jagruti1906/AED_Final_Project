/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medical_Department;

import aed_project.DatabaseConnectionClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jagru
 */
public class AppointmentDetailsDirectory {
    private static ArrayList<AppointmentDetailsClass> appointmentDetailsDir;
    private static AppointmentDetailsDirectory mInstance;

    private AppointmentDetailsDirectory() {
        this.appointmentDetailsDir = new ArrayList();
    }

    public ArrayList<AppointmentDetailsClass> getAppointmentDetailsDir() {
        return appointmentDetailsDir;
    }
    
    public void addAppointment(AppointmentDetailsClass appointment){
        appointmentDetailsDir.add(appointment);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO docappage" + " VALUES(?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(appointment.getDate().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, appointment.getDoctorID());
            pst.setInt(2, appointment.getPatientStateID());
            pst.setString(3, appointment.getDoctorName());
            pst.setString(4, appointment.getPatientName());
            pst.setString(5, appointment.getHospitalName());
            pst.setString(6, appointment.getStatus());
            pst.setString(7, appointment.getDesc());
        
    }         catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
        public void getappdata() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from docappage";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                AppointmentDetailsClass app = new AppointmentDetailsClass(rs.getDate("date"), rs.getString("patientName"), rs.getString("doctorName"),rs.getInt("patientStateID"),rs.getInt("doctorID"),rs.getString("status"),rs.getString("hospitalName"),rs.getString("desc"));
                appointmentDetailsDir.add(app);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
    public static AppointmentDetailsDirectory getInstance() {
        if(mInstance == null)
            mInstance = new AppointmentDetailsDirectory();

        return mInstance;
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
                if(appointmentDetailsDir.get(i).getPatientStateID()== id) {
                    count++;
                }
            }
        }
        return count;
    }
}
