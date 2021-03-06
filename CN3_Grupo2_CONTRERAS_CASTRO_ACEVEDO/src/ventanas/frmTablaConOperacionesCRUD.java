/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author oacon
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.TableModel;
import db.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import vo.DuenoMascota;

public class frmTablaConOperacionesCRUD extends javax.swing.JFrame {

    /**
     * Creates new form tablaConOperacionesCRUD
     */
    ListSelectionModel listSelectionModel;

    public frmTablaConOperacionesCRUD() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableOpCRUD = new javax.swing.JTable();
        btnEliminarRegistro = new javax.swing.JButton();
        btnEditarDatos = new javax.swing.JButton();
        btnCrearNuevoRegistro = new javax.swing.JButton();
        btnMenuP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tableOpCRUD.setBackground(new java.awt.Color(0, 204, 204));
        tableOpCRUD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "Edad", "Sexo", "Nombre mascota", "Sexo mascota"
            }
        ));
        tableOpCRUD.setToolTipText("");
        jScrollPane1.setViewportView(tableOpCRUD);

        btnEliminarRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarRegistro.setForeground(new java.awt.Color(0, 153, 153));
        btnEliminarRegistro.setText("Eliminar");
        btnEliminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRegistroActionPerformed(evt);
            }
        });

        btnEditarDatos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditarDatos.setForeground(new java.awt.Color(0, 153, 153));
        btnEditarDatos.setText("Editar");
        btnEditarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDatosActionPerformed(evt);
            }
        });

        btnCrearNuevoRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCrearNuevoRegistro.setForeground(new java.awt.Color(0, 153, 153));
        btnCrearNuevoRegistro.setText("Crear");
        btnCrearNuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearNuevoRegistroActionPerformed(evt);
            }
        });

        btnMenuP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMenuP.setForeground(new java.awt.Color(0, 153, 153));
        btnMenuP.setText("Menu");
        btnMenuP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Tabla de Registros ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnEditarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnCrearNuevoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMenuP, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel1)
                .addGap(0, 301, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearNuevoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenuP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnMenuPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPActionPerformed
        // TODO add your handling code here:
        frmMenuOperacionesCRUD MenuOp = new frmMenuOperacionesCRUD();
        MenuOp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuPActionPerformed

    private void btnCrearNuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearNuevoRegistroActionPerformed
        // TODO add your handling code here:
        frmCrearRegistroNuevo crearRegistro = new frmCrearRegistroNuevo();
        crearRegistro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCrearNuevoRegistroActionPerformed

    private void btnEditarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDatosActionPerformed
        // TODO add your handling code here:
        int indice = 0;
        int fila = 0;

        fila = this.tableOpCRUD.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado nada para editar");
        } else if (fila > -1) {
            fila++;//se suma 1 para que queden iguales porque el indice siempre es 1 menos

            System.out.println("fila seleccionada " + fila);
            try {
                ResultSet rs = BaseDatos.leerDuenosMascotas();
                rs.absolute(fila);
                indice = rs.getInt("idDuenoMascota");
            } catch (SQLException ex) {
                Logger.getLogger(frmTablaConOperacionesCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (indice > 0) {//encontrado entonces carga objeto y abre ventana
                frmModificarRegistroDueño modificarRegistro = new frmModificarRegistroDueño();
                modificarRegistro.setIdDuenoMascota(indice);
                modificarRegistro.setVisible(true);
                this.dispose();
            }
        }


    }//GEN-LAST:event_btnEditarDatosActionPerformed

    private void btnEliminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRegistroActionPerformed
        // TODO add your handling code here:
        int indice = 0;
        int fila = 0;
        DuenoMascota duenoMascotaEliminar;
        fila = this.tableOpCRUD.getSelectedRow();
        System.out.println("fila seleccionada " + fila);
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado nada para eliminar");
        } else if (fila > -1) {
            fila++;//se suma uno para que queden iguales
            int decision = JOptionPane.YES_NO_OPTION;
            if (JOptionPane.showConfirmDialog(null, "¡Está usted seguro de eliminar el registro?", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                try {
                    ResultSet rs = BaseDatos.leerDuenosMascotas();
                    rs.absolute(fila);
                    indice = rs.getInt("idDuenoMascota");

                    duenoMascotaEliminar = BaseDatos.leerDuenoMascota(indice);

                    BaseDatos.eliminarDuenoMascota(duenoMascotaEliminar);
                    JOptionPane.showConfirmDialog(null, "Datos eliminados correctamente", "OK", JOptionPane.PLAIN_MESSAGE);

                } catch (SQLException ex) {
                    Logger.getLogger(frmTablaConOperacionesCRUD.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                // no pasa nada
            }

        }

    }//GEN-LAST:event_btnEliminarRegistroActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        setIconImage(new ImageIcon(getClass().getResource("/imagen/ClinicaVete.png")).getImage());

        listSelectionModel = tableOpCRUD.getSelectionModel();//para pillar eventos de seleccion y activar asi los botones edicion y editar @acp15-12-2020 
        listSelectionModel.addListSelectionListener(new manejadorSeleccionTabla());
        listSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableOpCRUD.setSelectionModel(listSelectionModel);
        try {
            // TODO add your handling code here:
            llenaTabla();
            this.btnEditarDatos.setEnabled(false);//inicialmente apagados @acp15/12/2020
            this.btnEliminarRegistro.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(frmTablaConOperacionesCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    public void enciendeBotones() {
        //se habilitan cuando se selecciona algo en la tabla @acp15/12/2020
        this.btnEditarDatos.setEnabled(true);
        this.btnEliminarRegistro.setEnabled(true);
    }

    public void llenaTabla() throws SQLException {
        ResultSet rs = BaseDatos.leerDuenosMascotas();

        TableModel dtm = BaseDatos.convierteResultSetaTableModel(rs);

        this.tableOpCRUD.setModel(dtm);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmTablaConOperacionesCRUD.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTablaConOperacionesCRUD.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTablaConOperacionesCRUD.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTablaConOperacionesCRUD.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTablaConOperacionesCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearNuevoRegistro;
    private javax.swing.JButton btnEditarDatos;
    private javax.swing.JButton btnEliminarRegistro;
    private javax.swing.JButton btnMenuP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableOpCRUD;
    // End of variables declaration//GEN-END:variables

    class manejadorSeleccionTabla implements ListSelectionListener {

        private Object output;
        private JFrame frame = new frmTablaConOperacionesCRUD();

        public manejadorSeleccionTabla() {
        }

        @Override
        public void valueChanged(ListSelectionEvent e) {
            ListSelectionModel lsm = (ListSelectionModel) e.getSource();

            int firstIndex = e.getFirstIndex();
            int lastIndex = e.getLastIndex();

            System.out.println("Indice seleccionado " + firstIndex + " " + lastIndex);
            enciendeBotones();//encender botones, ya que algo fue seleccoinado en la tabla @acp15/12/2020
        }
    }
}
