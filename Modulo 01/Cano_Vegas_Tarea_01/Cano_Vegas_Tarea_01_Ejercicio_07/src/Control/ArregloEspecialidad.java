package Control;

import Modelo.Especialidad;
import Modelo.Paciente;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArregloEspecialidad {
    private Especialidad[] arreglo;
    private int i = 0;
    
    public void setTam(int n) {
        arreglo = new Especialidad[n];
    }
    
    public void Registrar(Especialidad dato) {
        try {
            if (BuscarLineal(dato.getNombreEspecialidad())== -1) {
                arreglo[i] = dato;
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "La especialidad ya existe");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se alcanzo la maxima capacidad");
        }
    }
    
    public void RegistrarPaciente(Paciente dato,String esp) {
        try {
            int pos = BuscarLineal(esp);
            arreglo[pos].agregarPaciente(dato);
        } catch (Exception e) {
            
        }
    }
    
    public void Listar(JTable control) {
        String[] cabecera = {"Especialidad","Pacientes"};
        
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);
        
        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(arreglo[pos].getRegistro());
        }
    }
    public void ListarTodo(JTable control) {
        String[] cabecera = {"Especialidad","Dni","Nombre","Presion","Temperatura","Saturacion","Promedio","Estado"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);
        
        for (int pos = 0; pos < i; pos++) {
            Paciente[] arregloPacientes = arreglo[pos].getPacientes();
            int j = arreglo[pos].getI();
            for (int pos2 = 0; pos2 < j; pos2++) {
                modTabla.addRow(arregloPacientes[pos2].getRegistro());
            }
        }
    }
    
    public void ListarEspecialidad(String esp, JTable control) {
        String[] cabecera = {"Especialidad","Dni","Nombre","Presion","Temperatura","Saturacion","Promedio","Estado"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        control.setDefaultEditor(Object.class, null);
        
        int posA = BuscarLineal(esp);
        Especialidad objEspecialidad = arreglo[posA];
        Paciente[] arregloPacientes = objEspecialidad.getPacientes();
        int j = objEspecialidad.getI();
        
        for (int pos = 0; pos < j; pos++) {
            modTabla.addRow(arregloPacientes[pos].getRegistro()); 
        }
    }   
    
    
    public int BuscarLineal(String id) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getNombreEspecialidad().equals(id)){
                return pos;
            }
        }
        return -1;
    }
}
