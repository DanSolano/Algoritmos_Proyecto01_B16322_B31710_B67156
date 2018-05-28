/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author daniel
 */
public class Products {

    private String id;//we use this to rename the image with a counter that identifies the image that belongs to the restaurant.
    private String idRestaurant;
    private String name;
    private String price;
    private String typeProduct;//1=Drinks 2=Foods 3=Desserts 4=Others
    private ImageIcon imageIcon;

    public Products() {
    }

    public Products(String id, String idRestaurant, String name, String price, String typeProduct) {
        this.id = id;
        this.idRestaurant = idRestaurant;
        this.name = name;
        this.price = price;
        this.typeProduct = typeProduct;
    }

    public Products(String id, String idRestaurant, String name, String price, String typeProduct, ImageIcon imageIcon) {
        this.id = id;
        this.idRestaurant = idRestaurant;
        this.name = name;
        this.price = price;
        this.typeProduct = typeProduct;
        this.imageIcon = imageIcon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(String idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public String toString() {
        return "Products{" + "id=" + id + ", idRestaurant=" + idRestaurant + ", name=" + name + ", price=" + price + ", typeProduct=" + typeProduct + ", imageIcon=" + imageIcon + '}';
    }

}
