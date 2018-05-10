/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT.Stack;

import ADT.Node;
import ADT.StackInterface;
import Exceptions.StackException;

/**
 *
 * implementacion de la interface stack
 *
 * @author deltadragon
 */
public class LinkedStack implements StackInterface {

    private Node top;
    private int cont;

    public LinkedStack() {
        this.top = null;
        this.cont = 0;
    }

    /**
     * devuelte el tama;o de la pila
     *
     * @return devuelte un entero
     */
    @Override
    public int getSize() {
        return this.cont;
    }

    /**
     * Devuelve si la pila esta vacia
     *
     * @return bolean
     */
    @Override
    public boolean isEmpty() {
        return this.cont == 0;
        // return this.top == null;
    }

    @Override
    public void delete() throws StackException {
        this.top = null;
    }

    @Override
    public void push(Object element) throws StackException {
        Node newNode = new Node(element);
        if (isEmpty()) {
            this.top = newNode;
            cont++;
        } else {
            newNode.next = this.top;
            this.top = newNode;
            cont++;
        }
    }

    /**
     * Consulta el valor del primer elemento sin retirarlo de la pula
     *
     * @return un object
     */
    @Override
    public Object peek() {
        return this.top;
    }

    @Override
    public Object pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Esta vacia");
        } else {
            Object temp = this.top;
            this.top = this.top.next;
            this.cont--;
            return temp;
        }
    }

    @Override
    public Object search(Object element) {
        return null;
        //implementara
    }

}
