/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.CRUD.Restaurant.Products;

import Domain.Products;
import Domain.Restaurant;
import Exceptions.ListException;
import GUI.AdminModule;
import Main.Algoritmos_Proyecto01_B16322_B31710_B67156;
import Utilities.GetDataById;
import Utilities.StringPath;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class UpdateProduct extends javax.swing.JFrame {

    private ArrayList<Products> allProducts = new ArrayList<>();
    private ArrayList<Restaurant> restaurants = new ArrayList<>();
    private int idCountProd;
    private BufferedImage bi;
    private File archivoelegido;
    private boolean flag;
    private String selectedProvince;
    private String selectedLocation;
    private ArrayList<String> arrayLocations;
    private TextAutoCompleter textAutocompleter;
    private Products modifiedProd;

    private Restaurant selectedRestaurant;

    /**
     * Creates new form CreateClient
     */
    public UpdateProduct() throws ListException {
        initComponents();
        this.allProducts = Algoritmos_Proyecto01_B16322_B31710_B67156.ALL_PRODUCTS_LIST;
        this.restaurants = Algoritmos_Proyecto01_B16322_B31710_B67156.RESTAURANT_LIST;
        this.idCountProd = 1;
        this.selectedLocation = new String();
        this.arrayLocations = new ArrayList<String>();
        this.selectedRestaurant = new Restaurant("", "", "", "");
        jcbLocation.addItem("Seleccione la Ubicacion");
        jcbLocation.setSelectedItem(0);
        jbUpdate.setEnabled(false);
        this.modifiedProd = new Products();
        textAutocompleter = new TextAutoCompleter(jtfProductName);
        textAutocompleter.setCaseSensitive(false);
        textAutocompleter.setMode(0);//para que el autocompletar busque el fragmento escrito este contenido en alguna parte de la busqueda

    }

    public UpdateProduct(Restaurant r) {
        initComponents();
        this.allProducts = Algoritmos_Proyecto01_B16322_B31710_B67156.ALL_PRODUCTS_LIST;
        this.idCountProd = 1;
        this.selectedRestaurant = r;
        jcbProvince.setSelectedItem(this.selectedRestaurant.getProvince());
        fillJCBLocation();
        jcbLocation.addItem("Seleccione la Ubicacion");
        jcbLocation.setSelectedItem(this.selectedRestaurant.getLocation() + "-" + this.selectedRestaurant.getName());

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
        jcbTypeProduct = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfPrice = new javax.swing.JTextField();
        jtfProductName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jbUpdate = new javax.swing.JButton();
        jcbProvince = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jcbLocation = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Crear Nuevo Agente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jlInformation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jcbTypeProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo de producto", "Bebidas", "Comida", "Postres", "Otros" }));
        jcbTypeProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTypeProductActionPerformed(evt);
            }
        });

        jLabel9.setText("Tipo");

        jLabel2.setText("Price:");

        jtfProductName.setText("zumo uva");

        jLabel1.setText("Nombre:");

        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jbUpdate.setText("Actualizar");
        jbUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUpdateActionPerformed(evt);
            }
        });

        jcbProvince.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la Provincia", "San José", "Alajuela", "Cartago", "Heredia", "Guanacaste", "Puntarenas", "Limón" }));
        jcbProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProvinceActionPerformed(evt);
            }
        });

        jLabel10.setText("Provincia:");

        jLabel11.setText("Restaurante:");

        jcbLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el Restaurante" }));
        jcbLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbLocationActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jlInformation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbTypeProduct, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfProductName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbUpdate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbProvince, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbLocation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jcbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jcbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(26, 26, 26)
                                .addComponent(jcbTypeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jtfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbUpdate)
                                        .addGap(28, 28, 28)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jlInformation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jcbTypeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(17, 17, 17)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbUpdate)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jlInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        back();
    }//GEN-LAST:event_formWindowClosing

    private void jbUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUpdateActionPerformed
        if (jtfProductName.getText().trim().isEmpty() || jtfPrice.getText().trim().isEmpty() || jcbTypeProduct.getSelectedIndex() == 0) {
            jlInformation.setText("Debe ingresar todos los datos.");
        } else {
            if (isDirectory()) {

                String[] p = this.selectedLocation.split("-");
                String location = p[0];
                String restaurantName = p[1];

                String productName = jtfProductName.getText().trim();
                String priceProduct = jtfPrice.getText().trim();
                int productType = jcbTypeProduct.getSelectedIndex() - 1;
                System.out.println("Loacation " + location + "   Name   " + restaurantName);
                GetDataById getDataById = new GetDataById();
                String idRestaurant = getDataById.getRestaurantIdByNameAndLocation(restaurantName, location, this.selectedProvince);
                Restaurant selectedRestaurant = getDataById.getRestaurantById(idRestaurant);

                if (!existProduct(productName, priceProduct, idRestaurant)) {

                    jtfProductName.setText("");
                    jtfPrice.setText("");
                    jcbTypeProduct.setSelectedIndex(0);
                    this.modifiedProd.setName(productName);
                    this.modifiedProd.setPrice(priceProduct);

                    jlInformation.setText("Modificado exitosamenteF");

                } else {
                    jlInformation.setText("El Producto ya existe.");
                }
            }
        }
    }//GEN-LAST:event_jbUpdateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        back();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jcbProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProvinceActionPerformed
        this.selectedProvince = jcbProvince.getSelectedItem().toString();
        fillJCBLocation();
