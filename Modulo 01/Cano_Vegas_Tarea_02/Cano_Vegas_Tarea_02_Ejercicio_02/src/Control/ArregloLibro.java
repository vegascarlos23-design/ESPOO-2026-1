package Control;

import Modelo.Libro;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArregloLibro {

    private Libro[] arreglo_libro = new Libro[50];
    private int i = 0;

    public void AgregarLibro(Libro dato) {
        if (i < arreglo_libro.length) {
            if (BuscarLinealLibro(dato.getID()) == null) {
            arreglo_libro[i] = dato;
            i++;
            } else {
                JOptionPane.showMessageDialog(null,"Codigo del libro ya registrado");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Libros llenos en la categoria");
        }
    }

    public void ListarLibro(JTable controlLibro) {
        String[] cabecera = {"ID", "Nombre", "Editorial", "Año Publicacion", "Categoria Asignada"};
        DefaultTableModel modTable = new DefaultTableModel(cabecera, 0);
        controlLibro.setModel(modTable);
        controlLibro.setDefaultEditor(Object.class, null);
        for (int pos = 0; pos < i; pos++) {
            modTable.addRow(arreglo_libro[pos].getRegistroLibro());
        }
    }
    
    public void FiltrarPorCategoria(JTable control, String categoria){
        String[] cabecera = {"ID", "Nombre", "Editorial","Año Publicacion", "Categoria Asignada"};
        DefaultTableModel modTable = new DefaultTableModel(cabecera, 0);
        control.setModel(modTable);
        for (int pos = 0; pos < i; pos++) {
            if (arreglo_libro[pos].getCategoria_Asignada().equalsIgnoreCase(categoria)){
                modTable.addRow(arreglo_libro[pos].getRegistroLibro());
            }
        }
    }

    public String BuscarLinealLibro(String dato) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo_libro[pos].getID().equals(dato)) {
                return arreglo_libro[pos].getID();
            }
        }
        return null;
    }

}
