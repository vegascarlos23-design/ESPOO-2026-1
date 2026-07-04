package Vista;

import Control.Delivery;


public class JFramePrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFramePrincipal.class.getName());

    private Delivery objDelivery = new Delivery();
    
    public JFramePrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        MenuPedidos = new javax.swing.JMenuItem();
        MenuRepartidores = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuAsignar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mantenimiento");

        MenuPedidos.setText("Pedidos");
        MenuPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuPedidosMouseClicked(evt);
            }
        });
        MenuPedidos.addActionListener(this::MenuPedidosActionPerformed);
        jMenu2.add(MenuPedidos);

        MenuRepartidores.setText("Repartidores");
        MenuRepartidores.addActionListener(this::MenuRepartidoresActionPerformed);
        jMenu2.add(MenuRepartidores);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Operaciones");

        MenuAsignar.setText("Asignar Pedidos");
        MenuAsignar.addActionListener(this::MenuAsignarActionPerformed);
        jMenu3.add(MenuAsignar);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuPedidosMouseClicked
        
    }//GEN-LAST:event_MenuPedidosMouseClicked

    private void MenuPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPedidosActionPerformed
        JDialogPedido ventana = new JDialogPedido(this, true, objDelivery);         
        ventana.setVisible(true);
    }//GEN-LAST:event_MenuPedidosActionPerformed

    private void MenuRepartidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRepartidoresActionPerformed
        JDialogRepartidor ventana = new JDialogRepartidor(this, true, objDelivery);
        ventana.setVisible(true);
    }//GEN-LAST:event_MenuRepartidoresActionPerformed

    private void MenuAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAsignarActionPerformed
        JDialogAsignaciones ventana = new JDialogAsignaciones(this, true, objDelivery);
        ventana.setVisible(true);
    }//GEN-LAST:event_MenuAsignarActionPerformed

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
    private javax.swing.JMenuItem MenuAsignar;
    private javax.swing.JMenuItem MenuPedidos;
    private javax.swing.JMenuItem MenuRepartidores;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

}
