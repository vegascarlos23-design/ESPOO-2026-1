package Vista;

import Control.AnalizadorSentimientos;

public class JFramePrincipal extends javax.swing.JFrame {

    private AnalizadorSentimientos objSentimientos = new AnalizadorSentimientos();
    
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
        MenuTemas = new javax.swing.JMenuItem();
        MenuPalabras = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuAnalizador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mantenimiento");

        MenuUsuarios.setText("Usuarios");
        MenuUsuarios.addActionListener(this::MenuUsuariosActionPerformed);
        jMenu2.add(MenuUsuarios);

        MenuTemas.setText("Temas");
        MenuTemas.addActionListener(this::MenuTemasActionPerformed);
        jMenu2.add(MenuTemas);

        MenuPalabras.setText("Palabras");
        MenuPalabras.addActionListener(this::MenuPalabrasActionPerformed);
        jMenu2.add(MenuPalabras);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Operaciones");

        MenuAnalizador.setText("Analizador de Emociones");
        MenuAnalizador.addActionListener(this::MenuAnalizadorActionPerformed);
        jMenu3.add(MenuAnalizador);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUsuariosActionPerformed
        JDialogUsuarios ventana = new JDialogUsuarios(this, true, objSentimientos);
        ventana.setVisible(true);
    }//GEN-LAST:event_MenuUsuariosActionPerformed

    private void MenuTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuTemasActionPerformed
        JDialogTemas ventana = new JDialogTemas(this, true, objSentimientos);
        ventana.setVisible(true);
    }//GEN-LAST:event_MenuTemasActionPerformed

    private void MenuPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPalabrasActionPerformed
        JDialogPalabras ventana = new JDialogPalabras(this, true, objSentimientos);
        ventana.setVisible(true);
    }//GEN-LAST:event_MenuPalabrasActionPerformed

    private void MenuAnalizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAnalizadorActionPerformed
        JDialogAnalisis ventana = new JDialogAnalisis(this, true, objSentimientos);
        ventana.setVisible(true);
    }//GEN-LAST:event_MenuAnalizadorActionPerformed


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
    private javax.swing.JMenuItem MenuAnalizador;
    private javax.swing.JMenuItem MenuPalabras;
    private javax.swing.JMenuItem MenuTemas;
    private javax.swing.JMenuItem MenuUsuarios;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

}
