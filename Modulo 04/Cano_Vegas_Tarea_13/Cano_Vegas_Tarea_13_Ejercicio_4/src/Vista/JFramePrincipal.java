package Vista;

import Control.Streaming;

public class JFramePrincipal extends javax.swing.JFrame {

    private Streaming objStreaming = new Streaming();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFramePrincipal.class.getName());

    public JFramePrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        MenuUsuarios = new javax.swing.JMenuItem();
        MenuPeliculas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuInteracciones = new javax.swing.JMenuItem();
        MenuRecomendaciones = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mantenimiento");

        MenuUsuarios.setText("Usuarios");
        MenuUsuarios.addActionListener(this::MenuUsuariosActionPerformed);
        jMenu2.add(MenuUsuarios);

        MenuPeliculas.setText("Peliculas");
        MenuPeliculas.addActionListener(this::MenuPeliculasActionPerformed);
        jMenu2.add(MenuPeliculas);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Adicionales");

        jMenuItem2.setText("Actores");
        jMenuItem2.addActionListener(this::jMenuItem2ActionPerformed);
        jMenu4.add(jMenuItem2);

        jMenuItem1.setText("Asignar Generos Fav.");
        jMenuItem1.addActionListener(this::jMenuItem1ActionPerformed);
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Operaciones");

        MenuInteracciones.setText("Interacciones");
        MenuInteracciones.addActionListener(this::MenuInteraccionesActionPerformed);
        jMenu3.add(MenuInteracciones);

        MenuRecomendaciones.setText("Recomendaciones");
        MenuRecomendaciones.addActionListener(this::MenuRecomendacionesActionPerformed);
        jMenu3.add(MenuRecomendaciones);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUsuariosActionPerformed
        JDialogUsuario ventana = new JDialogUsuario(this, true, objStreaming);
        ventana.setVisible(true);
    }//GEN-LAST:event_MenuUsuariosActionPerformed

    private void MenuPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPeliculasActionPerformed
        JDialogPelicula ventana = new JDialogPelicula(this, true, objStreaming);
        ventana.setVisible(true);
    }//GEN-LAST:event_MenuPeliculasActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JDialogActores ventana = new JDialogActores(this, true, objStreaming);
        ventana.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JDialogAsignarFav ventana = new JDialogAsignarFav(this, true, objStreaming);
        ventana.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MenuInteraccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuInteraccionesActionPerformed
        JDialogInteracciones ventana = new JDialogInteracciones(this, true, objStreaming);
        ventana.setVisible(true);
    }//GEN-LAST:event_MenuInteraccionesActionPerformed

    private void MenuRecomendacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRecomendacionesActionPerformed
        JDialogRecomendaciones ventana = new JDialogRecomendaciones(this, true, objStreaming);
        ventana.setVisible(true);
    }//GEN-LAST:event_MenuRecomendacionesActionPerformed


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
    private javax.swing.JMenuItem MenuInteracciones;
    private javax.swing.JMenuItem MenuPeliculas;
    private javax.swing.JMenuItem MenuRecomendaciones;
    private javax.swing.JMenuItem MenuUsuarios;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables

}
