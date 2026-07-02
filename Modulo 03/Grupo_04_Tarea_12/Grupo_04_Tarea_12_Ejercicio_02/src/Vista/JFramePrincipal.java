package Vista;

import Control.DetalleMedio;
import Control.EnlaceDatos;
import Control.Grafo;
import Control.NodoConmutacion;
import Modelo.NodoRed;
import java.util.ArrayList;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class JFramePrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFramePrincipal.class.getName());

    private Grafo objGrafo = new Grafo();
    
    
    private void LlenarCombos() {
        objGrafo.CargarCombo(cboNodoConOrigen);
        objGrafo.CargarCombo(cboNodoConDestino);
        objGrafo.CargarCombo(cboNodoConPrincipal);
        objGrafo.CargarCombo(cboNodoConOrigenRuta);
        objGrafo.CargarCombo(cboNodoConDestinoRuta);
    }
    
    private void LimpiarCampos () {
        txtNombreNodoCon.setText("");
        txtProveedorHardware.setText("");
        txtAnchoBandaMax.setText("");
    }
    
    private void ListarDfs(String nombre) {
        NodoConmutacion root = objGrafo.BuscarNodo(nombre);
        objGrafo.ListarDfs(tblNodosConmutativos, root);
    }
    
    private void ListarBfs(String nombre) {
        NodoConmutacion root = objGrafo.BuscarNodo(nombre);
        objGrafo.ListarBfs(tblNodosConmutativos, root);
    }
    
    public JFramePrincipal() {
        initComponents();
        LlenarCombos();
        ListarDfs("");
        objGrafo.ListarEnlaces(tblEnlaces);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupPrioridad = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreNodoCon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtProveedorHardware = new javax.swing.JTextField();
        btnAgregarNodoCon = new javax.swing.JButton();
        btnEditarNodoCon = new javax.swing.JButton();
        btnEliminarNodoCon = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtAnchoBandaMax = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboNodoConOrigen = new javax.swing.JComboBox<>();
        cboNodoConDestino = new javax.swing.JComboBox<>();
        btnAgregarEnlace = new javax.swing.JButton();
        btnEliminarEnlace = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEnlaces = new javax.swing.JTable();
        btnAgregarMedio = new javax.swing.JButton();
        btnEditarMedio = new javax.swing.JButton();
        btnEliminarMedio = new javax.swing.JButton();
        btnVerMedios = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNodosConmutativos = new javax.swing.JTable();
        btnListarAnchura = new javax.swing.JButton();
        btnListarProfundidad = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cboNodoConPrincipal = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cboNodoConOrigenRuta = new javax.swing.JComboBox<>();
        cboNodoConDestinoRuta = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboTipoDeSoporteRuta = new javax.swing.JComboBox<>();
        rdBtnLatenciaMin = new javax.swing.JRadioButton();
        rdBtnTasaPerdidaMin = new javax.swing.JRadioButton();
        rdBtnMetricaPonderadaMin = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        spnLatenciaPorcentaje = new javax.swing.JSpinner();
        btnMostrarRutaOptima = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nodo de Red"));

        jLabel1.setText("Nombre");

        jLabel2.setText("Proveedor de Hardware");

        btnAgregarNodoCon.setText("Agregar");
        btnAgregarNodoCon.addActionListener(this::btnAgregarNodoConActionPerformed);

        btnEditarNodoCon.setText("Editar");
        btnEditarNodoCon.addActionListener(this::btnEditarNodoConActionPerformed);

        btnEliminarNodoCon.setText("Eliminar");
        btnEliminarNodoCon.addActionListener(this::btnEliminarNodoConActionPerformed);

        jLabel8.setText("Ancho de Banda Max");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreNodoCon))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregarNodoCon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarNodoCon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarNodoCon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtProveedorHardware))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtAnchoBandaMax)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreNodoCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtProveedorHardware, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAnchoBandaMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarNodoCon)
                    .addComponent(btnEditarNodoCon)
                    .addComponent(btnEliminarNodoCon))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Enlace de Datos"));

        jLabel3.setText("Nodo Con. de Origen");

        jLabel4.setText("Nodo Con. de Destino");

        cboNodoConOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboNodoConDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAgregarEnlace.setText("Agregar Enlace");
        btnAgregarEnlace.addActionListener(this::btnAgregarEnlaceActionPerformed);

        btnEliminarEnlace.setText("Eliminar Enlace");
        btnEliminarEnlace.addActionListener(this::btnEliminarEnlaceActionPerformed);

        tblEnlaces.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblEnlaces);

        btnAgregarMedio.setText("Agregar Medio");
        btnAgregarMedio.addActionListener(this::btnAgregarMedioActionPerformed);

        btnEditarMedio.setText("Editar Medio");
        btnEditarMedio.addActionListener(this::btnEditarMedioActionPerformed);

        btnEliminarMedio.setText("Eliminar Medio");
        btnEliminarMedio.addActionListener(this::btnEliminarMedioActionPerformed);

        btnVerMedios.setText("Ver Medios");
        btnVerMedios.addActionListener(this::btnVerMediosActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboNodoConOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboNodoConDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarEnlace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarEnlace, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(btnVerMedios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboNodoConOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarEnlace))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboNodoConDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarEnlace))
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAgregarMedio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarMedio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarMedio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerMedios)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblNodosConmutativos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblNodosConmutativos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNodosConmutativosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNodosConmutativos);

        btnListarAnchura.setText("Listar Por Anchura");
        btnListarAnchura.addActionListener(this::btnListarAnchuraActionPerformed);

        btnListarProfundidad.setText("Listar Por Profundidad");
        btnListarProfundidad.addActionListener(this::btnListarProfundidadActionPerformed);

        jLabel7.setText("Nodo de Red Principal");

        cboNodoConPrincipal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboNodoConPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarAnchura, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarProfundidad, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarAnchura)
                    .addComponent(btnListarProfundidad)
                    .addComponent(jLabel7)
                    .addComponent(cboNodoConPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Rutas Optimas"));

        jLabel6.setText("Nodo Red Origen");

        cboNodoConOrigenRuta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboNodoConDestinoRuta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Nodo Red Destino");

        jLabel5.setText("Tipo de Soporte");

        cboTipoDeSoporteRuta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cualquiera", "Cobre", "Fibra Optica", "Satelital" }));

        btnGroupPrioridad.add(rdBtnLatenciaMin);
        rdBtnLatenciaMin.setSelected(true);
        rdBtnLatenciaMin.setText("Latencia minima");
        rdBtnLatenciaMin.addActionListener(this::rdBtnLatenciaMinActionPerformed);

        btnGroupPrioridad.add(rdBtnTasaPerdidaMin);
        rdBtnTasaPerdidaMin.setText("Tasa de Perdida minima");
        rdBtnTasaPerdidaMin.addActionListener(this::rdBtnTasaPerdidaMinActionPerformed);

        btnGroupPrioridad.add(rdBtnMetricaPonderadaMin);
        rdBtnMetricaPonderadaMin.setText("Metrica Ponderada minima");
        rdBtnMetricaPonderadaMin.addActionListener(this::rdBtnMetricaPonderadaMinActionPerformed);

        jLabel10.setText("Porcentaje de Latencia (%) ");

        spnLatenciaPorcentaje.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spnLatenciaPorcentaje.setEnabled(false);

        btnMostrarRutaOptima.setText("Mostrar Ruta Optima");
        btnMostrarRutaOptima.addActionListener(this::btnMostrarRutaOptimaActionPerformed);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboNodoConOrigenRuta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboNodoConDestinoRuta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cboTipoDeSoporteRuta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdBtnLatenciaMin)
                            .addComponent(rdBtnTasaPerdidaMin)
                            .addComponent(rdBtnMetricaPonderadaMin))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(btnMostrarRutaOptima))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnLatenciaPorcentaje)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboNodoConOrigenRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cboNodoConDestinoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboTipoDeSoporteRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdBtnLatenciaMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdBtnTasaPerdidaMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdBtnMetricaPonderadaMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(spnLatenciaPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMostrarRutaOptima)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
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

    private void btnAgregarNodoConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarNodoConActionPerformed
        try {
            String nombre = txtNombreNodoCon.getText();
            String proveedorHardware = txtProveedorHardware.getText();
            int anchoBandaMax = Integer.parseInt(txtAnchoBandaMax.getText());

            NodoRed elemento = new NodoRed(nombre, proveedorHardware, anchoBandaMax);
            objGrafo.AgregarNodo(elemento);

            LlenarCombos();
            ListarDfs(cboNodoConPrincipal.getSelectedItem().toString());
            LimpiarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        }
    }//GEN-LAST:event_btnAgregarNodoConActionPerformed

    private void btnEditarNodoConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarNodoConActionPerformed
        int pos = tblNodosConmutativos.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un Nodo Red a Editar");
            return;
        }

        try {
            String nombreEditar = tblNodosConmutativos.getValueAt(pos, 0).toString();
            String nombre = txtNombreNodoCon.getText();
            String proveedorHardware = txtProveedorHardware.getText();
            int anchoBandaMax = Integer.parseInt(txtAnchoBandaMax.getText());

            Object[] elemento = new Object[]{nombre,proveedorHardware,anchoBandaMax};

            objGrafo.EditarNodo(nombreEditar, elemento);
            LlenarCombos();
            ListarDfs(cboNodoConPrincipal.getSelectedItem().toString());
            objGrafo.ListarEnlaces(tblEnlaces);
            LimpiarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        }
    }//GEN-LAST:event_btnEditarNodoConActionPerformed

    private void btnEliminarNodoConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarNodoConActionPerformed
        int pos = tblNodosConmutativos.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un Nodo Red a Eliminar");
            return;
        }

        String nombreEliminar = tblNodosConmutativos.getValueAt(pos, 0).toString();

        objGrafo.EliminarNodo(nombreEliminar);
        LlenarCombos();
        ListarDfs(cboNodoConPrincipal.getSelectedItem().toString());
        objGrafo.ListarEnlaces(tblEnlaces);
        LimpiarCampos();
    }//GEN-LAST:event_btnEliminarNodoConActionPerformed

    private void btnAgregarEnlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEnlaceActionPerformed
        try {
            String origen = cboNodoConOrigen.getSelectedItem().toString();
            String destino = cboNodoConDestino.getSelectedItem().toString();

            NodoConmutacion nodoDestino = objGrafo.BuscarNodo(destino);

            EnlaceDatos elemento = new EnlaceDatos(nodoDestino);
            objGrafo.AgregarConexion(origen, elemento);
            ListarDfs(cboNodoConPrincipal.getSelectedItem().toString());
            objGrafo.ListarEnlaces(tblEnlaces);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos validos");
        }
    }//GEN-LAST:event_btnAgregarEnlaceActionPerformed

    private void btnEliminarEnlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEnlaceActionPerformed
        if (cboNodoConOrigen.getSelectedItem() == null) return;
        String origen = cboNodoConOrigen.getSelectedItem().toString();
        String destino = cboNodoConDestino.getSelectedItem().toString();

        objGrafo.EliminarConexion(origen, destino);
        ListarDfs(cboNodoConPrincipal.getSelectedItem().toString());
    }//GEN-LAST:event_btnEliminarEnlaceActionPerformed

    private void btnListarAnchuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAnchuraActionPerformed
        if (cboNodoConPrincipal.getSelectedItem() == null) return;
        String principal = cboNodoConPrincipal.getSelectedItem().toString();
        
        ListarBfs(principal);
    }//GEN-LAST:event_btnListarAnchuraActionPerformed

    private void btnListarProfundidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProfundidadActionPerformed
        if (cboNodoConPrincipal.getSelectedItem() == null) return;
        String principal = cboNodoConPrincipal.getSelectedItem().toString();
        
        ListarDfs(principal);
    }//GEN-LAST:event_btnListarProfundidadActionPerformed

    private void btnAgregarMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMedioActionPerformed
        int pos = tblEnlaces.getSelectedRow();
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un Enlace");
            return;
        }
        String origen = tblEnlaces.getValueAt(pos, 0).toString();
        String destino = tblEnlaces.getValueAt(pos, 1).toString();
        
        JComboBox cboTipoSoporte = new JComboBox(new String[]{"Cobre","Fibra Optica","Satelital"});
        JTextField txtLatenciaMs = new JTextField();
        JTextField txtTasaPerdida = new JTextField();
        
        Object[] msg = {
            "Tipo de Soporte: " , cboTipoSoporte,
            "Latencia (ms): " , txtLatenciaMs,
            "Tasa de Perdida" , txtTasaPerdida
        };
        
        int rpta = JOptionPane.showConfirmDialog(rootPane, msg, "Agregar Medio", ConfirmationCallback.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        if (rpta != JOptionPane.OK_OPTION) return;
            
        String tipoSoporte = cboTipoSoporte.getSelectedItem().toString();
        double latenciaMs = Double.parseDouble(txtLatenciaMs.getText());
        double tasaPerdida = Double.parseDouble(txtTasaPerdida.getText());
        
        DetalleMedio elemento = new DetalleMedio(tipoSoporte, latenciaMs, tasaPerdida);
        EnlaceDatos objDatos = objGrafo.BuscarNodo(origen).BuscarArista(destino);
        objDatos.AgregarDetallesMedios(elemento);        
    }//GEN-LAST:event_btnAgregarMedioActionPerformed

    private void btnEditarMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarMedioActionPerformed
        int pos = tblEnlaces.getSelectedRow();

        if(pos == -1){
            JOptionPane.showMessageDialog(rootPane,"Seleccione un Enlace");
            return;
        }

        String origen = tblEnlaces.getValueAt(pos, 0).toString();
        String destino = tblEnlaces.getValueAt(pos, 1).toString();
        EnlaceDatos enlace = objGrafo.BuscarNodo(origen).BuscarArista(destino);

        if(enlace.getDetallesMedios().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"El enlace no tiene medios registrados");
            return;
        }
        
        JComboBox<String> cboTipoSoporte = new JComboBox<>();
        JTextField txtLatenciaMs = new JTextField();
        JTextField txtTasaPerdida = new JTextField();
        
        for (DetalleMedio dm : enlace.getDetallesMedios()) {
            cboTipoSoporte.addItem(dm.getTipoSoporte());
        }

        String tipoInicial = cboTipoSoporte.getItemAt(0);
        DetalleMedio dmInicial = enlace.BuscarDetalleMedio(tipoInicial);

        txtLatenciaMs.setText(String.valueOf(dmInicial.getLatenciaMs()));

        txtTasaPerdida.setText(String.valueOf(dmInicial.getTasaPerdida()));

        // Cambiar los datos al seleccionar otro tipo
        cboTipoSoporte.addActionListener(e -> {
            String tipo = cboTipoSoporte.getSelectedItem().toString();

            DetalleMedio dm = enlace.BuscarDetalleMedio(tipo);

            txtLatenciaMs.setText(String.valueOf(dm.getLatenciaMs()));

            txtTasaPerdida.setText(String.valueOf(dm.getTasaPerdida()));
        });

        Object[] msg = {
            "Tipo de Soporte:", cboTipoSoporte,
            "Latencia (ms):", txtLatenciaMs,
            "Tasa de Perdida:", txtTasaPerdida
        };

        int rpta = JOptionPane.showConfirmDialog(rootPane,msg,"Editar Medio",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        if(rpta != JOptionPane.OK_OPTION) return;

        String tipoSoporte = cboTipoSoporte.getSelectedItem().toString();
        double latenciaMs = Double.parseDouble(txtLatenciaMs.getText());
        double tasaPerdida = Double.parseDouble(txtTasaPerdida.getText());

        DetalleMedio dm = new DetalleMedio(tipoSoporte,latenciaMs,tasaPerdida);

        objGrafo.EditarConexion(origen,destino,dm);
    }//GEN-LAST:event_btnEditarMedioActionPerformed

    private void btnEliminarMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMedioActionPerformed
        int pos = tblEnlaces.getSelectedRow();

        if(pos == -1){
            JOptionPane.showMessageDialog(rootPane,"Seleccione un Enlace");
            return;
        }

        String origen = tblEnlaces.getValueAt(pos, 0).toString();
        String destino = tblEnlaces.getValueAt(pos, 1).toString();
        
        EnlaceDatos enlace = objGrafo.BuscarNodo(origen).BuscarArista(destino);
        JComboBox<String> cboTipoSoporte = new JComboBox<>();
        
        for (DetalleMedio dm : enlace.getDetallesMedios()) {
            cboTipoSoporte.addItem(dm.getTipoSoporte());
        }

        int rpta = JOptionPane.showConfirmDialog(rootPane,cboTipoSoporte,"Seleccione el soporte a eliminar",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);

        if(rpta != JOptionPane.OK_OPTION) return;
        String tipoSoporte =cboTipoSoporte.getSelectedItem().toString();

        enlace.EliminarDetallesMedios(tipoSoporte);
    }//GEN-LAST:event_btnEliminarMedioActionPerformed

    private void btnVerMediosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMediosActionPerformed
        int pos = tblEnlaces.getSelectedRow();

        if(pos == -1){
            JOptionPane.showMessageDialog(rootPane,"Seleccione un Enlace");
            return;
        }

        String origen = tblEnlaces.getValueAt(pos, 0).toString();
        String destino = tblEnlaces.getValueAt(pos, 1).toString();

        EnlaceDatos enlace =objGrafo.BuscarNodo(origen).BuscarArista(destino);

        if(enlace.getDetallesMedios().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"El enlace no tiene medios registrados");
            return;
        }

        String info = "";

        for(DetalleMedio dm : enlace.getDetallesMedios()){

            info += "Tipo de Soporte: " + dm.getTipoSoporte() + "\n";

            info += "Latencia (ms): "+ dm.getLatenciaMs() + "\n";

            info += "Tasa de Perdida: " + dm.getTasaPerdida() + "\n\n";
        }

        JTextArea txtInfo = new JTextArea(info);
        txtInfo.setEditable(false);

        JOptionPane.showMessageDialog(rootPane,new JScrollPane(txtInfo),"Medios del Enlace",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnVerMediosActionPerformed

    private void tblNodosConmutativosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNodosConmutativosMouseClicked
        int pos = tblNodosConmutativos.getSelectedRow();
        
        if (pos == -1) return;
        
        txtNombreNodoCon.setText(tblNodosConmutativos.getValueAt(pos, 0).toString());
        txtProveedorHardware.setText(tblNodosConmutativos.getValueAt(pos, 1).toString());
        txtAnchoBandaMax.setText(tblNodosConmutativos.getValueAt(pos, 2).toString());
    }//GEN-LAST:event_tblNodosConmutativosMouseClicked

    private void btnMostrarRutaOptimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRutaOptimaActionPerformed
        if (cboNodoConOrigenRuta.getSelectedItem() == null) return;
        
        String origen = cboNodoConOrigenRuta.getSelectedItem().toString();
        String destino = cboNodoConDestinoRuta.getSelectedItem().toString();
        NodoConmutacion nodoOrigen = objGrafo.BuscarNodo(origen);
        NodoConmutacion nodoDestino = objGrafo.BuscarNodo(destino);
        
        String tipo = cboTipoDeSoporteRuta.getSelectedItem().toString();
        
        double porcentaje = Double.parseDouble(spnLatenciaPorcentaje.getValue().toString());
        double pesoLatencia = porcentaje/100;
        
        int prioridad;
        if (rdBtnLatenciaMin.isSelected()) prioridad = 1;
        else if (rdBtnTasaPerdidaMin.isSelected()) prioridad = 2;
        else prioridad = 3;
        
        ArrayList<String> ruta = objGrafo.Dijkstra(nodoOrigen, nodoDestino, tipo, prioridad, pesoLatencia);
        if(ruta.isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"No existe una ruta");
            return;
        }

        String recorrido = "";

        for(String nodo : ruta){
            recorrido += nodo + " -> ";
        }

        recorrido = recorrido.substring(0, recorrido.length() - 4);

        JOptionPane.showMessageDialog(rootPane,"Ruta óptima:\n" + recorrido +"\n\nCosto Total: " + nodoDestino.getDistancia());
    }//GEN-LAST:event_btnMostrarRutaOptimaActionPerformed

    private void rdBtnMetricaPonderadaMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnMetricaPonderadaMinActionPerformed
        spnLatenciaPorcentaje.setEnabled(true);
    }//GEN-LAST:event_rdBtnMetricaPonderadaMinActionPerformed

    private void rdBtnTasaPerdidaMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnTasaPerdidaMinActionPerformed
        spnLatenciaPorcentaje.setEnabled(false);
    }//GEN-LAST:event_rdBtnTasaPerdidaMinActionPerformed

    private void rdBtnLatenciaMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnLatenciaMinActionPerformed
        spnLatenciaPorcentaje.setEnabled(false);
    }//GEN-LAST:event_rdBtnLatenciaMinActionPerformed


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
    private javax.swing.JButton btnAgregarEnlace;
    private javax.swing.JButton btnAgregarMedio;
    private javax.swing.JButton btnAgregarNodoCon;
    private javax.swing.JButton btnEditarMedio;
    private javax.swing.JButton btnEditarNodoCon;
    private javax.swing.JButton btnEliminarEnlace;
    private javax.swing.JButton btnEliminarMedio;
    private javax.swing.JButton btnEliminarNodoCon;
    private javax.swing.ButtonGroup btnGroupPrioridad;
    private javax.swing.JButton btnListarAnchura;
    private javax.swing.JButton btnListarProfundidad;
    private javax.swing.JButton btnMostrarRutaOptima;
    private javax.swing.JButton btnVerMedios;
    private javax.swing.JComboBox<String> cboNodoConDestino;
    private javax.swing.JComboBox<String> cboNodoConDestinoRuta;
    private javax.swing.JComboBox<String> cboNodoConOrigen;
    private javax.swing.JComboBox<String> cboNodoConOrigenRuta;
    private javax.swing.JComboBox<String> cboNodoConPrincipal;
    private javax.swing.JComboBox<String> cboTipoDeSoporteRuta;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rdBtnLatenciaMin;
    private javax.swing.JRadioButton rdBtnMetricaPonderadaMin;
    private javax.swing.JRadioButton rdBtnTasaPerdidaMin;
    private javax.swing.JSpinner spnLatenciaPorcentaje;
    private javax.swing.JTable tblEnlaces;
    private javax.swing.JTable tblNodosConmutativos;
    private javax.swing.JTextField txtAnchoBandaMax;
    private javax.swing.JTextField txtNombreNodoCon;
    private javax.swing.JTextField txtProveedorHardware;
    // End of variables declaration//GEN-END:variables

}
