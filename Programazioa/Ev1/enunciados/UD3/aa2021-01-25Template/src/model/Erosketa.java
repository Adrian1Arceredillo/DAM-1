/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author imadariaga
 */
public class Erosketa {

    protected char[] kodea;
    protected LocalDate data;
    protected Bezeroa eroslea;
    protected ArrayList<Produktua> produktuak;
    protected ArrayList<Integer> unitateak;  //produktuaren ArrayListarekin batera kudeatu. Edo bestela beste klase bat sortu beharko genuke: "Lerroa" (unitate+produktu)
    protected double guztira;

    public Erosketa(String kodea, Bezeroa eroslea, double guztira) {
        this.setKodea(kodea);
        this.data = LocalDate.now();
        this.eroslea = eroslea;
//        this.produktuak = produktuak;
//        this.unitateak = unitateak;
        this.guztira = guztira;
    }

    public Erosketa(String kodea, String data, Bezeroa eroslea, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira) {
        this.setKodea(kodea);
        this.data = LocalDate.parse(data);
        this.eroslea = eroslea;
        this.produktuak = produktuak;
        this.unitateak = unitateak;
        this.guztira = guztira;
    }

    public String getStrKodea() {
        String strKodea = "";
        for (char c : kodea) {
            strKodea = strKodea + c;
        }
        return strKodea;
    }

    public LocalDate getData() {
        return data;
    }

    public Bezeroa getEroslea() {
        return eroslea;
    }

    public ArrayList<Produktua> getProduktuak() {
        return produktuak;
    }

    public ArrayList<Integer> getUnitateak() {
        return unitateak;
    }

    public double getGuztira() {
        return guztira;
    }

    public void setKodea(String kodea) {
        this.kodea = kodea.toCharArray();
    }

    public String toString() {
        return "Erosketa{" + "kodea=" + getStrKodea() + " data=" + data + " eroslea=" + eroslea + " guztira=" + guztira + "}";
    }

    public String toStringLuzea() {
        String strErosketa = "\nEROSKETA: " + getStrKodea() + " Data: " + data + "\n"
                + "----------------------------------------------------------\n"
                + "    Bezeroa: " + eroslea.getKodea() + "\n"
                + "    Izena: " + eroslea.getIzena() + "\n"
                + "    Helbidea: " + eroslea.getHelbidea() + "\n";
        strErosketa = strErosketa + String.format("    %-6s %-25s %-10s %9s\n", "Kodea", "Produktua", "Unitateak", "Prezioa");
        strErosketa = strErosketa + String.format("    %-6s %-25s %-10s %9s\n", "-----", "---------", "---------", "-------");
        for (int i = 0; i < produktuak.size(); i++) {
            strErosketa = strErosketa + String.format("    %-6s %-25s %7d %10.2f\n", produktuak.get(i).getStrKodea(),
                    produktuak.get(i).getIzena(), unitateak.get(i), produktuak.get(i).getPrezioa());
        }
        strErosketa = strErosketa + String.format("           %-25s %10.2f", "GUZTIRA:", guztira);
        return strErosketa;
    }

    /**
     * Metodo honek zera egiaztatzen du: "guztira" atributuak daukan balioa bat
     * datorren erositako produktuen zerrendarekin.
     *
     * @return
     */
    public boolean guztiraEgiaztatu() {
        boolean emaitza = false; //
        double batuketa = 0.0;

        for (int i = 0; i < produktuak.size(); i++) {
            batuketa = batuketa + unitateak.get(i) * produktuak.get(i).getPrezioa();
        }
        if (batuketa == guztira) {
            emaitza = true;
        }
        return emaitza;
    }
}
