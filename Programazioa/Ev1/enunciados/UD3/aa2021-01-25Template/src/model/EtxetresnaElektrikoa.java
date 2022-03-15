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
public class EtxetresnaElektrikoa extends Produktua {

    private String EfizientziaEnergetikoa;

    public EtxetresnaElektrikoa(String kodea, String izena, double prezioa, String EfizientziaEnergetikoa) {
        super(kodea, izena, prezioa);
        this.EfizientziaEnergetikoa = EfizientziaEnergetikoa;
    }

    @Override
    public boolean isArduratsua() {

        if (EfizientziaEnergetikoa.equals("A++")) {
            return true;
        } else {
            return false;
        }

    }


    
    @Override
    public String toString() {
          

       
        return "Etxetresna";
    }

    
}
