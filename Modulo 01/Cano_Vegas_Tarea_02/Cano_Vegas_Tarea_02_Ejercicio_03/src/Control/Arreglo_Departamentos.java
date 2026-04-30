package Control;

import Modelo.Departamento;
import Modelo.Proyecto;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Departamentos {

    private Departamento[] ARREGLO_DEPARTAMENTO = new Departamento[3];
    int i = 0;

    public void Registrar_Departamento(Departamento dato) {
        try {
            if (Buscar_Lineal(dato.getId()) == -1) {
                ARREGLO_DEPARTAMENTO[i] = dato;
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "El ID ya ha sido registrado.");
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(null, "La lista de departamentos ya está llena.");
        }
    }

    public void Registrar_Proyecto(Proyecto dato, int id_departamento) {
        try {
            int pos = Buscar_Lineal(id_departamento);
            ARREGLO_DEPARTAMENTO[pos].Agregar_Proyecto(dato);
        } catch (Exception e) {

        }
    }

    public void Editar_Departamento(Departamento dato, int id_editar) {
        int pos = Buscar_Lineal(id_editar);
        ARREGLO_DEPARTAMENTO[pos] = dato;
    }

    public void Editar_Proyecto(Proyecto dato, int id_proyecto) {
        try {
            for (int pos = 0; pos < i; pos++) {
                Departamento departamento = ARREGLO_DEPARTAMENTO[pos];
                Proyecto[] ARREGLO_PROYECTO = departamento.getARREGLO_PROYECTO();
                int cargaMaxima = departamento.getCarga_maxima();

                for (int k = 0; k < cargaMaxima; k++) {
                    if (ARREGLO_PROYECTO[k].getId() == id_proyecto) {
                        ARREGLO_PROYECTO[k] = dato;
                        return;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "No se encontró el libro.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al editar el libro.");
        }
    }

    public void Eliminar_Departamento(int id) {
        for (int pos = 0; pos < i; pos++) {
            if (ARREGLO_DEPARTAMENTO[pos].getId() == id) {
                for (int j = 0; j < i - 1; j++) {
                    ARREGLO_DEPARTAMENTO[j] = ARREGLO_DEPARTAMENTO[j + 1];
                }
                ARREGLO_DEPARTAMENTO[i - 1] = null;
                i--;
            }
        }
    }

    public void Eliminar_Proyecto(int id) {
        for (int pos = 0; pos < i; pos++) {
            Departamento departamento = ARREGLO_DEPARTAMENTO[pos];
            Proyecto[] proyectos = departamento.getARREGLO_PROYECTO();
            int carga = departamento.getCarga_maxima();

            for (int k = 0; k < carga; k++) {
                if (proyectos[k].getId() == id) {
                    for (int l = k; l < carga - 1; l++) {
                        proyectos[l] = proyectos[l + 1];
                    }
                    proyectos[carga - 1] = null;
                    departamento.setCarga_maxima(carga - 1);
                    JOptionPane.showMessageDialog(null, "Proyecto eliminado correctamente.");
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró el proyecto.");
    }

    public void Listar_Departamentos(JTable control) {
        String[] cabecera = {"ID", "Nombre", "Número de empleados", "Nombre del jefe", "Ubicación"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(ARREGLO_DEPARTAMENTO[pos].getRegistro_Departamento());
        }
    }

    public void Listar_Proyectos(JTable control) {
        String[] cabecera = {"Departamento asignado", "ID", "Nombre", "Fecha de inicio", "Fecha de finalización", "Presupuesto"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < i; pos++) {
            Proyecto[] ARREGLO_PROYECTO = ARREGLO_DEPARTAMENTO[pos].getARREGLO_PROYECTO();
            int j = ARREGLO_DEPARTAMENTO[pos].getCarga_maxima();
            for (int k = 0; k < j; k++) {
                modTabla.addRow(ARREGLO_PROYECTO[k].getRegistro_Proyecto());
            }
        }
    }

    public void Filtrar_Por_ID_D(JTable control, int id_filtro) {
        String[] cabecera = {"ID", "Nombre", "Número de empleados", "Nombre del jefe", "Ubicación"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < i; pos++) {
            if (ARREGLO_DEPARTAMENTO[pos].getId() == id_filtro) {
                modTabla.addRow(ARREGLO_DEPARTAMENTO[pos].getRegistro_Departamento());
            }
        }
    }

    public void Filtrar_Por_ID_P(JTable control, int id_filtro) {
        String[] cabecera = {"Departamento asignado", "ID", "Nombre", "Fecha de inicio", "Fecha de finalización", "Presupuesto"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < i; pos++) {
            Proyecto[] ARREGLO_PROYECTO = ARREGLO_DEPARTAMENTO[pos].getARREGLO_PROYECTO();
            int j = ARREGLO_DEPARTAMENTO[pos].getCarga_maxima();
            for (int k = 0; k < j; k++) {
                if (ARREGLO_PROYECTO[k].getId() == id_filtro) {
                    modTabla.addRow(ARREGLO_PROYECTO[k].getRegistro_Proyecto());
                }
            }
        }
    }

    public int Buscar_Lineal(int id) {
        for (int pos = 0; pos < i; pos++) {
            if (ARREGLO_DEPARTAMENTO[pos].getId() == id) {
                return pos;
            }
        }
        return -1;
    }

    public Departamento[] listar() {
        return ARREGLO_DEPARTAMENTO;
    }
}
