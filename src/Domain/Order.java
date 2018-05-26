/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Order {
//ID Orden,ID Cliente,ID Restaurante,ID Producto,Cantidad,Total Items

    private String id;
    private String clientId;
    private String restaurantId;
    private String productoId;
    private String quantity;
    private String total;
    private Date currentDate;

    public Order() {
    }

    public Order(String id, String clientId, String restaurantId, String productoId, String quantity, String total, Date currentDate) {
        this.id = id;
        this.clientId = clientId;
        this.restaurantId = restaurantId;
        this.productoId = productoId;
        this.quantity = quantity;
        this.total = total;
        this.currentDate = currentDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getProductoId() {
        return productoId;
    }

    public void setProductoId(String productoId) {
        this.productoId = productoId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

}
