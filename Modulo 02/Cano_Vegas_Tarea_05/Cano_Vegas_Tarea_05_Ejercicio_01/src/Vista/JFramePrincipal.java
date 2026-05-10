package Vista;

import Control.Lista_Cuenta;
import Control.Nodo_Cuenta;
import Modelo.Cuenta;
import Modelo.Transaccion;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

public class JFramePrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFramePrincipal.class.getName());

    private Lista_Cuenta objLista_Cuenta = new Lista_Cuenta();
    private Cuenta objListTransaccion = null;
    private Nodo_Cuenta Lsttemp = new Nodo_Cuenta(new Cuenta(-1, "", 0));

    public JFramePrincipal() {
        initComponents();
        JSpinner.DateEditor editor = new JSpinner.DateEditor(spnFecha, "dd/MM/yyyy");

        spnFecha.setEditor(editor);
        objLista_Cuenta.Listar(tblCuenta);
        Lsttemp.getElemento().Listar(tblTransaccion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Orden = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCuenta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNumCuentaC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSaldoInicial = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        cboTipoCuenta = new javax.swing.JComboBox<>();
        btnVerTodo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTransaccion = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtIdTransaccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMontoT = new javax.swing.JTextField();
        btnRegistrarT = new javax.swing.JButton();
        cboTipoT = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        rdbtnAsc = new javax.swing.JRadioButton();
        tdbtnDes = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        spnFecha = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblCuenta.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCuentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCuenta);

        jLabel1.setText("N° Cuenta");

        jLabel2.setText("Tipo de Cuenta");

        jLabel3.setText("Saldo Inicial");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        cboTipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ahorro", "Corriente" }));

        btnVerTodo.setText("Ver todo");
        btnVerTodo.addActionListener(this::btnVerTodoActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumCuentaC))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtSaldoInicial))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegistrar)
                        .addGap(50, 50, 50)
                        .addComponent(btnEliminar))
                    .addComponent(txtBuscar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVerTodo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboTipoCuenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNumCuentaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cboTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar)
                            .addComponent(btnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(btnVerTodo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblTransaccion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblTransaccion);

        jLabel4.setText("ID");

        jLabel5.setText("Tipo");

        jLabel6.setText("Monto");

        btnRegistrarT.setText("Registrar");
        btnRegistrarT.addActionListener(this::btnRegistrarTActionPerformed);

        cboTipoT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deposito", "Retiro" }));

        jLabel7.setText("Fecha");

        Orden.add(rdbtnAsc);
        rdbtnAsc.setSelected(true);
        rdbtnAsc.setText("Ascendente");
        rdbtnAsc.addActionListener(this::rdbtnAscActionPerformed);

        Orden.add(tdbtnDes);
        tdbtnDes.setText("Descendente");
        tdbtnDes.addActionListener(this::tdbtnDesActionPerformed);

        jLabel8.setText("Ordenar por Fecha:");

        spnFecha.setModel(new javax.swing.SpinnerDateModel());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMontoT, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addComponent(rdbtnAsc)
                            .addComponent(tdbtnDes)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtIdTransaccion))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(cboTipoT, 0, 159, Short.MAX_VALUE)))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(spnFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRegistrarT, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtIdTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cboTipoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtMontoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(spnFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbtnAsc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tdbtnDes)))
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
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            int numCuenta = Integer.parseInt(txtNumCuentaC.getText());
            String tipoCuenta = cboTipoCuenta.getSelectedItem().toString();
            double saldoInicial = Double.parseDouble(txtSaldoInicial.getText());

            Cuenta elemento = new Cuenta(numCuenta, tipoCuenta, saldoInicial);
            objLista_Cuenta.Agregar(elemento);
            objLista_Cuenta.Listar(tblCuenta);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRegistrarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarTActionPerformed
        try {
            int pos = tblCuenta.getSelectedRow();
            if (pos != -1) {
                int idT = Integer.parseInt(txtIdTransaccion.getText());
                int numCuenta = Integer.parseInt(tblCuenta.getValueAt(pos, 0).toString());
                String tipoT = cboTipoT.getSelectedItem().toString();
                double monto = Double.parseDouble(txtMontoT.getText());
                Date fecha = (Date) spnFecha.getValue();

                Transaccion elemento = new Transaccion(idT, numCuenta, tipoT, monto, fecha);
                objListTransaccion = objLista_Cuenta.getNodoPorId(numCuenta).getElemento();
                objListTransaccion.Agregar(elemento);
                int criterio = (rdbtnAsc.isSelected() ? 1 : 2);
                objListTransaccion.BubbleSort(criterio);
                objListTransaccion.Listar(tblTransaccion);
                objLista_Cuenta.Listar(tblCuenta);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Seleccione una cuenta");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnRegistrarTActionPerformed

    private void tblCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCuentaMouseClicked
        int pos = tblCuenta.getSelectedRow();
        if (pos != -1) {
            int numCuenta = Integer.parseInt(tblCuenta.getValueAt(pos, 0).toString());
            objListTransaccion = objLista_Cuenta.getNodoPorId(numCuenta).getElemento();
            objListTransaccion.Listar(tblTransaccion);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una cuenta");
        }
    }//GEN-LAST:event_tblCuentaMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int pos = tblCuenta.getSelectedRow();
        if (pos != -1) {
            int numCuenta = Integer.parseInt(tblCuenta.getValueAt(pos, 0).toString());
            if (objLista_Cuenta.Eliminar(numCuenta)) {
                objLista_Cuenta.Listar(tblCuenta);
                Lsttemp.getElemento().Listar(tblTransaccion);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una cuenta");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void rdbtnAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnAscActionPerformed
        int pos = tblCuenta.getSelectedRow();
        if (pos != -1) {
            int numCuenta = Integer.parseInt(tblCuenta.getValueAt(pos, 0).toString());
            objListTransaccion = objLista_Cuenta.getNodoPorId(numCuenta).getElemento();
            objListTransaccion.BubbleSort(1);
            objListTransaccion.Listar(tblTransaccion);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una cuenta");
        }
    }//GEN-LAST:event_rdbtnAscActionPerformed

    private void tdbtnDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdbtnDesActionPerformed
        int pos = tblCuenta.getSelectedRow();
        if (pos != -1) {
            int numCuenta = Integer.parseInt(tblCuenta.getValueAt(pos, 0).toString());
            objListTransaccion = objLista_Cuenta.getNodoPorId(numCuenta).getElemento();
            objListTransaccion.BubbleSort(2);
            objListTransaccion.Listar(tblTransaccion);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una cuenta");
        }
    }//GEN-LAST:event_tdbtnDesActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int numCuentaBuscar = Integer.parseInt(txtBuscar.getText());
        objLista_Cuenta.ListarBusqueda(tblCuenta, numCuentaBuscar);

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVerTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTodoActionPerformed
        objLista_Cuenta.Listar(tblCuenta);
    }//GEN-LAST:event_btnVerTodoActionPerformed

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
    private javax.swing.ButtonGroup Orden;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarT;
    private javax.swing.JButton btnVerTodo;
    private javax.swing.JComboBox<String> cboTipoCuenta;
    private javax.swing.JComboBox<String> cboTipoT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdbtnAsc;
    private javax.swing.JSpinner spnFecha;
    private javax.swing.JTable tblCuenta;
    private javax.swing.JTable tblTransaccion;
    private javax.swing.JRadioButton tdbtnDes;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtIdTransaccion;
    private javax.swing.JTextField txtMontoT;
    private javax.swing.JTextField txtNumCuentaC;
    private javax.swing.JTextField txtSaldoInicial;
    // End of variables declaration//GEN-END:variables

}
