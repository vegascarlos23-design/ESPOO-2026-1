package Vista;

import Control.ListaPartidos;
import Control.ListaEquipos;
import Modelo.Partido;
import Modelo.Equipo;
import javax.swing.JOptionPane;


public class JFramePrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFramePrincipal.class.getName());
    private ListaEquipos objListaEquipos = new ListaEquipos();
    private ListaPartidos objListaPartido = new ListaPartidos();

    public JFramePrincipal() {
        initComponents();
        objListaEquipos.Listar(tblEquipos);
        objListaPartido.Listar(tblPartidos);
        CargarCombo();
    }
    
    private String verRegionCbo = "-1";

    private void CargarCombo() {
        objListaEquipos.CargarCombo(cboEquipoLocal);
        objListaEquipos.CargarCombo(cboEquipoVisitante);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEquipos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPartidos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdEquipo = new javax.swing.JTextField();
        txtNombreEquipo = new javax.swing.JTextField();
        txtCiudadOrigen = new javax.swing.JTextField();
        btnRegistrarEquipo = new javax.swing.JButton();
        btnEditarNombreEquipo = new javax.swing.JButton();
        btnLimpiarCampos = new javax.swing.JButton();
        btnEliminarEquipo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIdPartido = new javax.swing.JTextField();
        btnRegistrarPartido = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cboEquipoLocal = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtGolesVistitante = new javax.swing.JTextField();
        txtGolesLocal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboEquipoVisitante = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtHistorialPartidos = new javax.swing.JTextField();
        btnVerPartidos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEquiposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEquipos);

        tblPartidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblPartidos);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("ID Equipo");

        jLabel2.setText("Nombre Equipo");

        jLabel3.setText("Ciudad de Origen");

        btnRegistrarEquipo.setText("Registrar");
        btnRegistrarEquipo.addActionListener(this::btnRegistrarEquipoActionPerformed);

        btnEditarNombreEquipo.setText("Editar Nombre");
        btnEditarNombreEquipo.addActionListener(this::btnEditarNombreEquipoActionPerformed);

        btnLimpiarCampos.setText("Limpiar campos");
        btnLimpiarCampos.addActionListener(this::btnLimpiarCamposActionPerformed);

        btnEliminarEquipo.setText("Eliminar");
        btnEliminarEquipo.addActionListener(this::btnEliminarEquipoActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCiudadOrigen)
                            .addComponent(txtNombreEquipo)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdEquipo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiarCampos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarEquipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarNombreEquipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarEquipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnEditarNombreEquipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnEliminarEquipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiarCampos)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel8.setText("Id Partido");

        jLabel10.setText("Goles Local");

        btnRegistrarPartido.setText("Registrar");
        btnRegistrarPartido.addActionListener(this::btnRegistrarPartidoActionPerformed);

        jLabel11.setText("Goles Visitante");

        cboEquipoLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Equipo Local");

        jLabel5.setText("Equipo Visitante");

        cboEquipoVisitante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Historial Partidos");

        btnVerPartidos.setText("Ver Partidos");
        btnVerPartidos.addActionListener(this::btnVerPartidosActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboEquipoVisitante, 0, 158, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtGolesLocal))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboEquipoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtGolesVistitante)))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdPartido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(btnRegistrarPartido))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtHistorialPartidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerPartidos)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtIdPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarPartido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboEquipoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboEquipoVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtGolesLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtGolesVistitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtHistorialPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerPartidos))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEquipoActionPerformed
        try {
            int idEquipo = Integer.parseInt(txtIdEquipo.getText());
            String nombreEquipo = txtNombreEquipo.getText();
            String ciudadOrigen = txtCiudadOrigen.getText();
            
            Equipo elemento = new Equipo(idEquipo, nombreEquipo, ciudadOrigen);
            if (!objListaEquipos.Agregar(elemento)) return;
            objListaEquipos.Listar(tblEquipos);
            CargarCombo();
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnRegistrarEquipoActionPerformed

    private void tblEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEquiposMouseClicked
        int pos = tblEquipos.getSelectedRow();
        if (pos == -1) return;
        int idProyecto = Integer.parseInt(tblEquipos.getValueAt(pos, 0).toString());
          
        txtIdEquipo.setText(tblEquipos.getValueAt(pos, 0).toString());
        txtNombreEquipo.setText(tblEquipos.getValueAt(pos, 1).toString());
        txtCiudadOrigen.setText(tblEquipos.getValueAt(pos, 2).toString());
        
        objListaPartido.Listar(tblPartidos);
    }//GEN-LAST:event_tblEquiposMouseClicked

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        txtIdEquipo.setText("");
        txtNombreEquipo.setText("");
        txtCiudadOrigen.setText("");
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    private void btnEditarNombreEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarNombreEquipoActionPerformed
        int pos = tblEquipos.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una Equipo a editar");
            return;
        }
        int idEquipoEditar = Integer.parseInt(tblEquipos.getValueAt(pos, 0).toString());
        
        try {
            String nombreEquipo = txtNombreEquipo.getText();
            
            objListaEquipos.EditarNombreEquipo(idEquipoEditar, nombreEquipo);
            objListaEquipos.Listar(tblEquipos);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEditarNombreEquipoActionPerformed

    private void btnRegistrarPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPartidoActionPerformed
        try {
            int idPartido = Integer.parseInt(txtIdPartido.getText());
            int idEquipoLocal  = Integer.parseInt(cboEquipoLocal.getSelectedItem().toString());
            int idEquipoVisitante = Integer.parseInt(cboEquipoVisitante.getSelectedItem().toString());
            int golesLocal = Integer.parseInt(txtGolesLocal.getText());
            int golesVisitante = Integer.parseInt(txtGolesVistitante.getText());
            
            if (idEquipoLocal == idEquipoVisitante) {
                JOptionPane.showMessageDialog(rootPane, "Dos equipos no se pueden enfrentar entre si");
                return;
            }
            Partido elemento = new Partido(idPartido,idEquipoLocal,idEquipoVisitante,golesLocal,golesVisitante);
            if (!objListaPartido.Agregar(elemento,objListaEquipos)) return;
            objListaPartido.Listar(tblPartidos);
            objListaEquipos.Listar(tblEquipos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnRegistrarPartidoActionPerformed

    private void btnEliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEquipoActionPerformed
        int pos = tblEquipos.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un Equipo a eliminar");
            return;
        }
        
        int idEquipoEliminar = Integer.parseInt(tblEquipos.getValueAt(pos, 0).toString());
        
        objListaEquipos.Eliminar(idEquipoEliminar);
        objListaEquipos.Listar(tblEquipos);
        CargarCombo();
    }//GEN-LAST:event_btnEliminarEquipoActionPerformed

    private void btnVerPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPartidosActionPerformed
        int idEquipo = Integer.parseInt(txtHistorialPartidos.getText());
        objListaPartido.ListarPorIdEquipo(tblPartidos, idEquipo);
    }//GEN-LAST:event_btnVerPartidosActionPerformed


    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(() -> new JFramePrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarNombreEquipo;
    private javax.swing.JButton btnEliminarEquipo;
    private javax.swing.JButton btnLimpiarCampos;
    private javax.swing.JButton btnRegistrarEquipo;
    private javax.swing.JButton btnRegistrarPartido;
    private javax.swing.JButton btnVerPartidos;
    private javax.swing.JComboBox<String> cboEquipoLocal;
    private javax.swing.JComboBox<String> cboEquipoVisitante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEquipos;
    private javax.swing.JTable tblPartidos;
    private javax.swing.JTextField txtCiudadOrigen;
    private javax.swing.JTextField txtGolesLocal;
    private javax.swing.JTextField txtGolesVistitante;
    private javax.swing.JTextField txtHistorialPartidos;
    private javax.swing.JTextField txtIdEquipo;
    private javax.swing.JTextField txtIdPartido;
    private javax.swing.JTextField txtNombreEquipo;
    // End of variables declaration//GEN-END:variables

}
