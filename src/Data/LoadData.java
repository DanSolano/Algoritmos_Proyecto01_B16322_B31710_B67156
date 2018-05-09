/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import ADT.LinkedList.DoubleLinkedCircularList;
import Domain.Client;
import Domain.Driver;
import Domain.OrderDetails;
import Domain.Restaurant;
import Domain.User;
import Utilities.StringPath;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.xml.soap.Detail;

/**
 *
 * @author daniel
 */
public class LoadData {

    ArrayList<Detail> DETAIL_LIST;

    ArrayList<OrderDetails> ORDER_DETAIL_LIST;
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

}
