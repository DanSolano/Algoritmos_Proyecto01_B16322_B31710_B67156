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
public class Products {

    private String dni;//we use this to rename the image with a counter that identifies the image that belongs to the restaurant.
    private String name;
    private double price;
    private int typeProduct;//1=Drinks 2=Foods 3=Desserts 4=Others

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

}
