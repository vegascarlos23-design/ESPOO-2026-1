package Control;

import Modelo.Componente;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Componente {
    private Componente[] arreglo = new Componente[12];
    private int i = 0;
    
    public void Agregar(Componente dato){
        try {
            arreglo[i] = dato;
            i++;
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lista de empleados llena");
        }
    }
    
    public void Listar(JTable control){
        String[] cabecera = {"Codigo", "Nombre", "Categoria", "Marca"};
        DefaultTableModel modTable = new DefaultTableModel(cabecera, 0);
        control.setModel(modTable);
        for (int pos = 0; pos < i; pos++) {
            modTable.addRow(arreglo[pos].getRegistro());
        }
    }
    
    public void Filtrar(JTable control, String filtro){
        String[] cabecera = {"Codigo", "Nombre", "Categoria", "Marca"};
        DefaultTableModel modTable = new DefaultTableModel(cabecera, 0);
        control.setModel(modTable);
        for (int pos = 0; pos < i; pos++) {
            if(arreglo[pos].getCadena().toUpperCase().contains(filtro.toUpperCase())){
            modTable.addRow(arreglo[pos].getRegistro());
            }
        }
    }
}
