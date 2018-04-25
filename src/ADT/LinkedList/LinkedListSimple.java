/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT.LinkedList;

import ADT.List;
import ADT.Node;
import Exceptions.ListException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @version1.0
 * @author Daniel Solano
 */
public class LinkedListSimple implements List {

    private Node start;

    public LinkedListSimple() {
        this.start = null;
    }

    @Override
    public int getSize() throws ListException {
        int position = -1;
        Node auxNode = this.start;
        if (isEmpty()) {
            return position;
        } else {
            position++;//

            //we move the pointer througth all the nodes and count every element on the list
            while (auxNode.next != null) {
                position++;
                auxNode = auxNode.next;
            }
            if (position == -1) {
                throw new ListException("Error in the counter of elements");
            }
            return position+1;
        }

    }

    @Override
    public void cancel() {
        this.start = null;
    }

    @Override
    public boolean isEmpty() {
        return this.start == null;
    }

    @Override
    public int getPosition(Object element) throws ListException {
        int counter = -1;
        Node auxNode = this.start;
        if (isEmpty()) {
            throw new ListException("The list is empty, had no elements");
        } else {

            //we move the pointer througth all the nodes and count every element on the list
            while (auxNode.next != null) {

                if (auxNode.element.equals(element)) {
                    return ++counter;
                } else {
                    auxNode = auxNode.next;
                    counter++;
                }
            }//end while  
            if (auxNode.element.equals(element)) {
                return counter++;

            }
        }
        return -1;
    }

    @Override
    public void insert(Object element) {
        Node auxNode = this.start;//or "tempNode" as a variable name

        if (auxNode == null) {
            auxNode = new Node(element);
            this.start = auxNode;
        } else {
            //we move the pointer througth all the nodes
            while (auxNode.next != null) {
                auxNode = auxNode.next;
            }
            auxNode.next = new Node(element);
        }

    }

    @Override
    public void ordererInsert(Object element) throws ListException {
        Node auxNode = this.start;
        Node tempNode;

        if (isEmpty()) {
            auxNode = new Node(element);
            this.start = auxNode;
        } else {
            if ((int) element < (int) auxNode.element) {
                tempNode = new Node(element);
                this.start = tempNode;
                tempNode.next = auxNode;
            } else {
                Node current = this.start;

                Node previous = this.start;
                while ((int) element >= (int) current.element && current.next != null) {
                    previous = current;
                    current = current.next;
                }
                if ((int) element >= (int) current.element) {
                    current.next = new Node(element);
                } else {
                    tempNode = new Node(element);
                    tempNode.next = current;
                    previous.next = tempNode;
                }
            }
        }

    }

    @Override
    public void delete(Object element) throws ListException {
        if (isEmpty()) {
            throw new ListException("List is empty");
        }
        if (start.element.equals(element)) {
            this.start = start.next;
        } else {
            Node auxNode = start;
            Node previousNode = null;

            while (auxNode.next != null && !auxNode.element.equals(element)) {
                previousNode = auxNode;
                auxNode = auxNode.next;
            }
            if (auxNode.element.equals(element)) {
                previousNode.next = auxNode.next;
                auxNode.next = null;

            }
        }
    }

    @Override
    public boolean isElement(Object element
    ) {

        try {
            Node auxNode = this.start;
            if (isEmpty()) {
                throw new ListException("The list is empty, had no elements");

            } else {
                //we move the pointer througth all the nodes and count every element on the list
                while (auxNode != null) {
                    if (auxNode.element.equals(element)) {
                        return true;
                    } else {
                        auxNode = auxNode.next;
                    }
                }//end while            }
            }

        } catch (ListException ex) {
            Logger.getLogger(LinkedListSimple.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.out.println("Function isElement excecuted correctly");
        }
        return false;
    }

    @Override
    public Object first() throws ListException {
        Node auxNode = this.start;
        if (isEmpty()) {
            throw new ListException("The list is empty, had no elements");

        } else {
            return auxNode.element;
        }
    }

    @Override
    public Object last() throws ListException {
        int n = getSize();
        if (isEmpty()) {
            throw new ListException("La lista esta vacia");
        } else {
        return getNode(n - 1);
        }
    }

    /*
    *Gets the object in the specific position
    *@param node
     */
    @Override
    public Object getNode(int position) throws ListException {
        int counter = -1;
        Node auxNode = this.start;
        if (isEmpty()) {
            throw new ListException("The list is empty, had no elements");
        } else {
            counter = 0;
            //we move the pointer througth all the nodes and count every element on the list
            while (auxNode.next != null) {
//                System.out.println(counter+"   qwqwqw");
                if (counter == position) {
                    return auxNode.element;

                } else {
                    auxNode = auxNode.next;
                    counter++;
                }
            }//end while  
            if (auxNode.next == null && counter == position) {
                return auxNode.element;
            }
        }
        return -1;
    }

}
