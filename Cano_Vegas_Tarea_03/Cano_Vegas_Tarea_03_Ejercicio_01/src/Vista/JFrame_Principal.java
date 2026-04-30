package Vista;

import Control.Arreglo_Medicamento;
import Modelo.Medicamento;
import Vista.JDialog.JDialog_Medicamento;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JFrame_Principal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFrame_Principal.class.getName());
    Arreglo_Medicamento objArreglo_Medicamento = new Arreglo_Medicamento();
    Medicamento objMedicamento;

    public JFrame_Principal() {
        initComponents();
        while (true) {
            try {
                JTextField txt_Tam = new JTextField();
                Object[] msg = {
                    "Número de medicamentos: ", txt_Tam
                };

                int fl = JOptionPane.showConfirmDialog(rootPane, msg, "Número de medicamentos", ConfirmationCallback.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (fl == JOptionPane.OK_OPTION) {
                    int tam = Integer.parseInt(txt_Tam.getText());
                    objArreglo_Medicamento.setTamaño(tam);
                    break;
                } else {
                    System.exit(0);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese un número que sea válido.");
            }

        }
        txt_Reporte.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btn_RegistrarMedicamento = new javax.swing.JButton();
        btn_EditarMedicamento = new javax.swing.JButton();
        btn_EliminarMedicamento = new javax.swing.JButton();
        btn_BuscarMedicamento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DatosMedicamentos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_Reporte = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar medicamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        btn_RegistrarMedicamento.setText("Registrar medicamento");
        btn_RegistrarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarMedicamentoActionPerformed(evt);
            }
        });

        btn_EditarMedicamento.setText("Editar medicamento");
        btn_EditarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarMedicamentoActionPerformed(evt);
            }
        });

        btn_EliminarMedicamento.setText("Eliminar medicamento");
        btn_EliminarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarMedicamentoActionPerformed(evt);
            }
        });

        btn_BuscarMedicamento.setText("Buscar medicamento");
        btn_BuscarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarMedicamentoActionPerformed(evt);
            }
        });

        tbl_DatosMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_DatosMedicamentos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Productos con stock crítico (Menor a 10):");

        txt_Reporte.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_BuscarMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_EliminarMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_EditarMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_RegistrarMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_RegistrarMedicamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_EditarMedicamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_EliminarMedicamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_BuscarMedicamento))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Reporte)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarMedicamentoActionPerformed
        JDialog_Medicamento objDialog_Medicamento = new JDialog_Medicamento(this, true, objArreglo_Medicamento);
        objDialog_Medicamento.setLocationRelativeTo(this);
        objDialog_Medicamento.setVisible(true);

        objArreglo_Medicamento.Listar_Medicamento(tbl_DatosMedicamentos);
        objArreglo_Medicamento.StockCritico(txt_Reporte);
    }//GEN-LAST:event_btn_RegistrarMedicamentoActionPerformed

    private void btn_EditarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarMedicamentoActionPerformed
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del medicamento a editar: "));

        int fila = -1;
        for (int r = 0; r < tbl_DatosMedicamentos.getRowCount(); r++) {
            int codigoTabla = Integer.parseInt(tbl_DatosMedicamentos.getValueAt(r, 0).toString());
            if (codigoTabla == codigo) {
                fila = r;
                break;
            }
        }

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "No se encontró el medicamento.");
            return;
        }

        int codigo_medicamento = Integer.parseInt(tbl_DatosMedicamentos.getValueAt(fila, 0).toString());
        String nombreE = tbl_DatosMedicamentos.getValueAt(fila, 1).toString();
        String laboratorioE = tbl_DatosMedicamentos.getValueAt(fila, 2).toString();
        int stockE = Integer.parseInt(tbl_DatosMedicamentos.getValueAt(fila, 3).toString());
        double precioE = Double.parseDouble(tbl_DatosMedicamentos.getValueAt(fila, 4).toString());
        String fechaE = tbl_DatosMedicamentos.getValueAt(fila, 5).toString();

        JTextField txt_Nombre = new JTextField(nombreE);
        JTextField txt_Laboratorio = new JTextField(laboratorioE);
        JTextField txt_StockActual = new JTextField(String.valueOf(stockE));
        JTextField txt_PrecioUnitario = new JTextField(String.valueOf(precioE));
        JTextField txt_FechaVencimiento = new JTextField(fechaE);

        Object[] mensaje = {
            "Nuevo nombre: ", txt_Nombre,
            "Nuevo laboratorio: ", txt_Laboratorio,
            "Nuevo stock actual: ", txt_StockActual,
            "Nuevo precio unitario: ", txt_PrecioUnitario,
            "Nueva fecha de vencimiento: ", txt_FechaVencimiento
        };

        int opcion = JOptionPane.showConfirmDialog(rootPane, mensaje, "Edición de medicamento", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (opcion == JOptionPane.OK_OPTION) {
            try {
                String nombre = txt_Nombre.getText();
                String laboratorio = txt_Laboratorio.getText();
                int stock = Integer.parseInt(txt_StockActual.getText());
                double precio = Double.parseDouble(txt_PrecioUnitario.getText());
                String fecha = txt_FechaVencimiento.getText();

                objMedicamento = new Medicamento(codigo_medicamento, nombre, laboratorio, stock, precio, fecha);

                objArreglo_Medicamento.Editar_Medicamento(objMedicamento, codigo_medicamento);

                if (objMedicamento != null) {
                    JOptionPane.showMessageDialog(this, "El medicamento ha sido editado correctamente.");
                    objArreglo_Medicamento.OrdenarPorStockActual();
                    objArreglo_Medicamento.Listar_Medicamento(tbl_DatosMedicamentos);
                    objArreglo_Medicamento.StockCritico(txt_Reporte);
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró el medicamento.");
                }
            } catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(null, "Ingrese valores adecuados en cada campo.");
            }
        }
    }//GEN-LAST:event_btn_EditarMedicamentoActionPerformed

    private void btn_EliminarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarMedicamentoActionPerformed
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del medicamento a eliminar: "));

        int fila = -1;
        for (int r = 0; r < tbl_DatosMedicamentos.getRowCount(); r++) {
            int codigoTabla = Integer.parseInt(tbl_DatosMedicamentos.getValueAt(r, 0).toString());
            if (codigoTabla == codigo) {
                fila = r;
                break;
            }
        }

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "No se encontró el medicamento.");
            return;
        } else {
            objArreglo_Medicamento.Eliminar_Medicamento(codigo);
            objArreglo_Medicamento.OrdenarPorStockActual();
            objArreglo_Medicamento.Listar_Medicamento(tbl_DatosMedicamentos);
            objArreglo_Medicamento.StockCritico(txt_Reporte);
        }
    }//GEN-LAST:event_btn_EliminarMedicamentoActionPerformed

    private void btn_BuscarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarMedicamentoActionPerformed
        try {
            int codigoM = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del medicamento que desee buscar: "));
            Medicamento m = objArreglo_Medicamento.Buscar_Medicamento(codigoM);
            if (m != null) {
                JOptionPane.showMessageDialog(rootPane,
                        "- INFORMACIÓN DEL MEDICAMENTO -\nCódigo: " + m.getCodigo()
                        + "\nNombre: " + m.getNombre()
                        + "\nLaboratorio: " + m.getLaboratorio()
                        + "\nStock actual: " + m.getStock_actual()
                        + "\nPrecio unitario: " + m.getPrecio_unitario()
                        + "\nFecha de vencimiento: " + m.getFecha_vencimiento()
                        + "\nValor total de inventario: " + m.CalcularValorTotal()
                        + "\n----------");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el medicamento.");
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Error en la búsqueda.");
        }
    }//GEN-LAST:event_btn_BuscarMedicamentoActionPerformed

    /**
     * @param args the command line arguments
     */
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
    private javax.swing.JButton btn_BuscarMedicamento;
    private javax.swing.JButton btn_EditarMedicamento;
    private javax.swing.JButton btn_EliminarMedicamento;
    private javax.swing.JButton btn_RegistrarMedicamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_DatosMedicamentos;
    private javax.swing.JTextField txt_Reporte;
    // End of variables declaration//GEN-END:variables
}
