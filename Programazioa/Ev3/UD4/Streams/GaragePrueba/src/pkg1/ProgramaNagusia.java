/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author arceredillo.adrian
 */
public class ProgramaNagusia {
    public static void main(String[] args) {
        
        /**
         * El contenido inicial estará en el fichero "HiztegiaCsvInicial.txt". 
         * Cuando se pulse un botón del View, se leerán los datos de dicho 
         * fichero, y se guardarán en un nuevo archivo llamado "HiztegiaCsvFinal.txt".
         * 
         * A la hora de hacer la lectura y guardar los datos, utilizaremos el método 
         * "split"; el cual permite establecer delimitadores. Mediante este método, 
         * podremos elegir qué forma tendrá el archivo final.
         * 
         */
        
        View view = View.viewaSortuBistaratu();

        Model model = new Model();

        Controller controller = new Controller(model, view);
        
    }
}
