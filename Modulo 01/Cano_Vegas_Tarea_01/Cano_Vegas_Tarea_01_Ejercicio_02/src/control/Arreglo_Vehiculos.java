package control;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Vehiculo;

public class Arreglo_Vehiculos {
    private Vehiculo[] arreglo = new Vehiculo[6];
    private int i = 0;
    
    public void Agregar(Vehiculo dato) {
        try {
            arreglo[i] = dato;
            i++;
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Arreglo lleno");
        }
    }
    
    public void Listar(JTable control) {
        String[] cabecera = {"Placa", "Marca", "Modelo", "Año"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(arreglo[pos].getRegistro());
        }
    }
}
