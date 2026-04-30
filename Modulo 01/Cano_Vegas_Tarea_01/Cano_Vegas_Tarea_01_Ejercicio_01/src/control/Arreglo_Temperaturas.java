package control;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Arreglo_Temperaturas {
    private double[] arreglo = new double[10];
    private int i = 0;
    
    public void Agregar(double dato) {
        try {
            arreglo[i] = dato;
            i++;
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Arreglo lleno");
        }
    }
    
    public void Listar(JList control) {
        DefaultListModel modList = new DefaultListModel();
        control.setModel(modList);
        for (int pos = 0; pos < i; pos++) {
            modList.addElement(arreglo[pos]);
        }
    }
}
