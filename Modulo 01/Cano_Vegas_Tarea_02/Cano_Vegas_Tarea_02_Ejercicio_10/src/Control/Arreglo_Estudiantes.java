package Control;

import Modelo.Estudiantes;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Estudiantes {
    private Estudiantes[] arreglo = new Estudiantes[15];
    private int i = 0;
    
    public void Agregar(Estudiantes dato){
        try {
            arreglo[i] = dato;
            i++;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Lista de estudiantes llena");
        }
    }
    
    public Estudiantes[] getArreglo() {
        return arreglo;
    }

    public int getI() {
        return i;
    }
    
    public void Listar(JTable control){
        String[] cabecera = {"Nombre", "Apellido", "Edad", "Salon", "DNI"};
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
