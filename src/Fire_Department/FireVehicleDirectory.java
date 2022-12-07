/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fire_Department;

import aed_project.DatabaseConnectionClass;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author jagru
 */
public class FireVehicleDirectory {
    private ArrayList<FireVehicleClass> fireVehicleDir;
    private static FireVehicleDirectory mInstance;

    private FireVehicleDirectory() {
        this.fireVehicleDir = new ArrayList();
    }

    public ArrayList<FireVehicleClass> getFireVehicleDir() {
        return fireVehicleDir;
    }
    
    public void addVehicle(FireVehicleClass vehicle){
        fireVehicleDir.add(vehicle);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO fire_vehicle(type,vehicle_number,status)" + " VALUES(?,?,?)";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, vehicle.getVehicleType());
            pst.setInt(2, vehicle.getVehicleNumber());
            pst.setString(3, vehicle.getStatus());
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getVehicle() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from fire_vehicle";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                FireVehicleClass vehicle = new FireVehicleClass(rs.getString("type"), rs.getInt("vehicle_number"),rs.getString("status"));
                fireVehicleDir.add(vehicle);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
    public void updateVehicle(FireVehicleClass fire,int i) {
        fireVehicleDir.set(i,fire);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update fire_vehicle" + " set status=? where vehicle_number=?";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, fire.getStatus());
            pst.setInt(2, fire.getVehicleNumber());
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
    
    public static FireVehicleDirectory getInstance() {
        if(mInstance == null)
            mInstance = new FireVehicleDirectory();

        return mInstance;
    }
}
