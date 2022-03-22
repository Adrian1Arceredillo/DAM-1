/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.util.Objects;


/**
 *
 * @author arceredillo.adrian
 */
public class Terminoa {
    
    private final String DB = "db/GaragePrueba.db";
    
    private int id;
    private String euskara;
    private String gaztelera;
    private static String separador = "////////////////////////////////////////////////////////////";
    //private String separador = "-------------------------------------------------------------";

    public Terminoa(String euskara, String gaztelera) {
        this.id = 0;
        this.euskara = euskara;
        this.gaztelera = gaztelera;

    }
    
    public Terminoa(int id, String euskara, String gaztelera) {
        this.id = id;
        this.euskara = euskara;
        this.gaztelera = gaztelera;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getEuskara() {
        return euskara;
    }

    public void setEuskara(String euskara) {
        this.euskara = euskara;
    }

    public String getGaztelera() {
        return gaztelera;
    }

    public void setGaztelera(String gaztelera) {
        this.gaztelera = gaztelera;
    }
    
    /**
     * Método que se utilizará para separa los registros/datos cuando haya que 
     * imprimirlos/visualizarlos.
     * 
     * Por ejemplo: una fila de guiones. 
     * 
     * @return 
     */
    public static String sepGuionesInicial() {
        String separador = "-------------------------------------------------------------";
        return separador;
    }
    
    public static String getSeparador() {
        return separador;
    }
    
    public static void setSeparador(String nuevoSeparador) {
        Terminoa.separador = nuevoSeparador;
    }
    
    
    @Override
    public String toString() {
        //String guiones = "-------------------------------------------------------------";
        //String guiones = "/";
        
        //String s = "id: " + id + ", Euskera: " + euskara + ",Gaztelera: " + gaztelera + "\n" + guiones;
        String s = "id: " + id + ", Euskera: " + euskara + ",Gaztelera: " + gaztelera + "\n" + sepGuionesInicial();
        
        return s;
    }
}
