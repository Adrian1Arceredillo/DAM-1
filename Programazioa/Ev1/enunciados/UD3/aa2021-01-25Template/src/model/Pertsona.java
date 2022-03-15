/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Bezeroa;

/**
 *
 * @author imadariaga
 */
public class Pertsona implements Bezeroa {

    private int kodea;
    private String izena;
    private String abizena;
    private String helbidea;
    private String emaila;

    public Pertsona(int kodea, String izena, String abizena, String helbidea, String emaila) {
        this.kodea = kodea;
        this.izena = izena;
        this.abizena = abizena;
        this.helbidea = helbidea;
        this.emaila = emaila;
    }

    /**
     * Kopiak sortzeko erabilido dan konstruktorea
     *
     *
     */
    public Pertsona(Pertsona pertsonaZaharra) {
        this.kodea = pertsonaZaharra.kodea;
        this.izena = pertsonaZaharra.izena;
        this.abizena = pertsonaZaharra.abizena;
        this.helbidea = pertsonaZaharra.helbidea;
    }

    @Override
    public int getKodea() {
        return kodea;
    }

    @Override
    public String getIzena() {
        return izena + " " + abizena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public void setAbizena(String abizena) {
        this.abizena = abizena;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Pertsona{" + "kodea=" + kodea + ", izena=" + izena + ", abizena=" + abizena + ", helbidea=" + helbidea +", emaila=" + emaila + '}';
    }

}
