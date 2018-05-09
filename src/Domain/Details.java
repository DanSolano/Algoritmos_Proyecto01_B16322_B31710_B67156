/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author daniel
 */
public class Details {

    private int orderId;
    private String restaurantName;
    private String product;
    private int quantity;

    public Details() {
    }

    public Details(int orderId, String restaurantName, String product, int quantity) {
        this.orderId = orderId;
        this.restaurantName = restaurantName;
        this.product = product;
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderCounter) {
        this.orderId = orderCounter;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
