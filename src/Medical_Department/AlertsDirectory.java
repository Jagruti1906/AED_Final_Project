/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medical_Department;
import java.sql.Statement;
import aed_project.DatabaseConnectionClass;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class AlertsDirectory {
     private static ArrayList<AlertsClass> alertsDir = null;
     private static AlertsDirectory mInstance;
     
         private AlertsDirectory() {
        this.alertsDir = new ArrayList();
    }
        public ArrayList<AlertsClass> getAlertsDir() {
        return alertsDir;
    }
        
    public void addalerts(AlertsClass alt){
        alertsDir.add(alt);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO alerts(state_id,name,address,zip,department,Description,status)" + " VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, alt.getStateID());
            pst.setString(2, alt.getName());
            pst.setString(3, alt.getAddress());
            pst.setInt(4, alt.getZip());
            pst.setString(5, alt.getDept());
            pst.setString(6, alt.getDesc());
            pst.setString(7, alt.getStatus());
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
    
        public void getalertsdata() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from alerts";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                AlertsClass ac = new AlertsClass(rs.getInt("state_id"),rs.getString("name"), rs.getString("address"),rs.getInt("zip"),rs.getString("department"),rs.getString("Description"),rs.getString("status"));
                alertsDir.add(ac);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
        
    public void updateAlert(AlertsClass alert, int i) {
        System.out.println(alert.getStatus());
        alertsDir.set(i,alert);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update alerts" + " set status=? where state_id=? and department=? and Description=?";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, alert.getStatus());
            pst.setString(4, alert.getDesc());
            pst.setString(3, alert.getDept());
            pst.setInt(2, alert.getStateID());
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
        
    public static AlertsDirectory getInstance() {
        if(mInstance == null)
            mInstance = new AlertsDirectory();

        return mInstance;
    }
}
