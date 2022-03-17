/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otrosConceptos;

import java.util.Arrays;

/**
 *
 * @author arceredillo.adrian
 */
public class MetodoSplit {
    public static void main(String[] args) {
        
        String str1 = "boo:and:foo";
        System.out.println("String inicial: " + str1 + "\n");
        
        //el método split nos permite establecer un delimitador; el cual separá el string que nosotros decidamos
        String[] osagaiak1 = str1.split(":");    //delimitador = ":"
        String[] osagaiak2 = str1.split("o");    //delimitador = "0"
        
        System.out.println("Delimitador = ':' -> " + Arrays.toString(osagaiak1));
        System.out.println("--------------------------------");
        System.out.println("Delimitador = 'o' -> " + Arrays.toString(osagaiak2));
        
    }
}
