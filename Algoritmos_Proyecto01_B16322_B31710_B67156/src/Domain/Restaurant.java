/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import ADT.LinkedList.DoubleLinkedCircularList;

/**
 *
 * @author daniel
 */
public class Restaurant {

    private String dni;//we use this to rename the image with a counter that identifies the image that belongs to the restaurant.
    private String name;
    private String location;
    private DoubleLinkedCircularList drinks = new DoubleLinkedCircularList();
    private DoubleLinkedCircularList foods = new DoubleLinkedCircularList();
    private DoubleLinkedCircularList desserts = new DoubleLinkedCircularList();
    private DoubleLinkedCircularList others = new DoubleLinkedCircularList();

    public Restaurant() {
    }

    public Restaurant(String dni, String name, String location) {
        this.dni = dni;
        this.name = name;
        this.location = location;
    }

    public Restaurant(String dni, String name, String location, DoubleLinkedCircularList drinks, DoubleLinkedCircularList foods, DoubleLinkedCircularList desserts, DoubleLinkedCircularList others) {
        this.dni = dni;
        this.name = name;
        this.location = location;
        this.drinks = drinks;
        this.foods = foods;
        this.desserts = desserts;
        this.others = others;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public DoubleLinkedCircularList getDrinks() {
        return drinks;
    }

    public void setDrinks(DoubleLinkedCircularList drinks) {
        this.drinks = drinks;
    }

    public DoubleLinkedCircularList getFoods() {
        return foods;
    }

    public void setFoods(DoubleLinkedCircularList foods) {
        this.foods = foods;
    }

    public DoubleLinkedCircularList getDesserts() {
        return desserts;
    }

    public void setDesserts(DoubleLinkedCircularList desserts) {
        this.desserts = desserts;
    }

    public DoubleLinkedCircularList getOthers() {
        return others;
    }

    public void setOthers(DoubleLinkedCircularList others) {
        this.others = others;
    }

}
