/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT.LinkedList;

import ADT.List;
import ADT.Node;
import Exceptions.ListException;
import ADT.LinkedList.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @version1.0
 * @author Daniel Solano
 */
public class DoubleLinkedCircularList implements List {

    Node start, end;

    public DoubleLinkedCircularList() {
        this.start = null;
    }

    @Override
    public int getSize() throws ListException {
        int position = 0;
        if (isEmpty()) {
            throw new ListException("La lista no existe");
        }
        Node aux = start;
        while (aux != end) {
            position++;
            aux = aux.next;
        }
        return position + 1;
    }

    @Override
    public void cancel() {
        this.start = null;
        this.end = null;
    }

    @Override
    public boolean isEmpty() {
        return this.start == null;
    }

    @Override
    public int getPosition(Object element) throws ListException {
        if (isEmpty()) {
            throw new ListException("Esta vacia");
        }
        Node auxNode = start;

        int position = 0;//cuenta los nodos
        while (auxNode != end) {
            if (auxNode.element.equals(element)) {
                return position;
            }
            position++;
            auxNode = auxNode.next;

        }//fin del while  
        if (auxNode == end && auxNode.element.equals(element))// es el ultimo nodo
        {
            return position;
        }
        return 0;//significa que no existe
    }

    @Override
    public void insert(Object element) {
        if (start == null) {
            start = end = new Node(element);
        } else {
            Node auxNode = start;
            while (auxNode != end) {
                auxNode = auxNode.next;
            } // se sale del while cuando aux es igual a fin
            Node nuevoNodo = new Node(element);
            auxNode.next = nuevoNodo;
            // fin apunta a nuevo nodo
            end = nuevoNodo;
            // se hace el enlace circular
            end.next = start;
        }
    }

    @Override
    public void ordererInsert(Object element) throws ListException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object element) throws ListException {
        if (isEmpty()) {
            throw new ListException("Esta vacia");
        }
//       Nodo aux=inicio;
//       Nodo anterior;
        //Caso1: El elemento a suprimir es el primero de la lista
        if (start.element.equals(element)) {
            start = start.next;
        } //Caso2:El elemento esta al centro o al final
        else {
            Node auxNode = start;
            Node prev = start;//se refiere al nodo anterior
            while (auxNode.next != null && !auxNode.element.equals(element)) {
                prev = auxNode;//dejamos un rastro del nodo visitado

                auxNode = auxNode.next;
            }//while

            //se sale del while cuando alcanza nulo o cuando encuentra el elemento que quiere suprimir
            if (auxNode.element.equals(element) && auxNode.next != null)//encontro el elemento a suprimir y preguntar que no sea el ultimo
            {
                prev.next = auxNode.next;//se salta el nodo apuntado por aux
                auxNode.next.previoius = prev;
            } else {
                if (auxNode.element.equals(element) && auxNode.next == null) {
                    auxNode.previoius = null;//para romper el enlace
                    prev.next = null;
                }

            }

        }//else
    }

    @Override
    public boolean isElement(Object element) {
        try {
            if (isEmpty()) {
                throw new ListException("Lista no exsite");
            }
            Node aux = start;
            while (aux != end) {
                if (aux.element.equals(element)) {
                    return true;
                }
                aux = aux.next;
            }
            if (aux.element.equals(element)) {
                return true;
            }
            return false;
        } catch (ListException ex) {
            Logger.getLogger(LinkedList.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.out.println("Funcion isElement se ejecuto correctamente");
        }
        return false;
    }

    @Override
    public Object first() throws ListException {
        if (isEmpty()) {
            throw new ListException("Lista vacia");
        } else {
            return this.start.element;
        }
    }

    @Override
    public Object last() throws ListException {
        int position = getSize() - 1;
        if (isEmpty()) {
            throw new ListException("La lista esta vacia");
        } else {
            return getNode(position);
        }
    }

    @Override
    public Object getNode(int position) throws ListException {
        int counter = 0;

        if (isEmpty()) {
            throw new ListException("Esta vacia");
        }
        Node auxNode = start;
        while (auxNode != end && counter != position) {
            auxNode = auxNode.next;
            counter++;
        }
        if (counter == position) {
            return auxNode.element;
        }
        //que pasa si llega al utimo nodo o al nodo apuntado por fin
        if (auxNode == end && counter + 1 == position)// es el ultimo nodo
        {
            return end.element;
        }
        return auxNode.element;
    }

}
