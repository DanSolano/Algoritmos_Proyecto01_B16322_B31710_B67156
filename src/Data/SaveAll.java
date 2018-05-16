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
        AnyToArrayList anyArrayList = new AnyToArrayList();
        DataCSV agentCSV = new DataCSV(StringPath.PATH_AGENT);
        agentCSV.writeCSV(anyArrayList.userToArrayListObject(Algoritmos_Proyecto01_B16322_B31710_B67156.AGENT_LIST));

        DataCSV adminCSV = new DataCSV(StringPath.PATH_ADMIN);
        adminCSV.writeCSV(anyArrayList.userToArrayListObject(Algoritmos_Proyecto01_B16322_B31710_B67156.ADMIN_LIST));

        DataCSV clientCSV = new DataCSV(StringPath.PATH_CLIENT);
        clientCSV.writeCSV(anyArrayList.clientToArrayListObject(Algoritmos_Proyecto01_B16322_B31710_B67156.CLIENT_LIST));

        DataCSV driverCSV = new DataCSV(StringPath.PATH_DRIVER);
        driverCSV.writeCSV(anyArrayList.driversToArrayListObject(Algoritmos_Proyecto01_B16322_B31710_B67156.DRIVER_QUEUE));

        DataCSV prodctsCSV = new DataCSV(StringPath.PATH_PRODUCTS);
        prodctsCSV.writeCSV(anyArrayList.productsToArrayListObject(Algoritmos_Proyecto01_B16322_B31710_B67156.ALL_PRODUCTS_LIST));

        DataCSV restaurantsCSV = new DataCSV(StringPath.PATH_RESTAURANT);
        restaurantsCSV.writeCSV(anyArrayList.restaurantToArrayListObject(Algoritmos_Proyecto01_B16322_B31710_B67156.RESTAURANT_LIST));
    }

}
