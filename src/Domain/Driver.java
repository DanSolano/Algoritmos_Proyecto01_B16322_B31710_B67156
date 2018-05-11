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
    //ID,Nombre,Apellido1,Apellido 2,Edad,tipo,Telefono,Placa vehículo,Cédula

    private String id;//we use this to rename the image with a counter that identifies the image that belongs to the driver.
    private String name;
    private String lastNameA;
    private String lastNameB;
    private String age;
    private String kindVehicle;
    private String phoneNumber;
    private String vehiclePlate;
    private String dni;

    public Driver() {
    }

    public Driver(String id, String name, String lastNameA, String lastNameB, String age, String kindVehicle, String phoneNumber, String vehiclePlate, String dni) {
        this.id = id;
        this.name = name;
        this.lastNameA = lastNameA;
        this.lastNameB = lastNameB;
        this.age = age;
        this.kindVehicle = kindVehicle;
        this.phoneNumber = phoneNumber;
        this.vehiclePlate = vehiclePlate;
        this.dni = dni;
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

    public String getLastNameA() {
        return lastNameA;
    }

    public void setLastNameA(String lastNameA) {
        this.lastNameA = lastNameA;
    }

    public String getLastNameB() {
        return lastNameB;
    }

    public void setLastNameB(String lastNameB) {
        this.lastNameB = lastNameB;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getKindVehicle() {
        return kindVehicle;
    }

    public void setKindVehicle(String kindVehicle) {
        this.kindVehicle = kindVehicle;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
