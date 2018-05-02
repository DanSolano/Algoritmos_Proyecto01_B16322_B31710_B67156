/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

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
    
    JFreeChart areaChart;
    JFreeChart pieChart;
    JFreeChart barChart;
    JFreeChart LineChart;

    public ChartData() {
        areaChart();
        barChart();
    }
    
    private void areaChart() {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.addValue(177, "Negocio 1", "Enero");
        datos.addValue(34, "Negocio 1", "Febrero");
        datos.addValue(355, "Negocio 1", "Marzo");
        datos.addValue(41, "Negocio 1", "Abril");
        datos.addValue(125, "Negocio 1", "Mayo");
        datos.addValue(63, "Negocio 1", "Junio");
        datos.addValue(755, "Negocio 1", "Julio");

        areaChart = ChartFactory.createAreaChart(null, null, null, datos);

    }
    private void barChart() {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.addValue(23, "Restaurante 1", "Enero");
        datos.addValue(23, "Restaurante 1", "Marzo");
        datos.addValue(23, "Restaurante 1", "Abril");
        datos.addValue(23, "Restaurante 1", "Febrero");

        barChart = ChartFactory.createBarChart3D("Ganancias restaurante ", null, null, datos);

    }
}
