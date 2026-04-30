package Control;

import Modelo.Transportistas;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Transportistas {
    private int tam;
    private Transportistas[] arreglo;
    private int i = 0;
    
    public void asignarTam(int n) {
        arreglo = new Transportistas[n];
    }
    
    public void Agregar(Transportistas dato){
        try {
            arreglo[i] = dato;
            i++;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Lista de transportistas llena");
        }
    }
    
    public void Listar(JTable control){
        String[] cabecera = {"nombre", "placa", "estado", "Entragas Realizadas", "Ingresos"};
        DefaultTableModel modTable = new DefaultTableModel(cabecera, 0);
        control.setModel(modTable);
        for (int pos = 0; pos < i; pos++) {
            modTable.addRow(arreglo[pos].getRegistro());
        }
    }
}
