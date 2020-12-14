/**
 *
 * @author abrah
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author acastro
 */


public class conexionBD {

    private static String url = "jdbc:mysql://theacpinnovacion.com:3306/ClinicaVeterinariaBD";
    private static String user = "root";
    private static String pass = "123456";
    private static Connection conn = null;

    public static Connection getConexion() {
        try {
            if (conn == null) {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, pass);

            }
            return conn;
        } catch (Exception e) {
            System.err.println("Excepción en ConexionBD.getConexion: " + e);
            return null;
        }
    }
}
