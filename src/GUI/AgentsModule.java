/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ADT.LinkedList.DoubleLinkedCircularList;
import ADT.Node;
import ADT.Stack.LinkedStack;
import Data.AnyToArrayList;
import Data.SaveAll;
import Domain.Client;
import Domain.Driver;
import Domain.Order;
import Domain.Products;
import Domain.Restaurant;
import Domain.User;
import Exceptions.ListException;
import Exceptions.StackException;
import Main.Algoritmos_Proyecto01_B16322_B31710_B67156;
import Utilities.ImageManage;
import com.mxrck.autocompleter.AutoCompleterCallback;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @see Autocomplete
 * @see java-mail
 * @author Daniel Solano, Luis Cerdas, Jesus Torres
 */
public class AgentsModule extends javax.swing.JFrame implements Runnable {

    private int idOrder;
    private int idClient;
    private ArrayList<User> agents;
    private ArrayList<User> admin;
    private ArrayList<Restaurant> restaurants;
    private Queue<Driver> queueDriver;
    private LinkedList<Client> clientList;
    private DoubleLinkedCircularList drinksProductsList;
    private DoubleLinkedCircularList foodsProductsList;//foods desserts others
    private DoubleLinkedCircularList dessertsProductsList;
    private DoubleLinkedCircularList variousProductsList;
    private String hour;
    private String minutes;
    private String seconds;
    private String ampm;
    private String selectionString;
    private String Username;
    private String Subject;
    private String Mensage;
    private String PassWord;
    private String To;
    private String restaurant;
    private String dateOrder;
    private Thread thread;
    private Order order;
    private ImageManage resize = new ImageManage();
    private Products productsShow = new Products();
    private Products productsDrink0 = new Products();
    private Products productsDrink1 = new Products();
    private Products productsDrink2 = new Products();
    private Products productsDrink3 = new Products();
    private Products productsDrink4 = new Products();
    private Products productsDrink5 = new Products();
    private Products productsFood0 = new Products();
    private Products productsFood1 = new Products();
    private Products productsFood2 = new Products();
    private Products productsFood3 = new Products();
    private Products productsFood4 = new Products();
    private Products productsFood5 = new Products();
    private Products productsDesserts0 = new Products();
    private Products productsDesserts1 = new Products();
    private Products productsDesserts2 = new Products();
    private Products productsDesserts3 = new Products();
    private Products productsDesserts4 = new Products();
    private Products productsDesserts5 = new Products();
    private Products productsVarious0 = new Products();
    private Products productsVarious1 = new Products();
    private Products productsVarious2 = new Products();
    private Products productsVarious3 = new Products();
    private Products productsVarious4 = new Products();
    private Products productsVarious5 = new Products();
    private Driver driver0 = new Driver();
    private Driver driver1 = new Driver();
    private Driver driver2 = new Driver();
    private Driver driver3 = new Driver();
    private Driver driver4 = new Driver();
    private DefaultTableModel tableModel;
    private LinkedStack stackOrderPrin;
    private LinkedStack stackOrder;
    Node newNodeDrink;
    Node newNodeFood;
    Node newNodeDessert;
    Node newNodeVarious;
    private TextAutoCompleter textAutocompleter;
    private User agent;

