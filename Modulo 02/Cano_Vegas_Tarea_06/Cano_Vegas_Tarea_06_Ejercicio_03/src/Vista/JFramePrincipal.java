package Vista;

import Control.ListaCentrosComerciales;
import Control.ListaTiendas;
import Control.ListaVentasDiarias;
import Control.NodoTienda;
import Modelo.CentroComercial;
import Modelo.Tienda;
import Modelo.VentaDiaria;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;


public class JFramePrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFramePrincipal.class.getName());
    
    ListaCentrosComerciales objListaCentros = new ListaCentrosComerciales();
    ListaTiendas objListaTiendas = new ListaTiendas();
    ListaVentasDiarias objVentas = new ListaVentasDiarias();
    
    private NodoTienda navTienda = null;
    
    private void modelSpn() {
        JSpinner.DateEditor editor = new JSpinner.DateEditor(spnFechaVenta, "yyyy/MM/dd");       

        spnFechaVenta.setEditor(editor);
    }
    
    public void MostrarTienda(NodoTienda nodo) {
        if (nodo == null) return;
        Tienda p = nodo.getElemento();
        txtRubroTienda.setText(p.getRubro());
        txtLocalTienda.setText(p.getLocal());
        cboCentro.setSelectedItem(p.getIdCentro());
    }
    
    public void MostrarCombos() {
        objListaCentros.CargarCombos(cboCentro);
        objListaTiendas.CargarCombos(cboTienda);
    }
    
    public void listarTablas() {
        objListaCentros.Listar(tblCentros);
        objListaTiendas.Listar(tblTiendas);
        objVentas.Listar(tblVentas);
    }
    
    public JFramePrincipal() {
        initComponents();
        modelSpn();
        MostrarCombos();
        listarTablas();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCentros = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTiendas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreCentro = new javax.swing.JTextField();
        txtCiudadCentro = new javax.swing.JTextField();
        btnRegistrarCentro = new javax.swing.JButton();
        btnEliminarCentro = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtRubroTienda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboCentro = new javax.swing.JComboBox<>();
        btnRegistrarTienda = new javax.swing.JButton();
        btnAnteriorTienda = new javax.swing.JButton();
        btnSiguienteTienda = new javax.swing.JButton();
        btnLimpiarCampos = new javax.swing.JButton();
        txtLocalTienda = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        spnFechaVenta = new javax.swing.JSpinner();
        txtMontoVenta = new javax.swing.JTextField();
        cboTienda = new javax.swing.JComboBox<>();
        btnRegistrarVenta = new javax.swing.JButton();
        btnEliminarVenta = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblCentros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblCentros);

        tblTiendas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTiendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTiendasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTiendas);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Nombre");

        jLabel2.setText("Ciudad");

        btnRegistrarCentro.setText("Registrar Centro");
        btnRegistrarCentro.addActionListener(this::btnRegistrarCentroActionPerformed);

        btnEliminarCentro.setText("Eliminar Centro");
        btnEliminarCentro.addActionListener(this::btnEliminarCentroActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreCentro))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtCiudadCentro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarCentro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCiudadCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCentro))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setText("Rubro");

        jLabel4.setText("Local");

        jLabel6.setText("Centro Comercial");

        cboCentro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnRegistrarTienda.setText("Registrar Prestamo");
        btnRegistrarTienda.addActionListener(this::btnRegistrarTiendaActionPerformed);

        btnAnteriorTienda.setText("Anterior");
        btnAnteriorTienda.addActionListener(this::btnAnteriorTiendaActionPerformed);

        btnSiguienteTienda.setText("Siguiente");
        btnSiguienteTienda.addActionListener(this::btnSiguienteTiendaActionPerformed);

        btnLimpiarCampos.setText("Limpiar Campos");
        btnLimpiarCampos.addActionListener(this::btnLimpiarCamposActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(cboCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRubroTienda)
                                    .addComponent(txtLocalTienda))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrarTienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiarCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAnteriorTienda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSiguienteTienda)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRubroTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarTienda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnLimpiarCampos)
                    .addComponent(txtLocalTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnteriorTienda)
                    .addComponent(btnSiguienteTienda))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel8.setText("Fecha");

        jLabel9.setText("Monto");

        jLabel10.setText("Tienda");

        spnFechaVenta.setModel(new javax.swing.SpinnerDateModel());

        cboTienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnRegistrarVenta.setText("Registrar Venta");
        btnRegistrarVenta.addActionListener(this::btnRegistrarVentaActionPerformed);

        btnEliminarVenta.setText("Eliminar Venta");
        btnEliminarVenta.addActionListener(this::btnEliminarVentaActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(spnFechaVenta))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtMontoVenta))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(cboTienda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(spnFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMontoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cboTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblVentas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnRegistrarCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCentroActionPerformed
        try {
            String nombre = txtNombreCentro.getText();
            String ciudad = txtCiudadCentro.getText();
            
            CentroComercial elemento = new CentroComercial(nombre, ciudad);
            objListaCentros.Registrar(elemento);
            listarTablas();
            MostrarCombos();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnRegistrarCentroActionPerformed

    private void btnEliminarCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCentroActionPerformed
        int pos = tblCentros.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un Centro Comercial a Eliminar");
            return;
        }
        
        int idCentroEliminar = Integer.parseInt(tblCentros.getValueAt(pos, 0).toString());
        int idTiendaElminar = Integer.parseInt(tblTiendas.getValueAt(pos, 0).toString());
        objListaCentros.Eliminar(idCentroEliminar);
        objListaTiendas.EliminarPorCentro(idCentroEliminar, objListaCentros);
        objVentas.EliminarPorTienda(idTiendaElminar, objListaTiendas);
        listarTablas();
        MostrarCombos();
    }//GEN-LAST:event_btnEliminarCentroActionPerformed

    private void btnRegistrarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarTiendaActionPerformed
        try {
            String rubro = txtRubroTienda.getText();
            String local = txtLocalTienda.getText();
            int idCentro = Integer.parseInt(cboCentro.getSelectedItem().toString());
            
            Tienda elemento = new Tienda(rubro, local, idCentro);
            objListaTiendas.Registrar(elemento, objListaCentros);
            listarTablas();
            MostrarCombos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnRegistrarTiendaActionPerformed

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        txtRubroTienda.setText("");
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    private void btnAnteriorTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorTiendaActionPerformed
        if (objListaTiendas.getHead() == null) return;

        if (navTienda == null) {
            navTienda = objListaTiendas.getEnd();
        } else {
            navTienda = navTienda.getPre();
        }

        MostrarTienda(navTienda);
    
    }//GEN-LAST:event_btnAnteriorTiendaActionPerformed

    private void btnSiguienteTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteTiendaActionPerformed
        if (objListaTiendas.getHead() == null) return;

        if (navTienda == null) {
            navTienda = objListaTiendas.getHead();
        } else {
            navTienda = navTienda.getNxt();
        }

        MostrarTienda(navTienda);
    }//GEN-LAST:event_btnSiguienteTiendaActionPerformed

    private void tblTiendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTiendasMouseClicked
        int pos = tblTiendas.getSelectedRow();
        
        if (pos == -1) return;
        
        navTienda = objListaTiendas.getNodoPorFila(pos);

        MostrarTienda(navTienda);
        
    }//GEN-LAST:event_tblTiendasMouseClicked

    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
        try {
            Date fecha = (Date)spnFechaVenta.getValue();
            double monto = Double.parseDouble(txtMontoVenta.getText());
            int idTienda = Integer.parseInt(cboTienda.getSelectedItem().toString());
            
            VentaDiaria elemento = new VentaDiaria(fecha, monto, idTienda);
            objVentas.Registrar(elemento, objListaTiendas);
            listarTablas();
            MostrarCombos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    private void btnEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentaActionPerformed
        int pos = tblVentas.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una Venta a Eliminar");
            return;
        }
        
        int codVenta = Integer.parseInt(tblVentas.getValueAt(pos, 0).toString());
        objVentas.Eliminar(codVenta, objListaTiendas);
        
        listarTablas();
    }//GEN-LAST:event_btnEliminarVentaActionPerformed

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
    private javax.swing.JButton btnAnteriorTienda;
    private javax.swing.JButton btnEliminarCentro;
    private javax.swing.JButton btnEliminarVenta;
    private javax.swing.JButton btnLimpiarCampos;
    private javax.swing.JButton btnRegistrarCentro;
    private javax.swing.JButton btnRegistrarTienda;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JButton btnSiguienteTienda;
    private javax.swing.JComboBox<String> cboCentro;
    private javax.swing.JComboBox<String> cboTienda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner spnFechaVenta;
    private javax.swing.JTable tblCentros;
    private javax.swing.JTable tblTiendas;
    private javax.swing.JTable tblVentas;
    private javax.swing.JTextField txtCiudadCentro;
    private javax.swing.JTextField txtLocalTienda;
    private javax.swing.JTextField txtMontoVenta;
    private javax.swing.JTextField txtNombreCentro;
    private javax.swing.JTextField txtRubroTienda;
    // End of variables declaration//GEN-END:variables

}
