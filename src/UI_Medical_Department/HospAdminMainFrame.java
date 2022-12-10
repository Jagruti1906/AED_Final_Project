/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI_Medical_Department;

import Medical_Department.AlertsClass;
import Medical_Department.AlertsDirectory;
import Medical_Department.AmbulanceClass;
import Medical_Department.AmbulanceDirectory;
import Medical_Department.AppointmentDetailsDirectory;
import Medical_Department.DoctorDirectory;
import Medical_Department.HospitalAdminClass;
import Medical_Department.HospitalAdminDirectory;
import UI.AddAmbulanceForm;
import static aed_project.AED_Project.hospAdmin;
import UI.Login;
import UI.RegisterDoctor;
import UI.RegisterHospitalAdmin;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author jagru
 */
public class HospAdminMainFrame extends javax.swing.JFrame {

    /**
     * Creates new form HospAdminMainFrame
     */
    
    private static int check=0;
    
    public HospAdminMainFrame() {
        initComponents();
    }
    
    public void getHospAdmin(HospitalAdminClass hosp) {
        System.out.println(hosp.getName());
        hospAdmin = hosp;
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
        doctorRecord = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        ambulanceList = new javax.swing.JButton();
        addAmbulance = new javax.swing.JButton();
        addDoc = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        appointmentList.setText("Appointment History");
        appointmentList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentListActionPerformed(evt);
            }
        });

        viewProfile.setText("View Profile");
        viewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfileActionPerformed(evt);
            }
        });

        doctorRecord.setText("Doctor Record");
        doctorRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorRecordActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel.setText("Welcome");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        ambulanceList.setText("Ambulance List");
        ambulanceList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambulanceListActionPerformed(evt);
            }
        });

        addAmbulance.setText("Add Ambulance");
        addAmbulance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAmbulanceActionPerformed(evt);
            }
        });

        addDoc.setText("Add Doctor");
        addDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDocActionPerformed(evt);
            }
        });

        jButton1.setText("Alerts");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout)
                    .addComponent(doctorRecord)
                    .addComponent(viewProfile)
                    .addComponent(appointmentList)
                    .addComponent(ambulanceList)
                    .addComponent(addAmbulance)
                    .addComponent(addDoc)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(ambulanceList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(appointmentList)
                        .addGap(18, 18, 18)
                        .addComponent(viewProfile)
                        .addGap(12, 12, 12)
                        .addComponent(doctorRecord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addAmbulance)
                        .addGap(9, 9, 9)
                        .addComponent(addDoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void appointmentListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentListActionPerformed
        // TODO add your handling code here:
        String[] columnNames = {"Patient Name","Doctor Name", "Date Of Encounter", "Purpose","Status"};
        int count=0;
        for(int i=0;i<AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().size();i++) {
            if(AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getHospitalName().equals(hospAdmin.getHospitalName())) {
                count++;
            }
        }
        check=0;
        String[][] rows = new String[count][5];
        int j=0;
        for(int i=0;i<AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().size();i++) {
            if(AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getHospitalName().equals(hospAdmin.getHospitalName())) {
                rows[j][0] = AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getPatientName();
                rows[j][1] = AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getDoctorName();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String s = formatter.format(AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getDate());
                rows[j][2] = s;
                rows[j][3] = AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getDesc();
                rows[j][4] = AppointmentDetailsDirectory.getInstance().getAppointmentDetailsDir().get(i).getStatus();
                j++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        table.setModel(model);    
    }//GEN-LAST:event_appointmentListActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.hide();
        Login login = new Login();
        login.show();
    }//GEN-LAST:event_logoutActionPerformed

    private void doctorRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorRecordActionPerformed
        // TODO add your handling code here:
        String[] columnNames = {"ID","Name", "Gender", "Specialist", "Email ID"};
        int count=0;
        check=0;
        for(int i=0;i<DoctorDirectory.getInstance().getDoctorDir().size();i++) {
            if(DoctorDirectory.getInstance().getDoctorDir().get(i).getHospitalName().equals(hospAdmin.getHospitalName())) {
                count++;
            }
        }
        String[][] rows = new String[count][5];
        int j=0;
        for(int i=0;i<DoctorDirectory.getInstance().getDoctorDir().size();i++) {
            if(DoctorDirectory.getInstance().getDoctorDir().get(i).getHospitalName().equals(hospAdmin.getHospitalName())) {
                int id = DoctorDirectory.getInstance().getDoctorDir().get(i).getdoctorId();
                rows[j][0] = Integer.toString(id);
                rows[j][1] = DoctorDirectory.getInstance().getDoctorDir().get(i).getName();
                rows[j][2] = DoctorDirectory.getInstance().getDoctorDir().get(i).getGender();
                rows[j][3] = DoctorDirectory.getInstance().getDoctorDir().get(i).getRole();
                rows[j][4] = DoctorDirectory.getInstance().getDoctorDir().get(i).getEmail();
                j++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        table.setModel(model);
    }//GEN-LAST:event_doctorRecordActionPerformed

    private void addAmbulanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAmbulanceActionPerformed
        // TODO add your handling code here:
        this.hide();
        AddAmbulanceForm ambulance = new AddAmbulanceForm();
        ambulance.show();
    }//GEN-LAST:event_addAmbulanceActionPerformed

    private void ambulanceListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambulanceListActionPerformed
        // TODO add your handling code here:
        String[] columnNames = {"Ambulance Type", "Ambulance Number", "Status"};
        check=1;
        int count=0;
        for(int i=0;i<AmbulanceDirectory.getInstance().getAmbulanceDir().size();i++) {
            if(AmbulanceDirectory.getInstance().getAmbulanceDir().get(i).getHospName().equals(hospAdmin.getHospitalName())) {
                count++;
            }
        }
        String[][] rows = new String[count][3];
        int j=0;
        for(int i=0;i<AmbulanceDirectory.getInstance().getAmbulanceDir().size();i++) {
            if(AmbulanceDirectory.getInstance().getAmbulanceDir().get(i).getHospName().equals(hospAdmin.getHospitalName())) {
                int number = AmbulanceDirectory.getInstance().getAmbulanceDir().get(i).getAmbulanceNumber();
                rows[j][0] = AmbulanceDirectory.getInstance().getAmbulanceDir().get(i).getType();
                rows[j][1] = Integer.toString(number);
                rows[j][2] = AmbulanceDirectory.getInstance().getAmbulanceDir().get(i).getStatus();
                j++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        table.setModel(model);
    }//GEN-LAST:event_ambulanceListActionPerformed

    private void addDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDocActionPerformed
        // TODO add your handling code here:
        this.hide();
        RegisterDoctor doc = new RegisterDoctor();
        doc.jTextField10.setText(hospAdmin.getHospitalName());
        doc.jTextField10.setEnabled(false);
        doc.getRole("Hospital Admin");
        doc.show();
    }//GEN-LAST:event_addDocActionPerformed

    private void viewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileActionPerformed
        // TODO add your handling code here:
        this.hide();
        RegisterHospitalAdmin hosp = new RegisterHospitalAdmin();
        hosp.getRole("Hospital Admin");
        HospitalAdminDirectory.getInstance().viewHospAdminData(hospAdmin,hosp);
        hosp.show();
    }//GEN-LAST:event_viewProfileActionPerformed
    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        JComboBox cb = null;
        int index = table.getSelectedRow();
        TableModel model = table.getModel();
        int input;
        if(check!=0) {
            if(check==1) {
                String status[] = {"Available","Unavailable"};
                cb = new JComboBox(status);
                input = JOptionPane.showConfirmDialog(this, cb, "Update Status", JOptionPane.DEFAULT_OPTION);
                try{
                    String type = model.getValueAt(index, 0).toString();
                    String no = model.getValueAt(index, 1).toString();
                    int id = Integer.parseInt(no);
                    AmbulanceClass amb = new AmbulanceClass(type, id, (String)cb.getSelectedItem(), hospAdmin.getHospitalName());
                    for(int i=0;i<AmbulanceDirectory.getInstance().getAmbulanceDir().size();i++) {
                        if(AmbulanceDirectory.getInstance().getAmbulanceDir().get(i).getAmbulanceNumber()==id) {
                            AmbulanceDirectory.getInstance().updateAmbulance(amb, i);
                            break;
                        }
                    }
                    model.setValueAt((String)cb.getSelectedItem(), index, 2);
                } catch(Exception e) {
                    System.out.println(e);
                }
            }
            else{
                String status[] = {"Ambulance is on it's way","Emergency is taken care of"};
                cb = new JComboBox(status);
                input = JOptionPane.showConfirmDialog(this, cb, "Update Status", JOptionPane.DEFAULT_OPTION);
                try{
                    String desc = model.getValueAt(index, 4).toString();
                    String name = model.getValueAt(index, 1).toString();
                    String address = model.getValueAt(index, 2).toString();
                    String zip = model.getValueAt(index, 3).toString();
                    int zip_code = Integer.parseInt(zip);
                    String stateID = model.getValueAt(index, 0).toString();
                    int id = Integer.parseInt(stateID);
                    AlertsClass alert = new AlertsClass(id, name, address, zip_code, "Medical", desc, (String)cb.getSelectedItem());
                    for(int i=0;i<AlertsDirectory.getInstance().getAlertsDir().size();i++) {
                        if(AlertsDirectory.getInstance().getAlertsDir().get(i).getStateID()==id 
                                && AlertsDirectory.getInstance().getAlertsDir().get(i).getDept().equals("Medical") 
                                && AlertsDirectory.getInstance().getAlertsDir().get(i).getDesc().equals(desc)) {
                            System.out.println("UI_Medical_Department.HospAdminMainFrame.tableMouseClicked()");
                            AlertsDirectory.getInstance().updateAlert(alert, i);
                            break;
                        }
                    }
                    model.setValueAt((String)cb.getSelectedItem(), index, 5);
                } catch(Exception e) {
                    System.out.println(e);
                }
            }
        }
    }//GEN-LAST:event_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String[] columnNames = {"Patient ID", "Patient Name", "Address","Zip","Reason","Status"};
        check=2;
        int count=0;
        for(int i=0;i<AlertsDirectory.getInstance().getAlertsDir().size();i++) {
            if(AlertsDirectory.getInstance().getAlertsDir().get(i).getDept().equals("Medical")) {
                count++;
            }
        }
        String[][] rows = new String[count][6];
        int j=0;
        for(int i=0;i<AlertsDirectory.getInstance().getAlertsDir().size();i++) {
            if(AlertsDirectory.getInstance().getAlertsDir().get(i).getDept().equals("Medical")) {
                int zip = AlertsDirectory.getInstance().getAlertsDir().get(i).getZip();
                int id = AlertsDirectory.getInstance().getAlertsDir().get(i).getStateID();
                rows[j][0] = Integer.toString(id);
                rows[j][1] = AlertsDirectory.getInstance().getAlertsDir().get(i).getName();
                rows[j][2] = AlertsDirectory.getInstance().getAlertsDir().get(i).getAddress();
                rows[j][3] = Integer.toString(zip);
                rows[j][4] = AlertsDirectory.getInstance().getAlertsDir().get(i).getDesc();
                rows[j][5] = AlertsDirectory.getInstance().getAlertsDir().get(i).getStatus();
                j++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        table.setModel(model);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(HospAdminMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospAdminMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospAdminMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospAdminMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospAdminMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addAmbulance;
    public javax.swing.JButton addDoc;
    public javax.swing.JButton ambulanceList;
    public javax.swing.JButton appointmentList;
    public javax.swing.JButton doctorRecord;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton logout;
    public javax.swing.JTable table;
    public javax.swing.JButton viewProfile;
    // End of variables declaration//GEN-END:variables
}
