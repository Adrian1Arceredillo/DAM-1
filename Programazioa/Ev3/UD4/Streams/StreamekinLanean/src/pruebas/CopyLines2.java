/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author AdriAlex
 */
public class CopyLines2 {
    public static void main(String[] args) throws IOException {
        
        File archivo1 = new File("../StreamekinLanean/linesOriginal.txt");
        Scanner scan = new Scanner(archivo1);
        
        String fileContent = "";
        while(scan.hasNextLine()) {
            fileContent = fileContent.concat(scan.nextLine() + "\n");
            
        }
        
        FileWriter writer = new FileWriter("../StreamekinLanean/linesCopia.txt");
        writer.write(fileContent);
        writer.close();
        
    }
}
