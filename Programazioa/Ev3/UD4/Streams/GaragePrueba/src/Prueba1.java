/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AdriAlex
 */
public class Prueba1 {
    public static void main(String[] args) {
        
        Connection connection = null;
        String miUrl = "jdbc:mariadb://localhost:3306/dbpruebagarage";
        String user = "root";
        String pwd = "";
        
        try {
            connection = DriverManager.getConnection(miUrl, user, pwd);
        } catch (SQLException ex) {
            Logger.getLogger(Prueba1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Successfully connected to database");
        
    }
}
