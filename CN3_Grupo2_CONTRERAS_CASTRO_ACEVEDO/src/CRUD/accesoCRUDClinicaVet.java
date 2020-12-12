/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import CRUD.conexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import CRUD.duenoMascota;
import java.util.List;
import java.util.ArrayList;
//import java.util.Hashtable;

/**
 *
 * @author abrah
 */
public class accesoCRUDClinicaVet {

    public static void agregarDuenoMascota(duenoMascota objDuenoMascota) throws SQLException {
        try {
            Connection conn = conexionBD.getConexion();

            String sql = "insert into DuenoMascota values (?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, objDuenoMascota.getNombre());
            pst.setString(2, objDuenoMascota.getApellido());
            pst.setInt(3, objDuenoMascota.getEdad());
            pst.setString(4, String.valueOf(objDuenoMascota.getSexo()));
            pst.setString(5, objDuenoMascota.getNombreMascota());
            pst.setString(6, String.valueOf(objDuenoMascota.getSexoMascota()));
            pst.execute();
            System.out.println("Datos de dueño de mascota  ingresados correctamente");

        } catch (SQLException e) {
            System.err.println("Excepcion de SQL: " + e);
        }

    }
    //public List<Person> listCustomersWithName(String name) throws SQLException {
    public static List<duenoMascota> listarDuenosMascotas() throws SQLException {

        Connection conn = conexionBD.getConexion();

        PreparedStatement pst = conn.prepareStatement("SELECT * FROM DuenoMascota");
        ResultSet rs = pst.executeQuery();

        List<duenoMascota> duenos = new ArrayList<duenoMascota>();
        
        while (rs.next()) {
            duenoMascota duenoMasc = new duenoMascota();
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
