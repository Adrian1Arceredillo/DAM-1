/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Komikia extends Book{
    
    private Boolean kolorea;



    public Komikia(Boolean kolorea, String name, Author author, double price, int pages) {
        super(name, author, price, pages);
        this.kolorea = kolorea;
    }
    
    public boolean isKolorea(){
       
    return kolorea;
    }

    @Override
    public String getNolakoa() {
        String nolakoa="";
       
        if(isKolorea()){
        
        nolakoa= "koloretakoa";
        } else{
            nolakoa="zuribeltza";
        }
        return nolakoa;
    }

    @Override
    public String toString() {
        return "Komikia{" + "kolorea=" + kolorea + '}'+super.getName() + ", " + super.getAuthor().getName() + ", " + super.getPrice() + ", " + super.getPages();
    }
    
    
    
}
