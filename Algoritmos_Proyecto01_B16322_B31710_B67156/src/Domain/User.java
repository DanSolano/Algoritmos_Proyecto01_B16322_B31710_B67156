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
    private String eMail;
    private String password;
    private int code;
    private String kindUser;

    //Constructor predeterminado
    public User() {
    }

    //Constructor sobrecargado
    public User(String name, String userName, String eMail, String password, int code, String kindUser) {
        this.name = name;
        this.userName = userName;
        this.eMail = eMail;
        this.password = password;
        this.code = code;
        this.kindUser = kindUser;//Define if user is a agent or a manager user
    }

    //retorna el tamano del registro
    public int tamano() {
        return this.getName().length() * 2 + this.getUserName().length() * 2
                + this.geteMail().length() * 2 + this.getPassword().length() * 2
                + this.getKindUser().length() * 2 + 4;
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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getKindUser() {
        return kindUser;
    }

    public void setKindUser(String kindUser) {
        this.kindUser = kindUser;
    }

}
