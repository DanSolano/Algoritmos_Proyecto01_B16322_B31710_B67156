/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author deltadragon
 */
public class PilaException extends Exception{

    public PilaException() {
    }

    public PilaException(String message) {
        super(message);
    }
    //pila llena
    //pila vacia
    //Elemento ingresado no es valido en el tipo de lista
}
