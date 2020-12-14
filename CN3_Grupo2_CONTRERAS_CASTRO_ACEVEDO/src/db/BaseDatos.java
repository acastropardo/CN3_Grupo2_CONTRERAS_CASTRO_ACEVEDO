/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import db.conexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import vo.duenoMascota;
import java.util.List;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
//import java.util.Hashtable;

/**
 *
 * @author abrah
 */
public class BaseDatos {

    public static duenoMascota leerDuenoMascota(int indice) throws SQLException {
        duenoMascota duenoMasc = new duenoMascota();
        try {
            
            Connection conn = conexionBD.getConexion();
            String sql = "select * from DuenoMascota where idDuenoMascota = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, indice);
            ResultSet rs = pst.executeQuery();
          
            while (rs.next()) {

                duenoMasc.setIdDuenoMascota(rs.getInt("idDuenoMascota"));
                duenoMasc.setNombre(rs.getString("nombre"));
                duenoMasc.setApellido(rs.getString("apellido"));
                duenoMasc.setEdad(rs.getInt("edad"));
                duenoMasc.setSexo(rs.getString("sexo").charAt(0));
                duenoMasc.setNombreMascota(rs.getString("nombreMascota"));
                duenoMasc.setSexoMascota(rs.getString("sexoMascota").charAt(0));
            }
        } catch (SQLException e) {
            System.err.println("Excepcion de SQL: " + e);
        }
        return duenoMasc;
    }

    public static void actualizarDuenoMascota(duenoMascota objDuenoMascota) throws SQLException {
        try {
            Connection conn = conexionBD.getConexion();
            String sql = "update DuenoMascota SET nombre = ?, apellido = ?, edad = ?, sexo = ?, nombreMascota = ?, sexoMascota = ? where idDuenoMascota = ?";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, objDuenoMascota.getNombre());
            pst.setString(2, objDuenoMascota.getApellido());
            pst.setInt(3, objDuenoMascota.getEdad());
            pst.setString(4, String.valueOf(objDuenoMascota.getSexo()));
            pst.setString(5, objDuenoMascota.getNombreMascota());
            pst.setString(6, String.valueOf(objDuenoMascota.getSexoMascota()));
            pst.setInt(7, objDuenoMascota.getIdDuenoMascota());
            pst.execute();
            System.out.println("Datos de dueño de mascota  actualizados correctamente");

        } catch (SQLException e) {
            System.err.println("Excepcion de SQL: " + e);
        }
    }

    public static void eliminarDuenoMascota(duenoMascota objDuenoMascota) throws SQLException {
        try {
            Connection conn = conexionBD.getConexion();

            String sql = "delete from DuenoMascota where idDuenoMascota = ?";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, objDuenoMascota.getIdDuenoMascota());
            pst.execute();
            System.out.println("Datos de dueño de mascota  eliminados correctamente");

        } catch (SQLException e) {
            System.err.println("Excepcion de SQL: " + e);
        }
    }

    public static void agregarDuenoMascota(duenoMascota objDuenoMascota) throws SQLException {
        try {
            Connection conn = conexionBD.getConexion();

            String sql = "insert into DuenoMascota values (?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, 0);
            pst.setString(2, objDuenoMascota.getNombre());
            pst.setString(3, objDuenoMascota.getApellido());
            pst.setInt(4, objDuenoMascota.getEdad());
            pst.setString(5, String.valueOf(objDuenoMascota.getSexo()));
            pst.setString(6, objDuenoMascota.getNombreMascota());
            pst.setString(7, String.valueOf(objDuenoMascota.getSexoMascota()));
            pst.execute();
            System.out.println("Datos de dueño de mascota  ingresados correctamente");

        } catch (SQLException e) {
            System.err.println("Excepcion de SQL: " + e);
        }

    }

    public static TableModel convierteResultSetaTableModel(ResultSet rs) {
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();

            // Get the column names
            for (int column = 0; column < numberOfColumns; column++) {
                columnNames.addElement(metaData.getColumnLabel(column + 1));
            }

            // Get all rows.
            Vector rows = new Vector();

            while (rs.next()) {
                Vector newRow = new Vector();

                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                }

                rows.addElement(newRow);
            }

            return new DefaultTableModel(rows, columnNames);
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }

    public static ResultSet leerDuenosMascotas() throws SQLException {
        Connection conn = conexionBD.getConexion();

        PreparedStatement pst = conn.prepareStatement("SELECT * FROM DuenoMascota");
        ResultSet rs = pst.executeQuery();
        return rs;

    }

    public static List<duenoMascota> listarDuenosMascotas() throws SQLException {

        Connection conn = conexionBD.getConexion();

        PreparedStatement pst = conn.prepareStatement("SELECT * FROM DuenoMascota");
        ResultSet rs = pst.executeQuery();

        List<duenoMascota> duenos = new ArrayList<duenoMascota>();

        while (rs.next()) {
            duenoMascota duenoMasc = new duenoMascota();
            duenoMasc.setIdDuenoMascota(rs.getInt("idDuenoMascota"));
            duenoMasc.setNombre(rs.getString("nombre"));
            duenoMasc.setApellido(rs.getString("apellido"));
            duenoMasc.setEdad(rs.getInt("edad"));
            duenoMasc.setSexo(rs.getString("sexo").charAt(0));
            duenoMasc.setNombreMascota(rs.getString("nombreMascota"));
            duenoMasc.setSexoMascota(rs.getString("sexoMascota").charAt(0));

            duenos.add(duenoMasc);
        }

        return duenos;
    }

}
