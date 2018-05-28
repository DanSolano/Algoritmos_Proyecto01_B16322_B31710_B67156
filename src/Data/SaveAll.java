/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Data.AnyToArrayList;
import Data.DataCSV;
import Main.Algoritmos_Proyecto01_B16322_B31710_B67156;
import Utilities.StringPath;

/**
 *
 * @author daniel
 */
public class SaveAll {

    public void save() {
        saveAgent();
        saveAdmin();
        saveClient();
        saveDriver();
        saveProducts();
        saveRestaurant();
        saveOrder();
    }

    private void saveAgent() {
        AnyToArrayList anyArrayList = new AnyToArrayList();
        DataCSV agentCSV = new DataCSV(StringPath.PATH_AGENT);
        agentCSV.writeCSV(anyArrayList.userToArrayListObject(Algoritmos_Proyecto01_B16322_B31710_B67156.AGENT_LIST));

    }

    private void saveAdmin() {
        AnyToArrayList anyArrayList = new AnyToArrayList();
        DataCSV adminCSV = new DataCSV(StringPath.PATH_ADMIN);
        adminCSV.writeCSV(anyArrayList.userToArrayListObject(Algoritmos_Proyecto01_B16322_B31710_B67156.ADMIN_LIST));
    }

    private void saveClient() {
        AnyToArrayList anyArrayList = new AnyToArrayList();
        DataCSV clientCSV = new DataCSV(StringPath.PATH_CLIENT);
        clientCSV.writeCSV(anyArrayList.clientToArrayListObject(Algoritmos_Proyecto01_B16322_B31710_B67156.CLIENT_LIST));
    }

    private void saveDriver() {
        AnyToArrayList anyArrayList = new AnyToArrayList();
        DataCSV driverCSV = new DataCSV(StringPath.PATH_DRIVER);
        driverCSV.writeCSV(anyArrayList.driversToArrayListObject(Algoritmos_Proyecto01_B16322_B31710_B67156.DRIVER_QUEUE));
    }

    private void saveProducts() {
        AnyToArrayList anyArrayList = new AnyToArrayList();
        DataCSV prodctsCSV = new DataCSV(StringPath.PATH_PRODUCTS);
        prodctsCSV.writeCSV(anyArrayList.productsToArrayListObject(Algoritmos_Proyecto01_B16322_B31710_B67156.ALL_PRODUCTS_LIST));
    }

    private void saveRestaurant() {
        AnyToArrayList anyArrayList = new AnyToArrayList();
        DataCSV restaurantsCSV = new DataCSV(StringPath.PATH_RESTAURANT);
        restaurantsCSV.writeCSV(anyArrayList.restaurantToArrayListObject(Algoritmos_Proyecto01_B16322_B31710_B67156.RESTAURANT_LIST));
    }

    private void saveOrder() {
        AnyToArrayList anyArrayList = new AnyToArrayList();
        DataCSV agentCSV = new DataCSV(StringPath.PATH_ORDER);
        agentCSV.writeCSV(anyArrayList.orderToArrayListObject(Algoritmos_Proyecto01_B16322_B31710_B67156.ORDER_DETAIL_LIST));

    }

}
