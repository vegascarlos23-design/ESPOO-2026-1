package Control;

import Modelo.Expediente;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Expediente {
    private Expediente[] ARREGLO_EXPEDIENTE = new Expediente[4];
    int i = 0;
    
    public void Registrar_Expediente(Expediente dato) {
        try {
            if (Buscar_Lineal(dato.getNumero_expediente()) == -1) {
                ARREGLO_EXPEDIENTE[i] = dato;
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "Este número de expediente ya está registrado.");
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(null, "La lista de expedientes ya está llena.");
        }
    }

    public void Listar_Expediente(JTable control) {
        String[] cabecera = {"Numero de expediente", "Nombre", "Fecha de inicio", "Tipo"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);

        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(ARREGLO_EXPEDIENTE[pos].getRegistro_Expediente());
        }
    }

    public void Buscar_Por_Numero(JTable control, int numero) {
        String[] cabecera = {"Numero de expediente", "Nombre", "Fecha de inicio", "Tipo"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);
        
        for (int pos = 0; pos < i; pos++) {
            if (ARREGLO_EXPEDIENTE[pos].getNumero_expediente() == numero) {
                modTabla.addRow(ARREGLO_EXPEDIENTE[pos].getRegistro_Expediente());
            }
        }
    }
    
    public void Buscar_Por_Nombre(JTable control, String nombre) {
        String[] cabecera = {"Numero de expediente", "Nombre", "Fecha de inicio", "Tipo"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);
        
        for (int pos = 0; pos < i; pos++) {
            if (ARREGLO_EXPEDIENTE[pos].getNombre().equals(nombre)) {
                modTabla.addRow(ARREGLO_EXPEDIENTE[pos].getRegistro_Expediente());
            }
        }
    }
    
    public void Buscar_Por_Tipo(JTable control, String tipo) {
        String[] cabecera = {"Numero de expediente", "Nombre", "Fecha de inicio", "Tipo"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);
        
        for (int pos = 0; pos < i; pos++) {
            if (ARREGLO_EXPEDIENTE[pos].getTipo().equals(tipo)) {
                modTabla.addRow(ARREGLO_EXPEDIENTE[pos].getRegistro_Expediente());
            }
        }
    }
    
    public int Buscar_Lineal(int dato) {
        for (int pos = 0; pos < i; pos++) {
            if (ARREGLO_EXPEDIENTE[pos].getNumero_expediente() == dato) {
                return pos;
            }
        }
        return -1;
    }
    
}
