/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn3_grupo2_contreras_castro_acevedo;

import CRUD.accesoCRUDClinicaVet;
import CRUD.duenoMascota;
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
        
        //duenoMascota objDuenoMascota = new duenoMascota("Oriana","Contreras",15,'F',"Mascota de Oriana",'M');
        //accesoCRUDClinicaVet.agregarDuenoMascota(objDuenoMascota);
        
        //ejemplo de como se leen datos, ahi toca asignarle eso a un cuadro tipo tabla o grilla en swing
        
        List<duenoMascota> duenos = accesoCRUDClinicaVet.listarDuenosMascotas();
        for (int contador = 0; contador < duenos.size(); contador++) { 		      
          System.out.println(duenos.get(contador).getNombre()+" "+duenos.get(contador).getApellido()+" "+duenos.get(contador).getEdad()+" "+duenos.get(contador).getSexo()+" "+duenos.get(contador).getNombreMascota()+" "+duenos.get(contador).getSexoMascota()); 		
      } 

    }

}
