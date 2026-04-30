package Vista;

import Control.ArregloControl;
import javax.swing.JOptionPane;

public class JFrame_Principal extends javax.swing.JFrame {
    private ArregloControl control;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFrame_Principal.class.getName());

    public JFrame_Principal() {
        initComponents();
        control = new ArregloControl();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_cerrar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        JDialog_proveedores = new javax.swing.JMenuItem();
        JDialog_componentes = new javax.swing.JMenuItem();
        JDialog_ordenes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Archivo");

        menu_cerrar.setText("Cerrar");
        menu_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cerrarActionPerformed(evt);
            }
        });
        jMenu1.add(menu_cerrar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Operaciones");

        JDialog_proveedores.setText("Proveedores");
        JDialog_proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDialog_proveedoresActionPerformed(evt);
            }
        });
        jMenu2.add(JDialog_proveedores);

        JDialog_componentes.setText("Componentes");
        JDialog_componentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDialog_componentesActionPerformed(evt);
            }
        });
        jMenu2.add(JDialog_componentes);

        JDialog_ordenes.setText("Ordenes");
        JDialog_ordenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDialog_ordenesActionPerformed(evt);
            }
        });
        jMenu2.add(JDialog_ordenes);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JDialog_proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDialog_proveedoresActionPerformed
        JDialog_Proveedor JDialog = new JDialog_Proveedor(this, true, control);
        JDialog.setVisible(true);
    }//GEN-LAST:event_JDialog_proveedoresActionPerformed

    private void JDialog_componentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDialog_componentesActionPerformed
        JDialog_Componente JDialog = new JDialog_Componente(this, true, control);
        JDialog.setVisible(true);
    }//GEN-LAST:event_JDialog_componentesActionPerformed

    private void JDialog_ordenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDialog_ordenesActionPerformed
        JDialog_Ordenes JDialog = new JDialog_Ordenes(this, true, control);
        JDialog.setVisible(true);
    }//GEN-LAST:event_JDialog_ordenesActionPerformed

    private void menu_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cerrarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro que quiere salir?",
                "Confirmar salida", JOptionPane.YES_NO_OPTION);
        
        if (opcion == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_menu_cerrarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new JFrame_Principal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JDialog_componentes;
    private javax.swing.JMenuItem JDialog_ordenes;
    private javax.swing.JMenuItem JDialog_proveedores;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menu_cerrar;
    // End of variables declaration//GEN-END:variables
}
