package Vista;

import Control.ArregloProductos;
import Modelo.Ebook;
import Modelo.LibroImpreso;
import Modelo.Periodico;
import Modelo.ProductoEditorial;
import Modelo.RevistasCientifica;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JFramePrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFramePrincipal.class.getName());

    ArregloProductos objArregloProductos = new ArregloProductos();
    ProductoEditorial objEditorial;

    public JFramePrincipal() {
        initComponents();
        objArregloProductos.Listar(tblProductos);
    }

    private Object[] getMsg(int id, JTextField txtBody) {
        if (id == 1) {
            return new Object[]{"Numero de paginas:", txtBody};
        } else if (id == 2) {
            return new Object[]{"Formato:", txtBody};
        } else if (id == 3) {
            return new Object[]{"Area de Investigacion:", txtBody};
        } else {
            return new Object[]{"Fecha:", txtBody};
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        cboProductos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboFiltro = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProductos);

        jLabel1.setText("ID: ");

        jLabel2.setText("Titulo: ");

        jLabel3.setText("Autor:");

        jLabel4.setText("Precio:");

        cboProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro Impreso", "E-Books", "Revistas Cientificas", "Periodicos" }));

        jLabel5.setText("Productos Editoriales");

        jLabel6.setText("Filtro");

        cboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Libro Impreso", "E-Books", "Revistas cientificas", "Periodicos" }));
        cboFiltro.addActionListener(this::cboFiltroActionPerformed);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(this::btnEditarActionPerformed);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAutor)
                                    .addComponent(txtId)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboProductos, javax.swing.GroupLayout.Alignment.TRAILING, 0, 246, Short.MAX_VALUE)
                                    .addComponent(cboFiltro, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            int id = Integer.parseInt(txtId.getText());
        String titulo = txtTitulo.getText();
        String autor = txtAutor.getText();
        double precio = Double.parseDouble(txtPrecio.getText());
        int idProductoEditorial = cboProductos.getSelectedIndex() + 1;
        
        JTextField txtInfo = new JTextField();
        Object[] msg = getMsg(idProductoEditorial, txtInfo);

        int fl = JOptionPane.showConfirmDialog(rootPane, msg, "Info adicional", ConfirmationCallback.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (fl == JOptionPane.OK_OPTION) {
            String infoAdcional = txtInfo.getText();
            if (idProductoEditorial == 1) {
                objEditorial = new LibroImpreso(id, titulo, autor, precio, Integer.parseInt(infoAdcional));
            } else if (idProductoEditorial == 2) {
                objEditorial = new Ebook(id, titulo, autor, precio, infoAdcional);
            } else if (idProductoEditorial == 3) {
                objEditorial = new RevistasCientifica(id, titulo, autor, precio, infoAdcional);
            } else {
                objEditorial = new Periodico(id, titulo, autor, precio, infoAdcional);
            }

            objArregloProductos.Agregar(objEditorial);
            objArregloProductos.Listar(tblProductos);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Ingrese datos validos");
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFiltroActionPerformed
        int pos = cboFiltro.getSelectedIndex();

        switch (pos) {
            case 0:
                objArregloProductos.Listar(tblProductos);
                break;
            case 1:
                objArregloProductos.filtrar(tblProductos, 1);
                break;
            case 2:
                objArregloProductos.filtrar(tblProductos, 2);
                break;
            case 3:
                objArregloProductos.filtrar(tblProductos, 3);
                break;
            case 4:
                objArregloProductos.filtrar(tblProductos, 4);
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_cboFiltroActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int pos = tblProductos.getSelectedRow();

        if (pos == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un Producto para editar");
            return;
        }

        int id = Integer.parseInt(tblProductos.getValueAt(pos, 0).toString());
        String tituloE = tblProductos.getValueAt(pos, 1).toString();
        String autorE = tblProductos.getValueAt(pos, 2).toString();
        String precioE = tblProductos.getValueAt(pos, 3).toString();
        String datoAdicionalE = objArregloProductos.getDato(id);
        String ProductoEditorialE = objArregloProductos.getProductoEditorial(id);

        JTextField txtTituloE = new JTextField(tituloE);
        JTextField txtAutorE = new JTextField(autorE);
        JTextField txtPrecioE = new JTextField(precioE);

        JComboBox<String> cboProducto = new JComboBox<>(new String[]{"Libro Impreso", "E-Book", "Revista Cientifica", "Periodico"});
        cboProducto.setSelectedItem(ProductoEditorialE);

        Object[] msg = {
            "Titulo:", txtTituloE,
            "Autor:", txtAutorE,
            "Precio:", txtPrecioE,
            "Producto Editorial:", cboProducto
        };

        int fl = JOptionPane.showConfirmDialog(rootPane, msg, "Editar Producto", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (fl == JOptionPane.OK_OPTION) {
            try {
                String titulo = txtTituloE.getText();
                String autor = txtAutorE.getText();
                double precio = Double.parseDouble(txtPrecioE.getText());
                int tipo = cboProducto.getSelectedIndex()+1;
                
                JTextField txtAdicional = new JTextField(datoAdicionalE);
                if (tipo == 1) {
                    Object[] msg1 = getMsg(1, txtAdicional);
                    
                    int fl1 = JOptionPane.showConfirmDialog(rootPane, msg1, "Info adicional", ConfirmationCallback.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                    if(fl1 == JOptionPane.OK_OPTION) {
                        String infoAdcional = txtAdicional.getText();
                        objEditorial = new LibroImpreso(id, titulo, autor, precio, Integer.parseInt(infoAdcional));
                    }
                    
                } else if (tipo == 2) {
                    Object[] msg1 = getMsg(2, txtAdicional);
                    
                    int fl1 = JOptionPane.showConfirmDialog(rootPane, msg1, "Info adicional", ConfirmationCallback.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                    if(fl1 == JOptionPane.OK_OPTION) {
                        String infoAdcional = txtAdicional.getText();
                        objEditorial = new Ebook(id, titulo, autor, precio, infoAdcional);
                    }
                } else if (tipo == 3) {
                    Object[] msg1 = getMsg(3, txtAdicional);
                    
                    int fl1 = JOptionPane.showConfirmDialog(rootPane, msg1, "Info adicional", ConfirmationCallback.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                    if(fl1 == JOptionPane.OK_OPTION) {
                        String infoAdcional = txtAdicional.getText();
                        objEditorial = new RevistasCientifica(id, titulo, autor, precio, infoAdcional);
                    }
                } else {
                    Object[] msg1 = getMsg(4, txtAdicional);
                    
                    int fl1 = JOptionPane.showConfirmDialog(rootPane, msg1, "Info adicional", ConfirmationCallback.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                    if(fl1 == JOptionPane.OK_OPTION) {
                        String infoAdcional = txtAdicional.getText();
                        objEditorial = new Periodico(id, titulo, autor, precio, infoAdcional);
                    }
                }
                objArregloProductos.Editar(objEditorial, id);
                objArregloProductos.Listar(tblProductos);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese un numero valido");
            }
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int pos = tblProductos.getSelectedRow();
        
        if (pos == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un Producto para eliminar");
            return;
        }
        
        int id = Integer.parseInt(tblProductos.getValueAt(pos, 0).toString()); 
        objArregloProductos.Borrar(id);
        objArregloProductos.Listar(tblProductos);
    }//GEN-LAST:event_btnEliminarActionPerformed

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
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cboFiltro;
    private javax.swing.JComboBox<String> cboProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

}
