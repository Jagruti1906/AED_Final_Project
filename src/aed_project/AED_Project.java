/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aed_project;

import Login.LoginDirectory;
import Medical_Department.AmbulanceDirectory;
import Medical_Department.AppointmentSlotsDirectory;
import Medical_Department.DoctorClass;
import Medical_Department.DoctorDirectory;
import Medical_Department.HospitalAdminClass;
import Medical_Department.HospitalAdminDirectory;
import Medical_Department.HospitalDirectory;
import Resident.RegisterResident;
import Resident.ResidentClass;
import UI.Login;
import UI.RegisterDoctor;
import UI.RegisterHospitalAdmin;
import UI_Medical_Department.AppointmentSlot;
import UI_Medical_Department.CreateHospital;
import UI_Medical_Department.DoctorMainFrame;
import UI_Medical_Department.PatientMainFrame;
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
    public static HospitalAdminClass hospAdmin;
    public static ResidentClass rc;
    
    public static void main(String[] args) {
        // TODO code application logic here
//        DoctorClass doc = new DoctorClass(1,"Physician","C","ABC",12,22222,1234567890,"jhkdsj","jhdsk",new Date());
//        DoctorDirectory.getInstance().createDoctor(doc);
        DoctorDirectory.getInstance().getDoctorData();
        LoginDirectory.getInstance().getUsers();
        AppointmentSlotsDirectory.getInstance().getslotsData();
        HospitalAdminDirectory.getInstance().getHospAdminData();
        HospitalDirectory.getInstance().getHospitalData();
        AmbulanceDirectory.getInstance().getAmbulance();
//        System.out.println(LoginDirectory.getInstance().getLoginDir().get(0).getStateID());
//        Login login = new Login();
//        login.show();
        PatientMainFrame pat = new PatientMainFrame();
        pat.show();
//        System.out.println(AmbulanceDirectory.getInstance().getAmbulanceDir().size());
//        AppointmentSlot app = new AppointmentSlot();
//        app.show();
//        System.out.println(HospitalAdminDirectory.getInstance().getHospitalAdminDir().size());
//        CreateHospital hosp = new CreateHospital();
//        hosp.show();
//        try{
//            RegisterHospitalAdmin had = new RegisterHospitalAdmin();
//            had.show();
//        } catch(Exception e) {
//            System.out.println(e);
//        }
//        DatabaseConnectionClass.getInstance().getCon();
//        RegisterDoctor doc = new RegisterDoctor();
//        doc.show();
//        RegisterHospitalAdmin hos = new RegisterHospitalAdmin();
//        hos.show();
//        RegisterResident res = new RegisterResident();
//        res.show();
//        DoctorMainFrame docFrame = new DoctorMainFrame();
//        docFrame.show();
    }
}
