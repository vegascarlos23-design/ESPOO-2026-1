package Control;

import Modelo.Aerolinea;
import Modelo.Vuelo;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArregloAerolineas {

    private Aerolinea[] arreglo = new Aerolinea[10];
    private int i = 0;

    public void agregar(Aerolinea dato) {
        try {
            if (buscarLineal(dato.getId()) == -1) {
                arreglo[i] = dato;
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "El id de la aerolinea ya se encuentra registrada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se ha alcanzado la maxima capacidad");
        }
    }

    public void eliminar(int id) {
        try {
            int posEliminar = buscarLineal(id);
            for (int pos = posEliminar; pos < i - 1; pos++) {
                arreglo[pos] = arreglo[pos + 1];
            }
            arreglo[i - 1] = null;
            i--;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido borrar");
        }

    }

    public void editar(Aerolinea dato, int id) {
        int posEditar = buscarLineal(id);
        arreglo[posEditar] = dato;
    }

    public void listar(JTable control) {
        String[] cabecera = {"ID", "Nombre", "Ruc", "Razon Social", "Pais"};

        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(arreglo[pos].getRegistro());
        }

    }

    public void listarTodoVuelos(JTable control) {
        String[] cabecera = {"Id Aerolinea", "Numero de Vuelo", "Ciudad Destino", "Estado"};

        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < i; pos++) {
            ArregloVuelos objArregloVuelos = arreglo[pos].getArregloVuelos();
            int j = objArregloVuelos.getI();
            for (int pos2 = 0; pos2 < j; pos2++) {
                Vuelo objVuelo = objArregloVuelos.getVuelo(pos2);
                modTabla.addRow(objVuelo.getRegistro());
            }
        }
    }

    public void buscarNumVuelo(JTable control, String filtro) {
        String[] cabecera = {"Id Aerolinea", "Numero de Vuelo", "Ciudad Destino", "Estado"};

        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < i; pos++) {
            ArregloVuelos objArregloVuelos = arreglo[pos].getArregloVuelos();
            int j = objArregloVuelos.getI();
            for (int pos2 = 0; pos2 < j; pos2++) {
                Vuelo objVuelo = objArregloVuelos.getVuelo(pos2);
                if ((objVuelo.getNumeroVuelo() + "").toUpperCase().contains(filtro.toUpperCase())) {
                    modTabla.addRow(objVuelo.getRegistro());
                }
            }
        }
    }

    public void buscarCiudadDestino(JTable control, String filtro) {
        String[] cabecera = {"Id Aerolinea", "Numero de Vuelo", "Ciudad Destino", "Estado"};

        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < i; pos++) {
            ArregloVuelos objArregloVuelos = arreglo[pos].getArregloVuelos();
            int j = objArregloVuelos.getI();
            for (int pos2 = 0; pos2 < j; pos2++) {
                Vuelo objVuelo = objArregloVuelos.getVuelo(pos2);
                if (objVuelo.getCiudadDestino().toUpperCase().contains(filtro.toUpperCase())) {
                    modTabla.addRow(objVuelo.getRegistro());
                }
            }
        }
    }

    public void buscarEstadoVuelo(JTable control, String filtro) {
        String[] cabecera = {"Id Aerolinea", "Numero de Vuelo", "Ciudad Destino", "Estado"};

        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < i; pos++) {
            ArregloVuelos objArregloVuelos = arreglo[pos].getArregloVuelos();
            int j = objArregloVuelos.getI();
            for (int pos2 = 0; pos2 < j; pos2++) {
                Vuelo objVuelo = objArregloVuelos.getVuelo(pos2);
                if (objVuelo.getEstado().toUpperCase().contains(filtro.toUpperCase())) {
                    modTabla.addRow(objVuelo.getRegistro());
                }
            }
        }
    }

    public int buscarLineal(int id) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getId() == id) {
                return pos;
            }
        }
        return -1;
    }

    public String getAreolineaId(int pos) {
        return arreglo[pos].getId() + "";
    }

    public Aerolinea getAerolinea(int id) {
        int pos = buscarLineal(id);
        return arreglo[pos];
    }

    public int getI() {
        return i;
    }
}
