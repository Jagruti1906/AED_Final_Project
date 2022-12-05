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
            String query1 = "INSERT INTO appointment_details(date,patient_name,doctor_name,patient_state_id,doctor_id,hospital_name,status,description)" + " VALUES(?,?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(appointment.getDate().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(5, appointment.getDoctorID());
            pst.setInt(4, appointment.getPatientStateID());
            pst.setString(3, appointment.getDoctorName());
            pst.setString(2, appointment.getPatientName());
            pst.setString(6, appointment.getHospitalName());
            pst.setString(7, appointment.getStatus());
            pst.setString(8, appointment.getDesc());
            pst.setDate(1, sqlDate);
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        
    }         catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
        public void getappdata() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from appointment_details";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                AppointmentDetailsClass app = new AppointmentDetailsClass(rs.getDate("date"), rs.getString("patient_name"), rs.getString("doctor_name"),rs.getInt("patient_state_id"),rs.getInt("doctor_id"),rs.getString("hospital_name"),rs.getString("status"),rs.getString("description"));
                appointmentDetailsDir.add(app);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
        
    public void updateAppointment(AppointmentDetailsClass appointment,int i) {
        appointmentDetailsDir.set(i,appointment);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update appointment_details" + " set status=? where patient_state_id=? and doctor_name=? and date=?";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(2, appointment.getPatientStateID());
            java.sql.Date sqlDate = new java.sql.Date(appointment.getDate().getTime());
            pst.setString(1, appointment.getStatus());
            pst.setString(3, appointment.getDoctorName());
            pst.setDate(4, sqlDate);
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
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
