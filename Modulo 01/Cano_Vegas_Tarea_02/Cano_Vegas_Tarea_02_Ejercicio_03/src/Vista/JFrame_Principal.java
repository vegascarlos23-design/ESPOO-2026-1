package Vista;

import Control.Arreglo_Departamentos;
import Modelo.Departamento;
import Modelo.Proyecto;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JFrame_Principal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFrame_Principal.class.getName());
    Arreglo_Departamentos objArreglo_Departamentos = new Arreglo_Departamentos();
    Departamento objDepartamento;
    Proyecto objProyecto;

    public JFrame_Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_RegistrarDepartamento = new javax.swing.JButton();
        btn_EditarDepartamento = new javax.swing.JButton();
        btn_EliminarDepartamento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DatosDepartamentos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txt_FiltroIDDepartamento = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btn_RegistrarProyecto = new javax.swing.JButton();
        btn_EditarProyecto = new javax.swing.JButton();
        btn_EliminarProyecto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_DatosProyectos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_FiltroIDProyecto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Departamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 14))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar departamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        btn_RegistrarDepartamento.setText("Registrar departamento");
        btn_RegistrarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarDepartamentoActionPerformed(evt);
            }
        });

        btn_EditarDepartamento.setText("Editar departamento");
        btn_EditarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarDepartamentoActionPerformed(evt);
            }
        });

        btn_EliminarDepartamento.setText("Eliminar departamento");
        btn_EliminarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarDepartamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_RegistrarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_EditarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_EliminarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_RegistrarDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btn_EditarDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_EliminarDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tbl_DatosDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_DatosDepartamentos);

        jLabel3.setText("Filtrar por ID de departamento:");

        txt_FiltroIDDepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_FiltroIDDepartamentoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_FiltroIDDepartamento))
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_FiltroIDDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proyectos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 14))); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar proyectos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        btn_RegistrarProyecto.setText("Registrar proyecto");
        btn_RegistrarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarProyectoActionPerformed(evt);
            }
        });

        btn_EditarProyecto.setText("Editar proyecto");
        btn_EditarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarProyectoActionPerformed(evt);
            }
        });

        btn_EliminarProyecto.setText("Eliminar proyecto");
        btn_EliminarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarProyectoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_RegistrarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_EditarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_EliminarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_EliminarProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btn_RegistrarProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_EditarProyecto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tbl_DatosProyectos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_DatosProyectos);

        jLabel1.setText("Filtrar por ID de proyecto:");

        txt_FiltroIDProyecto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_FiltroIDProyectoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_FiltroIDProyecto))
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_FiltroIDProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarDepartamentoActionPerformed
        JTextField txt_ID = new JTextField();
        JTextField txt_Nombre = new JTextField();
        JTextField txt_NumeroEmpleados = new JTextField();
        JTextField txt_Jefe = new JTextField();
        JTextField txt_Ubicacion = new JTextField();

        Object[] mensaje = {
            "ID: ", txt_ID,
            "Nombre: ", txt_Nombre,
            "Número de empleados: ", txt_NumeroEmpleados,
            "Jefe a cargo: ", txt_Jefe,
            "Ubicación: ", txt_Ubicacion
        };

        int opcion = JOptionPane.showConfirmDialog(rootPane, mensaje, "Registro de categorías", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (opcion == JOptionPane.OK_OPTION) {
            try {
                int id = Integer.parseInt(txt_ID.getText());
                String nombre = txt_Nombre.getText();
                int numero_empleados = Integer.parseInt(txt_NumeroEmpleados.getText());
                String jefe = txt_Jefe.getText();
                String ubicacion = txt_Ubicacion.getText();

                objDepartamento = new Departamento(id, nombre, numero_empleados, jefe, ubicacion);
                objArreglo_Departamentos.Registrar_Departamento(objDepartamento);
                objArreglo_Departamentos.Listar_Departamentos(tbl_DatosDepartamentos);
            } catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(null, "Ingrese valores adecuados en cada campo.");
            }
        }
    }//GEN-LAST:event_btn_RegistrarDepartamentoActionPerformed

    private void btn_EditarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarDepartamentoActionPerformed
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del departamento a editar: "));

        int fila = -1;
        for (int r = 0; r < tbl_DatosDepartamentos.getRowCount(); r++) {
            int idTabla = Integer.parseInt(tbl_DatosDepartamentos.getValueAt(r, 0).toString());
            if (idTabla == id) {
                fila = r;
                break;
            }
        }

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "No se encontró el departamento.");
            return;
        }

        int id_departamento = Integer.parseInt(tbl_DatosDepartamentos.getValueAt(fila, 0).toString());
        String nombreE = tbl_DatosDepartamentos.getValueAt(fila, 1).toString();
        int numero_empleadosE = Integer.parseInt(tbl_DatosDepartamentos.getValueAt(fila, 2).toString());
        String nombre_jefeE = tbl_DatosDepartamentos.getValueAt(fila, 3).toString();
        String ubicacionE = tbl_DatosDepartamentos.getValueAt(fila, 4).toString();

        JTextField txt_NombreE = new JTextField(nombreE);
        JTextField txt_NumeroEmpleadosE = new JTextField(String.valueOf(numero_empleadosE));
        JTextField txt_JefeE = new JTextField(nombre_jefeE);
        JTextField txt_UbicacionE = new JTextField(ubicacionE);

        Object[] mensaje = {
            "Nuevo nombre: ", txt_NombreE,
            "Nuevo número de empleados: ", txt_NumeroEmpleadosE,
            "Nuevo jefe a cargo: ", txt_JefeE,
            "Nueva ubicación: ", txt_UbicacionE
        };

        int opcion = JOptionPane.showConfirmDialog(rootPane, mensaje, "Edición de departamento", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (opcion == JOptionPane.OK_OPTION) {
            try {
                String nombre = txt_NombreE.getText();
                int numero_e = Integer.parseInt(txt_NumeroEmpleadosE.getText());
                String jefe = txt_JefeE.getText();
                String ubicacion = txt_UbicacionE.getText();

                objDepartamento = new Departamento(id_departamento, nombre, numero_e, jefe, ubicacion);

                objArreglo_Departamentos.Editar_Departamento(objDepartamento, id_departamento);

                if (objDepartamento != null) {
                    JOptionPane.showMessageDialog(this, "El departamento ha sido editado correctamente.");
                    objArreglo_Departamentos.Listar_Departamentos(tbl_DatosDepartamentos);
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró el departamento.");
                }
            } catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(null, "Ingrese valores adecuados en cada campo.");
            }
        }
    }//GEN-LAST:event_btn_EditarDepartamentoActionPerformed

    private void btn_RegistrarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarProyectoActionPerformed
        JTextField txt_ID = new JTextField();
        JTextField txt_Nombre = new JTextField();
        JTextField txt_FechaInicio = new JTextField();
        JTextField txt_FechaFin = new JTextField();
        JTextField txt_Presupuesto = new JTextField();
        JComboBox<Departamento> cbo_Departamentos = new JComboBox<>();
        for (Departamento d : objArreglo_Departamentos.listar()) {
            if (d != null) {
                cbo_Departamentos.addItem(d);
            }
        }

        Object[] mensaje = {
            "ID: ", txt_ID,
            "Nombre: ", txt_Nombre,
            "Fecha de inicio: ", txt_FechaInicio,
            "Fecha de finalización: ", txt_FechaFin,
            "Presupuesto: ", txt_Presupuesto,
            "Departamento: ", cbo_Departamentos
        };

        int opcion = JOptionPane.showConfirmDialog(this, mensaje, "Registro de proyecto", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (opcion == JOptionPane.OK_OPTION) {
            try {
                int id = Integer.parseInt(txt_ID.getText());
                String nombre = txt_Nombre.getText();
                String fechainicio = txt_FechaInicio.getText();
                String fechafin = txt_FechaFin.getText();
                double presupuesto = Double.parseDouble(txt_Presupuesto.getText());
                Departamento departamentoSeleccionado = (Departamento) cbo_Departamentos.getSelectedItem();

                objProyecto = new Proyecto(id, nombre, fechainicio, fechafin, presupuesto, departamentoSeleccionado);
                objArreglo_Departamentos.Registrar_Proyecto(objProyecto, departamentoSeleccionado.getId());
                objArreglo_Departamentos.Listar_Proyectos(tbl_DatosProyectos);
                objArreglo_Departamentos.Listar_Departamentos(tbl_DatosDepartamentos);
            } catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(null, "Ingrese valores adecuados en cada campo.");
            }
        }
    }//GEN-LAST:event_btn_RegistrarProyectoActionPerformed

    private void btn_EditarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarProyectoActionPerformed
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del proyecto a editar: "));

        int fila = -1;
        for (int r = 0; r < tbl_DatosProyectos.getRowCount(); r++) {
            int idTabla = Integer.parseInt(tbl_DatosProyectos.getValueAt(r, 1).toString());
            if (idTabla == id) {
                fila = r;
                break;
            }
        }

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "No se encontró el proyecto.");
            return;
        }

        int id_proyecto = Integer.parseInt(tbl_DatosProyectos.getValueAt(fila, 1).toString());
        String nombreE = tbl_DatosProyectos.getValueAt(fila, 2).toString();
        String fechainicioE = tbl_DatosProyectos.getValueAt(fila, 3).toString();
        String fechafinE = tbl_DatosProyectos.getValueAt(fila, 4).toString();
        double presupuestoE = Double.parseDouble(tbl_DatosProyectos.getValueAt(fila, 5).toString());

        JTextField txt_Nombre = new JTextField(nombreE);
        JTextField txt_FechaInicio = new JTextField(fechainicioE);
        JTextField txt_FechaFin = new JTextField(fechafinE);
        JTextField txt_Presupuesto = new JTextField(String.valueOf(presupuestoE));

        JComboBox<Departamento> cbo_Departamentos = new JComboBox<>();
        for (Departamento d : objArreglo_Departamentos.listar()) {
            if (d != null) {
                cbo_Departamentos.addItem(d);
            }
        }

        Object[] mensaje = {
            "Nuevo nombre: ", txt_Nombre,
            "Nueva fecha de inicio: ", txt_FechaInicio,
            "Nueva fecha de finalización: ", txt_FechaFin,
            "Nuevo prespuesto: ", txt_Presupuesto,
            "Nuevo departamento: ", cbo_Departamentos
        };

        int opcion = JOptionPane.showConfirmDialog(this, mensaje, "Edición de proyecto", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (opcion == JOptionPane.OK_OPTION) {
            try {
                String nombre = txt_Nombre.getText();
                String fechainicio = txt_FechaInicio.getText();
                String fechafin = txt_FechaFin.getText();
                double presupuesto = Double.parseDouble(txt_Presupuesto.getText());
                Departamento departamentoSeleccionado = (Departamento) cbo_Departamentos.getSelectedItem();

                objProyecto = new Proyecto(id_proyecto, nombre, fechainicio, fechafin, presupuesto, departamentoSeleccionado);

                objArreglo_Departamentos.Editar_Proyecto(objProyecto, id_proyecto);

                JOptionPane.showMessageDialog(this, "El proyecto ha sido editado correctamente.");
                objArreglo_Departamentos.Listar_Proyectos(tbl_DatosProyectos);
                objArreglo_Departamentos.Listar_Departamentos(tbl_DatosDepartamentos);
            } catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(null, "Ingrese valores adecuados en cada campo.");
            }
        }
    }//GEN-LAST:event_btn_EditarProyectoActionPerformed

    private void txt_FiltroIDProyectoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FiltroIDProyectoKeyReleased
        String texto = txt_FiltroIDProyecto.getText();
        if (!texto.isEmpty()) {
            try {
                int filtro = Integer.parseInt(texto);
                objArreglo_Departamentos.Filtrar_Por_ID_P(tbl_DatosProyectos, filtro);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese un número válido para el filtro.");
            }
        } else {
            objArreglo_Departamentos.Listar_Proyectos(tbl_DatosProyectos);
        }
    }//GEN-LAST:event_txt_FiltroIDProyectoKeyReleased

    private void btn_EliminarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarDepartamentoActionPerformed
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del departamento a eliminar: "));

        int fila = -1;
        for (int r = 0; r < tbl_DatosDepartamentos.getRowCount(); r++) {
            int idTabla = Integer.parseInt(tbl_DatosDepartamentos.getValueAt(r, 0).toString());
            if (idTabla == id) {
                fila = r;
                break;
            }
        }

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "No se encontró el departamento.");
            return;
        } else {
            objArreglo_Departamentos.Eliminar_Departamento(id);
            objArreglo_Departamentos.Listar_Departamentos(tbl_DatosDepartamentos);
        }
    }//GEN-LAST:event_btn_EliminarDepartamentoActionPerformed

    private void btn_EliminarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarProyectoActionPerformed
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del proyecto a eliminar: "));

        int fila = -1;
        for (int r = 0; r < tbl_DatosProyectos.getRowCount(); r++) {
            int idTabla = Integer.parseInt(tbl_DatosProyectos.getValueAt(r, 1).toString());
            if (idTabla == id) {
                fila = r;
                break;
            }
        }

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "No se encontró el proyecto.");
            return;
        } else {
            objArreglo_Departamentos.Eliminar_Proyecto(id);
            objArreglo_Departamentos.Listar_Proyectos(tbl_DatosProyectos);
        }
    }//GEN-LAST:event_btn_EliminarProyectoActionPerformed

    private void txt_FiltroIDDepartamentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FiltroIDDepartamentoKeyReleased
        String texto = txt_FiltroIDDepartamento.getText();
        if (!texto.isEmpty()) {
            try {
                int filtro = Integer.parseInt(texto);
                objArreglo_Departamentos.Filtrar_Por_ID_D(tbl_DatosDepartamentos, filtro);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese un número válido para el filtro.");
            }
        } else {
            objArreglo_Departamentos.Listar_Departamentos(tbl_DatosDepartamentos);
        }
    }//GEN-LAST:event_txt_FiltroIDDepartamentoKeyReleased

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new JFrame_Principal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_EditarDepartamento;
    private javax.swing.JButton btn_EditarProyecto;
    private javax.swing.JButton btn_EliminarDepartamento;
    private javax.swing.JButton btn_EliminarProyecto;
    private javax.swing.JButton btn_RegistrarDepartamento;
    private javax.swing.JButton btn_RegistrarProyecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_DatosDepartamentos;
    private javax.swing.JTable tbl_DatosProyectos;
    private javax.swing.JTextField txt_FiltroIDDepartamento;
    private javax.swing.JTextField txt_FiltroIDProyecto;
    // End of variables declaration//GEN-END:variables
}
