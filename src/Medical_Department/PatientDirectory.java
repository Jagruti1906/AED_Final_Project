/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medical_Department;

import aed_project.DatabaseConnectionClass;
import UI.RegisterDoctor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class PatientDirectory {
    private static ArrayList<PatientClass>patientDir = null;
    private static PatientDirectory mInstance;
    
        private PatientDirectory() {
        this.patientDir = new ArrayList();
    }
    
    public void addPatient(PatientClass pat){
        patientDir.add(pat);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO doctor" + " VALUES(?,?,?,?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(pat.getDob().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, pat.getStateID());
            pst.setString(2, pat.getName());
            pst.setInt(4, pat.getdoctorId());
            pst.setString(5, pat.getGender());
            pst.setString(6, pat.getEmail());
            pst.setInt(7, pat.getPhoneNumber());
            pst.setDate(8, sqlDate);
            pst.setString(9, pat.getSpecialisation());
            pst.setString(10, pat.getHospitalName());
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterDoctor.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    
    }

    public ArrayList<PatientClass> getPatientDir() {
        return patientDir;
    }
    public static PatientDirectory getInstance() {
        if(mInstance == null)
            mInstance = new PatientDirectory();
        return mInstance;
        }
}




