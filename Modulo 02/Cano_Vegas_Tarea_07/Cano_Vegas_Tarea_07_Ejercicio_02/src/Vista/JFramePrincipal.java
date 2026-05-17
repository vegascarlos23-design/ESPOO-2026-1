package Vista;

import Control.PilaColumna;
import Modelo.Columna;
import Modelo.Contenedor;
import javax.swing.JOptionPane;



public class JFramePrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFramePrincipal.class.getName());

    private PilaColumna objPilaColumna = new PilaColumna();
    private Columna objPilaContenedores = null;
    
    private int codeGenContenedor = 1;
    
    public JFramePrincipal() {
        initComponents();
        objPilaColumna.Listar(tblColumnas);
    }
    
    private void MostrarContenedor(Contenedor elemento) {
        txtPeso.setText(elemento.getPeso()+"");
        txtContenido.setText(elemento.getContenido());
        txtPaisOrigen.setText(elemento.getPaisOrigen());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblColumnas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtMaximoPesoCol = new javax.swing.JTextField();
        btnInicializarPilaCol = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtContenido = new javax.swing.JTextField();
        txtPaisOrigen = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblContenedores = new javax.swing.JTable();
        btnApilarContenedor = new javax.swing.JButton();
        btnEliminarPorOrigen = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPaisEliminar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Columnas de Carga"));

        tblColumnas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblColumnas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblColumnasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblColumnas);

        jLabel1.setText("Maximo Peso (Kg)");

        btnInicializarPilaCol.setText("Inicializar Pila");
        btnInicializarPilaCol.addActionListener(this::btnInicializarPilaColActionPerformed);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Contenedores"));

        jLabel2.setText("Peso (Kg)");

        jLabel3.setText("Contenido");

        jLabel4.setText("Pais De Origen");

        tblContenedores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblContenedores);

        btnApilarContenedor.setText("Apilar Contenedor");
        btnApilarContenedor.addActionListener(this::btnApilarContenedorActionPerformed);

        btnEliminarPorOrigen.setText("Eliminar Por Origen");
        btnEliminarPorOrigen.addActionListener(this::btnEliminarPorOrigenActionPerformed);

        jLabel5.setText("Pais a Eliminar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPaisEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarPorOrigen))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtPaisOrigen))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtContenido))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtPeso)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnApilarContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApilarContenedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPaisOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarPorOrigen)
                    .addComponent(jLabel5)
                    .addComponent(txtPaisEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txtMaximoPesoCol, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnInicializarPilaCol, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaximoPesoCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicializarPilaCol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnInicializarPilaColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicializarPilaColActionPerformed
        try {
            int maxPeso = Integer.parseInt(txtMaximoPesoCol.getText());
            Columna elemento = new Columna(maxPeso);
            
            if (!objPilaColumna.checkContainerSize()) {
                JOptionPane.showMessageDialog(rootPane, "Aun hay espacio en otra columna");
                return;
            }
            objPilaColumna.Apilar(elemento);
            objPilaColumna.Listar(tblColumnas);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        }
    }//GEN-LAST:event_btnInicializarPilaColActionPerformed

    private void tblColumnasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblColumnasMouseClicked
        int pos = tblColumnas.getSelectedRow();
        if (pos == -1) return;
        
        int codCol = Integer.parseInt(tblColumnas.getValueAt(pos, 0).toString());
        objPilaContenedores = objPilaColumna.getElementoPorId(codCol);
        objPilaContenedores.Listar(tblContenedores);
    }//GEN-LAST:event_tblColumnasMouseClicked

    private void btnApilarContenedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApilarContenedorActionPerformed
        try {
            int peso = Integer.parseInt(txtPeso.getText());
            String contenido = txtContenido.getText();
            String paisOrigen = txtPaisOrigen.getText();
            
            Contenedor elemento = new Contenedor(peso, contenido, paisOrigen);
            elemento.setIdContenedor(codeGenContenedor);
            int fl = objPilaContenedores.Apilar(elemento);
            if (fl == -1) return;
            if (fl == 0) {
                Contenedor elementoDes = objPilaContenedores.DesapilarMedio();
                MostrarContenedor(elementoDes);
                objPilaContenedores.Listar(tblContenedores);    
                return;
            }
            objPilaContenedores.Listar(tblContenedores);
            codeGenContenedor++;
                    
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnApilarContenedorActionPerformed

    private void btnEliminarPorOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPorOrigenActionPerformed
        String paisAeliminar = txtPaisEliminar.getText();
        objPilaContenedores.EliminarPorPais(paisAeliminar);
        objPilaColumna.DecapitarVacios();
        objPilaContenedores.Listar(tblContenedores);
        objPilaColumna.Listar(tblColumnas);
        
    }//GEN-LAST:event_btnEliminarPorOrigenActionPerformed


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
    private javax.swing.JButton btnApilarContenedor;
    private javax.swing.JButton btnEliminarPorOrigen;
    private javax.swing.JButton btnInicializarPilaCol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblColumnas;
    private javax.swing.JTable tblContenedores;
    private javax.swing.JTextField txtContenido;
    private javax.swing.JTextField txtMaximoPesoCol;
    private javax.swing.JTextField txtPaisEliminar;
    private javax.swing.JTextField txtPaisOrigen;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables

}
