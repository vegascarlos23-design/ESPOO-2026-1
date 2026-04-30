package Vista;

import Control.ArregloEspecialidad;
import Modelo.Especialidad;
import Vista.JDialogs.JDialogRegistrarPaciente;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class JFramePrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFramePrincipal.class.getName());

    ArregloEspecialidad objArregloEspecialidad = new ArregloEspecialidad();
    Especialidad objEspecialidad;
    String esp;    
    
    public JFramePrincipal() {
        initComponents();
        while(true) {
            try {
                JTextField txtTam = new JTextField();
            Object[] msg = {
                "Numero de Especialidades",txtTam
            };
            
            int fl = JOptionPane.showConfirmDialog(rootPane, msg,"Tamaño de la especialidad",ConfirmationCallback.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
            if (fl == JOptionPane.OK_OPTION) {
                int tam = Integer.parseInt(txtTam.getText());
                objArregloEspecialidad.setTam(tam);
                break;
            }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese un numero valido");
            }
            
        }
        
        objArregloEspecialidad.Listar(tblEspecialidad);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrarEspe = new javax.swing.JButton();
        txtEspecialidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumPacientes = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEspecialidad = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrarPaciente = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        btnVerTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Especialidad");

        btnRegistrarEspe.setText("Registrar Espec.");
        btnRegistrarEspe.addActionListener(this::btnRegistrarEspeActionPerformed);

        jLabel2.setText("Num. Pacientes");

        tblEspecialidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEspecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEspecialidadMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblEspecialidad);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Gestor De Especialidades");

        btnRegistrarPaciente.setText("Registrar Paciente");
        btnRegistrarPaciente.setEnabled(false);
        btnRegistrarPaciente.addActionListener(this::btnRegistrarPacienteActionPerformed);

        btnRetroceder.setText("<--");
        btnRetroceder.addActionListener(this::btnRetrocederActionPerformed);

        btnVerTodos.setText("Ver Todos");
        btnVerTodos.addActionListener(this::btnVerTodosActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVerTodos)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEspecialidad)
                                    .addComponent(txtNumPacientes)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRegistrarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRegistrarEspe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarEspe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarPaciente)
                    .addComponent(btnRetroceder)
                    .addComponent(btnVerTodos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblEspecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEspecialidadMouseClicked
        if (evt.getClickCount() == 2) {
            btnRegistrarPaciente.setEnabled(true);
            int fila = tblEspecialidad.getSelectedRow();
            if (fila != -1) {
                esp = tblEspecialidad.getValueAt(fila, 0).toString();
                objArregloEspecialidad.ListarEspecialidad(esp, tblEspecialidad);
            }
        }
    }//GEN-LAST:event_tblEspecialidadMouseClicked

    private void btnRegistrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPacienteActionPerformed
        JDialogRegistrarPaciente objVentana = new JDialogRegistrarPaciente(this, true, objArregloEspecialidad,esp);
        objVentana.setLocationRelativeTo(this);
        objVentana.setVisible(true);
        objArregloEspecialidad.ListarEspecialidad(esp, tblEspecialidad);
        
    }//GEN-LAST:event_btnRegistrarPacienteActionPerformed

    private void btnRegistrarEspeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEspeActionPerformed
        try {
            btnRegistrarPaciente.setEnabled(false);
            
            String nombreEspe = txtEspecialidad.getText();
            int numPacientes = Integer.parseInt(txtNumPacientes.getText());
            
            objEspecialidad = new Especialidad(nombreEspe, numPacientes);
            objArregloEspecialidad.Registrar(objEspecialidad);
            objArregloEspecialidad.Listar(tblEspecialidad);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        }
    }//GEN-LAST:event_btnRegistrarEspeActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        objArregloEspecialidad.Listar(tblEspecialidad);
        btnRegistrarPaciente.setEnabled(false);
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnVerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTodosActionPerformed
        objArregloEspecialidad.ListarTodo(tblEspecialidad);
        btnRegistrarPaciente.setEnabled(false);
    }//GEN-LAST:event_btnVerTodosActionPerformed


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
    private javax.swing.JButton btnRegistrarEspe;
    private javax.swing.JButton btnRegistrarPaciente;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JButton btnVerTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblEspecialidad;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtNumPacientes;
    // End of variables declaration//GEN-END:variables

}
