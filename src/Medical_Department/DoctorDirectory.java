/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medical_Department;

import Login.LoginDirectory;
import UI.RegisterDoctor;
import UI_Medical_Department.DoctorMainFrame;
import aed_project.DatabaseConnectionClass;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class DoctorDirectory {
    private static ArrayList<DoctorClass> doctorDir = null;
    private static DoctorDirectory mInstance;

    private DoctorDirectory() {
        this.doctorDir = new ArrayList();
    }

    public ArrayList<DoctorClass> getDoctorDir() {
        return doctorDir;
    }
    
    public void addDoctor(DoctorClass doc){
        doctorDir.add(doc);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO doctor" + " VALUES(?,?,?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(doc.getDob().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, doc.getStateID());
            pst.setString(2, doc.getName());
            pst.setInt(3, doc.getdoctorId());
            pst.setString(4, doc.getGender());
            pst.setString(5, doc.getEmail());
            pst.setInt(6, doc.getPhoneNumber());
            pst.setDate(7, sqlDate);
            pst.setString(8, doc.getRole());
            pst.setString(9, doc.getHospitalName());
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getDoctorData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from doctor";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                DoctorClass doc = new DoctorClass(rs.getInt("stateID"), rs.getString("name"),rs.getInt("doctorID"),rs.getString("gender"),rs.getString("email"),rs.getInt("phoneNumber"),rs.getDate("date_of_birth"),rs.getString("specialist"),rs.getString("hospital_name"));
                doctorDir.add(doc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
    public static void uniqueId(int num) {
        for(int i=0;i<doctorDir.size();i++) {
            if(doctorDir.get(i).getdoctorId()==num) {
                JOptionPane.showMessageDialog(null, "Doctor ID Already Exists.");
            } 
        }
    }
    
    public void viewDoctor(DoctorClass doc, RegisterDoctor doctor){
        doctor.jTextField1.setText(Integer.toString(doc.getStateID()));
        doctor.jTextField1.setEnabled(false);
        doctor.jTextField2.setText(doc.getName());
        doctor.jTextField4.setText(Integer.toString(doc.getdoctorId()));
        doctor.jTextField4.setEnabled(false);
        doctor.jComboBox1.setSelectedItem(doc.getGender());
        doctor.jTextField6.setText(doc.getEmail());
        doctor.jTextField7.setText(Integer.toString(doc.getPhoneNumber()));
        doctor.jDateChooser1.setDate((doc.getDob()));
        doctor.jComboBox2.setSelectedItem(doc.getRole());
        doctor.jTextField10.setText(doc.getHospitalName());
        doctor.jComboBox2.setEnabled(false);
        
        for (int i=0;i<LoginDirectory.getInstance().getLoginDir().size();i++){
            if(LoginDirectory.getInstance().getLoginDir().get(i).getStateID()==doc.getStateID()){
                doctor.jTextField8.setText(LoginDirectory.getInstance().getLoginDir().get(i).getPassword());
            }
        }
    }
    
    
    public void updateDoctor(DoctorClass dc,int i) {
        doctorDir.set(i,dc);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update doctor" + " set name=?,gender=?,email=?,phoneNumber=?,date_of_birth=?,specialist=?,hospital_name=? where stateID=?";
            java.sql.Date sqlDate = new java.sql.Date(dc.getDob().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(8, dc.getStateID());
            pst.setString(1, dc.getName());
            pst.setString(2, dc.getGender());
            pst.setString(3, dc.getEmail());
            pst.setInt(4, dc.getPhoneNumber());
            pst.setDate(5, sqlDate);
            pst.setString(6, dc.getRole());
            pst.setString(7, dc.getHospitalName());
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
    
    public static DoctorDirectory getInstance() {
        if(mInstance == null)
            mInstance = new DoctorDirectory();

        return mInstance;
    }
    
}
