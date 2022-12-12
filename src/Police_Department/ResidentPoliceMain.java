/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Police_Department;
import Medical_Department.AppointmentDetailsDirectory;
import UI.ResidentPage;
import static aed_project.AED_Project.rc;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class ResidentPoliceMain extends javax.swing.JFrame {

    /**
     * Creates new form ResidentPoliceMain
     */
    public ResidentPoliceMain() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Report Crime");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(78, 80, 82));
        jLabel1.setText("Main");

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

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("In Progress Complaint");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Resolved Complaints");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Patrolling Chart");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(140, 140, 140))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.hide();
        CrimeReport cr = new CrimeReport();
        cr.jTextField1.setText(rc.getName());
        cr.jTextField1.setEnabled(false);
        cr.jTextField2.setText(Integer.toString(rc.getStateID()));
        cr.jTextField2.setEnabled(false);
        cr.jTextField3.setText(rc.getPhoneNumber());
        cr.jTextField3.setEnabled(false);
        cr.jTextField5.setText(Integer.toString(rc.getZip()));
        cr.jTextField5.setEnabled(false);
        cr.show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String[] columnNames = {"Complaint","Incident date","Incident Address", "Incident Time","Status"};
        int count= ComplaintDirectory.getInstance().getComp(rc.getStateID());
        String[][] rows = new String[count][5];
        int j=0;
        for(int i=0;i<ComplaintDirectory.getInstance().getComplaintDir().size();i++) {
            if(ComplaintDirectory.getInstance().getComplaintDir().get(i).getStateID() ==(rc.getStateID()) && (ComplaintDirectory.getInstance().getComplaintDir().get(i).getStatus().equals("In Progress") || ComplaintDirectory.getInstance().getComplaintDir().get(i).getStatus().equals("Pending"))) {
                rows[j][0] = ComplaintDirectory.getInstance().getComplaintDir().get(i).getComplaintType();
                rows[j][2] = ComplaintDirectory.getInstance().getComplaintDir().get(i).getIncidentPlace();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String s = formatter.format(ComplaintDirectory.getInstance().getComplaintDir().get(i).getIncidentDate());
                rows[j][1] = s;
                rows[j][3] = ComplaintDirectory.getInstance().getComplaintDir().get(i).getIncidentTime();
                rows[j][4] = ComplaintDirectory.getInstance().getComplaintDir().get(i).getStatus();
                j++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        jTable1.setModel(model);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String[] columnNames = {"Complaint","Incident date","Incident Address", "Incident Time","Status"};
        int count=0;
        for(int i=0;i<ComplaintDirectory.getInstance().getComplaintDir().size();i++) {
            if(ComplaintDirectory.getInstance().getComplaintDir().get(i).getStatus().equals("Resolved")) {
                count++;
            }
        }
        String[][] rows = new String[count][5];
        int j=0;
        for(int i=0;i<ComplaintDirectory.getInstance().getComplaintDir().size();i++) {
            if(ComplaintDirectory.getInstance().getComplaintDir().get(i).getStateID() ==(rc.getStateID()) && (ComplaintDirectory.getInstance().getComplaintDir().get(i).getStatus().equals("Resolved"))) {
                rows[j][0] = ComplaintDirectory.getInstance().getComplaintDir().get(i).getComplaintType();
                rows[j][2] = ComplaintDirectory.getInstance().getComplaintDir().get(i).getIncidentPlace();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String s = formatter.format(ComplaintDirectory.getInstance().getComplaintDir().get(i).getIncidentDate());
                rows[j][1] = s;
                rows[j][3] = ComplaintDirectory.getInstance().getComplaintDir().get(i).getIncidentTime();
                rows[j][4] = ComplaintDirectory.getInstance().getComplaintDir().get(i).getStatus();
                j++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        jTable1.setModel(model);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.hide();
        ResidentPage res = new ResidentPage();
        res.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
//        try {
//            String[] columnNames = {"Name","Phone Number","Date", "Report"};
//            int count= PatrollingDirectory.getInstance().getPatrollingDir().size();
//            String[][] rows = new String[count][5];
//            int j=0;
//        for(int i=0;i<PatrollingDirectory.getInstance().getPatrollingDir().size();i++) {
//            rows[j][1] = PatrollingDirectory.getInstance().getPatrollingDir().get(i).getName();
//            int pn = PatrollingDirectory.getInstance().getPatrollingDir().get(i).getPhoneNumber();
//            rows[j][2] =Integer.toString(pn) ;
//            int id = PatrollingDirectory.getInstance().getPatrollingDir().get(i).getStateID();
//            rows[j][0] =Integer.toString(id) ;
//            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//            String s = formatter.format(PatrollingDirectory.getInstance().getPatrollingDir().get(i).getDate());
//            rows[j][3] = s;
//            rows[j][4] = PatrollingDirectory.getInstance().getPatrollingDir().get(i).getReport();
//            j++;
//            
//            DefaultTableModel model = new DefaultTableModel (rows, columnNames);
//            jTable1.setModel(model);
//        }
//        } catch(Exception e) {
//            System.out.println(e);
//        }
            String[] columnNames = {"Name", "Date", "Report", "Status"};
            int count=0;
            for(int i=0;i<PatrollingDirectory.getInstance().getPatrollingDir().size();i++) {
                if(PatrollingDirectory.getInstance().getPatrollingDir().get(i).getZip()==rc.getZip()) {
                    count++;
                }
            }
            System.out.println(count);
            String[][] rows = new String[count][4];
            int j=0;
//            System.out.println(PatrollingDirectory.getInstance().getPatrollingDir().size());
            for(int i=0;i<PatrollingDirectory.getInstance().getPatrollingDir().size();i++) {
                if(PatrollingDirectory.getInstance().getPatrollingDir().get(i).getZip()==rc.getZip()) {
                    System.out.println("heee");
                    rows[j][0] = PatrollingDirectory.getInstance().getPatrollingDir().get(i).getName();
                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                    String s = formatter.format(PatrollingDirectory.getInstance().getPatrollingDir().get(i).getDate());
                    rows[j][1] = s;
                    rows[j][2] = PatrollingDirectory.getInstance().getPatrollingDir().get(i).getReport();
                    rows[j][3] = PatrollingDirectory.getInstance().getPatrollingDir().get(i).getStatus();
                    j++;
                }
            }
            DefaultTableModel model = new DefaultTableModel (rows, columnNames);
            jTable1.setModel(model);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ResidentPoliceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResidentPoliceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResidentPoliceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResidentPoliceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResidentPoliceMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
