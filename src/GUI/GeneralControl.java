/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ADT.Stack.LinkedStack;
import Domain.Order;
import Exceptions.StackException;
import GUI.CRUD.Order.ListOrder;
import Main.Algoritmos_Proyecto01_B16322_B31710_B67156;
import Utilities.GetDataById;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author Luis Cerdas Garita
 */
public class GeneralControl extends javax.swing.JFrame {

    /**
     * Creates new form GeneralControl
     */
    Document document = new Document();
    FileOutputStream ficheroPdf;
    DefaultTableModel model;
    LinkedStack orders;
    private File file;

    public GeneralControl() {
        initComponents();
        this.orders = Algoritmos_Proyecto01_B16322_B31710_B67156.ORDER_DETAIL_LIST;
        makeToFileXls(this.orders);
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
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton8.setText("Exportar a PDF");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Exportar a Excel");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
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
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8)
                            .addComponent(jButton9))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addContainerGap())
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.showSaveDialog(this);
            this.file = new File(chooser.getSelectedFile() + ".pdf");

            PdfWriter.getInstance(
                    document,
                    ficheroPdf).setInitialLeading(20);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        try {
            document.open();

            Paragraph paragraphTitulo = new Paragraph("REPORTE DEL SISTEMA DRIVER MEDICAL SERVICES\n\n\n");
            paragraphTitulo.setAlignment(1);
            document.add(paragraphTitulo);

            Paragraph paragraphDescripcion = new Paragraph("Este reporte contiene la informacion que posee registrada el sistema de los hospitales, con su respectivo codigo y ubicacion.\n"
                    + "Informacion necesaria para su funcionamiento. A solicitud del administrador se adjunta dicha informacion.\n\n");
            paragraphDescripcion.setAlignment(0);
            document.add(paragraphDescripcion);

            //se crea la tabla de los Hospitales
            PdfPTable tabla = new PdfPTable(3);
            //el numero indica la cantidad de Columnas
            PdfPCell celda = new PdfPCell(new Paragraph("Doctores registrados: "));
            celda.setColspan(3);
            //cantidad de columnas que ocupa esta celda
            celda.setRowspan(1);
            //cantidad de filas que ocupa esta celda

            tabla.addCell(celda);
            //en caso de que la lista de hospitales este vacia
            PdfPCell celda2 = new PdfPCell(new Paragraph("El sistema aun no posee registro alguno sobre ordenes"));
            celda2.setColspan(3);

            tabla.addCell("Cliente\n ");
            tabla.addCell("Número de Orden\n ");
            tabla.addCell("Agente\n ");
            tabla.addCell("Agente\n ");
            tabla.addCell("Fecha\n ");
            tabla.addCell("Provincica\n ");
            tabla.addCell("Direccion\n ");
            tabla.addCell("Conductor\n ");

//             model.addColumn("Cliente");
//        model.addColumn("Número de Orden");
//        model.addColumn("Agente");
//        model.addColumn("Fecha");
//        model.addColumn("Total");
//        model.addColumn("Provincica");
//        model.addColumn("Direccion");
//        model.addColumn("Conductor");
            
            while (!orders.isEmpty()) {
                Order order;
                GetDataById getDataById = new GetDataById();
                ArrayList<Order> tempOrder = new ArrayList<Order>();
                try {
                    if (!orders.isEmpty()) {
                    order = (Order) orders.pop();
                    tempOrder.add(order);
                    String nameClient = getDataById.getClientName(order.getClientId());
                    String nameDriver = getDataById.getDriverName(order.getClientId());
                    String[] exit = new String[]{nameClient, order.getId(), "Agente", order.getCurrentDate(), order.getTotal(), "Provincia", "Direccion Exacta", nameDriver};
                    tabla.addCell(exit[0]);
                    tabla.addCell(exit[1]);
                    tabla.addCell(exit[2]);
                    tabla.addCell(exit[3]);
                    tabla.addCell(exit[4]);
                    tabla.addCell(exit[5]);
                    tabla.addCell(exit[6]);
                    tabla.addCell(exit[7]);
                    
                    }else {
                tabla.addCell(celda2);
            }
                    

                } 
                catch (StackException ex) {
                    Logger.getLogger(AdminModule.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            // esto nos crea una tabla de 2 Columnas por dos Filas 
            document.add(tabla);
            document.add(new Paragraph(" \n \n \n "));
            //fin de tabla Hospitales

            Calendar calendar = new GregorianCalendar();
            Paragraph paragraphDescripcionFinal = new Paragraph("\n\nFinal del reporte\n"
                    + "______________________________________________________________________________"
                    + "\nFavor disponer correctamente del mismo."
                    + "\n" + calendar.getTime());
            paragraphDescripcionFinal.setAlignment(0);
            document.add(paragraphDescripcionFinal);
            document.close();
            JOptionPane.showMessageDialog(null, "Se creo el archivo .pdf correctamente.");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }


    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showSaveDialog(this);
        this.file = new File(chooser.getSelectedFile() + ".xls");
        try {
//Nuestro flujo de salida para apuntar a donde vamos a escribir 
            DataOutputStream out = new DataOutputStream(new FileOutputStream(file));

//Representa nuestro archivo en excel y necesita un OutputStream para saber donde va locoar los datos 
            WritableWorkbook w = Workbook.createWorkbook(out);
            WritableSheet s = w.createSheet("Hoja 1", 0);

            for (int i = 0; i < jTable1.getColumnCount(); i++) {
                for (int j = 0; j < jTable1.getRowCount(); j++) {
                    Object objeto = jTable1.getValueAt(j, i);
                    s.addCell(new Label(i, j, String.valueOf(objeto)));
                }
            }
//Como excel tiene muchas hojas esta crea o toma la hoja 
//Coloca el nombre del "tab" y el indice del tab 

            w.write();
//Cerramos el WritableWorkbook y DataOutputStream 
            w.close();
            out.close();
            JOptionPane.showMessageDialog(this, "Se ha creado el archivo correctamente");
//si todo sale bien salimos de aqui con un true  
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (WriteException ex) {
            Logger.getLogger(GeneralControl.class.getName()).log(Level.SEVERE, null, ex);
        }

//Si llegamos hasta aqui algo salio mal 

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        back();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void makeToFileXls(LinkedStack orders) {
        LinkedStack auxStack = new LinkedStack();
        model = new DefaultTableModel();

        model.addColumn("Cliente");
        model.addColumn("Número de Orden");
        model.addColumn("Agente");
        model.addColumn("Fecha");
        model.addColumn("Total");
        model.addColumn("Provincica");
        model.addColumn("Direccion");
        model.addColumn("Conductor");

        this.jTable1.setModel(model);

        if (!orders.isEmpty()) {
            GetDataById getDataById = new GetDataById();
            ArrayList<Order> tempOrder = new ArrayList<Order>();
            while (!orders.isEmpty()) {
                Order order;
                try {
                    order = (Order) orders.pop();
                    tempOrder.add(order);
                    String nameClient = getDataById.getClientName(order.getClientId());
                    String nameDriver = getDataById.getDriverName(order.getClientId());

                    model.addRow(new Object[]{nameClient, order.getId(), "Agente", order.getCurrentDate(), order.getTotal(), "Provincia", "Direccion Exacta", nameDriver});
                } catch (StackException ex) {
                    Logger.getLogger(AdminModule.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            for (int i = tempOrder.size() - 1; i >= 0; i--) {
                Order order1 = tempOrder.get(i);
                try {
                    orders.push(order1);
                } catch (StackException ex) {
                    Logger.getLogger(ListOrder.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//Fin metodo que llena la tabla

    private void back() {
        this.dispose();
        AdminModule adminModule = new AdminModule();
        adminModule.setVisible(true);
    }

//        if (!orders.isEmpty()) {
//            GetDataById getDataById = new GetDataById();
//            try {
//                for (int i = 0; i <= orders.getSize(); i++) {
//
//                    Order order = (Order) orders.pop();
//                    String nameClient = getDataById.getClientName(order.getClientId());
//                    String nameDriver = getDataById.getDriverName(order.getClientId());
//                    model.addRow(new Object[]{nameClient, order.getId(), "Agente", order.getCurrentDate(), order.getTotal(), "Provincia", "Direccion Exacta", nameDriver});
//                    Order auxOrder = new Order(order.getId(), order.getClientId(), order.getRestaurantId(), order.getProductoId(),
//                            order.getQuantity(), order.getTotal(), order.getCurrentDate());
//                    auxStack.push(auxOrder);
//                }
//                Order order = (Order) orders.pop();
//                String nameClient = getDataById.getClientName(order.getClientId());
//                String nameDriver = getDataById.getDriverName(order.getClientId());
//                model.addRow(new Object[]{nameClient, order.getId(), "Agente", order.getCurrentDate(), order.getTotal(), "Provincia", "Direccion Exacta", nameDriver});
//                Order auxOrder = new Order(order.getId(), order.getClientId(), order.getRestaurantId(), order.getProductoId(),
//                        order.getQuantity(), order.getTotal(), order.getCurrentDate());
//                auxStack.push(auxOrder);
//                Algoritmos_Proyecto01_B16322_B31710_B67156.ORDER_DETAIL_LIST = auxStack;
//            } catch (StackException ex) {
//                System.err.println("Error de lectura de las ordenes");
//            }
//        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
