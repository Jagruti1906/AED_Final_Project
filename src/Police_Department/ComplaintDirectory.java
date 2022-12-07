/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Police_Department;

import Medical_Department.DoctorClass;
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
public class ComplaintDirectory {
     private static ArrayList<ComplaintClass> complaintDir= null;
      private static ComplaintDirectory mInstance;
     

    public ComplaintDirectory() {
        this.complaintDir = new ArrayList();
    }

    public ArrayList<ComplaintClass> getComplaintDir() {
        return complaintDir;
    }
        public void addComplaint(ComplaintClass cc){
        complaintDir.add(cc);
                Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO complaints" + " VALUES(?,?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(cc.getIncidentDate().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, cc.getStateID());
            pst.setString(2, cc.getName());
            pst.setInt(3, cc.getPhoneNumber());
            pst.setDate(6, sqlDate);
            pst.setString(4, cc.getIncidentPlace());
            pst.setInt(5, cc.getZip());
            pst.setString(7, cc.getComplaintType());
            pst.setString(8,cc.getIncidentTime());   
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
        }
        public void getComplaintData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from complaint";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                ComplaintClass cc = new ComplaintClass(rs.getString("Name"), rs.getInt("Stateid"),rs.getInt("Phone Number"),rs.getString("Incident_place"),rs.getInt("Zip"),rs.getDate("Incident_Date"),rs.getString("Compalint_type"),rs.getString("Incident_time"),rs.getString("Status"));
                complaintDir.add(cc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
        public int getComp(int id){
            int count =0;
            for(int i=0;i<complaintDir.size();i++) {
                if(complaintDir.get(i).getStateID()== id) {
                    count++;
                }
            }
            return count;
        }
        

        public static ComplaintDirectory getInstance() {
        if(mInstance == null)
            mInstance = new ComplaintDirectory();

        return mInstance;
    }

}
