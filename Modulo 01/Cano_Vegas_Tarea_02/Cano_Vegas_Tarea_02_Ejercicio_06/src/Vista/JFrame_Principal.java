
package Vista;

import Control.Arreglo_Entrenadores;
import Modelo.Entrenador;
import Modelo.Equipo;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class JFrame_Principal extends javax.swing.JFrame {
    
    Arreglo_Entrenadores objArregloEntrenadores = new Arreglo_Entrenadores();
    
    public void cargarComboEntrenador() {
        cbo_entrenador.removeAllItems();
        
        for (int i = 0; i <objArregloEntrenadores.getI(); i++) {
            cbo_entrenador.addItem(objArregloEntrenadores.getEntrenadorCadena(i));
            
        }
    }
    
    public JFrame_Principal() {
        initComponents();
        cargarComboEntrenador();
        objArregloEntrenadores.listar(tbl_entrenador);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_codigo_entrenador = new javax.swing.JTextField();
        txt_nombre_entrenador = new javax.swing.JTextField();
        txt_especialidad = new javax.swing.JTextField();
        btn_registrar_entrenador = new javax.swing.JButton();
        btn_ver_entrenador = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_entrenador = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbo_entrenador = new javax.swing.JComboBox<>();
        txt_nombre_equipo = new javax.swing.JTextField();
        txt_codigo_equipo = new javax.swing.JTextField();
        btn_registrar_equipo = new javax.swing.JButton();
        btn_ver_equipo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cóidigo de entrenador:");

        jLabel2.setText("Nombre de entrenador:");

        jLabel3.setText("Especialidad:");

        txt_codigo_entrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigo_entrenadorActionPerformed(evt);
            }
        });

        txt_nombre_entrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_entrenadorActionPerformed(evt);
            }
        });

        txt_especialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_especialidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addComponent(txt_codigo_entrenador))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(95, 95, 95)
                        .addComponent(txt_especialidad, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(47, 47, 47)
                        .addComponent(txt_nombre_entrenador, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_codigo_entrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addComponent(txt_nombre_entrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_registrar_entrenador.setText("Registrar Entrenador");
        btn_registrar_entrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_entrenadorActionPerformed(evt);
            }
        });

        btn_ver_entrenador.setText("Ver Entrenador");
        btn_ver_entrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver_entrenadorActionPerformed(evt);
            }
        });

        tbl_entrenador.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_entrenador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_entrenadorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_entrenador);

        jLabel4.setText("Entrenador:");

        jLabel6.setText("Cóidigo de equipo:");

        jLabel7.setText("Nombre de equipo:");

        cbo_entrenador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txt_nombre_equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_equipoActionPerformed(evt);
            }
        });

        txt_codigo_equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigo_equipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbo_entrenador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_codigo_equipo, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(txt_nombre_equipo))
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_entrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_registrar_equipo.setText("Registrar Equipo");
        btn_registrar_equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_equipoActionPerformed(evt);
            }
        });

        btn_ver_equipo.setText("Ver Equipo");
        btn_ver_equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver_equipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btn_registrar_entrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_ver_entrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btn_registrar_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_ver_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_registrar_entrenador)
                            .addComponent(btn_ver_entrenador))
                        .addGap(46, 46, 46)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_registrar_equipo)
                            .addComponent(btn_ver_equipo))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codigo_entrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo_entrenadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigo_entrenadorActionPerformed

    private void txt_nombre_entrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_entrenadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_entrenadorActionPerformed

    private void txt_especialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_especialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_especialidadActionPerformed

    private void txt_nombre_equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_equipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_equipoActionPerformed

    private void txt_codigo_equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo_equipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigo_equipoActionPerformed

    private void btn_registrar_entrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_entrenadorActionPerformed
       try {
            int cod = Integer.parseInt(txt_codigo_entrenador.getText());
            String nombre = txt_nombre_entrenador.getText();
            String especialidad = txt_especialidad.getText();

            Entrenador objEntrenador = new Entrenador(cod, nombre, especialidad);
            objArregloEntrenadores.agregar(objEntrenador);
            objArregloEntrenadores.listar(tbl_entrenador);
            cargarComboEntrenador();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error: datos inválidos");
        }
    }//GEN-LAST:event_btn_registrar_entrenadorActionPerformed

    private void btn_registrar_equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_equipoActionPerformed
       try {
            int idEquipo = Integer.parseInt(txt_codigo_equipo.getText());
            String nombreEquipo = txt_nombre_equipo.getText();
            StringTokenizer st = new StringTokenizer(cbo_entrenador.getSelectedItem().toString(), " , ");
            int idEntrenador = Integer.parseInt(st.nextToken().toString());

            Entrenador objEntrenador = objArregloEntrenadores.getEntrenador(idEntrenador);
            Equipo objEquipo = new Equipo(objEntrenador.getCodEntrenador(), idEquipo, nombreEquipo, objEntrenador);
            objArregloEntrenadores.getEntrenador(objEntrenador.getCodEntrenador()).getObjEquipos().registrar(objEquipo);
            objArregloEntrenadores.getEntrenador(objEntrenador.getCodEntrenador()).getObjEquipos().listar(tbl_entrenador);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Error: datos inválidos");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Registre un entrenador");
        }
    }//GEN-LAST:event_btn_registrar_equipoActionPerformed

    private void btn_ver_entrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver_entrenadorActionPerformed
        objArregloEntrenadores.listar(tbl_entrenador);
    }//GEN-LAST:event_btn_ver_entrenadorActionPerformed

    private void btn_ver_equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver_equipoActionPerformed
        objArregloEntrenadores.listarTodoEquipos(tbl_entrenador);
    }//GEN-LAST:event_btn_ver_equipoActionPerformed

    private void tbl_entrenadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_entrenadorMouseClicked
        if (evt.getClickCount() == 2) {
            int pos = tbl_entrenador.getSelectedRow();
            int cod = Integer.parseInt(tbl_entrenador.getValueAt(pos, 0).toString());

            objArregloEntrenadores.getEntrenador(cod).getObjEquipos().listar(tbl_entrenador);
        }
    }//GEN-LAST:event_tbl_entrenadorMouseClicked

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
    private javax.swing.JButton btn_registrar_entrenador;
    private javax.swing.JButton btn_registrar_equipo;
    private javax.swing.JButton btn_ver_entrenador;
    private javax.swing.JButton btn_ver_equipo;
    private javax.swing.JComboBox<String> cbo_entrenador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_entrenador;
    private javax.swing.JTextField txt_codigo_entrenador;
    private javax.swing.JTextField txt_codigo_equipo;
    private javax.swing.JTextField txt_especialidad;
    private javax.swing.JTextField txt_nombre_entrenador;
    private javax.swing.JTextField txt_nombre_equipo;
    // End of variables declaration//GEN-END:variables
}
