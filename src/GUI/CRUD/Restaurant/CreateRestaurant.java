/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.CRUD.Restaurant;

import GUI.CRUD.Driver.*;
import Domain.Driver;
import Domain.Restaurant;
import Domain.User;
import GUI.AdminModule;
import Main.Algoritmos_Proyecto01_B16322_B31710_B67156;
import Utilities.ImageManage;
import Utilities.StringMD;
import Utilities.StringPath;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author daniel
 */
public class CreateRestaurant extends javax.swing.JFrame {

    ArrayList<Restaurant> restaurants = new ArrayList<>();
    int idCountRest;
    BufferedImage bi;
    File archivoelegido;
    private boolean flag;

    /**
     * Creates new form CreateClient
     */
    public CreateRestaurant() {
        initComponents();
        this.restaurants = Algoritmos_Proyecto01_B16322_B31710_B67156.RESTAURANT_LIST;
        this.idCountRest = 1;
//        jbSave.setEnabled(false);
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
        jlInformation = new javax.swing.JLabel();
        jbChargeImage = new javax.swing.JButton();
        jlDriverImage = new javax.swing.JLabel();
        jcbProvince = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfLocation = new javax.swing.JTextField();
        jtfName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Crear Nuevo Agente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jlInformation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jbChargeImage.setText("Seleccionar Imagen");
        jbChargeImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbChargeImageActionPerformed(evt);
            }
        });

        jlDriverImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDriverImage.setText(" ");
        jlDriverImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jcbProvince.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la Provincia", "San José", "Alajuela", "Cartago", "Heredia", "Guanacaste", "Puntarenas", "Limón" }));

        jLabel9.setText("Provincia:");

        jLabel2.setText("Ubicacion:");

        jLabel1.setText("Nombre:");

        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Crear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jlInformation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbChargeImage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlDriverImage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbProvince, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfLocation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGap(26, 26, 26)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtfName)
                                            .addComponent(jtfLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                            .addComponent(jlDriverImage, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jbChargeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(26, 26, 26)
                                            .addComponent(jcbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jButton3)
                                .addGap(96, 96, 96)
                                .addComponent(jButton4)))
                        .addGap(0, 298, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jcbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDriverImage, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbChargeImage))
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(38, 38, 38)))
                .addComponent(jlInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        back();
    }//GEN-LAST:event_formWindowClosing

    private void jbChargeImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbChargeImageActionPerformed
        //Añadiendole un filtro
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG", "jpg", "png");
        JFileChooser selector = new JFileChooser();
        selector.setFileFilter(filter);
        int estado = selector.showOpenDialog(null);
        this.archivoelegido = selector.getSelectedFile();

        if (estado == JFileChooser.APPROVE_OPTION) {
            if (archivoelegido.exists()) {
                System.out.println("bien");
            } else {
                System.out.println("no bien");
            }

            try {

                jlDriverImage.setVisible(true);
                String ruta = this.archivoelegido.getPath();
                ImageIcon imagen = new ImageIcon(ruta);
                this.bi = ImageIO.read(this.archivoelegido);
                ImageManage im = new ImageManage();
                imagen = im.resizeImage100(imagen);
                jlDriverImage.setIcon(imagen);
                this.flag = true;

//jlDriverImage.setBounds(20, 30, 60, 36);
            } catch (IOException ex) {
                Logger.getLogger(CreateRestaurant.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (estado == JFileChooser.CANCEL_OPTION) {
            System.out.println("Cancel was selected");
            this.flag = false;
        }

    }//GEN-LAST:event_jbChargeImageActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (flag == false || jtfName.getText().trim().isEmpty() || jtfLocation.getText().trim().isEmpty() || jcbProvince.getSelectedIndex() == 0) {
            jlInformation.setText("Debe ingresar todos los datos.");
        } else {
            if (isDirectory()) {

                String name = jtfName.getText().trim();
                String location = jtfLocation.getText().trim();
                String province = jcbProvince.getSelectedItem().toString();
                if (!existRestaurant(name, location, province)) {
                    try {

                        this.idCountRest = 1;
                        while (existRestId(idCountRest)) {
                            this.idCountRest++;
                        }
                        boolean alreadyExists = new File(StringPath.PATH_REST_PHOTO + name + this.idCountRest + "/").exists();
                        if (!alreadyExists) {
                            File directorio = new File(StringPath.PATH_REST_PHOTO + name + this.idCountRest + "/");
                            directorio.mkdirs();
                        }
                        restaurants.add(new Restaurant(this.idCountRest + "", name, location, province));
                        jtfName.setText("");
                        jtfLocation.setText("");
                        jcbProvince.setSelectedIndex(0);
                        File outputfile = new File(StringPath.PATH_REST_PHOTO + name + this.idCountRest + "/" + archivoelegido.getName());
                        File outputfile2 = new File(StringPath.PATH_REST_PHOTO + name + this.idCountRest + "/" + name + ".jpg");//
                        if (outputfile2.exists()) {
                            outputfile2.delete();
                        }
                        ImageIO.write(bi, "png", outputfile);
                        boolean correcto = outputfile.renameTo(outputfile2);
                        if (correcto) {
                            jlInformation.setText("Agregado exitosamenteF");
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(CreateRestaurant.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    jlInformation.setText("El restaurante ya existe.");
                }

                // jlInformation.setText("NICE. " + idCountRest + jcbProvince.getSelectedItem().toString());
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        back();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbChargeImage;
    private javax.swing.JComboBox<String> jcbProvince;
    private javax.swing.JLabel jlDriverImage;
    private javax.swing.JLabel jlInformation;
    private javax.swing.JTextField jtfLocation;
    private javax.swing.JTextField jtfName;
    // End of variables declaration//GEN-END:variables

    /**
     * isMail evaluate if the String is an email.
     *
     * @param email email received the string input the text field for email
     * @return true if the String is a email and false if the String is not an
     * email
     */
    private boolean isDirectory() {
        File createDir = new File(StringPath.PATH_REST_PHOTO);

        if (createDir.mkdir()) {
            return false;//false porque el directorio ya existe
        }
        return true;//true cuando CREA directorio nuevo

    }

    private boolean existRestId(int id) {
        for (Iterator<Restaurant> iterator = restaurants.iterator(); iterator.hasNext();) {
            Restaurant restaurant = iterator.next();
            System.out.println(restaurant.getId());
            int restId = Integer.parseInt(restaurant.getId());
            if (restId == id) {
                return true;
            }
        }
        return false;
    }

    private boolean existRestaurant(String name, String location, String province) {
        for (Iterator<Restaurant> iterator = restaurants.iterator(); iterator.hasNext();) {
            Restaurant restaurant = iterator.next();
            if (restaurant.getName().equals(name) && restaurant.getProvince().equals(province) && restaurant.getLocation().equals(location)) {
                return true;
            }
        }
        return false;
    }

    private void back() {
        Algoritmos_Proyecto01_B16322_B31710_B67156.RESTAURANT_LIST = this.restaurants;
        this.dispose();
        AdminModule adminModule = new AdminModule();
        adminModule.setVisible(true);
    }
}
