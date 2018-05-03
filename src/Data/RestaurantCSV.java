package Data;

import Domain.Restaurant;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Class to read CSV files on Java. We use javacsv.jar to read it.
 *
 * @author daniel
 */
public class RestaurantCSV {

    // Propiedades
    private char separador;
    private String path;

    // Constructor
    public RestaurantCSV(String path) {
        this.path = path;
    }

    // Métodos
    /**
     * Lee un CSV que no contiene el mismo caracter que el separador en su texto
     * y sin comillas que delimiten los campos
     *
     * @param path Ruta donde está el archivo
     * @throws IOException
     */
    public ArrayList<Restaurant> readCSV() {
        try {
            ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();

            CsvReader restaurantsImport = new CsvReader(path);
            restaurantsImport.readHeaders();

            while (restaurantsImport.readRecord()) {

                String dni = restaurantsImport.get(0);
                String name = restaurantsImport.get(1);
                String location = restaurantsImport.get(2);

                restaurants.add(new Restaurant(dni, name, location));

            }

            restaurantsImport.close();
            return restaurants;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    

    public void escibirCSV(LinkedList<Restaurant> restaurantLinketList) {

        String outputFile = path;

        boolean alreadyExists = new File(outputFile).exists();

        if (alreadyExists) {
            File fileRestaurant = new File(outputFile);
            fileRestaurant.delete();
        }

        try {

            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');

            csvOutput.write("DNI");
            csvOutput.write("Name");
            csvOutput.write("Location");

            csvOutput.endRecord();

            for (Restaurant emp : restaurantLinketList) {

                csvOutput.write(emp.getDni());
                csvOutput.write(emp.getName());
                csvOutput.write(emp.getLocation());

                csvOutput.endRecord();
            }

            csvOutput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