    /**
     * Creates new form AgentsModule
     */
    public AgentsModule(User agent) {
        initComponents();
        this.agents = Algoritmos_Proyecto01_B16322_B31710_B67156.AGENT_LIST;
        this.admin = Algoritmos_Proyecto01_B16322_B31710_B67156.ADMIN_LIST;
        this.restaurants = Algoritmos_Proyecto01_B16322_B31710_B67156.RESTAURANT_LIST;
        this.clientList = Algoritmos_Proyecto01_B16322_B31710_B67156.CLIENT_LIST;
        this.stackOrderPrin = Algoritmos_Proyecto01_B16322_B31710_B67156.ORDER_DETAIL_LIST;
        this.stackOrder = new LinkedStack();
        this.agent = agent;
        restaurant = new String();
        jlAgentName.setText(agent.getName());
        jlAgentID.setText(agent.getCode());
        ImageIcon logo = new ImageIcon(getClass().getResource("/Resources/logo.jpg"));
        jlLogo.setIcon(resize.resizeImage100(logo));
        onOffLabel(false);
        loadImage();

        try {
            newNodeDrink = drinksProductsList.getNode(0);
            newNodeFood = foodsProductsList.getNode(0);
            newNodeDessert = dessertsProductsList.getNode(0);
            newNodeVarious = variousProductsList.getNode(0);
            addLabelDrinks(newNodeDrink);
            addLabelFood(newNodeFood);
            addLabelDesserts(newNodeDessert);
            addLabelVarious(newNodeVarious);
            addLabelDrivers();
        } catch (ListException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setResizable(false);
        dateAndTime();
        autoCompleter();//Este metodo debe ir siempre entre los ultimos del contructor

    }

    /**
     * This method is called Username within the constructor to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelProvincia = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTextFieldMail = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jcbProvince = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jcbProvinceRestaurant = new javax.swing.JComboBox<>();
        jcbLocation = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLDessert = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLVarios = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jlAgentName = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jlAgentID = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jlLogo = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jlDate = new javax.swing.JLabel();
        jlHour = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jConfirm = new javax.swing.JButton();
        jLabelDrinks1 = new javax.swing.JLabel();
        jLabelDrinks2 = new javax.swing.JLabel();
        jLabelDrinks3 = new javax.swing.JLabel();
        jLabelDrinks4 = new javax.swing.JLabel();
        jLabelDrinks0 = new javax.swing.JLabel();
        jLFood0 = new javax.swing.JLabel();
        jLFood1 = new javax.swing.JLabel();
        jLFood2 = new javax.swing.JLabel();
        jLFood3 = new javax.swing.JLabel();
        jLFood4 = new javax.swing.JLabel();
        jLDessert1 = new javax.swing.JLabel();
        jLDesserts2 = new javax.swing.JLabel();
        jLVarious1 = new javax.swing.JLabel();
        jLDesserts4 = new javax.swing.JLabel();
        jLDesserts3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLDessert0 = new javax.swing.JLabel();
        jLVarious2 = new javax.swing.JLabel();
        jLVarious3 = new javax.swing.JLabel();
        jLVarious4 = new javax.swing.JLabel();
        jLVarious0 = new javax.swing.JLabel();
        jbAumentar = new javax.swing.JButton();
        jbDisminuir = new javax.swing.JButton();
        jLDriver0 = new javax.swing.JLabel();
        jLDriver1 = new javax.swing.JLabel();
        jLDriver2 = new javax.swing.JLabel();
        jLDriver3 = new javax.swing.JLabel();
        jLDriver4 = new javax.swing.JLabel();
        jLDriverSelect = new javax.swing.JLabel();
        jBAtras = new javax.swing.JButton();
        jTFLastName2 = new javax.swing.JTextField();
        jTFLastName1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel de Control de Agente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agente");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Correo:");

        jLabel4.setText("Telefono:");

        jLabelProvincia.setText("Provincia: ");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jTextFieldMail.setText("dljeatsrun@gmail.com ");

        jcbProvince.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Provincia", "San Jose", "Alajuela", "Cartago", "Heredia", "Puntarenas", "Guanacaste", "Limon" }));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Restaurante");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jcbProvinceRestaurant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Provincia", "San Jose", "Alajuela", "Cartago", "Heredia", "Puntarenas", "Guanacaste", "Limon" }));
        jcbProvinceRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProvinceRestaurantActionPerformed(evt);
            }
        });

        jcbLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Restaurante - Ubicación" }));
        jcbLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbLocationActionPerformed(evt);
            }
        });

        jLabel9.setText("Bebidas:");

        jButton1.setText("=>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<=");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("<=");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("=>");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel10.setText("Comidas");

        jButton5.setText("<=");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("=>");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLDessert.setText("Postres");

        jButton7.setText("<=");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("=>");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLVarios.setText("Varios");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Cliente");
        jLabel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setText("Nombre:");

        jlAgentName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setText("Codigo:");

        jlAgentID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Orden:");
        jLabel18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlLogo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLogo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel21.setText("Fecha");

        jLabel22.setText("Hora:");

        jlDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlHour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurante", "Producto", "Monto", "Adicional"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel25.setText("Conductores:");

        jConfirm.setText("Confirmar");
        jConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfirmActionPerformed(evt);
            }
        });

        jLabelDrinks1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelDrinks1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelDrinks1MouseReleased(evt);
            }
        });

        jLabelDrinks2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelDrinks2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelDrinks2MouseReleased(evt);
            }
        });

        jLabelDrinks3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelDrinks3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelDrinks3MouseReleased(evt);
            }
        });

        jLabelDrinks4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelDrinks4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelDrinks4MouseReleased(evt);
            }
        });

        jLabelDrinks0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelDrinks0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelDrinks0MouseReleased(evt);
            }
        });

        jLFood0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLFood0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLFood0MouseReleased(evt);
            }
        });

        jLFood1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLFood1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLFood1MouseReleased(evt);
            }
        });

        jLFood2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLFood2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLFood2MouseReleased(evt);
            }
        });

        jLFood3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLFood3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLFood3MouseReleased(evt);
            }
        });

        jLFood4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLFood4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLFood4MouseReleased(evt);
            }
        });

        jLDessert1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLDessert1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLDessert1MouseReleased(evt);
            }
        });

        jLDesserts2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLDesserts2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLDesserts2MouseReleased(evt);
            }
        });

        jLVarious1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLVarious1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLVarious1MouseReleased(evt);
            }
        });

        jLDesserts4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLDesserts4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLDesserts4MouseReleased(evt);
            }
        });

        jLDesserts3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLDesserts3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLDesserts3MouseReleased(evt);
            }
        });

        jLabel5.setText("Dirección Exacta:");

        jTextField4.setText(" ");

        jLDessert0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLDessert0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLDessert0MouseReleased(evt);
            }
        });

        jLVarious2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLVarious2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLVarious2MouseReleased(evt);
            }
        });

        jLVarious3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLVarious3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLVarious3MouseReleased(evt);
            }
        });

        jLVarious4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLVarious4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLVarious4MouseReleased(evt);
            }
        });

        jLVarious0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLVarious0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLVarious0MouseReleased(evt);
            }
        });

        jbAumentar.setText("Aumentar");
        jbAumentar.setEnabled(false);
        jbAumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAumentarActionPerformed(evt);
            }
        });

        jbDisminuir.setText("Disminuir");
        jbDisminuir.setEnabled(false);
        jbDisminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDisminuirActionPerformed(evt);
            }
        });

        jLDriver0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLDriver1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLDriver2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLDriver3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLDriver4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLDriverSelect.setText("Conductor");

        jBAtras.setText("Atrás");
        jBAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtrasActionPerformed(evt);
            }
        });

        jLabel6.setText("Primer Apellido:");

        jLabel7.setText("Segundo Apellido:");

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabelProvincia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextFieldName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextFieldMail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextFieldPhone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbProvince, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbProvinceRestaurant, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbLocation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLDessert, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLVarios, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlAgentName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlAgentID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlLogo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlHour, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jConfirm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabelDrinks1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabelDrinks2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabelDrinks3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabelDrinks4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabelDrinks0, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLFood0, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLFood1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLFood2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLFood3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLFood4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLDessert1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLDesserts2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLVarious1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLDesserts4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLDesserts3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLDessert0, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLVarious2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLVarious3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLVarious4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLVarious0, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbAumentar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbDisminuir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLDriver0, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLDriver1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLDriver2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLDriver3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLDriver4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLDriverSelect, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBAtras, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTFLastName2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTFLastName1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLDessert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addGap(0, 115, Short.MAX_VALUE)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton5)
                                    .addComponent(jButton3)
                                    .addComponent(jButton2)
                                    .addComponent(jButton7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabelDrinks0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelDrinks1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelDrinks2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelDrinks3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelDrinks4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLFood0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLDessert0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLVarious0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                        .addComponent(jLFood1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLFood2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                        .addComponent(jLDessert1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLDesserts2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                        .addComponent(jLFood3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLFood4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                                        .addComponent(jLDesserts3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLDesserts4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jLVarious1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLVarious2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jButton6))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLVarios)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLVarious3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jLVarious4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton8))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(81, 81, 81)
                                                .addComponent(jTFLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addGap(15, 15, 15)
                                        .addComponent(jTFLastName2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11))
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                            .addComponent(jLabelProvincia)
                                            .addGap(410, 410, 410))
                                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(419, 419, 419))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(118, 118, 118)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jcbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel9))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jcbProvinceRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jcbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(160, 160, 160)))
                                .addComponent(jlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jLabel21)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jlDate, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jlHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(jLDriver0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLDriver1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLDriver2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLDriver3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLDriver4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(jLDriverSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jbAumentar)
                                            .addComponent(jbDisminuir)))))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jBAtras)
                                .addGap(18, 18, 18)
                                .addComponent(jConfirm)))
                        .addContainerGap())))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(15, 15, 15)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16)
                                        .addComponent(jlAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(jlAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jlDate, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jlHour, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jbAumentar)
                                .addGap(26, 26, 26)
                                .addComponent(jbDisminuir))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(13, 13, 13)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLDriver0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLDriver2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLDriver3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLDriver4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLDriver1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGap(30, 30, 30)
                        .addComponent(jLDriverSelect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jConfirm)
                            .addComponent(jBAtras))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jTFLastName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelProvincia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcbProvinceRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelDrinks2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelDrinks3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelDrinks1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelDrinks0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelDrinks4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(7, 7, 7)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFood0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFood1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFood2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFood3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFood4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLVarios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jLDessert)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLDessert1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLDesserts2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLDesserts3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLDesserts4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLDessert0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(3, 3, 3)))
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLVarious1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLVarious2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLVarious3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLVarious0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLVarious4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jDesktopPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        SaveAll saveAll = new SaveAll();
        saveAll.save();
    }//GEN-LAST:event_formWindowClosing

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            newNodeDrink = newNodeDrink.next;
            addLabelDrinks(newNodeDrink);
        } catch (ListException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            newNodeDrink = newNodeDrink.previoius;
            addLabelDrinks(newNodeDrink);
        } catch (ListException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabelDrinks0MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDrinks0MouseReleased
        productsShow = productsDrink0;
        dateOrder = "" + new Date();
        order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), "1", productsShow.getPrice(), dateOrder);
        try {
            Order ordertemp = orderExist(order.getProductoId());
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            } else {
                try {
                    stackOrder.push(order);
                } catch (StackException ex) {
                    Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jLabelDrinks0MouseReleased

    private void jLabelDrinks1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDrinks1MouseReleased
        productsShow = productsDrink1;
        dateOrder = "" + new Date();
        order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), "1", productsShow.getPrice(), dateOrder);
        try {
            Order ordertemp = orderExist(order.getProductoId());
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            } else {
                try {
                    stackOrder.push(order);
                } catch (StackException ex) {
                    Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelDrinks1MouseReleased

    private void jLabelDrinks2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDrinks2MouseReleased
        productsShow = productsDrink2;
        dateOrder = "" + new Date();
        order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), "1", productsShow.getPrice(),dateOrder);
        try {
            Order ordertemp = orderExist(order.getProductoId());
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            } else {
                try {
                    stackOrder.push(order);
                } catch (StackException ex) {
                    Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelDrinks2MouseReleased

    private void jLabelDrinks3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDrinks3MouseReleased
        productsShow = productsDrink3;
        dateOrder = "" + new Date();
        order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), "1", productsShow.getPrice(), dateOrder);
        try {
            Order ordertemp = orderExist(order.getProductoId());
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            } else {
                try {
                    stackOrder.push(order);
                } catch (StackException ex) {
                    Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelDrinks3MouseReleased

    private void jLabelDrinks4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDrinks4MouseReleased
        productsShow = productsDrink4;
        dateOrder = "" + new Date();
        order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), "1", productsShow.getPrice(), dateOrder);
        try {
            Order ordertemp = orderExist(order.getProductoId());
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            } else {
                try {
                    stackOrder.push(order);
                } catch (StackException ex) {
                    Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelDrinks4MouseReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //eventos de tabla
        int selection = jTable1.rowAtPoint(evt.getPoint());
        selectionString = "" + jTable1.getValueAt(selection, 1);
        if (selectionString != "") {
            jbAumentar.setEnabled(true);
            jbDisminuir.setEnabled(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbAumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAumentarActionPerformed
        // TODO add your handling code here:
        Order ordertemp;
        try {
            ordertemp = orderExist(selectionString);
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            }
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbAumentarActionPerformed

    private void jbDisminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDisminuirActionPerformed

        //diminuye la cantidad de productos
        Order ordertemp;
        try {
            ordertemp = orderExist(selectionString);
            if (ordertemp != null) {
                int cantidad = Integer.parseInt(ordertemp.getQuantity()) - 1;
                if (cantidad >= 1) {
                    ordertemp.setQuantity("" + cantidad);
                    int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                    ordertemp.setTotal("" + totalPrice);
                } else {
                    deleteOrder(selectionString);
                }

            }
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbDisminuirActionPerformed

    private void jLFood0MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLFood0MouseReleased
        productsShow = productsFood0;
        dateOrder = "" + new Date();
        order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), "1", productsShow.getPrice(), dateOrder);
        try {
            Order ordertemp = orderExist(order.getProductoId());
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            } else {
                try {
                    stackOrder.push(order);
                } catch (StackException ex) {
                    Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLFood0MouseReleased

    private void jLFood1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLFood1MouseReleased
        productsShow = productsFood1;
        dateOrder = "" + new Date();
        order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), "1", productsShow.getPrice(), dateOrder);
        try {
            Order ordertemp = orderExist(order.getProductoId());
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            } else {
                try {
                    stackOrder.push(order);
                } catch (StackException ex) {
                    Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLFood1MouseReleased

    private void jLFood2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLFood2MouseReleased
        productsShow = productsFood2;
        dateOrder = "" + new Date();
        order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), "1", productsShow.getPrice(), dateOrder);
        try {
            Order ordertemp = orderExist(order.getProductoId());
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            } else {
                try {
                    stackOrder.push(order);
                } catch (StackException ex) {
                    Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLFood2MouseReleased

    private void jLFood3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLFood3MouseReleased
        productsShow = productsFood3;
        dateOrder = "" + new Date();
        order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), "1", productsShow.getPrice(), dateOrder);
        try {
            Order ordertemp = orderExist(order.getProductoId());
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            } else {
                try {
                    stackOrder.push(order);
                } catch (StackException ex) {
                    Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLFood3MouseReleased

    private void jLFood4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLFood4MouseReleased
        productsShow = productsFood4;
        dateOrder = "" + new Date();
        order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), "1", productsShow.getPrice(), dateOrder);
        try {
            Order ordertemp = orderExist(order.getProductoId());
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            } else {
                try {
                    stackOrder.push(order);
                } catch (StackException ex) {
                    Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLFood4MouseReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        newNodeFood = newNodeFood.next;
        addLabelFood(newNodeFood);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        newNodeFood = newNodeFood.previoius;
        addLabelFood(newNodeFood);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLDessert0MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLDessert0MouseReleased
        productsShow = productsDesserts0;
        dateOrder = "" + new Date();
        order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), "1", productsShow.getPrice(), dateOrder);
        try {
            Order ordertemp = orderExist(order.getProductoId());
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            } else {
                try {
                    stackOrder.push(order);
                } catch (StackException ex) {
                    Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLDessert0MouseReleased

    private void jLDessert1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLDessert1MouseReleased
        productsShow = productsDesserts1;
        dateOrder = "" + new Date();
        order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), "1", productsShow.getPrice(), dateOrder);
        try {
            Order ordertemp = orderExist(order.getProductoId());
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            } else {
                try {
                    stackOrder.push(order);
                } catch (StackException ex) {
                    Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLDessert1MouseReleased

    private void jLDesserts2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLDesserts2MouseReleased
        productsShow = productsDesserts2;
        dateOrder = "" + new Date();
        order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), "1", productsShow.getPrice(), dateOrder);
        try {
            Order ordertemp = orderExist(order.getProductoId());
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            } else {
                try {
                    stackOrder.push(order);
                } catch (StackException ex) {
                    Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLDesserts2MouseReleased

    private void jLDesserts3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLDesserts3MouseReleased
        productsShow = productsDesserts3;
        dateOrder = "" + new Date();
        order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), "1", productsShow.getPrice(), dateOrder);
        try {
            Order ordertemp = orderExist(order.getProductoId());
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            } else {
                try {
                    stackOrder.push(order);
                } catch (StackException ex) {
                    Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLDesserts3MouseReleased

    private void jLDesserts4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLDesserts4MouseReleased
        productsShow = productsDesserts4;
        dateOrder = "" + new Date();
        order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), "1", productsShow.getPrice(), dateOrder);
        try {
            Order ordertemp = orderExist(order.getProductoId());
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            } else {
                try {
                    stackOrder.push(order);
                } catch (StackException ex) {
                    Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLDesserts4MouseReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        newNodeDessert = newNodeDessert.next;
        addLabelDesserts(newNodeDessert);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        newNodeDessert = newNodeDessert.previoius;
        addLabelDesserts(newNodeDessert);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        newNodeVarious = newNodeVarious.next;
        addLabelVarious(newNodeVarious);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        newNodeVarious = newNodeVarious.previoius;
        addLabelVarious(newNodeVarious);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jLVarious0MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLVarious0MouseReleased
        productsShow = productsVarious0;
        dateOrder = "" + new Date();
        order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), "1", productsShow.getPrice(), dateOrder);
        try {
            Order ordertemp = orderExist(order.getProductoId());
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            } else {
                try {
                    stackOrder.push(order);
                } catch (StackException ex) {
                    Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLVarious0MouseReleased

    private void jLVarious1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLVarious1MouseReleased
        productsShow = productsVarious1;
        dateOrder = "" + new Date();
        order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), "1", productsShow.getPrice(), dateOrder);
        try {
            Order ordertemp = orderExist(order.getProductoId());
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            } else {
                try {
                    stackOrder.push(order);
                } catch (StackException ex) {
                    Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLVarious1MouseReleased

    private void jLVarious2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLVarious2MouseReleased
        productsShow = productsVarious2;
        dateOrder = "" + new Date();
        order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), "1", productsShow.getPrice(), dateOrder);
        try {
            Order ordertemp = orderExist(order.getProductoId());
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            } else {
                try {
                    stackOrder.push(order);
                } catch (StackException ex) {
                    Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLVarious2MouseReleased

    private void jLVarious3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLVarious3MouseReleased
        productsShow = productsVarious3;
        dateOrder = "" + new Date();
        order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), "1", productsShow.getPrice(), dateOrder);
        try {
            Order ordertemp = orderExist(order.getProductoId());
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            } else {
                try {
                    stackOrder.push(order);
                } catch (StackException ex) {
                    Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLVarious3MouseReleased

    private void jLVarious4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLVarious4MouseReleased
        productsShow = productsVarious4;
        dateOrder = "" + new Date();
        order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), "1", productsShow.getPrice(), dateOrder);
        try {
            Order ordertemp = orderExist(order.getProductoId());
            if (ordertemp != null) {
                int cantidad = 1 + Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setQuantity("" + cantidad);
                int totalPrice = Integer.parseInt(productsShow.getPrice()) * Integer.parseInt(ordertemp.getQuantity());
                ordertemp.setTotal("" + totalPrice);
            } else {
                try {
                    stackOrder.push(order);
                } catch (StackException ex) {
                    Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showTable();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLVarious4MouseReleased

    private void jConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfirmActionPerformed
        queueDriver.add(queueDriver.poll());
        addLabelDrivers();
        autoCompleter();
        onOffLabel(false);
        try {
            order = new Order(idOrder + "", jTextFieldName.getText(), restaurant, productsShow.getName(), orderQuantity() + "", orderTotal() + "", dateOrder);
            getInfoClient();
            Algoritmos_Proyecto01_B16322_B31710_B67156.ORDER_DETAIL_LIST = stackOrderPrin;
            resetSpaces();
            validIdOrder();
        } catch (StackException ex) {
            Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jConfirmActionPerformed

    private void jBAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtrasActionPerformed
        Login login = new Login();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_jBAtrasActionPerformed

    private void jcbProvinceRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProvinceRestaurantActionPerformed
        loadRestaurant();
    }//GEN-LAST:event_jcbProvinceRestaurantActionPerformed

    private void jcbLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbLocationActionPerformed
        restaurant = (String) jcbLocation.getSelectedItem();
        onOffLabel(true);
    }//GEN-LAST:event_jcbLocationActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtras;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jConfirm;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLDessert;
    private javax.swing.JLabel jLDessert0;
    private javax.swing.JLabel jLDessert1;
    private javax.swing.JLabel jLDesserts2;
    private javax.swing.JLabel jLDesserts3;
    private javax.swing.JLabel jLDesserts4;
    private javax.swing.JLabel jLDriver0;
    private javax.swing.JLabel jLDriver1;
    private javax.swing.JLabel jLDriver2;
    private javax.swing.JLabel jLDriver3;
    private javax.swing.JLabel jLDriver4;
    private javax.swing.JLabel jLDriverSelect;
    private javax.swing.JLabel jLFood0;
    private javax.swing.JLabel jLFood1;
    private javax.swing.JLabel jLFood2;
    private javax.swing.JLabel jLFood3;
    private javax.swing.JLabel jLFood4;
    private javax.swing.JLabel jLVarios;
    private javax.swing.JLabel jLVarious0;
    private javax.swing.JLabel jLVarious1;
    private javax.swing.JLabel jLVarious2;
    private javax.swing.JLabel jLVarious3;
    private javax.swing.JLabel jLVarious4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDrinks0;
    private javax.swing.JLabel jLabelDrinks1;
    private javax.swing.JLabel jLabelDrinks2;
    private javax.swing.JLabel jLabelDrinks3;
    private javax.swing.JLabel jLabelDrinks4;
    private javax.swing.JLabel jLabelProvincia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTFLastName1;
    private javax.swing.JTextField jTFLastName2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JButton jbAumentar;
    private javax.swing.JButton jbDisminuir;
    private javax.swing.JComboBox<String> jcbLocation;
    private javax.swing.JComboBox<String> jcbProvince;
    private javax.swing.JComboBox<String> jcbProvinceRestaurant;
    private javax.swing.JLabel jlAgentID;
    private javax.swing.JLabel jlAgentName;
    private javax.swing.JLabel jlDate;
    private javax.swing.JLabel jlHour;
    private javax.swing.JLabel jlLogo;
    // End of variables declaration//GEN-END:variables
 @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == thread) {
            calculate();
            jlHour.setText(hour + ":" + minutes + ":" + seconds + " " + ampm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    /**
     * Método que calcula la hora actual
     */
    public void calculate() {
        Calendar calendar = new GregorianCalendar();
        Date dateAndTimeNow = new Date();

        calendar.setTime(dateAndTimeNow);
        ampm = calendar.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        if (ampm.equals("PM")) {
            int h = calendar.get(Calendar.HOUR_OF_DAY) - 12;
            hour = h > 9 ? "" + h : "0" + h;
        } else {
            hour = calendar.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendar.get(Calendar.HOUR_OF_DAY) : "0" + calendar.get(Calendar.HOUR_OF_DAY);
        }
        minutes = calendar.get(Calendar.MINUTE) > 9 ? "" + calendar.get(Calendar.MINUTE) : "0" + calendar.get(Calendar.MINUTE);
        seconds = calendar.get(Calendar.SECOND) > 9 ? "" + calendar.get(Calendar.SECOND) : "0" + calendar.get(Calendar.SECOND);
    }

    /**
     * Método que muestra la fecha y hora actual
     */
    private void dateAndTime() {
        Calendar c = Calendar.getInstance();
        String day = Integer.toString(c.get(Calendar.DATE));
        String month = Integer.toString(c.get(Calendar.MONTH));
        String year = Integer.toString(c.get(Calendar.YEAR));
        jlDate.setText(day + " / " + month + " / " + year + " / ");

        thread = new Thread(this);
        thread.start();
    }

    private void loadImage() {
        drinksProductsList = new DoubleLinkedCircularList();
        foodsProductsList = new DoubleLinkedCircularList();
        dessertsProductsList = new DoubleLinkedCircularList();
        variousProductsList = new DoubleLinkedCircularList();
        queueDriver = new LinkedList<Driver>();

        productsDrink0.setId("sin DNI");
        productsDrink0.setName("Zarza");
        productsDrink0.setPrice(1000 + "");
        productsDrink0.setTypeProduct(0 + "");
        productsDrink0.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/bebida0.jpg")));
        drinksProductsList.insert(productsDrink0);

        productsDrink1.setId("sin DNI 1");
        productsDrink1.setName("Fanta Colita");
        productsDrink1.setPrice(100 + "");
        productsDrink1.setTypeProduct(1 + "");
        productsDrink1.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/bebida1.jpg")));
        drinksProductsList.insert(productsDrink1);

        productsDrink2.setId("sin DNI 1");
        productsDrink2.setName("Cerveza");
        productsDrink2.setPrice(800 + "");
        productsDrink2.setTypeProduct(2 + "");
        productsDrink2.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/bebida2.jpg")));
        drinksProductsList.insert(productsDrink2);

        productsDrink3.setId("sin DNI 1");
        productsDrink3.setName("Sprite");
        productsDrink3.setPrice(900 + "");
        productsDrink3.setTypeProduct(3 + "");
        productsDrink3.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/bebida3.jpg")));
        drinksProductsList.insert(productsDrink3);

        productsDrink4.setId("sin DNI 1");
        productsDrink4.setName("Fanta");
        productsDrink4.setPrice(900 + "");
        productsDrink4.setTypeProduct(4 + "");
        productsDrink4.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/bebida4.jpg")));
        drinksProductsList.insert(productsDrink4);

        productsDrink5.setId("sin DNI 1");
        productsDrink5.setName("Coca Cola");
        productsDrink5.setPrice(900 + "");
        productsDrink5.setTypeProduct(1 + "");
        productsDrink5.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/bebida5.jpg")));
        drinksProductsList.insert(productsDrink5);
        /////////////////////////////////////////////lista de comidas///////////////////////////////////////////////77
        productsFood0.setId("sin DNI");
        productsFood0.setName("Hamburquesa");
        productsFood0.setPrice(1000 + "");
        productsFood0.setTypeProduct(0 + "");
        productsFood0.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/comida0.jpg")));
        foodsProductsList.insert(productsFood0);

        productsFood1.setId("sin DNI 1");
        productsFood1.setName("Papas Fritas");
        productsFood1.setPrice(900 + "");
        productsFood1.setTypeProduct(1 + "");
        productsFood1.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/comida1.jpg")));
        foodsProductsList.insert(productsFood1);

        productsFood2.setId("sin DNI 1");
        productsFood2.setName("Pizza");
        productsFood2.setPrice(1200 + "");
        productsFood2.setTypeProduct(2 + "");
        productsFood2.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/comida2.jpg")));
        foodsProductsList.insert(productsFood2);

        productsFood3.setId("sin DNI 1");
        productsFood3.setName("Pollo");
        productsFood3.setPrice(900 + "");
        productsFood3.setTypeProduct(3 + "");
        productsFood3.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/comida3.jpg")));
        foodsProductsList.insert(productsFood3);

        productsFood4.setId("sin DNI 1");
        productsFood4.setName("Pure");
        productsFood4.setPrice(900 + "");
        productsFood4.setTypeProduct(4 + "");
        productsFood4.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/comida4.jpg")));
        foodsProductsList.insert(productsFood4);

        productsFood5.setId("sin DNI 1");
        productsFood5.setName("Sandwich");
        productsFood5.setPrice(900 + "");
        productsFood5.setTypeProduct(1 + "");
        productsFood5.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/comida5.jpg")));
        foodsProductsList.insert(productsFood5);

        ////////////////////////////////////////////////postres /////////////////////////////////////////////
        productsDesserts0.setId("sin DNI");
        productsDesserts0.setName("Postre de Fresa");
        productsDesserts0.setPrice(1000 + "");
        productsDesserts0.setTypeProduct(0 + "");
        productsDesserts0.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/postre0.jpg")));
        dessertsProductsList.insert(productsDesserts0);

        productsDesserts1.setId("sin DNI 1");
        productsDesserts1.setName("Chocolate");
        productsDesserts1.setPrice(900 + "");
        productsDesserts1.setTypeProduct(1 + "");
        productsDesserts1.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/postre1.jpg")));
        dessertsProductsList.insert(productsDesserts1);

        productsDesserts2.setId("sin DNI 1");
        productsDesserts2.setName("Muffin");
        productsDesserts2.setPrice(1200 + "");
        productsDesserts2.setTypeProduct(2 + "");
        productsDesserts2.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/postre2.jpg")));
        dessertsProductsList.insert(productsDesserts2);

        productsDesserts3.setId("sin DNI 1");
        productsDesserts3.setName("Flan");
        productsDesserts3.setPrice(900 + "");
        productsDesserts3.setTypeProduct(3 + "");
        productsDesserts3.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/postre3.jpg")));
        dessertsProductsList.insert(productsDesserts3);

        productsDesserts4.setId("sin DNI 1");
        productsDesserts4.setName("Arroz con leche");
        productsDesserts4.setPrice(900 + "");
        productsDesserts4.setTypeProduct(4 + "");
        productsDesserts4.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/postre4.jpg")));
        dessertsProductsList.insert(productsDesserts4);

        productsDesserts5.setId("sin DNI 1");
        productsDesserts5.setName("Helado");
        productsDesserts5.setPrice(900 + "");
        productsDesserts5.setTypeProduct(1 + "");
        productsDesserts5.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/postre5.jpg")));
        dessertsProductsList.insert(productsDesserts5);

        ////////////////////////////////////////////////////varios/////////////////////////////////////////
        productsVarious0.setId("sin DNI");
        productsVarious0.setName("Postre de Fresa");
        productsVarious0.setPrice(1000 + "");
        productsVarious0.setTypeProduct(0 + "");
        productsVarious0.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/postre0.jpg")));
        variousProductsList.insert(productsVarious0);

        productsVarious1.setId("sin DNI 1");
        productsVarious1.setName("Chocolate");
        productsVarious1.setPrice(900 + "");
        productsVarious1.setTypeProduct(1 + "");
        productsVarious1.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/postre1.jpg")));
        variousProductsList.insert(productsVarious1);

        productsVarious2.setId("sin DNI 1");
        productsVarious2.setName("Muffin");
        productsVarious2.setPrice(1200 + "");
        productsVarious2.setTypeProduct(2 + "");
        productsVarious2.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/postre2.jpg")));
        variousProductsList.insert(productsVarious2);

        productsVarious3.setId("sin DNI 1");
        productsVarious3.setName("Flan");
        productsVarious3.setPrice(900 + "");
        productsVarious3.setTypeProduct(3 + "");
        productsVarious3.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/postre3.jpg")));
        variousProductsList.insert(productsVarious3);

        productsVarious4.setId("sin DNI 1");
        productsDesserts4.setName("Arroz con leche");
        productsDesserts4.setPrice(900 + "");
        productsDesserts4.setTypeProduct(4 + "");
        productsDesserts4.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/postre4.jpg")));
        variousProductsList.insert(productsDesserts4);

        productsVarious5.setId("sin DNI 1");
        productsVarious5.setName("Helado");
        productsVarious5.setPrice(900 + "");
        productsVarious5.setTypeProduct(1 + "");
        productsVarious5.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/postre5.jpg")));
        variousProductsList.insert(productsVarious5);

        /////////////////////////////////////////carga cola conductores /////////////////////////////////
        driver0.setId("ID");
        driver0.setName("Juan");
        driver0.setLastNameA("Valdez");
        driver0.setLastNameB("Estrada");
        driver0.setAge("29");
        driver0.setKindVehicle("moto");
        driver0.setPhoneNumber("111");
        driver0.setVehiclePlate("111");
        driver0.setDni("111");
        driver0.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/conductor0.jpg")));
        queueDriver.add(driver0);

        driver1.setId("ID");
        driver1.setName("Pedro");
        driver1.setLastNameA("Nuñez");
        driver1.setLastNameB("Nacamoto");
        driver1.setAge("36");
        driver1.setKindVehicle("sedan");
        driver1.setPhoneNumber("222");
        driver1.setVehiclePlate("222");
        driver1.setDni("222");
        driver1.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/conductor1.jpg")));
        queueDriver.add(driver1);

        driver2.setId("ID");
        driver2.setName("Mafred");
        driver2.setLastNameA("Bolaños");
        driver2.setLastNameB("Prado");
        driver2.setAge("70");
        driver2.setKindVehicle("Pesado");
        driver2.setPhoneNumber("333");
        driver2.setVehiclePlate("333");
        driver2.setDni("333");
        driver2.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/conductor2.jpg")));
        queueDriver.add(driver2);

        driver3.setId("ID");
        driver3.setName("Juliana");
        driver3.setLastNameA("Perez");
        driver3.setLastNameB("Galdoz");
        driver3.setAge("30");
        driver3.setKindVehicle("4X4");
        driver3.setPhoneNumber("444");
        driver3.setVehiclePlate("444");
        driver3.setDni("444");
        driver3.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/conductor3.jpg")));
        queueDriver.add(driver3);

        driver4.setId("ID");
        driver4.setName("Maria");
        driver4.setLastNameA("Uva");
        driver4.setLastNameB("Mena");
        driver4.setAge("40");
        driver4.setKindVehicle("Sedan");
        driver4.setPhoneNumber("555");
        driver4.setVehiclePlate("555");
        driver4.setDni("555");
        driver4.setImageIcon(new ImageIcon(getClass().getResource("/FoodImagesA/conductor4.jpg")));
        queueDriver.add(driver4);

    }

    /**
     * Método que permite ingresar los objetos e imagenes a los label Bebidas
     *
     * @param newNode
     * @throws ListException
     */
    private void addLabelDrinks(Node newNode) throws ListException {
        productsDrink0 = (Products) newNode.element;
        productsDrink1 = (Products) newNode.next.element;
        productsDrink2 = (Products) newNode.next.next.element;
        productsDrink3 = (Products) newNode.next.next.next.element;
        productsDrink4 = (Products) newNode.next.next.next.next.element;
        productsDrink5 = (Products) newNode.next.next.next.next.next.element;

        jLabelDrinks0.setIcon(resize.resizeImage(productsDrink0.getImageIcon()));
        jLabelDrinks1.setIcon(resize.resizeImage(productsDrink1.getImageIcon()));
        jLabelDrinks2.setIcon(resize.resizeImage(productsDrink2.getImageIcon()));
        jLabelDrinks3.setIcon(resize.resizeImage(productsDrink3.getImageIcon()));
        jLabelDrinks4.setIcon(resize.resizeImage(productsDrink4.getImageIcon()));
    }

    /**
     * Método que permite ingresar los objetos e imagenes a los label Comidas
     *
     * @param newNodeFood
     */
    private void addLabelFood(Node newNodeFood) {
        productsFood0 = (Products) newNodeFood.element;
        productsFood1 = (Products) newNodeFood.next.element;
        productsFood2 = (Products) newNodeFood.next.next.element;
        productsFood3 = (Products) newNodeFood.next.next.next.element;
        productsFood4 = (Products) newNodeFood.next.next.next.next.element;
        productsFood5 = (Products) newNodeFood.next.next.next.next.next.element;

        jLFood0.setIcon(resize.resizeImage(productsFood0.getImageIcon()));
        jLFood1.setIcon(resize.resizeImage(productsFood1.getImageIcon()));
        jLFood2.setIcon(resize.resizeImage(productsFood2.getImageIcon()));
        jLFood3.setIcon(resize.resizeImage(productsFood3.getImageIcon()));
        jLFood4.setIcon(resize.resizeImage(productsFood4.getImageIcon()));
    }

    /**
     * Método que permite ingresar los objetos e imagenes a los label Postres
     *
     * @param newNodeDeserts
     */
    private void addLabelDesserts(Node newNodeDeserts) {
        productsDesserts0 = (Products) newNodeDeserts.element;
        productsDesserts1 = (Products) newNodeDeserts.next.element;
        productsDesserts2 = (Products) newNodeDeserts.next.next.element;
        productsDesserts3 = (Products) newNodeDeserts.next.next.next.element;
        productsDesserts4 = (Products) newNodeDeserts.next.next.next.next.element;
        productsDesserts5 = (Products) newNodeDeserts.next.next.next.next.next.element;

        jLDessert0.setIcon(resize.resizeImage(productsDesserts0.getImageIcon()));
        jLDessert1.setIcon(resize.resizeImage(productsDesserts1.getImageIcon()));
        jLDesserts2.setIcon(resize.resizeImage(productsDesserts2.getImageIcon()));
        jLDesserts3.setIcon(resize.resizeImage(productsDesserts3.getImageIcon()));
        jLDesserts4.setIcon(resize.resizeImage(productsDesserts4.getImageIcon()));
    }

    /**
     * Método que permite ingresar los objetos e imagenes a los label Varios
     *
     * @param newNodeVarious
     */
    private void addLabelVarious(Node newNodeVarious) {
        productsVarious0 = (Products) newNodeVarious.element;
        productsVarious1 = (Products) newNodeVarious.next.element;
        productsVarious2 = (Products) newNodeVarious.next.next.element;
        productsVarious3 = (Products) newNodeVarious.next.next.next.element;
        productsVarious4 = (Products) newNodeVarious.next.next.next.next.element;
        productsVarious5 = (Products) newNodeVarious.next.next.next.next.next.element;

        jLVarious0.setIcon(resize.resizeImage(productsVarious0.getImageIcon()));
        jLVarious1.setIcon(resize.resizeImage(productsVarious1.getImageIcon()));
        jLVarious2.setIcon(resize.resizeImage(productsVarious2.getImageIcon()));
        jLVarious3.setIcon(resize.resizeImage(productsVarious3.getImageIcon()));
        jLVarious4.setIcon(resize.resizeImage(productsVarious4.getImageIcon()));
    }

    /**
     * Método que permite ingresar los objetos e imagenes a los label
     * Conductores
     */
    private void addLabelDrivers() {
        driver0 = queueDriver.poll();
        driver1 = queueDriver.poll();
        driver2 = queueDriver.poll();
        driver3 = queueDriver.poll();
        driver4 = queueDriver.poll();

        jLDriver0.setIcon(resize.resizeImage(driver0.getImageIcon()));
        jLDriver1.setIcon(resize.resizeImage(driver1.getImageIcon()));
        jLDriver2.setIcon(resize.resizeImage(driver2.getImageIcon()));
        jLDriver3.setIcon(resize.resizeImage(driver3.getImageIcon()));
        jLDriver4.setIcon(resize.resizeImage(driver4.getImageIcon()));

        queueDriver.add(driver0);
        queueDriver.add(driver1);
        queueDriver.add(driver2);
        queueDriver.add(driver3);
        queueDriver.add(driver4);
    }

    /**
     * Método que muestra la tabla con loas ordenes ingresadas
     *
     * @throws StackException
     */
    private void showTable() throws StackException {
        this.tableModel = new DefaultTableModel();
        this.tableModel.addColumn("Restaurante");
        this.tableModel.addColumn("Producto");
        this.tableModel.addColumn("Monto");
        this.tableModel.addColumn("Cantidad");
        this.jTable1.setModel(tableModel);
        LinkedStack orderTempStack = new LinkedStack();
        //Muestra la pila en el table model creando una pila temporal para el intercambio de datos
        while (!stackOrder.isEmpty()) {
            Order orderTemp = new Order();
            orderTemp = (Order) stackOrder.pop();
            tableModel.addRow(new Object[]{orderTemp.getRestaurantId(), orderTemp.getProductoId(),
                orderTemp.getTotal(), orderTemp.getQuantity()});
            orderTempStack.push(orderTemp);
        }
        //Reordenamiento de la pila temporar a la Principal
        while (!orderTempStack.isEmpty()) {
            stackOrder.push(orderTempStack.pop());
        }
    }

    /**
     * Método que determina si existe o no una orden igual a las ya ingresadas
     *
     * @param order
     * @return
     * @throws StackException
     */
    private Order orderExist(String order) throws StackException {
        Order exist = null;
        LinkedStack stackTemp = new LinkedStack();
        Order orderTemp = new Order();
        while (!stackOrder.isEmpty()) {

            orderTemp = (Order) stackOrder.pop();
            if (order.equals(orderTemp.getProductoId())) {
                exist = orderTemp;
            }
            stackTemp.push(orderTemp);
        }
        //Reordenamiento de la pila temporar a la Principal
        while (!stackTemp.isEmpty()) {
            stackOrder.push(stackTemp.pop());
        }
        return exist;
    }

    /**
     * Método que permite omitir una orden para no ser tomada mas en cuenta
     *
     * @param order
     * @throws StackException
     */
    private void deleteOrder(String order) throws StackException {
        LinkedStack stackTemp = new LinkedStack();
        while (!stackOrder.isEmpty()) {
            Order orderTemp = new Order();
            orderTemp = (Order) stackOrder.pop();
            if (!order.equals(orderTemp.getProductoId())) {
                stackTemp.push(orderTemp);
            }
        }
        while (!stackTemp.isEmpty()) {
            stackOrder.push(stackTemp.pop());
        }
    }

    /**
     * Método que extrae los datos del cliente y guarda en el LinkedList
     */
    private void getInfoClient() throws StackException {
        Client client = new Client();
        validIdClient();
        client.setId(idClient + "");
        client.setName(jTextFieldName.getText());
        client.setLastNameA(jTFLastName1.getText());
        client.setLastNameB(jTFLastName2.getText());
        client.setMail(jTextFieldMail.getText());
        client.setPhoneNumber(jTextFieldPhone.getText());
        client.setProvince((String) jcbProvince.getSelectedItem());
        client.setExactAddress(jTextField4.getText());
        clientList.add(client);

        Username = "dljeatsrun@gmail.com";
        Subject = "Hola " + client.getName() + ", DJL FASTFOOD, muestra el detalle de tu pedido";
        Mensage = concatMessage(client);
        PassWord = "dljproyect";
        To = client.getMail();
        SendMail();
    }

    /**
     * Método que permite enviar un menseje por mail
     */
    public void SendMail() {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(Username, PassWord);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(Username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(To));
            message.setSubject(Subject);
            message.setText(Mensage);

            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Su mensaje ha sido enviado");

        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, "Correo inexistente");
        }
    }

    /**
     * Método que une la cadena de texto para el envío del mensaje
     *
     * @param client
     * @return
     */
    private String concatMessage(Client client) throws StackException {
        String message = "";
//
        message += client.getName() + ", DJL FAST FOOD se complace de compartirle el detalle de la orden"
                + "\n\nOrden: " + order.getId()
                + "\nFecha: " + order.getCurrentDate()
                + "\nAgente: " + agent.getName()
                + "\n\n\nCompra: " + concatDetailOrder()
                + "\n\nMonto Total: " + order.getTotal()
                + "\n\n\nProvincia: " + jcbProvince.getSelectedItem()
                + "\nRestaurante: " + restaurant
                + "\nConductor: " + driver0.getName() + driver0.getLastNameA()
                + "\n\n\n\nLa tarifa no incluye cargos que puede cobrar su banco."
                + "Si tiene preguntas, consulte directamente a su banco";
        return message;
    }

    /**
     * Método que ingresa los objetos al autocomplete para una futura seleccion
     */
    private void uploadSearchByClientMail() {
        LinkedList<Client> clientsList = this.clientList;
        if (!clientsList.isEmpty()) {
            for (int i = 0; i < clientsList.size(); i++) {
                textAutocompleter.addItem(clientsList.get(i).getMail());
            }
        }
    }

    /**
     * Método que muestra las coincidencias para autocompletado, implementadola
     * obcion de seleccion del autocomplete
     */
    private void autoCompleter() {
        textAutocompleter = new TextAutoCompleter(jTextFieldMail, new AutoCompleterCallback() {
            @Override
            public void callback(Object o) {
                autoRefil(o.toString());
            }
        });
        textAutocompleter.setCaseSensitive(false);
        textAutocompleter.setMode(0);//para que el autocompletar busque el fragmento escrito este contenido en alguna parte de la busqueda
        uploadSearchByClientMail();
    }

    /**
     * Método para Autocompletar los espacios de texto, una vez seleccionado la
     * opcion de autocomplete
     *
     * @param selectItem
     */
    private void autoRefil(String selectItem) {
        LinkedList<Client> clientsList = this.clientList;
        if (!clientsList.isEmpty()) {
            for (int i = 0; i < clientsList.size(); i++) {
                if (selectItem.equals(clientsList.get(i).getMail())) {
                    jTextFieldName.setText(clientsList.get(i).getName());
                    jTFLastName1.setText(clientsList.get(i).getLastNameA());
                    jTFLastName2.setText(clientsList.get(i).getLastNameB());
                    jTextFieldPhone.setText(clientsList.get(i).getPhoneNumber());
                    jcbProvince.setSelectedItem(clientsList.get(i).getProvince());
                    jTextField4.setText(clientsList.get(i).getExactAddress());
                }
            }
        }

    }

    /**
     * Método para borrar los espacios con texto ingresados por el usuario
     *
     * @throws StackException
     */
    private void resetSpaces() throws StackException {
        jTextFieldName.setText("");
        jTFLastName1.setText("");
        jTFLastName2.setText("");
        jTextFieldPhone.setText("");
        jTextFieldMail.setText("");
        jcbProvince.setSelectedIndex(0);
        jTextField4.setText("");

        this.tableModel = new DefaultTableModel();
        this.tableModel.addColumn("Restaurante");
        this.tableModel.addColumn("Producto");
        this.tableModel.addColumn("Monto");
        this.tableModel.addColumn("Cantidad");
        this.jTable1.setModel(tableModel);
        completeOrder();
    }

    /**
     * Valida si existe un cliente en la lista
     */
    private void validIdClient() {
        this.idClient = 1;
        while (existClientId(idClient)) {
            this.idClient++;
        }
    }

    /**
     * Determina si existe un cliente en la lista
     *
     * @param id
     * @return
     */
    private boolean existClientId(int id) {
        for (Iterator<Client> iterator = clientList.iterator(); iterator.hasNext();) {
            Client client = iterator.next();
            int restId = Integer.parseInt(client.getId());
            if (restId == id) {
                return true;
            }
        }
        return false;
    }

    /**
     * Valida el ID de las ordenes
     *
     * @throws StackException
     */
    private void validIdOrder() throws StackException {
        this.idOrder = 1;
        while (existOrderId(idOrder)) {
            this.idOrder++;
        }
    }

    /**
     * Determina si existe una orden anteriormente ingresada
     *
     * @param id
     * @return
     * @throws StackException
     */
    private boolean existOrderId(int id) throws StackException {
        LinkedStack tempStackOrder = new LinkedStack();
        while (!stackOrderPrin.isEmpty()) {
            Order orderTemp = (Order) stackOrderPrin.pop();
            int orderId = Integer.parseInt(orderTemp.getId());
            if (orderId == id) {
                return true;
            }
            tempStackOrder.push(orderTemp);
        }
        while (!tempStackOrder.isEmpty()) {
            stackOrderPrin.push(tempStackOrder.pop());
        }
        return false;
    }

    /**
     * Suma el total final del precio del producto
     *
     * @return
     * @throws StackException
     */
    private int orderTotal() throws StackException {
        int total = 0;
        LinkedStack orderTempStack = new LinkedStack();
        while (!stackOrder.isEmpty()) {
            Order orderTemp = (Order) stackOrder.pop();
            total += Integer.parseInt(orderTemp.getTotal());
            orderTempStack.push(orderTemp);
        }
        while (!orderTempStack.isEmpty()) {
            stackOrder.push(orderTempStack.pop());
        }
        return total;
    }

    /**
     * Suma las cantidades de las ordenes a realizar
     *
     * @return
     * @throws StackException
     */
    private int orderQuantity() throws StackException {
        int totalQuantity = 0;
        LinkedStack orderTempStack = new LinkedStack();
        while (!stackOrder.isEmpty()) {
            Order orderTemp = (Order) stackOrder.pop();
            totalQuantity += Integer.parseInt(orderTemp.getQuantity());
            orderTempStack.push(orderTemp);
        }
        while (!orderTempStack.isEmpty()) {
            stackOrder.push(orderTempStack.pop());
        }
        return totalQuantity;
    }

    /**
     * Método que concatena el mensaje del detalle de la orden de tal forma que
     * se pueda enviar en el correo los detalles
     *
     * @return
     * @throws StackException
     */
    private String concatDetailOrder() throws StackException {
        String products = "";
        LinkedStack orderTempStack = new LinkedStack();
        while (!stackOrder.isEmpty()) {
            Order orderTemp = (Order) stackOrder.pop();
            products += "\n" + orderTemp.getProductoId() + " : " + orderTemp.getTotal();
            orderTempStack.push(orderTemp);
        }
        while (!orderTempStack.isEmpty()) {
            stackOrder.push(orderTempStack.pop());
        }
        return products;
    }

