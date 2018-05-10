/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import Exceptions.StackException;

/**
 *
 * @author daniel
 */
public interface StackInterface {

    public int getSize();

    public boolean isEmpty();

    public void delete() throws StackException;

    public void push(Object element) throws StackException;// inserta un elemento en la pila

    public Object peek(); //consulta el inicio de una pila, top()

    public Object pop() throws StackException;//saca el ultimo elemento ingresado de la pila

    public Object search(Object element);//

}
