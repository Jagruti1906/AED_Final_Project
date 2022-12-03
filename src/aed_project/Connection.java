/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aed_project;

import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author admin
 */
public class Connection {
 
    
    static Connection con;
    
    public static Connection getConnection(){
    try{
        
        String server = "localhost";
        String port = "3306";
        String database = "aedfinalproject";
        String userName = "root";
        String password = "Shreyansh!9";
        con = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://" + server + ":" + port + "/" + database, userName, password);
        
        
    }catch(Exception ex){
        System.out.println(""+ex);
    }
            return con;
    }
}
