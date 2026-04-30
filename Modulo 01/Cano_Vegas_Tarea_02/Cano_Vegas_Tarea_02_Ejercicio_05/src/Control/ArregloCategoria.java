package Control;

import Modelo.Categoria;
import Modelo.Libro;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArregloCategoria {

    private Categoria[] arreglo = new Categoria[5];
    private int i = 0;

    public void agregar(Categoria dato) {
        try {
            if (buscarLineal(dato.getCodCategoria()) == -1) {
                arreglo[i] = dato;
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "El codigo de la categoria ya se encuentra registrada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se ha alcanzado la maxima capacidad");
        }
    }

    public void eliminar(int cod) {
        try {
            int posEliminar = buscarLineal(cod);
            for (int pos = posEliminar; pos < i - 1; pos++) {
                arreglo[pos] = arreglo[pos + 1];
            }
            arreglo[i - 1] = null;
            i--;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido borrar");
        }

    }

    public void editar(Categoria dato, int id) {
        int posEditar = buscarLineal(id);
        arreglo[posEditar] = dato;
    }

    public void listar(JTable control) {
        String[] cabecera = {"Codigo", "Nombre", "Valoracion"};

        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(arreglo[pos].getRegistro());
        }

    }

    public void listarTodoLibros(JTable control) {
        String[] cabecera = {"Cod. Categoria", "Id libro", "Titulo"};

        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < i; pos++) {
            ArregloLibros objArregloLibros = arreglo[pos].getObjLibros();
            int j = objArregloLibros.getI();
            for (int pos2 = 0; pos2 < j; pos2++) {
                Libro objVuelo = objArregloLibros.getLibro(pos2);
                modTabla.addRow(objVuelo.getRegistro());
            }
        }
    }

    public int buscarLineal(int cod) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getCodCategoria() == cod) {
                return pos;
            }
        }
        return -1;
    }

    public String getCategoriaCadena(int pos) {
        return arreglo[pos].getCodCategoria()+ " - " + arreglo[pos].getNombreCategoria();
    }

    public Categoria getCategoria(int cod) {
        int pos = buscarLineal(cod);
        return arreglo[pos];
    }

    public int getI() {
        return i;
    }
}
