/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author arceredillo.adrian
 */
public class Model {
    private final String DB = "db/GaragePrueba.db";
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
    
    private static Connection connect2() {
        // SQLite connection string
        String url = "jdbc:sqlite:db/GaragePrueba.db";
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
        String sql = "SELECT idClientes, Nombre, Apellido, Edad, Mail, Telefono FROM Clientes";
        int numRegistros = 0;   //guardará el número/cantidad de registros 
        
        
        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            /*System.out.println("\n\t" + DB + " datubasearen datuak: ");
            System.out.println("\t================================");*/
            System.out.println("CUSTOMER HISTORY: ");
            System.out.println("==========================================================================================================================");
            System.out.printf("%-10s %20s %25s %10s %-25s %20s \n", "Cust. id", "Customer's Name", "Customer's Surname", "Age", "Mail", "Phone Number");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
            while (rs.next()) {
                /*System.out.println("\t" + rs.getInt("idClientes") +  "\t" + 
                               rs.getString("Nombre") + "\t\t" +
                               rs.getString("Apellido") + "\t\t" + 
                               rs.getInt("Edad") + "\t" + rs.getString("Mail") + "\t\t" + rs.getInt("Telefono") + "\t");*/
                
                System.out.printf("%-10d %20s %25s %10d %-25s %20d\n", 
                        rs.getInt("idClientes"), 
                        rs.getString("Nombre"), 
                        rs.getString("Apellido"), 
                        rs.getInt("Edad"), rs.getString("Mail"), rs.getInt("Telefono"));
                ++numRegistros;
            }
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
            System.out.println("\tGuztira: " + numRegistros + " elementu. \n");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public void terminoaGehitu(String euskaraz, String gazteleraz) {
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
    
    public void terminoaGehitu2(Terminoa t) {
        //String sql = "INSERT INTO Terminoak(euskaraz,gazteleraz) VALUES(?,?)";
        String sql = "INSERT INTO Clientes (Nombre, Apellido, Edad, Mail, Telefono) VALUES (?,?,?,?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            //las siguientes 2 sentencias sustituyen los "?" por los parámetros de entrada que recibe el método
            
            pstmt.setString(1, t.getNombre());
            pstmt.setString(2, t.getApellido());
            pstmt.setInt(3, t.getEdad());
            pstmt.setString(4, t.getMail());
            pstmt.setInt(5, t.getTelefono());
            /*
            pstmt.setString(1, euskaraz);   
            pstmt.setString(2, gazteleraz);
            */
            
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public void terminoaGehituObjektuGabe(String Nombre, String Apellido, int Edad, String Mail, int Telefono) {
        String sql = "INSERT INTO Clientes(Nombre, Apellido, Edad, Mail, Telefono) VALUES (?,?,?,?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            //las siguientes 2 sentencias sustituyen los "?" por los parámetros de entrada que recibe el método
            pstmt.setString(1, Nombre);   
            pstmt.setString(2, Apellido);
            pstmt.setInt(3, Edad);
            String clienteMail = Nombre + "." + Apellido + "@garage.diy";
            pstmt.setString(4, clienteMail);
            pstmt.setInt(5, Telefono);
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
    
    
    public void terminoaAldatu(int id, String Nombre, int Telefono) {
        String sql = "UPDATE Clientes SET Nombre = ? , "
                + "Telefono = ? "
                + "WHERE id = ?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setString(1, Nombre);
            pstmt.setInt(2, Telefono);
            pstmt.setInt(3, id);
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public String verRegistrosTodos() {
        
        ArrayList<Terminoa> regClientes = new ArrayList<>();    //ver todos los Clientes (de la tabla "Clientes")
        String taula = "Clientes";
        String sql = "SELECT * FROM " + taula;
        
        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                //Terminoa iz = new Terminoa(rs.getString("euskaraz"), rs.getString("gazteleraz"));
                Terminoa iz = new Terminoa(rs.getString("Nombre"), rs.getString("Apellido"), rs.getInt("Edad"), rs.getInt("Telefono"));                
                regClientes.add(iz);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return regClientes.toString();
        
    }
    
    /**
     * BD "GaragePrueba" - Introducir el Apellido y la Edad de un 
     * cliente, y obtener el mail de este.
     * 
     * mail -> "apellido.nombre@garage.diy"
     * 
     * @param Apellido
     * @param Edad
     * @return 
     */
    public String traducirPalabra(String Apellido, int Edad) {
        String sql = "SELECT Mail FROM Clientes WHERE Apellido = ? AND Edad = ? LIMIT 1";     //buscar la forma de devolver SOLO EL PRIMERO que cumpla las condiciones
        String mailBuscado = "no encontrado";
        
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setString(1, Apellido);
            pstmt.setInt(2, Edad);
            // update 
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                mailBuscado = rs.getString("Mail");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return mailBuscado;
    }
    
    
    public static ArrayList<Terminoa> registrosArrayList() {
        ArrayList<Terminoa> regClientes = new ArrayList<>();
        String taula = "Clientes";
        String sql = "SELECT * FROM " + taula;
        
        try (Connection conn = connect2();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                //Terminoa iz = new Terminoa(rs.getInt("id"), rs.getString("euskaraz"), rs.getString("gazteleraz"));
                Terminoa iz = new Terminoa(rs.getString("Nombre"), rs.getString("Apellido"), rs.getInt("Edad"), rs.getInt("Telefono"));                
                regClientes.add(iz);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return regClientes;
    }
    
    
    
    }



