package control;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Libro;

public class Arreglo_Libros {
    private Libro[] arreglo = new Libro[6];
    private int i = 0;
    
    public void Agregar(Libro dato) {
        try {
            arreglo[i] = dato;
            i++;
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Te fuiste muck");
        }
    }
    
    public void Listar(JTable control) {
        String[] cabecera = {"ISBN", "Titulo", "Autor", "Editorial", "Precio", "Stock"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(arreglo[pos].getRegistro());
        }
    }
}
