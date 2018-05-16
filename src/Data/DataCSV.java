package Data;

import ADT.LinkedList.DoubleLinkedCircularList;
import Domain.Client;
import Domain.Driver;
import Domain.Order;
import Domain.Products;
import Domain.Restaurant;
import Domain.User;
import Main.Algoritmos_Proyecto01_B16322_B31710_B67156;
import Utilities.StringPath;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
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
    
    public ArrayList<Products> readProducts() {
        ArrayList<Object> list = readCSV();
        ArrayList<Products> users = new ArrayList<Products>();
        for (Object object : list) {
            users.add((Products) object);
        }
        return users;
    }
    
    public ArrayList<Order> readOrderDetails() {
        ArrayList<Object> list = readCSV();
        ArrayList<Order> users = new ArrayList<Order>();
        for (Object object : list) {
            users.add((Order) object);
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
        
        String outputFile = this.path;
        
        try {
            
            ArrayList<Object> objeclArrList = new ArrayList<>();
            
            File alreadyExists = new File(outputFile);
            
            if (alreadyExists.exists()) {
                
                CsvReader dataImport = new CsvReader(outputFile, ';', Charset.forName("UTF-8"));
                dataImport.setDelimiter(';');
                
                dataImport.readHeaders();
                
                while (dataImport.readRecord()) {
                    
                    if (path.equals(StringPath.PATH_ADMIN) || path.equals(StringPath.PATH_AGENT)) {
                        
                        String name = dataImport.get(0);
                        String userName = dataImport.get(1);
                        String mail = dataImport.get(2);
                        String password = dataImport.get(3);
                        String code = dataImport.get(4);
                        String kindUser = dataImport.get(5);
                        
                        objeclArrList.add(new User(name, userName, mail, password, code, kindUser));
                        
                    } else if (path.equals(StringPath.PATH_RESTAURANT)) {
                        String dni = dataImport.get(0);
                        String name = dataImport.get(1);
                        String location = dataImport.get(2);
                        String province = dataImport.get(3);
                        this.distributeProducts(dni);
                        
                        objeclArrList.add(new Restaurant(dni, name, location, province, this.drinks, this.foods, this.desserts, this.others));
                        
                    } else if (path.equals(StringPath.PATH_PRODUCTS)) {
                        String id = dataImport.get(0);
                        String idRestaurant = dataImport.get(1);
                        String name = dataImport.get(2);
                        String price = dataImport.get(3);
                        String typeProduct = dataImport.get(4);
                        
                        objeclArrList.add(new Products(id, idRestaurant, name, price, typeProduct));
                        
                    } else if (path.equals(StringPath.PATH_CLIENT)) {
                        
                        String id = dataImport.get(0);
                        String name = dataImport.get(1);
                        String lastNameA = dataImport.get(2);
                        String lastNameB = dataImport.get(3);
                        String mail = dataImport.get(4);
                        String phoneNumber = dataImport.get(5);
                        String province = dataImport.get(6);
                        String exactAddress = dataImport.get(7);
                        
                        objeclArrList.add(new Client(id, name, lastNameA, lastNameB, mail, phoneNumber, province, exactAddress));
                        
                    } else if (path.equals(StringPath.PATH_DRIVER)) {

                        //ID,Nombre,Apellido1,Apellido 2,Edad,tipo,Telefono,Placa vehículo,Cédula
                        String id = dataImport.get(0);
                        String name = dataImport.get(1);
                        String lastNameA = dataImport.get(2);
                        String lastNameB = dataImport.get(3);
                        String age = dataImport.get(4);
                        String kindVehicle = dataImport.get(5);
                        String phoneNumber = dataImport.get(6);
                        String vehiclePlate = dataImport.get(7);
                        String dni = dataImport.get(8);
                        
                        objeclArrList.add(new Driver(id, name, lastNameA, lastNameB, age, kindVehicle, phoneNumber, vehiclePlate, dni));
                    } else if (path.equals(StringPath.PATH_ORDER)) {

                        //ID,Nombre,Apellido1,Apellido 2,Edad,tipo,Telefono,Placa vehículo,Cédula
                        String id = dataImport.get(0);
                        String clientId = dataImport.get(1);
                        String restaurantId = dataImport.get(2);
                        String productId = dataImport.get(3);
                        String quantity = dataImport.get(4);
                        String totalItems = dataImport.get(5);
                        
                        objeclArrList.add(new Order(id, clientId, restaurantId, productId, quantity, totalItems));
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
    
    public void writeCSV(ArrayList<Object> writeList) {
        
        String outputFile = this.path;
        
        boolean alreadyExists = new File(outputFile).exists();
        if (isDirectory()) {
            
            if (alreadyExists) {
                File ArchivoEmpleados = new File(outputFile);
                File directorio = new File(StringPath.PATH_DIR);
                directorio.mkdir();
                ArchivoEmpleados.delete();
            }
            
            try {
                
                CsvWriter csvOutput = new CsvWriter(outputFile, ';', Charset.forName("UTF-8"));
//                csvOutput.setDelimiter(';');
                if (outputFile.equals(StringPath.PATH_ADMIN) || outputFile.equals(StringPath.PATH_AGENT)) {
                    csvOutput.write("Name");
                    csvOutput.write("UserName");
                    csvOutput.write("Mail");
                    csvOutput.write("Password");
                    csvOutput.write("Code");
                    csvOutput.write("Kind of User");
                    csvOutput.endRecord();
                    
                    for (Object object : writeList) {
                        User agent = (User) object;
                        csvOutput.write(agent.getName());
                        csvOutput.write(agent.getUserName());
                        csvOutput.write(agent.getMail());
                        csvOutput.write(agent.getPassword());
                        csvOutput.write(agent.getCode() + "");
                        csvOutput.write(agent.getKindUser());
                        csvOutput.endRecord();
                    }
                    
                } else if (outputFile.equals(StringPath.PATH_CLIENT)) {
                    
                    csvOutput.write("ID");
                    csvOutput.write("Name");
                    csvOutput.write("Last Name A");
                    csvOutput.write("Last Name B");
                    csvOutput.write("Mail");
                    csvOutput.write("Phone Number");
                    csvOutput.write("Province");
                    csvOutput.write("Exact Address");
                    csvOutput.endRecord();
                    
                    for (Object object : writeList) {
                        Client client = (Client) object;
                        csvOutput.write(client.getId());
                        csvOutput.write(client.getName());
                        csvOutput.write(client.getLastNameA());
                        csvOutput.write(client.getLastNameB());
                        csvOutput.write(client.getMail());
                        csvOutput.write(client.getPhoneNumber());
                        csvOutput.write(client.getProvince());
                        csvOutput.write(client.getExactAddress());
                        
                        csvOutput.endRecord();
                    }
                    
                } else if (outputFile.equals(StringPath.PATH_DRIVER)) {
                    
                    csvOutput.write("ID");
                    csvOutput.write("Name");
                    csvOutput.write("Last Name A");
                    csvOutput.write("Last Name B");
                    csvOutput.write("Age");
                    csvOutput.write("Kind Vehicle");
                    csvOutput.write("Phone Number");
                    csvOutput.write("Vehicle Plate");
                    csvOutput.write("DNI");
                    csvOutput.endRecord();
                    
                    for (Object object : writeList) {
                        Driver client = (Driver) object;
                        csvOutput.write(client.getId());
                        csvOutput.write(client.getName());
                        csvOutput.write(client.getLastNameA());
                        csvOutput.write(client.getLastNameB());
                        csvOutput.write(client.getAge());
                        csvOutput.write(client.getKindVehicle());
                        csvOutput.write(client.getPhoneNumber());
                        csvOutput.write(client.getVehiclePlate());
                        csvOutput.write(client.getDni());
                        
                        csvOutput.endRecord();
                    }
                    
                } else if (outputFile.equals(StringPath.PATH_ORDER)) {
                    csvOutput.write("Id Order");
                    csvOutput.write("Id Client");
                    csvOutput.write("Id Restaurant");
                    csvOutput.write("Id Product");
                    csvOutput.write("Quantity");
                    csvOutput.write("Total items");
                    csvOutput.endRecord();
                    
                    for (Object object : writeList) {
                        Order order = (Order) object;
                        csvOutput.write(order.getId());
                        csvOutput.write(order.getClientId());
                        csvOutput.write(order.getRestaurantId());
                        csvOutput.write(order.getProductoId());
                        csvOutput.write(order.getQuantity());
                        csvOutput.write(order.getTotal());
                        csvOutput.endRecord();
                    }
                    
                } else if (outputFile.equals(StringPath.PATH_RESTAURANT)) {
                    csvOutput.write("id");
                    csvOutput.write("Name");
                    csvOutput.write("Province");
                    csvOutput.write("Location");
                    csvOutput.endRecord();
                    
                    for (Object object : writeList) {
                        Restaurant agent = (Restaurant) object;
                        csvOutput.write(agent.getDni());
                        csvOutput.write(agent.getName());
                        csvOutput.write(agent.getProvince());
                        csvOutput.write(agent.getLocation());
                        csvOutput.endRecord();
                    }
                    
                } else if (outputFile.equals(StringPath.PATH_PRODUCTS)) {
                    csvOutput.write("Id");
                    csvOutput.write("Id Restaurant");
                    csvOutput.write("Name");
                    csvOutput.write("price");
                    csvOutput.write("typeProduct");
                    csvOutput.endRecord();
                    
                    for (Object object : writeList) {
                        Products agent = (Products) object;
                        csvOutput.write(agent.getId());
                        csvOutput.write(agent.getIdRestaurant());
                        csvOutput.write(agent.getName());
                        csvOutput.write(agent.getPrice() + "");
                        csvOutput.write(agent.getTypeProduct() + "");
                        csvOutput.endRecord();
                    }
                    
                }
                
                csvOutput.close();
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void distributeProducts(String dni) {
        
        ArrayList<Products> list = Algoritmos_Proyecto01_B16322_B31710_B67156.ALL_PRODUCTS_LIST;
        this.drinks = new DoubleLinkedCircularList();//0
        this.foods = new DoubleLinkedCircularList();//1
        this.desserts = new DoubleLinkedCircularList();//2
        this.others = new DoubleLinkedCircularList();//3

        for (Products object : list) {
            Products product = (Products) object;
            int typeProd = Integer.parseInt(product.getTypeProduct());
            if (typeProd == 0 && product.getId().equals(dni)) {
                this.drinks.insert(product);
            } else if (typeProd == 1 && product.getId().equals(dni)) {
                this.foods.insert(product);
            } else if (typeProd == 2 && product.getId().equals(dni)) {
                this.desserts.insert(product);
            } else if (typeProd == 3 && product.getId().equals(dni)) {
                this.others.insert(product);
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
