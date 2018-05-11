/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import Domain.Client;
import Domain.Products;
import Domain.Restaurant;
import Main.Algoritmos_Proyecto01_B16322_B31710_B67156;
import java.util.ArrayList;
import java.util.LinkedList;

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
            if (restaurant.getDni().equals(idRestaurant)) {
                name = restaurant.getName();
                break;

            }
        }
        return name;
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
