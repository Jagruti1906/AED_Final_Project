/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medical_Department;

import aed_project.DatabaseConnectionClass;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jagru
 */
public class AppointmentSlotsDirectory {
    private static ArrayList<AppointmentSlotsClass> appointmentSlotsDir = null;
     private static AppointmentSlotsDirectory mInstance;

    private AppointmentSlotsDirectory() {
        this.appointmentSlotsDir = new ArrayList();
    }

    public ArrayList<AppointmentSlotsClass> getAppointmentSlotsDir() {
        return appointmentSlotsDir;
    }
    public void addslots(AppointmentSlotsClass appsc){
        appointmentSlotsDir.add(appsc);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO appointment_slot (date,time,status)" + " VALUES(?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(appsc.getDate().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setDate(1, sqlDate);
            pst.setString(2, appsc.getSlotTime());
            pst.setString(3, appsc.getStatus());
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
        public static AppointmentSlotsDirectory getInstance() {
        if(mInstance == null)
            mInstance = new AppointmentSlotsDirectory();

        return mInstance;
    }
    
}
