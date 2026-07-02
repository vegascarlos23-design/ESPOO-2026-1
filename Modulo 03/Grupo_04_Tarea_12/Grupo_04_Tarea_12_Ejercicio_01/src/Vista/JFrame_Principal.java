package Vista;

import Control.Grafo;
import Control.NodoCentroLogistico;
import Modelo.CentroLogistico;
import Modelo.DetalleModalidad;
import Modelo.RutaOptima;
import Modelo.TramoEnvio;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class JFrame_Principal extends javax.swing.JFrame {

    DefaultComboBoxModel modComboOrigen = new DefaultComboBoxModel();
    DefaultComboBoxModel modComboDestino = new DefaultComboBoxModel();
    DefaultComboBoxModel modComboConsulta = new DefaultComboBoxModel();
    DefaultListModel modListaTramos = new DefaultListModel();
    DefaultListModel modListaModalidades = new DefaultListModel();

    Grafo objGrafo = new Grafo();

    public JFrame_Principal() {
        initComponents();
        cbo_Origen.setModel(modComboOrigen);
        cbo_Destino.setModel(modComboDestino);
        cbo_Consulta.setModel(modComboConsulta);
        cbo_Origen_1.setModel(modComboOrigen);
        cbo_Destino_1.setModel(modComboDestino);
        lst_Tramos.setModel(modListaTramos);
        lst_Modalidades.setModel(modListaModalidades);
        Acceso_controles_mostraar(false);
    }

    private void llenarCombos() {
        modComboDestino.removeAllElements();
        modComboOrigen.removeAllElements();
        modComboConsulta.removeAllElements();
        for (NodoCentroLogistico nodo : objGrafo.getLista()) {
            String nombre = nodo.getElemento().getNombre();
            modComboOrigen.addElement(nombre);
            modComboConsulta.addElement(nombre);
            modComboDestino.addElement(nombre);
        }
    }

    private void llenarListaTramos(ArrayList<TramoEnvio> tramos) {
        modListaTramos.removeAllElements();
        for (TramoEnvio tramo : tramos) {
            String destino = tramo.getDestino().getElemento().getNombre();
            modListaTramos.addElement("-> " + destino + " (" + tramo.getDetalles_modalidades().size() + " modalidades)");
        }
    }

    private void llenarListaModalidades(ArrayList<DetalleModalidad> modalidades) {
        modListaModalidades.removeAllElements();
        for (DetalleModalidad d : modalidades) {
            modListaModalidades.addElement(d.getTipo_modalidad() + " | " + d.getTiempo_transito() + " h | " + d.getHuella_carbono() + " t CO2");
        }
    }

    public void Acceso_controles_mostraar(boolean estado) {
        spn_peso.setEnabled(estado);
        lbl_peso_huella.setEnabled(estado);
        jLabel7.setEnabled(estado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_EditarCentro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_Tramos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbo_Origen = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_Codigo = new javax.swing.JTextField();
        cbo_Destino = new javax.swing.JComboBox<>();
        btn_Consultar = new javax.swing.JButton();
        btn_AgregarCentro = new javax.swing.JButton();
        btn_EliminarTramo = new javax.swing.JButton();
        cbo_Consulta = new javax.swing.JComboBox<>();
        btn_EliminarCentro = new javax.swing.JButton();
        btn_AgregarTramo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_Modalidades = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_Centros = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txt_NuevoNombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_Capacidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_EditarModalidad = new javax.swing.JButton();
        txt_Huella = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_AgregarModalidad = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txt_Tiempo = new javax.swing.JTextField();
        btn_EliminarModalidad = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cbo_Modalidad = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cbo_Origen_1 = new javax.swing.JComboBox<>();
        cbo_Destino_1 = new javax.swing.JComboBox<>();
        btn_matriz = new javax.swing.JButton();
        cbo_Criterio = new javax.swing.JComboBox<>();
        cbo_Modalidad_ruta = new javax.swing.JComboBox<>();
        spn_peso = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        lbl_peso_huella = new javax.swing.JLabel();
        btn_mostarr_ruta_optima = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btn_EditarCentro.setText("Editar centro");
        btn_EditarCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarCentroActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre");

        lst_Tramos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Listado de Tramos" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lst_Tramos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lst_TramosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lst_Tramos);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Origen:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Codigo");

        cbo_Origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_OrigenActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Destino");

        cbo_Destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_DestinoActionPerformed(evt);
            }
        });

        btn_Consultar.setText("Consultar");
        btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarActionPerformed(evt);
            }
        });

        btn_AgregarCentro.setText("Agregar Centro");
        btn_AgregarCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarCentroActionPerformed(evt);
            }
        });

        btn_EliminarTramo.setText("Eliminar Tramo");
        btn_EliminarTramo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarTramoActionPerformed(evt);
            }
        });

        cbo_Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_ConsultaActionPerformed(evt);
            }
        });

        btn_EliminarCentro.setText("Eliminar Centro");
        btn_EliminarCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarCentroActionPerformed(evt);
            }
        });

        btn_AgregarTramo.setText("Agregar Tramo");
        btn_AgregarTramo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarTramoActionPerformed(evt);
            }
        });

        lst_Modalidades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Listado de Modalidades" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lst_Modalidades);

        tbl_Centros.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_Centros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_CentrosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_Centros);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Nuevo nombre");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("TRAMOS");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Capacidad");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("CENTROS");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Huella");

        btn_EditarModalidad.setText("Editar Modalidad");
        btn_EditarModalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarModalidadActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Tiempo");

        btn_AgregarModalidad.setText("Agregar Modalidad");
        btn_AgregarModalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarModalidadActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("MODALIDADES");

        btn_EliminarModalidad.setText("Eliminar Modalidad");
        btn_EliminarModalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarModalidadActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Modalidad");

        cbo_Modalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maritimo", "Terrestre", "Aerero" }));
        cbo_Modalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_ModalidadActionPerformed(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Consultar centros:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta ruta", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12)))); // NOI18N

        cbo_Origen_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_Origen_1ActionPerformed(evt);
            }
        });

        cbo_Destino_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_Destino_1ActionPerformed(evt);
            }
        });

        btn_matriz.setText("Mostar Matriz de adyacencia");
        btn_matriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_matrizActionPerformed(evt);
            }
        });

        cbo_Criterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solo TIempo de Transito Total", "Solo Huella de carbono Total", "Métrica Ponderada" }));
        cbo_Criterio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_CriterioActionPerformed(evt);
            }
        });

        cbo_Modalidad_ruta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maritimo", "Terrestre", "Aerero" }));
        cbo_Modalidad_ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_Modalidad_rutaActionPerformed(evt);
            }
        });

        spn_peso.setModel(new javax.swing.SpinnerNumberModel(0.1d, 0.1d, 0.9d, 0.1d));
        spn_peso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn_pesoStateChanged(evt);
            }
        });

        jLabel7.setText("Peso de Tiempo:");

        lbl_peso_huella.setText("Entonces peso de Huella es: 0");

        btn_mostarr_ruta_optima.setText("Mostrar Ruta Óptima");
        btn_mostarr_ruta_optima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostarr_ruta_optimaActionPerformed(evt);
            }
        });

        jLabel8.setText("Inicio:");

        jLabel15.setText("Fin:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btn_matriz)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbo_Criterio, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbo_Modalidad_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_peso_huella)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(spn_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(btn_mostarr_ruta_optima))
                                .addGap(0, 20, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbo_Destino_1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_Origen_1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbo_Criterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_Modalidad_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spn_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_peso_huella)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_matriz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbo_Origen_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_Destino_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_mostarr_ruta_optima)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(220, 220, 220)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(btn_AgregarCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_EliminarCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_EditarCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_NuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txt_Tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txt_Huella, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(cbo_Modalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btn_AgregarModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(btn_EliminarModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(58, 58, 58)
                                            .addComponent(btn_EditarModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(31, 31, 31)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(cbo_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btn_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(65, 65, 65)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_Capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(73, 73, 73)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(cbo_Origen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(cbo_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(107, 107, 107)
                                            .addComponent(btn_AgregarTramo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_EliminarTramo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(13, 13, 13)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txt_Capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_AgregarCentro)
                                    .addComponent(btn_EliminarCentro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txt_NuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_EditarCentro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(cbo_Origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbo_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_AgregarTramo)
                                    .addComponent(btn_EliminarTramo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_Consultar)
                                    .addComponent(cbo_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cbo_Modalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_Tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_Huella, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_AgregarModalidad)
                            .addComponent(btn_EliminarModalidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_EditarModalidad))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EditarCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarCentroActionPerformed
        try {
            String nombre = txt_Nombre.getText();
            String nuevoNombre = txt_NuevoNombre.getText();
            String nuevoCodigo = txt_Codigo.getText();
            int nuevaCapacidad = Integer.parseInt(txt_Capacidad.getText());
            if (nombre.trim().isEmpty() ||nuevoNombre.trim().isEmpty() || nuevoCodigo.trim().isEmpty() || txt_Capacidad.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Escriba los datos completos", "ERROR", 0);
                return;
            }
            objGrafo.editarCentro(nombre, nuevoNombre, nuevoCodigo, nuevaCapacidad);
            txt_Nombre.setText("");
            txt_NuevoNombre.setText("");
            txt_Codigo.setText("");
            txt_Capacidad.setText("");
            txt_Nombre.requestFocus();
            llenarCombos();
            objGrafo.listarCentros(tbl_Centros);
        } catch (NumberFormatException g) {
            JOptionPane.showMessageDialog(rootPane, "Escriba los datos correctamente", "ERROR", 0);
        }
    }//GEN-LAST:event_btn_EditarCentroActionPerformed

    private void cbo_OrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_OrigenActionPerformed

    }//GEN-LAST:event_cbo_OrigenActionPerformed

    private void cbo_DestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_DestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_DestinoActionPerformed

    private void btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarActionPerformed
        String nombre = cbo_Consulta.getSelectedItem().toString();
        NodoCentroLogistico nodo = objGrafo.buscarCentro(nombre);
        if (nodo != null) {
            llenarListaTramos(nodo.getAdyacentes());
            if (!nodo.getAdyacentes().isEmpty()) {
                llenarListaModalidades(nodo.getAdyacentes().get(0).getDetalles_modalidades());
            }
        }
    }//GEN-LAST:event_btn_ConsultarActionPerformed

    private void btn_AgregarCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarCentroActionPerformed
        try {
            String nombre = txt_Nombre.getText();
            String codigo = txt_Codigo.getText();
            int capacidad = Integer.parseInt(txt_Capacidad.getText());
            if (nombre.trim().isEmpty() || codigo.trim().isEmpty() || txt_Capacidad.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Escriba los datos completos", "ERROR", 0);
                return;
            }
            objGrafo.agregar(new CentroLogistico(nombre, codigo, capacidad));
            txt_Nombre.setText("");
            txt_Codigo.setText("");
            txt_Capacidad.setText("");
            txt_Nombre.requestFocus();
            objGrafo.listarCentros(tbl_Centros);
            llenarCombos();
        } catch (NumberFormatException g) {
            JOptionPane.showMessageDialog(rootPane, "Escriba los datos correctamente", "ERROR", 0);
        }

    }//GEN-LAST:event_btn_AgregarCentroActionPerformed

    private void btn_EliminarTramoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarTramoActionPerformed
        String origen = cbo_Origen.getSelectedItem().toString();
        String destino = cbo_Destino.getSelectedItem().toString();
        objGrafo.eliminarTramo(origen, destino);
        cbo_Origen.setSelectedIndex(-1);
        cbo_Destino.setSelectedIndex(-1);
        objGrafo.listarCentros(tbl_Centros);
        llenarListaTramos(objGrafo.buscarCentro(origen).getAdyacentes());
    }//GEN-LAST:event_btn_EliminarTramoActionPerformed

    private void cbo_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_ConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_ConsultaActionPerformed

    private void btn_EliminarCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarCentroActionPerformed
        String nombre = txt_Nombre.getText();
        objGrafo.eliminar(nombre);
        txt_Nombre.setText("");
        txt_Nombre.requestFocus();
        llenarCombos();
        objGrafo.listarCentros(tbl_Centros);
    }//GEN-LAST:event_btn_EliminarCentroActionPerformed

    private void btn_AgregarTramoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarTramoActionPerformed
        try {
            String origen = cbo_Origen.getSelectedItem().toString();
            String destino = cbo_Destino.getSelectedItem().toString();

            objGrafo.agregarTramo(origen, destino);
            objGrafo.listarCentros(tbl_Centros);
            llenarListaTramos(objGrafo.buscarCentro(origen).getAdyacentes());
        } catch (NullPointerException t) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione todos los datos necesarios", "ERROR", 0);
        }

    }//GEN-LAST:event_btn_AgregarTramoActionPerformed

    private void btn_EditarModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarModalidadActionPerformed
        try {
            String origen = cbo_Origen.getSelectedItem().toString();
            String destino = cbo_Destino.getSelectedItem().toString();
            String tipo = cbo_Modalidad.getSelectedItem().toString();
            double tiempo = Double.parseDouble(txt_Tiempo.getText());
            double huella = Double.parseDouble(txt_Huella.getText());
            if (txt_Tiempo.getText().trim().isEmpty() || txt_Huella.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Escriba los datos completos", "ERROR", 0);
                return;
            }
            objGrafo.editarModalidadDeTramo(origen, destino, new DetalleModalidad(tipo, tiempo, huella));
            txt_Tiempo.setText("");
            txt_Huella.setText("");
            btn_ConsultarActionPerformed(null);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Selecione los datos necesario", "ERROR", 0);
        } catch (NumberFormatException h) {
            JOptionPane.showMessageDialog(rootPane, "Escriba los datos correctamente", "ERROR", 0);
        }
    }//GEN-LAST:event_btn_EditarModalidadActionPerformed

    private void btn_AgregarModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarModalidadActionPerformed
        try {
            String origen = cbo_Origen.getSelectedItem().toString();
            String destino = cbo_Destino.getSelectedItem().toString();
            String tipo = cbo_Modalidad.getSelectedItem().toString();
            double tiempo = Double.parseDouble(txt_Tiempo.getText());
            double huella = Double.parseDouble(txt_Huella.getText());
            if (txt_Tiempo.getText().trim().isEmpty() || txt_Huella.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Escriba los datos completos", "ERROR", 0);
                return;
            }
            objGrafo.agregarModalidadATramo(origen, destino, new DetalleModalidad(tipo, tiempo, huella));
            txt_Tiempo.setText("");
            txt_Huella.setText("");
            btn_ConsultarActionPerformed(null);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Selecione los datos necesario", "ERROR", 0);
        } catch (NumberFormatException h) {
            JOptionPane.showMessageDialog(rootPane, "Escriba los datos correctamente", "ERROR", 0);
        }

    }//GEN-LAST:event_btn_AgregarModalidadActionPerformed

    private void btn_EliminarModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarModalidadActionPerformed
        String origen = cbo_Origen.getSelectedItem().toString();
        String destino = cbo_Destino.getSelectedItem().toString();
        String tipo = cbo_Modalidad.getSelectedItem().toString();
        objGrafo.eliminarModalidadDeTramo(origen, destino, tipo);
        btn_ConsultarActionPerformed(null);
    }//GEN-LAST:event_btn_EliminarModalidadActionPerformed

    private void cbo_ModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_ModalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_ModalidadActionPerformed

    private void lst_TramosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lst_TramosMouseClicked
        String nombre = cbo_Consulta.getSelectedItem().toString();
        NodoCentroLogistico nodo = objGrafo.buscarCentro(nombre);
        int idx = lst_Tramos.getSelectedIndex();
        if (nodo != null && idx != -1) {
            llenarListaModalidades(nodo.getAdyacentes().get(idx).getDetalles_modalidades());
        }
    }//GEN-LAST:event_lst_TramosMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        objGrafo.listarCentros(tbl_Centros);
        llenarCombos();
    }//GEN-LAST:event_formWindowOpened

    private void tbl_CentrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_CentrosMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tbl_CentrosMouseClicked

    private void cbo_Origen_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_Origen_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_Origen_1ActionPerformed

    private void cbo_Destino_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_Destino_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_Destino_1ActionPerformed

    private void btn_matrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_matrizActionPerformed
        // TODO add your handling code here:
        int criterio = cbo_Criterio.getSelectedIndex() + 1;
        String modalidad = cbo_Modalidad_ruta.getSelectedItem().toString();
        double pesotiempo = 1;
        double pesohuella = 1;
        if (criterio == 3) {
            pesotiempo = (double) spn_peso.getValue();
            pesohuella = 1 - pesotiempo;
        }
        JDialog_Matriz objDialog_Matriz = new JDialog_Matriz(this, true, objGrafo, criterio, modalidad, pesotiempo, pesohuella);
        objDialog_Matriz.setLocationRelativeTo(this);
        objDialog_Matriz.setVisible(true);
    }//GEN-LAST:event_btn_matrizActionPerformed

    private void cbo_Modalidad_rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_Modalidad_rutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_Modalidad_rutaActionPerformed

    private void cbo_CriterioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_CriterioActionPerformed
        // TODO add your handling code here:
        int criterio = cbo_Criterio.getSelectedIndex() + 1;
        if (criterio == 3) {
            Acceso_controles_mostraar(true);
        } else {
            Acceso_controles_mostraar(false);
        }
    }//GEN-LAST:event_cbo_CriterioActionPerformed

    private void spn_pesoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn_pesoStateChanged
        // TODO add your handling code here:
        double pesotiempo = (double) spn_peso.getValue();
        double pesohuella = 1 - pesotiempo;
        lbl_peso_huella.setText("Entonces peso de Huella es: " + String.format("%.1f", pesohuella));
    }//GEN-LAST:event_spn_pesoStateChanged

    private void btn_mostarr_ruta_optimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostarr_ruta_optimaActionPerformed
        // TODO add your handling code here:
        String origen = cbo_Origen_1.getSelectedItem().toString();
        String destino = cbo_Destino_1.getSelectedItem().toString();
        int criterio = cbo_Criterio.getSelectedIndex() + 1;
        String modalidad = cbo_Modalidad_ruta.getSelectedItem().toString();
        double pesotiempo = 1;
        double pesohuella = 1;
        if (criterio == 3) {
            pesotiempo = (double) spn_peso.getValue();
            pesohuella = 1 - pesotiempo;
        }

        if (cbo_Origen_1.getSelectedIndex() != -1 || cbo_Destino_1.getSelectedIndex() != -1) {
            RutaOptima ruta = objGrafo.RutaOptima(origen, destino, criterio, modalidad, pesotiempo, pesohuella);
            if (ruta.getCosto() != -1) {
                JOptionPane.showMessageDialog(rootPane, "Ruta:\n" + ruta.getRuta() + "\n\nCosto total: " + String.format("%.2f", ruta.getCosto()), "RUTA ÓPTIMA", 1);
            } else {
                JOptionPane.showMessageDialog(rootPane, ruta.getRuta(), "RUTA ÓPTIMA NO ENCONTRADA", 2);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione el detino y fin de la ruta\nsi no hay registrado, le recomendamos que registre", "ERROR", 0);
        }
    }//GEN-LAST:event_btn_mostarr_ruta_optimaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AgregarCentro;
    private javax.swing.JButton btn_AgregarModalidad;
    private javax.swing.JButton btn_AgregarTramo;
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JButton btn_EditarCentro;
    private javax.swing.JButton btn_EditarModalidad;
    private javax.swing.JButton btn_EliminarCentro;
    private javax.swing.JButton btn_EliminarModalidad;
    private javax.swing.JButton btn_EliminarTramo;
    private javax.swing.JButton btn_matriz;
    private javax.swing.JButton btn_mostarr_ruta_optima;
    private javax.swing.JComboBox<String> cbo_Consulta;
    private javax.swing.JComboBox<String> cbo_Criterio;
    private javax.swing.JComboBox<String> cbo_Destino;
    private javax.swing.JComboBox<String> cbo_Destino_1;
    private javax.swing.JComboBox<String> cbo_Modalidad;
    private javax.swing.JComboBox<String> cbo_Modalidad_ruta;
    private javax.swing.JComboBox<String> cbo_Origen;
    private javax.swing.JComboBox<String> cbo_Origen_1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_peso_huella;
    private javax.swing.JList<String> lst_Modalidades;
    private javax.swing.JList<String> lst_Tramos;
    private javax.swing.JSpinner spn_peso;
    private javax.swing.JTable tbl_Centros;
    private javax.swing.JTextField txt_Capacidad;
    private javax.swing.JTextField txt_Codigo;
    private javax.swing.JTextField txt_Huella;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_NuevoNombre;
    private javax.swing.JTextField txt_Tiempo;
    // End of variables declaration//GEN-END:variables
}
