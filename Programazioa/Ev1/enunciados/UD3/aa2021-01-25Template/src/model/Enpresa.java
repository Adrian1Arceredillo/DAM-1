/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Bezeroa;
import java.util.Arrays;

/**
 *
 * @author imadariaga
 */
public class Enpresa implements Bezeroa {

    private int kodea;
    private String izenJuridikoa;
    private String izenKomertziala;
    private String helbidea;
    private String[] kontaktoenEmailak;

    public Enpresa(int kodea, String izenJuridikoa, String izenKomertziala, String helbidea, String[] kontaktoenEmailak) {
        this.kodea = kodea;
        this.izenJuridikoa = izenJuridikoa;
        this.izenKomertziala = izenKomertziala;
        this.helbidea = helbidea;
        this.kontaktoenEmailak = kontaktoenEmailak;
    }


    /**
     * Kopiak sortzeko erabiliko dan konstruktorea
     *
     *
     */
    public Enpresa(Enpresa besteEnpresa) {
        this.kodea = besteEnpresa.kodea;
        this.izenJuridikoa = besteEnpresa.izenJuridikoa;
        this.izenKomertziala = besteEnpresa.izenKomertziala;
        this.helbidea = besteEnpresa.helbidea;
        this.kontaktoenEmailak = besteEnpresa.kontaktoenEmailak.clone();
    }

    @Override
    public int getKodea() {
        return kodea;
    }

    @Override
    public String getIzena() {
        return izenKomertziala;
    }

    public void setIzenJuridikoa(String izenJuridikoa) {
        this.izenJuridikoa = izenJuridikoa;
    }

    public void setIzenKomertziala(String izenKomertziala) {
        this.izenKomertziala = izenKomertziala;
    }


    @Override
    public String getHelbidea() {
        return helbidea;
    }

    public void setHelbidea(String helbidea) {
        this.helbidea = helbidea;
    }

    @Override
    public String getEmaila() {
       return kontaktoenEmailak[0];
    }

    @Override
    public String toString() {
        return "Enpresa{" + "kodea=" + kodea + ", izena="+izenKomertziala+" emailak="+Arrays.toString(kontaktoenEmailak);
    }

}
