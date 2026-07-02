package Vista;

import Control.Grafo;
import Control.NodoMicroservicio;
import Control.PeticionRed;
import Modelo.PoliticaSeguridad;
import Modelo.Microservicio;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class JFramePrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFramePrincipal.class.getName());

    private Grafo objGrafo = new Grafo();
    
    
    private void LlenarCombos() {
        objGrafo.CargarCombo(cboMicroservicioOrigen);
        objGrafo.CargarCombo(cboMicroservicioDestino);
        objGrafo.CargarCombo(cboMicroservicioPrincipal);
    }
    
    private void ListarDfs(String nombre) {
        NodoMicroservicio root = objGrafo.BuscarNodo(nombre);
        objGrafo.ListarDfs(tblMicroservicios, root);
    }
    
    private void ListarBfs(String nombre) {
        NodoMicroservicio root = objGrafo.BuscarNodo(nombre);
        objGrafo.ListarBfs(tblMicroservicios, root);
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
        txtNombreMicroservicio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIpContenedor = new javax.swing.JTextField();
        btnAgregarMicroservicio = new javax.swing.JButton();
        btnEditarMicroservicio = new javax.swing.JButton();
        btnEliminarMicroservicio = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCargaDatosKb = new javax.swing.JTextField();
        cboMicroservicioOrigen = new javax.swing.JComboBox<>();
        cboMicroservicioDestino = new javax.swing.JComboBox<>();
        btnAgregarPeticionRed = new javax.swing.JButton();
        btnEditarPeticionRed = new javax.swing.JButton();
        btnEliminarPeticionRed = new javax.swing.JButton();
        txtLatencia = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatrizAdyacencia = new javax.swing.JTable();
        btnGenerarMatriz = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMicroservicios = new javax.swing.JTable();
        btnListarAnchura = new javax.swing.JButton();
        btnListarProfundidad = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cboMicroservicioPrincipal = new javax.swing.JComboBox<>();
        btnAgregarPolitica = new javax.swing.JButton();
        btnVerPoliticas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Microservicio"));

        jLabel1.setText("nombre");

        jLabel2.setText("Ip Contenedor");

        btnAgregarMicroservicio.setText("Agregar");
        btnAgregarMicroservicio.addActionListener(this::btnAgregarMicroservicioActionPerformed);

        btnEditarMicroservicio.setText("Editar");
        btnEditarMicroservicio.addActionListener(this::btnEditarMicroservicioActionPerformed);

        btnEliminarMicroservicio.setText("Eliminar");
        btnEliminarMicroservicio.addActionListener(this::btnEliminarMicroservicioActionPerformed);

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
                        .addComponent(txtNombreMicroservicio))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtIpContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregarMicroservicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarMicroservicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarMicroservicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreMicroservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIpContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarMicroservicio)
                    .addComponent(btnEditarMicroservicio)
                    .addComponent(btnEliminarMicroservicio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ruta Aerea"));

        jLabel3.setText("Microservicio de Origen");

        jLabel4.setText("Microservicio de Destino");

        jLabel5.setText("Latencia (ms)");

        jLabel6.setText("Carga de Datos (kb)");

        cboMicroservicioOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboMicroservicioDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAgregarPeticionRed.setText("Agregar");
        btnAgregarPeticionRed.addActionListener(this::btnAgregarPeticionRedActionPerformed);

        btnEditarPeticionRed.setText("Editar");
        btnEditarPeticionRed.addActionListener(this::btnEditarPeticionRedActionPerformed);

        btnEliminarPeticionRed.setText("Eliminar");
        btnEliminarPeticionRed.addActionListener(this::btnEliminarPeticionRedActionPerformed);

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
                        .addComponent(cboMicroservicioOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboMicroservicioDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtLatencia))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtCargaDatosKb))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAgregarPeticionRed, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarPeticionRed, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarPeticionRed, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboMicroservicioOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboMicroservicioDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLatencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCargaDatosKb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarPeticionRed)
                    .addComponent(btnEditarPeticionRed)
                    .addComponent(btnEliminarPeticionRed))
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

        tblMicroservicios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblMicroservicios);

        btnListarAnchura.setText("Listar Por Anchura");
        btnListarAnchura.addActionListener(this::btnListarAnchuraActionPerformed);

        btnListarProfundidad.setText("Listar Por Profundidad");
        btnListarProfundidad.addActionListener(this::btnListarProfundidadActionPerformed);

        jLabel7.setText("Microservicio Principal");

        cboMicroservicioPrincipal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAgregarPolitica.setText("Agregar Politica");
        btnAgregarPolitica.addActionListener(this::btnAgregarPoliticaActionPerformed);

        btnVerPoliticas.setText("Ver Politicas");
        btnVerPoliticas.addActionListener(this::btnVerPoliticasActionPerformed);

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
                            .addComponent(btnAgregarPolitica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerPoliticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboMicroservicioPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(cboMicroservicioPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnAgregarPolitica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerPoliticas)))
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

    private void btnAgregarMicroservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMicroservicioActionPerformed
        try {
            String nombre = txtNombreMicroservicio.getText();
            String ipContenedor = txtIpContenedor.getText();

            Microservicio elemento = new Microservicio(nombre, ipContenedor);
            objGrafo.AgregarNodo(elemento);

            LlenarCombos();
            ListarDfs(cboMicroservicioPrincipal.getSelectedItem().toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        }
    }//GEN-LAST:event_btnAgregarMicroservicioActionPerformed

    private void btnEditarMicroservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarMicroservicioActionPerformed
        int pos = tblMicroservicios.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un Microservicio a Editar");
            return;
        }

        try {
            String nombreEditar = tblMicroservicios.getValueAt(pos, 0).toString();
            String nombre = txtNombreMicroservicio.getText();
            String ipContenedor = txtIpContenedor.getText();

            Object[] elemento = new Object[]{nombre,ipContenedor};

            objGrafo.EditarNodo(nombreEditar, elemento);
            LlenarCombos();
            ListarDfs(cboMicroservicioPrincipal.getSelectedItem().toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        }
    }//GEN-LAST:event_btnEditarMicroservicioActionPerformed

    private void btnEliminarMicroservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMicroservicioActionPerformed
        int pos = tblMicroservicios.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un Microservicio a Eliminar");
            return;
        }

        String nombreEliminar = tblMicroservicios.getValueAt(pos, 0).toString();

        objGrafo.EliminarNodo(nombreEliminar);
        LlenarCombos();
        ListarDfs(cboMicroservicioPrincipal.getSelectedItem().toString());
    }//GEN-LAST:event_btnEliminarMicroservicioActionPerformed

    private void btnAgregarPeticionRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPeticionRedActionPerformed
        try {
            String origen = cboMicroservicioOrigen.getSelectedItem().toString();
            String destino = cboMicroservicioDestino.getSelectedItem().toString();

            int latenciaMs = Integer.parseInt(txtLatencia.getText());
            double cargaDatosKb = Double.parseDouble(txtCargaDatosKb.getText());

            NodoMicroservicio nodoDestino = objGrafo.BuscarNodo(destino);

            PeticionRed elemento = new PeticionRed(nodoDestino, latenciaMs, cargaDatosKb);
            objGrafo.AgregarConexion(origen, elemento);
            ListarDfs(cboMicroservicioPrincipal.getSelectedItem().toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        }
    }//GEN-LAST:event_btnAgregarPeticionRedActionPerformed

    private void btnEditarPeticionRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPeticionRedActionPerformed
        String origen = cboMicroservicioOrigen.getSelectedItem().toString();
        String destino = cboMicroservicioDestino.getSelectedItem().toString();

        int latenciaMs = Integer.parseInt(txtLatencia.getText());
        double cargaDatosKb = Double.parseDouble(txtCargaDatosKb.getText());

        objGrafo.EditarConexion(origen, destino, latenciaMs, cargaDatosKb);
        ListarDfs(cboMicroservicioPrincipal.getSelectedItem().toString());
    }//GEN-LAST:event_btnEditarPeticionRedActionPerformed

    private void btnEliminarPeticionRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPeticionRedActionPerformed
        String origen = cboMicroservicioOrigen.getSelectedItem().toString();
        String destino = cboMicroservicioDestino.getSelectedItem().toString();

        objGrafo.EliminarConexion(origen, destino);
        ListarDfs(cboMicroservicioPrincipal.getSelectedItem().toString());
    }//GEN-LAST:event_btnEliminarPeticionRedActionPerformed

    private void btnGenerarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarMatrizActionPerformed
        objGrafo.MostrarMatrizAdyacencia(tblMatrizAdyacencia);
    }//GEN-LAST:event_btnGenerarMatrizActionPerformed

    private void btnListarAnchuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAnchuraActionPerformed
        String principal = cboMicroservicioPrincipal.getSelectedItem().toString();

        ListarBfs(principal);
    }//GEN-LAST:event_btnListarAnchuraActionPerformed

    private void btnListarProfundidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProfundidadActionPerformed
        String principal = cboMicroservicioPrincipal.getSelectedItem().toString();

        ListarDfs(principal);
    }//GEN-LAST:event_btnListarProfundidadActionPerformed

    private void btnAgregarPoliticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPoliticaActionPerformed
        int pos = tblMicroservicios.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un microservicio para añadir una Politica de Seguridad");
            return;
        }

        String nombreMicroservicio = tblMicroservicios.getValueAt(pos, 0).toString();
        NodoMicroservicio microservicio = objGrafo.BuscarNodo(nombreMicroservicio);

        JTextField txtIdRegla = new JTextField();
        JTextField txtNivelEncriptacion = new JTextField();
        JTextField txtProtocolo = new JTextField();

        Object[] msg = {
            "Id Regla", txtIdRegla,
            "Nivel de Encriptacion", txtNivelEncriptacion,
            "Protocolo", txtProtocolo
        };

        int rpta = JOptionPane.showConfirmDialog(rootPane, msg, "Agregar una Politica de Seguridad", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        try {
            if (rpta == JOptionPane.OK_OPTION) {
                String idRegla = txtIdRegla.getText();
                int nivelEncriptacion = Integer.parseInt(txtNivelEncriptacion.getText());
                String protocolo = txtProtocolo.getText();

                PoliticaSeguridad elemento = new PoliticaSeguridad(idRegla, nivelEncriptacion, protocolo);
                microservicio.getElemento().AgregarPolitica(elemento);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        }
        
    }//GEN-LAST:event_btnAgregarPoliticaActionPerformed

    private void btnVerPoliticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPoliticasActionPerformed
        int pos = tblMicroservicios.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un Microservicio para listar sus Politicas de Seguridad");
            return;
        }

        String nombreMicroservicio = tblMicroservicios.getValueAt(pos, 0).toString();
        NodoMicroservicio microservicio = objGrafo.BuscarNodo(nombreMicroservicio);

        microservicio.getElemento().ListarPolitica(tblMicroservicios);
    }//GEN-LAST:event_btnVerPoliticasActionPerformed


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
    private javax.swing.JButton btnAgregarMicroservicio;
    private javax.swing.JButton btnAgregarPeticionRed;
    private javax.swing.JButton btnAgregarPolitica;
    private javax.swing.JButton btnEditarMicroservicio;
    private javax.swing.JButton btnEditarPeticionRed;
    private javax.swing.JButton btnEliminarMicroservicio;
    private javax.swing.JButton btnEliminarPeticionRed;
    private javax.swing.JButton btnGenerarMatriz;
    private javax.swing.JButton btnListarAnchura;
    private javax.swing.JButton btnListarProfundidad;
    private javax.swing.JButton btnVerPoliticas;
    private javax.swing.JComboBox<String> cboMicroservicioDestino;
    private javax.swing.JComboBox<String> cboMicroservicioOrigen;
    private javax.swing.JComboBox<String> cboMicroservicioPrincipal;
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
    private javax.swing.JTable tblMatrizAdyacencia;
    private javax.swing.JTable tblMicroservicios;
    private javax.swing.JTextField txtCargaDatosKb;
    private javax.swing.JTextField txtIpContenedor;
    private javax.swing.JTextField txtLatencia;
    private javax.swing.JTextField txtNombreMicroservicio;
    // End of variables declaration//GEN-END:variables

}
