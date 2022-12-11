/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School;

import aed_project.DatabaseConnectionClass;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class SchoolDirectory {
    private static ArrayList<SchoolClass>schoolDir;
    private static SchoolDirectory mInstance;

    private SchoolDirectory() {
        this.schoolDir = new ArrayList();
    }

    public static ArrayList<SchoolClass> getSchoolDir() {
        return schoolDir;
    }
    
    public void addSchool(SchoolClass sc){
        schoolDir.add(sc);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO schools" + " VALUES(?,?,?,?)";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, sc.getSchoolId());
            pst.setString(2, sc.getSchoolName());
            pst.setString(3, sc.getSchoolType());
            pst.setString(4, sc.getSchoolComm());
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getSchoolData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from schools";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                SchoolClass hosp = new SchoolClass(rs.getInt("id"), rs.getString("name"),rs.getString("type"),rs.getString("community_name"));
                schoolDir.add(hosp);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
    public static SchoolDirectory getInstance() {
        if(mInstance == null)
            mInstance = new SchoolDirectory();

        return mInstance;
    }
}
