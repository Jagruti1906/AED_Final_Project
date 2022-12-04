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
 * @author hp
 */
public class HospitalDirectory {
    private static ArrayList<HospitalClass>hospitalDir;
    private static HospitalDirectory mInstance;

    private HospitalDirectory() {
        this.hospitalDir = new ArrayList();
    }

    public ArrayList<HospitalClass> getHospitaldir() {
        return hospitalDir;
    }
    
    public void addHospital(HospitalClass hosp){
        hospitalDir.add(hosp);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO hospitals(name,address,zip)" + " VALUES(?,?,?)";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, hosp.getName());
            pst.setString(2, hosp.getAddress());
            pst.setInt(3, hosp.getZip());
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getHospitalData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from hospitals";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                HospitalClass hosp = new HospitalClass(rs.getString("name"), rs.getString("address"),rs.getInt("zip"));
                hospitalDir.add(hosp);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
    public static HospitalDirectory getInstance() {
        if(mInstance == null)
            mInstance = new HospitalDirectory();

        return mInstance;
    }
    
}
