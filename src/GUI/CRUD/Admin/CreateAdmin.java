/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.CRUD.Admin;

import Domain.User;
import GUI.AdminModule;
import Main.Algoritmos_Proyecto01_B16322_B31710_B67156;
import Utilities.StringMD;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author daniel
 */
public class CreateAdmin extends javax.swing.JFrame {

    ArrayList<User> admins;

    /**
     * Creates new form CreateClient
     */
    public CreateAdmin() {
        initComponents();
        this.admins = Algoritmos_Proyecto01_B16322_B31710_B67156.ADMIN_LIST;
        jbSave.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfMail = new javax.swing.JTextField();
        jtfName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbSave = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jpfPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jpfPassB = new javax.swing.JPasswordField();
        jlError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Crear Nuevo Administrador");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Usuario");

        jtfMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfMailKeyReleased(evt);
            }
        });

        jLabel3.setText("e-mail:");

        jLabel4.setText("Contraseña");

        jbSave.setText("Guardar");
        jbSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSaveActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jpfPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jpfPassKeyReleased(evt);
            }
        });

        jLabel5.setText("Contraseña de nuevo");

        jpfPassB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jpfPassBKeyReleased(evt);
            }
        });

        jlError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfMail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbSave, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jpfPass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jpfPassB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlError, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfMail, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jpfPassB, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jpfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)))
                .addGap(13, 13, 13))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jButton2)
                .addGap(119, 119, 119)
                .addComponent(jbSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jpfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jpfPassB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSave)
                    .addComponent(jButton2))
                .addGap(42, 42, 42)
                .addComponent(jlError, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        back();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSaveActionPerformed
        String pass = new String(jpfPass.getPassword()).trim();
        String passB = new String(jpfPassB.getPassword()).trim();
        if (!pass.isEmpty() && !passB.isEmpty()) {
            pass = StringMD.getStringMessageDigest(new String(jpfPass.getPassword()).trim(), StringMD.SHA512).trim();
            passB = StringMD.getStringMessageDigest(new String(jpfPassB.getPassword()).trim(), StringMD.SHA512).trim();

            String email = jtfMail.getText().trim();
            String user = jtfUser.getText().trim();
            if (exist(email, user)) {
                jlError.setText("El nombre de usuario o correo ya está en uso.");
            } else if (!pass.equals(passB) || !isMail(email)) {//validate that the email and password are valid
                jlError.setText("Correo o contraseña con errores.");
                jbSave.setEnabled(false);
            } else if (pass.equals(passB) && isMail(email)
                    && !jtfName.getText().trim().isEmpty()
                    && !jtfUser.getText().trim().isEmpty()
                    && !jtfMail.getText().trim().isEmpty()) {//validate that the email and password are valid and that there are no unfilled fields

                int code = Integer.parseInt(this.admins.get(this.admins.size()).getCode() + 1);//return  the last code and +1 for the new admin
                this.admins.add(new User(jtfName.getText(), jtfUser.getText(), jtfMail.getText(), pass, code + "", "admin"));
                Algoritmos_Proyecto01_B16322_B31710_B67156.ADMIN_LIST = this.admins;
                jlError.setText("Administrador crado.");
                jtfUser.setText("");
                jtfMail.setText("");
                jtfName.setText("");
                jpfPass.setText("");
                jpfPassB.setText("");

            }
        } else {
            jlError.setText("Debe ingresar todos los datos.");
        }
    }//GEN-LAST:event_jbSaveActionPerformed

    private void jpfPassBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfPassBKeyReleased
        String pass = StringMD.getStringMessageDigest(new String(jpfPass.getPassword()).trim(), StringMD.SHA512);
        String passB = StringMD.getStringMessageDigest(new String(jpfPassB.getPassword()).trim(), StringMD.SHA512);
        if (pass.equals(passB)) {
            jlError.setText("Contraseña CORRECTA.");
            jbSave.setEnabled(true);

        } else {
            jlError.setVisible(true);
            jlError.setText("Contraseña debe ser igual.");
            jbSave.setEnabled(false);
        }
    }//GEN-LAST:event_jpfPassBKeyReleased

    private void jpfPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfPassKeyReleased
        String pass = StringMD.getStringMessageDigest(new String(jpfPass.getPassword()).trim(), StringMD.SHA512);
        String passB = StringMD.getStringMessageDigest(new String(jpfPassB.getPassword()).trim(), StringMD.SHA512);
        if (pass.equals(passB)) {
            jlError.setText("Contraseña CORRECTA.");
            jbSave.setEnabled(true);

        } else {
            jlError.setText("Contraseña debe ser igual.");
            jbSave.setEnabled(false);
        }
    }//GEN-LAST:event_jpfPassKeyReleased

    private void jtfMailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfMailKeyReleased
        // El email a validar
        String email = jtfMail.getText().trim();
        if (isMail(email)) {
            jlError.setText(email + " Correcto.");
            jbSave.setEnabled(true);
        } else {
            jlError.setText(email + " No es un e-Mail.");
            jbSave.setEnabled(false);
        }

    }//GEN-LAST:event_jtfMailKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        back();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbSave;
    private javax.swing.JLabel jlError;
    private javax.swing.JPasswordField jpfPass;
    private javax.swing.JPasswordField jpfPassB;
    private javax.swing.JTextField jtfMail;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfUser;
    // End of variables declaration//GEN-END:variables

    /**
     * isMail evaluate if the String is an email.
     *
     * @param email email received the string input the text field for email
     * @return true if the String is a email and false if the String is not an
     * email
     */
    private boolean isMail(String email) {
        // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(email);

        if (mather.find() == true) {
            return true;

        } else {
            return false;
        }
    }

    private void back() {
        Algoritmos_Proyecto01_B16322_B31710_B67156.ADMIN_LIST = this.admins;
        this.dispose();
        AdminModule adminModule = new AdminModule();
        adminModule.setVisible(true);
    }

    private boolean exist(String email, String user) {
        boolean exist = false;
        for (User admin : admins) {
            if (admin.getUserName().equals(user)
                    || admin.getMail().equals(email)) {
                exist = true;
            }
        }
        return exist;
    }
}
