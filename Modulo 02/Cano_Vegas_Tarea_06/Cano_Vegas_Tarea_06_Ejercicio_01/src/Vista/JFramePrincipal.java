package Vista;

import Control.ListaPaciente;
import Modelo.Paciente;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;


public class JFramePrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFramePrincipal.class.getName());
    
    ListaPaciente objListaPaciente = new ListaPaciente();
    

    private void modelSpn() {
        JSpinner.DateEditor editor = new JSpinner.DateEditor(spnHoraCita, "HH:mm");

        spnHoraCita.setEditor(editor);
    }
 
    public JFramePrincipal() {
        initComponents();
        modelSpn();
        objListaPaciente.Listar(tblPacientes);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPacientes = new javax.swing.JTable();
        txtNombres = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        btnRegistrarPaciente = new javax.swing.JButton();
        btnEditarPaciente = new javax.swing.JButton();
        btnEliminarPaciente = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtInsertarPosicion = new javax.swing.JTextField();
        btnLimpiarCampos = new javax.swing.JButton();
        cboEstado = new javax.swing.JComboBox<>();
        spnHoraCita = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Nombre Completo");

        jLabel2.setText("DNI");

        jLabel3.setText("Hora de Cita");

        jLabel4.setText("Estado");

        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPacientes);

        btnRegistrarPaciente.setText("Registrar Paciente");
        btnRegistrarPaciente.addActionListener(this::btnRegistrarPacienteActionPerformed);

        btnEditarPaciente.setText("Editar Paciente");
        btnEditarPaciente.addActionListener(this::btnEditarPacienteActionPerformed);

        btnEliminarPaciente.setText("Eliminar Paciente");
        btnEliminarPaciente.addActionListener(this::btnEliminarPacienteActionPerformed);

        btnOrdenar.setText("Ordenar Por Hora");
        btnOrdenar.addActionListener(this::btnOrdenarActionPerformed);

        jLabel5.setText("Insertar en posicion");

        btnLimpiarCampos.setText("Limpiar Campos");
        btnLimpiarCampos.addActionListener(this::btnLimpiarCamposActionPerformed);

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En Espera", "Atendido" }));

        spnHoraCita.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.HOUR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInsertarPosicion))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(spnHoraCita))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtDni))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnLimpiarCampos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOrdenar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnEliminarPaciente)
                    .addComponent(spnHoraCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnOrdenar)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtInsertarPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarCampos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnRegistrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPacienteActionPerformed
        try {
            String nombre = txtNombres.getText();
            String dni = txtDni.getText();
            Date horaCita = (Date)spnHoraCita.getValue();
            String estado = cboEstado.getSelectedItem().toString();
            String posInsert = txtInsertarPosicion.getText();
            
            Paciente elemento = new Paciente(nombre, dni, horaCita, estado);
            
            if (posInsert.equals("")) {
                if (!objListaPaciente.Registrar(elemento)) return;
            } else {
                if (!objListaPaciente.RegistrarEnPosicion(elemento, Integer.parseInt(posInsert)-1)) return;
            }
            objListaPaciente.Listar(tblPacientes);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnRegistrarPacienteActionPerformed

    private void btnEditarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPacienteActionPerformed
        int pos = tblPacientes.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane,"Seleccione un Paciente a Editar");
            return;
        }
        int codigoEditar = Integer.parseInt(tblPacientes.getValueAt(pos, 0).toString());
        try {
            String nombre = txtNombres.getText();
            Date horaCita = (Date)spnHoraCita.getValue();
            Paciente elemento = new Paciente(nombre, horaCita);
            objListaPaciente.Editar(codigoEditar, elemento);
            objListaPaciente.Listar(tblPacientes);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEditarPacienteActionPerformed

    private void tblPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPacientesMouseClicked
        int pos = tblPacientes.getSelectedRow();
        if (pos == -1) return;
        
        txtNombres.setText(tblPacientes.getValueAt(pos, 1).toString());
        txtDni.setText(tblPacientes.getValueAt(pos, 2).toString());   
        try {
            String hora = tblPacientes.getValueAt(pos, 3).toString();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            Date date = sdf.parse(hora);
            spnHoraCita.setValue(date);
        } catch (Exception e) {
        }
        cboEstado.setSelectedItem(tblPacientes.getValueAt(pos, 4));
        
    }//GEN-LAST:event_tblPacientesMouseClicked

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        txtNombres.setText("");
        txtDni.setText("");
        txtInsertarPosicion.setText("");
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    private void btnEliminarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPacienteActionPerformed
        int pos = tblPacientes.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un Paciente a eliminar");
            return;
        }
        int codigoEliminar = Integer.parseInt(tblPacientes.getValueAt(pos, 0).toString());
        objListaPaciente.Eliminar(codigoEliminar);
        objListaPaciente.Listar(tblPacientes);
    }//GEN-LAST:event_btnEliminarPacienteActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        objListaPaciente.SelectionSort();
        objListaPaciente.Listar(tblPacientes);
    }//GEN-LAST:event_btnOrdenarActionPerformed

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
    private javax.swing.JButton btnEditarPaciente;
    private javax.swing.JButton btnEliminarPaciente;
    private javax.swing.JButton btnLimpiarCampos;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnRegistrarPaciente;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnHoraCita;
    private javax.swing.JTable tblPacientes;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtInsertarPosicion;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables

}
