/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resident;
import UI.RegisterDoctor;
import aed_project.DatabaseConnectionClass;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jagru
 */
public class ResidentDirectory {
    private static ArrayList<ResidentClass> residentDir = null;
     private static ResidentDirectory mInstance;

    private ResidentDirectory() {
        this.residentDir = new ArrayList();
    }

    public ArrayList<ResidentClass> getResidentDir() {
        return residentDir;
    }
    public void addResident(ResidentClass res){
        residentDir.add(res);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO resident" + " VALUES(?,?,?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(res.getDob().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, res.getStateID());
            pst.setString(2, res.getName());
            pst.setString(3, res.getGender());
            pst.setString(4, res.getEmail());
            pst.setInt(5, res.getPhoneNumber());
            pst.setDate(6, sqlDate);
            pst.setString(7, res.getAddress());
            pst.setInt(8, res.getZip());
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getResidentData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from resident";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                ResidentClass resident = new ResidentClass(rs.getString("role"),rs.getString("address"),rs.getInt("zip"), rs.getString("name"),rs.getInt("stateID"),rs.getInt("phoneNumber"),rs.getString("email"),rs.getString("gender"),rs.getDate("date_of_birth"));
                residentDir.add(resident);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
        public static ResidentDirectory getInstance() {
        if(mInstance == null)
            mInstance = new ResidentDirectory();

        return mInstance;
    }
}
