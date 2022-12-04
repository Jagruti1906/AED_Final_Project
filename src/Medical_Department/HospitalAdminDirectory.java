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
public class HospitalAdminDirectory {
    private static ArrayList<HospitalAdminClass> hospitalAdminDir=null;
    private static HospitalAdminDirectory mInstance;
    
    private HospitalAdminDirectory() {
        this.hospitalAdminDir = new ArrayList();
    }

    public ArrayList<HospitalAdminClass> getHospitalAdminDir() {
        return hospitalAdminDir;
    }
    
    public void addHospitalAdmin(HospitalAdminClass had){
        hospitalAdminDir.add(had);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO hospitalAdmins" + " VALUES(?,?,?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(had.getDob().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, had.getStateID());
            pst.setInt(2, had.getAdminID());
            pst.setString(3, had.getName());
            pst.setInt(4, had.getAge());
            pst.setString(5, had.getGender());
            pst.setString(6, had.getEmail());
            pst.setInt(7, had.getPhoneNumber());
            pst.setDate(8, sqlDate);
            pst.setString(9, had.getHospitalName());
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getHospAdminData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from hospitalAdmins";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                HospitalAdminClass hosp = new HospitalAdminClass(rs.getString("hospital_name"), rs.getInt("admin_id"), rs.getString("name"), rs.getInt("age"),rs.getInt("stateID"),rs.getInt("phoneNumber"),rs.getString("email"),rs.getString("gender"),rs.getDate("date_of_birth"));
                hospitalAdminDir.add(hosp);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
    public static HospitalAdminDirectory getInstance() {
        if(mInstance == null)
            mInstance = new HospitalAdminDirectory();

        return mInstance;
    }
    
}
