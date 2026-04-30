package Control;

import Modelo.Clientes;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Clientes {
    private int tam;
    private Clientes[] arreglo;
    private int i = 0;
    
    public void asignarTam(int n) {
        arreglo = new Clientes[n];
    }
    
    public void Agregar(Clientes dato){
        try {
            arreglo[i] = dato;
            i++;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Lista llena");
        }
    
    }
    
    public void Listar(JTable control){
        String[] cabecera = {"Nombre", "Tarifa", "Consumo a pagar"};
        DefaultTableModel modTable = new DefaultTableModel(cabecera,0);
        control.setModel(modTable);
        for (int pos = 0; pos < i; pos++) {
            modTable.addRow(arreglo[pos].getRegistro());
        }
    }
    
}
