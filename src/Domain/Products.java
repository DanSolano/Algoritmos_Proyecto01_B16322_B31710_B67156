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

    private String dni;//we use this to rename the image with a counter that identifies the image that belongs to the restaurant.
    private String name;
    private double price;
    private int typeProduct;//1=Drinks 2=Foods 3=Desserts 4=Others
    private ImageIcon imageIcon;

    public Products(String dni, String name, double price, int typeProduct, ImageIcon imageIcon) {
        this.dni = dni;
        this.name = name;
        this.price = price;
        this.typeProduct = typeProduct;
        this.imageIcon = imageIcon;
    }

    public Products() {
    }

    public Products(String dni, String name, double price, int typeProduct) {
        this.dni = dni;
        this.name = name;
        this.price = price;
        this.typeProduct = typeProduct;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(int typeProduct) {
        this.typeProduct = typeProduct;
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        Image image = imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        this.imageIcon = new ImageIcon(image);
    }
    
    

}
