/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

import vo.*;
import db.BaseDatos;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import ventanas.frmMenuOperacionesCRUD;
import vo.DuenoMascota;

/**
 *
 * @author joseacevedo
 */
public class ValidacionCredenciales {

    private String Usuario;
    private String Clave;
    private int x;

    public ValidacionCredenciales(String Usuario, String Clave) {
        this.Usuario = Usuario;
        this.Clave = Clave;
    }

    public int Validacion() {

        if ((Usuario.equals("admin")) && (Clave.equals("abcdef"))) {
            JOptionPane.showMessageDialog(null, "Acceso Correcto");
            frmMenuOperacionesCRUD menuOpe = new frmMenuOperacionesCRUD();
            menuOpe.setVisible(true);
            
            return x = 1;

        } else {
            JOptionPane.showMessageDialog(null, "Credenciales Erroneas");
            
            return x = 0;
        }

    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

}
