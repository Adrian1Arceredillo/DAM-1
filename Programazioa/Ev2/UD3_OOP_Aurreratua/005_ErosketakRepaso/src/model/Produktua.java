/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author AdriAlex
 */
public class Produktua {
    
    private char[] kodea;
    private String izena;
    private double prezioa;
    
    
    public Produktua(String kodea, String izena, double prezioa) {
        this.kodea = new char[kodea.length()];
        for (int i = 0; i < kodea.length(); ++i) {
            this.kodea[i] = kodea.charAt(i);
        }
        
        this.izena = izena;
        this.prezioa = prezioa;
    }

    public char[] getKodea() {
        return kodea;
    }

    public void setKodea(char[] kodea) {
        this.kodea = kodea;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public double getPrezioa() {
        return prezioa;
    }

    public void setPrezioa(double prezioa) {
        this.prezioa = prezioa;
    }
    
    
    
}
