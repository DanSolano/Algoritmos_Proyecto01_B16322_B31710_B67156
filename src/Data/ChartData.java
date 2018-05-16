/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import ADT.Stack.LinkedStack;
import Domain.Order;
import Domain.Restaurant;
import Exceptions.StackException;
import Main.Algoritmos_Proyecto01_B16322_B31710_B67156;
import Utilities.GetDataById;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 * Class for create Charts
 *
 * @author Luis, Daniel, Jesús
 * @version 1.0
 */
public class ChartData {

    public int montoTotal;
    public JFreeChart areaChart;
    public JFreeChart pieChart;
    public JFreeChart barChart;
    public JFreeChart lineChart;
    ArrayList<Restaurant> rest = Algoritmos_Proyecto01_B16322_B31710_B67156.RESTAURANT_LIST;
    LinkedStack orders = Algoritmos_Proyecto01_B16322_B31710_B67156.ORDER_DETAIL_LIST;

    ;

    public ChartData() {
        areaChart();
        barChart();
        lineChart();
    }

    private void areaChart() {

        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        if (!orders.isEmpty()) {
            GetDataById getDataById = new GetDataById();
            try {
                for (int i = 0; i <= orders.getSize(); i++) {
                    Order order = (Order) orders.pop();
                    if (order.getRestaurantId().equals(i)) {
                        String nameRestaurant = getDataById.getRestaurantName(order.getRestaurantId());
                        datos.addValue(12, nameRestaurant, "Ventas Totales");
                    }
                }
                
            } catch (StackException ex) {
                System.err.println("Error de lectura de las ordenes!!!");
            }

//        datos.addValue(23, "Restaurante 1", "Enero");
            areaChart = ChartFactory.createAreaChart("nombre Restaurante", null, null, datos);
        }
    }

    private void barChart() {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.addValue(23, "Restaurante 1", "Enero");
        datos.addValue(23, "Restaurante 1", "Marzo");
        datos.addValue(23, "Restaurante 1", "Abril");
        datos.addValue(23, "Restaurante 1", "Febrero");

        barChart = ChartFactory.createBarChart3D("Ganancias restaurante ", null, null, datos);

    }

    private void lineChart() {

        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.addValue(177, "Negocio 1", "Enero");
        datos.addValue(34, "Negocio 1", "Febrero");
        datos.addValue(355, "Negocio 1", "Marzo");
        datos.addValue(41, "Negocio 1", "Abril");
        datos.addValue(125, "Negocio 1", "Mayo");
        datos.addValue(63, "Negocio 1", "Junio");
        datos.addValue(755, "Negocio 1", "Julio");

        lineChart = ChartFactory.createLineChart("Ganancias de los restaurantes", "", "", datos);
    }

}
