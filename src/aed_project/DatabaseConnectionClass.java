/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aed_project;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author jagru
 */
public class DatabaseConnectionClass {
    private static Connection con = null;
    private static DatabaseConnectionClass mInstance;
    
    private DatabaseConnectionClass() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aed_project","root","Jagruti#1906");
            if(con!=null) {
                System.out.println("Connection Successful");
            }
        }
        catch(Exception e) {
            System.out.println("Connection Unsuccessful");
        }
    }
    
    public Connection getCon() {
        return con;
    }
    
    public static DatabaseConnectionClass getInstance() {
        if(mInstance == null)
            mInstance = new DatabaseConnectionClass();

        return mInstance;
    }
}
