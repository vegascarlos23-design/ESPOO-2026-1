
package Control;

import Modelo.Mascotas;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ArregloMascotas {
    private Mascotas[] arregloMascotas = new Mascotas[50];
    private int i = 0;
    
    public void AgregarMascota(Mascotas dato){
         if (i < arregloMascotas.length) {
        arregloMascotas[i] = dato;
        i++;
    }
    }
    
    public void ListarMascotas(JTable controlMascotas){
        String[] cabecera = {"ID", "Nombre", "Dueño", "Sede Asignada"};
        DefaultTableModel modTable = new DefaultTableModel(cabecera, 0);
        controlMascotas.setModel(modTable);
        for (int pos = 0; pos < i; pos++) {
            modTable.addRow(arregloMascotas[pos].getRegistroMascotas());
        }
    }
    
    public String BuscarLinealMascotas(String dato){
        for (int pos = 0; pos < i; pos++) {
            if(arregloMascotas[pos].getID().equals(dato)) {
                return arregloMascotas[pos].getID();
            }
        }
        return "";
    }
        
    public void FiltrarPorSede(JTable control, String sede){
        String[] cabecera = {"ID", "Nombre", "Dueño", "Sede Asignada"};
        DefaultTableModel modTable = new DefaultTableModel(cabecera, 0);
        control.setModel(modTable);
        for (int pos = 0; pos < i; pos++) {
            if (arregloMascotas[pos].getSede_Asignada().equalsIgnoreCase(sede)){
                modTable.addRow(arregloMascotas[pos].getRegistroMascotas());
            }
        }
    }
    
    public void FiltrarPorNombreMascotas(JTable control, String texto){
        String[] cabecera = {"ID", "Nombre", "Dueño", "Sede Asignada"};
        DefaultTableModel modTable = new DefaultTableModel(cabecera, 0);
        control.setModel(modTable);
        
        for (int pos = 0; pos < i; pos++) {
            if (arregloMascotas[pos].getNombre().toLowerCase().contains(texto.toLowerCase())) {
                modTable.addRow(arregloMascotas[pos].getRegistroMascotas());
            }
        }
    }
}