//    private void sortStackOrder() throws StackException {
//        ArrayList<Order> tempOrder = new ArrayList<Order>();
//        while (!stackOrderPrin.isEmpty()) {
//            Order order;
//            try {
//                order = (Order) stackOrderPrin.pop();
//                tempOrder.add(order);
//                JOptionPane.showMessageDialog(null, order.getClientId());
//            } catch (StackException ex) {
//                Logger.getLogger(AgentsModule.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
//        for (int i = tempOrder.size() - 1; i >= 0; i--) {
//            Order order1 = tempOrder.get(i);
//            stackOrderPrin.push(order1);
//            JOptionPane.showMessageDialog(null, "Esta es la Temporal: " + order1.getClientId() + " precio: " + order1.getTotal());
//        }
//
//    }
    /**
     * Método que llena las ordenes enlistadas en la tabla
     *
     * @throws StackException
     */
    private void completeOrder() throws StackException {
        while (!stackOrder.isEmpty()) {
            stackOrderPrin.push(stackOrder.pop());
        }
    }

    /**
     * Método que carga los restaurantes en los comboBox de seleccion
     */
    private void loadRestaurant() {
        jcbLocation.removeAllItems();
        jcbLocation.addItem("Seleccione un Restaurante - Ubicación");
        jcbLocation.setSelectedItem(0);

        String selection = (String) jcbProvinceRestaurant.getSelectedItem();
        for (Restaurant restaurantObject : restaurants) {
            if (restaurantObject.getProvince().equals(selection)) {
                String restaurantLocalitation = restaurantObject.getName() + "  -  " + restaurantObject.getLocation();
                jcbLocation.addItem(restaurantLocalitation);
            }
        }
    }

    private void onOffLabel(boolean active) {

        jLabelDrinks0.setEnabled(active);
        jLabelDrinks1.setEnabled(active);
        jLabelDrinks2.setEnabled(active);
        jLabelDrinks3.setEnabled(active);
        jLabelDrinks4.setEnabled(active);

        jLFood0.setEnabled(active);
        jLFood1.setEnabled(active);
        jLFood2.setEnabled(active);
        jLFood3.setEnabled(active);
        jLFood4.setEnabled(active);

        jLDessert0.setEnabled(active);
        jLDessert1.setEnabled(active);
        jLDesserts2.setEnabled(active);
        jLDesserts3.setEnabled(active);
        jLDesserts4.setEnabled(active);

        jLVarious0.setEnabled(active);
        jLVarious1.setEnabled(active);
        jLVarious2.setEnabled(active);
        jLVarious3.setEnabled(active);
        jLVarious4.setEnabled(active);
    }
}
