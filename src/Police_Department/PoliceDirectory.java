/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Police_Department;
import Login.LoginDirectory;
import aed_project.DatabaseConnectionClass;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class PoliceDirectory {
    private static ArrayList<PoliceClass> policeDir =null;
    private static PoliceDirectory mInstance;

    public ArrayList<PoliceClass> getPoliceDir() {
        return policeDir;
    }

    private PoliceDirectory() {
        this.policeDir = new ArrayList();
    }
        public void addPolice(PoliceClass pol){
        policeDir.add(pol);
                Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO police" + " VALUES(?,?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(pol.getDob().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, pol.getStateID());
            pst.setString(2, pol.getName());
            pst.setString(5, pol.getGender());
            pst.setString(4, pol.getEmail());
            pst.setInt(3, pol.getPhoneNumber());
            pst.setDate(6, sqlDate);
            pst.setString(8,pol.getBranch());
            pst.setString(7,pol.getRole());
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
}
        public void getpoliceData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from police";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                PoliceClass polad = new PoliceClass(rs.getString("Role"),rs.getString("branch"),rs.getString("name"),rs.getInt("stateID"),rs.getInt("phoneNumber"),rs.getString("email"),rs.getString("gender"),rs.getDate("date_of_birth"));
                policeDir.add(polad);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
        public void viewpoliceAdminData(PoliceClass pc, PoliceAdminRegister polAdmin) {
        polAdmin.txtEmail.setText(pc.getEmail());
        polAdmin.txtName.setText(pc.getName());
        polAdmin.txtPhoneNo.setText(Integer.toString(pc.getPhoneNumber()));
        polAdmin.txtSSN.setText(Integer.toString(pc.getStateID()));
        polAdmin.txtSSN.setEnabled(false);
        polAdmin.jDateChooser.setDate((pc.getDob()));
        polAdmin.jComboBox1.setSelectedItem(pc.getGender());
        
        for (int i=0;i<LoginDirectory.getInstance().getLoginDir().size();i++){
            if(LoginDirectory.getInstance().getLoginDir().get(i).getStateID()==pc.getStateID()){
                polAdmin.txtPass.setText(LoginDirectory.getInstance().getLoginDir().get(i).getPassword());
            }
        }
    }
        
       public void viewpoliceOfficerData(PoliceClass pc, PoliceOfficerRegister polAdmin) {
        polAdmin.txtEmail.setText(pc.getEmail());
        polAdmin.txtName.setText(pc.getName());
        polAdmin.txtPhoneNo.setText(Integer.toString(pc.getPhoneNumber()));
        polAdmin.txtSSN.setText(Integer.toString(pc.getStateID()));
        polAdmin.txtSSN.setEnabled(false);
        polAdmin.jDateChooser.setDate((pc.getDob()));
        polAdmin.jComboBox1.setSelectedItem(pc.getGender());
        polAdmin.jComboBox2.setSelectedItem(pc.getBranch());
        polAdmin.jComboBox2.setEnabled(false);
        
        for (int i=0;i<LoginDirectory.getInstance().getLoginDir().size();i++){
            if(LoginDirectory.getInstance().getLoginDir().get(i).getStateID()==pc.getStateID()){
                polAdmin.txtPass.setText(LoginDirectory.getInstance().getLoginDir().get(i).getPassword());
            }
        }
            }
        
    public void updatePolice(PoliceClass pol,int i) {
        policeDir.set(i,pol);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update police" + " set name=?,gender=?,email=?,phoneNumber=?,date_of_birth=?,branch=? where stateID=?";
            java.sql.Date sqlDate = new java.sql.Date(pol.getDob().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, pol.getName());
            pst.setString(2, pol.getGender());
            pst.setString(3, pol.getEmail());
            pst.setInt(4, pol.getPhoneNumber());
            pst.setDate(5, sqlDate);
            pst.setString(6, pol.getBranch());
            pst.setInt(7, pol.getStateID());
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
            public int getComp(String r){
            int count =0;
            for(int i=0;i<policeDir.size();i++) {
                if(policeDir.get(i).getRole().equals(r)) {
                    count++;
                }
            }
            return count;
        }
        
        
    public static PoliceDirectory getInstance() {
        if(mInstance == null)
            mInstance = new PoliceDirectory();

        return mInstance;
    }
}
