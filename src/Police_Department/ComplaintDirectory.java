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
            String query1 = "INSERT INTO complaints(CaseID,Stateid,Name,`Phone Number`,Incident_place, Zip,Incident_Date,Complaint_type,Incident_time,Status)" + " VALUES(?,?,?,?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(cc.getIncidentDate().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1,cc.getCaseID());
            pst.setInt(2, cc.getStateID());
            pst.setString(3, cc.getName());
            pst.setInt(4, cc.getPhoneNumber());
            pst.setString(5, cc.getIncidentPlace());
            pst.setInt(6, cc.getZip());
            pst.setDate(7, sqlDate);
            pst.setString(8, cc.getComplaintType());
            pst.setString(9, cc.getIncidentTime());
            pst.setString(10, cc.getStatus());
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
        
        public void getComplaintData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from complaints";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                ComplaintClass cc = new ComplaintClass(rs.getInt("CaseID"),rs.getString("Name"), rs.getInt("Stateid"),rs.getInt("Phone Number"),rs.getString("Incident_place"),rs.getInt("Zip"),rs.getDate("Incident_Date"),rs.getString("Complaint_type"),rs.getString("Incident_time"),rs.getString("Status"));
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
        
        public void updateComplaint(ComplaintClass com,int i) {
        complaintDir.set(i,com);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update complaints" + " set status=? where CaseID=?";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, com.getStatus());
            pst.setInt(2, com.getCaseID());
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
        

        public static ComplaintDirectory getInstance() {
        if(mInstance == null)
            mInstance = new ComplaintDirectory();

        return mInstance;
    }

}
