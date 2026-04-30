package Control;

import Modelo.Instrumento;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Instrumento {

    private Instrumento[] arreglo = new Instrumento[8];
    private int i = 0;

    public void Agregar(Instrumento dato) {
        try {
            if (buscar(dato.getId()) == -1) {
                arreglo[i] = dato;
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "El ID ya existe");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lista de instrumentos llena");
        }
    }

    public void Listar(JTable control) {
        String[] cabecera = {"ID", "Nombre", "Tipo", "Precio"};
        DefaultTableModel modTable = new DefaultTableModel(cabecera, 0);
        control.setModel(modTable);
        for (int pos = 0; pos < i; pos++) {
            modTable.addRow(arreglo[pos].getRegistro());
        }
    }

    public void Eliminar(int idBorrar) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getId() == idBorrar) {
                for (int j = pos; j < i - 1; j++) {
                    arreglo[j] = arreglo[j + 1];
                }
                arreglo[i - 1] = null;
                i--;
            }
        }
    }

    public int buscar(int id) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getId() == id) {
                return pos;
            }
        }
        return -1;
    }

    public ArrayList<Instrumento> buscarPorNombre(String nombre) {
        ArrayList<Instrumento> encontrados = new ArrayList<Instrumento>(i);
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getNombre().equalsIgnoreCase(nombre)) {
                encontrados.add(arreglo[pos]);
            }
        }
        return encontrados;
    }
    
    public ArrayList<Instrumento> listarTodos() {
        ArrayList<Instrumento> todos = new ArrayList<>();
        
        for (int muck = 0; muck < i; muck++) {
            todos.add(arreglo[i]);
        }
        return todos;
    }
}
