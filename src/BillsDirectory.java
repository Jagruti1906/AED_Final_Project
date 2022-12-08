
import aed_project.DatabaseConnectionClass;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jagru
 */
public class BillsDirectory {
    private static ArrayList<BillsClass> billsDir;
    private static BillsDirectory mInstance;
    
    private BillsDirectory() {
        this.billsDir = new ArrayList();
    }

    public ArrayList<BillsClass> getBillsDir() {
        return billsDir;
    }
    
    public void addBill(BillsClass bill){
        billsDir.add(bill);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO bills" + " VALUES(?,?,?,?,?,?,?,?,?,?)";
            java.sql.Date start = new java.sql.Date(bill.getStartDate().getTime());
            java.sql.Date end = new java.sql.Date(bill.getEndDate().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, bill.getBillID());
            pst.setInt(2, bill.getStateID());
            pst.setString(3, bill.getName());
            pst.setString(4, bill.getAddress());
            pst.setString(5, bill.getType());
            pst.setFloat(6, bill.getUnits());
            pst.setFloat(7, bill.getConsumption());
            pst.setFloat(8, bill.getTotal());
            pst.setDate(9, start);
            pst.setDate(10, end);
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
            String str = "Select * from bills";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                BillsClass bill = new BillsClass(rs.getInt("billId"),rs.getInt("stateID"), rs.getString("name"),rs.getString("address"),rs.getString("type"),rs.getFloat("units"),rs.getFloat("comsumption"),rs.getFloat("total"),rs.getDate("startDate"),rs.getDate("endDate"));
                billsDir.add(bill);
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
    
    
    public void updateBill(BillsClass bill,int i) {
        billsDir.set(i,bill);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update doctor" + " set consumption=?,total=?,startDate=?,endDate=? where billId=?";
            java.sql.Date start = new java.sql.Date(bill.getStartDate().getTime());
            java.sql.Date end = new java.sql.Date(bill.getEndDate().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setFloat(1, bill.getConsumption());
            pst.setFloat(2, bill.getTotal());
            pst.setDate(3, start);
            pst.setDate(4, end);
            pst.setInt(5, bill.getBillID());
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
    
    public static BillsDirectory getInstance() {
        if(mInstance == null)
            mInstance = new BillsDirectory();

        return mInstance;
    }
    
}
