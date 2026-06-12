package Control;

import Modelo.Carrera;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ArregloCarrera {
    private Carrera[] arreglo = new Carrera[20];
    private int i = 0;
    
    public void Agregar(Carrera elemento) {
        try {
            if (getCarrera(elemento.getNombreCarrera()) != null) {
                JOptionPane.showMessageDialog(null, "La Carrera ya existe");
                return;
            }
            arreglo[i] = elemento;
            i++;
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Maximas Carreras alcanzados");
        }
    }
    
    public void Listar(JComboBox control) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        
        for (int pos = 0; pos < i; pos++) {
            modCombo.addElement(arreglo[pos].getNombreCarrera() +" - "+ arreglo[pos].getFacultad());
        }
    }
    
    public void Eliminar(String codEliminar) {
        int posEli = getPosCarrera(codEliminar);
        
        for (int pos = posEli; pos < i-1; pos++) {
            arreglo[pos] = arreglo[pos+1];
        }
        i--;
        arreglo[i] = null;
    }
    
    public Carrera getCarrera(String cod) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getNombreCarrera().equalsIgnoreCase(cod)) return arreglo[pos];
        }
        return null;
    }
    
    private int getPosCarrera(String cod) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getNombreCarrera().equalsIgnoreCase(cod)) return pos;
        }
        return -1;
    }

    public Carrera[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Carrera[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    
}
