package Control;

import Modelo.Gasto;
import Modelo.Proyecto;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaGastos {
    private NodoGasto inicio,fin;

    public ListaGastos() {
        inicio = fin = null;
    }
    
    public void Agregar(Gasto elemento, ListaProyectos objProyectos) {
        double montoGasto = elemento.getMontoGasto();
        int idProyecto = elemento.getIdProyecto();
        Proyecto aux = objProyectos.getNodoPorId(idProyecto).getElemento();
       
        if (montoGasto + aux.getMontoGastadoAcumulado() > aux.getPresupuestoMaximo()){
            JOptionPane.showMessageDialog(null, "Presupuesto insuficiente");
            return;
        }
        aux.setMontoGastadoAcumulado(montoGasto + aux.getMontoGastadoAcumulado());
        
        NodoGasto nuevo = new NodoGasto(elemento);
        if (fin == null) {
            inicio = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }        
    }  
    
    public void Eliminar(int idGastoEliminar, ListaProyectos objProyectos) {
        NodoGasto nodoAeliminar = getNodoPorId(idGastoEliminar);
        int idProyecto = nodoAeliminar.getElemento().getIdProyecto();
        Proyecto aux = objProyectos.getNodoPorId(idProyecto).getElemento();
        
        aux.setMontoGastadoAcumulado(aux.getMontoGastadoAcumulado() - nodoAeliminar.getElemento().getMontoGasto());
        
        if (nodoAeliminar == inicio && nodoAeliminar == fin) {
            inicio = fin = null;
        } 
        else if (nodoAeliminar == inicio) {
            inicio = nodoAeliminar.getSiguiente();
            inicio.setAnterior(null);
        }
        
        else if (nodoAeliminar == fin) {
            fin = nodoAeliminar.getAnterior();
            fin.setSiguiente(null);
        }
        else {
            nodoAeliminar.getAnterior().setSiguiente(nodoAeliminar.getSiguiente());
            nodoAeliminar.getSiguiente().setAnterior(nodoAeliminar.getAnterior());
        }        
        
        nodoAeliminar = null;
    }
          
    public void Listar(JTable control, int idProyecto) {
        String[] cabecera = {"ID Persona","Nombres","Edad","Cod Region"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        
        NodoGasto cur = inicio;
        
        while(cur != null) {   
            if (cur.getElemento().getIdProyecto() == idProyecto) {
                modTabla.addRow(cur.getElemento().getRegistro());                            
            }            
            cur = cur.getSiguiente();
        }
    }    
    
    public NodoGasto getNodoPorId(int idGasto) {
        NodoGasto cur = inicio;
        while(cur != null) {
            if (cur.getElemento().getIdGasto()== idGasto) return cur;
            cur = cur.getSiguiente();
        }
        return null;
    }
}
