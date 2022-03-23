/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saveToFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import pkg2.*;

/**
 *
 * @author AdriAlex
 */
public class HiztegiaWithFiles {

    private final String DB = "db/GaragePrueba.db";

    public static void main(String[] args) throws IOException {

        Model model = new Model();
        model.terminoakImprimatu();
        System.out.println("--------------------------------");
        
        
        System.out.println(registrosArrayList());
        System.out.println("--------------------------------");
        
    }

    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:" + DB;
        //String url = "jdbc:sqlite:" + DB;

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    private static Connection connect2() {
        // SQLite connection string
        String url = "jdbc:sqlite:db/Hiztegia.db";
        //String url = "jdbc:sqlite:" + DB;

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void terminoakImprimatu() {
        String sql = "SELECT id, euskaraz, gazteleraz FROM Terminoak";
        int numRegistros = 0;   //guardará el número/cantidad de registros 

        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            System.out.println("\n\t" + DB + " datubasearen datuak: ");
            System.out.println("\t================================");
            while (rs.next()) {
                System.out.println("\t" + rs.getInt("id") + "\t"
                        + rs.getString("euskaraz") + "\t\t"
                        + rs.getString("gazteleraz"));
                ++numRegistros;
            }
            System.out.println("\t- - - - - - - - - - - - - - - - ");
            System.out.println("\tGuztira: " + numRegistros + " elementu. \n");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String /*static ArrayList<String>*/ registrosArrayList() {
        ArrayList<String> regTerminoak = new ArrayList<>();
        String taula = "Terminoak";
        String sql = "SELECT * FROM " + taula;
        
        String guardarFile = "../StreamekinLanean/HiztegiaFromDB.txt";

        try (Connection conn = connect2();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                PrintWriter out = new PrintWriter(guardarFile)) {
            
            String cadaRegistro = "";
            while (rs.next()) {
                cadaRegistro = "id: " + rs.getInt("id") + ", Euskaraz: " + rs.getString("euskaraz") + ", Gazteleraz: " + rs.getString("gazteleraz");
                regTerminoak.add(cadaRegistro);
                out.println(cadaRegistro);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return regTerminoak.toString();
    }

}
