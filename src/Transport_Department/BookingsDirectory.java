/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transport_Department;

import aed_project.DatabaseConnectionClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jagru
 */
public class BookingsDirectory {
    private static ArrayList<Bookings> bookingDir;
    private static BookingsDirectory mInstance;

    private BookingsDirectory() {
        this.bookingDir = new ArrayList();
    }

    public ArrayList<Bookings> getBookingDir() {
        return bookingDir;
    }
    
    public void addBooking(Bookings book){
        bookingDir.add(book);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO bookings" + " VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, book.getBookingId());
            pst.setInt(2, book.getStateId());
            pst.setString(3, book.getName());
            pst.setInt(4, book.getSeatCount());
            pst.setFloat(5, book.getTotalCost());
            pst.setInt(6, book.getTransportId());
            pst.setString(7, book.getStatus());
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getBillsData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from bookings";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                Bookings book = new Bookings(rs.getInt("bookingId"),rs.getInt("stateId"), rs.getString("name"),rs.getInt("seatCount"),rs.getFloat("totalCost"),rs.getInt("transportId"),rs.getString("status"));
                bookingDir.add(book);
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
    
    
//    public void updateBill(TransportClass trans,int i) {
//        transportDir.set(i,trans);
//        Statement stmt;
//        try {
//            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
//            String query1 = "Update transport_vehicles" + " set availableSeats=?,status=? where transportId=?";
//            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
//            pst.setInt(1, trans.getAvailableSeats());
//            pst.setString(2, trans.getStatus());
//            pst.setInt(3, trans.getTransportId());
//            int rs = pst.executeUpdate();
//            if(rs>0)
//            {
//                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex);
//            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
//        }
//    }

    
    public static BookingsDirectory getInstance() {
        if(mInstance == null)
            mInstance = new BookingsDirectory();

        return mInstance;
    }
}
