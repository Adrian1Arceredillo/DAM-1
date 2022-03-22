/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

import java.util.Objects;


/**
 *
 * @author arceredillo.adrian
 */
public class Terminoa {
    
    private final String DB = "db/GaragePrueba.db";
    
    /*private int id;
    private String euskara;
    private String gaztelera;*/
    
    private int idClientes;  //creado por mí
    private String nombre;
    private String apellido;
    private int edad;
    private String mail;
    private int telefono;
    
    public Terminoa(String nombre, String apellido, int edad, /*String mail,*/ int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.mail = this.getApellido().toLowerCase() + "." + this.getNombre().toLowerCase() + "@garage.diy";
        this.telefono = telefono;
    }
    
    /*public Terminoa(String euskara, String gaztelera) {
        this.id = 0;
        this.euskara = euskara;
        this.gaztelera = gaztelera;

    }*/
    
    /*public Terminoa(int id, String euskara, String gaztelera) {
        this.id = id;
        this.euskara = euskara;
        this.gaztelera = gaztelera;

    }*/
    
    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    

    @Override
    public String toString() {

        String s = "\nNombre : " + nombre + "  \nGaztelera : " + apellido + 
                "  \nEdad : " + edad +  "\nMail : " + mail + 
                "  \nTelefono : " + telefono + "\n-----------------------------------------------------------------------\n";
        return s;
    }
}

