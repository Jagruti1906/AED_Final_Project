/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Police_Department;

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
public class DutyDirectory {

     private static ArrayList<DutyClass> dutyDir= null;
      private static DutyDirectory mInstance;
      
        public DutyDirectory() {
        this.dutyDir = new ArrayList();
        }
        
        public ArrayList<DutyClass> getdutyDir() {
        return dutyDir;
    }
        
        public void addDuty(DutyClass dc){
        dutyDir.add(dc);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO duty_assgined" + " VALUES(?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(dc.getDate().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1,dc.getId());
            pst.setInt(2, dc.getStateId());
            pst.setString(3, dc.getName());
            pst.setDate(4, sqlDate);
            pst.setInt(5, dc.getZip());
            int rs = pst.executeUpdate();
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
        }
        
        
        public void getDutyData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from duty_assigned";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                DutyClass dc = new DutyClass(rs.getInt("Id"),rs.getString("Name"), rs.getInt("Stateid"),rs.getInt("Zip"),rs.getDate("Date"));
                dutyDir.add(dc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
        
        
        public static DutyDirectory getInstance() {
        if(mInstance == null)
            mInstance = new DutyDirectory();

        return mInstance;
    }
        
}      
    

