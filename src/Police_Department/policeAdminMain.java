/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Police_Department;
import Medical_Department.AlertsClass;
import Medical_Department.AlertsDirectory;
import Medical_Department.AmbulanceClass;
import Medical_Department.AmbulanceDirectory;
import UI.Login;
import static aed_project.AED_Project.hospAdmin;
import static aed_project.AED_Project.police;
import static aed_project.AED_Project.policeAdmin;
import static aed_project.AED_Project.rc;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author hp
 */
public class policeAdminMain extends javax.swing.JFrame {

    /**
     * Creates new form policeAdminMain
     */
    public policeAdminMain() {
        initComponents();
    }
        public void getPoliceAdmin(PoliceClass polad) {
        policeAdmin=polad;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jButton1.setText("Police List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Register Police");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cases List");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("View Profile");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("Completed Cases");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setText("Alerts");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton6)
                                .addComponent(jButton4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(12, 12, 12)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String[] columnNames = {"ID","Name","Phone Number","Email", "Gender","Branch"};
        int count= PoliceDirectory.getInstance().getComp("Police Officer");
        String[][] rows = new String[count][6];
        check=2;
        int j=0;
        for(int i=0;i<PoliceDirectory.getInstance().getPoliceDir().size();i++) {
             if(PoliceDirectory.getInstance().getPoliceDir().get(i).getRole().equals("Police Officer")){
                rows[j][1] = PoliceDirectory.getInstance().getPoliceDir().get(i).getName();
                int pn = PoliceDirectory.getInstance().getPoliceDir().get(i).getPhoneNumber();
                rows[j][2] =Integer.toString(pn) ;
                int id = PoliceDirectory.getInstance().getPoliceDir().get(i).getStateID();
                rows[j][0] =Integer.toString(id) ;
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                rows[j][3] = PoliceDirectory.getInstance().getPoliceDir().get(i).getEmail();
                rows[j][4] = PoliceDirectory.getInstance().getPoliceDir().get(i).getGender();
                rows[j][5] = PoliceDirectory.getInstance().getPoliceDir().get(i).getBranch();
                j++;
            }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        jTable1.setModel(model);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.hide();
        Login log = new Login();
        log.show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.hide();
        PoliceOfficerRegister par = new PoliceOfficerRegister();
        par.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.hide();
        PoliceAdminRegister pol = new PoliceAdminRegister();
        pol.getRole("Police Admin");
        PoliceDirectory.getInstance().viewpoliceAdminData(policeAdmin, pol);
        pol.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String[] columnNames = {"CaseID","Name","Complaint","Incident date","Incident Address", "Incident Time","Status"};
        int count=0;
        for(int i=0;i<ComplaintDirectory.getInstance().getComplaintDir().size();i++) {
            if(!ComplaintDirectory.getInstance().getComplaintDir().get(i).getStatus().equals("Resolved")) {
                count++;
            }
        }
        check=1;
        String[][] rows = new String[count][7];
        int j=0;
        for(int i=0;i<ComplaintDirectory.getInstance().getComplaintDir().size();i++) {
             if(!ComplaintDirectory.getInstance().getComplaintDir().get(i).getStatus().equals("Resolved")){
                int case_id = ComplaintDirectory.getInstance().getComplaintDir().get(i).getCaseID();
                rows[j][0] = Integer.toString(case_id);
                rows[j][1] = ComplaintDirectory.getInstance().getComplaintDir().get(i).getName();
                rows[j][2] = ComplaintDirectory.getInstance().getComplaintDir().get(i).getComplaintType();
                rows[j][4] = ComplaintDirectory.getInstance().getComplaintDir().get(i).getIncidentPlace();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String s = formatter.format(ComplaintDirectory.getInstance().getComplaintDir().get(i).getIncidentDate());
                rows[j][3] = s;
                rows[j][5] = ComplaintDirectory.getInstance().getComplaintDir().get(i).getIncidentTime();
                rows[j][6] = ComplaintDirectory.getInstance().getComplaintDir().get(i).getStatus();
                j++;
            }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        jTable1.setModel(model);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String status[] = {"In Progress","Resolved"};
        JComboBox cb = new JComboBox(status);
        int input;

        if(check!=0) {
            if(check==1) {
                input = JOptionPane.showConfirmDialog(this, cb, "Update Status", JOptionPane.DEFAULT_OPTION);
                try{
                    String s = model.getValueAt(index, 0).toString();
                    int id = Integer.parseInt(s);

                    for(int i=0;i<ComplaintDirectory.getInstance().getComplaintDir().size();i++) {
                        if(ComplaintDirectory.getInstance().getComplaintDir().get(i).getCaseID()== id) {
                            ComplaintClass com = new ComplaintClass(id,
                                    ComplaintDirectory.getInstance().getComplaintDir().get(i).getName(),
                                    ComplaintDirectory.getInstance().getComplaintDir().get(i).getStateID(), 
                                    ComplaintDirectory.getInstance().getComplaintDir().get(i).getPhoneNumber(),
                                    ComplaintDirectory.getInstance().getComplaintDir().get(i).getIncidentPlace(),
                                    ComplaintDirectory.getInstance().getComplaintDir().get(i).getZip(), 
                                    ComplaintDirectory.getInstance().getComplaintDir().get(i).getIncidentDate(), 
                                    ComplaintDirectory.getInstance().getComplaintDir().get(i).getComplaintType(), 
                                    ComplaintDirectory.getInstance().getComplaintDir().get(i).getIncidentTime(),
                                    (String)cb.getSelectedItem());
                            ComplaintDirectory.getInstance().updateComplaint(com, i);
                            break;
                        }
                    }
                    model.setValueAt((String)cb.getSelectedItem(), index, 6);
                } catch(Exception e) {
                    System.out.println(e);
                }
            }
            else if(check==2) {
                this.hide();
                AssignDuty ad = new AssignDuty();
                String s = model.getValueAt(index, 0).toString();
                int id = Integer.parseInt(s);
                for(int i=0;i<PoliceDirectory.getInstance().getPoliceDir().size();i++) {
                    if(PoliceDirectory.getInstance().getPoliceDir().get(i).getStateID()==id) {
                        ad.jTextField1.setText(s);
                        ad.jTextField1.setEnabled(false);
                        ad.jTextField2.setText(model.getValueAt(index, 1).toString());
                        ad.jTextField2.setEnabled(false);
                    }
                }
                ad.show();
            }
            else {
                String statusAlerts[] = {"In progress","Situation Under Control"};
                cb = new JComboBox(statusAlerts);
                input = JOptionPane.showConfirmDialog(this, cb, "Update Status", JOptionPane.DEFAULT_OPTION);
                try{
                    String desc = model.getValueAt(index, 4).toString();
                    String name = model.getValueAt(index, 1).toString();
                    String address = model.getValueAt(index, 2).toString();
                    String zip = model.getValueAt(index, 3).toString();
                    int zip_code = Integer.parseInt(zip);
                    String stateID = model.getValueAt(index, 0).toString();
                    int id = Integer.parseInt(stateID);
                    AlertsClass alert = new AlertsClass(id, name, address, zip_code, "Police", desc, (String)cb.getSelectedItem());
                    for(int i=0;i<AlertsDirectory.getInstance().getAlertsDir().size();i++) {
                        if(AlertsDirectory.getInstance().getAlertsDir().get(i).getStateID()==id 
                                && AlertsDirectory.getInstance().getAlertsDir().get(i).getDept().equals("Police") 
                                && AlertsDirectory.getInstance().getAlertsDir().get(i).getDesc().equals(desc)) {
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
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String[] columnNames = {"CaseID","Name","Complaint","Incident date","Incident Address", "Incident Time","Status"};
        int count=0;
        for(int i=0;i<ComplaintDirectory.getInstance().getComplaintDir().size();i++) {
            if(ComplaintDirectory.getInstance().getComplaintDir().get(i).getStatus().equals("Resolved")) {
                count++;
            }
        }
        check=1;
        String[][] rows = new String[count][7];
        int j=0;
        for(int i=0;i<ComplaintDirectory.getInstance().getComplaintDir().size();i++) {
             if(ComplaintDirectory.getInstance().getComplaintDir().get(i).getStatus().equals("Resolved")){
                int case_id = ComplaintDirectory.getInstance().getComplaintDir().get(i).getCaseID();
                rows[j][0] = Integer.toString(case_id);
                rows[j][1] = ComplaintDirectory.getInstance().getComplaintDir().get(i).getName();
                rows[j][2] = ComplaintDirectory.getInstance().getComplaintDir().get(i).getComplaintType();
                rows[j][4] = ComplaintDirectory.getInstance().getComplaintDir().get(i).getIncidentPlace();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String s = formatter.format(ComplaintDirectory.getInstance().getComplaintDir().get(i).getIncidentDate());
                rows[j][3] = s;
                rows[j][5] = ComplaintDirectory.getInstance().getComplaintDir().get(i).getIncidentTime();
                rows[j][6] = ComplaintDirectory.getInstance().getComplaintDir().get(i).getStatus();
                j++;
            }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        jTable1.setModel(model);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String[] columnNames = {"ID", "Name", "Address","Zip","Reason","Status"};
        int count=0;
        for(int i=0;i<AlertsDirectory.getInstance().getAlertsDir().size();i++) {
            if(AlertsDirectory.getInstance().getAlertsDir().get(i).getDept().equals("Police")) {
                count++;
            }
        }
        check=3;
        String[][] rows = new String[count][6];
        int j=0;
        for(int i=0;i<AlertsDirectory.getInstance().getAlertsDir().size();i++) {
            if(AlertsDirectory.getInstance().getAlertsDir().get(i).getDept().equals("Police")) {
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
        jTable1.setModel(model);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(policeAdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(policeAdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(policeAdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(policeAdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new policeAdminMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
