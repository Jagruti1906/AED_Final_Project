/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transport_Department;

import aed_project.DatabaseConnectionClass;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jagru
 */
public class TransportDirectory {
    private static ArrayList<TransportClass> transportDir;
        private static TransportDirectory mInstance;


    private TransportDirectory() {
        this.transportDir = new ArrayList();
    }

    public ArrayList<TransportClass> getTransportDir() {
        return transportDir;
    }
    
    public void addTransport(TransportClass trans){
        transportDir.add(trans);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO transport_vehicles" + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(trans.getDate().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, trans.getTransportId());
            pst.setString(2, trans.getType());
            pst.setString(3, trans.getSource());
            pst.setString(4, trans.getDestination());
            pst.setInt(5, trans.getTotalSeats());
            pst.setFloat(7, trans.getCost());
            pst.setString(8, trans.getArrivalTime());
            pst.setString(9, trans.getDepartTime());
            pst.setInt(6, trans.getAvailableSeats());
            pst.setDate(10,sqlDate);
            pst.setInt(11,trans.getTransportNumber());
            pst.setString(12, trans.getStatus());
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
    
    public void getTransportDetails() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from transport_vehicles";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                TransportClass trans = new TransportClass(rs.getInt("transportId"),rs.getString("type"), rs.getString("source"),rs.getString("destination"),rs.getInt("totalSeats"),rs.getInt("availableSeats"),rs.getFloat("cost"),rs.getString("arrivalTime"),rs.getString("departTime"), rs.getDate("date"), rs.getInt("transportNumber"),rs.getString("status"));
                transportDir.add(trans);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
//    public void viewDoctor(BillsClass bill, RegisterDoctor doctor){
//        doctor.jTextField1.setText(Integer.toString(doc.getStateID()));
//        doctor.jTextField1.setEnabled(false);
//        doctor.jTextField2.setText(doc.getName());
//        doctor.jTextField4.setText(Integer.toString(doc.getdoctorId()));
//        doctor.jTextField4.setEnabled(false);
//        doctor.jComboBox1.setSelectedItem(doc.getGender());
//        doctor.jTextField6.setText(doc.getEmail());
//        doctor.jTextField7.setText(Integer.toString(doc.getPhoneNumber()));
//        doctor.jDateChooser1.setDate((doc.getDob()));
//        doctor.jComboBox2.setSelectedItem(doc.getRole());
//        doctor.jTextField10.setText(doc.getHospitalName());
//        doctor.jComboBox2.setEnabled(false);
//        
//        for (int i=0;i<LoginDirectory.getInstance().getLoginDir().size();i++){
//            if(LoginDirectory.getInstance().getLoginDir().get(i).getStateID()==doc.getStateID()){
//                doctor.jTextField8.setText(LoginDirectory.getInstance().getLoginDir().get(i).getPassword());
//            }
//        }
//    }
    
    
    public void updateBill(TransportClass trans,int i) {
        transportDir.set(i,trans);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update transport_vehicles" + " set availableSeats=?,status=? where transportId=?";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, trans.getAvailableSeats());
            pst.setString(2, trans.getStatus());
            pst.setInt(3, trans.getTransportId());
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

    
    public static TransportDirectory getInstance() {
        if(mInstance == null)
            mInstance = new TransportDirectory();

        return mInstance;
    }
    
}
