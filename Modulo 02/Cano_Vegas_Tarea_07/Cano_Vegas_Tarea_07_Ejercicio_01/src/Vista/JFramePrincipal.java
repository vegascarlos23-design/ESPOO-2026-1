package Vista;

import Control.PilaExpediente;
import Modelo.Expediente;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;


public class JFramePrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFramePrincipal.class.getName());

    private PilaExpediente objPilaExpediente = new PilaExpediente();
    
    private void setSpnDateModel() {
        spnFechaIngreso.setEditor(new JSpinner.DateEditor(spnFechaIngreso,"dd/MM/yyyy"));
    }
    
    public JFramePrincipal() {
        initComponents();
        objPilaExpediente.Listar(tblExpedientes);
        setSpnDateModel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExpedientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        spnFechaIngreso = new javax.swing.JSpinner();
        cboPrioridad = new javax.swing.JComboBox<>();
        btnApilarExpediente = new javax.swing.JButton();
        btnDesapilarFolio = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtBuscarPosFolio = new javax.swing.JTextField();
        btnLocalizarPorNombre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblExpedientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblExpedientes);

        jLabel1.setText("Nombre Cliente");

        jLabel2.setText("Nombre Cliente");

        jLabel3.setText("Nombre Cliente");

        spnFechaIngreso.setModel(new javax.swing.SpinnerDateModel());

        cboPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baja", "Media", "Alta" }));

        btnApilarExpediente.setText("Apilar Expediente");
        btnApilarExpediente.addActionListener(this::btnApilarExpedienteActionPerformed);

        btnDesapilarFolio.setText("Desapilar Folio");
        btnDesapilarFolio.addActionListener(this::btnDesapilarFolioActionPerformed);

        jLabel4.setText("Localizar Posicion de un Folio por Nombre");

        btnLocalizarPorNombre.setText("Localizar");
        btnLocalizarPorNombre.addActionListener(this::btnLocalizarPorNombreActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cboPrioridad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(spnFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreCliente)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnApilarExpediente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDesapilarFolio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarPosFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocalizarPorNombre)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApilarExpediente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spnFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesapilarFolio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBuscarPosFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocalizarPorNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnApilarExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApilarExpedienteActionPerformed
        try {
            String nombreCliente = txtNombreCliente.getText();
            Date fechaIngreso = (Date)spnFechaIngreso.getValue();
            String prioridad = cboPrioridad.getSelectedItem().toString();
            
            Expediente elemento = new Expediente(nombreCliente, fechaIngreso, prioridad);
            objPilaExpediente.Apilar(elemento);
            objPilaExpediente.Listar(tblExpedientes);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        }
    }//GEN-LAST:event_btnApilarExpedienteActionPerformed

    private void btnDesapilarFolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesapilarFolioActionPerformed
        int pos = tblExpedientes.getSelectedRow();
        if (pos == -1) return;
        
        int numFolio = Integer.parseInt(tblExpedientes.getValueAt(pos, 0).toString());
        Expediente elemento = objPilaExpediente.DesapilarPorFolio(numFolio);
        
        txtNombreCliente.setText(elemento.getCliente());
        spnFechaIngreso.setValue(elemento.getFehcaIngreso());
        cboPrioridad.setSelectedItem(elemento.getPrioridad());
        
        objPilaExpediente.Listar(tblExpedientes);
    }//GEN-LAST:event_btnDesapilarFolioActionPerformed

    private void btnLocalizarPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarPorNombreActionPerformed
        String localizarNombre = txtBuscarPosFolio.getText();
        int pos = objPilaExpediente.getPosPilaNombre(localizarNombre);
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "El nombre no existe");
            return;
        }
        JOptionPane.showMessageDialog(rootPane, "El Folio con el nombre: " + txtBuscarPosFolio.getText()
                + "\nSe encuentra en la posicion "+pos);
        
    }//GEN-LAST:event_btnLocalizarPorNombreActionPerformed


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
    private javax.swing.JButton btnApilarExpediente;
    private javax.swing.JButton btnDesapilarFolio;
    private javax.swing.JButton btnLocalizarPorNombre;
    private javax.swing.JComboBox<String> cboPrioridad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnFechaIngreso;
    private javax.swing.JTable tblExpedientes;
    private javax.swing.JTextField txtBuscarPosFolio;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables

}
