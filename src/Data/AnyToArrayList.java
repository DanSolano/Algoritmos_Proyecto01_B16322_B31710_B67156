/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import ADT.Stack.LinkedStack;
import Domain.Client;
import Domain.Driver;
import Domain.Order;
import Domain.Products;
import Domain.Restaurant;
import Domain.User;
import Exceptions.StackException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daniel
 */
public class AnyToArrayList {

    public AnyToArrayList() {
    }

    public ArrayList<Object> userToArrayListObject(ArrayList<User> agentOrAdminList) {
        ArrayList<Object> arrayUser = new ArrayList<Object>();
        for (User object : agentOrAdminList) {
            arrayUser.add(object);
        }
        return arrayUser;
    }

    public ArrayList<Object> clientToArrayListObject(LinkedList<Client> clientsArrayList) {
        ArrayList<Object> arrayClient = new ArrayList<Object>();
        for (Client object : clientsArrayList) {
            arrayClient.add(object);
        }
        return arrayClient;
    }

    public ArrayList<Object> driversToArrayListObject(Queue<Driver> driverQueue) {
        ArrayList<Object> arrayDriver = new ArrayList<Object>();
        for (Driver object : driverQueue) {
            arrayDriver.add(object);
        }
        return arrayDriver;
    }

    public ArrayList<Object> orderToArrayListObject(LinkedStack orderList) {
        try {
            ArrayList<Object> arrayUser = new ArrayList<Object>();
            Object object = new Object();
            while (!orderList.isEmpty()) {
                object = orderList.pop();
                arrayUser.add(object);

            }
            return arrayUser;
        } catch (StackException ex) {
            Logger.getLogger(AnyToArrayList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Object> productsToArrayListObject(ArrayList<Products> orderList) {
        ArrayList<Object> arrayUser = new ArrayList<Object>();
        for (Products object : orderList) {
            arrayUser.add(object);
        }
        return arrayUser;
    }

    public ArrayList<Object> restaurantToArrayListObject(ArrayList<Restaurant> orderList) {
        ArrayList<Object> arrayUser = new ArrayList<Object>();
        for (Restaurant object : orderList) {
            arrayUser.add(object);
        }
        return arrayUser;
    }

}
