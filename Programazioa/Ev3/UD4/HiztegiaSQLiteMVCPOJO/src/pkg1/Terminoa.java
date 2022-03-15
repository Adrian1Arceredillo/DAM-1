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
    
    private final String DB = "db/Hiztegia.db";
    
    private int id;
    private String euskara;
    private String gaztelera;

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

    @Override
    public String toString() {

        String s = "\nid: " + id + "  \nEuskera : " + euskara + "  \nGaztelera : " + gaztelera + 
                "\n-----------------------------------------------------------------------\n";
        return s;
    }
}
