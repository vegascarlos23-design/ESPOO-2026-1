package Vista;

import Control.Arreglo_Expediente;
import Modelo.Expediente;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JFrame_Principal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFrame_Principal.class.getName());
    Arreglo_Expediente objArreglo_Expediente = new Arreglo_Expediente();
    Expediente objExpediente;

    public JFrame_Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_RegistrarExpediente = new javax.swing.JButton();
        btn_BuscarExpediente = new javax.swing.JButton();
        btn_MostrarTodo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DatosExpediente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de expediente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 14))); // NOI18N

        btn_RegistrarExpediente.setText("Registrar expediente");
        btn_RegistrarExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarExpedienteActionPerformed(evt);
            }
        });

        btn_BuscarExpediente.setText("Buscar expediente");
        btn_BuscarExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarExpedienteActionPerformed(evt);
            }
        });

        btn_MostrarTodo.setText("Mostrar todo");
        btn_MostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MostrarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_MostrarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_RegistrarExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_BuscarExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_RegistrarExpediente, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(btn_BuscarExpediente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_MostrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_DatosExpediente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_DatosExpediente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarExpedienteActionPerformed
        JTextField txt_NumeroExpediente = new JTextField();
        JTextField txt_Nombre = new JTextField();
        JTextField txt_FechaInicio = new JTextField();
        JTextField txt_Tipo = new JTextField();

        Object[] mensaje = {
            "Número de expediente: ", txt_NumeroExpediente,
            "Nombre: ", txt_Nombre,
            "Fecha de inicio: ", txt_FechaInicio,
            "Tipo: ", txt_Tipo
        };

        int opcion = JOptionPane.showConfirmDialog(this, mensaje, "Registro de expediente", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (opcion == JOptionPane.OK_OPTION) {
            try {
                int numero_expediente = Integer.parseInt(txt_NumeroExpediente.getText());
                String nombre = txt_Nombre.getText();
                String fechaInicio = txt_FechaInicio.getText();
                String tipo = txt_Tipo.getText();

                if (numero_expediente < 0) {
                    JOptionPane.showMessageDialog(null, "Ingrese valores numéricos mayores a 0.");
                } else {
                    objExpediente = new Expediente(numero_expediente, nombre, fechaInicio, tipo);
                    objArreglo_Expediente.Registrar_Expediente(objExpediente);
                    objArreglo_Expediente.Listar_Expediente(tbl_DatosExpediente);
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Ingrese valores válidos.");
            }
        }
    }//GEN-LAST:event_btn_RegistrarExpedienteActionPerformed

    private void btn_BuscarExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarExpedienteActionPerformed
        String[] opciones = {"Número de expediente", "Nombre", "Tipo"};

        String criterio = (String) JOptionPane.showInputDialog(
                this,
                "Seleccione el criterio de búsqueda:",
                "Buscar expediente",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        if (criterio != null) {
            String valorBusqueda = JOptionPane.showInputDialog(this, "Ingrese el " + criterio + ":");

            if (valorBusqueda != null && !valorBusqueda.isEmpty()) {
                switch (criterio) {
                    case "Número de expediente":
                        try {
                            int numero = Integer.parseInt(valorBusqueda);
                            objArreglo_Expediente.Buscar_Por_Numero(tbl_DatosExpediente, numero);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(this, "Ingrese un número válido.");
                        }
                        break;
                    case "Nombre":
                        objArreglo_Expediente.Buscar_Por_Nombre(tbl_DatosExpediente, valorBusqueda);
                        break;
                    case "Tipo":
                        objArreglo_Expediente.Buscar_Por_Tipo(tbl_DatosExpediente, valorBusqueda);
                        break;
                }
            }
        }
    }//GEN-LAST:event_btn_BuscarExpedienteActionPerformed

    private void btn_MostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MostrarTodoActionPerformed
        objArreglo_Expediente.Listar_Expediente(tbl_DatosExpediente);
    }//GEN-LAST:event_btn_MostrarTodoActionPerformed

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
    private javax.swing.JButton btn_BuscarExpediente;
    private javax.swing.JButton btn_MostrarTodo;
    private javax.swing.JButton btn_RegistrarExpediente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_DatosExpediente;
    // End of variables declaration//GEN-END:variables
}
