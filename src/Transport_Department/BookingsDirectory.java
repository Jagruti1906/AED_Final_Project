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
    
    public void getBookingsData() {
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
    
    public void removeBooking(int bookingId, int i) {
        bookingDir.remove(i);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Delete from bookings where bookingId=?";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, bookingId);
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Deleted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Deleted");
        }
    }

    
    public static BookingsDirectory getInstance() {
        if(mInstance == null)
            mInstance = new BookingsDirectory();

        return mInstance;
    }
}
