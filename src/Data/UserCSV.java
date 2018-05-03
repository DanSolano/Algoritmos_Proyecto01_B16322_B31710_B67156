package Data;

import Domain.User;
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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class to read CSV files on Java. We use javacsv.jar to read it.
 *
 * @author daniel
 */
public class UserCSV {

    // Propiedades
    private char separador;
    private String path;

    // Constructor
    public UserCSV(String path) {
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
    public ArrayList<User> readCSV() {

        try {
            ArrayList<User> agentes = new ArrayList<User>();
            
            CsvReader empleados_import = new CsvReader(path);
            empleados_import.readHeaders();
            
            while (empleados_import.readRecord()) {
                String name = empleados_import.get(0);
                String userName = empleados_import.get(1);
                String mail = empleados_import.get(2);
                String password = empleados_import.get(3);
                int code = Integer.parseInt(empleados_import.get(4));
                String kindUser = empleados_import.get(5);
                
                agentes.add(new User(name, userName, mail, password, code, kindUser));
            }
            
            empleados_import.close();
            
            for (User emp : agentes) {
                
                System.out.println(emp.getName() + " - " + emp.getUserName() + " - "
                        + emp.getMail() + " - " + emp.getPassword());
            }
            
            return agentes;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public void writeCSV(ArrayList<User> clientLinketList) {

        String outputFile = path;

        boolean alreadyExists = new File(outputFile).exists();

        if (alreadyExists) {
            File ArchivoEmpleados = new File(outputFile);
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
