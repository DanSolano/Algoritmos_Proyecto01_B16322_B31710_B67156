/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import ADT.Stack.LinkedStack;
import Data.ChartData;
import Domain.Client;
import Exceptions.ListException;
import GUI.Login;
import java.util.LinkedList;
import Data.LoadData;
import Domain.Driver;
import Domain.Order;
import Domain.Products;
import Domain.Restaurant;
import Domain.User;
import Exceptions.StackException;
import java.util.ArrayList;
import java.util.Queue;
import javax.swing.UIManager;
import javax.xml.soap.Detail;

/**
 * @version1.0
 * @author Daniel Solano, Luis Cerdas, Jesus Torres
 */
public class Algoritmos_Proyecto01_B16322_B31710_B67156 {

    /**
     * @param args the command line arguments
     */
    public static LinkedList<Client> CLIENT_LIST;
    public static ArrayList<Detail> DETAIL_LIST;
    public static Queue<Driver> DRIVER_QUEUE;
    public static LinkedStack ORDER_DETAIL_LIST;
    public static ArrayList<Restaurant> RESTAURANT_LIST;
    public static ArrayList<User> AGENT_LIST;
    public static ArrayList<User> ADMIN_LIST;
    public static ArrayList<Products> ALL_PRODUCTS_LIST;

    public static void main(String[] args) throws ListException, StackException {
        LoadData ld = new LoadData();

        CLIENT_LIST = ld.getClients();
        DRIVER_QUEUE = ld.getDrivers();
        ORDER_DETAIL_LIST = ld.getOrdersDetails();
        ALL_PRODUCTS_LIST = ld.getProducts();
        RESTAURANT_LIST = ld.getRestaurants();
        AGENT_LIST = ld.getAgents();
        ADMIN_LIST = ld.getAdministrators();
//         ChartData chart = new ChartData();
//         chart.reportList();
         try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

        } catch (Exception ex) {
        }
        
        Login login = new Login();
        login.setVisible(true);

    }

}
