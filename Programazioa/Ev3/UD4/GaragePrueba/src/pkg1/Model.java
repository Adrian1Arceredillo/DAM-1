/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arceredillo.adrian
 */
public class Model {
    
    public String terminoakImprimatu() {   //leer fichero y escribirlo en el textArea del view
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        String terminosRecibidos = "";
        Terminoa t1;
        
        try {
            inputStream = new BufferedReader(new FileReader("../HiztegiaTextFileMVCPOJO/HiztegiaCsvInicial.txt"));
            //outputStream = new PrintWriter(new FileWriter("../HiztegiaTextFileMVCPOJO/HiztegiaCsvFinal.txt"));

            String str1;
            while ((str1 = inputStream.readLine()) != null) {
                String[] osagaiak = str1.split(",");    //array que guarda el contenido organizado con el método "split"
                t1 = new Terminoa(Integer.valueOf(osagaiak[0]), osagaiak[1], osagaiak[2]);
                if (terminosRecibidos.equals("")) {
                    terminosRecibidos = t1.toString();
                } else {
                    terminosRecibidos = terminosRecibidos + "\n" + t1.toString();
                }
                //outputStream.println(Arrays.toString(osagaiak));
            }
        } catch (IOException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();                    
                } catch (IOException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return terminosRecibidos;
    }
    
    /**
     * Este método se encargará de guardar en un archivo nuevo que este genera, los 
     * datos recogidos del textArea del View. El método recibirá estos datos en forma 
     * de parámetro de entrada de tipo String. 
     * 
     * @param infoTextArea 
     */
    public void textAreaToFile(String infoTextArea){
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        
        try {
            outputStream = new PrintWriter(new FileWriter("../HiztegiaTextFileMVCPOJO/HiztegiaCsvFinal.txt"));
            outputStream.print(infoTextArea);
        } catch (IOException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }    
}
