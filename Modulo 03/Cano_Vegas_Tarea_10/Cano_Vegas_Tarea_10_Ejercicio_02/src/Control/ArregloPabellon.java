package Control;

import Modelo.Pabellon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ArregloPabellon {
    private Pabellon[] arreglo = new Pabellon[12];
    private int i = 0;
    
    public void Agregar(Pabellon elemento) {
        try {
            if (getPabellon(elemento.getCodigoPabellon()) != null) {
                JOptionPane.showMessageDialog(null, "El pabellon ya existe");
                return;
            }
            arreglo[i] = elemento;
            i++;
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Maximos pabellones alcanzados");
        }
    }
    
    public void Listar(JComboBox control) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        
        for (int pos = 0; pos < i; pos++) {
            modCombo.addElement(arreglo[pos].getCodigoPabellon() +" - "+ arreglo[pos].getPiso());
        }
    }
    
    public void Eliminar(String codEliminar) {
        int posEli = getPosPabellon(codEliminar);
        
        for (int pos = posEli; pos < i-1; pos++) {
            arreglo[pos] = arreglo[pos+1];
        }
        i--;
        arreglo[i] = null;
    }
    
    public Pabellon getPabellon(String cod) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getCodigoPabellon().equalsIgnoreCase(cod)) return arreglo[pos];
        }
        return null;
    }
    
    private int getPosPabellon(String cod) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getCodigoPabellon().equalsIgnoreCase(cod)) return pos;
        }
        return -1;
    }

    public Pabellon[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Pabellon[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    
}
