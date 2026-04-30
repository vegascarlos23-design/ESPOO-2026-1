package Control;

import Modelo.Vuelo;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArregloVuelos {
    private Vuelo[] arreglo = new Vuelo[15];
    private int i = 0;
    
    public void agregar(Vuelo dato) {
        try {
            if (buscarLineal(dato.getNumeroVuelo()) == -1) {
                arreglo[i] = dato;
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "El numero de vuelo ya se encuentra registrado");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se ha alcanzado la maxima capacidad");
        }
    }
    
    public void eliminar(int numVuelo) {
        int posEliminar = buscarLineal(numVuelo);
        for (int pos = posEliminar; pos < i-1; pos++) {
            arreglo[pos] = arreglo[pos+1];
        }
        arreglo[i-1] = null;
        i--;
    }
    
    public void editar(Vuelo dato,int numVuelo) {
        int pos = buscarLineal(numVuelo);
        arreglo[pos] = dato;
    }
    
    public void listar(JTable control) {
        String[] cabecera = {"Id Aerolinea","Numero de Vuelo", "Ciudad Destino", "Estado"};
        
        DefaultTableModel modTabla = new DefaultTableModel(cabecera,0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);
        
        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(arreglo[pos].getRegistro());
        }
    }
    
    public int buscarLineal(int id) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getNumeroVuelo() == id) {
                return pos;
            }
        }
        return -1;
    }
    
    public Vuelo getVuelo(int pos) {
        return arreglo[pos];
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    
}
