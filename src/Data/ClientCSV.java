package Data;

import Domain.Client;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
public class ClientCSV {

    // Propiedades
    private char separador;
    private String path;

    // Constructor
    public ClientCSV() {
        this.path = "./Client.csv";
    }

    // Métodos
    /**
     * Lee un CSV que no contiene el mismo caracter que el separador en su texto
     * y sin comillas que delimiten los campos
     *
     * @param path Ruta donde está el archivo
     * @throws IOException
     */
    public void leerCSV() {
        try {
            List<Client> usuarios = new ArrayList<Client>();

            CsvReader empleados_import = new CsvReader(path);
            empleados_import.readHeaders();

            while (empleados_import.readRecord()) {

                String nombre = empleados_import.get(0);
                String apellidos = empleados_import.get(1);
                String correo = empleados_import.get(2);
                String phone = empleados_import.get(3);
                String province = empleados_import.get(4);
                String canton = empleados_import.get(5);
                String district = empleados_import.get(6);

                usuarios.add(new Client(nombre, apellidos, correo, phone, province, canton, district));

            }

            empleados_import.close();

            for (Client emp : usuarios) {

                System.out.println(emp.getName() + " - " + emp.getLastName() + " - "
                        + emp.getPhoneNumber() + " - " + emp.getMail());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escibirCSV(LinkedList<Client> clientLinketList) {

        String outputFile = path;

        boolean alreadyExists = new File(outputFile).exists();

        if (alreadyExists) {
            File ArchivoEmpleados = new File(outputFile);
            ArchivoEmpleados.delete();
        }

        try {

            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');

            csvOutput.write("Name");
            csvOutput.write("LastName");
            csvOutput.write("Mail");
            csvOutput.write("Phone Number");
            csvOutput.write("Province");
            csvOutput.write("Canton");
            csvOutput.write("District");
            csvOutput.endRecord();

            for (Client emp : clientLinketList) {

                csvOutput.write(emp.getName());
                csvOutput.write(emp.getLastName());
                csvOutput.write(emp.getMail());
                csvOutput.write(emp.getPhoneNumber());
                csvOutput.write(emp.getProvince());
                csvOutput.write(emp.getCanton());
                csvOutput.write(emp.getDistrict());
                csvOutput.endRecord();
            }

            csvOutput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
