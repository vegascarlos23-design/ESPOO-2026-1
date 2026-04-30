package Vista;

import Control.Arreglo_Repuesto;
import Modelo.Repuesto;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JFrame_Principal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFrame_Principal.class.getName());
    Arreglo_Repuesto objArreglo_Repuesto = new Arreglo_Repuesto();
    Repuesto objRepuesto;
    
    private void aplicarFiltroPorStock() {
        String texto = txt_FiltroStock.getText();
        if (!texto.isEmpty()) {
            try {
                int stock = Integer.parseInt(texto);
                String condicion = (String) cbo_FiltroStock.getSelectedItem();
                objArreglo_Repuesto.FiltrarPorStock(tbl_DatosRepuesto, stock, condicion);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese un stock válido.");
            }
        }
    }

    public JFrame_Principal() {
        initComponents();
        objArreglo_Repuesto.Listar_Repuesto(tbl_DatosRepuesto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_RegistrarRepuesto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DatosRepuesto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbo_FiltroMarca = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbo_FiltroStock = new javax.swing.JComboBox<>();
        txt_FiltroStock = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de repuestos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 14))); // NOI18N

        btn_RegistrarRepuesto.setText("Registrar repuesto");
        btn_RegistrarRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarRepuestoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_RegistrarRepuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_RegistrarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_DatosRepuesto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_DatosRepuesto);

        jLabel1.setText("Filtro por marca:");

        cbo_FiltroMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar todo" }));
        cbo_FiltroMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_FiltroMarcaActionPerformed(evt);
            }
        });

        jLabel2.setText("Filtrar por año:");

        cbo_FiltroStock.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar todo", "Menor que", "Igual que", "Mayor que" }));
        cbo_FiltroStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_FiltroStockActionPerformed(evt);
            }
        });

        txt_FiltroStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_FiltroStockKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_FiltroMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_FiltroStock, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_FiltroStock)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbo_FiltroMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbo_FiltroStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_FiltroStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarRepuestoActionPerformed
        JTextField txt_ID = new JTextField();
        JTextField txt_Nombre = new JTextField();
        JTextField txt_Tipo = new JTextField();
        JTextField txt_Codigo = new JTextField();
        JTextField txt_Precio = new JTextField();
        JTextField txt_Stock = new JTextField();
        JTextField txt_Marca = new JTextField();
        JTextField txt_Peso = new JTextField();
        JTextField txt_FechaIngreso = new JTextField();
        JTextField txt_Ubicacion = new JTextField();

        Object[] mensaje = {
            "ID de repuesto: ", txt_ID,
            "Nombre: ", txt_Nombre,
            "Tipo: ", txt_Tipo,
            "Código: ", txt_Codigo,
            "Precio: ", txt_Precio,
            "Stock: ", txt_Stock,
            "Marca: ", txt_Marca,
            "Peso: ", txt_Peso,
            "Fecha de ingreso: ", txt_FechaIngreso,
            "Ubicacion en almacén: ", txt_Ubicacion
        };

        int opcion = JOptionPane.showConfirmDialog(this, mensaje, "Registro de repuesto", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if(opcion == JOptionPane.OK_OPTION){
            try {
                int id = Integer.parseInt(txt_ID.getText());
                String nombre = txt_Nombre.getText();
                String tipo = txt_Tipo.getText();
                String codigo = txt_Codigo.getText();
                double precio = Double.parseDouble(txt_Precio.getText());
                int stock = Integer.parseInt(txt_Stock.getText());
                String marca = txt_Marca.getText();
                double peso = Double.parseDouble(txt_Peso.getText());
                String fechaIngreso = txt_FechaIngreso.getText();
                String ubicacion = txt_Ubicacion.getText();

                if(precio < 0 || stock < 0 || peso < 0 || id < 0){
                    JOptionPane.showMessageDialog(null, "Ingrese valores numéricos mayores a 0.");
                }else{
                    objRepuesto = new Repuesto(id, nombre, tipo, codigo, precio, stock, marca, peso, fechaIngreso, ubicacion);
                    objArreglo_Repuesto.Registrar_Repuesto(objRepuesto);
                    objArreglo_Repuesto.Listar_Repuesto(tbl_DatosRepuesto);
                    cbo_FiltroMarca.addItem(marca);
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Ingrese valores válidos.");
            }
        }
    }//GEN-LAST:event_btn_RegistrarRepuestoActionPerformed

    private void cbo_FiltroMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_FiltroMarcaActionPerformed
        String seleccion = (String) cbo_FiltroMarca.getSelectedItem();
        if (seleccion != null) {
            objArreglo_Repuesto.Filtrar_Por_Marca(tbl_DatosRepuesto, seleccion);
        }
    }//GEN-LAST:event_cbo_FiltroMarcaActionPerformed

    private void txt_FiltroStockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FiltroStockKeyReleased
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_FiltroStockKeyReleased

    private void cbo_FiltroStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_FiltroStockActionPerformed
        aplicarFiltroPorStock();
    }//GEN-LAST:event_cbo_FiltroStockActionPerformed

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
    private javax.swing.JButton btn_RegistrarRepuesto;
    private javax.swing.JComboBox<String> cbo_FiltroMarca;
    private javax.swing.JComboBox<String> cbo_FiltroStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_DatosRepuesto;
    private javax.swing.JTextField txt_FiltroStock;
    // End of variables declaration//GEN-END:variables
}
