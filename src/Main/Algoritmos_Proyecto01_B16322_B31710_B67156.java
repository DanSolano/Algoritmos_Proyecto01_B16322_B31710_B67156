/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Domain.Client;
import Exceptions.ListException;
import GUI.Login;
import java.util.LinkedList;
import ADT.LinkedList.LinkedListSimple;
import ADT.LinkedList.DoubleLinkedCircularList;
import ADT.LinkedList.DoublyLinkedList;
import Data.RestaurantCSV;
import Data.UserCSV;
import Domain.Restaurant;
import Domain.User;
import Utilities.StringPath;
import java.util.ArrayList;
import javax.swing.UIManager;

/**
 * @version1.0
 * @author Daniel Solano, Luis Cerdas, Jesus Torres
 */
public class Algoritmos_Proyecto01_B16322_B31710_B67156 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ListException {
        UserCSV agentCSV = new UserCSV(StringPath.PATH_AGENT);
        ArrayList<User> agentList = new ArrayList<User>();
        agentList = (ArrayList<User>) agentCSV.readCSV();

        UserCSV adminCSV = new UserCSV(StringPath.PATH_ADMIN);
        ArrayList<User> adminList = new ArrayList<User>();
        adminList = (ArrayList<User>) adminCSV.readCSV();
        
        
        RestaurantCSV restaurantCSV = new RestaurantCSV(StringPath.PATH_ADMIN);
        ArrayList<Restaurant> restList = new ArrayList<Restaurant>();
        restList = (ArrayList<Restaurant>) restaurantCSV.readCSV();

        LinkedListSimple linkedList = new LinkedListSimple();
        DoubleLinkedCircularList doubleLinkedCircularList = new DoubleLinkedCircularList();
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        LinkedList<Client> clientes = new LinkedList<Client>();

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

        } catch (Exception ex) {
        }

        Login login = new Login(agentList, adminList);
        login.setVisible(true);

    }

}
