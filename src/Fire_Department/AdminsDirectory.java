/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fire_Department;

import Login.LoginDirectory;
import UI.RegisterFireAdmin;
import User.PersonClass;
import aed_project.DatabaseConnectionClass;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jagru
 */
public class AdminsDirectory {
    private static ArrayList<PersonClass> adminsDir;
    private static AdminsDirectory mInstance;
    
    private AdminsDirectory() {
        this.adminsDir = new ArrayList();
    }

    public ArrayList<PersonClass> getAdminsDir() {
        return adminsDir;
    }
    
    public void addAdmin(PersonClass person){
        adminsDir.add(person);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO admins" + " VALUES(?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(person.getDob().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, person.getStateID());
            pst.setString(2, person.getName());
            pst.setString(3, person.getEmail());
            pst.setString(5, person.getGender());
            pst.setInt(4, person.getPhoneNumber());
            pst.setDate(6, sqlDate);
            pst.setString(7, person.getRole());
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getAdminData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from admins";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                PersonClass person = new PersonClass(rs.getString("role"),rs.getString("name"), rs.getInt("state_id"),rs.getInt("phone_number"),rs.getString("email"), rs.getString("gender"),rs.getDate("date_of_birth"));
                adminsDir.add(person);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
    public void viewFireAdmin(PersonClass person, RegisterFireAdmin fire){
        fire.jTextField1.setText(Integer.toString(person.getStateID()));
        fire.jTextField1.setEnabled(false);
        fire.jTextField2.setText(person.getName());
        fire.jTextField3.setText(person.getEmail());
        fire.jComboBox1.setSelectedItem(person.getGender());
        fire.jTextField4.setText(Integer.toString(person.getPhoneNumber()));
        fire.jDateChooser1.setDate((person.getDob()));
        
        for (int i=0;i<LoginDirectory.getInstance().getLoginDir().size();i++){
            if(LoginDirectory.getInstance().getLoginDir().get(i).getStateID()==person.getStateID()){
                fire.jTextField5.setText(LoginDirectory.getInstance().getLoginDir().get(i).getPassword());
            }
        }
    }
    
    
    public void updateAdmin(PersonClass person,int i) {
        adminsDir.set(i,person);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update admins" + " set name=?,gender=?,email=?,phone_number=?,date_of_birth=? where state_id=?";
            java.sql.Date sqlDate = new java.sql.Date(person.getDob().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, person.getName());
            pst.setString(2, person.getGender());
            pst.setString(3, person.getEmail());
            pst.setInt(4, person.getPhoneNumber());
            pst.setDate(5, sqlDate);
            pst.setInt(6, person.getStateID());
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
    
    public static AdminsDirectory getInstance() {
        if(mInstance == null)
            mInstance = new AdminsDirectory();

        return mInstance;
    }
}
