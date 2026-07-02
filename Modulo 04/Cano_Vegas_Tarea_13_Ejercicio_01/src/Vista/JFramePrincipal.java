package Vista;

import Control.Dispositivos;
import Modelo.Dispositivo;
import java.awt.Color;
import javax.swing.JOptionPane;


public class JFramePrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFramePrincipal.class.getName());

    private Dispositivos objDispositivos = new Dispositivos();

    public JFramePrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdDispositivo = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtConsumo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEditarConsumo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDispositivos = new javax.swing.JTable();
        btnBuscarID = new javax.swing.JButton();
        txtBuscarId = new javax.swing.JTextField();
        btnVerEncendidos = new javax.swing.JButton();
        btnVerConsumoMayorX = new javax.swing.JButton();
        txtConsumoX = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAlternarEstado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestor Dispositivos"));

        jLabel1.setText("ID Dispositivo");

        jLabel2.setText("TIpo Dispositivo");

        jLabel3.setText("Consumo (Watios)");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);

        btnEditarConsumo.setText("Editar Consumo");
        btnEditarConsumo.addActionListener(this::btnEditarConsumoActionPerformed);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdDispositivo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtTipo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarConsumo, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdDispositivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarConsumo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblDispositivos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDispositivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDispositivosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDispositivos);

        btnBuscarID.setText("Buscar Por ID");
        btnBuscarID.addActionListener(this::btnBuscarIDActionPerformed);

        btnVerEncendidos.setText("Ver Encendidos");
        btnVerEncendidos.addActionListener(this::btnVerEncendidosActionPerformed);

        btnVerConsumoMayorX.setText("Ver mayores a (W)");
        btnVerConsumoMayorX.addActionListener(this::btnVerConsumoMayorXActionPerformed);

        jLabel4.setText("ID");

        jLabel5.setText("Consumo");

        btnAlternarEstado.setText("Alternar Estado");
        btnAlternarEstado.addActionListener(this::btnAlternarEstadoActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVerEncendidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerConsumoMayorX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscarId))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConsumoX))
                            .addComponent(btnAlternarEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAlternarEstado)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerEncendidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerConsumoMayorX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConsumoX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            String id = txtIdDispositivo.getText();
            String tipo = txtTipo.getText();
            double consumo = Double.parseDouble(txtConsumo.getText());
            
            Dispositivo elemento = new Dispositivo(id, tipo, consumo);
            objDispositivos.AgregarDispositivo(elemento);
            objDispositivos.ListarDipositivos(tblDispositivos);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Escriba datos validos");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarConsumoActionPerformed
        int pos = tblDispositivos.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un Dispositivo");
            return;
        }
        
        String id = tblDispositivos.getValueAt(pos, 0).toString();
        double consumo = Double.parseDouble(txtConsumo.getText());
        
        objDispositivos.EditarConsumo(id, consumo);
        objDispositivos.ListarDipositivos(tblDispositivos);
    }//GEN-LAST:event_btnEditarConsumoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int pos = tblDispositivos.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un Dispositivo a Eliminar");
            return;
        }
        
        String id = tblDispositivos.getValueAt(pos, 0).toString();
        objDispositivos.EliminarDispositivo(id);
        objDispositivos.ListarDipositivos(tblDispositivos);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblDispositivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDispositivosMouseClicked
        int pos = tblDispositivos.getSelectedRow();
        if (pos == -1) return;
        
        txtIdDispositivo.setText(tblDispositivos.getValueAt(pos, 0).toString());
        txtTipo.setText(tblDispositivos.getValueAt(pos, 1).toString());
        txtConsumo.setText(tblDispositivos.getValueAt(pos, 3).toString());        
    }//GEN-LAST:event_tblDispositivosMouseClicked

    private void btnBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIDActionPerformed
        String idBuscar = txtBuscarId.getText();
        String msg = objDispositivos.BuscarDispositivoId(idBuscar);
        if (msg == null) {
            JOptionPane.showMessageDialog(rootPane, "No se encontro un Dispositivo");
            return;
        }
        JOptionPane.showMessageDialog(rootPane, msg, "Dispositivo Encontrado",JOptionPane.PLAIN_MESSAGE);        
    }//GEN-LAST:event_btnBuscarIDActionPerformed

    private void btnVerEncendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEncendidosActionPerformed
        objDispositivos.FiltroEncendidos(tblDispositivos);
    }//GEN-LAST:event_btnVerEncendidosActionPerformed

    private void btnVerConsumoMayorXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerConsumoMayorXActionPerformed
        double consumoX = Double.parseDouble(txtConsumoX.getText());
        objDispositivos.FiltroWatios(tblDispositivos, consumoX);
    }//GEN-LAST:event_btnVerConsumoMayorXActionPerformed

    private void btnAlternarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlternarEstadoActionPerformed
        int pos = tblDispositivos.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un Dispositivo");
            return;
        }
        String id = tblDispositivos.getValueAt(pos, 0).toString();
        objDispositivos.CambiarEstadoDispotivo(id);
        objDispositivos.ListarDipositivos(tblDispositivos);
    }//GEN-LAST:event_btnAlternarEstadoActionPerformed


    public static void main(String args[]) {

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(() -> new JFramePrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAlternarEstado;
    private javax.swing.JButton btnBuscarID;
    private javax.swing.JButton btnEditarConsumo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVerConsumoMayorX;
    private javax.swing.JButton btnVerEncendidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDispositivos;
    private javax.swing.JTextField txtBuscarId;
    private javax.swing.JTextField txtConsumo;
    private javax.swing.JTextField txtConsumoX;
    private javax.swing.JTextField txtIdDispositivo;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

}
