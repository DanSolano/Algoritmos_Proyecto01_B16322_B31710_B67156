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
        pieChart();

    }

    public void areaChart() {

        DefaultCategoryDataset datos = new DefaultCategoryDataset();

//        if (!orders.isEmpty()) {
//            GetDataById getDataById = new GetDataById();
//            try {
//                for (int i = 0; i <= orders.getSize(); i++) {
//                    Order order = (Order) orders.pop();
//                    if (order.getRestaurantId().equals(i)) {
//                        String nameRestaurant = getDataById.getRestaurantName(order.getRestaurantId());
//                        datos.addValue(Integer.parseInt(order.getId()), nameRestaurant, "Enero");
//                    }
//                    areaChart = ChartFactory.createAreaChart("Ganacias de los Restaurantes", "Meses", "Cantidad", datos);
//                }
//
//            } catch (StackException ex) {
//                System.err.println("Error de lectura de las ordenes!!!");
//            }
//        }
        datos.addValue(23, "Restaurante 1", "Enero");
        datos.addValue(24, "Restaurante 1", "Febrero");
        datos.addValue(21, "Restaurante 1", "Marzo");
        datos.addValue(11, "Restaurante 1", "Abril");
        datos.addValue(13, "Restaurante 1", "Mayo");
        datos.addValue(43, "Restaurante 1", "Junio");
        datos.addValue(19, "Restaurante 2", "Enero");
        datos.addValue(22, "Restaurante 2", "Febrero");
        datos.addValue(10, "Restaurante 2", "Marzo");
        datos.addValue(31, "Restaurante 2", "Abril");
        datos.addValue(13, "Restaurante 2", "Mayo");
        datos.addValue(25, "Restaurante 2", "Junio");
        areaChart = ChartFactory.createAreaChart("Ganacias de los Restaurantes", "Meses", "Cantidad", datos);

    }

    public void barChart() {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.addValue(23, "Restaurante 1", "Enero");
        datos.addValue(23, "Restaurante 1", "Marzo");
        datos.addValue(23, "Restaurante 1", "Abril");
        datos.addValue(23, "Restaurante 1", "Febrero");

        barChart = ChartFactory.createBarChart3D("Ganancias de los Restaurantes ", null, null, datos);

    }

    public void lineChart() {

        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.addValue(177, "Negocio 1", "Enero");
        datos.addValue(34, "Negocio 1", "Febrero");
        datos.addValue(355, "Negocio 1", "Marzo");
        datos.addValue(41, "Negocio 1", "Abril");
        datos.addValue(125, "Negocio 1", "Mayo");
        datos.addValue(63, "Negocio 1", "Junio");
        datos.addValue(755, "Negocio 1", "Julio");

        lineChart = ChartFactory.createLineChart("Ganancias de los Restaurantes", "", "", datos);

    }

    public void pieChart() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Enero", new Double(20));
        dataset.setValue("Febrero", new Double(20));
        dataset.setValue("Marzo", new Double(40));
        dataset.setValue("Abril", new Double(10));

        pieChart = ChartFactory.createPieChart("Ganancias de los Restaurantes", dataset);

    }

}
