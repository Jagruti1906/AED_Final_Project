/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI_Medical_Department;

import Medical_Department.AppointmentDetailsDirectory;
import Medical_Department.HospitalDirectory;
import Resident.ResidentClass;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import static aed_project.AED_Project.rc;

/**
 *
 * @author hp
 */
public class PatientMainFrame extends javax.swing.JFrame {

    /**
     * Creates new form PatientMainFrame
     */
    public PatientMainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Book Appointment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("View Appointment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Back");

        jLabel2.setText("Patient Name");

        jButton5.setText("View History");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jButton1)
                            .addComponent(jButton4)
                            .addComponent(jButton2))
                        .addGap(138, 138, 138)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(26, 26, 26)
                        .addComponent(jButton2)
                        .addGap(25, 25, 25)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
        AppointmentBookingMain abm = new AppointmentBookingMain();
        for(int i=0;i<HospitalDirectory.getInstance().getHospitaldir().size();i++){
            abm.jComboBox1.addItem(HospitalDirectory.getInstance().getHospitaldir().get(i).getName());
        }
        abm.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String[] columnNames = {"Doctor Name","Hospital Name", "Date Of Encounter", "Purpose","Status"};
        int count= AppointmentDetailsDirectory.getInstance().getCount(rc.getStateID(),"Patient");
        String[][] rows = new String[count][5];
        int j=0;
        for(int i=0;i<AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().size();i++) {
            if(AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getPatientStateID() ==(rc.getStateID()) && (AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getStatus().equals("Approved") || AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getStatus().equals("Pending"))) {
                rows[j][0] = AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getDoctorName();
                rows[j][1] = AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getHospitalName();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String s = formatter.format(AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getDate());
                rows[j][2] = s;
                rows[j][3] = AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getDesc();
                rows[j][4] = AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getStatus();
                j++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        jTable1.setModel(model);                                              
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String[] columnNames = {"Doctor Name","Hospital Name", "Date Of Encounter", "Purpose","Status"};
        int count= AppointmentDetailsDirectory.getInstance().getCount(rc.getStateID(),"Patient");
        String[][] rows = new String[count][5];
        int j=0;
        for(int i=0;i<AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().size();i++) {
            if(AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getPatientStateID() ==(rc.getStateID()) && (AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getStatus().equals("Completed"))) {
                rows[j][0] = AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getDoctorName();
                rows[j][1] = AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getHospitalName();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String s = formatter.format(AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getDate());
                rows[j][2] = s;
                rows[j][3] = AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getDesc();
                rows[j][4] = AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getStatus();
                j++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        jTable1.setModel(model);  
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(PatientMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
