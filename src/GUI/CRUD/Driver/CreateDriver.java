/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.CRUD.Driver;

import Domain.Driver;
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
public class CreateDriver extends javax.swing.JFrame {

    Queue drivers;
    BufferedImage bi;
    File archivoelegido;
    private boolean flag;

    /**
     * Creates new form CreateClient
     */
    public CreateDriver() {
        initComponents();
        this.drivers = Algoritmos_Proyecto01_B16322_B31710_B67156.DRIVER_QUEUE;
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
        jlError = new javax.swing.JLabel();
        jtfKindVehicle = new javax.swing.JTextField();
        jtfVehiclePlate = new javax.swing.JTextField();
        jtfPhoneNumber = new javax.swing.JTextField();
        jbSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfLastnameA = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfDni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jtfLastnameB = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jlDriverImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Crear Nuevo Agente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jlError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jtfKindVehicle.setText("  ");

        jtfVehiclePlate.setText(" ");

        jtfPhoneNumber.setText(" ");

        jbSave.setText("Guardar");
        jbSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSaveActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefono");

        jLabel7.setText("Placa");

        jLabel4.setText("Tipo de Vehiculo");

        jLabel3.setText("Edad");

        jLabel1.setText("Nombre:");

        jLabel8.setText("Cedula");

        jLabel2.setText("Apellido 1");

        jtfDni.setText(" ");

        jLabel6.setText("Apellido 2");

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Seleccionar Imagen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlDriverImage.setText(" ");
        jlDriverImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jDesktopPane1.setLayer(jlError, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfKindVehicle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfVehiclePlate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfPhoneNumber, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbSave, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfLastnameA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSpinner1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfLastnameB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlDriverImage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jButton2)
                .addGap(176, 176, 176)
                .addComponent(jbSave)
                .addGap(46, 218, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfName, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(jtfLastnameA)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jtfLastnameB))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfDni)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jlDriverImage, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7)))
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfVehiclePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(jtfKindVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jtfLastnameA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtfLastnameB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfKindVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtfVehiclePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlDriverImage, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addGap(85, 85, 85)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jbSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlError, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        back();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        back();
    }//GEN-LAST:event_formWindowClosing

    private void jbSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSaveActionPerformed
        try {

            if (flag == true && !jtfName.getText().trim().isEmpty()
                    && !jtfLastnameA.getText().trim().isEmpty()
                    && !jtfLastnameB.getText().trim().isEmpty()
                    && !jtfDni.getText().trim().isEmpty()
                    && (jSpinner1.getComponentCount() > 0)
                    && !jtfPhoneNumber.getText().trim().isEmpty()
                    && !jtfKindVehicle.getText().trim().isEmpty()
                    && !jtfVehiclePlate.getText().trim().isEmpty()
                    && !jtfPhoneNumber.getText().trim().isEmpty()) {
                if (isDirectory()) {
                    boolean alreadyExists = new File(StringPath.PATH_DRIVER_PHOTO).exists();
                    if (!alreadyExists) {
                        File directorio = new File(StringPath.PATH_DRIVER_PHOTO);
                        directorio.mkdirs();
                    }

                }

                int id = this.drivers.size() + 1;
                String name = jtfName.getText().trim();
                String lastNameA = jtfLastnameA.getText().trim();
                String lastNameB = jtfLastnameB.getText().trim();
                String age = jSpinner1.getComponentCount() + "";
                String kindVehicle = jtfKindVehicle.getText().trim();
                String phoneNumber = jtfPhoneNumber.getText().trim();
                String vehiclePlate = jtfVehiclePlate.getText().trim();
                String dni = jtfDni.getText().trim();

                if (!existDniDriver(dni) || !existPlateDriver(vehiclePlate)) {
                    this.drivers.add(new Driver(id + "", name, lastNameA, lastNameB, age, kindVehicle, phoneNumber, vehiclePlate, dni));
                    clearFields();
                    File outputfile = new File(StringPath.PATH_DRIVER_PHOTO + archivoelegido.getName());
                    File outputfile2 = new File(StringPath.PATH_DRIVER_PHOTO + dni + ".jpg");//

                    ImageIO.write(bi, "png", outputfile);
                    boolean correcto = outputfile.renameTo(outputfile2);
                    if (correcto) {
                    }
                }
            } else {
                jlError.setText("Debe llenar todos los datos y seleccionar una imagen");
            }
        } catch (IOException ex) {
            Logger.getLogger(CreateDriver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
                Logger.getLogger(CreateDriver.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (estado == JFileChooser.CANCEL_OPTION) {
            System.out.println("Cancel was selected");
            this.flag = false;
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton jbSave;
    private javax.swing.JLabel jlDriverImage;
    private javax.swing.JLabel jlError;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfKindVehicle;
    private javax.swing.JTextField jtfLastnameA;
    private javax.swing.JTextField jtfLastnameB;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfPhoneNumber;
    private javax.swing.JTextField jtfVehiclePlate;
    // End of variables declaration//GEN-END:variables

    /**
     * isMail evaluate if the String is an email.
     *
     * @param email email received the string input the text field for email
     * @return true if the String is a email and false if the String is not an
     * email
     */
    private void back() {
        Algoritmos_Proyecto01_B16322_B31710_B67156.DRIVER_QUEUE = this.drivers;
        this.dispose();
        AdminModule adminModule = new AdminModule();
        adminModule.setVisible(true);
    }

    private boolean isDirectory() {
        File createDir = new File(StringPath.PATH_DRIVER_PHOTO);

        if (createDir.mkdir()) {
            return false;//false porque el directorio ya existe
        }
        return true;//true cuando CREA directorio nuevo

    }

    private boolean existDniDriver(String dni) {
        for (Iterator iterator = this.drivers.iterator(); iterator.hasNext();) {
            Driver next = (Driver) iterator.next();
            if (next.getDni().equals(dni)) {
                JOptionPane.showMessageDialog(null, "Numero de cedula ya está registrado.");
                jtfDni.setText("");
                return true;
            }
        }
        return false;
    }

    private boolean existPlateDriver(String plate) {
        for (Iterator iterator = this.drivers.iterator(); iterator.hasNext();) {
            Driver next = (Driver) iterator.next();
            if (next.getVehiclePlate().equals(plate)) {
                jtfVehiclePlate.setText("");
                JOptionPane.showMessageDialog(null, "Numero placa ya está registrado.");
                return true;
            }
        }
        return false;
    }

    private void clearFields() {
        jtfDni.setText("");
        jtfName.setText("");
        jtfLastnameA.setText("");
        jtfLastnameB.getText().trim();
        jSpinner1.setValue(0);
        jtfKindVehicle.setText("");
        jtfPhoneNumber.setText("");
        jtfVehiclePlate.setText("");
    }
}
