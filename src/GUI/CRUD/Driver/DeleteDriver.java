/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.CRUD.Driver;

import Domain.Driver;
import GUI.AdminModule;
import Main.Algoritmos_Proyecto01_B16322_B31710_B67156;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Iterator;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author daniel
 */
public class DeleteDriver extends javax.swing.JFrame {

    private TextAutoCompleter textAutocompleter;
    private Queue drivers;
    private Driver driverSearch;
    private String id;

    /**
     * Creates new form CreateClient
     */
    public DeleteDriver() {
        initComponents();
        this.drivers = Algoritmos_Proyecto01_B16322_B31710_B67156.DRIVER_QUEUE;
//        jbUpdate.setEnabled(false);
        autoCompleter();

//        textAutocompleter = new TextAutoCompleter(jtfMail);
//        uploadSearchByMail();
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
        jLabel2 = new javax.swing.JLabel();
        jtfDni = new javax.swing.JTextField();
        jbUpdate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jlInformation = new javax.swing.JLabel();
        jbSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Eliminar Agente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel2.setText("Usuario");

        jtfDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfDniKeyReleased(evt);
            }
        });

        jbUpdate.setText("Eliminar");
        jbUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUpdateActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jlInformation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlInformation.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbSearch.setText("Buscar");
        jbSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSearchActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbUpdate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlInformation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbUpdate)
                .addGap(82, 82, 82)
                .addComponent(jbSearch)
                .addGap(46, 46, 46))
            .addComponent(jlInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSearch)
                    .addComponent(jButton2)
                    .addComponent(jbUpdate))
                .addGap(18, 18, 18)
                .addComponent(jlInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        back();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUpdateActionPerformed
        textAutocompleter.removeItemByValue(jtfDni.getText().trim());
        delete();


    }//GEN-LAST:event_jbUpdateActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        back();
    }//GEN-LAST:event_formWindowClosing

    private void jtfDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDniKeyReleased
        searchUser();
    }//GEN-LAST:event_jtfDniKeyReleased

    private void jbSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSearchActionPerformed
        searchUser();
    }//GEN-LAST:event_jbSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbSearch;
    private javax.swing.JButton jbUpdate;
    private javax.swing.JLabel jlInformation;
    private javax.swing.JTextField jtfDni;
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
        Algoritmos_Proyecto01_B16322_B31710_B67156.DRIVER_QUEUE = this.drivers;
        this.dispose();
        AdminModule adminModule = new AdminModule();
        adminModule.setVisible(true);
    }

    private void uploadSearchByUser() {
//        ArrayList<Driver> driversList = (ArrayList<Driver>) this.drivers;
//        for (int i = 0; i < driversList.size(); i++) {
//            textAutocompleter.addItem(driversList.get(i).getDni());
//        }
    }

    private void searchUser() {
        if (jtfDni.getText().trim().isEmpty()) {
            jlInformation.setText("Debe ingresar una cedula");
        } else {
            for (Iterator iterator = this.drivers.iterator(); iterator.hasNext();) {
                this.driverSearch = (Driver) iterator.next();
                if (this.driverSearch.getDni().equals(jtfDni.getText().trim())) {
                    jlInformation.setText("Cedula:" + this.driverSearch.getDni() + " Nombre:" + this.driverSearch.getName());
                    break;
                }

            }

        }

    }

    private void clearFields() {
        jtfDni.setText("");
        jlInformation.setText("Administrador Eliminado");
    }

    private void delete() {
        searchUser();
        this.drivers.remove(this.driverSearch);
        jlInformation.setText("Conductor eliminado con exito.");
        jbUpdate.setEnabled(false);
        clearFields();

    }

    private void autoCompleter() {
        textAutocompleter = new TextAutoCompleter(jtfDni);
        textAutocompleter.setCaseSensitive(false);
        textAutocompleter.setMode(0);//para que el autocompletar busque el fragmento escrito este contenido en alguna parte de la busqueda
        uploadSearchByUser();
    }

}