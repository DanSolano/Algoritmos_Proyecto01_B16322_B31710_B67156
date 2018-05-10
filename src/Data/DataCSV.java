package Data;

import ADT.LinkedList.DoubleLinkedCircularList;
import Domain.Client;
import Domain.Details;
import Domain.Driver;
import Domain.OrderDetails;
import Domain.Products;
import Domain.Restaurant;
import Domain.User;
import Utilities.StringPath;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Class to read CSV files on Java. We use javacsv.jar to read it.
 *
 * @author daniel
 */
public class DataCSV {

    // Propiedades
    private String path;
    DoubleLinkedCircularList drinks;
    DoubleLinkedCircularList foods;
    DoubleLinkedCircularList desserts;
    DoubleLinkedCircularList others;
    ArrayList<Details> details;
    // Constructor

    public DataCSV(String path) {
        this.path = path;
    }

    public LinkedList<Client> readClient() {
        ArrayList<Object> list = readCSV();
        LinkedList<Client> users = new LinkedList<Client>();
        for (Object object : list) {
            users.add((Client) object);
        }
        return users;
    }

    public Queue<Driver> readDrivers() {
        ArrayList<Object> list = readCSV();
        Queue<Driver> drivers = new LinkedList<Driver>();
        for (Object object : list) {
            drivers.offer((Driver) object);
        }
        return drivers;
    }

    public ArrayList<User> readAgentAdmin() {
        ArrayList<Object> list = readCSV();
        ArrayList<User> users = new ArrayList<User>();
        for (Object object : list) {
            users.add((User) object);
        }
        return users;

    }

    public ArrayList<OrderDetails> readOrderDetails() {
        ArrayList<Object> list = readCSV();
        ArrayList<OrderDetails> users = new ArrayList<OrderDetails>();
        for (Object object : list) {
            users.add((OrderDetails) object);
        }
        return users;

    }

    public ArrayList<Restaurant> readRestaurants() {
        ArrayList<Object> list = readCSV();
        ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
        for (Object object : list) {
            restaurants.add((Restaurant) object);
        }
        return restaurants;

    }

