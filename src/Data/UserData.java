/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.User;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class UserData {

    private int tamanoRegistro;
    private int cantidadRegistros; 
    String rutaDelArchivo; 
    private RandomAccessFile randomAccessFile;

    //Constructor de la clase
    public UserData() {
        
        try {
            this.rutaDelArchivo = "user.dat";
            File archivo = new File(rutaDelArchivo);
            iniciar(archivo);
        } catch (IOException ex) {
            Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);
        }//try.catch//try.catch//try.catch//try.catch//try.catch//try.catch//try.catch//try.catch

    }

    //Inicializa archivo
    private void iniciar(File archivo) throws IOException {
        this.rutaDelArchivo = archivo.getPath();
        this.tamanoRegistro = 140;

        if (archivo.exists() && !archivo.isFile()) {
            throw new IOException(archivo.getName() + "Archivo Invalido");
        } else {
            randomAccessFile = new RandomAccessFile(archivo, "rw");
            this.cantidadRegistros = (int) Math.ceil((double) randomAccessFile.length() / (double) tamanoRegistro);
        }
    }//iniciar

    //retorna el tamano del archivo
    public int tamanoArchivo() {
        return this.cantidadRegistros;
    }

    //inserta user en una posisión del archivo
    public boolean insertar(int p, User user) throws IOException {
        if (p >= 0 && p <= cantidadRegistros) {
            if (user.tamano() > tamanoRegistro) {
                System.err.println("001: Tamaño de registro superado");
                return false;
            } else //if (!existe(user)) {
            {
                this.randomAccessFile.seek(p * tamanoRegistro);
            }
            randomAccessFile.writeUTF(user.getPassword());
            randomAccessFile.writeUTF(user.getName());
            randomAccessFile.writeUTF(user.getUserName());
            randomAccessFile.writeInt(user.getCode());
            return true;
        } else {
            System.err.println("002: Posición Fuera del Archivo");
            return false;
        }//if(p >=0 && p<= cantidadRegistros)

    }//insertar

    //agregar un registro al final del archivo
    public boolean agregarRegistroAlFinal(User user) throws IOException {
        boolean correcto = false;
        //if (!existe(user)){
        correcto = insertar(cantidadRegistros, user);
        if (correcto) {
            ++cantidadRegistros;
        }
        //}
        return correcto;
    }//agregarRegistroAlFinal

    //retorna una user en una posición dada
    public User getUserPorPosicion(int p) {
        if (p >= 0 && p <= cantidadRegistros) {
            try {
                this.randomAccessFile.seek(p * tamanoRegistro);
                User user = new User();
                user.setPassword(this.randomAccessFile.readUTF());
                user.setName(this.randomAccessFile.readUTF());
                user.setKindUser(this.randomAccessFile.readUTF());
                user.setCode(this.randomAccessFile.readInt());
                if (user.getName().equals("borrado")) {
                    return null;
                } else {
                    return user;
                }//if-eslse
            } catch (IOException ex) {
                Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }//obtenerPersona

    // toma del archivo todos los registros y agregarlos a una lista
    public List<User> getTodasUsers() {
        List<User> users = new ArrayList<User>();
        for (int i = 0; i < cantidadRegistros; i++) {
            User temp = getUserPorPosicion(i);
            if (temp != null) {
                users.add(temp);
            }//if
        }//for
        return users;
    }//obtenerTodasLasPersonas

    //"borra" la user a la que le corresponde el codigo
    public boolean borrarRegistro(String codigo) throws IOException {
        User user;
        //Busqueda de Registro a eliminar
        for (int i = 0; i < cantidadRegistros; i++) {
            user = getUserPorPosicion(i);
            if (user != null && user.getPassword().equals(codigo)) {
                user.setName("borrado");
                return insertar(i, user);
            }
        }
        return false;
    }

    //modifica un  registro en el archivo
    public boolean modificarRegistro(String codigo, String nombre, int precio) throws IOException {
        User user;
        for (int i = 0; i < cantidadRegistros; i++) {
            user = this.getUserPorPosicion(i);
            if (user != null && user.getName() != "borrado") {
                if (user.getPassword().equals(codigo)) {
                    user.setName(nombre);
                    user.setCode(precio);
                    return insertar(i, user);
                }//fin del if
            }

        }//fin del for        
        return false;
    }//fin del metodo modificarRegistro

    //trae del archivo la user que corresponde al codigo
    public User getUserPorCodigo(String codigo) throws IOException {
        User user;
        for (int i = 0; i < cantidadRegistros; i++) {
            user = this.getUserPorPosicion(i);
            if ((user != null) && (!user.getName().equals("borrado"))) {
                if (user.getPassword().equals(codigo)) {
                    return user;
                }//fin del if
            }
        }//fin del for        
        return null;
    }//fin del metodo modificarRegistro

    //tomar del archivo todos los registros que coinciden
    //con nombre que se ingrese y los agregar a una lista, en el caso del codigo, 
    //solamente toma la user a la que le pertenece ese codigo
    public List<User> getUsersPorNombreYCodigo(String busqueda) {
        List<User> users = new ArrayList<User>();
        for (int i = 0; i < cantidadRegistros; i++) {
            User temp = getUserPorPosicion(i);
            if (temp != null && !temp.getName().equals("borrado")) {
                if (temp.getName().equalsIgnoreCase(busqueda) || temp.getPassword().equals(busqueda)) {
                    users.add(temp);
                }
            }//if
        }//for
        return users;
    }//obtenerTodasLasPersonas

    //valida si el codigo ingresado existe en el archivo
    public boolean existe(String code) throws IOException {
        for (int i = 0; i < cantidadRegistros; i++) {
            if (getUserPosicion(i).getPassword() != null && getUserPosicion(i).getPassword().equals(code)) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }

    //metodo interno utilizado en  el metodo existe(String code) que retorna una user
    private User getUserPosicion(int p) {

        if (p >= 0 && p <= cantidadRegistros) {
            try {
                this.randomAccessFile.seek(p * tamanoRegistro);
                User user = new User();
                user.setPassword(this.randomAccessFile.readUTF());
                user.setName(this.randomAccessFile.readUTF());
                user.setKindUser(this.randomAccessFile.readUTF());
                user.setCode(this.randomAccessFile.readInt());
                return user;
            } catch (IOException ex) {
                Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }//obtenerPersona

    //cierra el archivo
}//PersonaData
