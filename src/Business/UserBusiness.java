package Business;

import Data.UserData;
import Domain.User;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class UserBusiness {

    UserData herramientaData;

    //Constructor de la clase
    public UserBusiness() {
        this.herramientaData = new UserData();
    }//Constructor

    //Accede a la capa Data para  agregar un registro al final
    public boolean agregarRegistroAlFinal(User herramienta) throws IOException {
        return this.herramientaData.agregarRegistroAlFinal(herramienta);
    }

    //Accede a la capa data para tomar del archivo todos los registros y agregarlos a una lista
    public List<User> getTodasUsers() {
        return this.herramientaData.getTodasUsers();
    }

    //Accede a la capa data y "borra" la herramienta a la que le corresponde el user
    public boolean borrarRegistro(String user) throws IOException {
        return this.herramientaData.borrarRegistro(user);
    }

    //Accede a la capa data para traer del archivo la herramienta que corresponde al user
    public User getUserPorCodigo(String user) throws IOException {
        return this.herramientaData.getUserPorCodigo(user);
    }

    //Accede a la capa data para tomar del archivo todos los registros que coinciden
    //con nombre que se ingrese y los agregar a una lista, en el caso del user, 
    //solamente toma la herramienta a la que le pertenece ese user
    public List<User> getUsersPorNombreYCodigo(String busqueda) {
        return this.herramientaData.getUsersPorNombreYCodigo(busqueda);
    }

    //valida si el user ingresado existe en el archivo
    public boolean existe(String user) throws IOException {
        return this.herramientaData.existe(user);
    }

    //Accede a la capa data  y modifica un  registro en el archivo
    public boolean modificarRegistro(String user, String nombre, int precio) throws IOException {
        return this.herramientaData.modificarRegistro(user, nombre, precio);
    }

}
