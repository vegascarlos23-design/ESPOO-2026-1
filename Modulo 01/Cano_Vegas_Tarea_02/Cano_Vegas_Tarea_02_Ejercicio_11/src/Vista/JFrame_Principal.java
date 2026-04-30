package Vista;

import Control.Arreglo_Computadoras;
import Modelo.Computadora;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JFrame_Principal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFrame_Principal.class.getName());
    Arreglo_Computadoras objArreglo_Computadoras = new Arreglo_Computadoras();

    public JFrame_Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_RegistrarComputadora = new javax.swing.JButton();
        btn_ActualizarPrecio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DatosComputadora = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar computadoras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 14))); // NOI18N

        btn_RegistrarComputadora.setText("Registrar computadora");
        btn_RegistrarComputadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarComputadoraActionPerformed(evt);
            }
        });

        btn_ActualizarPrecio.setText("Actualizar precio");
        btn_ActualizarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_RegistrarComputadora, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ActualizarPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_RegistrarComputadora, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(btn_ActualizarPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_DatosComputadora.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_DatosComputadora);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarComputadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarComputadoraActionPerformed
        JTextField txt_Codigo = new JTextField();
        JTextField txt_Modelo = new JTextField();
        JTextField txt_Marca = new JTextField();
        JTextField txt_Procesador = new JTextField();
        JTextField txt_MemoriaRAM = new JTextField();
        JTextField txt_PrecioAlquiler = new JTextField();
        
        Object[] mensaje = {
            "Código de equipo: ", txt_Codigo,
            "Modelo: ", txt_Modelo,
            "Marca: ", txt_Marca,
            "Procesador: ", txt_Procesador,
            "Memoria RAM: ", txt_MemoriaRAM,
            "Precio de alquiler: ", txt_PrecioAlquiler
        };
        
        int opcion = JOptionPane.showConfirmDialog(this, mensaje, "Registro de computadoras", JOptionPane.OK_CANCEL_OPTION);
        
        if(opcion == JOptionPane.OK_OPTION){
            try {
                String codigo = txt_Codigo.getText();
                String modelo = txt_Modelo.getText();
                String marca = txt_Marca.getText();
                String procesador = txt_Procesador.getText();
                String memoria_ram = txt_MemoriaRAM.getText();
                double precio_alquiler = Double.parseDouble(txt_PrecioAlquiler.getText());
                
                Computadora objComputadora = new Computadora(codigo, modelo, marca, procesador, memoria_ram, precio_alquiler);
                objArreglo_Computadoras.Registrar_Computadora(objComputadora);
                objArreglo_Computadoras.Listar_Computadoras(tbl_DatosComputadora);
            } catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(null, "Ingrese valores adecuados en cada campo.");
            }
        }
    }//GEN-LAST:event_btn_RegistrarComputadoraActionPerformed

    private void btn_ActualizarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarPrecioActionPerformed
        JTextField txt_MarcaActualizar = new JTextField();
        JTextField txt_NuevoPrecio = new JTextField();
        
        Object[] mensaje = {
            "Marca a actualizar: ", txt_MarcaActualizar,
            "Nuevo precio: ", txt_NuevoPrecio
        };
        
        int opcion = JOptionPane.showConfirmDialog(this, mensaje, "Registro de computadoras", JOptionPane.OK_CANCEL_OPTION);
        
        if(opcion == JOptionPane.OK_OPTION){
            try {
                String marca_actualizar = txt_MarcaActualizar.getText();
                double nuevo_precio = Double.parseDouble(txt_NuevoPrecio.getText());
                objArreglo_Computadoras.ActualizarPrecio(marca_actualizar, nuevo_precio);
                objArreglo_Computadoras.Listar_Computadoras(tbl_DatosComputadora);
                JOptionPane.showMessageDialog(null, "Se han actualizado los precios para la marca: " + marca_actualizar);
            } catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(null, "Ingrese valores adecuados en cada campo.");
            }
        }
    }//GEN-LAST:event_btn_ActualizarPrecioActionPerformed

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
    private javax.swing.JButton btn_ActualizarPrecio;
    private javax.swing.JButton btn_RegistrarComputadora;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_DatosComputadora;
    // End of variables declaration//GEN-END:variables
}
