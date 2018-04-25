/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT.LinkedList;

import ADT.List;
import ADT.Node;
import Exceptions.ListException;
import ADT.LinkedList.LinkedListSimple;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @version1.0
 * @author Daniel Solano
 */
public class DoublyLinkedList implements List {

    private Node start;
    private Node end;

    public DoublyLinkedList() {
        this.start = null;

    }

    @Override
    public int getSize() throws ListException {
        if (isEmpty()) {
            throw new ListException("Esta vacia");
        }

        Node Node = start;

        int counter = -1;//cuenta los nodos
        while (Node != end) {
            counter++;
            Node = Node.next;

        }//fin del while

        return counter + 1;//asi contara el ultimo nodo}
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
        int count = -1;
        if (isEmpty()) {
            throw new ListException("La lista esta vacia");
        } else {
            Node auxNode = this.start;
            count++;
            while (auxNode != null) {
                if (auxNode.element.equals(element)) {
                    return count;
                } else {
                    auxNode = auxNode.next;
                    count++;
                }
            }
        }
        return -1;
    }

    @Override
    public void insert(Object element) {
        Node auxNode = start;//para no perder nuestro inicio de la lista
        Node newNode = new Node(element);

        if (auxNode == null) {//Si aux es nulo es porque la lista no apunta a nada(Lista no existe)
            auxNode = newNode;
            start = auxNode;
        }//If
        else {//Significa que la lista existe

            while (auxNode.next != null) {

                auxNode = auxNode.next;//movemos al auxiliar al nodo siguiente
            }
            newNode.previoius = auxNode;
            auxNode.next = newNode;//Lo enlaza al final de la lista

        }//Else
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
                throw new ListException("La lista esta vacia");
            } else {
                Node auxNode = this.start;
                while (auxNode != null) {
                    if (auxNode.element.equals(element)) {
                        return true;
                    } else {
                        auxNode = auxNode.next;

                    }

                }
            }
        } catch (ListException ex) {
            Logger.getLogger(LinkedListSimple.class
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
        int position = getSize();
        if (isEmpty()) {
            throw new ListException("La lista esta vacia");
        } else {
            return getNode(position-1);
        }
    }

    @Override
    public Object getNode(int position) throws ListException {
        Node auxNode = this.start;
        int cont = -1;
        if (isEmpty()) {
            throw new ListException("La lista esta vacia");
        } else {
            cont++;
            while (auxNode.next != null) {
                if (position == cont) {
                    return auxNode.element;
                } else {
                    auxNode = auxNode.next;
                    cont++;
                }
            }
            if (auxNode.next == null) {
                return auxNode.element;
            }
        }
        return null;
    }

}
