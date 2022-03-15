
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AdriAlex
 */
public class Libros {

    private String titulo;
    private String escritor;
    private int numHojas;
    private int fecha;
    private char tema; //F: Fikzioa, H: Historikoa, B: Bestelakoa  
    private char idioma; //E: Euskara, G: Gaztelera, I: Ingelesa
    private double precio;

    public Libros(String titulo, String escritor, int numHojas, int fecha, char tema, char idioma, double precio) {

        this.titulo = titulo;
        this.escritor = escritor;
        this.numHojas = numHojas;
        this.fecha = fecha;
        this.tema = tema;
        this.idioma = idioma;
        this.precio = precio;

    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }
    
    public int getNumHojas() {
        return numHojas;
    }
    
    public boolean getNumHojas(int hojasNuevas) {
        boolean respuesta = false;
        if (hojasNuevas > 0) {
            numHojas = hojasNuevas;
            respuesta = true;
        }
        return respuesta;
        
    }
    
    public int getFecha() {
        return fecha;
    }

    public boolean setFecha(int fecha) {
        boolean respuesta = false;
        if (fecha >= LocalDate.now().getYear()) {//Hau ez dot eskatuko azterketan
            this.fecha = fecha;
            respuesta = true;
        }
        return respuesta;
    }
    
    public char getTema() {
        return tema;
    }
    
    public void setTema(char nuevoTema) {
        if (nuevoTema == 'F' || nuevoTema == 'H' || nuevoTema == 'B') {
            tema = nuevoTema;
        } else {
            tema = '-';
        }
    }
    
    public char getIdioma() {
        return idioma;
    }
    
    public void setIdioma(char nuevoIdioma) {
        if (nuevoIdioma == 'E' || nuevoIdioma == 'G' || nuevoIdioma == 'I') {
            idioma = nuevoIdioma;
        } else {
            idioma = '-';
        }
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double nuevoPrecio) {
        precio = nuevoPrecio;
    }
    
    public static Libros[] getSerieLibros(){
        Libros[] libros = new Libros[10];
        libros[0]= new Libros("El problema de los tres cuerpos","Cixin Liu",408,2016,'F','G',12.95);
        libros[1]= new Libros("The Hobbit","J.R.R. Tolkien",413,1937,'F','I',20.95);
        libros[2]= new Libros("The Lord of the Rings","J.R.R. Tolkien",122,1954,'F','I',15.95);
        libros[3]= new Libros("Matxinsaltoen belarriak","Unai Elorriaga",122,2006,'B','E',10.95);
        libros[4]= new Libros("Las brujas","Roald Dahl",222,1983,'F','G',10.95);
        libros[5]= new Libros("Boy","Roald Dahl",122,1984,'H','I',5.95);
            
        return libros;
    }
    
    public String toString() {
        return titulo + "(" + escritor + ")";
    }
    
    public String getPrecioEstrellas(){
        String estrellas = "";
        double p = this.precio;
        while (p >= 1){
            estrellas = estrellas + "*";
            p--;
        }
        return estrellas;
    }
}
