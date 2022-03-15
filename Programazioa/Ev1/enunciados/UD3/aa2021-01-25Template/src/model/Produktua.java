/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author blazquez.asier
 */
public abstract class Produktua {

    protected char[] kodea;
    protected String izena;
    protected double prezioa;

    public Produktua(String kodea, String izena, double prezioa) {
        this.kodea = kodea.toCharArray();
        this.izena = izena;
        this.prezioa = prezioa;
    }

    public String getStrKodea() {

        String s = "";
        for (int i = 0; i < kodea.length; i++) {

            s = s + kodea[i];

        }
        return s;
    }

    public String getIzena() {
        return izena;
    }

    public double getPrezioa() {
        return prezioa;
    }

    public abstract boolean isArduratsua();

    public static Produktua getProduktua(ArrayList<Produktua> produktuenLista, String kodea) {

        boolean encontrado = true;
        int i = 0;
        while (i < produktuenLista.size()) {

            if (kodea.equals(produktuenLista.get(i).getStrKodea())) {

                return produktuenLista.get(i);

            }

            i++;

        }

        return null;

    }

    public String baiez(Produktua p) {
        String s = "";

        if (p.isArduratsua()) {
            s = "BAI";
        } else {
            s = "EZ";
        }
        return s;
    }

    public String toStringLuzea(Produktua p) {
        String s=String.format("%-11s | %-5s | %-20s | %10.2f | %10s |%10s\n",p.toString(), p.getStrKodea(), p.getIzena(), p.getPrezioa(), p.baiez(p), "EROSITAKOAK");;
        return s;
    }
}
