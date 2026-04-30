package Control;

import Modelo.Sedes;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArregloSedes {

    private Sedes[] arreglo = new Sedes[4];
    private int i = 0;

    public void AgregarSede(Sedes dato) {
        if (i < arreglo.length) {
            if (BuscarLinearSedes(dato.getID()) == null) {
                arreglo[i] = dato;
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "El código de la sede ya existe");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Arreglo de sedes lleno");
        }
    }

    public void ListarSede(JTable control) {
        String[] cabecera = {"ID", "Nombre", "Direccion", "Telefono"};
        DefaultTableModel modTable = new DefaultTableModel(cabecera, 0);
        control.setModel(modTable);
        for (int pos = 0; pos < i; pos++) {
            modTable.addRow(arreglo[pos].getRegistroSedes());
        }
    }

    public Sedes BuscarLinearSedes(String id) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getID().equals(id)) {
                return arreglo[pos];
            }
        }
        return null;
    }
}
