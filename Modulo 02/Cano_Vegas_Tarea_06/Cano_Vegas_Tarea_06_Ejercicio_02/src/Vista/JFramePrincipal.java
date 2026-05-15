package Vista;

import Control.ListaLibros;
import Control.ListaPrestamos;
import Control.NodoPrestamo;
import Modelo.Libro;
import Modelo.Prestamo;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;


public class JFramePrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFramePrincipal.class.getName());
    
    ListaLibros objListaLibros = new ListaLibros();
    ListaPrestamos objListaPrestamos = new ListaPrestamos();
    private NodoPrestamo navPrestamo = null;
    
    private void modelSpn() {
        JSpinner.DateEditor editor1 = new JSpinner.DateEditor(spnFechaDevolucion, "yyyy/MM/dd");
        JSpinner.DateEditor editor2 = new JSpinner.DateEditor(spnFechaSalido, "yyyy/MM/dd");

        spnFechaDevolucion.setEditor(editor1);
        spnFechaSalido.setEditor(editor2);
    }
    
    public void MostrarPrestamo(NodoPrestamo nodo) {
        if (nodo == null) return;
        Prestamo p = nodo.getElemento();
        txtNombreUsuario.setText(p.getNombreUsuario());
        spnFechaSalido.setValue(p.getFechaSalida());
        spnFechaDevolucion.setValue(p.getFechaDevolucion());
        cboLibro.setSelectedItem(p.getCodigoLibro());
    }
    
    public JFramePrincipal() {
        initComponents();
        modelSpn();
        objListaLibros.Listar(tblLibros);
        objListaPrestamos.Listar(tblPrestamos);
        objListaLibros.CargarCombos(cboLibro);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPrestamos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTituloLibro = new javax.swing.JTextField();
        txtAutorLibro = new javax.swing.JTextField();
        btnRegistrarLibro = new javax.swing.JButton();
        btnEliminarLibro = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        spnFechaSalido = new javax.swing.JSpinner();
        spnFechaDevolucion = new javax.swing.JSpinner();
        cboLibro = new javax.swing.JComboBox<>();
        btnRegistrarPrestamo = new javax.swing.JButton();
        btnEliminarPrestamo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtVerPrestamoUsuario = new javax.swing.JTextField();
        btnAnteriorPrestamo = new javax.swing.JButton();
        btnSiguientePrestamo = new javax.swing.JButton();
        btnLimpiarCampos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblLibros);

        tblPrestamos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPrestamosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPrestamos);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Titulo Libro");

        jLabel2.setText("Autor Libro");

        btnRegistrarLibro.setText("Registrar Libro");
        btnRegistrarLibro.addActionListener(this::btnRegistrarLibroActionPerformed);

        btnEliminarLibro.setText("Eliminar Libro");
        btnEliminarLibro.addActionListener(this::btnEliminarLibroActionPerformed);

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
                        .addComponent(txtTituloLibro))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtAutorLibro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarLibro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAutorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarLibro))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setText("Nombre Usuario");

        jLabel4.setText("Fecha Salida");

        jLabel5.setText("Fecha Devolucion");

        jLabel6.setText("Libro");

        spnFechaSalido.setModel(new javax.swing.SpinnerDateModel());

        spnFechaDevolucion.setModel(new javax.swing.SpinnerDateModel());

        cboLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnRegistrarPrestamo.setText("Registrar Prestamo");
        btnRegistrarPrestamo.addActionListener(this::btnRegistrarPrestamoActionPerformed);

        btnEliminarPrestamo.setText("Eliminar Prestamo");
        btnEliminarPrestamo.addActionListener(this::btnEliminarPrestamoActionPerformed);

        jLabel7.setText("Ver Prestamos del Usuario");

        txtVerPrestamoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVerPrestamoUsuarioKeyReleased(evt);
            }
        });

        btnAnteriorPrestamo.setText("Anterior");
        btnAnteriorPrestamo.addActionListener(this::btnAnteriorPrestamoActionPerformed);

        btnSiguientePrestamo.setText("Siguiente");
        btnSiguientePrestamo.addActionListener(this::btnSiguientePrestamoActionPerformed);

        btnLimpiarCampos.setText("Limpiar Campos");
        btnLimpiarCampos.addActionListener(this::btnLimpiarCamposActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVerPrestamoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNombreUsuario))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(spnFechaSalido, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboLibro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(spnFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRegistrarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLimpiarCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAnteriorPrestamo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSiguientePrestamo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarPrestamo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spnFechaSalido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarPrestamo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spnFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarCampos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnteriorPrestamo)
                    .addComponent(btnSiguientePrestamo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtVerPrestamoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnRegistrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarLibroActionPerformed
        try {
            String titulo = txtTituloLibro.getText();
            String autor = txtAutorLibro.getText();
            
            Libro elemento = new Libro(titulo, autor);
            objListaLibros.Registrar(elemento);
            objListaLibros.Listar(tblLibros);
            objListaLibros.CargarCombos(cboLibro);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnRegistrarLibroActionPerformed

    private void btnEliminarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLibroActionPerformed
        int pos = tblLibros.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un Libro a Eliminar");
            return;
        }
        
        int codigoLibroEliminar = Integer.parseInt(tblLibros.getValueAt(pos, 0).toString());
        objListaLibros.Eliminar(codigoLibroEliminar);
        objListaPrestamos.EliminarPorLibro(codigoLibroEliminar, objListaLibros);
        objListaLibros.Listar(tblLibros);
        objListaPrestamos.Listar(tblPrestamos);
        objListaLibros.CargarCombos(cboLibro);
    }//GEN-LAST:event_btnEliminarLibroActionPerformed

    private void btnRegistrarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPrestamoActionPerformed
        try {
            String nombreUsuario = txtNombreUsuario.getText();
            Date fechaSalida = (Date)spnFechaSalido.getValue();
            Date fechaDevolucion = (Date)spnFechaDevolucion.getValue();
            int codLibro = Integer.parseInt(cboLibro.getSelectedItem().toString());
            
            Prestamo elemento = new Prestamo(nombreUsuario, fechaSalida, fechaDevolucion, codLibro);
            objListaPrestamos.Registrar(elemento, objListaLibros);
            objListaPrestamos.Listar(tblPrestamos);
            objListaLibros.Listar(tblLibros);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnRegistrarPrestamoActionPerformed

    private void btnEliminarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPrestamoActionPerformed
        int pos = tblPrestamos.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un Prestamo a eliminar");
        }
        int idPrestamoEliminar = Integer.parseInt(tblPrestamos.getValueAt(pos, 0).toString());
        objListaPrestamos.Eliminar(idPrestamoEliminar, objListaLibros);
        objListaPrestamos.Listar(tblPrestamos);
        objListaLibros.Listar(tblLibros);
        
    }//GEN-LAST:event_btnEliminarPrestamoActionPerformed

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        txtNombreUsuario.setText("");
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    private void btnAnteriorPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorPrestamoActionPerformed
        if (objListaPrestamos.getHead() == null) return;

        if (navPrestamo == null) {
            navPrestamo = objListaPrestamos.getEnd();
        } else {
            navPrestamo = navPrestamo.getPre();
        }

        MostrarPrestamo(navPrestamo);
    
    }//GEN-LAST:event_btnAnteriorPrestamoActionPerformed

    private void btnSiguientePrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguientePrestamoActionPerformed
        if (objListaPrestamos.getHead() == null) return;

        if (navPrestamo == null) {
            navPrestamo = objListaPrestamos.getHead();
        } else {
            navPrestamo = navPrestamo.getNxt();
        }

        MostrarPrestamo(navPrestamo);
    }//GEN-LAST:event_btnSiguientePrestamoActionPerformed

    private void tblPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPrestamosMouseClicked
        int pos = tblPrestamos.getSelectedRow();
        
        if (pos == -1) return;
        
        navPrestamo = objListaPrestamos.getNodoPorFila(pos);

        MostrarPrestamo(navPrestamo);
        
    }//GEN-LAST:event_tblPrestamosMouseClicked

    private void txtVerPrestamoUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVerPrestamoUsuarioKeyReleased
        String nombreUsuario = txtVerPrestamoUsuario.getText();
        objListaPrestamos.ListarPorUsuario(tblPrestamos, nombreUsuario);
    }//GEN-LAST:event_txtVerPrestamoUsuarioKeyReleased


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
    private javax.swing.JButton btnAnteriorPrestamo;
    private javax.swing.JButton btnEliminarLibro;
    private javax.swing.JButton btnEliminarPrestamo;
    private javax.swing.JButton btnLimpiarCampos;
    private javax.swing.JButton btnRegistrarLibro;
    private javax.swing.JButton btnRegistrarPrestamo;
    private javax.swing.JButton btnSiguientePrestamo;
    private javax.swing.JComboBox<String> cboLibro;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spnFechaDevolucion;
    private javax.swing.JSpinner spnFechaSalido;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTable tblPrestamos;
    private javax.swing.JTextField txtAutorLibro;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtTituloLibro;
    private javax.swing.JTextField txtVerPrestamoUsuario;
    // End of variables declaration//GEN-END:variables

}
