/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Transport;

import Transport_Department.BookingsDirectory;
import Transport_Department.TransportClass;
import Transport_Department.TransportDirectory;
import UI.ResidentPage;
import static aed_project.AED_Project.rc;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hp
 */
public class ResidentTransportMain extends javax.swing.JFrame {

    /**
     * Creates new form ResidentTransportMain
     */
    public ResidentTransportMain() {
        initComponents();
    }
    
    private static int check=0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Source");

        jLabel2.setText("Destination");

        jLabel3.setText("Date");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("View Bookings");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.hide();
        ResidentPage rp = new ResidentPage();
        rp.show();
               
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String[] columnNames = {"TransportID","Date","Departure Time","Arrival Time","Seats","Cost"};
        int count=0;
        check=2;
        try {
            for(int i=0;i<TransportDirectory.getInstance().getTransportDir().size();i++) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date2 = formatter.parse(formatter.format(jDateChooser1.getDate()));
            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(TransportDirectory.getInstance().getTransportDir().get(i).getDate().toString());
            int checkDate = date1.compareTo(date2);
            if(TransportDirectory.getInstance().getTransportDir().get(i).getSource().equals(jTextField1.getText()) 
               && TransportDirectory.getInstance().getTransportDir().get(i).getDestination().equals(jTextField2.getText())
              && checkDate==0) {
               count++;
            }
            }
           String[][] rows = new String[count][6];
       int j=0;
        for(int i=0;i<TransportDirectory.getInstance().getTransportDir().size();i++){
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date2 = formatter.parse(formatter.format(jDateChooser1.getDate()));
           Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(TransportDirectory.getInstance().getTransportDir().get(i).getDate().toString());
            int checkDate = date1.compareTo(date2);
            if(TransportDirectory.getInstance().getTransportDir().get(i).getSource().equals(jTextField1.getText()) 
               && TransportDirectory.getInstance().getTransportDir().get(i).getDestination().equals(jTextField2.getText())
                && checkDate==0) {
                rows[j][0]=Integer.toString(TransportDirectory.getInstance().getTransportDir().get(i).getTransportId());
                String s = formatter.format(TransportDirectory.getInstance().getTransportDir().get(i).getDate());
                rows[j][1] = s;
                rows[j][3]=TransportDirectory.getInstance().getTransportDir().get(i).getArrivalTime();
                rows[j][2]=TransportDirectory.getInstance().getTransportDir().get(i).getDepartTime();
                rows[j][4]=Integer.toString(TransportDirectory.getInstance().getTransportDir().get(i).getAvailableSeats());
                rows[j][5] = Float.toString(TransportDirectory.getInstance().getTransportDir().get(i).getCost());   
                 j++;
           }
        }
                DefaultTableModel model = new DefaultTableModel (rows, columnNames);
                jTable1.setModel(model);
        }
        catch(Exception e) {
            System.out.println(e);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String[] columnNames = {"BookingID","Source","Destination","Date","Departure Time", "Arrival Time","Seats Booked","Total Cost","Status"};
        int count=0;
        check=1;
        for(int i=0;i<BookingsDirectory.getInstance().getBookingDir().size();i++) {
            if(BookingsDirectory.getInstance().getBookingDir().get(i).getStateId()==rc.getStateID() && BookingsDirectory.getInstance().getBookingDir().get(i).getStatus().equals("Booked")) {
                count++;
            }
        }
        String[][] rows = new String[count][9];
        int j=0;
        for(int i=0;i<TransportDirectory.getInstance().getTransportDir().size();i++) {
            for(int k=0;k<BookingsDirectory.getInstance().getBookingDir().size();k++) {
                if(BookingsDirectory.getInstance().getBookingDir().get(k).getStateId()==rc.getStateID() &&
                        BookingsDirectory.getInstance().getBookingDir().get(k).getTransportId()==TransportDirectory.getInstance().getTransportDir().get(i).getTransportId()
                        && BookingsDirectory.getInstance().getBookingDir().get(k).getStatus().equals("Booked")) {
                    int id = BookingsDirectory.getInstance().getBookingDir().get(k).getBookingId();
                    rows[j][0] = Integer.toString(id);
                    rows[j][1] = TransportDirectory.getInstance().getTransportDir().get(i).getSource();
                    rows[j][2] = TransportDirectory.getInstance().getTransportDir().get(i).getDestination();
                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                    String s = formatter.format(TransportDirectory.getInstance().getTransportDir().get(i).getDate());
                    rows[j][3] = s;
                    rows[j][4] = TransportDirectory.getInstance().getTransportDir().get(i).getDepartTime();
                    rows[j][5] = TransportDirectory.getInstance().getTransportDir().get(i).getArrivalTime();
                    rows[j][6]=Integer.toString(BookingsDirectory.getInstance().getBookingDir().get(k).getSeatCount());
                    rows[j][7]=Float.toString(BookingsDirectory.getInstance().getBookingDir().get(k).getTotalCost());
                    rows[j][8] = BookingsDirectory.getInstance().getBookingDir().get(k).getStatus();
                    j++;
                }
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        jTable1.setModel(model);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        if(check==1) {
            String bookingId = model.getValueAt(index, 0).toString();
            int id = Integer.parseInt(bookingId);
            String seats = model.getValueAt(index, 6).toString();
            int bookedSeats = Integer.parseInt(seats);
            int answer = JOptionPane.showConfirmDialog(null, "Cancel Booking", "Booking",JOptionPane.YES_NO_OPTION);
            if(answer == 0) {
                int transId = 0;
                for(int j=0;j<BookingsDirectory.getInstance().getBookingDir().size();j++) {
                    if(BookingsDirectory.getInstance().getBookingDir().get(j).getBookingId()== id) {
                        transId = BookingsDirectory.getInstance().getBookingDir().get(j).getTransportId();
                        BookingsDirectory.getInstance().removeBooking(id, j);
                    }
                }    
                for(int j=0;j<TransportDirectory.getInstance().getTransportDir().size();j++) {
                    if(TransportDirectory.getInstance().getTransportDir().get(j).getTransportId() == transId) {
                        TransportClass trans = new TransportClass(transId, 
                            TransportDirectory.getInstance().getTransportDir().get(j).getType(), 
                            TransportDirectory.getInstance().getTransportDir().get(j).getSource(), 
                            TransportDirectory.getInstance().getTransportDir().get(j).getDestination(), 
                            TransportDirectory.getInstance().getTransportDir().get(j).getTotalSeats(), 
                            TransportDirectory.getInstance().getTransportDir().get(j).getAvailableSeats()+bookedSeats, 
                            TransportDirectory.getInstance().getTransportDir().get(j).getCost(), 
                            TransportDirectory.getInstance().getTransportDir().get(j).getArrivalTime(), 
                            TransportDirectory.getInstance().getTransportDir().get(j).getDepartTime(), 
                            TransportDirectory.getInstance().getTransportDir().get(j).getDate(), 
                            TransportDirectory.getInstance().getTransportDir().get(j).getTransportNumber(), 
                            TransportDirectory.getInstance().getTransportDir().get(j).getStatus());
                        TransportDirectory.getInstance().updateDetails(trans, j);
                    }
                }
            }
        }
        else if(check==2) {
            BookingForm book = new BookingForm();
            book.jTextField1.setText(rc.getName());
            book.jTextField1.setEnabled(false);
            book.jTextField2.setText(Integer.toString(rc.getStateID()));
            book.jTextField2.setEnabled(false);
            String transId = model.getValueAt(index, 0).toString();
            String seat = model.getValueAt(index, 4).toString();
            String cost = model.getValueAt(index, 5).toString();
            int id = Integer.parseInt(transId);
            int total = Integer.parseInt(seat);
            Float c = Float.parseFloat(cost);
            book.getId(id, total, c);
            book.show();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResidentTransportMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResidentTransportMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResidentTransportMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResidentTransportMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResidentTransportMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
