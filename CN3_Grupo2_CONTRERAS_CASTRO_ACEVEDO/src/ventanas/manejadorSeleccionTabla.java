/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author abrah
 */
public class manejadorSeleccionTabla implements ListSelectionListener {

    private Object output;

    public manejadorSeleccionTabla() {
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        ListSelectionModel lsm = (ListSelectionModel) e.getSource();
  
        int firstIndex = e.getFirstIndex();
        int lastIndex = e.getLastIndex();
        
        System.out.println("Indice seleccionado "+firstIndex+" "+lastIndex);
            
        frmTablaConOperacionesCRUD tabla = new frmTablaConOperacionesCRUD();
        tabla.enciendeBotones();
    }
}
