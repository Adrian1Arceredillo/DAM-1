/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;

/**
 *
 * @author arceredillo.adrian
 */
public class Kutxa extends Laukizuzena implements Marrazgarria {
    
    private int altuera;
    
    
    public Kutxa(Puntua erpina, Puntua kontrakoErpina, int altuera) {
        super(erpina, kontrakoErpina);
        this.altuera = altuera;
    }
    
    public int getAltuera() {
        return altuera;
    }
    
    public boolean isHandiagoa(Kutxa besteKutxaBat) {
        
        //calcular volumen del primer Kutxa ("this")
        int aT = this.getKontrakoErpina().getX() - super.getErpinBat().getX();
        int bT = super.getKontrakoErpina().getY() - super.getErpinBat().getY();
        int cT = this.getAltuera();
        
        int volumenThis = aT * bT * cT;
        
        //calcular volumen del OTRO Kutxa (besteKutxaBat)
        int aO = besteKutxaBat.getKontrakoErpina().getX() - besteKutxaBat.getErpinBat().getX();
        int bO = besteKutxaBat.getKontrakoErpina().getY() - besteKutxaBat.getErpinBat().getY();
        int cO = besteKutxaBat.getAltuera();
        
        int volumenBesteKutxa = aO * bO * cO;
        
        //comparar ambos volúmenes
        if (volumenThis > volumenBesteKutxa) {
            return true;
        }
        
        return false;
    }
    
    
    @Override
    public void marraztu() {
        System.out.println("Oinarria: " + Arrays.toString(this.getLauErpinenArraya()) + 
                " eta altuera: " + this.getAltuera() + 
                " dituen kutxa GUI baten marraztua izan da. ");
    }
    
}
