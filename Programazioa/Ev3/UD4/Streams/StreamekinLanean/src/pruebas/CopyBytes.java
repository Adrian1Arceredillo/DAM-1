package pruebas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author arceredillo.adrian
 */

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("FotoOriginal.jpg");   //archivo original / ya existente
            out = new FileOutputStream("FotoCopia.jpg");    //arhivio nuevo /copia
            int c;
            int kont = 0;
            
            while ((c = in.read()) != -1) {     //condición: si no ha llegado al final del fichero, seguir pasando info
                out.write(c);
            }
            
            /*
            while (((c = in.read()) != -1) && (kont < 10000)) {     //condición: si no ha llegado al final del fichero, y kont es menor que 10000 (cada "kont" = bit), seguir pasando info
                out.write(c);
                ++kont;
            }
            */
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
