/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Fire_Department.AdminsDirectory;
import Fire_Department.FireAdminMainFrame;
import Login.LoginDirectory;
import Medical_Department.DoctorDirectory;
import Medical_Department.HospitalAdminDirectory;
import Police_Department.PoliceDirectory;
import Police_Department.PoliceOfficerMain;
import Police_Department.policeAdminMain;
import Resident.ResidentDirectory;
import UI_Medical_Department.DoctorMainFrame;
import UI_Medical_Department.HospAdminMainFrame;
import UI_Medical_Department.PatientMainFrame;
import Utilities.SupplierMainFrame;
import Utilities.UtilityAdminMain;
import Utilities.VerifierMainForm;
import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author admin
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
   
    private Connection connection;
    ResultSet rs = null;
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
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jButton1.setText("Login");
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
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // get username
        
        int stateID = Integer.parseInt(txtUser.getText());
        // get password

        String password = txtPass.getText();
        boolean checkStateID, checkPassword;
        for(int i=0;i<LoginDirectory.getInstance().getLoginDir().size();i++) {
            checkPassword = password.equals(LoginDirectory.getInstance().getLoginDir().get(i).getPassword());
            if((stateID == (LoginDirectory.getInstance().getLoginDir().get(i).getStateID())) && checkPassword) {
                try{
                    if(LoginDirectory.getInstance().getLoginDir().get(i).getStatus().equals("Doctor")) {
                        this.hide();
                        int size = DoctorDirectory.getInstance().getDoctorDir().size();
                        DoctorMainFrame docFrame = new DoctorMainFrame();
                        for(int j=0;j<size;j++) {
                            if(stateID == DoctorDirectory.getInstance().getDoctorDir().get(j).getStateID()) {
                                docFrame.getDoc(DoctorDirectory.getInstance().getDoctorDir().get(j));
                                break;
                            }
                        }
                        docFrame.show();
                        break;
                    }
                    else if(LoginDirectory.getInstance().getLoginDir().get(i).getStatus().equals("Hospital Admin")) {
                        this.hide();
                        int size = HospitalAdminDirectory.getInstance().getHospitalAdminDir().size();
                        HospAdminMainFrame hospFrame = new HospAdminMainFrame();
                        for(int j=0;j<size;j++) {
                            if(stateID == HospitalAdminDirectory.getInstance().getHospitalAdminDir().get(j).getStateID()) {
                                hospFrame.getHospAdmin(HospitalAdminDirectory.getInstance().getHospitalAdminDir().get(j));
                                break;
                            }
                        }
                        hospFrame.show();
                        break;
                    }
                    else if(LoginDirectory.getInstance().getLoginDir().get(i).getStatus().equals("Resident")) {
                        this.hide();
                        int size = ResidentDirectory.getInstance().getResidentDir().size();
                        ResidentPage resident = new ResidentPage();
                        for(int j=0;j<size;j++) {
                            if(stateID == ResidentDirectory.getInstance().getResidentDir().get(j).getStateID()) {
                                resident.getResident(ResidentDirectory.getInstance().getResidentDir().get(j));
                                break;
                            }
                        }
                        resident.show();
                        break;
                    }
                    else if(LoginDirectory.getInstance().getLoginDir().get(i).getStatus().equals("Police Admin")) {
                        this.hide();
                        int size = PoliceDirectory.getInstance().getPoliceDir().size();
                        policeAdminMain police = new policeAdminMain();
                        for(int j=0;j<size;j++) {
                            if(stateID == PoliceDirectory.getInstance().getPoliceDir().get(j).getStateID()) {
                                police.getPoliceAdmin(PoliceDirectory.getInstance().getPoliceDir().get(j));
                                break;
                            }
                        }
                        police.show();
                        break;
                    }
                    else if(LoginDirectory.getInstance().getLoginDir().get(i).getStatus().equals("Police Officer")) {
                        this.hide();
                        int size = PoliceDirectory.getInstance().getPoliceDir().size();
                        PoliceOfficerMain police = new PoliceOfficerMain();
                        for(int j=0;j<size;j++) {
                            if(stateID == PoliceDirectory.getInstance().getPoliceDir().get(j).getStateID()) {
                                police.getPol(PoliceDirectory.getInstance().getPoliceDir().get(j));
                                break;
                            }
                        }
                        police.show();
                        break;
                    }
                    else if(LoginDirectory.getInstance().getLoginDir().get(i).getStatus().equals("Fire Admin")) {
                        this.hide();
                        int size = AdminsDirectory.getInstance().getAdminsDir().size();
                        FireAdminMainFrame fire = new FireAdminMainFrame();
                        for(int j=0;j<size;j++) {
                            if(stateID == AdminsDirectory.getInstance().getAdminsDir().get(j).getStateID()) {
                                System.out.println(AdminsDirectory.getInstance().getAdminsDir().get(j).getName());
                                fire.getFireAdmin(AdminsDirectory.getInstance().getAdminsDir().get(j));
                                break;
                            }
                        }
                        fire.show();
                        break;
                    }
                    else if(LoginDirectory.getInstance().getLoginDir().get(i).getStatus().equals("Verifier")) {
                        this.hide();
                        int size = AdminsDirectory.getInstance().getAdminsDir().size();
                        VerifierMainForm vmf = new VerifierMainForm();
                        for(int j=0;j<size;j++) {
                            if(stateID == AdminsDirectory.getInstance().getAdminsDir().get(j).getStateID()) {
                                System.out.println(AdminsDirectory.getInstance().getAdminsDir().get(j).getName());
                                vmf.getV(AdminsDirectory.getInstance().getAdminsDir().get(j));
                                break;
                            }
                        }
                        vmf.show();
                        break;
                    } 
                    else if(LoginDirectory.getInstance().getLoginDir().get(i).getStatus().equals("Utility Admin")) {
                        this.hide();
                        int size = AdminsDirectory.getInstance().getAdminsDir().size();
                        UtilityAdminMain uam = new UtilityAdminMain();
                        for(int j=0;j<size;j++) {
                            if(stateID == AdminsDirectory.getInstance().getAdminsDir().get(j).getStateID()) {
                                System.out.println(AdminsDirectory.getInstance().getAdminsDir().get(j).getName());
                                uam.getUAdmin(AdminsDirectory.getInstance().getAdminsDir().get(j));
                                break;
                            }
                        }
                        uam.show();
                        break;
                    }
                    else if(LoginDirectory.getInstance().getLoginDir().get(i).getStatus().equals("Supplier")) {
                        this.hide();
                        int size = AdminsDirectory.getInstance().getAdminsDir().size();
                        SupplierMainFrame smf = new SupplierMainFrame();
                        for(int j=0;j<size;j++) {
                            if(stateID == AdminsDirectory.getInstance().getAdminsDir().get(j).getStateID()) {
                                System.out.println(AdminsDirectory.getInstance().getAdminsDir().get(j).getName());
                                smf.getS(AdminsDirectory.getInstance().getAdminsDir().get(j));
                                break;
                            }
                        }
                        smf.show();
                        break;
                    }
                    else if(LoginDirectory.getInstance().getLoginDir().get(i).getStatus().equals("System Admin")) {
                        this.hide();
                        int size = AdminsDirectory.getInstance().getAdminsDir().size();
                        SystemAdminFrame sys = new SystemAdminFrame();
                        sys.show();
                        break;
                    }
                } catch(Exception e) {
                    System.out.println(e);
                }
            }
//            if( && ) {
//                
//            }
        }
//        if(username.equals("admin") && password.equals("admin"))
//        {
//            AdminPage adminview = new AdminPage();
//            adminview.show();
//        }
//        
//        else if (username.equals("resident") && password.equals("resident"))
//        {
//            ResidentPage resview = new ResidentPage();
//            resview.show();
//        }
//         else if (username.equals("doc") && password.equals("doc"))
//        {
//            DoctorMainFrame docview = new DoctorMainFrame();
//            docview.show();
//        }
//        else if (username.equals("patient") && password.equals("patient"))
//        {
//            PatientMainFrame patview = new PatientMainFrame();
//            patview.show();
//        }
//       
//        
//        else{
//               JOptionPane.showMessageDialog(this, "Incorrent Username or Password");
//        }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
