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
import Utilities.StringPath;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import javax.xml.soap.Detail;

/**
 *
 * @author daniel
 */
public class LoadData {

    ArrayList<Detail> DETAIL_LIST;

    ArrayList<Order> ORDER_DETAIL_LIST;
    DoubleLinkedCircularList DRINK_LIST;
    DoubleLinkedCircularList FOOD_LIST;
    DoubleLinkedCircularList DESSERT_LIST;
    DoubleLinkedCircularList OTHER_LIST;

    public LoadData() {
    }

    public LinkedList<Client> getClients() {
        DataCSV clientCSV = new DataCSV(StringPath.PATH_CLIENT);
        LinkedList<Client> clients = new LinkedList<Client>();
        clients = clientCSV.readClient();
        return clients;
    }

    public Queue<Driver> getDrivers() {
        DataCSV driverCSV = new DataCSV(StringPath.PATH_DRIVER);
        Queue<Driver> drivers = new LinkedList<Driver>();
        drivers = (Queue<Driver>) driverCSV.readDrivers();
        return drivers;
    }

    public ArrayList<Restaurant> getRestaurants() {
        DataCSV restaurantCSV = new DataCSV(StringPath.PATH_RESTAURANT);
        ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
        restaurants = (ArrayList<Restaurant>) restaurantCSV.readRestaurants();
        return restaurants;
    }

    public ArrayList<Products> getProducts() {
        DataCSV productsCSV = new DataCSV(StringPath.PATH_PRODUCTS);
        ArrayList<Products> products = new ArrayList<Products>();
        products = (ArrayList<Products>) productsCSV.readProducts();
        return products;
    }

    public ArrayList<User> getAgents() {
        DataCSV agentCSV = new DataCSV(StringPath.PATH_AGENT);
        ArrayList<User> agents = new ArrayList<User>();
        agents = (ArrayList<User>) agentCSV.readAgentAdmin();
        return agents;
    }

    public ArrayList<User> getAdministrators() {
        DataCSV agentCSV = new DataCSV(StringPath.PATH_ADMIN);
        ArrayList<User> admin = new ArrayList<User>();
        admin = (ArrayList<User>) agentCSV.readAgentAdmin();
        return admin;
    }

    public LinkedStack getOrdersDetails() throws StackException {
        DataCSV orderDetailCSV = new DataCSV(StringPath.PATH_ORDER);
        ArrayList<Order> ordersDetail = new ArrayList<Order>();
        ordersDetail = (ArrayList<Order>) orderDetailCSV.readOrderDetails();
        LinkedStack ordersDetails = new LinkedStack();
        for (Order orderDetails : ordersDetail) {
            Order oD = orderDetails;
            ordersDetails.push(oD);
        }
        return ordersDetails;
    }

    public ArrayList<Report> getReports() {
         DataCSV orderDetailCSV = new DataCSV(StringPath.PATH_ORDER);
        ArrayList<Order> ordersDetail = new ArrayList<Order>();
        ArrayList<Report>  reportsDetail= new ArrayList<Report>();
        ordersDetail = (ArrayList<Order>) orderDetailCSV.readOrderDetails();
        for (Order order : ordersDetail) {
            String idRestaurant = order.getRestaurantId();
            String total = order.getTotal();
            Date   date=order.getCurrentDate();
            
            reportsDetail.add(new Report(idRestaurant, Double.parseDouble(total), date));
            
        }
        return reportsDetail;
    }
}
