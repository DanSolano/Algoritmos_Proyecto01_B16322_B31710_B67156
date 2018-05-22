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

    private String id;
    private String name;
    private String location;
    private String province;
    private DoubleLinkedCircularList drinks;// = new DoubleLinkedCircularList();
    private DoubleLinkedCircularList foods;// = new DoubleLinkedCircularList();
    private DoubleLinkedCircularList desserts;// = new DoubleLinkedCircularList();
    private DoubleLinkedCircularList others;// = new DoubleLinkedCircularList();

    public Restaurant() {
    }

    public Restaurant(String id, String name, String location, String province, DoubleLinkedCircularList drinks, DoubleLinkedCircularList foods, DoubleLinkedCircularList desserts, DoubleLinkedCircularList others) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.province = province;
        this.drinks = drinks;
        this.foods = foods;
        this.desserts = desserts;
        this.others = others;
    }

    public Restaurant(String id, String name, String location, String province) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.province = province;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
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
