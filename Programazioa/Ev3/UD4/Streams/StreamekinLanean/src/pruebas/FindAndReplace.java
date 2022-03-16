/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.*;

/**
 *
 * @author AdriAlex
 */
public class FindAndReplace {
    public static void main(String[] args) throws IOException {
        
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        
        Scanner in = new Scanner(System.in);
        
        try {
            inputStream = new BufferedReader(new FileReader("findReplaceOriginal.txt"));
            outputStream = new PrintWriter(new FileWriter("findReplaceCopia.txt"));
            
            
            System.out.print("Qué letra quieres cambiar? ");    //el usuario elige la letra VIEJA
            char charViejo = in.next().charAt(0);
            
            System.out.print("Cuál es la nueva letra? ");       //el usuario elige la letra NUEVA
            char charNuevo = in.next().charAt(0);
            
            String str1;
            while ((str1 = inputStream.readLine()) != null) {   //mientras que queden lineas por leer, cambiar charViejo por charNuevo
                str1 = str1.replace(charViejo, charNuevo);
                outputStream.println(str1);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
        
    }
}
