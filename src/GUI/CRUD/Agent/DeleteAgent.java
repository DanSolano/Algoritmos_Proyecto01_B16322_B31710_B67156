/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.CRUD.Agent;

import Domain.User;
import GUI.AdminModule;
import GUI.AgentsModule;
import Main.Algoritmos_Proyecto01_B16322_B31710_B67156;
import Utilities.StringMD;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author daniel
 */
public class DeleteAgent extends javax.swing.JFrame {

    private ArrayList<User> agents;
    private ArrayList<User> admin;
    private TextAutoCompleter textAutocompleter;
    private int indexUser;

    /**
     * Creates new form CreateClient
     */
    public DeleteAgent() {
        initComponents();
        this.indexUser = -1;
        this.agents = Algoritmos_Proyecto01_B16322_B31710_B67156.AGENT_LIST;
        this.admin = Algoritmos_Proyecto01_B16322_B31710_B67156.ADMIN_LIST;
        jbUpdate.setEnabled(false);
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
        jtfUser = new javax.swing.JTextField();
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

        jtfUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfUserKeyReleased(evt);
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
        jDesktopPane1.setLayer(jtfUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
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
                .addComponent(jtfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        textAutocompleter.removeItemByValue(jtfUser.getText().trim());
        delete();

    }//GEN-LAST:event_jbUpdateActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        back();
    }//GEN-LAST:event_formWindowClosing

    private void jtfUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUserKeyReleased
        searchUser();
    }//GEN-LAST:event_jtfUserKeyReleased

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
        this.dispose();
        AdminModule adminModule = new AdminModule();
        adminModule.setVisible(true);
    }

    private boolean exist(String email, String user) {
        boolean exist = false;
        for (User agent : agents) {
            if (agent.getUserName().equals(user)
                    || agent.getMail().equals(email)) {
                exist = true;
            }
        }
        return exist;
    }

    private void uploadSearchByUser() {
        ArrayList<User> agents = this.agents;
        for (int i = 0; i < agents.size(); i++) {
            textAutocompleter.addItem(agents.get(i).getUserName());
        }
    }

    private void searchUser() {
        String user = jtfUser.getText().trim();
        int counter = -1;
        for (User agent : agents) {
            counter++;

            if (agent.getUserName().equals(user)) {
                this.indexUser = counter;
                jlInformation.setText("Nombre: " + agent.getName() + "- Mail: " + agent.getMail());
                jbUpdate.setEnabled(true);
            }
        }

    }

    private void clearFields() {
        jtfUser.setText("");
        jlInformation.setText("Agente Eliminado");
    }

    private void delete() {
        this.agents.remove(this.indexUser);
        jlInformation.setText("Agente Eliminado con exito.");
        jbUpdate.setEnabled(false);
        clearFields();
    }

    private void autoCompleter() {
        textAutocompleter = new TextAutoCompleter(jtfUser);
        textAutocompleter.setCaseSensitive(false);
        textAutocompleter.setMode(0);//para que el autocompletar busque el fragmento escrito este contenido en alguna parte de la busqueda
        uploadSearchByUser();
    }

}
