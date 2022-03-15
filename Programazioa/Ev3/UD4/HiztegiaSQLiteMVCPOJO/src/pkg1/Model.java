/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author arceredillo.adrian
 */
public class Model {
    private final String DB = "db/Hiztegia.db";
    //private static final String DB = "src/db/Hiztegia.db";
    
    
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
    
    public void terminoakImprimatu(){
        String sql = "SELECT id, euskaraz, gazteleraz FROM Terminoak";
        int numRegistros = 0;   //guardará el número/cantidad de registros 
        
        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            System.out.println("\n\t" + DB + " datubasearen datuak: ");
            System.out.println("\t================================");
            while (rs.next()) {
                System.out.println("\t" + (numRegistros + 1) +  "\t" + 
                               //"\t" + (numRegistros + 1) +  "\t" + 
                               rs.getString("euskaraz") + "\t\t" +
                               rs.getString("gazteleraz"));
                ++numRegistros;
            }
            System.out.println("\t- - - - - - - - - - - - - - - - ");
            System.out.println("\tGuztira: " + numRegistros + " elementu. \n");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /*
    public void terminoaGehitu2(String euskaraz, String gazteleraz) {
        String sql = "INSERT INTO Terminoak(euskaraz,gazteleraz) VALUES(?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            //las siguientes 2 sentencias sustituyen los "?" por los parámetros de entrada que recibe el método
            pstmt.setString(1, euskaraz);   
            pstmt.setString(2, gazteleraz);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    */
    
    public void terminoaGehitu(Terminoa t) {
        String sql = "INSERT INTO Terminoak(id, euskaraz,gazteleraz) VALUES(?,?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            //las siguientes 2 sentencias sustituyen los "?" por los parámetros de entrada que recibe el método
            
            pstmt.setInt(1, t.getId());   
            pstmt.setString(2, t.getEuskara());   
            pstmt.setString(3, t.getGaztelera());
            /*
            pstmt.setString(1, euskaraz);   
            pstmt.setString(2, gazteleraz);
            */
            
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public void terminoaGehituObjektuGabe(String euskaraz, String gazteleraz) {
        String sql = "INSERT INTO Terminoak(euskaraz,gazteleraz) VALUES(?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            //las siguientes 2 sentencias sustituyen los "?" por los parámetros de entrada que recibe el método
            pstmt.setString(1, euskaraz);   
            pstmt.setString(2, gazteleraz);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public void terminoaEzabatu(int id) {
        String sql = "DELETE FROM Terminoak WHERE id = ?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setInt(1, id);
            // execute the delete statement
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public void terminoaAldatu(int id, String euskaraz, String gazteleraz) {
        String sql = "UPDATE Terminoak SET euskaraz = ? , "
                + "gazteleraz = ? "
                + "WHERE id = ?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setString(1, euskaraz);
            pstmt.setString(2, gazteleraz);
            pstmt.setInt(3, id);
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public String verRegistrosTodos() {
        
        ArrayList<Terminoa> regTerminoak = new ArrayList<>();
        String taula = "Terminoak";
        String sql = "SELECT * FROM " + taula;
        
        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Terminoa iz = new Terminoa(rs.getInt("id"), rs.getString("euskaraz"), rs.getString("gazteleraz"));
                regTerminoak.add(iz);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return regTerminoak.toString();
        
    }
    
}

