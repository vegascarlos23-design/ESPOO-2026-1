package Vista;

import Acceso.GestorArchivos;
import Control.ArregloPabellon;
import Control.TreeEquipoBiomedico;
import Modelo.EquipoBiomedico;
import Modelo.Pabellon;
import java.util.StringTokenizer;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class JFramePrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFramePrincipal.class.getName());

    private ArregloPabellon objPabellon = new ArregloPabellon();
    private TreeEquipoBiomedico objTreeEquipo = new TreeEquipoBiomedico();
    
    public JFramePrincipal() {
        initComponents();
        objTreeEquipo.Listar(tblEquipos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoPabellon = new javax.swing.JTextField();
        btnCrearPabellon = new javax.swing.JButton();
        cboPabellon = new javax.swing.JComboBox<>();
        btnVaciarPabellon = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPisoPabellon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNumSerie = new javax.swing.JTextField();
        txtTipoEquipo = new javax.swing.JTextField();
        txtHorasUso = new javax.swing.JTextField();
        txtEstadoManteminento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEquipos = new javax.swing.JTable();
        btnRegistrarEquipo = new javax.swing.JButton();
        btnEditarEquipo = new javax.swing.JButton();
        btnEliminarEquipo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pabellon de Equipos Biomedicos"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pabellones"));

        jLabel1.setText("Codigo Pabellon");

        btnCrearPabellon.setText("Crear Pabellon");
        btnCrearPabellon.addActionListener(this::btnCrearPabellonActionPerformed);

        cboPabellon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboPabellon.addActionListener(this::cboPabellonActionPerformed);

        btnVaciarPabellon.setText("Vaciar Pabellon");
        btnVaciarPabellon.addActionListener(this::btnVaciarPabellonActionPerformed);

        jLabel6.setText("Pabellon");

        jLabel7.setText("Piso");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigoPabellon, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboPabellon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtPisoPabellon)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVaciarPabellon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearPabellon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoPabellon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearPabellon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPisoPabellon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboPabellon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVaciarPabellon)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Equipos Biomedicos"));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setText("Numero Serie");

        jLabel3.setText("Tipo Equipo");

        jLabel4.setText("Horas Uso");

        jLabel5.setText("Estado Mantenimiento");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumSerie))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtTipoEquipo))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtHorasUso))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtEstadoManteminento)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTipoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHorasUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEstadoManteminento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        btnRegistrarEquipo.setText("Registrar Equipo");
        btnRegistrarEquipo.addActionListener(this::btnRegistrarEquipoActionPerformed);

        btnEditarEquipo.setText("Editar Equipo");
        btnEditarEquipo.addActionListener(this::btnEditarEquipoActionPerformed);

        btnEliminarEquipo.setText("Eliminar Equipo");
        btnEliminarEquipo.addActionListener(this::btnEliminarEquipoActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditarEquipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrarEquipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRegistrarEquipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarEquipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarEquipo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnCrearPabellonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPabellonActionPerformed
        try {
            String codPabellon = txtCodigoPabellon.getText();
            int piso = Integer.parseInt(txtPisoPabellon.getText());
            
            Pabellon elemento = new Pabellon(codPabellon, piso);
            objPabellon.Agregar(elemento);
            objPabellon.Listar(cboPabellon);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        }
        
    }//GEN-LAST:event_btnCrearPabellonActionPerformed

    private void cboPabellonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPabellonActionPerformed
        String pabellon = cboPabellon.getSelectedItem().toString();
        StringTokenizer st = new StringTokenizer(pabellon, " - ");
        String codPabellon = st.nextToken();
        
        objTreeEquipo = objPabellon.getPabellon(codPabellon).getEquipos();
        objTreeEquipo.Listar(tblEquipos);
    }//GEN-LAST:event_cboPabellonActionPerformed

    private void btnVaciarPabellonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarPabellonActionPerformed
        JComboBox cboDestino = new JComboBox();
        objPabellon.Listar(cboDestino);
        
        Object[] msg = {
            "Pabellon destino: ", cboDestino
        };
        
        int rpta = JOptionPane.showConfirmDialog(rootPane, msg, "Transferencia de Equipos Biomedicos", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (rpta == JOptionPane.OK_OPTION) {
            String pabellonOrigen = cboPabellon.getSelectedItem().toString();
            String pabellonDestino = cboDestino.getSelectedItem().toString();
            StringTokenizer st = new StringTokenizer(pabellonDestino, " - ");
            StringTokenizer st1 = new StringTokenizer(pabellonOrigen, " - ");
            
            String destino = st.nextToken();
            String origen = st1.nextToken();
            
            if (destino.equalsIgnoreCase(origen)) {
                JOptionPane.showMessageDialog(rootPane, "Elija diferentes pabellones");
                return;
            }
            
            TreeEquipoBiomedico objTreeOrigen = objPabellon.getPabellon(origen).getEquipos();
            objTreeEquipo = objPabellon.getPabellon(destino).getEquipos();
            objTreeEquipo.TransferirEquipos(objTreeOrigen);
            objPabellon.Eliminar(origen);
            objPabellon.Listar(cboPabellon);
        }
    }//GEN-LAST:event_btnVaciarPabellonActionPerformed

    private void tblEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEquiposMouseClicked
        int pos = tblEquipos.getSelectedRow();
        if (pos == -1) return;

        txtNumSerie.setText(tblEquipos.getValueAt(pos, 0).toString());
        txtTipoEquipo.setText(tblEquipos.getValueAt(pos, 1).toString());
        txtHorasUso.setText(tblEquipos.getValueAt(pos, 2).toString());
        txtEstadoManteminento.setText(tblEquipos.getValueAt(pos, 3).toString());
    }//GEN-LAST:event_tblEquiposMouseClicked

    private void btnRegistrarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEquipoActionPerformed
        try {
            int numSerie = Integer.parseInt(txtNumSerie.getText());
            String tipoEquipo = txtTipoEquipo.getText();
            int horasUso = Integer.parseInt(txtHorasUso.getText());
            String estadoMantenimiento = txtEstadoManteminento.getText();
            
            EquipoBiomedico elemento = new EquipoBiomedico(numSerie, tipoEquipo, horasUso, estadoMantenimiento);
            objTreeEquipo.Agregar(elemento);
            objTreeEquipo.Listar(tblEquipos);
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        }
    }//GEN-LAST:event_btnRegistrarEquipoActionPerformed

    private void btnEditarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEquipoActionPerformed
        int pos = tblEquipos.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un Equipo a Editar");
            return;
        }
        
        int numSerieAnt = Integer.parseInt(tblEquipos.getValueAt(pos, 0).toString());
        int numSerie = Integer.parseInt(txtNumSerie.getText());
        String tipoEquipo = txtTipoEquipo.getText();
        int horasUso = Integer.parseInt(txtHorasUso.getText());
        String estadoMantenimiento = txtEstadoManteminento.getText();
            
        EquipoBiomedico elemento = new EquipoBiomedico(numSerie, tipoEquipo, horasUso, estadoMantenimiento);
        objTreeEquipo.Editar(elemento, numSerieAnt);
        objTreeEquipo.Listar(tblEquipos);
        
        
    }//GEN-LAST:event_btnEditarEquipoActionPerformed

    private void btnEliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEquipoActionPerformed
        int pos = tblEquipos.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un Equipo a Eliminar");
            return;
        }
        
        int numSerie = Integer.parseInt(tblEquipos.getValueAt(pos, 0).toString());
        objTreeEquipo.Eliminar(numSerie);
        objTreeEquipo.Listar(tblEquipos);
    }//GEN-LAST:event_btnEliminarEquipoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        GestorArchivos.GuardarArchivos(objPabellon.getArreglo());
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        GestorArchivos.CargarArchivos(objPabellon);
        objPabellon.Listar(cboPabellon);
    }//GEN-LAST:event_formWindowOpened


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
    private javax.swing.JButton btnCrearPabellon;
    private javax.swing.JButton btnEditarEquipo;
    private javax.swing.JButton btnEliminarEquipo;
    private javax.swing.JButton btnRegistrarEquipo;
    private javax.swing.JButton btnVaciarPabellon;
    private javax.swing.JComboBox<String> cboPabellon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEquipos;
    private javax.swing.JTextField txtCodigoPabellon;
    private javax.swing.JTextField txtEstadoManteminento;
    private javax.swing.JTextField txtHorasUso;
    private javax.swing.JTextField txtNumSerie;
    private javax.swing.JTextField txtPisoPabellon;
    private javax.swing.JTextField txtTipoEquipo;
    // End of variables declaration//GEN-END:variables

}
