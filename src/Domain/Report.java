/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.Date;

/**
 *
 * @author Luis Cerdas Garita
 */
public class Report {

    private String idRestaurant;
    private Double total;
    private String date;


    public Report() {
    }

    public Report(String idRestaurant, Double total, String date) {
        this.idRestaurant = idRestaurant;
        this.total = total;
        this.date = date;
    }

    public String getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(String idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Report{" + "idRestaurant=" + idRestaurant + ", total=" + total + ", date=" + date + '}';
    }

    
}
