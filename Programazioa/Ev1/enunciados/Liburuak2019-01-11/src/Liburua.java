
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author imadariaga
 */
public class Liburua {

    private String izenburua;
    private String egilea;
    private int orriKopurua;
    private int urtea;
    private char gaia; //F: Fikzioa, H: Historikoa, B: Bestelakoa  
    private char hizkuntza; //E: Euskara, G: Gaztelera, I: Ingelesa
    private double prezioa;

    public Liburua(String izenburua, String egilea, int orriKopurua, int urtea, char gaia, char hizkuntza, double prezioa) {
        this.izenburua = izenburua;
        this.egilea = egilea;
        this.orriKopurua = orriKopurua;
        this.urtea = urtea;
        this.setGaia(gaia);
        this.setHizkuntza(hizkuntza);
        this.prezioa = prezioa;
    }

    public String getIzenburua() {
        return izenburua;
    }

    public void setIzenburua(String izenburua) {
        this.izenburua = izenburua;
    }

    public String getEgilea() {
        return egilea;
    }

    public void setEgilea(String egilea) {
        this.egilea = egilea;
    }

    public int getOrriKopurua() {
        return orriKopurua;
    }

    public boolean setOrriKopurua(int orriKopurua) {
        boolean emaitza = false;
        if (orriKopurua > 0) {
            this.orriKopurua = orriKopurua;
            emaitza = true;
        }
        return emaitza;
    }

    public int getUrtea() {
        return urtea;
    }

    public boolean setUrtea(int urtea) {
        boolean emaitza = false;
        if (urtea >= LocalDate.now().getYear()) {//Hau ez dot eskatuko azterketan
            this.urtea = urtea;
            emaitza = true;
        }
        return emaitza;
    }

    public char getGaia() {
        return gaia;
    }

    public void setGaia(char gaia) {
        if (gaia == 'F' || gaia == 'H' || gaia == 'B') {
            this.gaia = gaia;
        } else {
            this.gaia = '-';
        }
        
    }

    public char getHizkuntza() {
        return hizkuntza;
    }

    public void setHizkuntza(char hizkuntza) {
        if (hizkuntza == 'E' || hizkuntza == 'G' || hizkuntza == 'I') {
            this.hizkuntza = hizkuntza;
        } else { 
            this.hizkuntza = '-';
        }
    }

    public double getPrezioa() {
        return prezioa;
    }

    public void setPrezioa(double prezioa) {
        this.prezioa = prezioa;
    }
    
    public static Liburua[] getLiburuSorta(){
        Liburua[] liburuak= new Liburua[10];
        liburuak[0]= new Liburua("El problema de los tres cuerpos","Cixin Liu",408,2016,'F','G',12.95);
        liburuak[1]= new Liburua("The Hobbit","J.R.R. Tolkien",413,1937,'F','I',20.95);
        liburuak[2]= new Liburua("The Lord of the Rings","J.R.R. Tolkien",122,1954,'F','I',15.95);
        liburuak[3]= new Liburua("Matxinsaltoen belarriak","Unai Elorriaga",122,2006,'B','E',10.95);
        liburuak[4]= new Liburua("Las brujas","Roald Dahl",222,1983,'F','G',10.95);
        liburuak[5]= new Liburua("Boy","Roald Dahl",122,1984,'H','I',5.95);
            
        return liburuak;
    }

    public String toString(){
        return izenburua + " (" + egilea + ")";
    }
    
    public String getPrezioaIzartxotan(){
        String izarrak="";
        double p = this.prezioa;
        while (p >= 1){
            izarrak = izarrak + "*";
            p--;
        }
        return izarrak;
    }
}