//        JOptionPane.showMessageDialog(null, this.selectedProvince);
    }//GEN-LAST:event_jcbProvinceActionPerformed

    private void jcbLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbLocationActionPerformed
        this.selectedLocation = (String) jcbLocation.getSelectedItem();
        System.out.println(this.selectedLocation);
//        filJCBRestaurants(this.selectedLocation);
    }//GEN-LAST:event_jcbLocationActionPerformed

    private void jcbTypeProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTypeProductActionPerformed
        //   JOptionPane.showMessageDialog(null, jcbTypeProduct.getSelectedIndex());
    }//GEN-LAST:event_jcbTypeProductActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            searchProduct();
        } catch (ListException ex) {
            System.out.println(";;;;;;;;;;");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbUpdate;
    private javax.swing.JComboBox<String> jcbLocation;
    private javax.swing.JComboBox<String> jcbProvince;
    private javax.swing.JComboBox<String> jcbTypeProduct;
    private javax.swing.JLabel jlInformation;
    private javax.swing.JTextField jtfPrice;
    private javax.swing.JTextField jtfProductName;
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
        for (Products aProduct : allProducts) {
            System.out.println(aProduct.getId());
            int restId = Integer.parseInt(aProduct.getId());
            if (restId == id) {
                return true;
            }
        }
        return false;
    }

    private boolean existProduct(String name, String idRestaurant, String id) {
        for (Iterator<Products> iterator = allProducts.iterator(); iterator.hasNext();) {
            Products restaurant = iterator.next();
            if (restaurant.getName().equals(name) && restaurant.getId().equals(id) && restaurant.getIdRestaurant().equals(idRestaurant)) {
                return true;
            }
        }
        return false;
    }

    private void back() {
        Algoritmos_Proyecto01_B16322_B31710_B67156.ALL_PRODUCTS_LIST = this.allProducts;
        this.dispose();
        AdminModule adminModule = new AdminModule();
        adminModule.setVisible(true);
    }

    private void fillJCBLocation() {
        jcbLocation.removeAllItems();
        jcbLocation.addItem("Seleccione la Ubicacion");
        jcbLocation.setSelectedItem(0);
        ArrayList<String> locations = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            String location = restaurant.getLocation();
            String restName = restaurant.getName();
            System.out.println("LOCATIONS: " + location);
//            this.selectedProvince = jcbProvince.getSelectedItem().toString();
            if (locations.isEmpty() && (!locations.contains(location) && this.selectedProvince.equals(restaurant.getProvince()))) {
//                locations.add(location);
                locations.add(location + "-" + restName);
                System.out.println("LOCATIONS IF ELSE");

            } else if (!locations.contains(location) && this.selectedProvince.equals(restaurant.getProvince())) {
//                locations.add(location);
                locations.add(location + "-" + restName);
                System.out.println("LOCATIONS ELSE IF");
            }
        }
        for (String location : locations) {
            jcbLocation.addItem(location);
            this.arrayLocations.add(location);
        }
    }

    private void searchProduct() throws ListException {

        if (jcbLocation.getSelectedIndex() != 0 && jcbProvince.getSelectedIndex() != 0 && jcbTypeProduct.getSelectedIndex() != 0) {
            String[] p = this.selectedLocation.split("-");
            String location = p[0];
            String restaurantName = p[1];

            String productName = jtfProductName.getText().trim();
            int productType = jcbTypeProduct.getSelectedIndex() - 1;

//            System.out.println("Loacation " + location + "   Name   " + restaurantName);
            GetDataById getDataById = new GetDataById();
            String idRestaurant = getDataById.getRestaurantIdByNameAndLocation(restaurantName, location, this.selectedProvince);
            Restaurant selectedRestaurant = getDataById.getRestaurantById(idRestaurant);

            for (int q = 0; q < this.allProducts.size(); q++) {
                Products pp = this.allProducts.get(q);
                if (pp.getName().equals(productName) && idRestaurant.equals(pp.getIdRestaurant()) && pp.getTypeProduct().equals("0")) {
                    jtfPrice.setText(pp.getPrice());
                    this.modifiedProd = pp;
                    jbUpdate.setEnabled(true);
                    System.out.println("Product: " + pp.getName() + ". rest: " + pp.getIdRestaurant() + ". type: " + pp.getTypeProduct());
                } else if (pp.getName().equals(productName) && idRestaurant.equals(pp.getIdRestaurant()) && pp.getTypeProduct().equals("1")) {
                    jtfPrice.setText(pp.getPrice());
                    this.modifiedProd = pp;
                    jbUpdate.setEnabled(true);

                } else if (pp.getName().equals(productName) && idRestaurant.equals(pp.getIdRestaurant()) && pp.getTypeProduct().equals("2")) {
                    jtfPrice.setText(pp.getPrice());
                    this.modifiedProd = pp;
                    jbUpdate.setEnabled(true);

                } else if (pp.getName().equals(productName) && idRestaurant.equals(pp.getIdRestaurant()) && pp.getTypeProduct().equals("3")) {
                    jtfPrice.setText(pp.getPrice());
                    this.modifiedProd = pp;
                    jbUpdate.setEnabled(true);

                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar provincia, ubicacion-restaurante y provincia");
        }

    }

}
