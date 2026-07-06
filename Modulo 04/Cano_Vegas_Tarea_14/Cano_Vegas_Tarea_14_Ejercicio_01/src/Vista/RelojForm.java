package Vista;

import Control.GestorAlarmas;
import Hilo.HiloMonitor;
import Modelo.Alarma;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.Timer;

public class RelojForm extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RelojForm.class.getName());

    private GestorAlarmas objAlarmas = new GestorAlarmas();
    private HiloMonitor objHiloMonitor = new HiloMonitor(objAlarmas);
    
    public RelojForm() {
        initComponents();
        setModels();
        objAlarmas.ListarAlarmas(tblAlarmas);
    }
    
    private void actualizarHora() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE HH:mm:ss",new Locale("es", "ES"));
        String hora = LocalDateTime.now().format(formato);
        lblHora.setText(hora);
    }
    
    private void setModels() {
        SpinnerDateModel modHora = new SpinnerDateModel();
        spnHora.setModel(modHora);
        JSpinner.DateEditor editor = new JSpinner.DateEditor(spnHora, "HH:mm");
        spnHora.setEditor(editor);
        
        int dia = LocalDate.now().getDayOfWeek().getValue();
        cboDia.setSelectedIndex(dia-1);
        
        Timer timer = new Timer(1000, e -> actualizarHora());
        timer.start();
        objHiloMonitor.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spnHora = new javax.swing.JSpinner();
        btnAgregarAlarma = new javax.swing.JButton();
        btnEliminarAlarma = new javax.swing.JButton();
        cboDia = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlarmas = new javax.swing.JTable();
        lblHora = new javax.swing.JLabel();
        btnAlternar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Dia ");

        jLabel2.setText("Hora");

        spnHora.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.DAY_OF_WEEK));

        btnAgregarAlarma.setText("Agregar Alarma");
        btnAgregarAlarma.addActionListener(this::btnAgregarAlarmaActionPerformed);

        btnEliminarAlarma.setText("Eliminar Alarma");
        btnEliminarAlarma.addActionListener(this::btnEliminarAlarmaActionPerformed);

        cboDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spnHora, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(cboDia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEliminarAlarma)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnAgregarAlarma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnAgregarAlarma)
                    .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spnHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarAlarma))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblAlarmas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAlarmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlarmasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlarmas);

        lblHora.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        lblHora.setText("00:00:00");

        btnAlternar.setText("Desactivar");
        btnAlternar.addActionListener(this::btnAlternarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlternar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblHora))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlternar))
                .addContainerGap())
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

    private void btnAgregarAlarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlarmaActionPerformed
        int dia = cboDia.getSelectedIndex()+1;
        Date fecha = (Date) spnHora.getValue();

        LocalTime hora = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalTime().withSecond(0).withNano(0);
        
        Alarma elemento = new Alarma(dia, hora);
        objAlarmas.AgregarAlarma(elemento);
        objAlarmas.ListarAlarmas(tblAlarmas);
    }//GEN-LAST:event_btnAgregarAlarmaActionPerformed

    private void btnAlternarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlternarActionPerformed
        int pos = tblAlarmas.getSelectedRow();

        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una alarma");
            return;
        }

        Alarma elemento = objAlarmas.obtenerAlarma(pos);

        objAlarmas.AlternarAlarma(elemento);
        objAlarmas.ListarAlarmas(tblAlarmas);
    }//GEN-LAST:event_btnAlternarActionPerformed

    private void btnEliminarAlarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAlarmaActionPerformed
        int pos = tblAlarmas.getSelectedRow();
        
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una alarma a eliminar");
            return;
        }
        
        Alarma elemento = objAlarmas.obtenerAlarma(pos);
        
        objAlarmas.EliminarAlarma(elemento);
        objAlarmas.ListarAlarmas(tblAlarmas);
    }//GEN-LAST:event_btnEliminarAlarmaActionPerformed

    private void tblAlarmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlarmasMouseClicked
        int pos = tblAlarmas.getSelectedRow();
        
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una alarma a eliminar");
            return;
        }
        
        String estado = tblAlarmas.getValueAt(pos, 2).toString();
        btnAlternar.setText(estado.equals("Si") ? "Desactivar" : "Activar");
    }//GEN-LAST:event_tblAlarmasMouseClicked


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


        java.awt.EventQueue.invokeLater(() -> new RelojForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlarma;
    private javax.swing.JButton btnAlternar;
    private javax.swing.JButton btnEliminarAlarma;
    private javax.swing.JComboBox<String> cboDia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHora;
    private javax.swing.JSpinner spnHora;
    private javax.swing.JTable tblAlarmas;
    // End of variables declaration//GEN-END:variables

}