    // Métodos
    /**
     * Lee un CSV que no contiene el mismo caracter que el separador en su texto
     * y sin comillas que delimiten los campos
     *
     * @param path Ruta donde está el archivo
     * @throws IOException
     */
    private ArrayList<Object> readCSV() {

        String outputFile = path;

        try {

            ArrayList<Object> objeclArrList = new ArrayList<>();

            File alreadyExists = new File(outputFile);

            if (alreadyExists.exists()) {

//                CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
//            } else {
                CsvReader dataImport = new CsvReader(path);
                dataImport.readHeaders();

                while (dataImport.readRecord()) {

                    if (path.equals(StringPath.PATH_ADMIN) || path.equals(StringPath.PATH_AGENT)) {
                        String name = dataImport.get(0);
                        String userName = dataImport.get(1);
                        String mail = dataImport.get(2);
                        String password = dataImport.get(3);
                        int code = Integer.parseInt(dataImport.get(4));
                        String kindUser = dataImport.get(5);

                        objeclArrList.add(new User(name, userName, mail, password, code, kindUser));
                    } else if (path.equals(StringPath.PATH_RESTAURANT)) {
                        String dni = dataImport.get(0);
                        String name = dataImport.get(1);
                        String location = dataImport.get(2);
                        this.readProducts(dni);

                        objeclArrList.add(new Restaurant(dni, name, location, this.drinks, this.foods, this.desserts, this.others));

                    } else if (path.equals(StringPath.PATH_CLIENT)) {
                        String name = dataImport.get(0);
                        String lastName = dataImport.get(1);
                        String mail = dataImport.get(2);
                        String phoneNumber = dataImport.get(3);
                        String province = dataImport.get(4);
                        String canton = dataImport.get(5);
                        String district = dataImport.get(6);

                        objeclArrList.add(new Client(name, lastName, mail, phoneNumber, province, canton, district));

                    } else if (path.equals(StringPath.PATH_ORDER_DETAIL)) {
                        int ordercounter = Integer.parseInt(dataImport.get(0));
                        String clienteName = dataImport.get(1);
                        String agentCode = dataImport.get(2);
                        String dateOrder = dataImport.get(3);
                        String province = dataImport.get(4);
                        String driverDni = dataImport.get(5);
                        String district = dataImport.get(6);

                        this.readDetails(ordercounter);
                        objeclArrList.add(new OrderDetails(ordercounter, clienteName, agentCode, dateOrder, province, driverDni, this.details));
                    } else if (path.equals(StringPath.PATH_DRIVER)) {
                        int ordercounter = Integer.parseInt(dataImport.get(0));
                        String dni = dataImport.get(1);
                        String name = dataImport.get(2);
                        int age = Integer.parseInt(dataImport.get(3));
                        String vehcle = dataImport.get(4);
                        String phoneNumber = dataImport.get(5);
                        String district = dataImport.get(6);

                        this.readDetails(ordercounter);
                        objeclArrList.add(new Driver(dni, name, age, vehcle, phoneNumber));
                    }

                }

                dataImport.close();

            }

            return objeclArrList;

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    private void readProducts(String dni) {
        this.path = StringPath.PATH_PRODUCTS;
        ArrayList<Object> list = readCSV();
        this.drinks = new DoubleLinkedCircularList();//0
        this.foods = new DoubleLinkedCircularList();//1
        this.desserts = new DoubleLinkedCircularList();//2
        this.others = new DoubleLinkedCircularList();//3

        for (Object object : list) {
            Products product = (Products) object;

            if (product.getTypeProduct() == 0 && product.getDni().equals(dni)) {
                this.drinks.insert(product);
            } else if (product.getTypeProduct() == 1 && product.getDni().equals(dni)) {
                this.foods.insert(product);
            } else if (product.getTypeProduct() == 2 && product.getDni().equals(dni)) {
                this.desserts.insert(product);
            } else if (product.getTypeProduct() == 3 && product.getDni().equals(dni)) {
                this.others.insert(product);
            }

        }

    }

    private void readDetails(int ordercounter) {
        this.path = StringPath.PATH_PRODUCTS;
        ArrayList<Object> list = readCSV();
        this.details = new ArrayList<>();
        for (Object object : list) {
            Details details = (Details) object;
            if (details.getOrderId() == ordercounter) {
                this.details.add(details);
            }

        }

    }

    public void writeCSV(ArrayList<User> clientLinketList) {

        String outputFile = path;

        boolean alreadyExists = new File(outputFile).exists();
        if (isDirectory()) {

            if (alreadyExists) {
                File ArchivoEmpleados = new File(outputFile);
                File directorio = new File(StringPath.PATH_DIR);
                directorio.mkdir();
                ArchivoEmpleados.delete();
            }

            try {

                CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');

                csvOutput.write("Name");
                csvOutput.write("UserName");
                csvOutput.write("Mail");
                csvOutput.write("Password");
                csvOutput.write("Code");
                csvOutput.write("Kind of User");
                csvOutput.endRecord();

                for (User agent : clientLinketList) {

                    csvOutput.write(agent.getName());
                    csvOutput.write(agent.getUserName());
                    csvOutput.write(agent.getMail());
                    csvOutput.write(agent.getPassword());
                    csvOutput.write(agent.getCode() + "");
                    csvOutput.write(agent.getKindUser());
                    csvOutput.endRecord();
                }

                csvOutput.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isDirectory() {
        File createDir = new File(StringPath.PATH_DIR);

        if (createDir.mkdir()) {
            return false;//false porque el directorio ya existe
        }
        return true;//true cuando CREA directorio nuevo
        
    }

}
