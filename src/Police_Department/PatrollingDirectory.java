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
public class PatrollingDirectory {
    private ArrayList<PatrollingClass> patrollingDir =null;
    private static PatrollingDirectory mInstance;

    public PatrollingDirectory() {
        this.patrollingDir = new ArrayList();
    }

    public ArrayList<PatrollingClass> getPatrollingDir() {
        return patrollingDir;
    }
    
    
        public void addpatroldata(PatrollingClass pc){
        patrollingDir.add(pc);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO patrol" + " VALUES(?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(pc.getDate().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1,pc.getStateID());
            pst.setString(2, pc.getName());
            pst.setInt(3, pc.getPhoneNumber());
            pst.setDate(4, sqlDate);
            pst.setString(5, pc.getReport());
            pst.setInt(6, pc.getZip());
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
            String str = "Select * from patrol";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                PatrollingClass pc = new PatrollingClass(rs.getString("Name"),rs.getInt("StateId"),rs.getInt("PhoneNumber"),rs.getDate("Date"),rs.getString("Report"), rs.getInt("Zip"));
                patrollingDir.add(pc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
    
        public static PatrollingDirectory getInstance() {
        if(mInstance == null)
            mInstance = new PatrollingDirectory();

        return mInstance;
    }
    
}
