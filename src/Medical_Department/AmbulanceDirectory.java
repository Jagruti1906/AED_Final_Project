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
public class AmbulanceDirectory {
    private static ArrayList<AmbulanceClass> ambulanceDir;
    private static AmbulanceDirectory mInstance;

    private AmbulanceDirectory() {
        this.ambulanceDir = new ArrayList();
    }

    public ArrayList<AmbulanceClass> getAmbulanceDir() {
        return ambulanceDir;
    }
    
    public void addAmbulance(AmbulanceClass ambulance){
        ambulanceDir.add(ambulance);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO ambulances(type,ambulance_number,status,hospital_name)" + " VALUES(?,?,?,?)";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, ambulance.getType());
            pst.setInt(2, ambulance.getAmbulanceNumber());
            pst.setString(3, ambulance.getStatus());
            pst.setString(4, ambulance.getHospName());
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getAmbulance() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from ambulances";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                AmbulanceClass ambulance = new AmbulanceClass(rs.getString("type"), rs.getInt("ambulance_number"),rs.getString("status"),rs.getString("hospital_name"));
                ambulanceDir.add(ambulance);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
    public void updateAmbulance(AmbulanceClass amb,int i) {
        ambulanceDir.set(i,amb);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update ambulances" + " set status=? where hospital_name=? and ambulance_number=?";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, amb.getStatus());
            pst.setString(2, amb.getHospName());
            pst.setInt(3, amb.getAmbulanceNumber());
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
    
    public static AmbulanceDirectory getInstance() {
        if(mInstance == null)
            mInstance = new AmbulanceDirectory();

        return mInstance;
    }
}
