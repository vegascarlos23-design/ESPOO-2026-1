package Control;

import Modelo.Libro;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArregloLibros {
    private Libro[] arreglo = new Libro[8];
    private int i = 0;
    
    public void agregar(Libro dato) {
        try {
            if (buscarLineal(dato.getIdLibro()) == -1) {
                arreglo[i] = dato;
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "El id del libro ya se encuentra registrado");
            }       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se ha alcanzado la maxima capacidad");
        }
    }
    
    public void eliminar(int id) {
        int posEliminar = buscarLineal(id);
        for (int pos = posEliminar; pos < i-1; pos++) {
            arreglo[pos] = arreglo[pos+1];
        }
        arreglo[i-1] = null;
        i--;
    }
    
    public void editar(Libro dato,int id) {
        int pos = buscarLineal(id);
        arreglo[pos] = dato;
    }
    
    public void listar(JTable control) {
        String[] cabecera = {"Cod. Categoria", "Id libro", "Titulo"};
        
        DefaultTableModel modTabla = new DefaultTableModel(cabecera,0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);
        
        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(arreglo[pos].getRegistro());
        }
    }
    
    public int buscarLineal(int id) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getIdLibro() == id) {
                return pos;
            }
        }
        return -1;
    }
    
    public Libro getLibro(int pos) {
        return arreglo[pos];
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    
}
