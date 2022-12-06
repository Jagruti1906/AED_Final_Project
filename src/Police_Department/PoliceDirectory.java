/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Police_Department;
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
            pst.setString(3, pol.getGender());
            pst.setString(4, pol.getEmail());
            pst.setInt(5, pol.getPhoneNumber());
            pst.setDate(6, sqlDate);
            pst.setString(7,pol.getBranch());
            pst.setString(8,pol.getRole());
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
        
    public static PoliceDirectory getInstance() {
        if(mInstance == null)
            mInstance = new PoliceDirectory();

        return mInstance;
    }
}
