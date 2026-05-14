package Control;

import Modelo.Equipo;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaEquipos {
    private NodoEquipo inicio,fin;

    public ListaEquipos() {
        inicio = fin = null;
    }
    
    public boolean Agregar(Equipo elemento) {
        if (getNodoPorId(elemento.getIdEquipo()) != null) {
            JOptionPane.showMessageDialog(null, "El equipo ya existe");
            return false;
        }
        
        NodoEquipo nuevo = new NodoEquipo(elemento);
        if (inicio == null) {
            inicio = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        return true;
    }
    
    public void Listar(JTable control) {
        BubbleSort();
        String[] cabecera = {"Id","Nombre del Equipo","Ciudad Origen","Puntos Acumulados"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        
        NodoEquipo cur = inicio;
        while(cur != null) {
            modTabla.addRow(cur.getElemento().getRegistro());
            cur = cur.getSiguiente();
        }      
    }
    
    public void EditarNombreEquipo(int idEquipo, String nuevoNombreEquipo) {
        NodoEquipo nodoAeditar = getNodoPorId(idEquipo);
        nodoAeditar.getElemento().setNombreEquipo(nuevoNombreEquipo);
    }
    
    public void Eliminar(int idEquipoEliminar) {
        NodoEquipo nodoAeliminar = getNodoPorId(idEquipoEliminar);
        if (nodoAeliminar == inicio && nodoAeliminar == fin) {
            inicio = fin = null;
        } else if (nodoAeliminar == inicio) {
            inicio = nodoAeliminar.getSiguiente();
            inicio.setAnterior(null);
        } else if (nodoAeliminar == fin){
            fin = nodoAeliminar.getAnterior();
            fin.setSiguiente(null);
        } else {
            nodoAeliminar.getAnterior().setSiguiente(nodoAeliminar.getSiguiente());
            nodoAeliminar.getSiguiente().setAnterior(nodoAeliminar.getAnterior());
        }
        nodoAeliminar = null;
        
    }
    
    public void BubbleSort() {
        boolean cambio;
        do {            
            cambio = false;
            NodoEquipo cur = inicio;
            while(cur != null && cur.getSiguiente() != null) {
                Equipo a = cur.getElemento();
                Equipo b = cur.getSiguiente().getElemento();
                
                if (a.getPuntosAcumulados() < b.getPuntosAcumulados()) {
                    cur.setElemento(b);
                    cur.getSiguiente().setElemento(a);
                    cambio = true;
                }
                cur = cur.getSiguiente();
            }
        } while (cambio);
    }    
    
    public NodoEquipo getNodoPorId(int idEquipo) {
        NodoEquipo cur = inicio;
        while(cur != null) {
            if (cur.getElemento().getIdEquipo()== idEquipo) return cur;
            cur = cur.getSiguiente();
        }
        return null;
    }
    
    public void CargarCombo(JComboBox control) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        
        NodoEquipo cur = inicio;
        while(cur != null) {
            modCombo.addElement(cur.getElemento().getIdEquipo());
            cur = cur.getSiguiente();
        }
    }
}
