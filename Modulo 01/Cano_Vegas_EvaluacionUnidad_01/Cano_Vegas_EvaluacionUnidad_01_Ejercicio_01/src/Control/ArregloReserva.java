package Control;

import Modelo.Reserva;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class ArregloReserva {

    private Reserva[] arreglo = new Reserva[150];
    private int i = 0;

    public void Registrar(Reserva dato, int criterio) {
        try {
            if (Condicion(dato.getNumeroMaquina(), dato.getCodigoActividad()) == -1) {
                if (!dato.getTipoMembresia().equalsIgnoreCase("Bronce") || dato.getCodigoActividad() != 3) {
                    dato.setCostoSesion(getPrecio(dato));
                    arreglo[i] = dato;
                    i++;
                    if (criterio == 1) {
                        QuickSort(0, i - 1);
                    } else {
                        BubbleSort();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Necesita membresia mayor a bronce para usar Funcional");
                }
            } else {
                JOptionPane.showMessageDialog(null, "La maquina ya esta en esa actividad");
            }
        } catch (Exception e) {
        }
    }

    public void listar(JTable control) {
        String[] cabecera = {"Numero de Maquina", "Nombre Cliente"};

        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);
        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(arreglo[pos].getRegistro());
        }
    }

    private int getPrecio(Reserva dato) {
        if (dato.getTipoMembresia().equalsIgnoreCase("Bronce")) {
            if (dato.getCodigoActividad() == 1) {
                return 15;
            } else if (dato.getCodigoActividad() == 2) {
                return 20;
            } else {
                return 25;
            }
        } else if (dato.getTipoMembresia().equalsIgnoreCase("Plata")) {
            return 12;
        }
        return 8;
    }

    public JTextArea Detalles(int numMaquina, String nombre) {
        int pos = BuscarReservaLineal(numMaquina, nombre);
        if (pos != -1) {
            JTextArea txtDetalle = new JTextArea(arreglo[pos].getDetalles());
            return txtDetalle;
        }
        return null;
    }

    public int BuscarReservaLineal(int num, String nombre) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getNumeroMaquina() == num && arreglo[pos].getNombreCliente().equalsIgnoreCase(nombre)) {
                return pos;
            }
        }
        return -1;
    }

    public int Condicion(int numMaquina, int codActividad) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getNumeroMaquina() == numMaquina && arreglo[pos].getCodigoActividad() == codActividad) {
                return pos;
            }

        }
        return -1;
    }

    private void QuickSort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);

            QuickSort(low, pi - 1);
            QuickSort(pi + 1, high);
        }
    }

    private int partition(int low, int high) {
        int pivot = arreglo[high].getNumeroMaquina();
        int idx = low - 1;

        for (int j = low; j < high; j++) {
            if (arreglo[j].getNumeroMaquina() < pivot) {
                idx++;
                Reserva temp = arreglo[j];
                arreglo[idx] = arreglo[j];
                arreglo[j] = temp;
            }
        }
        Reserva temp = arreglo[idx + 1];
        arreglo[idx + 1] = arreglo[high];
        arreglo[high] = temp;
        return idx + 1;
    }

    private void BubbleSort() {
        for (int pos = 0; pos < i-1; pos++) {
            for (int pos2 = 0; pos2 < i - pos-1; pos2++) {
                if (arreglo[pos2].getNombreCliente().compareTo(arreglo[pos2+1].getNombreCliente()) > 0) {
                    Reserva temp = arreglo[pos2];
                    arreglo[pos2] = arreglo[pos2+1];
                    arreglo[pos2+1] = temp;
                }
            }
        }
    }
    
    public void llamarQuickSort() {
        QuickSort(0, i-1);
    }
    
    public void llamarBubbleSort() {
        BubbleSort();
    }
}
