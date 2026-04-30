package Control;

import Modelo.Entrenador;
import Modelo.Equipo;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Entrenadores {

    private Entrenador[] arreglo = new Entrenador[3];
    private int i = 0;

    public void agregar(Entrenador dato) {
        try {
            if (buscarLineal(dato.getCodEntrenador()) == -1) {
                arreglo[i] = dato;
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "Código de entrenador ya registrado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro lleno");
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
            JOptionPane.showMessageDialog(null, "Error al eliminar");
        }
    }

    public void editar(Entrenador dato, int id) {
        int posEditar = buscarLineal(id);
        arreglo[posEditar] = dato;
    }

    public void listar(JTable control) {
        String[] cabecera = {"Codigo", "Nombre", "Especialidad"};

        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(arreglo[pos].getRegistro());
        }
    }

    public void listarTodoEquipos(JTable control) {
        String[] cabecera = {"Código de Entrenador", "Código de equipo", "Equipo"};

        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < i; pos++) {
            Arreglo_Equipos objArregloEquipos = arreglo[pos].getObjEquipos();
            int j = objArregloEquipos.getI();
            for (int pos2 = 0; pos2 < j; pos2++) {
                Equipo objEquipo = objArregloEquipos.getEquipo(pos2);
                modTabla.addRow(objEquipo.getRegistro());
            }
        }
    }

    public int buscarLineal(int cod) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getCodEntrenador() == cod) {
                return pos;
            }
        }
        return -1;
    }

    public String getEntrenadorCadena(int pos) {
        return arreglo[pos].getCodEntrenador() + " , " + arreglo[pos].getNombreEntrenador();
    }

    public Entrenador getEntrenador(int cod) {
        int pos = buscarLineal(cod);
        return arreglo[pos];
    }

    public int getI() {
        return i;
    }
}