package Control;

import Modelo.Equipo;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Equipos {
    private Equipo[] arreglo = new Equipo[7];
    private int i = 0;
    
    public void registrar(Equipo dato) {
        try {
            if (buscarLineal(dato.getIdEquipo()) == -1) {
                arreglo[i] = dato;
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "Código de equipo ya registrado");
            }       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro lleno");
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
    
    public void editar(Equipo dato,int id) {
        int pos = buscarLineal(id);
        arreglo[pos] = dato;
    }
    
    public void listar(JTable control) {
        String[] cabecera = {"Código de Entrenador", "Código de equipo", "Equipo"};
        
        DefaultTableModel modTabla = new DefaultTableModel(cabecera,0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);
        
        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(arreglo[pos].getRegistro());
        }
    }
    
    public int buscarLineal(int id) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getIdEquipo() == id) {
                return pos;
            }
        }
        return -1;
    }
    
    public Equipo getEquipo(int pos) {
        return arreglo[pos];
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
