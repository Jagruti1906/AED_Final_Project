/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medical_Department;

import aed_project.DatabaseConnectionClass;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            String query1 = "INSERT INTO appointment_slot (date,time,status,stateID)" + " VALUES(?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(appsc.getDate().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setDate(1, sqlDate);
            pst.setString(2, appsc.getSlotTime());
            pst.setString(3, appsc.getStatus());
            pst.setInt(4,appsc.getStateID());
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
        public void getslotsData() {
            Statement stmt;
            try{
                stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
                String str = "Select * from appointment_slot";
                ResultSet rs = stmt.executeQuery(str);
                while(rs.next()) {
                    AppointmentSlotsClass appsc = new AppointmentSlotsClass(rs.getDate("date"),rs.getString("time"),rs.getString("status"),rs.getInt("stateID"));
                    appointmentSlotsDir.add(appsc);
            }
        
            } 
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
        }

        public void updateSlots(AppointmentSlotsClass slot,int i) {
        appointmentSlotsDir.set(i,slot);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            java.sql.Date sqlDate = new java.sql.Date(slot.getDate().getTime());
            String query1 = "Update appointment_slot" + " set status=? where date=? and time=? and stateID=?";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, slot.getStatus());
            pst.setDate(2, sqlDate);
            pst.setString(3, slot.getSlotTime());
            pst.setInt(4, slot.getStateID());
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
