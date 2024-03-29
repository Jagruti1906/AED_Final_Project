/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Utilities;

import Fire_Department.AdminsDirectory;
import UI.Login;
import User.PersonClass;
import static aed_project.AED_Project.verifier;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hp
 */
public class VerifierMainForm extends javax.swing.JFrame {

    /**
     * Creates new form VerifierMainForm
     */
    public VerifierMainForm() {
        initComponents();
    }
    
    public void getV(PersonClass v) {
        verifier = v;
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
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("View Requests");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Edit Profile");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(78, 80, 82));
        jLabel1.setText("Verifier");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jButton1)
                        .addGap(24, 24, 24)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.hide();
        Login log = new Login();
        log.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.hide();
        RegisterMainV v = new RegisterMainV();
        v.getRole("Verifier");
        AdminsDirectory.getInstance().viewVerifier(verifier,v);
        v.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String[] columnNames = {"Request ID", "Name", "Connection Type","Address Proof","ID Proof","Status"};
        String[][] rows = new String[NewConnDirectory.getInstance().getConnDir().size()][6];
        int j=0;
        for(int i=0;i<NewConnDirectory.getInstance().getConnDir().size();i++) {
            if(NewConnDirectory.getInstance().getConnDir().get(i).getStatus().equals("Pending")) {
                int id = NewConnDirectory.getInstance().getConnDir().get(i).getConnID();
                rows[j][0] = Integer.toString(id);
                rows[j][1] = NewConnDirectory.getInstance().getConnDir().get(i).getName();
                rows[j][2] = NewConnDirectory.getInstance().getConnDir().get(i).getType();
                rows[j][3] = NewConnDirectory.getInstance().getConnDir().get(i).getAddressPath();
                rows[j][4] = NewConnDirectory.getInstance().getConnDir().get(i).getIdPath();
                rows[j][5] = NewConnDirectory.getInstance().getConnDir().get(i).getStatus();
                j++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        jTable1.setModel(model);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        JButton address = new JButton("View Address Proof");
        JButton id = new JButton("View ID Proof");
        JButton done = new JButton("Done");
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String fp1 = model.getValueAt(index, 3).toString();
        String fp2 = model.getValueAt(index, 4).toString();
        String status[] = {"Approved","Declined"};
        JComboBox cb = new JComboBox(status);
        
        address.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    File pdf1 = new File(fp1);
                    if(pdf1.exists()) {
                        if(Desktop.isDesktopSupported()) {
                            Desktop.getDesktop().open(pdf1);
                        } 
                        else {
                            JOptionPane.showMessageDialog(null, "Desktop is not supported");
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "File does not exists");
                    }
                } catch(Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        });
        
        id.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    File pdf2 = new File(fp2);
                    if(pdf2.exists()) {
                        if(Desktop.isDesktopSupported()) {
                            Desktop.getDesktop().open(pdf2);
                        } 
                        else {
                            JOptionPane.showMessageDialog(null, "Desktop is not supported");
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "File does not exists");
                    }
                } catch(Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        });
        
        done.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int input;
                input = JOptionPane.showConfirmDialog(null, cb, "Update Status", JOptionPane.DEFAULT_OPTION);
                try{
                    String name = model.getValueAt(index, 1).toString();
                    String s = model.getValueAt(index, 0).toString();
                    int id = Integer.parseInt(s);
                    String connection = model.getValueAt(index, 2).toString();
                    String ap = model.getValueAt(index, 3).toString();
                    String idp = model.getValueAt(index, 4).toString();
                    int stateID = 0;
                    for(int i=0;i<NewConnDirectory.getInstance().getConnDir().size();i++) { 
                        if(id == NewConnDirectory.getInstance().getConnDir().get(i).getConnID()) {
                            stateID = NewConnDirectory.getInstance().getConnDir().get(i).getStateID();
                        }
                    }

                    NewConnectionClass nc = new NewConnectionClass(id, stateID, name,connection,ap,idp,(String)cb.getSelectedItem());
                    for(int i=0;i<NewConnDirectory.getInstance().getConnDir().size();i++) {
                        if(NewConnDirectory.getInstance().getConnDir().get(i).getConnID()== id) {
                            NewConnDirectory.getInstance().updateRequest(nc, i);
                            break;
                        }
                    }
                    model.setValueAt((String)cb.getSelectedItem(), index, 5);
                } catch(Exception ex) {
                    System.out.println(ex);
                }
            }
        });
        
        Object[] options = {address, id, done};

        JOptionPane.showOptionDialog(null, "View Documents", "View Documents",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]);
//        
//        
//
//        int input;
//        input = JOptionPane.showConfirmDialog(this, cb, "Update Status", JOptionPane.DEFAULT_OPTION);
//        try{
//            String name = model.getValueAt(index, 1).toString();
//            String s = model.getValueAt(index, 0).toString();
//            int id = Integer.parseInt(s);
//            String connection = model.getValueAt(index, 2).toString();
//            String ap = model.getValueAt(index, 3).toString();
//            String idp = model.getValueAt(index, 4).toString();
//            int stateID = 0;
//            for(int i=0;i<NewConnDirectory.getInstance().getConnDir().size();i++) { 
//                if(id == NewConnDirectory.getInstance().getConnDir().get(i).getConnID()) {
//                    stateID = NewConnDirectory.getInstance().getConnDir().get(i).getStateID();
//                }
//            }
//            
//            NewConnectionClass nc = new NewConnectionClass(id, stateID, name,connection,ap,idp,(String)cb.getSelectedItem());
//            for(int i=0;i<NewConnDirectory.getInstance().getConnDir().size();i++) {
//                if(NewConnDirectory.getInstance().getConnDir().get(i).getConnID()== id) {
//                    NewConnDirectory.getInstance().updateRequest(nc, i);
//                    break;
//                }
//            }
//            model.setValueAt((String)cb.getSelectedItem(), index, 5);
//        } catch(Exception e) {
//            System.out.println(e);
//        }
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
            java.util.logging.Logger.getLogger(VerifierMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerifierMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerifierMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerifierMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerifierMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
