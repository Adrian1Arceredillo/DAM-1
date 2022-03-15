
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author imadariaga
 */
public class ProgramaNagusia {

    private static final int LIBURU_KOP = 10; //Gehienez egongo direnak
    private static Liburua[] liburuak = new Liburua[LIBURU_KOP];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        liburuak = Liburua.getLiburuSorta();

        int aukera = 0;
        do {
            System.out.println();
            System.out.println("LIBURUAK");
            System.out.println("====================================");
            System.out.println("1.- Liburu guztiak ikusi");
            System.out.println("2.- Liburu berria sortu");
            System.out.println("3.- Liburua ezabatu");
            System.out.println("4.- Hizkuntza jakin bateko liburuak zerrendatu");
            System.out.println("5.- Gai jakin bateko liburuak zerrendatu");
            System.out.println("6.- Liburu potoloena bilatu");
            System.out.println("7.- Liburu zaharrena bilatu");
            System.out.println("8.- Liburu garestiena ikusi");
            System.out.println("9.- Liburuen balioa (prezioen batura)");
            System.out.println("10.- Liburuen zerrenda prezioaren grafikoarekin");
            
            System.out.println("20.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = sc.nextInt();
            System.out.println("");
            switch (aukera) {
                case 1:
                    liburuakIkusi_C();
                    break;
                case 2:
                    liburuaSortu();
                    break;
                case 3:
                    ezabatu();
                    break;
                case 4:
                    hizkuntzaBatekoakZerrendatu();
                    break;
                case 5:
                    gaiBatekoakZerrendatu();
                    break;
                case 6:
                    potoloenaBilatu();
                    break;
                case 7:
                    //zaharrenaBilatu();
                    break;
                case 8:
                    garestienaBilatu();
                    break;
                case 9:
                    prezioenBatura();
                    break;
                case 10:
                    liburuenPrezioaIrudikatu();
                    break;
                case 20:
                    System.out.println("Eskerrik asko programa hau erabiltzearren.");
                    break;
                
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 20);
    }

    public static void liburuakIkusi() {
        System.out.printf("%-3s %-40s %-20s %4s %5s %-3s %-3s %7s %s\n", "Z.", "Izenburua", "Egilea","O.","U.","G.","H.","P.","Prezioa");
        System.out.println("==================================================================================================================");
        for (int i = 0; i < LIBURU_KOP; i++) {
            System.out.printf("%-3d", i + 1);
            if (liburuak[i] != null) {
                System.out.printf("%-40s %-20s %4d %5d %-3s %-3s %6.2f %s\n", liburuak[i].getIzenburua(), liburuak[i].getEgilea(), liburuak[i].getOrriKopurua(), liburuak[i].getUrtea(), liburuak[i].getGaia(), liburuak[i].getHizkuntza(),liburuak[i].getPrezioa(),liburuak[i].getPrezioaIzartxotan());
            }
            System.out.println("");
        }
    }

    
    public static void liburuakIkusi_A(){
        System.out.printf("%-3s %-40s %-20s %4s %-3s %6s %s\n", "Z.", "Izenburua", "Egilea","O.","G.","P.","Prezioa");
        System.out.println("==================================================================================================================");
        for (int i = 0; i < LIBURU_KOP && liburuak[i] != null; i++) {
            System.out.printf("%-3d %-40s %-20s %4d %-3s %6.2f %s\n", i+1, liburuak[i].getIzenburua(), liburuak[i].getEgilea(), liburuak[i].getOrriKopurua(), liburuak[i].getGaia(),liburuak[i].getPrezioa(),liburuak[i].getPrezioaIzartxotan());
        }
    }

    public static void liburuakIkusi_B(){
        System.out.printf("%-3s %-40s %-20s %4s %-3s %6s %s\n", "Z.", "Izenburua", "Egilea","U.","H.","P.","Prezioa");
        System.out.println("==================================================================================================================");
        for (int i = 0; i < LIBURU_KOP && liburuak[i] != null; i++) {
            System.out.printf("%-3d %-40s %-20s %4d %-3s %6.2f %s\n", i+1, liburuak[i].getIzenburua(), liburuak[i].getEgilea(), liburuak[i].getUrtea(), liburuak[i].getHizkuntza(),liburuak[i].getPrezioa(),liburuak[i].getPrezioaIzartxotan());
        }
    }
    
    public static void liburuakIkusi_C(){
        int batura = 0;
        int kopurua = 0;
        System.out.printf("%-3s %-40s %-20s %4s %-3s %6s\n", "Z.", "Izenburua", "Egilea","O.","G.","P.");
        System.out.println("==================================================================================================================");
        for (int i = 0; i < LIBURU_KOP && liburuak[i] != null; i++) {
            System.out.printf("%-3d %-40s %-20s %4d %-3s %6.2f\n", i+1, liburuak[i].getIzenburua(), liburuak[i].getEgilea(), liburuak[i].getOrriKopurua(), liburuak[i].getGaia(),liburuak[i].getPrezioa());
            batura = batura + liburuak[i].getOrriKopurua();
            kopurua++;
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("            Liburuen batez besteko orri kopurua: "+ batura/kopurua);
    }
    public static void liburuaSortu() {
        
        //Hobe litzake datuak eskatzen hasi aurretik lekurik dagoen egiaztatzea
        Scanner sc = new Scanner(System.in);;
        System.out.println("Liburu berriaren datuak sartu.");
        System.out.print("   Izenburua: ");
        String izenburua = sc.next();
        System.out.print("   Egilea: ");
        String egilea = sc.next();
        System.out.print("  Orri kopurua: ");
        int orriKopurua = sc.nextInt();
        System.out.print("  Urtea: ");
        int urtea = sc.nextInt();
        System.out.print("  Gaia (Fikzioa, Historikoa, Bestelakoa): ");//Erabiltzaileak sartzen duenaren lehen karakterea hartu
        char gaia = sc.next().charAt(0);
        System.out.print("  Hizkuntza (Euskara, Gaztelera, Ingelesa): ");//Erabiltzaileak sartzen duenaren lehen karakterea hartu
        char hizkuntza = sc.next().charAt(0);
        System.out.print("  Prezioa: ");
        double prezioa = sc.nextDouble();

        Liburua liburuBerria = new Liburua(izenburua, egilea, orriKopurua, urtea, gaia, hizkuntza, prezioa);

        boolean gehituta = false;
        for (int i = 0; i < liburuak.length && !gehituta; i++) {
            if (liburuak[i] == null) {
                liburuak[i] = liburuBerria;
                gehituta = true;
            }
        }
        if (gehituta) {
            System.out.println("Liburua gehitu da. Liburuen zerrenda atera egiaztatu nahi baduzu.");
        } else {
            System.out.println("Liburua ezin izan da gehitu leku faltagatik.");
        }

    }

    public static void ezabatu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zein posiziotako liburua nahi duzu ezabatu? ");
        int zenbakia = sc.nextInt();
        liburuak[zenbakia - 1] = null;

    }

    public static void hizkuntzaBatekoakZerrendatu() {
        char hizkuntza;
        //hizkuntza = (char) System.in.read();//hau da modurik errazena karaktere bat teklatutik irakurtzeko         
        Scanner sc = new Scanner(System.in);
        System.out.print("Aukeratu hizkuntza (E, G, I): ");
        hizkuntza = sc.next().charAt(0);

        for (int i = 0; i < liburuak.length; i++) {
            if (liburuak[i] != null) {
                if (liburuak[i].getHizkuntza() == hizkuntza) {
                    System.out.println(liburuak[i]);
                }
            }
        }
    }

    public static void gaiBatekoakZerrendatu() {
        char gaia;
        //hizkuntza = (char) System.in.read();//hau da modurik errazena karaktere bat teklatutik irakurtzeko         
        Scanner sc = new Scanner(System.in);
        System.out.print("Aukeratu gaia (F, H, B): ");
        gaia = sc.next().charAt(0);

        for (int i = 0; i < liburuak.length; i++) {
            if (liburuak[i] != null) {
                if (liburuak[i].getGaia() == gaia) {
                    System.out.println(liburuak[i]);
                }
            }
        }
    }

    public static void potoloenaBilatu() {
        int potoloenak = 0;//momenturarte aztertu ditugun liburu potoloenak dauzkan orriak
        for (int i = 0; i < liburuak.length; i++) {
            if (liburuak[i] != null) {
                if (liburuak[i].getOrriKopurua() > potoloenak) {
                    potoloenak = liburuak[i].getOrriKopurua();
                }
            }
        }
        System.out.println("Liburu potoloenak " + potoloenak + " orri dauzka.");
    }

    public static void garestienaBilatu() {
        double garestienak = 0.0;//momenturarte aztertu ditugun liburu garestienak daukan prezioa
        for (int i = 0; i < liburuak.length; i++) {
            if (liburuak[i] != null) {
                if (liburuak[i].getPrezioa() > garestienak) {
                    garestienak = liburuak[i].getPrezioa();
                }
            }
        }
        System.out.println("Liburu garestienak " + garestienak + " balio du.");
    }

    public static void prezioenBatura() {
        double batura = 0.0;
        for (int i = 0; i < liburuak.length; i++) {
            if (liburuak[i] != null) {
                batura += liburuak[i].getPrezioa();
            }
        }
        System.out.println("Liburu guztien artean " + batura + " euro dauzkagu.");
    }

    public static void liburuenPrezioaIrudikatu(){
        for (int i=0; i<LIBURU_KOP && liburuak[i]!=null; i++){
            System.out.printf("%30s: %s\n",liburuak[i].getIzenburua(),liburuak[i].getPrezioaIzartxotan());
        }
    }
}
