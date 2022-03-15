/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.ArrayList;
import java.util.Scanner;
import model.Bezeroa;
import model.Elikagaia;
import model.Enpresa;
import model.EpekakoErosketa;
import model.Erosketa;
import model.EtxetresnaElektrikoa;
import model.Pertsona;
import model.Produktua;

/**
 *
 * @author imadariaga
 */
public class ProgramaNagusia {

    private static ArrayList<Bezeroa> bezeroak;
    private static ArrayList<Produktua> katalogoa;
    private static ArrayList<Erosketa> erosketak;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        initialize();
        Scanner in = new Scanner(System.in);

        System.out.println("DATUAK IKUSI");
        System.out.println("==================");
        System.out.println("1. Erosketen zerrenda");
        System.out.println("2. Produktuen katalogoa");
        System.out.print("Aukeratu bat: ");
        String aukera = in.next();
        switch (aukera) {
            case "1":
                erosketakInprimatu();
                break;
            case "2":
                katalogoaInprimatu();
                break;
            case "3":
                //            bezeroekGastatutakoa();
                break;
            default:
                System.out.println("Aukera okerra.");
        }
        System.out.println("");
    }

    /**
     * Metodo honek kontaktuak, katalogoa eta erosketenZerrendaak arraylistak
     * hasieratzen ditu.
     */
    public static void initialize() {

        bezeroak = new ArrayList<>();
        bezeroak.add(new Pertsona(1, "Karlos", "Argiñano", "Hondartza Pasialekua z/g ZARAUTZ", "kargi@zarautz.eus"));
        bezeroak.add(new Pertsona(2, "Martin", "Berasategi", "Mirakontxa z/g. DONOSTIA", "mbera@donostia.eus"));

        String[] emailak = {"idazkaria@uni.eus", "zuzendaria@uni.eus"};
        bezeroak.add(new Enpresa(3, "IES Uni BHI", "Uni Eibar-Ermua", "Otaola Hiribidea 29, Eibar", emailak));

        katalogoa = new ArrayList<>();
        katalogoa.add(new EtxetresnaElektrikoa("001", "LG Hozkailua", 1450, "A+"));
        katalogoa.add(new EtxetresnaElektrikoa("002", "Fagor Hozkailua", 1200, "A+++"));
        katalogoa.add(new EtxetresnaElektrikoa("003", "AEG Garbigailua", 1300, "A+"));
        katalogoa.add(new EtxetresnaElektrikoa("004", "Fagor Labea", 850, "A"));
        katalogoa.add(new Elikagaia("101", "Idiazabal Gazta", 22, true));
        katalogoa.add(new Elikagaia("102", "Langostinoak", 25, false));
        katalogoa.add(new Elikagaia("103", "Atun Lata", 7, false));

        erosketak = new ArrayList<>();

        ArrayList<Produktua> lehenErosketaProduktuak = new ArrayList<>();
        lehenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "102"));
        lehenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "103"));
        lehenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "101"));
        ArrayList<Integer> lehenErosketaUnitateak = new ArrayList<>();
        lehenErosketaUnitateak.add(2);
        lehenErosketaUnitateak.add(1);
        lehenErosketaUnitateak.add(4);
        erosketak.add(new Erosketa("E20-01", "2020-09-25", bezeroak.get(1), lehenErosketaProduktuak, lehenErosketaUnitateak, 185));

        ArrayList<Produktua> bigarrenErosketaProduktuak = new ArrayList<>();
        bigarrenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "004"));
        ArrayList<Integer> bigarrenErosketaUnitateak = new ArrayList<>();
        bigarrenErosketaUnitateak.add(2);
        erosketak.add(new Erosketa("E20-02", "2020-10-24", bezeroak.get(0),
                bigarrenErosketaProduktuak, bigarrenErosketaUnitateak, 1700));

        ArrayList<Produktua> hirugarrenErosketaProduktuak = new ArrayList<>();
        hirugarrenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "101"));
        hirugarrenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "103"));
        ArrayList<Integer> hirugarrenErosketaUnitateak = new ArrayList<>();
        hirugarrenErosketaUnitateak.add(10);
        hirugarrenErosketaUnitateak.add(10);
        erosketak.add(new Erosketa("E20-03", "2020-11-09", bezeroak.get(0),
                hirugarrenErosketaProduktuak, hirugarrenErosketaUnitateak, 290));

        ArrayList<Produktua> laugarrenErosketaProduktuak = new ArrayList<>();
        laugarrenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "001"));
        laugarrenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "003"));
        laugarrenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "004"));
        ArrayList<Integer> laugarrenErosketaUnitateak = new ArrayList<>();
        laugarrenErosketaUnitateak.add(10);
        laugarrenErosketaUnitateak.add(10);
        laugarrenErosketaUnitateak.add(10);
        erosketak.add(new EpekakoErosketa("E21-01", "2021-01-07",
                bezeroak.get(1), laugarrenErosketaProduktuak, laugarrenErosketaUnitateak, 36000, 2000));

        ArrayList<Produktua> bostgarrenErosketaProduktuak = new ArrayList<>();
        bostgarrenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "002"));
        ArrayList<Integer> bostgarrenErosketaUnitateak = new ArrayList<>();
        bostgarrenErosketaUnitateak.add(1);
        erosketak.add(new Erosketa("E21-02", "2021-01-17", bezeroak.get(2),
                bostgarrenErosketaProduktuak, bostgarrenErosketaUnitateak, 1200));

        ArrayList<Produktua> seigarrenErosketaProduktuak = new ArrayList<>();
        seigarrenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "101"));
        seigarrenErosketaProduktuak.add(Produktua.getProduktua(katalogoa, "103"));
        ArrayList<Integer> seigarrenErosketaUnitateak = new ArrayList<>();
        seigarrenErosketaUnitateak.add(5);
        seigarrenErosketaUnitateak.add(10);
        erosketak.add(new Erosketa("E21-03", "2021-01-18", bezeroak.get(2),
                seigarrenErosketaProduktuak, seigarrenErosketaUnitateak, 180));

    }

    /**
     * Azterketa orrian zehaztutako txostena inprimatzen du, arraylistetan
     * dauzkagun datuak irakurriz.
     *
     */
    public static void erosketakInprimatu() {
        int erosketaKopurua=0;
        double prezioa=0;
        System.out.println("EROSKETEN ZERRENDA");
        System.out.println("================================================================");
        for (Erosketa e : erosketak) {
            System.out.println(e.toStringLuzea());
            prezioa = prezioa+ e.getGuztira();
            erosketaKopurua++;
            
        }
        System.out.println("");
        System.out.println("Laburbilduz,  "+ erosketaKopurua+ " egon dira, " + prezioa+ " euro batzen dituztenak");
    }

    /**
     * Azterketa orrian zehaztutako txostena inprimatzen du, arraylistetan
     * dauzkagun datuak irakurriz.
     *
     */
    public static void katalogoaInprimatu() {
        System.out.println("PRODUKTUEN ZERRENDA");
        System.out.println("================================================================");
      //  System.out.println(String.format("%-11s | %-5s | %-20s | %10s | %10s |%10s\n", "MOTA", "KODEA", "IZENA", "PREZIOA", "ARDURATSUA", "EROSITAKOAK"));
        for (Produktua p : katalogoa) {
            System.out.println("Mota : " + p);
            System.out.println("Kodea: " + p.getStrKodea());
            System.out.println("Izena: " + p.getIzena());
            System.out.println("Prezioa: " + p.getPrezioa());
            System.out.println("Arduratsua: " + p.baiez(p));
            
            System.out.println("");
            
         
        }
    }

}
