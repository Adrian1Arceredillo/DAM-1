package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

/*
Other imports
 */
public class Model {

    private final String DB = "db/Hiztegia.db";

    private Connection konektatu() {
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

    public static ArrayList<Terminoa> getAllWords() {

        ArrayList<Terminoa> allWords = new ArrayList<>();
        String sql = "SELECT id, euskaraz, gazteleraz FROM Terminoak";

        try (Connection conn = connect2();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {
                Terminoa everyWord = new Terminoa(
                        rs.getInt("id"), rs.getString("euskaraz"), rs.getString("gazteleraz"));

                allWords.add(everyWord);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return allWords;
    }

    

    public void terminoakInprimatu() {
        String taula = "Terminoak";
        String sql = "SELECT * FROM " + taula;

        try (Connection conn = konektatu();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            //Txostenaren izenburua
            String izenburua = DB + " datu-baseko " + taula + " taulako datuak:";
            System.out.println(izenburua);
            for (int i = 0; i < izenburua.length(); i++) {
                System.out.print("=");
            }
            System.out.println("");

            int kont = 0;
            while (rs.next()) {
                Terminoa t = new Terminoa(rs.getInt("id"), rs.getString("euskaraz"), rs.getString("gazteleraz"));
                System.out.println(t);
                kont++;
            }
            for (int i = 0; i < izenburua.length(); i++) {
                System.out.print("-");
            }
            System.out.println("");
            System.out.println("GUZTIRA: " + kont + " termino");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void terminoaGehitu2(Terminoa t) {
        String sql = "INSERT INTO Terminoak(euskaraz,gazteleraz) VALUES(?,?)";

        try (Connection conn = this.konektatu();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            //las siguientes 2 sentencias sustituyen los "?" por los parámetros de entrada que recibe el método

            pstmt.setString(1, t.getEuskaraz());
            pstmt.setString(2, t.getGazteleraz());
            /*
            pstmt.setString(1, euskaraz);   
            pstmt.setString(2, gazteleraz);
             */

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean checkNewRecordExists(String eusBeforeInsert, String gazBeforeInsert) {
        String sql = "SELECT * FROM Terminoak WHERE euskaraz = ? and gazteleraz = ?";

        try (Connection conn = connect2();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setString(1, eusBeforeInsert);
            pstmt.setString(2, gazBeforeInsert);
            // update 
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                return true;
                //strBuscado = rs.getString("gazteleraz");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    
    public static boolean checkUserTranslation(String originalEuskaraz, String userGazteleraz) {
        String sql = "SELECT * FROM Terminoak WHERE euskaraz = ? and gazteleraz = ?";

        try (Connection conn = connect2();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setString(1, originalEuskaraz);
            pstmt.setString(2, userGazteleraz);
            // update 
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                return true;
                //strBuscado = rs.getString("gazteleraz");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    /*
    public void terminoakInprimatuObjektuGabe() {
        String taula = "Terminoak";
        String sql = "SELECT * FROM " + taula;

        try (Connection conn = konektatu(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            //Txostenaren izenburua
            String izenburua = DB + " datu-baseko " + taula + " taulako datuak:";
            System.out.println(izenburua);
            for (int i = 0; i < izenburua.length(); i++) {
                System.out.print("=");
            }
            System.out.println("");

            int kont = 0;
            while (rs.next()) {
                System.out.printf("%3d  %-30s%-30s\n", rs.getInt("id"), rs.getString("euskaraz"), rs.getString("gazteleraz"));
                kont++;
            }
            for (int i = 0; i < izenburua.length(); i++) {
                System.out.print("-");
            }
            System.out.println("");
            System.out.println("GUZTIRA: " + kont + " termino");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
     */
    public void itzulpenaInprimatu(String euskarazkoa) {
        String taula = "Terminoak";
        String sql = "SELECT * FROM " + taula + " WHERE euskaraz= ?";

        try (Connection conn = konektatu(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, euskarazkoa);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Terminoa t = new Terminoa(rs.getInt("id"), rs.getString("euskaraz"), rs.getString("gazteleraz"));
                System.out.println(t);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public int terminoaGehitu(Terminoa t) {

        String sql = "INSERT INTO Terminoak(id,euskaraz,gazteleraz) VALUES(?,?,?)";

        try (Connection conn = konektatu();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, t.getId());
            pstmt.setString(2, t.getEuskaraz());
            pstmt.setString(3, t.getGazteleraz());
            return pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }

    }

    /*
    public int terminoaGehituObjektuGabe(int id, String euskaraz, String gazteleraz) {

        String sql = "INSERT INTO Terminoak(id,euskaraz,gazteleraz) VALUES(?,?,?)";

        try (Connection conn = konektatu(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, 1790);
            pstmt.setString(2, euskaraz);
            pstmt.setString(3, gazteleraz);
            return pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }

    }
     */
    public int terminoaEzabatu(String recordToDelete) {

        String sql = "DELETE FROM Terminoak WHERE euskaraz = ? LIMIT 1";

        try (Connection conn = konektatu(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, recordToDelete);
            return pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }

    }

    public static String translateWord(String euskarazUserChoice) {
        String sql = "SELECT gazteleraz FROM Terminoak WHERE euskaraz = ? LIMIT 1";     //buscar la forma de devolver SOLO EL PRIMERO que cumpla las condiciones
        String strBuscado = "no result found";

        try (Connection conn = connect2();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setString(1, euskarazUserChoice);
            // update 
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                strBuscado = rs.getString("gazteleraz");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return strBuscado;
    }

    public static ArrayList<Terminoa> registrosArrayList() {
        ArrayList<Terminoa> regTerminoak = new ArrayList<>();
        String taula = "Terminoak";
        String sql = "SELECT * FROM " + taula;

        try (Connection conn = connect2();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                //Terminoa iz = new Terminoa(rs.getInt("id"), rs.getString("euskaraz"), rs.getString("gazteleraz"));
                Terminoa iz = new Terminoa(rs.getInt("id"), rs.getString("euskaraz"), rs.getString("gazteleraz"));
                regTerminoak.add(iz);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return regTerminoak;
    }

}
