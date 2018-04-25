/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.List;

/**
 *
 * @author daniel
 */
public class OrderDetails {

    private int orderCounter;
    private List<Details> ordenDetails;

    public OrderDetails() {
    }

    public OrderDetails(int orderCounter, List<Details> ordenDetails) {
        this.orderCounter = orderCounter;
        this.ordenDetails = ordenDetails;
    }

    public int getOrderCounter() {
        return orderCounter;
    }

    public void setOrderCounter(int orderCounter) {
        this.orderCounter = orderCounter;
    }

    public List<Details> getOrden() {
        return ordenDetails;
    }

    public void setOrden(List<Details> ordenDetails) {
        this.ordenDetails = ordenDetails;
    }

}
