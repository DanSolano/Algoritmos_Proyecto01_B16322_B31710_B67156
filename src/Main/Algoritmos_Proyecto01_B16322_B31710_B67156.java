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
import Data.AgentCSV;
import Domain.User;
import java.util.ArrayList;

/**
 * @version1.0
 * @author Daniel Solano, Luis Cerdas, Jesus Torres
 */
public class Algoritmos_Proyecto01_B16322_B31710_B67156 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ListException {
        AgentCSV agentCSV = new AgentCSV();
        ArrayList<User> agentList = new ArrayList<User>();
        agentList = (ArrayList<User>) agentCSV.readCSV();
        for (User user : agentList) {
            System.out.println(user.getName());

        }

        LinkedListSimple linkedList = new LinkedListSimple();
        DoubleLinkedCircularList doubleLinkedCircularList = new DoubleLinkedCircularList();
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        LinkedList<Client> clientes = new LinkedList<Client>();
        Login login = new Login(agentList);
        login.setVisible(true);

    }

}
