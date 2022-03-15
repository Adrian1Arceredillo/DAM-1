/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayList;

import java.util.Arrays;

/**
 *
 * @author arceredillo.adrian
 */
public class ContarRepetidosEjemplo{
    static int A=3;
    static int B=30;
    static int vectorA[]=new int[A];
    static int vectorB[]=new int[B];
    static int elemA=0;
    static int elemB=0;
    static int z=0;
 
    /**
     * Funcion para llenar los arrays con valores aleatorios
     */
    static void llenaArreglo(){
        // Llenamos un array con valores aleatorios
        for(int i=0;i<vectorA.length;i++){
            vectorA[i]=(int)(Math.random()*10+1);
        }
        System.out.println(Arrays.toString(vectorA));
 
        // Llenamos un segundo array con valores aleatorios
        for(int i=0;i<vectorB.length;i++){
            vectorB[i]=(int)(Math.random()*10+1);
        }
        System.out.println(Arrays.toString(vectorB));
        System.out.println("");
    }
 
    /**
     * Funcion para comparar dos arrays
     */
    static void compara(){
        // recorremos los valores del array A
        for(int i=0;i<vectorA.length;i++){
            // recorremos los valores del array B
            for(int j=0;j<vectorB.length;j++){
                // Cada valor del array A lo comparemos con todos los valores
                // del array B
                if(vectorA[i]==vectorB[j])
                    elemA++;
            }
            System.out.println("El elemento "+vectorA[i]+" se presenta "+elemA+" veces en B");
            
            elemA=0;
        }
    }
 
    /**
     * Funcion para imprimir el contenido de los dos arrays
     */
    static void imprimir(){
        for(int i=0;i<vectorA.length;i++){
            System.out.print("A"+"["+i+"]= "+vectorA[i]+"\n");
        }
        for(int i=0;i<vectorB.length;i++){
            System.out.print("B"+"["+i+"]="+vectorB[i]+"\n");
        }
    }
 
    public static void main(String[] args){
        
        
        System.out.println("");
        
        llenaArreglo();
        imprimir();
        compara();
    }
}
