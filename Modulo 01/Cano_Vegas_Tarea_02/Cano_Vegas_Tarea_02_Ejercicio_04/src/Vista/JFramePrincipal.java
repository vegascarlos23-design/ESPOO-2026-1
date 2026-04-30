package Vista;

import Control.ArregloAerolineas;
import Modelo.Aerolinea;
import Modelo.Vuelo;
import javax.swing.JOptionPane;

public class JFramePrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFramePrincipal.class.getName());

    ArregloAerolineas objArregloAerolineas = new ArregloAerolineas();

    public void cargarComboAerolineas() {
        cboAerolinea.removeAllItems();

        for (int i = 0; i < objArregloAerolineas.getI(); i++) {
            cboAerolinea.addItem(objArregloAerolineas.getAreolineaId(i));
        }
    }

    public JFramePrincipal() {
        initComponents();
        cargarComboAerolineas();
        objArregloAerolineas.listar(tblAerolinea);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpBtnBusqueda = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboAerolinea = new javax.swing.JComboBox<>();
        txtNumVuelo = new javax.swing.JTextField();
        txtCiudadDestino = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        btnRegistrarVuelo = new javax.swing.JButton();
        btnEditarVuelo = new javax.swing.JButton();
        btnEliminarVuelo = new javax.swing.JButton();
        btnVerTodosVuelos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdAerolinea = new javax.swing.JTextField();
        txtNombreA = new javax.swing.JTextField();
        txtRucA = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        txtPaisA = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAerolinea = new javax.swing.JTable();
        btnRegistrarA = new javax.swing.JButton();
        btnEditarA = new javax.swing.JButton();
        btnEliminarA = new javax.swing.JButton();
        btnVerAero = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        rdBtnNumVuelo = new javax.swing.JRadioButton();
        rdBtnCiudadVuelo = new javax.swing.JRadioButton();
        rdBtnEstado = new javax.swing.JRadioButton();
        txtBusqueda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Numero de Vuelo");

        jLabel7.setText("Ciudad de Destino");

        jLabel8.setText("Estado");

        jLabel9.setText("Aerolinea");

        cboAerolinea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboAerolinea.addActionListener(this::cboAerolineaActionPerformed);

        btnRegistrarVuelo.setText("Registrar Vuelo");
        btnRegistrarVuelo.addActionListener(this::btnRegistrarVueloActionPerformed);

        btnEditarVuelo.setText("Editar Vuelo");
        btnEditarVuelo.addActionListener(this::btnEditarVueloActionPerformed);

        btnEliminarVuelo.setText("Eliminar Vuelo");
        btnEliminarVuelo.addActionListener(this::btnEliminarVueloActionPerformed);

        btnVerTodosVuelos.setText("Ver Todos los Vuelos");
        btnVerTodosVuelos.addActionListener(this::btnVerTodosVuelosActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumVuelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCiudadDestino)
                            .addComponent(txtEstado)
                            .addComponent(cboAerolinea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditarVuelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarVuelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarVuelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerTodosVuelos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarVuelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCiudadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarVuelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarVuelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cboAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerTodosVuelos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setText("ID:");

        jLabel3.setText("Nombre");

        jLabel4.setText("RUC");

        jLabel5.setText("Razon Social");

        jLabel6.setText("Pais");

        tblAerolinea.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAerolinea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAerolineaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAerolinea);

        btnRegistrarA.setText("Registar Aerolinea");
        btnRegistrarA.addActionListener(this::btnRegistrarAActionPerformed);

        btnEditarA.setText("Editar Aerolinea");
        btnEditarA.addActionListener(this::btnEditarAActionPerformed);

        btnEliminarA.setText("Eliminar Aerolinea");
        btnEliminarA.addActionListener(this::btnEliminarAActionPerformed);

        btnVerAero.setText("Ver Aerolineas");
        btnVerAero.addActionListener(this::btnVerAeroActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRazonSocial, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRucA)
                            .addComponent(txtNombreA)
                            .addComponent(txtIdAerolinea)
                            .addComponent(txtPaisA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditarA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrarA, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVerAero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRucA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPaisA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerAero))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setText("Buscar Vuelo");

        grpBtnBusqueda.add(rdBtnNumVuelo);
        rdBtnNumVuelo.setSelected(true);
        rdBtnNumVuelo.setText("Numero de Vuelo");

        grpBtnBusqueda.add(rdBtnCiudadVuelo);
        rdBtnCiudadVuelo.setText("Ciudad de Destino");

        grpBtnBusqueda.add(rdBtnEstado);
        rdBtnEstado.setText("Estado de Vuelo");

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rdBtnNumVuelo)
                        .addGap(18, 18, 18)
                        .addComponent(rdBtnCiudadVuelo)
                        .addGap(18, 18, 18)
                        .addComponent(rdBtnEstado))
                    .addComponent(txtBusqueda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdBtnNumVuelo)
                    .addComponent(rdBtnCiudadVuelo)
                    .addComponent(rdBtnEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAActionPerformed
        try {
            int id = Integer.parseInt(txtIdAerolinea.getText());
            String nombre = txtNombreA.getText();
            String ruc = txtRucA.getText();
            String razonSocial = txtRazonSocial.getText();
            String pais = txtPaisA.getText();

            Aerolinea objAerolinea = new Aerolinea(id, nombre, ruc, razonSocial, pais);
            objArregloAerolineas.agregar(objAerolinea);
            objArregloAerolineas.listar(tblAerolinea);
            cargarComboAerolineas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        }

    }//GEN-LAST:event_btnRegistrarAActionPerformed

    private void btnEliminarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAActionPerformed
        int pos = tblAerolinea.getSelectedRow();
        if (pos != -1) {
            int id = Integer.parseInt(tblAerolinea.getValueAt(pos, 0).toString());
            objArregloAerolineas.eliminar(id);
            objArregloAerolineas.listar(tblAerolinea);
            cargarComboAerolineas();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una Aerolinea a eliminar");
        }
    }//GEN-LAST:event_btnEliminarAActionPerformed

    private void btnRegistrarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVueloActionPerformed
        try {
            int numVuelo = Integer.parseInt(txtNumVuelo.getText());
            String ciudadDes = txtCiudadDestino.getText();
            String estado = txtEstado.getText();
            Aerolinea objAerolinea = objArregloAerolineas.getAerolinea(Integer.parseInt(cboAerolinea.getSelectedItem().toString()));

            Vuelo objVuelo = new Vuelo(objAerolinea.getId(), numVuelo, ciudadDes, estado, objAerolinea);
            objArregloAerolineas.getAerolinea(objAerolinea.getId()).getArregloVuelos().agregar(objVuelo);
            objArregloAerolineas.getAerolinea(objAerolinea.getId()).getArregloVuelos().listar(tblAerolinea);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Agregue una Aerolinea");
        }

    }//GEN-LAST:event_btnRegistrarVueloActionPerformed

    private void cboAerolineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAerolineaActionPerformed

    }//GEN-LAST:event_cboAerolineaActionPerformed

    private void btnVerAeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAeroActionPerformed
        objArregloAerolineas.listar(tblAerolinea);
    }//GEN-LAST:event_btnVerAeroActionPerformed

    private void btnVerTodosVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTodosVuelosActionPerformed
        objArregloAerolineas.listarTodoVuelos(tblAerolinea);
    }//GEN-LAST:event_btnVerTodosVuelosActionPerformed

    private void btnEditarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAActionPerformed
        int pos = tblAerolinea.getSelectedRow();
        if (pos != -1) {
            int id = Integer.parseInt(tblAerolinea.getValueAt(pos, 0).toString());
            String nombre = txtNombreA.getText();
            String ruc = txtRucA.getText();
            String razonSocial = txtRazonSocial.getText();
            String pais = txtPaisA.getText();
            Aerolinea objAerolinea = new Aerolinea(id, nombre, ruc, razonSocial, pais);
            objArregloAerolineas.editar(objAerolinea, id);
            objArregloAerolineas.listar(tblAerolinea);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una Aerolinea a editar");
        }


    }//GEN-LAST:event_btnEditarAActionPerformed

    private void btnEliminarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVueloActionPerformed
        int pos = tblAerolinea.getSelectedRow();
        if (pos != -1) {
            try {
                int id = Integer.parseInt(tblAerolinea.getValueAt(pos, 0).toString());
                int numVuelo = Integer.parseInt(tblAerolinea.getValueAt(pos, 1).toString());
                objArregloAerolineas.getAerolinea(id).getArregloVuelos().eliminar(numVuelo);
                objArregloAerolineas.getAerolinea(id).getArregloVuelos().listar(tblAerolinea);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Seleccion un Vuelo a eliminar");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccion un Vuelo a eliminar");
        }
    }//GEN-LAST:event_btnEliminarVueloActionPerformed

    private void btnEditarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarVueloActionPerformed
        int pos = tblAerolinea.getSelectedRow();
        if (pos != -1) {
            try {
                int id = Integer.parseInt(tblAerolinea.getValueAt(pos, 0).toString());
                int numVuelo = Integer.parseInt(tblAerolinea.getValueAt(pos, 1).toString());

                String ciudadDestino = txtCiudadDestino.getText();
                String estado = txtEstado.getText();
                Aerolinea objAerolinea = objArregloAerolineas.getAerolinea(Integer.parseInt(cboAerolinea.getSelectedItem().toString()));
                Vuelo objVuelo = new Vuelo(objAerolinea.getId(), numVuelo, ciudadDestino, estado, objAerolinea);
                if (objAerolinea.getId() == id) {
                    objArregloAerolineas.getAerolinea(id).getArregloVuelos().editar(objVuelo, numVuelo);
                } else {
                    objArregloAerolineas.getAerolinea(objAerolinea.getId()).getArregloVuelos().agregar(objVuelo);
                    objArregloAerolineas.getAerolinea(id).getArregloVuelos().eliminar(numVuelo);

                }
                objArregloAerolineas.getAerolinea(objAerolinea.getId()).getArregloVuelos().listar(tblAerolinea);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Seleccion un Vuelo a editar");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccion un Vuelo a editar");
        }
    }//GEN-LAST:event_btnEditarVueloActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        String filtro = txtBusqueda.getText();

        if (rdBtnNumVuelo.isSelected()) {
            objArregloAerolineas.buscarNumVuelo(tblAerolinea, filtro);
        } else if (rdBtnCiudadVuelo.isSelected()) {
            objArregloAerolineas.buscarCiudadDestino(tblAerolinea, filtro);
        } else {
            objArregloAerolineas.buscarEstadoVuelo(tblAerolinea, filtro);
        }

    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void tblAerolineaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAerolineaMouseClicked
        if (evt.getClickCount() == 2) {
            int pos = tblAerolinea.getSelectedRow();
            int id = Integer.parseInt(tblAerolinea.getValueAt(pos, 0).toString());

            objArregloAerolineas.getAerolinea(id).getArregloVuelos().listar(tblAerolinea);
        }
    }//GEN-LAST:event_tblAerolineaMouseClicked

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
    private javax.swing.JButton btnEditarA;
    private javax.swing.JButton btnEditarVuelo;
    private javax.swing.JButton btnEliminarA;
    private javax.swing.JButton btnEliminarVuelo;
    private javax.swing.JButton btnRegistrarA;
    private javax.swing.JButton btnRegistrarVuelo;
    private javax.swing.JButton btnVerAero;
    private javax.swing.JButton btnVerTodosVuelos;
    private javax.swing.JComboBox<String> cboAerolinea;
    private javax.swing.ButtonGroup grpBtnBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdBtnCiudadVuelo;
    private javax.swing.JRadioButton rdBtnEstado;
    private javax.swing.JRadioButton rdBtnNumVuelo;
    private javax.swing.JTable tblAerolinea;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCiudadDestino;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtIdAerolinea;
    private javax.swing.JTextField txtNombreA;
    private javax.swing.JTextField txtNumVuelo;
    private javax.swing.JTextField txtPaisA;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRucA;
    // End of variables declaration//GEN-END:variables

}
