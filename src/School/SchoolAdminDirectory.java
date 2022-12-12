/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School;

import Login.LoginDirectory;
import aed_project.AED_Project;
import aed_project.DatabaseConnectionClass;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jagru
 */
public class SchoolAdminDirectory {
    private static ArrayList<SchoolAdminClass> schoolAdminDir =null;
    private static SchoolAdminDirectory mInstance;
    
    private SchoolAdminDirectory() {
        this.schoolAdminDir = new ArrayList();
    }

    public ArrayList<SchoolAdminClass> getSchoolAdminDir() {
        return schoolAdminDir;
    }
    
    public void addSchoolAdmin(SchoolAdminClass had){
        schoolAdminDir.add(had);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO schooladmins" + " VALUES(?,?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(had.getDob().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, had.getStateID());
            pst.setString(2, had.getSchoolName());
            pst.setString(3, had.getName());
            pst.setString(4, had.getGender());
            pst.setString(5, had.getEmail());
            pst.setString(6, had.getPhoneNumber());
            pst.setDate(7, sqlDate);
            pst.setString(8, had.getRole());
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getSchoolAdminData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from schooladmins";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                SchoolAdminClass hosp = new SchoolAdminClass(rs.getString("role"), rs.getString("name"),rs.getInt("stateID"),rs.getString("phoneNumber"),rs.getString("email"),rs.getString("gender"),rs.getDate("date_of_birth"), rs.getString("school_name"));
                schoolAdminDir.add(hosp);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
    public void viewSchoolAdminData(SchoolAdminClass hosp, SchoolAdminRegister hosAdmin) {
        hosAdmin.jComboBox2.setVisible(false);
        hosAdmin.jLabel1.setVisible(false);
        hosAdmin.jTextField3.setText(hosp.getEmail());
        hosAdmin.jTextField2.setText(hosp.getName());
        hosAdmin.jTextField4.setText(hosp.getPhoneNumber());
        hosAdmin.jTextField1.setText(Integer.toString(hosp.getStateID()));
        hosAdmin.jTextField1.setEnabled(false);
        hosAdmin.jDateChooser1.setDate((hosp.getDob()));
        hosAdmin.jComboBox1.setSelectedItem(hosp.getGender());
        
        for (int i=0;i<LoginDirectory.getInstance().getLoginDir().size();i++){
            if(LoginDirectory.getInstance().getLoginDir().get(i).getStateID()==hosp.getStateID()){
                hosAdmin.jTextField5.setText(LoginDirectory.getInstance().getLoginDir().get(i).getPassword());
            }
        }
    }
    
    public void updateSchoolAdminData(SchoolAdminClass had,int i) {
        schoolAdminDir.set(i,had);
        schoolAdminDir.get(i).getName();
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update schooladmins" + " set name=?,gender=?,email=?,phoneNumber=?,date_of_birth=? where stateID=?";
            java.sql.Date sqlDate = new java.sql.Date(had.getDob().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, had.getName());
            pst.setString(2, had.getGender());
            pst.setString(3, had.getEmail());
            pst.setString(4, had.getPhoneNumber());
            pst.setDate(5, sqlDate);
            pst.setInt(6, had.getStateID());
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
    
    public static SchoolAdminDirectory getInstance() {
        if(mInstance == null)
            mInstance = new SchoolAdminDirectory();

        return mInstance;
    }
}
