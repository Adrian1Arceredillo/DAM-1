/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author blazquez.asier
 */
public class Elikagaia extends Produktua {

    private boolean ekologikoa;

    public Elikagaia(String kodea, String izena, double prezioa, boolean ekologikoa) {
        super(kodea, izena, prezioa);
        this.ekologikoa = ekologikoa;
    }

    @Override
    public boolean isArduratsua() {

        return ekologikoa;

    }

    @Override
    public String toString() {
        return "Elikagaia";
    }

}
