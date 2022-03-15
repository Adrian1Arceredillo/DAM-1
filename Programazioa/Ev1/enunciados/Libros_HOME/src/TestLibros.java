/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AdriAlex
 */
public class TestLibros {

    private static final int NUM_LIBROS = 7; //los que habrá como máximo
    private static int sortutakoak = 6;
    private static Libros[] libros = new Libros[NUM_LIBROS];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        libros = Libros.getSerieLibros();
        int eleccion;

        do {
            System.out.println();
            System.out.println("LIBURUAK");
            System.out.println("====================================");
            System.out.println("1.- Ver todos los libros");
            System.out.println("2.- Crear nuevo libro");
            System.out.println("3.- Borrar libro");
            System.out.println("4.- Listar los libros de un determinado idioma");
            System.out.println("5.- Listar los libros de un determinado tema");
            System.out.println("6.- Buscar el libro más gordo");
            System.out.println("7.- Buscar el libro más viejo");
            System.out.println("8.- Ver el libro más caro");
            System.out.println("9.- Valor de los libros (suma de los precios)");
            System.out.println("10.- Liburuen zerrenda prezioaren grafikoarekin");

            System.out.println("20.- Salir");
            System.out.println("");
            System.out.print("Elige un número: ");
            eleccion = in.nextInt();
            System.out.println("");

            switch (eleccion) {

                case 1:
                    verTodosLosLibros();
                    break;
                case 2:
                    crearLibro();
                    break;
                case 3:
                    borrarLibro();
                    break;
                case 4:
                    verLibrosIdioma();
                    break;
                case 5:
                    verLibrosTema();
                    break;
                case 6:
                    libroMasHojas();
                    break;
                case 7:
                    libroMasViejo();
                    break;                    
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }

        } while (eleccion != 20);

    }

    public static void verTodosLosLibros() {
        int cantidad = 0;
        int orrienBatura = 0;
        System.out.printf("%-3s %-40s %-20s %4s %-3s %6s\n", "N.", "Titulo", "Escritor", "H.", "T.", "P.");
        System.out.println("==================================================================================================================");
        for (int i = 0; (i < libros.length); ++i) {
            if (libros[i] != null) {
                
                System.out.printf("%-3d %-40s %-20s %4d %-3s %6.2f\n",  i + 1,
                                                                        libros[i].getTitulo(), 
                                                                        libros[i].getEscritor(), 
                                                                        libros[i].getNumHojas(), 
                                                                        libros[i].getTema(), 
                                                                        libros[i].getPrecio());
                orrienBatura = orrienBatura + libros[i].getNumHojas();
                ++cantidad;
            }
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("            Liburuen batez besteko orri kopurua: " + orrienBatura / cantidad);
    }

    public static void crearLibro() {
        Scanner in = new Scanner(System.in);

        System.out.println("Mete los datos del libro: ");
        System.out.print("  Titulo: ");
        String titulo = in.nextLine();
        System.out.print("  Escritor: ");
        String escritor = in.nextLine();
        System.out.print("  Número de hojas: ");
        int numHojas = in.nextInt();
        System.out.print("  Año de creación: ");
        int fecha = in.nextInt();
        System.out.print("  Tema: ");
        char tema = in.next().charAt(0);
        System.out.print("  Idioma: ");
        char idioma = in.next().charAt(0);
        System.out.print("  Precio: ");
        double precio = in.nextDouble();

        Libros nuevoLibro = new Libros(titulo, escritor, numHojas, fecha, tema, idioma, precio);

        /*boolean sumado = false;
        for (int i = 0; i < liburuak.length && !sumado; i++) {
            if (liburuak[i] == null) {
                liburuak[i] = liburuBerria;
                sumado = true;
            }
        }*/
        if (sortutakoak <= NUM_LIBROS - 1 && libros[sortutakoak] == null) {
            libros[sortutakoak] = nuevoLibro;
            System.out.println("El libro se ha añadido. Imprime la lista para verlo. ");
            ++sortutakoak;
        } else if (sortutakoak == NUM_LIBROS) {
            System.out.println("---> No se pueden crear más libros. ");
        }
    }

    public static void borrarLibro() {

        Scanner in = new Scanner(System.in);
        System.out.print("El libro de qué posición quieres eliminar? ");
        int numero = in.nextInt();

        libros[numero - 1] = null;
        //--sortutakoak;

    }

    public static void verLibrosIdioma() {

        char idiomaEntrada;
        Scanner in = new Scanner(System.in);
        System.out.print("Elige un idioma (E, G, I): ");
        idiomaEntrada = in.next().toUpperCase().charAt(0);

        if ((idiomaEntrada == 'E' || idiomaEntrada == 'G' || idiomaEntrada == 'I')) {
            for (int i = 0; i < libros.length; ++i) {
                if (libros[i] != null) {
                    if (libros[i].getIdioma() == idiomaEntrada) {
                        System.out.println(libros[i]);
                    }
                }
            }
        } else {
            System.out.println("Idioma desconocido. ");
        }
    }

    public static void verLibrosTema() {

        char temaEntrada;
        Scanner in = new Scanner(System.in);
        System.out.print("Elige un tema (F, H, B): ");
        temaEntrada = in.next().toUpperCase().charAt(0);

        if ((temaEntrada == 'F' || temaEntrada == 'H' || temaEntrada == 'B')) {
            for (int i = 0; i < libros.length; ++i) {
                if (libros[i] != null) {
                    if (libros[i].getTema() == temaEntrada) {
                        System.out.println(libros[i]);
                    }
                }
            }
        } else {
            System.out.println("Tema desconocido. ");
        }
    }

    public static void libroMasHojas() {
        int masGordo = 0;
        for (int i = 0; i < libros.length; ++i) {
            if (libros[i] != null) {
                if (libros[i].getNumHojas() > masGordo) {
                    masGordo = libros[i].getNumHojas();
                }
            }
        }
        System.out.println("El libro más gordo tiene " + masGordo + " hojas. ");
    }
    
    public static void libroMasViejo() {
        
        int masViejo = 0;
        int posLibroMasViejo = -1;
        
        for (int i = 0; i < libros.length; ++i) {
            if (libros[i] != null) {
                if (i == 0) {
                    masViejo = libros[i].getFecha();
                }
                if (libros[i].getFecha() < masViejo) {
                    masViejo = libros[i].getFecha();
                    posLibroMasViejo = i;
                }
            }
        }
        if (posLibroMasViejo == -1) {
            System.out.println("El array está vacío. ");
        } else {
            System.out.println("Libururik zaharrena, " + libros[posLibroMasViejo].getTitulo() + " da. Liburu hau, " + libros[posLibroMasViejo].getFecha() + "garren urtekoa da. ");
        }
    }

}
