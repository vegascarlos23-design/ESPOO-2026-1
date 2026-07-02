package Vista;

import Control.Grafo;
import Control.NodoHelipuerto;
import Control.RutaAerea;
import Modelo.Dron;
import Modelo.Helipuerto;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class JFramePrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFramePrincipal.class.getName());

    private Grafo objGrafo = new Grafo();
    
    
    private void LlenarCombos() {
        objGrafo.CargarCombo(cboHelipuertoOrigen);
        objGrafo.CargarCombo(cboHelipuertoDestino);
        objGrafo.CargarCombo(cboHelipuertoPrincipal);
    }
    
    private void ListarDfs(String nombre) {
        NodoHelipuerto root = objGrafo.BuscarNodo(nombre);
        objGrafo.ListarDfs(tblHelipuertos, root);
    }
    
    private void ListarBfs(String nombre) {
        NodoHelipuerto root = objGrafo.BuscarNodo(nombre);
        objGrafo.ListarBfs(tblHelipuertos, root);
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
        txtNombreHelipuerto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAltitud = new javax.swing.JTextField();
        btnAgregarHelipuerto = new javax.swing.JButton();
        btnEditarHelipuerto = new javax.swing.JButton();
        btnEliminarHelipuerto = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDistanciaLineal = new javax.swing.JTextField();
        cboHelipuertoOrigen = new javax.swing.JComboBox<>();
        cboHelipuertoDestino = new javax.swing.JComboBox<>();
        btnAgregarRutaAerea = new javax.swing.JButton();
        btnEditarRutaAerea = new javax.swing.JButton();
        btnEliminarRutaAerea = new javax.swing.JButton();
        spnCantidadBateria = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatrizAdyacencia = new javax.swing.JTable();
        btnGenerarMatriz = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHelipuertos = new javax.swing.JTable();
        btnListarAnchura = new javax.swing.JButton();
        btnListarProfundidad = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cboHelipuertoPrincipal = new javax.swing.JComboBox<>();
        btnAgregarDron = new javax.swing.JButton();
        btnVerDrones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Helipuerto"));

        jLabel1.setText("nombre");

        jLabel2.setText("Altitud (msnm)");

        btnAgregarHelipuerto.setText("Agregar");
        btnAgregarHelipuerto.addActionListener(this::btnAgregarHelipuertoActionPerformed);

        btnEditarHelipuerto.setText("Editar");
        btnEditarHelipuerto.addActionListener(this::btnEditarHelipuertoActionPerformed);

        btnEliminarHelipuerto.setText("Eliminar");
        btnEliminarHelipuerto.addActionListener(this::btnEliminarHelipuertoActionPerformed);

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
                        .addComponent(txtNombreHelipuerto))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtAltitud, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregarHelipuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarHelipuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarHelipuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreHelipuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAltitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarHelipuerto)
                    .addComponent(btnEditarHelipuerto)
                    .addComponent(btnEliminarHelipuerto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ruta Aerea"));

        jLabel3.setText("Helipuerto de Origen");

        jLabel4.setText("Helipuerto de Destino");

        jLabel5.setText("Cantidad Bateria");

        jLabel6.setText("Distancia lineal (m)");

        cboHelipuertoOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboHelipuertoDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAgregarRutaAerea.setText("Agregar");
        btnAgregarRutaAerea.addActionListener(this::btnAgregarRutaAereaActionPerformed);

        btnEditarRutaAerea.setText("Editar");
        btnEditarRutaAerea.addActionListener(this::btnEditarRutaAereaActionPerformed);

        btnEliminarRutaAerea.setText("Eliminar");
        btnEliminarRutaAerea.addActionListener(this::btnEliminarRutaAereaActionPerformed);

        spnCantidadBateria.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

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
                        .addComponent(cboHelipuertoOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboHelipuertoDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(spnCantidadBateria))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtDistanciaLineal))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAgregarRutaAerea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarRutaAerea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarRutaAerea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboHelipuertoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboHelipuertoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spnCantidadBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDistanciaLineal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarRutaAerea)
                    .addComponent(btnEditarRutaAerea)
                    .addComponent(btnEliminarRutaAerea))
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

        tblHelipuertos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblHelipuertos);

        btnListarAnchura.setText("Listar Por Anchura");
        btnListarAnchura.addActionListener(this::btnListarAnchuraActionPerformed);

        btnListarProfundidad.setText("Listar Por Profundidad");
        btnListarProfundidad.addActionListener(this::btnListarProfundidadActionPerformed);

        jLabel7.setText("Helipuerto Principal");

        cboHelipuertoPrincipal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAgregarDron.setText("Agregar Dron");
        btnAgregarDron.addActionListener(this::btnAgregarDronActionPerformed);

        btnVerDrones.setText("Ver Drones");
        btnVerDrones.addActionListener(this::btnVerDronesActionPerformed);

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
                            .addComponent(btnAgregarDron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerDrones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboHelipuertoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(cboHelipuertoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnAgregarDron)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerDrones)))
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

    private void btnAgregarHelipuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHelipuertoActionPerformed
        try {
            String nombre = txtNombreHelipuerto.getText();
            int altitud = Integer.parseInt(txtAltitud.getText());

            Helipuerto elemento = new Helipuerto(nombre, altitud);
            objGrafo.AgregarNodo(elemento);

            LlenarCombos();
            ListarDfs(cboHelipuertoPrincipal.getSelectedItem().toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        }
    }//GEN-LAST:event_btnAgregarHelipuertoActionPerformed

    private void btnEditarHelipuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarHelipuertoActionPerformed
        int pos = tblHelipuertos.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una Estacion Electrica a Editar");
            return;
        }

        try {
            String nombreEditar = tblHelipuertos.getValueAt(pos, 0).toString();
            String nombre = txtNombreHelipuerto.getText();
            int altitud = Integer.parseInt(txtAltitud.getText());

            Object[] elemento = new Object[]{nombre,altitud};

            objGrafo.EditarNodo(nombreEditar, elemento);
            LlenarCombos();
            ListarDfs(cboHelipuertoPrincipal.getSelectedItem().toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        }
    }//GEN-LAST:event_btnEditarHelipuertoActionPerformed

    private void btnEliminarHelipuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHelipuertoActionPerformed
        int pos = tblHelipuertos.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una Estacion Electrica a Eliminar");
            return;
        }

        String nombreEliminar = tblHelipuertos.getValueAt(pos, 0).toString();

        objGrafo.EliminarNodo(nombreEliminar);
        LlenarCombos();
        ListarDfs(cboHelipuertoPrincipal.getSelectedItem().toString());
    }//GEN-LAST:event_btnEliminarHelipuertoActionPerformed

    private void btnAgregarRutaAereaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRutaAereaActionPerformed
        try {
            String origen = cboHelipuertoOrigen.getSelectedItem().toString();
            String destino = cboHelipuertoDestino.getSelectedItem().toString();

            int consumoBateria = Integer.parseInt(spnCantidadBateria.getValue().toString());
            double distanciaLineal = Double.parseDouble(txtDistanciaLineal.getText());

            NodoHelipuerto nodoDestino = objGrafo.BuscarNodo(destino);

            RutaAerea elemento = new RutaAerea(nodoDestino, consumoBateria, distanciaLineal);
            objGrafo.AgregarConexion(origen, elemento);
            ListarDfs(cboHelipuertoPrincipal.getSelectedItem().toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        }
    }//GEN-LAST:event_btnAgregarRutaAereaActionPerformed

    private void btnEditarRutaAereaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRutaAereaActionPerformed
        String origen = cboHelipuertoOrigen.getSelectedItem().toString();
        String destino = cboHelipuertoDestino.getSelectedItem().toString();

        int cantidadBateria = Integer.parseInt(spnCantidadBateria.getValue().toString());
        double distanciaLineal = Double.parseDouble(txtDistanciaLineal.getText());

        objGrafo.EditarConexion(origen, destino, cantidadBateria, distanciaLineal);
        ListarDfs(cboHelipuertoPrincipal.getSelectedItem().toString());
    }//GEN-LAST:event_btnEditarRutaAereaActionPerformed

    private void btnEliminarRutaAereaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRutaAereaActionPerformed
        String origen = cboHelipuertoOrigen.getSelectedItem().toString();
        String destino = cboHelipuertoDestino.getSelectedItem().toString();

        objGrafo.EliminarConexion(origen, destino);
        ListarDfs(cboHelipuertoPrincipal.getSelectedItem().toString());
    }//GEN-LAST:event_btnEliminarRutaAereaActionPerformed

    private void btnGenerarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarMatrizActionPerformed
        objGrafo.MostrarMatrizAdyacencia(tblMatrizAdyacencia);
    }//GEN-LAST:event_btnGenerarMatrizActionPerformed

    private void btnListarAnchuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAnchuraActionPerformed
        String principal = cboHelipuertoPrincipal.getSelectedItem().toString();

        ListarBfs(principal);
    }//GEN-LAST:event_btnListarAnchuraActionPerformed

    private void btnListarProfundidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProfundidadActionPerformed
        String principal = cboHelipuertoPrincipal.getSelectedItem().toString();

        ListarDfs(principal);
    }//GEN-LAST:event_btnListarProfundidadActionPerformed

    private void btnAgregarDronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDronActionPerformed
        int pos = tblHelipuertos.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un helipuerto para añadir un Dron");
            return;
        }

        String nombreHelipuerto = tblHelipuertos.getValueAt(pos, 0).toString();
        NodoHelipuerto estacionElectrica = objGrafo.BuscarNodo(nombreHelipuerto);

        JTextField txtMatricula = new JTextField();
        JTextField txtAutonomiaMinutos = new JTextField();
        JTextField txtCargaMaxima = new JTextField();

        Object[] msg = {
            "Matricula", txtMatricula,
            "Autonomia (min.)", txtAutonomiaMinutos,
            "Carga Maxima (Kg)", txtCargaMaxima
        };

        int rpta = JOptionPane.showConfirmDialog(rootPane, msg, "Agregar un Dron", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        try {
            if (rpta == JOptionPane.OK_OPTION) {
                String matricula = txtMatricula.getText();
                int autonomia = Integer.parseInt(txtAutonomiaMinutos.getText());
                double cargaMaxima = Double.parseDouble(txtCargaMaxima.getText());

                Dron elemento = new Dron(matricula, autonomia, cargaMaxima);
                estacionElectrica.getElemento().AgregarDron(elemento);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        }
        
    }//GEN-LAST:event_btnAgregarDronActionPerformed

    private void btnVerDronesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDronesActionPerformed
        int pos = tblHelipuertos.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una Estacion Electrica para listar sus Transformadores");
            return;
        }

        String nombreHelipuerto = tblHelipuertos.getValueAt(pos, 0).toString();
        NodoHelipuerto helipuerto = objGrafo.BuscarNodo(nombreHelipuerto);

        helipuerto.getElemento().ListarDron(tblHelipuertos);
    }//GEN-LAST:event_btnVerDronesActionPerformed


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
    private javax.swing.JButton btnAgregarDron;
    private javax.swing.JButton btnAgregarHelipuerto;
    private javax.swing.JButton btnAgregarRutaAerea;
    private javax.swing.JButton btnEditarHelipuerto;
    private javax.swing.JButton btnEditarRutaAerea;
    private javax.swing.JButton btnEliminarHelipuerto;
    private javax.swing.JButton btnEliminarRutaAerea;
    private javax.swing.JButton btnGenerarMatriz;
    private javax.swing.JButton btnListarAnchura;
    private javax.swing.JButton btnListarProfundidad;
    private javax.swing.JButton btnVerDrones;
    private javax.swing.JComboBox<String> cboHelipuertoDestino;
    private javax.swing.JComboBox<String> cboHelipuertoOrigen;
    private javax.swing.JComboBox<String> cboHelipuertoPrincipal;
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
    private javax.swing.JSpinner spnCantidadBateria;
    private javax.swing.JTable tblHelipuertos;
    private javax.swing.JTable tblMatrizAdyacencia;
    private javax.swing.JTextField txtAltitud;
    private javax.swing.JTextField txtDistanciaLineal;
    private javax.swing.JTextField txtNombreHelipuerto;
    // End of variables declaration//GEN-END:variables

}
