/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medical_Department;

import UI.RegisterDoctor;
import aed_project.DatabaseConnectionClass;
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
public class DoctorDirectory {
    private static ArrayList<DoctorClass> doctorDir = null;
    private static DoctorDirectory mInstance;

    private DoctorDirectory() {
        this.doctorDir = new ArrayList();
    }

    public ArrayList<DoctorClass> getDoctorDir() {
        return doctorDir;
    }
    
    public void addDoctor(DoctorClass doc){
        doctorDir.add(doc);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO doctor" + " VALUES(?,?,?,?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(doc.getDob().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, doc.getStateID());
            pst.setString(2, doc.getName());
            pst.setInt(3, doc.getAge());
            pst.setInt(4, doc.getdoctorId());
            pst.setString(5, doc.getGender());
            pst.setString(6, doc.getEmail());
            pst.setInt(7, doc.getPhoneNumber());
            pst.setDate(8, sqlDate);
            pst.setString(9, doc.getSpecialisation());
            pst.setString(10, doc.getHospitalName());
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public static DoctorDirectory getInstance() {
        if(mInstance == null)
            mInstance = new DoctorDirectory();

        return mInstance;
    }
    
}
