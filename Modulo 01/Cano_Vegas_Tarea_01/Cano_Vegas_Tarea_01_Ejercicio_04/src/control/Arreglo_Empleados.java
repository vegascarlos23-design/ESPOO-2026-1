package control;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;

public class Arreglo_Empleados {
    private Empleado[] arreglo = new Empleado[15];
    private int i = 0;
    
    public void Agregar(Empleado dato) {
        try {
            arreglo[i] = dato;
            i++;
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Te fuiste muck");
        }
    }
    
    public void Listar(JTable control) {
        String[] cabecera = {"Dni", "Nombre", "Cargo", "Sueldo", "Fecha de Ingreso"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(arreglo[pos].getRegistro());
        }
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Empleado[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Empleado[] arreglo) {
        this.arreglo = arreglo;
    }
    
    
}
