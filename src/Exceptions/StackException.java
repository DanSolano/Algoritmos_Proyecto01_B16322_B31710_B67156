/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author daniel
 */
public class StackException extends Exception{

    public StackException() {
    }

    public StackException(String message) {
        super(message);
    }
    //pila llena
    //pila vacia
    //Elemento ingresado no es valido en el tipo de lista
}
