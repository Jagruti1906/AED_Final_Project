/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medical_Department;

import Login.LoginClass;
import Login.LoginDirectory;
import UI.RegisterHospitalAdmin;
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
public class HospitalAdminDirectory {
    private static ArrayList<HospitalAdminClass> hospitalAdminDir=null;
    private static HospitalAdminDirectory mInstance;
    
    private HospitalAdminDirectory() {
        this.hospitalAdminDir = new ArrayList();
    }

    public ArrayList<HospitalAdminClass> getHospitalAdminDir() {
        return hospitalAdminDir;
    }
    
    public void addHospitalAdmin(HospitalAdminClass had){
        hospitalAdminDir.add(had);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO hospitalAdmins" + " VALUES(?,?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(had.getDob().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, had.getStateID());
            pst.setInt(2, had.getAdminID());
            pst.setString(3, had.getName());
            pst.setString(4, had.getGender());
            pst.setString(5, had.getEmail());
            pst.setInt(6, had.getPhoneNumber());
            pst.setDate(7, sqlDate);
            pst.setString(8, had.getHospitalName());
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getHospAdminData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from hospitalAdmins";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                HospitalAdminClass hosp = new HospitalAdminClass(rs.getString("hospital_name"), rs.getInt("admin_id"), rs.getString("name"),rs.getInt("stateID"),rs.getInt("phoneNumber"),rs.getString("email"),rs.getString("gender"),rs.getDate("date_of_birth"));
                hospitalAdminDir.add(hosp);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
    public void viewHospAdminData(HospitalAdminClass hosp, RegisterHospitalAdmin hosAdmin) {
        hosAdmin.txtHospName.setText(hosp.getHospitalName());
        hosAdmin.txtEmail.setText(hosp.getEmail());
        hosAdmin.txtAdmin.setText(Integer.toString(hosp.getAdminID()));
        hosAdmin.txtAdmin.setEnabled(false);
        hosAdmin.txtName.setText(hosp.getName());
        hosAdmin.txtPhoneNo.setText(Integer.toString(hosp.getPhoneNumber()));
        hosAdmin.txtSSN.setText(Integer.toString(hosp.getStateID()));
        hosAdmin.txtSSN.setEnabled(false);
        hosAdmin.jDateChooser.setDate((hosp.getDob()));
        hosAdmin.jComboBox1.setSelectedItem(hosp.getGender());
        
        for (int i=0;i<LoginDirectory.getInstance().getLoginDir().size();i++){
            if(LoginDirectory.getInstance().getLoginDir().get(i).getStateID()==hosp.getStateID()){
                hosAdmin.txtPass.setText(LoginDirectory.getInstance().getLoginDir().get(i).getPassword());
            }
        }
    }
    
    public void updateHospAdminData(HospitalAdminClass had,int i) {
        hospitalAdminDir.set(i,had);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update hospitaladmins" + " set name=?,gender=?,email=?,phoneNumber=?,date_of_birth=?,hospital_name=? where stateID=?";
            java.sql.Date sqlDate = new java.sql.Date(had.getDob().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, had.getName());
            pst.setString(2, had.getGender());
            pst.setString(3, had.getEmail());
            pst.setInt(4, had.getPhoneNumber());
            pst.setDate(5, sqlDate);
            pst.setString(6, had.getHospitalName());
            pst.setInt(7, had.getStateID());
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
    
    public static HospitalAdminDirectory getInstance() {
        if(mInstance == null)
            mInstance = new HospitalAdminDirectory();

        return mInstance;
    }
    
}
