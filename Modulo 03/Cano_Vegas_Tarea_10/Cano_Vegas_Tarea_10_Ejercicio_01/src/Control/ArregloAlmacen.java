package Control;

import Modelo.Almacen;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ArregloAlmacen {
    private Almacen[] arreglo = new Almacen[8];
    private int i = 0;
    
    public void Registrar(Almacen elemento) {
        try {
            if (getAlmacenPorNombre(elemento.getNombreAlmacen()) != null) {
                JOptionPane.showMessageDialog(null, "El Almacen ya Existe");
                return;
            }
            arreglo[i] = elemento;
            i++;
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Maxima capacidad de almacenes alcanzado (8)");
        }
    }
    
    public void Listar(JComboBox control) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        
        for (int pos = 0; pos < i; pos++) {
            modCombo.addElement(arreglo[pos].getNombreAlmacen());
        }
    }
    
    public Almacen getAlmacenPorNombre(String nombre) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getNombreAlmacen().equalsIgnoreCase(nombre)) {
                return arreglo[pos];
            }
        }
        return null;
    }
    
    public int getPosAlmacenNombre(String nombreEliminar) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getNombreAlmacen().equalsIgnoreCase(nombreEliminar)) {
                return pos;
            }
        }
        return -1;
    }
    
    public void Eliminar(String nombreEliminar) {
        int posEliminar = getPosAlmacenNombre(nombreEliminar);
        for (int pos = posEliminar; pos < i-1; pos++) {            
            arreglo[pos] = arreglo[pos+1];
        }
        i--;
        arreglo[i] = null;
    }

    public Almacen[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Almacen[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    
}
