/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn3_grupo2_contreras_castro_acevedo;

import db.BaseDatos;
import vo.duenoMascota;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author abrah
 */
public class CN3_Grupo2_CONTRERAS_CASTRO_ACEVEDO {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        //ejemplo de como se agregan datos, ya probado
        //duenoMascota objDuenoMascota = new duenoMascota("Jose","Acevedo",15,'M',"Acevedo",'M');
        //accesoCRUDClinicaVet.agregarDuenoMascota(objDuenoMascota);
        
        //ejemplo de como eliminar datos probado ok
        //duenoMascota objDuenoMascota = new duenoMascota();
        //solo se necesita la llave, aunque podria llenar todo el objeto se eliminara con la llave
        //objDuenoMascota.setIdDuenoMascota(2);
        //accesoCRUDClinicaVet.eliminarDuenoMascota(objDuenoMascota);
        

        //ejemplo de como actualizar datos
        

        //ejemplo de como se leen datos, ahi toca asignarle eso a un cuadro tipo tabla o grilla en swing
        duenoMascota objDuenoMascota = new duenoMascota("Modificado","Acevedo",15,'M',"Ex mascota de danielito",'M');
        //la llave se setea a parte, no requiere constructor en el objeto con ese parametro porque, ya que la actualizacion en si, recibe el objeto ya cargado de una lectura anterior, como el select *, esto es unicamente una prueba
        
        objDuenoMascota.setIdDuenoMascota(4);
        BaseDatos.actualizarDuenoMascota(objDuenoMascota);
        
        List<duenoMascota> duenos = BaseDatos.listarDuenosMascotas();
        for (int contador = 0; contador < duenos.size(); contador++) { 		      
          System.out.println(duenos.get(contador).getIdDuenoMascota()+" "+duenos.get(contador).getNombre()+" "+duenos.get(contador).getApellido()+" "+duenos.get(contador).getEdad()+" "+duenos.get(contador).getSexo()+" "+duenos.get(contador).getNombreMascota()+" "+duenos.get(contador).getSexoMascota()); 		
      } 

    }

}
