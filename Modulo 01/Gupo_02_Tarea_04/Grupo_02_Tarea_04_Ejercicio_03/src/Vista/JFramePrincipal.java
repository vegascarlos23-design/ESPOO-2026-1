package Vista;

import Control.ArregloBiblioteca;
import Vista.JDialogs.JDialogLibro;
import Vista.JDialogs.JDialogPrestamo;
import Vista.JDialogs.JDialogSala;
import javax.swing.JOptionPane;

public class JFramePrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFramePrincipal.class.getName());

    ArregloBiblioteca objArregloBiblioteca = new ArregloBiblioteca();

    public JFramePrincipal() {
        initComponents();
        objArregloBiblioteca.ListarLibros(tblPrincipal);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnRegistrarLibro = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnRegistrarSala = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnRegistrarPrestamo = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btnCancelarPrestamo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrincipal = new javax.swing.JTable();
        btnVerLibros = new javax.swing.JButton();
        btnVerSalas = new javax.swing.JButton();
        btnVerPrestamos = new javax.swing.JButton();
        btnBuscarPrestamo = new javax.swing.JButton();
        txtBuscador = new javax.swing.JTextField();
        btnBuscarSala = new javax.swing.JButton();

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(870, 478));
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(27, 30, 56));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logo.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 145, 77));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema Bibliotecario");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(36, 40, 75));

        btnRegistrarLibro.setBackground(new java.awt.Color(36, 40, 75));
        btnRegistrarLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarLibro.setText("Registrar Libro");
        btnRegistrarLibro.setContentAreaFilled(false);
        btnRegistrarLibro.addActionListener(this::btnRegistrarLibroActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(36, 40, 75));

        btnRegistrarSala.setBackground(new java.awt.Color(36, 40, 75));
        btnRegistrarSala.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarSala.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarSala.setText("Registrar Sala");
        btnRegistrarSala.setContentAreaFilled(false);
        btnRegistrarSala.addActionListener(this::btnRegistrarSalaActionPerformed);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarSala, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(36, 40, 75));

        btnRegistrarPrestamo.setBackground(new java.awt.Color(36, 40, 75));
        btnRegistrarPrestamo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarPrestamo.setText("Registrar Préstamo");
        btnRegistrarPrestamo.setContentAreaFilled(false);
        btnRegistrarPrestamo.addActionListener(this::btnRegistrarPrestamoActionPerformed);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(36, 40, 75));

        btnCancelarPrestamo.setBackground(new java.awt.Color(36, 40, 75));
        btnCancelarPrestamo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelarPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarPrestamo.setText("Cancelar Préstamo");
        btnCancelarPrestamo.setContentAreaFilled(false);
        btnCancelarPrestamo.addActionListener(this::btnCancelarPrestamoActionPerformed);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(46, 46, 46))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(27, 30, 56));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        tblPrincipal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPrincipal);

        btnVerLibros.setText("Ver Libros");
        btnVerLibros.addActionListener(this::btnVerLibrosActionPerformed);

        btnVerSalas.setText("Ver Salas");
        btnVerSalas.addActionListener(this::btnVerSalasActionPerformed);

        btnVerPrestamos.setText("Ver Préstamos");
        btnVerPrestamos.addActionListener(this::btnVerPrestamosActionPerformed);

        btnBuscarPrestamo.setText("Buscar Prestamo Autor");
        btnBuscarPrestamo.addActionListener(this::btnBuscarPrestamoActionPerformed);

        txtBuscador.setBackground(new java.awt.Color(130, 130, 130));
        txtBuscador.setForeground(new java.awt.Color(0, 0, 0));

        btnBuscarSala.setText("Buscar Sala Id");
        btnBuscarSala.addActionListener(this::btnBuscarSalaActionPerformed);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(btnVerLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBuscarSala)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarPrestamo))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnVerSalas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerPrestamos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerLibros)
                    .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerSalas)
                    .addComponent(btnBuscarPrestamo)
                    .addComponent(btnBuscarSala))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerPrestamos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarLibroActionPerformed
        JDialogLibro objDialogLibro = new JDialogLibro(this, true, objArregloBiblioteca);
        objDialogLibro.setLocationRelativeTo(this);
        objDialogLibro.setVisible(true);
        objArregloBiblioteca.ListarLibros(tblPrincipal);
    }//GEN-LAST:event_btnRegistrarLibroActionPerformed

    private void btnRegistrarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSalaActionPerformed
        JDialogSala objDialogSala = new JDialogSala(this, true, objArregloBiblioteca);
        objDialogSala.setLocationRelativeTo(this);
        objDialogSala.setVisible(true);
        objArregloBiblioteca.ListarSalas(tblPrincipal);
    }//GEN-LAST:event_btnRegistrarSalaActionPerformed

    private void btnRegistrarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPrestamoActionPerformed
        JDialogPrestamo objDialogPrestamo = new JDialogPrestamo(this, true, objArregloBiblioteca);
        objDialogPrestamo.setLocationRelativeTo(this);
        objDialogPrestamo.setVisible(true);
        objArregloBiblioteca.ListarPrestamos(tblPrincipal);
    }//GEN-LAST:event_btnRegistrarPrestamoActionPerformed

    private void btnVerLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerLibrosActionPerformed
        objArregloBiblioteca.ListarLibros(tblPrincipal);
    }//GEN-LAST:event_btnVerLibrosActionPerformed

    private void btnVerSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSalasActionPerformed
        objArregloBiblioteca.ListarSalas(tblPrincipal);
    }//GEN-LAST:event_btnVerSalasActionPerformed

    private void btnVerPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPrestamosActionPerformed
        objArregloBiblioteca.ListarPrestamos(tblPrincipal);
    }//GEN-LAST:event_btnVerPrestamosActionPerformed

    private void btnBuscarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSalaActionPerformed
        try {
            String filtro = txtBuscador.getText();
            objArregloBiblioteca.ListarSalaFiltro(tblPrincipal, filtro);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos válidos");
        }

    }//GEN-LAST:event_btnBuscarSalaActionPerformed

    private void btnBuscarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPrestamoActionPerformed
        try {
            String filtro = txtBuscador.getText();
            objArregloBiblioteca.ListarPrestamosAutor(tblPrincipal, filtro);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos válidos");
        }

    }//GEN-LAST:event_btnBuscarPrestamoActionPerformed

    private void btnCancelarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPrestamoActionPerformed
        int pos = tblPrincipal.getSelectedRow();
        if (pos != -1) {
            String isbn = tblPrincipal.getValueAt(pos, 0).toString();
            String idLibro = tblPrincipal.getValueAt(pos, 1).toString();
            objArregloBiblioteca.CancelarPrestamo(isbn, idLibro);
            objArregloBiblioteca.ListarPrestamos(tblPrincipal);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un prestamo");
        }
    }//GEN-LAST:event_btnCancelarPrestamoActionPerformed

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
    private javax.swing.JButton btnBuscarPrestamo;
    private javax.swing.JButton btnBuscarSala;
    private javax.swing.JButton btnCancelarPrestamo;
    private javax.swing.JButton btnRegistrarLibro;
    private javax.swing.JButton btnRegistrarPrestamo;
    private javax.swing.JButton btnRegistrarSala;
    private javax.swing.JButton btnVerLibros;
    private javax.swing.JButton btnVerPrestamos;
    private javax.swing.JButton btnVerSalas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPrincipal;
    private javax.swing.JTextField txtBuscador;
    // End of variables declaration//GEN-END:variables

}
