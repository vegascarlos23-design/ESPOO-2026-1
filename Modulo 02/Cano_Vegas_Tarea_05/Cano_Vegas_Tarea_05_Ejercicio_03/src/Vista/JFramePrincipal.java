package Vista;

import Control.ListaGastos;
import Control.ListaProyectos;
import Modelo.Gasto;
import Modelo.Proyecto;
import javax.swing.JOptionPane;


public class JFramePrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFramePrincipal.class.getName());
    private ListaProyectos objListaProyectos = new ListaProyectos();
    private ListaGastos objListaGastos = new ListaGastos();

    public JFramePrincipal() {
        initComponents();
        objListaProyectos.Listar(tblProyecto);
        objListaGastos.Listar(tblGasto,0);
        cboProyectos.removeAllItems();
    }
    
    private String verRegionCbo = "-1";

    private void CargarCombo(String item) {
        cboProyectos.addItem(item);       
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProyecto = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGasto = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdProyecto = new javax.swing.JTextField();
        txtNombreProyecto = new javax.swing.JTextField();
        txtPresupuestoMaximo = new javax.swing.JTextField();
        btnRegistrarProyecto = new javax.swing.JButton();
        btnEditarProyecto = new javax.swing.JButton();
        txtBuscarProyecto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnLimpiarCampos = new javax.swing.JButton();
        btnBuscarProyecto = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIdGasto = new javax.swing.JTextField();
        btnRegistrarGasto = new javax.swing.JButton();
        btnEliminarGasto = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cboProyectos = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtConcepto = new javax.swing.JTextField();
        txtMontoGasto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblProyecto.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProyectoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProyecto);

        tblGasto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblGasto);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("ID Proyecto");

        jLabel2.setText("Nombre del Proyecto");

        jLabel3.setText("Presupuesto Maximo");

        btnRegistrarProyecto.setText("Registrar");
        btnRegistrarProyecto.addActionListener(this::btnRegistrarProyectoActionPerformed);

        btnEditarProyecto.setText("Editar");
        btnEditarProyecto.addActionListener(this::btnEditarProyectoActionPerformed);

        jLabel6.setText("Buscar por ID");

        btnLimpiarCampos.setText("Limpiar campos");
        btnLimpiarCampos.addActionListener(this::btnLimpiarCamposActionPerformed);

        btnBuscarProyecto.setText("Buscar");
        btnBuscarProyecto.addActionListener(this::btnBuscarProyectoActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdProyecto))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarProyecto))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPresupuestoMaximo, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(txtNombreProyecto))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiarCampos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarProyecto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarProyecto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarProyecto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarProyecto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnEditarProyecto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPresupuestoMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnLimpiarCampos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnBuscarProyecto))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel8.setText("Id Gasto");

        jLabel10.setText("Monto del Gasto");

        btnRegistrarGasto.setText("Registrar");
        btnRegistrarGasto.addActionListener(this::btnRegistrarGastoActionPerformed);

        btnEliminarGasto.setText("Eliminar");
        btnEliminarGasto.addActionListener(this::btnEliminarGastoActionPerformed);

        jLabel11.setText("Proyecto");

        cboProyectos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Concepto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdGasto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(cboProyectos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtMontoGasto))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtConcepto)))
                        .addGap(3, 3, 3)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarGasto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarGasto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtIdGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarGasto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarGasto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMontoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cboProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 39, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProyectoActionPerformed
        try {
            int idProyecto = Integer.parseInt(txtIdProyecto.getText());
            String nombreProyecto = txtNombreProyecto.getText();
            double presupuestoMaximo = Double.parseDouble(txtPresupuestoMaximo.getText());
            
            Proyecto elemento = new Proyecto(idProyecto, nombreProyecto, presupuestoMaximo);
            if (!objListaProyectos.Agregar(elemento)) return;
            objListaProyectos.Listar(tblProyecto);
            CargarCombo(idProyecto+"");
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnRegistrarProyectoActionPerformed

    private void tblProyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProyectoMouseClicked
        int pos = tblProyecto.getSelectedRow();
        if (pos == -1) return;
        int idProyecto = Integer.parseInt(tblProyecto.getValueAt(pos, 0).toString());
          
        txtIdProyecto.setText(tblProyecto.getValueAt(pos, 0).toString());
        txtNombreProyecto.setText(tblProyecto.getValueAt(pos, 1).toString());
        txtPresupuestoMaximo.setText(tblProyecto.getValueAt(pos, 2).toString());
        
        objListaGastos.Listar(tblGasto,idProyecto);
    }//GEN-LAST:event_tblProyectoMouseClicked

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        txtIdProyecto.setText("");
        txtNombreProyecto.setText("");
        txtPresupuestoMaximo.setText("");
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    private void btnEditarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProyectoActionPerformed
        int pos = tblProyecto.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una Region a editar");
            return;
        }
        int idProyectoEditar = Integer.parseInt(tblProyecto.getValueAt(pos, 0).toString());
        
        try {
            double presupuestoMaximo = Double.parseDouble(txtPresupuestoMaximo.getText());
            
            objListaProyectos.editarPresupuesto(idProyectoEditar, presupuestoMaximo);
            objListaProyectos.Listar(tblProyecto);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEditarProyectoActionPerformed

    private void btnRegistrarGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarGastoActionPerformed
        try {
            int idGasto = Integer.parseInt(txtIdGasto.getText());
            String concepto = txtConcepto.getText();
            double montoGasto = Double.parseDouble(txtMontoGasto.getText());
            int idProyecto = Integer.parseInt(cboProyectos.getSelectedItem().toString());
            
            Gasto elemento = new Gasto(idGasto,idProyecto,concepto,montoGasto);
            objListaGastos.Agregar(elemento,objListaProyectos);
            objListaGastos.Listar(tblGasto,idProyecto);
            objListaProyectos.Listar(tblProyecto);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnRegistrarGastoActionPerformed

    private void btnEliminarGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarGastoActionPerformed
        int pos = tblGasto.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un habitante a eliminar");
            return;
        }
        int idProyecto = Integer.parseInt(tblProyecto.getValueAt(pos, 0).toString());
        int idGastoEliminar = Integer.parseInt(tblGasto.getValueAt(pos, 0).toString());
        objListaGastos.Eliminar(idGastoEliminar,objListaProyectos);
        objListaGastos.Listar(tblGasto,idProyecto);
        objListaProyectos.Listar(tblProyecto);
    }//GEN-LAST:event_btnEliminarGastoActionPerformed

    private void btnBuscarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProyectoActionPerformed
        try {
            int idBuscar = Integer.parseInt(txtBuscarProyecto.getText());
            objListaProyectos.ListarPorId(idBuscar, tblProyecto);
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_btnBuscarProyectoActionPerformed


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
    private javax.swing.JButton btnBuscarProyecto;
    private javax.swing.JButton btnEditarProyecto;
    private javax.swing.JButton btnEliminarGasto;
    private javax.swing.JButton btnLimpiarCampos;
    private javax.swing.JButton btnRegistrarGasto;
    private javax.swing.JButton btnRegistrarProyecto;
    private javax.swing.JComboBox<String> cboProyectos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblGasto;
    private javax.swing.JTable tblProyecto;
    private javax.swing.JTextField txtBuscarProyecto;
    private javax.swing.JTextField txtConcepto;
    private javax.swing.JTextField txtIdGasto;
    private javax.swing.JTextField txtIdProyecto;
    private javax.swing.JTextField txtMontoGasto;
    private javax.swing.JTextField txtNombreProyecto;
    private javax.swing.JTextField txtPresupuestoMaximo;
    // End of variables declaration//GEN-END:variables

}
