/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import ADT.LinkedList.DoubleLinkedCircularList;
import ADT.Stack.LinkedStack;
import Domain.Client;
import Domain.Driver;
import Domain.Order;
import Domain.Products;
import Domain.Report;
import Domain.Restaurant;
import Domain.User;
import Exceptions.StackException;
import GUI.Login;
import Main.Algoritmos_Proyecto01_B16322_B31710_B67156;
import static Main.Algoritmos_Proyecto01_B16322_B31710_B67156.ADMIN_LIST;
import static Main.Algoritmos_Proyecto01_B16322_B31710_B67156.AGENT_LIST;
import static Main.Algoritmos_Proyecto01_B16322_B31710_B67156.ALL_PRODUCTS_LIST;
import static Main.Algoritmos_Proyecto01_B16322_B31710_B67156.CLIENT_LIST;
import static Main.Algoritmos_Proyecto01_B16322_B31710_B67156.DRIVER_QUEUE;
import static Main.Algoritmos_Proyecto01_B16322_B31710_B67156.ORDER_DETAIL_LIST;
import static Main.Algoritmos_Proyecto01_B16322_B31710_B67156.REPORT_FROM_ORDER_DETAIL;
import static Main.Algoritmos_Proyecto01_B16322_B31710_B67156.RESTAURANT_LIST;
import Utilities.StringPath;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.UIManager;
import javax.xml.soap.Detail;

/**
 *
 * @author daniel
 */
public class LoadData {

    public static ThreadSaveAnyNSeconds threadSaveAnyNSeconds;

    public LoadData() throws StackException {

        getClients();
        getDrivers();
        getRestaurants();
        getProducts();
        getAgents();
        getAdministrators();
        getOrdersDetails();
        getReports();

        threadSaveAnyNSeconds = new ThreadSaveAnyNSeconds();
        threadSaveAnyNSeconds.start();
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

        } catch (Exception ex) {
        }

        Login login = new Login();
        login.setVisible(true);

    }

    public void getClients() {
        DataCSV clientCSV = new DataCSV(StringPath.PATH_CLIENT);
        LinkedList<Client> clients = new LinkedList<Client>();
        clients = clientCSV.readClient();
        Algoritmos_Proyecto01_B16322_B31710_B67156.CLIENT_LIST = clients;
        //    return clients;
    }

    public void getDrivers() {
        DataCSV driverCSV = new DataCSV(StringPath.PATH_DRIVER);
        Queue<Driver> drivers = new LinkedList<Driver>();
        drivers = (Queue<Driver>) driverCSV.readDrivers();
        Algoritmos_Proyecto01_B16322_B31710_B67156.DRIVER_QUEUE = drivers;
    }

    public void getRestaurants() {
        DataCSV restaurantCSV = new DataCSV(StringPath.PATH_RESTAURANT);
        ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
        restaurants = (ArrayList<Restaurant>) restaurantCSV.readRestaurants();
        Algoritmos_Proyecto01_B16322_B31710_B67156.RESTAURANT_LIST = restaurants;
    }

    public void getProducts() {
        DataCSV productsCSV = new DataCSV(StringPath.PATH_PRODUCTS);
        ArrayList<Products> products = new ArrayList<Products>();
        products = (ArrayList<Products>) productsCSV.readProducts();
        Algoritmos_Proyecto01_B16322_B31710_B67156.ALL_PRODUCTS_LIST = products;
    }

    public void getAgents() {
        DataCSV agentCSV = new DataCSV(StringPath.PATH_AGENT);
        ArrayList<User> agents = new ArrayList<User>();
        agents = (ArrayList<User>) agentCSV.readAgentAdmin();
        Algoritmos_Proyecto01_B16322_B31710_B67156.AGENT_LIST = agents;
    }

    public void getAdministrators() {
        DataCSV agentCSV = new DataCSV(StringPath.PATH_ADMIN);
        ArrayList<User> admin = new ArrayList<User>();
        admin = (ArrayList<User>) agentCSV.readAgentAdmin();
        Algoritmos_Proyecto01_B16322_B31710_B67156.ADMIN_LIST = admin;
    }

    public void getOrdersDetails() throws StackException {
        DataCSV orderDetailCSV = new DataCSV(StringPath.PATH_ORDER);
        ArrayList<Order> ordersDetail = new ArrayList<Order>();
        ordersDetail = (ArrayList<Order>) orderDetailCSV.readOrderDetails();
        LinkedStack ordersDetails = new LinkedStack();
        for (Order orderDetails : ordersDetail) {
            Order oD = orderDetails;
            ordersDetails.push(oD);
        }
        Algoritmos_Proyecto01_B16322_B31710_B67156.ORDER_DETAIL_LIST = ordersDetails;
    }

    public void getReports() {
        DataCSV orderDetailCSV = new DataCSV(StringPath.PATH_ORDER);
        ArrayList<Order> ordersDetail = new ArrayList<Order>();
        ArrayList<Report> reportsDetail = new ArrayList<Report>();
        ordersDetail = (ArrayList<Order>) orderDetailCSV.readOrderDetails();
        for (Order order : ordersDetail) {
            String idRestaurant = order.getRestaurantId();
            String total = order.getTotal();
            String date = order.getCurrentDate();

            reportsDetail.add(new Report(idRestaurant, Double.parseDouble(total), date));

        }
        Algoritmos_Proyecto01_B16322_B31710_B67156.REPORT_FROM_ORDER_DETAIL = reportsDetail;
    }
}
