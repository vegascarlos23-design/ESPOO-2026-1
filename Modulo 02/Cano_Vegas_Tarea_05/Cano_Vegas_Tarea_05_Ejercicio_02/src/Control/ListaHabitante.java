package Control;

import Modelo.Habitante;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaHabitante {
    private NodoHabitante inicio,fin;

    public ListaHabitante() {
        inicio = fin = null;
    }
    
    public void Agregar(Habitante elemento) {
        NodoHabitante nuevo = new NodoHabitante(elemento);
        if (fin == null) {
            inicio = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }
    }    
    
    public void Eliminar(int idHabitanteEliminar) {
        NodoHabitante nodoAeliminar = getNodoPorId(idHabitanteEliminar);
        if (nodoAeliminar == inicio && nodoAeliminar == fin) {
            inicio = fin = null;
            return;
        } 
        if (nodoAeliminar == inicio) {
            inicio = nodoAeliminar.getSiguiente();
            inicio.setAnterior(null);
            return;
        }
        
        if (nodoAeliminar == fin) {
            fin = nodoAeliminar.getAnterior();
            fin.setSiguiente(null);
            return;
        }
        
        nodoAeliminar.getAnterior().setSiguiente(nodoAeliminar.getSiguiente());
        nodoAeliminar.getSiguiente().setAnterior(nodoAeliminar.getAnterior());
    }
          
    public void ListarPorRegion(int idRegion, JTable control) {
        String[] cabecera = {"ID Persona","Nombres","Edad","Cod Region"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        
        NodoHabitante cur = inicio;
        if (idRegion == -1) {
            while(cur != null) {               
                modTabla.addRow(cur.getElemento().getRegistro());                            
                cur = cur.getSiguiente();
            }
            return;
        }
        while(cur != null) {
            if (cur.getElemento().getCodRegion() == idRegion){
                modTabla.addRow(cur.getElemento().getRegistro());             
            }
            cur = cur.getSiguiente();
        }
    }    
    
    public NodoHabitante getNodoPorId(int id) {
        NodoHabitante cur = inicio;
        while(cur != null) {
            if (cur.getElemento().getIdPersona() == id) return cur;
            cur = cur.getSiguiente();
        }
        return null;
    }
}
