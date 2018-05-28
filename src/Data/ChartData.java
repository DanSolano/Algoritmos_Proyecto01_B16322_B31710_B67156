/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import ADT.Stack.LinkedStack;
import Domain.Report;
import Domain.Restaurant;
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

    public JFreeChart areaChart;
    public JFreeChart pieChart;
    public JFreeChart barChart;
    public JFreeChart lineChart;
    ArrayList<Restaurant> rest;
    LinkedStack stackOrder;
    ArrayList<Report> reportOrder;

    public ChartData() {
        this.stackOrder = Algoritmos_Proyecto01_B16322_B31710_B67156.ORDER_DETAIL_LIST;
        this.rest = Algoritmos_Proyecto01_B16322_B31710_B67156.RESTAURANT_LIST;
        this.reportOrder = Algoritmos_Proyecto01_B16322_B31710_B67156.REPORT_FROM_ORDER_DETAIL;
        areaChart();
        barChart();
        lineChart();
        pieChart();

    }

    public void areaChart() {

        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        GetDataById getid = new GetDataById();
        ArrayList<Report> reportTotal = reportTotal();
        for (Report report1 : reportTotal) {
            String restName = getid.getRestaurantName(report1.getIdRestaurant());
            datos.addValue(report1.getTotal(), restName, report1.getDate());

        }

//        datos.addValue(23, "Restaurante 1", "Enero");
//        datos.addValue(24, "Restaurante 1", "Febrero");
//        datos.addValue(21, "Restaurante 1", "Marzo");
//        datos.addValue(11, "Restaurante 1", "Abril");
//        datos.addValue(13, "Restaurante 1", "Mayo");
//        datos.addValue(43, "Restaurante 1", "Junio");
//        datos.addValue(19, "Restaurante 2", "Enero");
//        datos.addValue(22, "Restaurante 2", "Febrero");
//        datos.addValue(10, "Restaurante 2", "Marzo");
//        datos.addValue(31, "Restaurante 2", "Abril");
//        datos.addValue(13, "Restaurante 2", "Mayo");
//        datos.addValue(25, "Restaurante 2", "Junio");
        areaChart = ChartFactory.createAreaChart("Ganacias de los Restaurantes", "Meses", "Cantidad", datos);

    }

    public void barChart() {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
//        datos.addValue(17, "Restaurante 1", "Enero");
//        datos.addValue(12, "Restaurante 2", "Marzo");
//        datos.addValue(13, "Restaurante 3", "Abril");
//        datos.addValue(15, "Restaurante 1", "Febrero");

        GetDataById getid = new GetDataById();
        ArrayList<Report> reportTotal = reportTotal();
        for (Report report1 : reportTotal) {
            String restName = getid.getRestaurantName(report1.getIdRestaurant());
            datos.addValue(report1.getTotal(), restName,report1.getDate());

        }
        barChart = ChartFactory.createBarChart3D("Ganancias de los Restaurantes ", null, null, datos);

    }

    public void lineChart() {

        DefaultCategoryDataset datos = new DefaultCategoryDataset();
            GetDataById getid = new GetDataById();
        ArrayList<Report> reportTotal = reportTotal();
        for (Report report1 : reportTotal) {
            String restName = getid.getRestaurantName(report1.getIdRestaurant());
            datos.addValue(report1.getTotal(), restName,report1.getDate());

        }
        
//        datos.addValue(177, "Negocio 1", "Enero");
//        datos.addValue(34, "Negocio 1", "Febrero");
//        datos.addValue(355, "Negocio 1", "Marzo");
//        datos.addValue(41, "Negocio 1", "Abril");
//        datos.addValue(125, "Negocio 1", "Mayo");
//        datos.addValue(63, "Negocio 1", "Junio");
//        datos.addValue(755, "Negocio 1", "Julio");

        lineChart = ChartFactory.createLineChart("Ganancias de los Restaurantes", "", "", datos);

    }

    public void pieChart() {
        DefaultPieDataset dataset = new DefaultPieDataset();
       
//        GetDataById getid = new GetDataById();
        ArrayList<Report> reportTotal = reportTotal();
        for (Report report1 : reportTotal) {
//            String restName = getid.getRestaurantName(report1.getIdRestaurant());
            dataset.setValue(report1.getDate(),report1.getTotal());

        }
        
//        dataset.setValue("Enero", new Double(20));
//        dataset.setValue("Febrero", new Double(20));
//        dataset.setValue("Marzo", new Double(40));
//        dataset.setValue("Abril", new Double(10));

        pieChart = ChartFactory.createPieChart("Ganancias de los Restaurantes", dataset);

    }

    private ArrayList<Report> reportTotal() {
//        Double total = 0.0;
        ArrayList<Report> reportListAux = new ArrayList<>();
        for (Report report : reportOrder) {
            if (reportListAux.isEmpty()) {
                reportListAux.add(report);
            } else if (reportExitsById(report, reportListAux)) {
                 reportListAux.add(report);
//                Report reportSearched = reportById(report, reportListAux);
//                total += report.getTotal();
//                System.out.println("total: " + total);
//                System.out.println("reportsearched: " +reportSearched.getTotal());
//                System.out.println("report: " + report.getTotal());
//                report.setTotal(total);
//                reportListAux.remove(report);
//                report.setTotal(total);
//                reportListAux.add(report);
//                System.out.println("Lista reporte" + report.toString());
            }
            else{
            reportListAux.add(report);
//            
            }

        }
        System.out.println("reportAux" + reportListAux.toString());
        return reportListAux;
    }

    private boolean reportExitsById(Report report, ArrayList<Report> reportAux) {
        String id = report.getIdRestaurant();
        for (Report report1 : reportAux) {
            if (id.equals(report1.getIdRestaurant())) {
                return true;
            }
        }
        return false;
    }

    private String monthDate() {
        String mes = "";

        for (Report report : reportOrder) {
            switch (report.getDate().getMonth() + 1) {
                case 1:
                    return mes = "Enero";
                case 2:
                    return mes = "Febrero";
                case 3:
                    return mes = "Marzo";
                case 4:
                    return mes = "Abril";
                case 5:
                    return mes = "Mayo";
                case 6:
                    return mes = "junio";
                case 7:
                    return mes = "julio";
                case 8:
                    return mes = "Agosto";
                case 9:
                    return mes = "Septiembre";
                case 10:
                    return mes = "Octubre";
                case 11:
                    return mes = "Noviembre";
                case 12:
                    return mes = "Diciembre";
                default:
                    break;
            }
            return mes;
        }
        return null;

    }
}

