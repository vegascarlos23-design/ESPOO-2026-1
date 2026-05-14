package Control;

import Modelo.Proyecto;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaProyectos {
    private NodoProyecto inicio,fin;

    public ListaProyectos() {
        inicio = fin = null;
    }
    
    public boolean Agregar(Proyecto elemento) {
        if (getNodoPorId(elemento.getIdProyecto()) != null) {
            JOptionPane.showMessageDialog(null, "El proyecto ya existe");
            return false;
        }
        
        NodoProyecto nuevo = new NodoProyecto(elemento);
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
        String[] cabecera = {"Id","Nombre del Proyecto","Presupuesto Maximo","Monto Gastado"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        
        NodoProyecto cur = inicio;
        while(cur != null) {
            modTabla.addRow(cur.getElemento().getRegistro());
            cur = cur.getSiguiente();
        }      
    }
    
    public void editarPresupuesto(int idProyecto, double nuevoPresupuesto) {
        NodoProyecto nodoAeditar = getNodoPorId(idProyecto);
        nodoAeditar.getElemento().setPresupuestoMaximo(nuevoPresupuesto);
    }
    
    public void BubbleSort() {
        boolean cambio;
        do {
            cambio = false;
            
            NodoProyecto cur = inicio;
            while(cur != null && cur.getSiguiente() != null) {
                Proyecto a = cur.getElemento();
                Proyecto b = cur.getSiguiente().getElemento();
                if (a.getMontoGastadoAcumulado()> b.getMontoGastadoAcumulado()) {
                    cur.setElemento(b);
                    cur.getSiguiente().setElemento(a);
                    cambio = true;
                }
                
                cur = cur.getSiguiente();
            }
        } while(cambio);
    }
    
    
    public void ListarPorId(int idProyecto, JTable control) {
        String[] cabecera = {"Id","Nombre del Proyecto","Presupuesto Maximo","Monto Gastado"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        
        modTabla.addRow(getNodoPorId(idProyecto).getElemento().getRegistro());
    }
    
    public NodoProyecto getNodoPorId(int idProyecto) {
        NodoProyecto cur = inicio;
        while(cur != null) {
            if (cur.getElemento().getIdProyecto()== idProyecto) return cur;
            cur = cur.getSiguiente();
        }
        return null;
    }
}
