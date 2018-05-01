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

/**
 * @version1.0
 * @author Daniel Solano, Luis Cerdas, Jesus Torres
 */
public class Algoritmos_Proyecto01_B16322_B31710_B67156 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ListException {

        if ("d2029049c436ee05f87421cfa79a8797f24ea04909eab42c2abfc1f68268e5d5e33388e2513aa72223f57003a71d27e7337c65bbe27473f895663c0f1b165474" == "d2029049c436ee05f87421cfa79a8797f24ea04909eab42c2abfc1f68268e5d5e33388e2513aa72223f57003a71d27e7337c65bbe27473f895663c0f1b165474") {
            System.out.println("Main.Algoritmos_Proyecto01_B16322_B31710_B67156.main()");
        }

        LinkedListSimple linkedList = new LinkedListSimple();
        DoubleLinkedCircularList doubleLinkedCircularList = new DoubleLinkedCircularList();
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        LinkedList<Client> clientes = new LinkedList<Client>();
        Login login = new Login();
        login.setVisible(true);

    }

}