//    private Report reportById(Report report, ArrayList<Report> reportAux) {
//        String id = report.getIdRestaurant();
//        for (Report report1 : reportAux) {
//            if (id.equals(report1.getIdRestaurant())) {
//                return report1;
//            }
//        }
//        return null;
//    }
//    public LinkedStack reportList() {
//        LinkedStack reportRest = new LinkedStack();
//        LinkedStack stackTemp = new LinkedStack();
//        Order orderTemp = new Order();
//        System.out.println("Entro a reportList()");
//        try {
//            orderTemp = (Order) stackOrder.pop();
//           
//            System.out.println("---------------"+orderTemp.getId());
//        } catch (StackException ex) {
//            System.out.println("asfhskjnskdflkshdflk");
//        }
//        try {
//            while (!stackOrder.isEmpty()) {
//                orderTemp = (Order) stackOrder.pop();
//                GetDataById getid = new GetDataById();
//                String idRest = orderTemp.getRestaurantId();
//                String restName = getid.getRestaurantName(idRest);
//                if (reportRest.isEmpty()) {
//                    reportRest.push(new Report(idRest, restName, Double.parseDouble(orderTemp.getTotal()), orderTemp.getCurrentDate()));
//                    System.out.println("reportRest.isEmpty()");
//                } else if (!reportRestExistByRestId(idRest, reportRest)) {
//                    reportRest.push(new Report(idRest, restName, Double.parseDouble(orderTemp.getTotal()), orderTemp.getCurrentDate()));
//                    System.out.println("reportRestExistByRestId(idRest, reportRest");
//                }else{
//                Report report=reportRestByRestId(idRest, reportRest);
//                    System.out.println("reportRestByRestId(idRest, reportRest)");
//                report.setTotal(report.getTotal()+Double.parseDouble(orderTemp.getTotal()));
//                    System.out.println(""+report.toString());
//                
//                }
////                stackTemp.push(orderTemp);
//            }
//            //Reordenamiento de la pila temporar a la Principal
////            while (!stackTemp.isEmpty()) {
////                stackOrder.push(stackTemp.pop());
////            }
//        } catch (Exception e) {
//            
//            System.err.println(e + "Error al recorrer las ordenes reportList()");
//        }
//        return reportRest;
//    }
//
//    private boolean reportRestExistByRestId(String idRest, LinkedStack lS) throws StackException {
//        Report  report = new Report();
//        LinkedStack reportRest = new LinkedStack();
//        LinkedList<Report> reportLinkedList =cloneLinkedStack(lS);
//        for (Report report1 : reportLinkedList) {
//            reportRest.push(report); 
//        }
//        
//        while (!reportRest.isEmpty()) {            
//            report= (Report) reportRest.pop();
//            lS.push(report);
//            if (report.getIdRestaurant().equals(idRest)) {
//                return true;
//            }
//        }
//       
//        return false;
//    }
//
//    private Report reportRestByRestId(String idRest, LinkedStack lS) throws StackException {
//    Report  report = new Report();
//        LinkedStack reportRest = new LinkedStack();
//        LinkedList<Report> reportLinkedList =cloneLinkedStack(lS);
//        for (Report report1 : reportLinkedList) {
//            reportRest.push(report); 
//        }
//        while (!reportRest.isEmpty()) {            
//            report= (Report) reportRest.pop();
//             lS.push(report);
//            if (report.getIdRestaurant().equals(idRest)) {
//                return report;
//            }
//        }
//    return null;
//    }
//
//    private LinkedList<Report> cloneLinkedStack(LinkedStack lS) throws StackException {
//        LinkedList<Report> linkedList = new LinkedList<>();
//        while (!linkedList.isEmpty()) {            
//           Report report= (Report) lS.pop();
//           linkedList.add(report);
//        }
//        return linkedList;
//                
//    }
