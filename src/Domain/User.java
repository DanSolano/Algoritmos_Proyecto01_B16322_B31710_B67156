/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 * Manages the complete information of a general User
 *
 * @version 1.0
 * @author Daniel Solano
 */
public class User {

    private String name;
    private String userName;
    private String Mail;
    private String password;
    private String code;
    private String kindUser;

    //Constructor predeterminado
    public User() {
    }

    //Constructor sobrecargado
    public User(String name, String userName, String Mail, String password, String code, String kindUser) {
        this.name = name;
        this.userName = userName;
        this.Mail = Mail;
        this.password = password;
        this.code = code;
        this.kindUser = kindUser;//Define if user is a agent or a manager user
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getKindUser() {
        return kindUser;
    }

    public void setKindUser(String kindUser) {
        this.kindUser = kindUser;
    }

}
