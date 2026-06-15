package Vista;

import Control.Grafo;
import Control.LineaTension;
import Control.NodoEstacionElectrica;
import Modelo.EstacionElectrica;
import Modelo.Transformador;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class JFramePrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFramePrincipal.class.getName());

    private Grafo objGrafo = new Grafo();
    
    private void LlenarCombos() {
        objGrafo.CargarCombo(cboEstElOrigen);
        objGrafo.CargarCombo(cboEstElDestino);
        objGrafo.CargarCombo(cboEstElectricaPrincipal);
    }
    
    private void ListarDfs(String nombrePrincipal) {
        NodoEstacionElectrica origen = objGrafo.BuscarNodoNombre(nombrePrincipal);
        objGrafo.ListarDfs(tblEstElectricas, origen);
    }
    
    private void ListarBfs(String nombrePrincipal) {
        NodoEstacionElectrica origen = objGrafo.BuscarNodoNombre(nombrePrincipal);
        objGrafo.ListarBfs(tblEstElectricas, origen);
    }
    
    public JFramePrincipal() {
        initComponents();
        LlenarCombos();
        ListarDfs("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreEstElectrica = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtVoltajeOpEstElectrica = new javax.swing.JTextField();
        btnAgregarEstElectrica = new javax.swing.JButton();
        btnEditarEstElectrica = new javax.swing.JButton();
        btnEliminarEstElectrica = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPerdidaKW = new javax.swing.JTextField();
        txtLongitud = new javax.swing.JTextField();
        cboEstElOrigen = new javax.swing.JComboBox<>();
        cboEstElDestino = new javax.swing.JComboBox<>();
        btnAgregarLineaTension = new javax.swing.JButton();
        btnEditarLineaTension = new javax.swing.JButton();
        btnEliminarLineaTension = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatrizAdyacencia = new javax.swing.JTable();
        btnGenerarMatriz = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstElectricas = new javax.swing.JTable();
        btnListarAnchura = new javax.swing.JButton();
        btnListarProfundidad = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cboEstElectricaPrincipal = new javax.swing.JComboBox<>();
        btnAgregarTransformador = new javax.swing.JButton();
        btnVerTransformadores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Est. Electrica"));

        jLabel1.setText("nombre");

        jLabel2.setText("Voltaje en Operacion (kV)");

        btnAgregarEstElectrica.setText("Agregar");
        btnAgregarEstElectrica.addActionListener(this::btnAgregarEstElectricaActionPerformed);

        btnEditarEstElectrica.setText("Editar");
        btnEditarEstElectrica.addActionListener(this::btnEditarEstElectricaActionPerformed);

        btnEliminarEstElectrica.setText("Eliminar");
        btnEliminarEstElectrica.addActionListener(this::btnEliminarEstElectricaActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreEstElectrica))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVoltajeOpEstElectrica))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregarEstElectrica, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarEstElectrica, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarEstElectrica, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreEstElectrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtVoltajeOpEstElectrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarEstElectrica)
                    .addComponent(btnEditarEstElectrica)
                    .addComponent(btnEliminarEstElectrica))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Linea de Tension"));

        jLabel3.setText("Est. Electrica de Origen");

        jLabel4.setText("Est. Electrica de Destino");

        jLabel5.setText("Perdida de kW");

        jLabel6.setText("Longitud en Metros");

        cboEstElOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboEstElDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAgregarLineaTension.setText("Agregar");
        btnAgregarLineaTension.addActionListener(this::btnAgregarLineaTensionActionPerformed);

        btnEditarLineaTension.setText("Editar");
        btnEditarLineaTension.addActionListener(this::btnEditarLineaTensionActionPerformed);

        btnEliminarLineaTension.setText("Eliminar");
        btnEliminarLineaTension.addActionListener(this::btnEliminarLineaTensionActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboEstElOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboEstElDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtPerdidaKW))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtLongitud))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAgregarLineaTension, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarLineaTension, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarLineaTension, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboEstElOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboEstElDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPerdidaKW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarLineaTension)
                    .addComponent(btnEditarLineaTension)
                    .addComponent(btnEliminarLineaTension))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblMatrizAdyacencia.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblMatrizAdyacencia);

        btnGenerarMatriz.setText("Generar Matriz de Adyacencia");
        btnGenerarMatriz.addActionListener(this::btnGenerarMatrizActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnGenerarMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGenerarMatriz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblEstElectricas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblEstElectricas);

        btnListarAnchura.setText("Listar Por Anchura");
        btnListarAnchura.addActionListener(this::btnListarAnchuraActionPerformed);

        btnListarProfundidad.setText("Listar Por Profundidad");
        btnListarProfundidad.addActionListener(this::btnListarProfundidadActionPerformed);

        jLabel7.setText("Est. Electrica Principal");

        cboEstElectricaPrincipal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAgregarTransformador.setText("Agregar Transformador");
        btnAgregarTransformador.addActionListener(this::btnAgregarTransformadorActionPerformed);

        btnVerTransformadores.setText("Ver Transformadores");
        btnVerTransformadores.addActionListener(this::btnVerTransformadoresActionPerformed);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregarTransformador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerTransformadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboEstElectricaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarAnchura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarProfundidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarAnchura)
                    .addComponent(btnListarProfundidad)
                    .addComponent(jLabel7)
                    .addComponent(cboEstElectricaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnAgregarTransformador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerTransformadores)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnAgregarEstElectricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEstElectricaActionPerformed
        try {
            String nombre = txtNombreEstElectrica.getText();
            double voltaje = Double.parseDouble(txtVoltajeOpEstElectrica.getText());
            
            EstacionElectrica elemento = new EstacionElectrica(nombre, voltaje);
            objGrafo.AgregarNodo(elemento);
            
            LlenarCombos();
            ListarDfs(cboEstElectricaPrincipal.getSelectedItem().toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        }
    }//GEN-LAST:event_btnAgregarEstElectricaActionPerformed

    private void btnAgregarLineaTensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLineaTensionActionPerformed
        try {
            String origen = cboEstElOrigen.getSelectedItem().toString();
            String destino = cboEstElDestino.getSelectedItem().toString();
            
            double perdidaKw = Double.parseDouble(txtPerdidaKW.getText());
            double longitud = Double.parseDouble(txtLongitud.getText());
            
            NodoEstacionElectrica nodoDestino = objGrafo.BuscarNodoNombre(destino);
            
            LineaTension elemento = new LineaTension(nodoDestino, perdidaKw, longitud);  
            objGrafo.AgregarConexion(origen, elemento);
            ListarDfs(cboEstElectricaPrincipal.getSelectedItem().toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        }
    }//GEN-LAST:event_btnAgregarLineaTensionActionPerformed

    private void btnListarProfundidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProfundidadActionPerformed
        String principal = cboEstElectricaPrincipal.getSelectedItem().toString();
        
        ListarDfs(principal);
    }//GEN-LAST:event_btnListarProfundidadActionPerformed

    private void btnListarAnchuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAnchuraActionPerformed
        String principal = cboEstElectricaPrincipal.getSelectedItem().toString();
        
        ListarBfs(principal);
    }//GEN-LAST:event_btnListarAnchuraActionPerformed

    private void btnEditarEstElectricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEstElectricaActionPerformed
        int pos = tblEstElectricas.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una Estacion Electrica a Editar");
            return;
        }
        
        try {
            String nombreEditar = tblEstElectricas.getValueAt(pos, 0).toString();
            String nombre = txtNombreEstElectrica.getText();
            double voltaje = Double.parseDouble(txtVoltajeOpEstElectrica.getText());
        
            Object[] elemento = new Object[]{nombre,voltaje};
            
            objGrafo.EditarNodo(nombreEditar, elemento);
            LlenarCombos();
            ListarDfs(cboEstElectricaPrincipal.getSelectedItem().toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        }         
    }//GEN-LAST:event_btnEditarEstElectricaActionPerformed

    private void btnEliminarEstElectricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEstElectricaActionPerformed
        int pos = tblEstElectricas.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una Estacion Electrica a Eliminar");
            return;
        }
        
        String nombreEliminar = tblEstElectricas.getValueAt(pos, 0).toString();
        
        objGrafo.EliminarNodo(nombreEliminar);
        LlenarCombos();
        ListarDfs(cboEstElectricaPrincipal.getSelectedItem().toString());
    }//GEN-LAST:event_btnEliminarEstElectricaActionPerformed

    private void btnEditarLineaTensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLineaTensionActionPerformed
        String origen = cboEstElOrigen.getSelectedItem().toString();
        String destino = cboEstElDestino.getSelectedItem().toString();
        
        double perdidaKw = Double.parseDouble(txtPerdidaKW.getText());
        double longitud = Double.parseDouble(txtLongitud.getText());
        
        objGrafo.EditarConexion(origen, destino, perdidaKw, longitud);
        ListarDfs(cboEstElectricaPrincipal.getSelectedItem().toString());
    }//GEN-LAST:event_btnEditarLineaTensionActionPerformed

    private void btnEliminarLineaTensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLineaTensionActionPerformed
        String origen = cboEstElOrigen.getSelectedItem().toString();
        String destino = cboEstElDestino.getSelectedItem().toString();
        
        objGrafo.EliminarConexion(origen, destino);
        ListarDfs(cboEstElectricaPrincipal.getSelectedItem().toString());
    }//GEN-LAST:event_btnEliminarLineaTensionActionPerformed

    private void btnAgregarTransformadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTransformadorActionPerformed
        int pos = tblEstElectricas.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una Estacion Electrica para añadir un Transformador");
            return;
        }
        
        String nombreEstacionElectrica = tblEstElectricas.getValueAt(pos, 0).toString();
        NodoEstacionElectrica estacionElectrica = objGrafo.BuscarNodoNombre(nombreEstacionElectrica);
        
        JTextField txtCodigoSerie = new JTextField();
        JTextField txtCapacidadKVA = new JTextField();
        JTextField txtTipoAislamiento = new JTextField();
        
        Object[] msg = {
            "Codigo Serie", txtCodigoSerie,
            "Capacidad (Kva)", txtCapacidadKVA,
            "Tipo de Aislamiento", txtTipoAislamiento
        };
        
        int rpta = JOptionPane.showConfirmDialog(rootPane, msg, "Agregar un Transformador", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (rpta == JOptionPane.OK_OPTION) {
            String codSerie = txtCodigoSerie.getText();
            int capacidadkva = Integer.parseInt(txtCapacidadKVA.getText());
            String tipoAislamiento = txtTipoAislamiento.getText();
            
            Transformador elemento = new Transformador(codSerie, capacidadkva, tipoAislamiento);           
            estacionElectrica.getElemento().AgregarTransformador(elemento);
        }
    }//GEN-LAST:event_btnAgregarTransformadorActionPerformed

    private void btnVerTransformadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTransformadoresActionPerformed
        int pos = tblEstElectricas.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una Estacion Electrica para listar sus Transformadores");
            return;
        }
        
        String nombreEstacionElectrica = tblEstElectricas.getValueAt(pos, 0).toString();
        NodoEstacionElectrica estacionElectrica = objGrafo.BuscarNodoNombre(nombreEstacionElectrica);
        
        estacionElectrica.getElemento().ListarTransformador(tblEstElectricas);
    }//GEN-LAST:event_btnVerTransformadoresActionPerformed

    private void btnGenerarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarMatrizActionPerformed
        objGrafo.MostrarMatrizAdyacencia(tblMatrizAdyacencia);
    }//GEN-LAST:event_btnGenerarMatrizActionPerformed


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


        java.awt.EventQueue.invokeLater(() -> new JFramePrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEstElectrica;
    private javax.swing.JButton btnAgregarLineaTension;
    private javax.swing.JButton btnAgregarTransformador;
    private javax.swing.JButton btnEditarEstElectrica;
    private javax.swing.JButton btnEditarLineaTension;
    private javax.swing.JButton btnEliminarEstElectrica;
    private javax.swing.JButton btnEliminarLineaTension;
    private javax.swing.JButton btnGenerarMatriz;
    private javax.swing.JButton btnListarAnchura;
    private javax.swing.JButton btnListarProfundidad;
    private javax.swing.JButton btnVerTransformadores;
    private javax.swing.JComboBox<String> cboEstElDestino;
    private javax.swing.JComboBox<String> cboEstElOrigen;
    private javax.swing.JComboBox<String> cboEstElectricaPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEstElectricas;
    private javax.swing.JTable tblMatrizAdyacencia;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextField txtNombreEstElectrica;
    private javax.swing.JTextField txtPerdidaKW;
    private javax.swing.JTextField txtVoltajeOpEstElectrica;
    // End of variables declaration//GEN-END:variables

}
