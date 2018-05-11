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
public class Client {

    private String id;
    private String name;
    private String lastNameA;
    private String lastNameB;
    private String mail;
    private String phoneNumber;
    private String province;
    private String exactAddress;

    public Client() {
    }

    public Client(String id, String name, String lastNameA, String lastNameB, String mail, String phoneNumber, String province, String exactAddress) {
        this.id = id;
        this.name = name;
        this.lastNameA = lastNameA;
        this.lastNameB = lastNameB;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.province = province;
        this.exactAddress = exactAddress;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getExactAddress() {
        return exactAddress;
    }

    public void setExactAddress(String exactAddress) {
        this.exactAddress = exactAddress;
    }

}
