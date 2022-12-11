/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Education;

/**
 *
 * @author admin
 */

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionClass {
    
    Connection con;
    Statement stm;
    
    ConnectionClass()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","Shreyansh!9");
            stm=con.createStatement();
            
            if(con.isClosed())
            {
                System.out.println("yes");
            }
            else{
                 System.out.println("no");
            }
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String args[])
    {
        new ConnectionClass();
    }
    
    
}
