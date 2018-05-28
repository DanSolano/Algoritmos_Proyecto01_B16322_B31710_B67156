/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import Domain.Client;
import Domain.Driver;
import Domain.Products;
import Domain.Restaurant;
import Main.Algoritmos_Proyecto01_B16322_B31710_B67156;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author daniel
 */
public class GetDataById {

    public GetDataById() {

    }

    public String getRestaurantName(String idRestaurant) {
        ArrayList<Restaurant> rest = Algoritmos_Proyecto01_B16322_B31710_B67156.RESTAURANT_LIST;
        String name = "";
        for (Restaurant restaurant : rest) {
            if (restaurant.getId().equals(idRestaurant)) {
                name = restaurant.getName();
                break;

            }
        }
        return name;
    }

    public Restaurant getRestaurantById(String idRestaurant) {
        ArrayList<Restaurant> rest = Algoritmos_Proyecto01_B16322_B31710_B67156.RESTAURANT_LIST;
        Restaurant restSearch = new Restaurant();
        for (Restaurant restaurant : rest) {
            if (restaurant.getId().equals(idRestaurant)) {
                restSearch = restaurant;
                break;

            }
        }
        return restSearch;
    }

    public String getRestaurantIdByNameAndLocation(String nameRestaurant, String address, String Province) {
        ArrayList<Restaurant> rest = Algoritmos_Proyecto01_B16322_B31710_B67156.RESTAURANT_LIST;
        String id = "";
        for (Restaurant restaurant : rest) {
            if (restaurant.getName().equals(nameRestaurant) && restaurant.getLocation().equals(address) && restaurant.getProvince().equals(Province)) {
                id = restaurant.getId();
                break;

            }
        }
        return id;
    }

    public String getDriverName(String clientId) {
        Queue<Driver> drivers = Algoritmos_Proyecto01_B16322_B31710_B67156.DRIVER_QUEUE;
        Queue tempDriver = new LinkedList();
        Iterator<Driver> it = drivers.iterator();
        while (it.hasNext()) {
            tempDriver.add(it.next());
        }
        while (!tempDriver.isEmpty()) {
            Driver driver = (Driver) tempDriver.poll();
            if (driver.getId().equals(clientId)) {
                return driver.getName();
            }
        }

        return null;
    }

    public String getClientName(String clientId) {
        LinkedList<Client> clients = Algoritmos_Proyecto01_B16322_B31710_B67156.CLIENT_LIST;
        String name = "";
        for (Client client : clients) {
            if (client.getId().equals(clientId)) {
                name = client.getName();
                break;

            }
        }
        return name;
    }

    public String getproductName(String id) {
        ArrayList<Products> clients = Algoritmos_Proyecto01_B16322_B31710_B67156.ALL_PRODUCTS_LIST;
        String name = "";
        for (Products products : clients) {
            if (products.getId().equals(id)) {
                name = products.getName();
                break;

            }
        }
        return name;
    }

}
