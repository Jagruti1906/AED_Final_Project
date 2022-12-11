/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School;

import aed_project.DatabaseConnectionClass;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class AdmissionDirectory {
    private static ArrayList<AdmissionsClass> admissionDir;
    private static AdmissionDirectory mInstance;

    private AdmissionDirectory() {
        this.admissionDir = new ArrayList();
    }

    public ArrayList<AdmissionsClass> getAdmissionDir() {
        return admissionDir;
    }
    
    public void addAdmission(AdmissionsClass admission){
        admissionDir.add(admission);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO admissions" + " VALUES(?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(admission.getDate().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, admission.getAdmissionId());
            pst.setString(2, admission.getName());
            pst.setString(3, admission.getEmail());
            pst.setString(4, admission.getPhoneNumber());
            pst.setString(5, admission.getSchoolName());
            pst.setString(7, admission.getStatus());
            pst.setDate(6, sqlDate);
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
    
        public void getadmissiondata() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from admissions";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                AdmissionsClass app = new AdmissionsClass(rs.getInt("admission_id"),rs.getString("name"), rs.getString("phone_number"), rs.getString("email"),rs.getString("school_name"),rs.getDate("date"),rs.getString("status"));
                admissionDir.add(app);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
        
    public void updateAppointment(AdmissionsClass appointment,int i) {
        admissionDir.set(i,appointment);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update admissions" + " set status=? where admission_id=?";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(2, appointment.getAdmissionId());
            pst.setString(1, appointment.getStatus());
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
    
    public static AdmissionDirectory getInstance() {
        if(mInstance == null)
            mInstance = new AdmissionDirectory();

        return mInstance;
    }
}
