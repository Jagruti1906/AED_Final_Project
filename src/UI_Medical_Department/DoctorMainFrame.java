/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI_Medical_Department;

import Medical_Department.AppointmentDetailsDirectory;
import Medical_Department.DoctorClass;
import static aed_project.AED_Project.doctor;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jagru
 */
public class DoctorMainFrame extends javax.swing.JFrame {

    /**
     * Creates new form DoctorMainFrame
     */
    public DoctorMainFrame() {
        initComponents();
//        docName.setText(doctor.getName());
    }

    
    public void getDoc(DoctorClass doc) {
        System.out.println(doc.getName());
        docName.setText(doc.getName());
        doctor = doc;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appointmentList = new javax.swing.JButton();
        viewProfile = new javax.swing.JButton();
        addAvailability = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        docName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appListTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        appointmentList.setText("Appointment List");
        appointmentList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentListActionPerformed(evt);
            }
        });

        viewProfile.setText("View Profile");

        addAvailability.setText("Add Availability");
        addAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAvailabilityActionPerformed(evt);
            }
        });

        logout.setText("Logout");

        docName.setText("Doctor Name");

        appListTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(appListTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(docName, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout)
                    .addComponent(addAvailability)
                    .addComponent(viewProfile)
                    .addComponent(appointmentList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(docName)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(appointmentList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewProfile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addAvailability)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logout))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void appointmentListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentListActionPerformed
        // TODO add your handling code here:
        String[] columnNames = {"ID","Name", "Hospital Name", "Community", "City"};
//        AppointmentDetailsDirectory.getInstance().getCount(, "Doctor");
//        String[][] rows = new String[appointmentDir.getCount(WIDTH, "Doctor")][5];
//        int i=0;
//        for (int j=0;j<) {
//            int id = set.getValue().getDoctorID();
//            rows[i][0] = Integer.toString(id);
//            rows[i][1] = set.getValue().getName();
//            rows[i][2] = set.getValue().getHospitalName();
//            rows[i][3] = set.getValue().getCommunityName();
//            rows[i][4] = set.getValue().getCity();
//            i++;
//        }
//        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
//        view.jTable1.setModel(model);
    }//GEN-LAST:event_appointmentListActionPerformed

    private void addAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAvailabilityActionPerformed
        // TODO add your handling code here:
<<<<<<< HEAD
=======
        this.hide();
        AppointmentSlot as = new AppointmentSlot();
        as.show();
>>>>>>> 71b801b57377786806a3972af3c2d48993730084
    }//GEN-LAST:event_addAvailabilityActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAvailability;
    private javax.swing.JTable appListTable;
    private javax.swing.JButton appointmentList;
    private javax.swing.JLabel docName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton viewProfile;
    // End of variables declaration//GEN-END:variables
}
