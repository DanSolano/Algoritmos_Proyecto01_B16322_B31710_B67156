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
public class Driver {

    private String dni;//we use this to rename the image with a counter that identifies the image that belongs to the restaurant.
    private String name;
    private int age;
    private String vehicle;
    private String phoneNumber;

    public Driver() {
    }

    public Driver(String dni, String name, int age, String vehicle, String phoneNumber) {
        this.dni = dni;
        this.name = name;
        this.age = age;
        this.vehicle = vehicle;
        this.phoneNumber = phoneNumber;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
