/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Resident.ResidentDirectory;
import aed_project.DatabaseConnectionClass;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jagru
 */
public class NewConnDirectory {
    private static ArrayList<NewConnectionClass> connDir;
    private static NewConnDirectory mInstance;

    private NewConnDirectory() {
        this.connDir = new ArrayList();
    }

    public ArrayList<NewConnectionClass> getConnDir() {
        return connDir;
    }
    
    public void addConnRequest(NewConnectionClass conn){
        connDir.add(conn);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO new_connection" + " VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, conn.getConnID());
            pst.setInt(2, conn.getStateID());
            pst.setString(3, conn.getName());
            pst.setString(4, conn.getType());
            pst.setString(5, conn.getAddressPath());
            pst.setString(6, conn.getIdPath());
            pst.setString(7, conn.getStatus());
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getConnRequest() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from new_connection";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                NewConnectionClass conn = new NewConnectionClass(rs.getInt("connId"),rs.getInt("stateID"), rs.getString("name"),rs.getString("type"),rs.getString("addressPath"),rs.getString("idPath"),rs.getString("status"));
                connDir.add(conn);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
//    public void viewRequest(BillsClass bill, RegisterDoctor doctor){
//        doctor.jTextField1.setText(Integer.toString(doc.getStateID()));
//        doctor.jTextField1.setEnabled(false);
//        doctor.jTextField2.setText(doc.getName());
//        doctor.jTextField4.setText(Integer.toString(doc.getdoctorId()));
//        doctor.jTextField4.setEnabled(false);
//        doctor.jComboBox1.setSelectedItem(doc.getGender());
//        doctor.jTextField6.setText(doc.getEmail());
//        doctor.jTextField7.setText(Integer.toString(doc.getPhoneNumber()));
//        doctor.jDateChooser1.setDate((doc.getDob()));
//        doctor.jComboBox2.setSelectedItem(doc.getRole());
//        doctor.jTextField10.setText(doc.getHospitalName());
//        doctor.jComboBox2.setEnabled(false);
//        
//        for (int i=0;i<LoginDirectory.getInstance().getLoginDir().size();i++){
//            if(LoginDirectory.getInstance().getLoginDir().get(i).getStateID()==doc.getStateID()){
//                doctor.jTextField8.setText(LoginDirectory.getInstance().getLoginDir().get(i).getPassword());
//            }
//        }
//    }
    
    
    public void updateRequest(NewConnectionClass conn,int i) {
        connDir.set(i,conn);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update new_connection" + " set status=? where connId=?";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, conn.getStatus());
            pst.setFloat(2, conn.getConnID());
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
    
    public static NewConnDirectory getInstance() {
        if(mInstance == null)
            mInstance = new NewConnDirectory();

        return mInstance;
    }
}
