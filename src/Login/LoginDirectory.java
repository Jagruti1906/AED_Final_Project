/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import java.util.ArrayList;
import aed_project.DatabaseConnectionClass;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author jagru
 */
public class LoginDirectory {
    private static ArrayList<LoginClass> loginDir;
    private static LoginDirectory mInstance;
    
    private LoginDirectory() {
        this.loginDir = new ArrayList();
    }

    public ArrayList<LoginClass> getLoginDir() {
        return loginDir;
    }
    
    public void addUser(LoginClass user){
        loginDir.add(user);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO user_credentials" + " VALUES(?,?,?)";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, user.getStateID());
            pst.setString(2, user.getPassword());
            pst.setString(3, user.getStatus());
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public static LoginDirectory getInstance() {
        if(mInstance == null)
            mInstance = new LoginDirectory();
        return mInstance;
    }
}
