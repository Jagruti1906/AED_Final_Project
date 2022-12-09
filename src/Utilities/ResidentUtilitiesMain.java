/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Utilities;

import UI.ResidentPage;
import static aed_project.AED_Project.rc;
import java.awt.Button;
import java.awt.Label;
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
public class ResidentUtilitiesMain extends javax.swing.JFrame {

    /**
     * Creates new form ResidentUtilitiesMain
     */
    public ResidentUtilitiesMain() {
        initComponents();
    }
    
    private static int check=0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
        public void populateBill(String type){
        String[] columnNames = {"ID", "Service From", "Service Till","Units Consumed","Unit Cost","Total","Status"};
        int count=0;
        for(int i=0;i<BillsDirectory.getInstance().getBillsDir().size();i++) {
            if(BillsDirectory.getInstance().getBillsDir().get(i).getType().equals(type)) {
                count++;
            }
        }
        String[][] rows = new String[count][7];
        int j=0;
        for(int i=0;i<BillsDirectory.getInstance().getBillsDir().size();i++) {
            if(BillsDirectory.getInstance().getBillsDir().get(i).getType().equals(type)) {
                int id = BillsDirectory.getInstance().getBillsDir().get(i).getBillID();
                rows[j][0] = Integer.toString(id);
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String s = formatter.format(BillsDirectory.getInstance().getBillsDir().get(i).getStartDate());
                rows[j][1] = s;
                String e = formatter.format(BillsDirectory.getInstance().getBillsDir().get(i).getEndDate());
                rows[j][2] = e;
                rows[j][3] = Float.toString(BillsDirectory.getInstance().getBillsDir().get(i).getConsumption());
                rows[j][4] = Float.toString(BillsDirectory.getInstance().getBillsDir().get(i).getUnits());
                rows[j][5] = Float.toString(BillsDirectory.getInstance().getBillsDir().get(i).getTotal());
                rows[j][6] = BillsDirectory.getInstance().getBillsDir().get(i).getStatus();
                j++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        jTable2.setModel(model);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Gas Bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Electricity Bill");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Water Bill");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Connection Request");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton6.setText("Connection Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.hide();
        ResidentPage rp = new ResidentPage();
        rp.show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.hide();
        NewConnectionForm ncf = new  NewConnectionForm();
        ncf.jTextField1.setText(rc.getName());
        ncf.jTextField1.setEnabled(false);
        ncf.jTextField2.setText(Integer.toString(rc.getStateID()));
        ncf.jTextField2.setEnabled(false);
        ncf.show();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateBill("Gas");
        check=1;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        populateBill("Electricity");
        check=2;
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        populateBill("Water");
        check=3;
    }//GEN-LAST:event_jButton3ActionPerformed

    public String getStatus(String type,int billID, Date sd, Date ed, Float u, Float c, Float t) {
        int answer = JOptionPane.showConfirmDialog(null, "Pay Now", "Bill Payment",JOptionPane.YES_NO_OPTION);
        String s = "";
        if(answer == 0) {
            BillsClass bill = new BillsClass(billID,rc.getStateID(),rc.getName(),rc.getAddress(),type,u,c,t,sd,ed,"Bill Paid");
            for(int j=0;j<BillsDirectory.getInstance().getBillsDir().size();j++) {
                if(BillsDirectory.getInstance().getBillsDir().get(j).getBillID() == billID) {
                    BillsDirectory.getInstance().updateBill(bill, j);
                    s = BillsDirectory.getInstance().getBillsDir().get(j).getStatus();
                }
            }    
        }
        else {
            JOptionPane.showMessageDialog(null, "Bill Not Paid");
            s = "Pending";
        }
        return s;
    }
    
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int index = jTable2.getSelectedRow();
        TableModel model = jTable2.getModel();
        try{
            String billId = model.getValueAt(index, 0).toString();
            String s = model.getValueAt(index, 0).toString();
            int id = Integer.parseInt(billId);
            Date sd=new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(index, 1).toString());
            Date ed=new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(index, 2).toString());
            String units = model.getValueAt(index, 4).toString();
            Float u = Float.parseFloat(units);
            String con = model.getValueAt(index, 3).toString();
            Float c = Float.parseFloat(con);
            String total = model.getValueAt(index, 5).toString();
            Float t = Float.parseFloat(total);
            if(check==1) {
                model.setValueAt(getStatus("Gas", id, sd, ed, u, c, t), index, 6);
            }
            else if(check==2) {
                model.setValueAt(getStatus("Gas", id, sd, ed, u, c, t), index, 6);
            }
            else {
                model.setValueAt(getStatus("Gas", id, sd, ed, u, c, t), index, 6);
            }

        } catch(Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(ResidentUtilitiesMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResidentUtilitiesMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResidentUtilitiesMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResidentUtilitiesMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResidentUtilitiesMain().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
