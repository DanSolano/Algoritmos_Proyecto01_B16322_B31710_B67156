/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author daniel
 */
public class OrderDetails {

    private int orderCounter;
    private String clientName;
    private String agentCode;
    private String dateOrder;
    private String province;
    private String driverDni;
    private ArrayList<Details> details;

    public OrderDetails() {
    }

    public OrderDetails(int orderCounter, String clientName, String agentCode, String dateOrder, String province, String driverDni, ArrayList<Details> details) {
        this.orderCounter = orderCounter;
        this.clientName = clientName;
        this.agentCode = agentCode;
        this.dateOrder = dateOrder;
        this.province = province;
        this.driverDni = driverDni;
        this.details = details;
    }

    public int getOrderCounter() {
        return orderCounter;
    }

    public void setOrderCounter(int orderCounter) {
        this.orderCounter = orderCounter;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(String dateOrder) {
        this.dateOrder = dateOrder;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDriverDni() {
        return driverDni;
    }

    public void setDriverDni(String driverDni) {
        this.driverDni = driverDni;
    }

    public ArrayList<Details> getDetails() {
        return details;
    }

    public void setDetails(ArrayList<Details> details) {
        this.details = details;
    }

}
