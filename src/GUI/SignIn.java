/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.UserDAO;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author ngochieu
 */
public class SignIn extends javax.swing.JInternalFrame {

    /**
     * Creates new form SignIn
     */
    public SignIn() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnSignIn = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        txtRePass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        lblAccount = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblRePass = new javax.swing.JLabel();

        jLabel1.setText("DANG KY TAI KHOAN");

        jLabel2.setText("Nhap tai khoan:");

        jLabel3.setText("Nhap mat khau:");

        jLabel4.setText("Ten nguoi choi:");

        jLabel5.setText("Nhap lai mat khau:");

        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        btnSignIn.setText("Dang Ky");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });

        txtRePass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRePassFocusLost(evt);
            }
        });
        txtRePass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRePassKeyPressed(evt);
            }
        });

        lblAccount.setText("Tai khoan da ton tai!");

        lblPass.setText("Mat khau qua ngan!");

        lblRePass.setText("Mat khau khong chinh xac!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAccount)
                    .addComponent(lblPass)
                    .addComponent(lblRePass))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAccount)
                .addGap(71, 71, 71)
                .addComponent(lblPass)
                .addGap(34, 34, 34)
                .addComponent(lblRePass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUser)
                    .addComponent(txtName)
                    .addComponent(btnSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPass)
                    .addComponent(txtRePass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel1)
                .addGap(234, 234, 234))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtRePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        // TODO add your handling code here:
        String user=UserDAO.getUserName(txtUser.getText());
        //if(UserDAO.isUserNameExist(txtUser.getText()))
        if(user==txtUser.getText())
        {
            lblAccount.setText("Tai khoan da ton tai!");
            lblAccount.setVisible(true);
            txtUser.selectAll();
            txtUser.requestFocus();
        }
        else if(txtUser.getText().length()>=20)
        {
            lblAccount.setText("Vui long nhap ten dang nhap it hon 20 ki tu!");
            lblAccount.setVisible(true);
            txtUser.selectAll();
            txtUser.requestFocus();
        }
        else if(txtUser.getText().length()<6)
        {
            lblAccount.setText("Vui long nhap ten dang nhap nhieu hon 6 ki tu!");
            lblAccount.setVisible(true);
            txtUser.selectAll();
            txtUser.requestFocus();
        }
        else
            lblAccount.setVisible(false);
    }//GEN-LAST:event_txtUserFocusLost

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //if(UserDAO.isUserNameExist(txtUser.getText()))
            String user=UserDAO.getUserName(txtUser.getText());
            if(user==txtUser.getText())
            {
                lblAccount.setText("Tai khoan da ton tai!");
                lblAccount.setVisible(true);
                txtUser.selectAll();
                txtUser.requestFocus();
            }
            else if(txtUser.getText().length()>=20)
            {
                lblAccount.setText("Vui long nhap ten dang nhap it hon 20 ki tu!");
                lblAccount.setVisible(true);
                txtUser.selectAll();
                txtUser.requestFocus();
            }
            else if(txtUser.getText().length()<6)
            {
                lblAccount.setText("Vui long nhap ten dang nhap nhieu hon 6 ki tu!");
                lblAccount.setVisible(true);
                txtUser.selectAll();
                txtUser.requestFocus();
            }
            else{
                lblAccount.setVisible(false);
                txtName.requestFocus();
            }
        }
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPass.requestFocus();
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
        if(txtName.getText().isEmpty()||txtPass.getText().isEmpty()||txtRePass.getText().isEmpty()||txtUser.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Vui long dien day du thong tin!","Thong bao",JOptionPane.WARNING_MESSAGE);
       
        }
        else
        {
            UserDAO.addUser(txtUser.getText(),txtPass.getText(),txtName.getText());
            JOptionPane.showMessageDialog(this,"Tao tai khoan thanh cong!","Thong bao",JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            LogIn login=new LogIn();
            login.setVisible(true);
            this.getDesktopPane().add(login);
        }
    }//GEN-LAST:event_btnSignInActionPerformed

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        // TODO add your handling code here:
        if(txtPass.getPassword().length<6)
        {
            txtPass.selectAll();
            txtPass.requestFocus();
            lblPass.setVisible(true);
        }
        else
        lblPass.setVisible(false);
    }//GEN-LAST:event_txtPassFocusLost

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(txtPass.getPassword().length<6)
            {
                txtPass.selectAll();
                txtPass.requestFocus();
                lblPass.setVisible(true);
            }
            else
            {
                lblPass.setVisible(false);
                txtRePass.requestFocus();
            }
        }
    }//GEN-LAST:event_txtPassKeyPressed

    private void txtRePassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRePassFocusLost
        // TODO add your handling code here:
        if(Arrays.equals(txtPass.getPassword(),txtRePass.getPassword()))
        {
            lblRePass.setVisible(false);
        }
        else
        {
            txtPass.selectAll();
            txtRePass.requestFocus();
            lblRePass.setVisible(true);
        }
    }//GEN-LAST:event_txtRePassFocusLost

    private void txtRePassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRePassKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(Arrays.equals(txtPass.getPassword(),txtRePass.getPassword()))
            {
                lblRePass.setVisible(false);
                btnSignIn.requestFocus();
            }
            else
            {
                txtPass.selectAll();
                txtRePass.requestFocus();
                lblRePass.setVisible(true);
            }                
        }
    }//GEN-LAST:event_txtRePassKeyPressed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRePass;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtRePass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
