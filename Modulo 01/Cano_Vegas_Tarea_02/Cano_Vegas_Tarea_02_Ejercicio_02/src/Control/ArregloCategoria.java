package Control;

import Modelo.Categoria;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArregloCategoria {

    private Categoria[] arreglo = new Categoria[4];
    private int i = 0;

    public void Agregar(Categoria dato) {
        try {
            if (BuscarLinearCategoria(dato.getID()) == null) {
                arreglo[i] = dato;
                i++;
            } else {
                JOptionPane.showMessageDialog(null,"Codigo de categoria ya resgistrado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Limite alcanzado");
        }
    }

    public void Listar(JTable control) {
        String[] cabecera = {"ID", "nombre", "Total En la Categoria"};
        DefaultTableModel modTable = new DefaultTableModel(cabecera, 0);
        control.setModel(modTable);
        control.setDefaultEditor(Object.class, null);
        for (int pos = 0; pos < i; pos++) {
            modTable.addRow(arreglo[pos].getRegistroCategoria());
        }
    }

    public Categoria BuscarLinearCategoria(String id) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getID().equals(id)) {
                return arreglo[pos];
            }
        }
        return null;
    }
}
