/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aed_project;

import Login.LoginDirectory;
import Medical_Department.DoctorClass;
import Medical_Department.DoctorDirectory;
import Resident.RegisterResident;
import UI.Login;
import UI.RegisterDoctor;
import UI_Medical_Department.DoctorMainFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jagru
 */
public class AED_Project {

    /**
     * @param args the command line arguments
     */
    public static DoctorClass doctor;
    
    public static void main(String[] args) {
        // TODO code application logic here
//        DoctorClass doc = new DoctorClass(1,"Physician","C","ABC",12,22222,1234567890,"jhkdsj","jhdsk",new Date());
//        DoctorDirectory.getInstance().createDoctor(doc);
        DoctorDirectory.getInstance().getDoctorData();
        LoginDirectory.getInstance().getUsers();
//        System.out.println(LoginDirectory.getInstance().getLoginDir().get(0).getStateID());
        Login login = new Login();
        login.show();
//        DatabaseConnectionClass.getInstance().getCon();
//        RegisterDoctor doc = new RegisterDoctor();
//        doc.show();
//        RegisterResident res = new RegisterResident();
//        res.show();
//        DoctorMainFrame docFrame = new DoctorMainFrame();
//        docFrame.show();
    }
}
